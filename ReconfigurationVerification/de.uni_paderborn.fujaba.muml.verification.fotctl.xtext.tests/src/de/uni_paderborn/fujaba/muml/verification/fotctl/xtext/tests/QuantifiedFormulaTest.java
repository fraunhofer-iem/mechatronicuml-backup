package de.uni_paderborn.fujaba.muml.verification.fotctl.xtext.tests;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.Test;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.verification.fotctl.FoTCTLFormula;
import de.uni_paderborn.fujaba.muml.verification.fotctl.FoTCTLSpec;
import de.uni_paderborn.fujaba.muml.verification.fotctl.NodeLabelPredicate;
import de.uni_paderborn.fujaba.muml.verification.fotctl.QuantifiedFormula;
import de.uni_paderborn.fujaba.muml.verification.fotctl.Quantifier;
import de.uni_paderborn.fujaba.muml.verification.fotctl.Variable;
import de.uni_paderborn.fujaba.muml.verification.tctl.BinaryFormula;
import de.uni_paderborn.fujaba.muml.verification.tctl.BinaryLogicFormula;
import de.uni_paderborn.fujaba.muml.verification.tctl.FormulaDefinition;
import de.uni_paderborn.fujaba.muml.verification.tctl.Term;
import de.uni_paderborn.fujaba.muml.verification.tctl.UnaryFormula;

public class QuantifiedFormulaTest {

	protected String fileName = "QuantifiedFormula.fotctl";
	protected FoTCTLSpec fotctlSpec;
	
	@Before
	public void setUp() throws IOException
	{
		ResourceSet rs = new ResourceSetImpl();
		
		String modelFolder = "/de.uni_paderborn.fujaba.muml.verification.fotctl.xtext.tests/formulae/";
		Resource r = rs.createResource(URI.createPlatformPluginURI(
				modelFolder + fileName, true));

		r.load(Collections.EMPTY_MAP);

		fotctlSpec = (FoTCTLSpec) r.getContents().get(0);
	}


	@Test
	public void test() {
		assertTrue(fotctlSpec.getFormulas().size() == 2);
		for(FoTCTLFormula formula : fotctlSpec.getFormulas())
		{
			FormulaDefinition formulaDefinition = formula.getFormula();
			assertTrue(formulaDefinition instanceof QuantifiedFormula);
			assertTrue(((QuantifiedFormula) formulaDefinition).getName().equals("x"));
			
			FormulaDefinition subformula = ((UnaryFormula) formulaDefinition).getSubformula();
			assertTrue(subformula instanceof BinaryLogicFormula);

			Term term1 = ((NodeLabelPredicate) ((BinaryFormula) subformula).getRightSubformula()).getTerm();
			assertTrue(term1 instanceof Variable);
			assertTrue(((Variable) term1).getDeclaration() == formulaDefinition);
			assertTrue(((Variable) term1).getName().equals("x"));
			
			Term term2 = ((NodeLabelPredicate) ((BinaryFormula) subformula).getLeftSubformula()).getTerm();
			assertTrue(term2 instanceof Variable);
			assertTrue(((Variable) term2).getDeclaration() == formulaDefinition);
			assertTrue(((Variable) term2).getName().equals("x"));
			
			assertTrue(term1 != term2);

			Quantifier quantifier = ((QuantifiedFormula) formulaDefinition).getQuantifier();
			if(quantifier == Quantifier.FORALL)
			{			
				assertTrue(getNameOfLeftNlp(subformula).equals("Nlp1"));
				assertTrue(getNameOfRightNlp(subformula).equals("Nlp2"));
			}
			else if(quantifier == Quantifier.EXISTS)
			{
				
				assertTrue(getNameOfLeftNlp(subformula).equals("Nlp2"));
				assertTrue(getNameOfRightNlp(subformula).equals("Nlp1"));
			}
			else
				fail("Quantifier not set.");
		}
	
	}

	
	private String getNameOfRightNlp(FormulaDefinition formulaDefinition) {
		
		return ((NodeLabelPredicate) ((BinaryFormula) formulaDefinition).getRightSubformula()).getDeclaration().getName();
	}


	private String getNameOfLeftNlp(FormulaDefinition formulaDefinition) {
		
		return ((NodeLabelPredicate) ((BinaryFormula) formulaDefinition).getLeftSubformula()).getDeclaration().getName();
	}

}
