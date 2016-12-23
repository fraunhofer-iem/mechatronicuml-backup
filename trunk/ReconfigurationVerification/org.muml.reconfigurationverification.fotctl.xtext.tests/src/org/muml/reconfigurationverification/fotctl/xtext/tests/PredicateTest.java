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
import org.muml.reconfigurationverification.fotctl.Constant;
import org.muml.reconfigurationverification.fotctl.EdgeLabelPredicate;
import org.muml.reconfigurationverification.fotctl.EdgeLabelPredicateDecl;
import org.muml.reconfigurationverification.fotctl.FoTCTLFormula;
import org.muml.reconfigurationverification.fotctl.FoTCTLSpec;
import org.muml.reconfigurationverification.fotctl.NodeLabelPredicate;
import org.muml.reconfigurationverification.fotctl.NodeLabelPredicateDecl;
import org.muml.reconfigurationverification.tctl.AtomicFormula;
import org.muml.reconfigurationverification.tctl.FormulaDefinition;
import org.muml.reconfigurationverification.tctl.Term;

public class PredicateTest {
	
	protected String fileName = "predicateTest.fotctl";
	protected FoTCTLSpec fotctlSpec;
	
	@Before
	public void setUp() throws IOException
	{
		ResourceSet rs = new ResourceSetImpl();
		
		String modelFolder = "/org.muml.reconfigurationverification.fotctl.xtext.tests/formulae/";
		Resource r = rs.createResource(URI.createPlatformPluginURI(
				modelFolder + fileName, true));

		r.load(Collections.EMPTY_MAP);

		fotctlSpec =  (FoTCTLSpec) r.getContents().get(0);
	}

	
	@Test
	public void test() {
		
		// there are two nlps: Nlp1 and Nlp2
		assertTrue(fotctlSpec.getNodeLabelPredicates().size() == 2);
		for(NodeLabelPredicateDecl nodeLabPredDecl : fotctlSpec.getNodeLabelPredicates())
		{
			String name = nodeLabPredDecl.getName();
			assertTrue(name != null);
			assertTrue(name.equals("Nlp1")||name.equals("Nlp2"));
		}
		
		
		// there are two elps: Elp1 and Elp2
		assertTrue(fotctlSpec.getEdgeLabelPredicates().size() == 2);
		for (EdgeLabelPredicateDecl edgeLabelPredicateDecl : fotctlSpec.getEdgeLabelPredicates())
		{
			String name = edgeLabelPredicateDecl.getName();
			assertTrue(name != null);
			assertTrue(name.equals("Elp1")||name.equals("Elp2"));
		}
		
		// there are two formulas: Nlp1(X) and Elp1(X,Y)
		assertTrue(fotctlSpec.getFormulas().size() == 2);
		for(FoTCTLFormula formula : fotctlSpec.getFormulas())
		{
			FormulaDefinition formulaDef = formula.getFormula();
			// the FormulaDefinition is an AtomicFormula.. 
			assertTrue(formulaDef instanceof AtomicFormula);
			// .. it has a term which is a Constant .. 
			Term term = ((AtomicFormula) formulaDef).getTerm();
			assertTrue(term instanceof Constant);
			// .. named X
			assertTrue(((Constant) term).getName().equals("X"));
			if(formulaDef instanceof NodeLabelPredicate)
			{
				// the declaration is a NodeLabelPredicateDecl named Nlp1
				NodeLabelPredicateDecl declaration = ((NodeLabelPredicate) formulaDef).getDeclaration();
				assertTrue(declaration.getName().equals("Nlp1"));
			}
			else if (formulaDef instanceof EdgeLabelPredicate)
			{
				// the declaration is a EdgeLabelPredicateDecl named Elp1
				EdgeLabelPredicateDecl declaration = ((EdgeLabelPredicate) formulaDef).getDeclaration();
				assertTrue(declaration.getName().equals("Elp1"));
				// there is a second term which is a Constant
				Term secondTerm = ((EdgeLabelPredicate) formulaDef).getSecondTerm();
				assertTrue(secondTerm instanceof Constant);
				assertTrue(((Constant) secondTerm).getName().equals("Y"));
			}
			else
			{
				fail(formulaDef.toString() + " is neither EdgeLabelPredicate nor NodeLabelPredicate.");
			}
		}
	}

}
