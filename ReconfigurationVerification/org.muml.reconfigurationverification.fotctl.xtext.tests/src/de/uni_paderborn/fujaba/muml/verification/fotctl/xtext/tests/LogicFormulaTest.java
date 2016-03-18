package de.uni_paderborn.fujaba.muml.verification.fotctl.xtext.tests;

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

import de.uni_paderborn.fujaba.muml.verification.fotctl.FoTCTLFormula;
import de.uni_paderborn.fujaba.muml.verification.fotctl.FoTCTLSpec;
import de.uni_paderborn.fujaba.muml.verification.fotctl.NodeLabelPredicate;
import de.uni_paderborn.fujaba.muml.verification.tctl.BinaryFormula;
import de.uni_paderborn.fujaba.muml.verification.tctl.BinaryLogicFormula;
import de.uni_paderborn.fujaba.muml.verification.tctl.BinaryLogicOperator;
import de.uni_paderborn.fujaba.muml.verification.tctl.FormulaDefinition;
import de.uni_paderborn.fujaba.muml.verification.tctl.NotFormula;
import de.uni_paderborn.fujaba.muml.verification.tctl.UnaryFormula;

public class LogicFormulaTest {
	
	protected String fileName = "LogicFormula.fotctl";
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
