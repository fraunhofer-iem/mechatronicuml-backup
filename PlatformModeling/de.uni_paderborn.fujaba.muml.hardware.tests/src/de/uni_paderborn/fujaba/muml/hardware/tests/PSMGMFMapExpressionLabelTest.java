package de.uni_paderborn.fujaba.muml.hardware.tests;
import de.uni_paderborn.fujaba.muml.gmf.tests.GMFMapExpressionLabelTest;
import de.uni_paderborn.fujaba.muml.hardware.HardwarePackage;


/**
 * Test the OCL Invariants in the gmfmap models
 * It is based on the MetamodelOCLTest  {@link de.uni_paderborn.fujaba.muml.tests.MetamodelOCLTest MetamodelOCLTest} of the de.uni_paderborn.fujaba.muml.tests package
 * @author Andreas Dann
 */
public class PSMGMFMapExpressionLabelTest  extends GMFMapExpressionLabelTest{

	
	
	protected void initGMFMapsToTest(){
	gmfmap_projects.add(new String[] { "de.uni_paderborn.fujaba.muml.hardware.resource.diagram","/model/resource.gmfmap" });
		gmfmap_projects.add(new String[] { "de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram","/model/resourceinstance.gmfmap" });
		gmfmap_projects.add(new String[] { "de.uni_paderborn.fujaba.muml.hardware.platform.diagram","/model/platform.gmfmap" });
		gmfmap_projects.add(new String[] { "de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram","/model/platforminstance.gmfmap" });

	}
	
	protected void intEcoreModels(){
		super.intEcoreModels();
		ecore_projects.add(new String[] {"de.uni_paderborn.fujaba.muml.hardware","/model/hardware.ecore"});
		HardwarePackage.eINSTANCE.eClass();
	}
	
	
}
