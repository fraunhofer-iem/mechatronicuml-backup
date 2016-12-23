package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.computation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.muml.reconfigurationverification.fotctl.Constant;
import org.muml.reconfigurationverification.fotctl.ConstantSymbolDecl;
import org.muml.reconfigurationverification.fotctl.EdgeLabelPredicate;
import org.muml.reconfigurationverification.fotctl.FotctlFactory;
import org.muml.reconfigurationverification.fotctl.NodeLabelPredicate;
import org.muml.reconfigurationverification.fotctl.QuantifiedFormula;
import org.muml.reconfigurationverification.fotctl.Quantifier;
import org.muml.reconfigurationverification.fotctl.Variable;
import org.muml.reconfigurationverification.tctl.AtomicFormula;
import org.muml.reconfigurationverification.tctl.BinaryFormula;
import org.muml.reconfigurationverification.tctl.BinaryLogicFormula;
import org.muml.reconfigurationverification.tctl.BinaryLogicOperator;
import org.muml.reconfigurationverification.tctl.BinaryTemporalFormula;
import org.muml.reconfigurationverification.tctl.FormulaDefinition;
import org.muml.reconfigurationverification.tctl.NotFormula;
import org.muml.reconfigurationverification.tctl.TctlFactory;
import org.muml.reconfigurationverification.tctl.Term;
import org.muml.reconfigurationverification.tctl.UnaryTemporalFormula;


public class QuantifierElimination extends FormulaRecursion {

	HashSet<ConstantSymbolDecl> constSyms = null;

	public HashSet<ConstantSymbolDecl> getConstSyms() {
		return constSyms;
	}

	public void setConstSyms(HashSet<ConstantSymbolDecl> constSyms) {
		this.constSyms = constSyms;
	}

	private HashMap<BinaryFormula, BinaryFormula> originalToCopyMapping = new HashMap<BinaryFormula, BinaryFormula>();

	// Flag used in to check whether a variable is contained at all in a sub
	// formula.
	boolean containsVar = false;

	ConstantSymbolDecl currentConstant = null;
	QuantifiedFormula exchangeVar = null;
	FormulaDefinition currentFormula = null;
	FormulaDefinition rootFormula = null;

	public FormulaDefinition eliminateQuantifier(FormulaDefinition subFormula, QuantifiedFormula variableDeclaration, boolean existential) {
		exchangeVar = variableDeclaration;
		// For each of the constant symbols create a copy.
		HashSet<FormulaDefinition> copiedFormulae = new HashSet<FormulaDefinition>();
		for (ConstantSymbolDecl constSym : constSyms) {
			currentConstant = constSym;
			recurse(subFormula);
			copiedFormulae.add(currentFormula);
			if (containsVar == false) break;
		}
		if (containsVar) {
			// Concatenate them by disjunction.
			Iterator<FormulaDefinition> formIter = copiedFormulae.iterator();
			FormulaDefinition left = null;
			if (formIter.hasNext()) {
				left = formIter.next();
			}
			while (formIter.hasNext()) {
				BinaryLogicFormula newFormula = TctlFactory.eINSTANCE.createBinaryLogicFormula();
				if (existential) {
					newFormula.setOperator(BinaryLogicOperator.OR);
				}
				else {
					newFormula.setOperator(BinaryLogicOperator.AND);
				}
				newFormula.setRightSubformula(formIter.next());
				newFormula.setLeftSubformula(left);
				left = newFormula;
			}
			containsVar = false;
			return left;
		}
		return subFormula;
	}

	@Override
	protected void postAtomicFormula(AtomicFormula formula) {
		// Node label predicate?
		if (formula instanceof NodeLabelPredicate) {
			NodeLabelPredicate nodeLabPred = (NodeLabelPredicate) formula;
			NodeLabelPredicate newForm = FotctlFactory.eINSTANCE.createNodeLabelPredicate();
			newForm.setDeclaration(nodeLabPred.getDeclaration());
			Term term = (nodeLabPred.getTerm());
			newForm.setTerm(checkAndExchangeVariable(term, exchangeVar));
			currentFormula = newForm;
		}
		// Must be edge label predicate.
		else {
			EdgeLabelPredicate edgeLabPred = (EdgeLabelPredicate) formula;
			EdgeLabelPredicate newForm = FotctlFactory.eINSTANCE.createEdgeLabelPredicate();
			newForm.setDeclaration(edgeLabPred.getDeclaration());
			Term term1 = ((EdgeLabelPredicate) formula).getTerm();
			newForm.setTerm(checkAndExchangeVariable(term1, exchangeVar));
			Term term2 = ((EdgeLabelPredicate) formula).getSecondTerm();			
			newForm.setSecondTerm(checkAndExchangeVariable(term2, exchangeVar));
			currentFormula = newForm;
		}
	}

	private Term checkAndExchangeVariable(Term term, QuantifiedFormula variableDeclaration) {
		// Check if we got a variable here
		if (term instanceof Variable) {
			//Is it the one we're searching for?
			if (((Variable) term).getDeclaration().getName().equals(variableDeclaration.getName())) {
				// Yes it is so exchange it.
				containsVar = true;
				Constant newConstSym = FotctlFactory.eINSTANCE.createConstant();
				newConstSym.setDeclaration(currentConstant);
				return newConstSym;
			}
			// Not the variable we are searching for so we just copy the term.
			else {
				Variable varOcc = FotctlFactory.eINSTANCE.createVariable();
				varOcc.setDeclaration(((Variable) term).getDeclaration());
				return varOcc;
			}
		}
		// TODO check if this is necessary
		else if (term instanceof Constant){
			Constant newConstSym = FotctlFactory.eINSTANCE.createConstant();
			newConstSym.setDeclaration(((Constant) term).getDeclaration());
			return newConstSym;
		}
		return term;
	}

