package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.computation.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.Test;
import org.muml.reconfigurationverification.fotctl.ConstantSymbolDecl;
import org.muml.reconfigurationverification.fotctl.FoTCTLFormula;
import org.muml.reconfigurationverification.fotctl.FoTCTLSpec;
import org.muml.reconfigurationverification.fotctl.FotctlFactory;
import org.muml.reconfigurationverification.fotctl.QuantifiedFormula;
import org.muml.reconfigurationverification.fotctl.Quantifier;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.computation.QuantifierSearch;
import org.muml.reconfigurationverification.tctl.BinaryFormula;
import org.muml.reconfigurationverification.tctl.BinaryLogicFormula;
import org.muml.reconfigurationverification.tctl.BinaryLogicOperator;
import org.muml.reconfigurationverification.tctl.FormulaDefinition;
import org.muml.reconfigurationverification.tctl.UnaryFormula;

public class QuantifierEliminationTest {
	
	private FoTCTLSpec fotctlSpec;

	@Before
	public void setUp()
	{
		try {
			fotctlSpec = (FoTCTLSpec) load("QuantifiedFormulaTest.fotctl");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private EObject load(String modelName) throws IOException {

		ResourceSet rs = new ResourceSetImpl();
		
		String modelFolder = "/de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling/test/";
		Resource r = rs.createResource(URI.createPlatformPluginURI(
				modelFolder + modelName, true));

		r.load(Collections.EMPTY_MAP);

		return r.getContents().get(0);
	}	

	@Test
	public void test() {
		// create a new QuantifierSearch (creates and calls QuantifierElimination)
		QuantifierSearch qs = new QuantifierSearch();
		
		// create Constant symbols (variables in QuantifiedFormula are replaced with these constants)
		HashSet<ConstantSymbolDecl> constSymbDecls = new HashSet<ConstantSymbolDecl>();
		
		ConstantSymbolDecl const1 = FotctlFactory.eINSTANCE.createConstantSymbolDecl();
		const1.setName("const1");
		constSymbDecls.add(const1);
		
		ConstantSymbolDecl const2 = FotctlFactory.eINSTANCE.createConstantSymbolDecl();
		const2.setName("const2");
		constSymbDecls.add(const2);
		
		qs.setConstSyms(constSymbDecls);
		
		// start recursing formulae (and eliminating quantifiers)
		for(FoTCTLFormula formula : fotctlSpec.getFormulas())
		{
			FormulaDefinition formulaDefOld = formula.getFormula();
			assertTrue(formulaDefOld instanceof QuantifiedFormula);
			FormulaDefinition subformulaDefOld = ((UnaryFormula) formulaDefOld).getSubformula();
			
			Quantifier oldInnerQuantifier = null;
			if(subformulaDefOld != null && subformulaDefOld instanceof BinaryLogicFormula)
			{
				FormulaDefinition innerQuantifiedFormula = ((BinaryLogicFormula) subformulaDefOld).getRightSubformula();
				if(innerQuantifiedFormula instanceof QuantifiedFormula)
					oldInnerQuantifier = ((QuantifiedFormula) innerQuantifiedFormula).getQuantifier();
			}
			
			qs.recurse(formula.getFormula()); // here's the magic
			
			// check result 
			FormulaDefinition formulaDefNew = formula.getFormula();
			assertFalse(formulaDefNew instanceof QuantifiedFormula);
			assertTrue(formulaDefNew instanceof BinaryLogicFormula);
			
			Quantifier oldQuantifier = ((QuantifiedFormula) formulaDefOld).getQuantifier();
			BinaryLogicOperator newOperator = ((BinaryLogicFormula) formulaDefNew).getOperator();
			

			
			// if old quantifier was EXISTS, new binary logic operator is OR
			// otherwise (quantifier is FORALL) the operator is AND
			assertTrue(oldQuantifier == Quantifier.EXISTS ? newOperator == BinaryLogicOperator.OR : newOperator == BinaryLogicOperator.AND);
			
			if(oldInnerQuantifier != null)
			{
				FormulaDefinition firstOperandOfBinaryFormula = ((BinaryFormula) formulaDefNew).getLeftSubformula();
				FormulaDefinition newInnerFormula = ((BinaryFormula) firstOperandOfBinaryFormula).getRightSubformula();
				
				assertTrue(newInnerFormula instanceof BinaryLogicFormula);	
			}
			
		}
	}

}
