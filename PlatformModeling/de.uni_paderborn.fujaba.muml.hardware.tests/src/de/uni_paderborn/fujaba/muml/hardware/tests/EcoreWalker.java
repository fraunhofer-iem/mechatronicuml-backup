package de.uni_paderborn.fujaba.muml.hardware.tests;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.uni_paderborn.fujaba.muml.tests.TestUtilities;

/**
 * This class walks through an ecore file and sets up the resourceSet
 * it is based on the MUML Test classes of the package {@link de.uni_paderborn.fujaba.muml.tests}
 * @author Andreas Dann
 *
 */

public class EcoreWalker {

	/**
	 * @param args
	 * 
	 * 
	 */
	private ResourceSet resourceSet = null;
	private Resource resource = null;

	public EcoreWalker(String project, String path) {
		this.init();
		
		try {
			resource=TestUtilities.loadResource(resourceSet, project, path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resourceSet);
	}

	private void init() {
		resourceSet = new ResourceSetImpl();

		Map<String, Object> extensionToFactoryMap = resourceSet
				.getResourceFactoryRegistry().getExtensionToFactoryMap();
		extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl());
		extensionToFactoryMap.put("genmodel", new EcoreResourceFactoryImpl());
		extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		// Register Packages
		EcorePackage.eINSTANCE.eClass();
		GenModelPackage.eINSTANCE.eClass();
		
		// Load resource (CAUTION: Order is important; dependant metamodels must
				// be loaded first, else proxies are not resolved correctly...)
				List<String[]> projects = new ArrayList<String[]>();
				projects.add(new String[] { "de.uni_paderborn.fujaba.muml.tests", "/model/Ecore.ecore" });
				projects.add(new String[] { "org.storydriven.core", "/model/core.ecore" });
				projects.add(new String[] { "org.storydriven.core", "/model/core.ecore" });
				projects.add(new String[] { "org.storydriven.storydiagrams",
						"/model/storydiagrams.ecore" });
				projects.add(new String[] { "de.uni_paderborn.fujaba.muml", "/model/muml.ecore" });
				projects.add(new String[] { "de.uni_paderborn.fujaba.muml.actionlanguage",
						"/model/actionlanguage.ecore" });
				projects.add(new String[] {"de.uni_paderborn.fujaba.muml.hardware","/model/hardware.ecore"});

				for (String[] path : projects) {
					try {
						TestUtilities.loadResource(resourceSet, path[0], path[1]);

					} catch (Exception e) {
						try {
							TestUtilities.loadResource(resourceSet, "sdm", "/" + path[0] + path[1]);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}
				}
				EcoreUtil.resolveAll(resourceSet);
	}



	public void walk(EcoreSwitch<Object> visitor) {
		for (Iterator<Object> iter = EcoreUtil.getAllContents(resource, true); iter
				.hasNext();) {
			EObject eObject = (EObject) iter.next();
			visitor.doSwitch(eObject);
		}
	}

}