	@Override
	protected void postNegation(NotFormula formula) {
		NotFormula copy = TctlFactory.eINSTANCE.createNotFormula();
		copy.setSubformula(currentFormula);
		currentFormula = copy;
	}

	@Override
	protected void postUniversal(QuantifiedFormula formulaDef) {
		QuantifiedFormula copy = FotctlFactory.eINSTANCE.createQuantifiedFormula();
		copy.setQuantifier(Quantifier.FORALL);

		for(Iterator<Variable> variableIterator = formulaDef.getVariables().iterator(); variableIterator.hasNext();)
		{
			Variable var = variableIterator.next();
			Variable newVar = FotctlFactory.eINSTANCE.createVariable();
			newVar.setDeclaration(copy);
		}
		copy.setName(formulaDef.getName());
		copy.setSubformula(currentFormula);
		currentFormula = copy;
	}

	@Override
	protected void postExistential(QuantifiedFormula formulaDef) {
		QuantifiedFormula copy = FotctlFactory.eINSTANCE.createQuantifiedFormula();
		copy.setQuantifier(Quantifier.EXISTS);

		for(Iterator<Variable> variableIterator = formulaDef.getVariables().iterator(); variableIterator.hasNext();)
		{
			Variable var = variableIterator.next();
			Variable newVar = FotctlFactory.eINSTANCE.createVariable();
			newVar.setDeclaration(copy);
		}
		copy.setName(formulaDef.getName());
		copy.setSubformula(currentFormula);
		currentFormula = copy;
	}

	@Override
	protected void postForAllGlobally(UnaryTemporalFormula formulaDef) {
		postUnaryTemporalFormula(formulaDef);
	}

	@Override
	protected void postExistsGlobally(UnaryTemporalFormula formulaDef) {
		postUnaryTemporalFormula(formulaDef);
	}

	protected void postUnaryTemporalFormula(UnaryTemporalFormula formulaDef)
	{
		UnaryTemporalFormula copy = TctlFactory.eINSTANCE.createUnaryTemporalFormula();
		copy.setTemporalOperator(((UnaryTemporalFormula) formulaDef).getTemporalOperator());
		copy.setValue(((UnaryTemporalFormula) formulaDef).getValue());
		copy.setSubformula(currentFormula);
		currentFormula = copy;
	}	

	@Override
	protected void postForAllFinally(UnaryTemporalFormula formulaDef) {
		postUnaryTemporalFormula(formulaDef);
	}

	@Override
	protected void postExistsFinally(UnaryTemporalFormula formulaDef) {
		postUnaryTemporalFormula(formulaDef);
	}

	@Override
	protected void midForAllUntil(BinaryTemporalFormula formulaDef) {
		midBinaryTemporalFormula(formulaDef);
	}

	@Override
	protected void midExistsUntil(BinaryTemporalFormula formulaDef) {
		midBinaryTemporalFormula(formulaDef);
	}

	protected void midBinaryTemporalFormula(BinaryTemporalFormula formulaDef)
	{
		BinaryTemporalFormula copy = TctlFactory.eINSTANCE.createBinaryTemporalFormula();
		copy.setTemporalOperator(formulaDef.getTemporalOperator());
		copy.setValue(formulaDef.getValue());
		copy.setComparisonOperator(formulaDef.getComparisonOperator());
		copy.setLeftSubformula(currentFormula);
		currentFormula = copy;
		originalToCopyMapping.put(formulaDef, copy);
	}

	@Override
	protected void postForAllUntil(BinaryTemporalFormula formulaDef) {
		postBinaryTemporalFormula(formulaDef);
	}

	@Override
	protected void postExistsUntil(BinaryTemporalFormula formulaDef) {
		postBinaryTemporalFormula(formulaDef);
	}

	protected void postBinaryTemporalFormula(BinaryTemporalFormula formulaDef)
	{
		BinaryTemporalFormula copy = (BinaryTemporalFormula) originalToCopyMapping.get(formulaDef);
		copy.setRightSubformula(currentFormula);
		currentFormula = copy;
	}

	@Override
	protected void midImplication(BinaryLogicFormula formulaDef) {
		midBinaryLogicFormula(formulaDef);
	}

	@Override
	protected void postImplication(BinaryLogicFormula formulaDef) {
		postBinaryLogicFormula(formulaDef);	
	}

	@Override
	protected void midConjunction(BinaryLogicFormula formulaDef) {
		midBinaryLogicFormula(formulaDef);	
	}

	@Override
	protected void postConjunction(BinaryLogicFormula formulaDef) {
		postBinaryLogicFormula(formulaDef);
	}

	@Override
	protected void midDisjunction(BinaryLogicFormula formulaDef) {
		midBinaryLogicFormula(formulaDef);	
	}

	@Override
	protected void postDisjunction(BinaryLogicFormula formulaDef) {
		postBinaryLogicFormula(formulaDef);
	}

	protected void midBinaryLogicFormula(BinaryLogicFormula formulaDef)
	{
		BinaryLogicFormula copy = TctlFactory.eINSTANCE.createBinaryLogicFormula();
		copy.setLeftSubformula(currentFormula);
		copy.setOperator(formulaDef.getOperator());
		currentFormula = copy;
		originalToCopyMapping.put(formulaDef, copy);	
	}
	
	protected void postBinaryLogicFormula(BinaryLogicFormula formulaDef)
	{
		BinaryLogicFormula copy = (BinaryLogicFormula) originalToCopyMapping.get(formulaDef);
		copy.setRightSubformula(currentFormula);
		currentFormula = copy;
	}



}



