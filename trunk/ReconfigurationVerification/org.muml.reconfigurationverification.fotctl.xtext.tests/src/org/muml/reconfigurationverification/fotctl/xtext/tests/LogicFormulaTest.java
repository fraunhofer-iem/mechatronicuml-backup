package org.muml.reconfigurationverification.fotctl.xtext.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.Test;
import org.muml.reconfigurationverification.fotctl.FoTCTLFormula;
import org.muml.reconfigurationverification.fotctl.FoTCTLSpec;
import org.muml.reconfigurationverification.fotctl.NodeLabelPredicate;
import org.muml.reconfigurationverification.tctl.BinaryFormula;
import org.muml.reconfigurationverification.tctl.BinaryLogicFormula;
import org.muml.reconfigurationverification.tctl.BinaryLogicOperator;
import org.muml.reconfigurationverification.tctl.FormulaDefinition;
import org.muml.reconfigurationverification.tctl.NotFormula;
import org.muml.reconfigurationverification.tctl.UnaryFormula;

public class LogicFormulaTest {
	
	protected String fileName = "LogicFormula.fotctl";
	protected FoTCTLSpec fotctlSpec;
	
	@Before
	public void setUp() throws IOException
	{
		ResourceSet rs = new ResourceSetImpl();
		
		String modelFolder = "/org.muml.reconfigurationverification.fotctl.xtext.tests/formulae/";
		Resource r = rs.createResource(URI.createPlatformPluginURI(
				modelFolder + fileName, true));

		r.load(Collections.EMPTY_MAP);

		fotctlSpec = (FoTCTLSpec) r.getContents().get(0);
	}

	
	@Test
	public void test() {
		
		assertTrue(fotctlSpec.getFormulas().size() == 6);
		for(FoTCTLFormula formula : fotctlSpec.getFormulas())
		{
			FormulaDefinition formulaDefinition = formula.getFormula();
			
			if(formulaDefinition instanceof BinaryFormula)
			{
				assertTrue(formulaDefinition instanceof BinaryLogicFormula);
				BinaryLogicOperator operator = ((BinaryLogicFormula) formulaDefinition).getOperator();
				if(operator == BinaryLogicOperator.IMPLY)
				{
					assertTrue(getNameOfLeftNlp(formulaDefinition).equals("Nlp1"));
					assertTrue(getNameOfRightNlp(formulaDefinition).equals("Nlp2"));
				}
				else if(operator == BinaryLogicOperator.EQUIV)
				{
					assertTrue(getNameOfLeftNlp(formulaDefinition).equals("Nlp2"));
					assertTrue(getNameOfRightNlp(formulaDefinition).equals("Nlp1"));
				}
				else if(operator == BinaryLogicOperator.AND)
				{
					assertTrue(getNameOfLeftNlp(formulaDefinition).equals("Nlp1"));
					assertTrue(getNameOfRightNlp(formulaDefinition).equals("Nlp3"));
				}
				else if(operator == BinaryLogicOperator.XOR)
				{
					assertTrue(getNameOfLeftNlp(formulaDefinition).equals("Nlp3"));
					assertTrue(getNameOfRightNlp(formulaDefinition).equals("Nlp1"));
				}
				else if(operator == BinaryLogicOperator.OR)
				{
					assertTrue(getNameOfLeftNlp(formulaDefinition).equals("Nlp3"));
					assertTrue(getNameOfRightNlp(formulaDefinition).equals("Nlp2"));
				}
				else
					fail("Unknown operator");

			}
			else if (formulaDefinition instanceof UnaryFormula)
			{
				assertTrue(formulaDefinition instanceof NotFormula);
				FormulaDefinition subformula = ((UnaryFormula) formulaDefinition).getSubformula();
				assertTrue(subformula instanceof NodeLabelPredicate);
				String nameOfNlp = ((NodeLabelPredicate) subformula).getDeclaration().getName();
				assertTrue(nameOfNlp.equals("Nlp2"));
			}
			else
				fail("Formula type");
		}
	}


	private String getNameOfRightNlp(FormulaDefinition formulaDefinition) {
		
		return ((NodeLabelPredicate) ((BinaryFormula) formulaDefinition).getRightSubformula()).getDeclaration().getName();
	}


	private String getNameOfLeftNlp(FormulaDefinition formulaDefinition) {
		
		return ((NodeLabelPredicate) ((BinaryFormula) formulaDefinition).getLeftSubformula()).getDeclaration().getName();
	}

}
