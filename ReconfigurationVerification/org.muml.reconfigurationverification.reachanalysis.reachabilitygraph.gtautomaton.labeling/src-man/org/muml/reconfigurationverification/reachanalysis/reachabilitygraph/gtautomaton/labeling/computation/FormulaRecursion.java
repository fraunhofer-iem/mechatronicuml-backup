package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.computation;

import org.eclipse.emf.ecore.EObject;
import org.muml.reconfigurationverification.fotctl.FoTCTLFormula;
import org.muml.reconfigurationverification.fotctl.QuantifiedFormula;
import org.muml.reconfigurationverification.fotctl.Quantifier;
import org.muml.reconfigurationverification.tctl.AtomicFormula;
import org.muml.reconfigurationverification.tctl.BinaryFormula;
import org.muml.reconfigurationverification.tctl.BinaryLogicFormula;
import org.muml.reconfigurationverification.tctl.BinaryLogicOperator;
import org.muml.reconfigurationverification.tctl.BinaryTemporalFormula;
import org.muml.reconfigurationverification.tctl.FormulaDefinition;
import org.muml.reconfigurationverification.tctl.NotFormula;
import org.muml.reconfigurationverification.tctl.TemporalOperator;
import org.muml.reconfigurationverification.tctl.UnaryFormula;
import org.muml.reconfigurationverification.tctl.UnaryTemporalFormula;

public class FormulaRecursion {
	public void recurse(FormulaDefinition formulaDef) {

		/*
		 *  Distinguish different possible formulae.
		 */

		// Atomic ones.
		if (formulaDef instanceof AtomicFormula ) {
			preAtomicFormula((AtomicFormula) formulaDef);
			postAtomicFormula((AtomicFormula) formulaDef);
		}
		// Boolean Connectives
		else if(formulaDef instanceof NotFormula)
		{
			preNegation((NotFormula) formulaDef);
			recurse(((NotFormula) formulaDef).getSubformula());
			postNegation((NotFormula) formulaDef);
		}
		else if(formulaDef instanceof BinaryLogicFormula)
		{
			BinaryLogicOperator operator = ((BinaryLogicFormula) formulaDef).getOperator();

			if (operator == BinaryLogicOperator.AND) {
				preConjunction((BinaryLogicFormula) formulaDef);
				recurse(((BinaryLogicFormula) formulaDef).getLeftSubformula());
				midConjunction((BinaryLogicFormula) formulaDef);
				recurse(((BinaryLogicFormula) formulaDef).getRightSubformula());
				postConjunction((BinaryLogicFormula) formulaDef);
			}
			else if (operator == BinaryLogicOperator.OR) {
				preDisjunction((BinaryLogicFormula) formulaDef);
				recurse(((BinaryLogicFormula) formulaDef).getLeftSubformula());
				midDisjunction((BinaryLogicFormula) formulaDef);
				recurse(((BinaryLogicFormula) formulaDef).getRightSubformula());
				postDisjunction((BinaryLogicFormula) formulaDef);
			}
			else if (operator == BinaryLogicOperator.IMPLY) {
				preImplication((BinaryLogicFormula) formulaDef);
				recurse(((BinaryLogicFormula) formulaDef).getLeftSubformula());
				midImplication((BinaryLogicFormula) formulaDef);
				recurse(((BinaryLogicFormula) formulaDef).getRightSubformula());
				postImplication((BinaryLogicFormula) formulaDef);
			}
			else if (operator == BinaryLogicOperator.EQUIV) {
				preEquivalence((BinaryLogicFormula) formulaDef);
				recurse(((BinaryLogicFormula) formulaDef).getLeftSubformula());
				midEquivalence((BinaryLogicFormula) formulaDef);
				recurse(((BinaryLogicFormula) formulaDef).getRightSubformula());
				postEquivalence((BinaryLogicFormula) formulaDef);
			}
			else if (operator == BinaryLogicOperator.XOR) {
				preImplication((BinaryLogicFormula) formulaDef);
				recurse(((BinaryLogicFormula) formulaDef).getLeftSubformula());
				midImplication((BinaryLogicFormula) formulaDef);
				recurse(((BinaryLogicFormula) formulaDef).getRightSubformula());
				postImplication((BinaryLogicFormula) formulaDef);
			}

		}
		// Temporal Ops.
		else if (formulaDef instanceof BinaryTemporalFormula)
		{
			TemporalOperator operator = ((BinaryTemporalFormula) formulaDef).getTemporalOperator();

			if (operator == TemporalOperator.EU) {
				preExistsUntil((BinaryTemporalFormula) formulaDef);
				recurse(((BinaryTemporalFormula) formulaDef).getLeftSubformula());
				midExistsUntil((BinaryTemporalFormula) formulaDef);
				recurse(((BinaryTemporalFormula) formulaDef).getRightSubformula());
				postExistsUntil((BinaryTemporalFormula) formulaDef);
			}
			else if (operator == TemporalOperator.AU) {
				preForAllUntil((BinaryTemporalFormula) formulaDef);
				recurse(((BinaryTemporalFormula) formulaDef).getLeftSubformula());
				midForAllUntil((BinaryTemporalFormula) formulaDef);
				recurse(((BinaryTemporalFormula) formulaDef).getRightSubformula());
				postForAllUntil((BinaryTemporalFormula) formulaDef);
			}
		}
		else if (formulaDef instanceof UnaryTemporalFormula)
		{
			TemporalOperator operator = ((UnaryTemporalFormula) formulaDef).getTemporalOperator();

			if (operator == TemporalOperator.EF) {
				preExistsFinally((UnaryTemporalFormula) formulaDef);
				recurse(((UnaryTemporalFormula) formulaDef).getSubformula());
				postExistsFinally((UnaryTemporalFormula) formulaDef);
			}
			else if (operator == TemporalOperator.AF) {
				preForAllFinally((UnaryTemporalFormula) formulaDef);
				recurse(((UnaryTemporalFormula) formulaDef).getSubformula());
				postForAllFinally((UnaryTemporalFormula) formulaDef);
			}
			else if (operator == TemporalOperator.EG) {
				preExistsGlobally((UnaryTemporalFormula) formulaDef);
				recurse(((UnaryTemporalFormula) formulaDef).getSubformula());
				postExistsGlobally((UnaryTemporalFormula) formulaDef);
			}
			else if (operator == TemporalOperator.AG) {
				preForAllGlobally((UnaryTemporalFormula) formulaDef);
				recurse(((UnaryTemporalFormula) formulaDef).getSubformula());
				postForAllGlobally((UnaryTemporalFormula) formulaDef);
			}
		}
		// Quantified Formula
		else if (formulaDef instanceof QuantifiedFormula)
		{
			Quantifier quantifier = ((QuantifiedFormula) formulaDef).getQuantifier();

			if (quantifier == Quantifier.EXISTS) 
			{
				EObject parent = formulaDef.eContainer();
				
				// true = formulaDef is left subformula of parent; false = parent is not an BinaryFormula OR formulaDef is right subformula of parent
				boolean isLeftFormula = (parent instanceof BinaryFormula) && ((BinaryFormula) parent).getLeftSubformula() == formulaDef;
				
				preExistential((QuantifiedFormula)formulaDef);
				decideFurtherRecursion(parent, isLeftFormula, formulaDef);
				postExistential((QuantifiedFormula)formulaDef);
			}
			else if (quantifier == Quantifier.FORALL) 
			{				
				EObject parent = formulaDef.eContainer();

				// true = formulaDef is left subformula of parent; false = parent is not an BinaryFormula OR formulaDef is right subformula of parent
				boolean isLeftFormula = (parent instanceof BinaryFormula) && ((BinaryFormula) parent).getLeftSubformula() == formulaDef;

				preUniversal((QuantifiedFormula)formulaDef);
				decideFurtherRecursion(parent, isLeftFormula, formulaDef);
				postUniversal((QuantifiedFormula)formulaDef);

			}
		}
	}


	
	protected void decideFurtherRecursion(EObject parent, boolean isLeftFormula, FormulaDefinition formulaDef) {
		boolean exchanged = false;
		if(parent instanceof BinaryFormula)
		{
			if(isLeftFormula && ((BinaryFormula) parent).getLeftSubformula() != formulaDef)
			{
				// left subformula was exchanged due to QuantifierElimination
				// repeat recursion from parent formula on
				exchanged = true;
				recurse(((BinaryFormula) parent).getLeftSubformula());
			}
			else if (((BinaryFormula) parent).getRightSubformula() != formulaDef)
			{
				// right subformula was exchanged due to QuantifierElimination
				// repeat recursion from parent formula on
				exchanged = true;
				recurse(((BinaryFormula) parent).getLeftSubformula());
			}
		}
		else if(parent instanceof UnaryFormula)
		{
			if (((UnaryFormula) parent).getSubformula() != formulaDef)
			{
				// subformula was exchanged due to QuantifierElimination
				// repeat recursion from parent formula on
				exchanged = true;
				recurse(((UnaryFormula) parent).getSubformula());
			}
		}

		else if(parent instanceof FoTCTLFormula)
		{
			if(((FoTCTLFormula) parent).getFormula() != formulaDef)
			{
				// formula was exchanged due to QuantifierElimination
				// repeat recursion from root object on
				exchanged = true;
				recurse(((FoTCTLFormula) parent).getFormula());
			}
		}
		if(!exchanged)
		{
			// nothing exchanged; continue recursion
			recurse(((QuantifiedFormula) formulaDef).getSubformula());
		}
	}


