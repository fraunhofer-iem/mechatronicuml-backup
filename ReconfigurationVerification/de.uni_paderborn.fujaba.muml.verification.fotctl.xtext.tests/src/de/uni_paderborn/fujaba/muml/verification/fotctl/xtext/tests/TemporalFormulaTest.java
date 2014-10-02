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
import de.uni_paderborn.fujaba.muml.verification.tctl.BinaryTemporalFormula;
import de.uni_paderborn.fujaba.muml.verification.tctl.ComparisonOperator;
import de.uni_paderborn.fujaba.muml.verification.tctl.FormulaDefinition;
import de.uni_paderborn.fujaba.muml.verification.tctl.NotFormula;
import de.uni_paderborn.fujaba.muml.verification.tctl.TemporalFormula;
import de.uni_paderborn.fujaba.muml.verification.tctl.TemporalOperator;
import de.uni_paderborn.fujaba.muml.verification.tctl.UnaryFormula;
import de.uni_paderborn.fujaba.muml.verification.tctl.UnaryTemporalFormula;

public class TemporalFormulaTest {

	protected String fileName = "TemporalFormula.fotctl";
	protected FoTCTLSpec fotctlSpec;
	
	@Before
	public void setUp() throws IOException {
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
				assertTrue(formulaDefinition instanceof BinaryTemporalFormula);
				TemporalOperator operator = ((BinaryTemporalFormula) formulaDefinition).getTemporalOperator();
				if(operator == TemporalOperator.AU)
				{
					assertTrue(getNameOfLeftNlp(formulaDefinition).equals("Nlp1"));
					assertTrue(getNameOfRightNlp(formulaDefinition).equals("Nlp2"));
					
					assertTrue(((TemporalFormula) formulaDefinition).getComparisonOperator() == ComparisonOperator.GREATER_OR_EQUAL);
					assertTrue(((TemporalFormula) formulaDefinition).getValue() == 5);
				}
				else if(operator == TemporalOperator.EU)
				{
					assertTrue(getNameOfLeftNlp(formulaDefinition).equals("Nlp2"));
					assertTrue(getNameOfRightNlp(formulaDefinition).equals("Nlp1"));
					
					assertTrue(((TemporalFormula) formulaDefinition).getComparisonOperator() == ComparisonOperator.LESS);
					assertTrue(((TemporalFormula) formulaDefinition).getValue() == 5);
				}
				else
					fail("Unknown operator");

			}
			else if (formulaDefinition instanceof UnaryFormula)
			{
				assertTrue(formulaDefinition instanceof UnaryTemporalFormula);
				TemporalOperator operator = ((UnaryTemporalFormula) formulaDefinition).getTemporalOperator();
				
				if(operator == TemporalOperator.AF)
				{
					assertTrue(getNameOfNlp(formulaDefinition).equals("Nlp1"));
					
					assertTrue(((TemporalFormula) formulaDefinition).getComparisonOperator() == ComparisonOperator.GREATER);
					assertTrue(((TemporalFormula) formulaDefinition).getValue() == 5);
				}
				else if(operator == TemporalOperator.AG)
				{
					assertTrue(getNameOfNlp(formulaDefinition).equals("Nlp2"));
					
					assertTrue(((TemporalFormula) formulaDefinition).getComparisonOperator() == ComparisonOperator.LESS_OR_EQUAL);
					assertTrue(((TemporalFormula) formulaDefinition).getValue() == 5);
				}
				else if(operator == TemporalOperator.EF)
				{
					assertTrue(getNameOfNlp(formulaDefinition).equals("Nlp3"));
					
					assertTrue(((TemporalFormula) formulaDefinition).getComparisonOperator() == ComparisonOperator.EQUAL);
					assertTrue(((TemporalFormula) formulaDefinition).getValue() == 5);
				}
				else if(operator == TemporalOperator.EG)
				{
					assertTrue(getNameOfNlp(formulaDefinition).equals("Nlp4"));
					
					assertTrue(((TemporalFormula) formulaDefinition).getComparisonOperator() == ComparisonOperator.GREATER_OR_EQUAL);
					assertTrue(((TemporalFormula) formulaDefinition).getValue() == 5);
				}
				else
					fail("Unknown operator");
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
	
	private String getNameOfNlp(FormulaDefinition formulaDefinition) {
		
		return ((NodeLabelPredicate) ((UnaryFormula) formulaDefinition).getSubformula()).getDeclaration().getName();
	}
	
}
