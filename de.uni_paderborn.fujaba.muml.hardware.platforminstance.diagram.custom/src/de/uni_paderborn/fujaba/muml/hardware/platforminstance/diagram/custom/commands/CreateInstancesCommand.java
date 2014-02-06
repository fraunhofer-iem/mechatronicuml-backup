package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.commands;

import java.util.Collections;

import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Dictionary;

import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.part.Activator;
/**
 * This command instantiates a {@link ResourceInstance} when its resourcetype is
 * set by executing a qvto transformation.
 * 
 * @author adann
 * 
 */
public class CreateInstancesCommand extends ChangeCommand {

	private HWPlatformInstanceConfiguration hwPlatformInstanceConfiguration;
	private HWPlatform hwPlatform;
	private Dictionary<String, Integer> config;

	public CreateInstancesCommand(HWPlatformInstanceConfiguration instance,HWPlatform platform, Dictionary<String,Integer> config) {
		super(instance);
		this.hwPlatformInstanceConfiguration = instance;
		this.hwPlatform=platform;
		this.config=config;
	}

	@Override
	protected void doExecute() {
		// Bind componentInstance to input
		
		ModelExtent input1 = new BasicModelExtent(
				Collections.singletonList(hwPlatformInstanceConfiguration));
		ModelExtent input2 = new BasicModelExtent(
				Collections.singletonList(hwPlatform));
		// Load QVTO script
		TransformationExecutor transformationExecutor = Activator.getDefault()
				.getTransformationExecutor();

		// Create execution context
		ExecutionContextImpl context = new ExecutionContextImpl();
		/**
		 * TODO Test config parameter
		 */
		
		context.setConfigProperty("initVector", config);
		// Execute transformation
		ExecutionDiagnostic result = transformationExecutor.execute(context,
				input1,input2);

		if (result.getSeverity() != ExecutionDiagnostic.OK) {
			System.out
					.println("QVT-O ERROR on rule transformation. Message was:");
			System.out.println(result.getMessage());
		}
	}

}