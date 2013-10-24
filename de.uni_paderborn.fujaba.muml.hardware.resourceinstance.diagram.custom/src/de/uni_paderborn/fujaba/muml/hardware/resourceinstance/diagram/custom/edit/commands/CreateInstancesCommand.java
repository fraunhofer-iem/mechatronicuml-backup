package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.edit.commands;

import java.util.Collections;

import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.part.Activator;


/**
 * This command instantiates a {@link ResourceInstance} when its resourcetype is set by executing a qvto  transformation.
 * 
 * @author adann
 *
 */
public class CreateInstancesCommand extends ChangeCommand {

	private ResourceInstance resourceInstance;

	public CreateInstancesCommand(ResourceInstance resourceInstance) {
		super(resourceInstance);
		this.resourceInstance = resourceInstance;
	}

	@Override
	protected void doExecute() {
		// Bind componentInstance to input
		ModelExtent input = new BasicModelExtent(
				Collections.singletonList(resourceInstance));

		// Load QVTO script
		TransformationExecutor transformationExecutor = Activator.getDefault()
				.getTransformationExecutor();

		// Create execution context
		ExecutionContextImpl context = new ExecutionContextImpl();
		
		// Execute transformation
		ExecutionDiagnostic result = transformationExecutor.execute(context,
				input);
		
		if (result.getSeverity() != ExecutionDiagnostic.OK) {
			System.out
					.println("QVT-O ERROR on rule transformation. Message was:");
			System.out.println(result.getMessage());
		}
	}

}