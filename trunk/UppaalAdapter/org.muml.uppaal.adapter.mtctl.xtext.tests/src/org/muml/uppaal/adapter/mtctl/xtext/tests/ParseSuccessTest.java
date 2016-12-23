package org.muml.uppaal.adapter.mtctl.xtext.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Test;
import org.muml.uppaal.adapter.mtctl.PropertyRepository;
import org.muml.uppaal.adapter.mtctl.xtext.MtctlStandaloneSetup;

import com.google.inject.Injector;

public class ParseSuccessTest {
	public Resource parse(String str) throws Exception {
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new MtctlStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,	Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.mtctl"));
		
		InputStream in = new ByteArrayInputStream(str.getBytes());

		resource.load(in, resourceSet.getLoadOptions());
		return resource;
	}
	
	@Test
	public void testDeadlock() throws Exception {
		Resource res = parse("AG not deadlock or deadlock");
		for (Diagnostic diag : res.getErrors())
			System.err.println(diag);
		assertEquals(0, res.getErrors().size());
		
		//Get generated model like this:
		EObject prop = (EObject) res.getContents().get(0);
		assertTrue(prop instanceof PropertyRepository);
	}
}
