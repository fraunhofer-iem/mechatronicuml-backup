package org.muml.psm.tests;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.core.tests.MetamodelTest;
import org.muml.core.tests.TestUtilities;
import org.muml.mumlcore.CorePackage;
import org.muml.pim.PimPackage;
import org.muml.pm.hardware.HardwarePackage;
import org.muml.pm.software.SoftwarePackage;;

@RunWith(Parameterized.class)
public class PSMMetamodelTest extends MetamodelTest {

	public PSMMetamodelTest(EPackage ePackage) {
		super(ePackage);
	}

	@Parameters
	public static Collection<Object[]> getData() throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();

		CorePackage.eINSTANCE.eClass();
		PimPackage.eINSTANCE.eClass();
		HardwarePackage.eINSTANCE.eClass();
		SoftwarePackage.eINSTANCE.eClass();
		// Resource coreModel = TestUtilities.loadResource(resourceSet,
		// "org.muml.core/model/core.ecore");

		Resource mumlModel = TestUtilities.loadResource(resourceSet,
				"org.muml.psm/model/psm.ecore");

		EcoreUtil.resolveAll(resourceSet);

		EPackage muml = (EPackage) mumlModel.getContents().get(0);

		return Collections.singleton(new Object[] { muml });
	}

}
