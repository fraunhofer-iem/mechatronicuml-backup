package de.uni_paderborn.fujaba.muml.hardware.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LinkConstraints;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.lpg.BasicEnvironment;
import org.eclipse.ocl.util.OCLUtil;
import org.junit.BeforeClass;
import org.junit.Test;

import de.uni_paderborn.fujaba.muml.gmf.tests.GMFMapLinkConstraintTest;
import de.uni_paderborn.fujaba.muml.hardware.HardwarePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.tests.resource.ProblemCollector;

/**
 * 
 * @author Andreas Dann
 */
public class PSMGMFMapLinkConstraintTest extends GMFMapLinkConstraintTest{


	/**
	 * initializes the gmfmap-models which should be test Subclasses should
	 * override this method
	 */
	protected void initGMFMapsToTest() {
		gmfmap_projects.add(new String[] {
				"de.uni_paderborn.fujaba.muml.hardware.resource.diagram",
				"/model/resource.gmfmap" });
		gmfmap_projects
				.add(new String[] {
						"de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram",
						"/model/resourceinstance.gmfmap" });
		gmfmap_projects.add(new String[] {
				"de.uni_paderborn.fujaba.muml.hardware.platform.diagram",
				"/model/platform.gmfmap" });
		gmfmap_projects
				.add(new String[] {
						"de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram",
						"/model/platforminstance.gmfmap" });
		HardwarePackage.eINSTANCE.eClass();
	}

	/**
	 * initializes the ecore-model which are used by the gmfmap-models
	 * Subclasses should override this method
	 */
	protected void intEcoreModels() {
		super.intEcoreModels();
		ecore_projects.add(new String[] { "de.uni_paderborn.fujaba.muml.hardware",
				"/model/hardware.ecore" });
		HardwarePackage.eINSTANCE.eClass();
	}

}
