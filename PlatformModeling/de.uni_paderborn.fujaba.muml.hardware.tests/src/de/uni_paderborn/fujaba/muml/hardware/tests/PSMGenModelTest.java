package de.uni_paderborn.fujaba.muml.hardware.tests;

import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.BeforeClass;

import de.uni_paderborn.fujaba.muml.tests.GenmodelTest;
import de.uni_paderborn.fujaba.tests.TestUtilities;

public class PSMGenModelTest extends GenmodelTest{

	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Initialize new ResourceSet
				ResourceSet resourceSet = new ResourceSetImpl();

				Map<String, Object> extensionToFactoryMap = resourceSet
						.getResourceFactoryRegistry().getExtensionToFactoryMap();
				extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl());
				extensionToFactoryMap.put("genmodel", new EcoreResourceFactoryImpl());
				extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());


				// Register Packages
				EcorePackage.eINSTANCE.eClass();
				GenModelPackage.eINSTANCE.eClass();

				// Load resource
				GenmodelTest.genmodel = TestUtilities.loadResource(resourceSet, "de.uni_paderborn.fujaba.muml.hardware", "/model/hardware.genmodel");
				
				setLabelProvider(GenmodelTest.qualifiedLabelProvider);
	}
	

}
