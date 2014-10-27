package de.uni_paderborn.fujaba.gmf.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.lpg.BasicEnvironment;
import org.eclipse.ocl.util.OCLUtil;
import org.junit.BeforeClass;

import de.uni_paderborn.fujaba.tests.resource.ProblemCollector;

public abstract class GMFMapTest {

	/**
	 * @param args
	 */

	protected static OCL OCL_ENV = OCL
			.newInstance(EcoreEnvironmentFactory.INSTANCE);
	protected ProblemCollector oclErrors = new ProblemCollector();

	protected List<String[]> gmfmap_projects = new ArrayList<String[]>();
	protected List<String[]> ecore_projects = new ArrayList<String[]>();
	protected HashMap<EObject, Boolean> visitedMapping;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Initialize OCL environment
		BasicEnvironment benv = OCLUtil.getAdapter(OCL_ENV.getEnvironment(),
				BasicEnvironment.class);

		// initialize OCL in ecore
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE
				.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
						new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				new OCLValidationDelegateFactory.Global());
	}
	

	/**
	 * initializes the gmfmap-models which should be test Subclasses should
	 * override this method
	 */
	protected void initGMFMapsToTest() {
		gmfmap_projects.add(new String[] {
				"de.uni_paderborn.fujaba.muml.component.diagram",
				"/model/component.gmfmap" });
		gmfmap_projects
				.add(new String[] {
						"de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram",
						"/model/componentinstanceconfiguration.gmfmap" });
		gmfmap_projects.add(new String[] {
				"de.uni_paderborn.fujaba.muml.realtimestatechart.diagram",
				"/model/realtimestatechart.gmfmap" });

	}
	
	/**
	 * initializes the ecore-model which are used by the gmfmap-models
	 * Subclasses should override this method
	 */
	protected void intEcoreModels() {
		ecore_projects.add(new String[] { "de.uni_paderborn.fujaba.muml.tests",
				"/model/Ecore.ecore" });
		ecore_projects.add(new String[] { "org.storydriven.core",
				"/model/core.ecore" });
		ecore_projects.add(new String[] { "org.storydriven.storydiagrams",
				"/model/storydiagrams.ecore" });
		ecore_projects.add(new String[] { "de.uni_paderborn.fujaba.muml",
				"/model/muml.ecore" });
		ecore_projects.add(new String[] {
				"de.uni_paderborn.fujaba.muml.actionlanguage",
				"/model/actionlanguage.ecore" });
	}


}
