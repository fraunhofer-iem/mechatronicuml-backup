package de.uni_paderborn.fujaba.muml.allocation.ilp.tests;

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
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.tests.MetamodelTest;
import de.uni_paderborn.fujaba.tests.TestUtilities;

@RunWith(Parameterized.class)
public class ILPMetamodelTest extends MetamodelTest {

	public ILPMetamodelTest(EPackage ePackage) {
		super(ePackage);
	}
	
	@Parameters
	public static Collection<Object[]> getData() throws IOException {
		CorePackage.eINSTANCE.eClass();
		ResourceSet resSet = new ResourceSetImpl();	
		Resource ilpModel = TestUtilities.loadResource(resSet,
				"de.uni_paderborn.fujaba.muml.allocation.ilp/model/ilp.ecore");
		EcoreUtil.resolveAll(resSet);
		EPackage ilp = (EPackage) ilpModel.getContents().get(0);		
		return Collections.singleton(new Object[] {ilp});
	}

}