	protected void postUniversal(QuantifiedFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void preUniversal(QuantifiedFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void postExistential(QuantifiedFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void preExistential(QuantifiedFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void postForAllGlobally(UnaryTemporalFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void preForAllGlobally(UnaryTemporalFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void postExistsGlobally(UnaryTemporalFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void preExistsGlobally(UnaryTemporalFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void postForAllFinally(UnaryTemporalFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void preForAllFinally(UnaryTemporalFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void postExistsFinally(UnaryTemporalFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void preExistsFinally(UnaryTemporalFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void postForAllUntil(BinaryTemporalFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void midForAllUntil(BinaryTemporalFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void preForAllUntil(BinaryTemporalFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void postExistsUntil(BinaryTemporalFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void midExistsUntil(BinaryTemporalFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void preExistsUntil(BinaryTemporalFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void postEquivalence(BinaryLogicFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void midEquivalence(BinaryLogicFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void preEquivalence(BinaryLogicFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void postImplication(BinaryLogicFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void midImplication(BinaryLogicFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void preImplication(BinaryLogicFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void postDisjunction(BinaryLogicFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void midDisjunction(BinaryLogicFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void preDisjunction(BinaryLogicFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void postConjunction(BinaryLogicFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void midConjunction(BinaryLogicFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void preConjunction(BinaryLogicFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void postNegation(NotFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void preNegation(NotFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void postAtomicFormula(AtomicFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

	protected void preAtomicFormula(AtomicFormula formulaDef) {
		// TODO Auto-generated method stub
		
	}

//	protected void decideFurtherRecursion(UnaryOperator par, BinaryOperator par1, BinaryOperator par2) {
//		if (par != null) {
//			recurse(par.getSubFormula());
//		}
//		else if (par1 != null) {
//			recurse(par1.getFirstSubFormula());
//		}
//		else if (par2 != null) {
//			recurse(par2.getSecondSubFormula());
//		}
//	}


}
