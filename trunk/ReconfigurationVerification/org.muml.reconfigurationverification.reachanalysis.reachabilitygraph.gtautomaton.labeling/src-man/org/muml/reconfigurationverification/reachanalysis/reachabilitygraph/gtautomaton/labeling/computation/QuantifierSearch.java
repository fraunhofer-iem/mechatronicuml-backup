/**
 * 
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.computation;

import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.muml.reconfigurationverification.fotctl.ConstantSymbolDecl;
import org.muml.reconfigurationverification.fotctl.QuantifiedFormula;
import org.muml.reconfigurationverification.tctl.BinaryFormula;
import org.muml.reconfigurationverification.tctl.FormulaDefinition;
import org.muml.reconfigurationverification.tctl.TCTLFormula;
import org.muml.reconfigurationverification.tctl.UnaryFormula;

/**
 * @author cajudosu
 *
 */
public class QuantifierSearch extends FormulaRecursion {
	
	HashSet<ConstantSymbolDecl> constSyms = null;
	
	public HashSet<ConstantSymbolDecl> getConstSyms() {
		return constSyms;
	}

	public void setConstSyms(HashSet<ConstantSymbolDecl> constSyms) {
		this.constSyms = constSyms;
	}
	
	@Deprecated
	public FormulaDefinition eliminate(FormulaDefinition formula) {
		// eliminateRecursive will destroy the reference to the formula if the
		// root formula is a quantifier so we avoid this by wrapping with a
		// negation.

		recurse(formula);
		return formula;
	}

	@Override
	protected void preUniversal(QuantifiedFormula formula) {
		
		// Get the sub formula in which variables have to be exchanged
		FormulaDefinition subFormula = (formula.getSubformula());
		
		// Create a new elimination object which will perform the elimination.
		QuantifierElimination elim = new QuantifierElimination();
		elim.setConstSyms(constSyms);
		FormulaDefinition exchangeFormula = elim.eliminateQuantifier(subFormula, formula, false);
		
		exchangeFormula(formula, exchangeFormula);		
	}

	@Override
	protected void preExistential(QuantifiedFormula formula) {

		// Get the sub formula and the variable which has to be exchanged in it.
		FormulaDefinition subFormula = (formula.getSubformula());
		// Create a new elimination object which will perform the elimination.
		QuantifierElimination elim = new QuantifierElimination();
		elim.setConstSyms(constSyms);
		FormulaDefinition exchangeFormula = elim.eliminateQuantifier(subFormula, formula, true);
		
		exchangeFormula(formula, exchangeFormula);		
	}
	
	/**
	 * replaces formula with exchangeFormula in the corresponding container
	 * @param formula
	 * @param exchangeFormula
	 */
	private void exchangeFormula(FormulaDefinition formula, FormulaDefinition exchangeFormula) {
		
		
		EObject formulaContainer = formula.eContainer();
		
		if (formulaContainer instanceof TCTLFormula)
		{
			// the formulaContainer is a TCTLFormula, 
			// i.e., the root object of the whole formula
			((TCTLFormula) formulaContainer).setFormula(exchangeFormula);
		}
		else if (formulaContainer instanceof FormulaDefinition)
		{
			// the formulaContainer is a FormulaDefinition, 
			// i.e., formula is a sub-formula of another formula
			if(formulaContainer instanceof UnaryFormula)
			{
				// the container is a UnaryFormula with only one sub-formula
				((UnaryFormula) formulaContainer).setSubformula(exchangeFormula);
			}
			else if(formulaContainer instanceof BinaryFormula)
			{
				// the container is a BinaryFormula with two sub-formula
				if(((BinaryFormula) formulaContainer).getLeftSubformula().equals(formula))
				{
					// formula is the left sub-formula of the containing formula 
					((BinaryFormula) formulaContainer).setLeftSubformula(exchangeFormula);
				}
				else if (((BinaryFormula) formulaContainer).getRightSubformula().equals(formula))
				{
					// formula is the right sub-formula of the containing formula 
					((BinaryFormula) formulaContainer).setRightSubformula(exchangeFormula);
				}
			}
		}
	}
	

	 			
}
