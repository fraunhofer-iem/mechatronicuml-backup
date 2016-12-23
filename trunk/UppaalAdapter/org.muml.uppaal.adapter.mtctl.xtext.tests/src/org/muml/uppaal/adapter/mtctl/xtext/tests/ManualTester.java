package org.muml.uppaal.adapter.mtctl.xtext.tests;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentsEList.FeatureIterator;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.muml.uppaal.adapter.mtctl.xtext.MtctlStandaloneSetup;

import com.google.inject.Injector;

public class ManualTester {

	public static void main(String[] args) {
		try {
			// Setup
			new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
			Injector injector = new MtctlStandaloneSetup().createInjectorAndDoEMFRegistration();
			XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
			resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.mtctl"));

			// Ask user for query
			System.out.println("Enter query: ");
			BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
			String query = cmdReader.readLine();
			InputStream in = new ByteArrayInputStream(query.getBytes());

			// Parse query
			resource.load(in, resourceSet.getLoadOptions());
			//PropertyRepository model = (PropertyRepository) resource.getContents().get(0);
			EObject model = (EObject) resource.getContents().get(0);
			for (Diagnostic d : resource.getErrors())
				System.err.println(d);

			// Save model
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("xmi", new XMIResourceFactoryImpl());
			ResourceSet resSet = new ResourceSetImpl();
			resource = resSet.createResource(URI.createURI("test.xmi"));
			resource.getContents().add(model);
			resource.save(Collections.EMPTY_MAP);
			System.out.println("File saved.");

			// Print model tree
			System.out.println();
			printRecursive(model, "");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void printRecursive(EObject o, String indent) {
		System.out.println(indent + o.toString());
		for (EObject child : o.eContents())
			printRecursive(child, indent + "\t");
	}
}
