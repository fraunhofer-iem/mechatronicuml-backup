package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.edit.commands;

import java.util.Collections;

import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType;

/**
 * This command instantiates a {@link ResourceType}s for a {@link ResourceInstanceRepository} when the 
 * referenced ResourceRepository is set by executing a qvt-o transformation.
 * @author adann
 */
public class CreateRepositoryInstancesCommand extends ChangeCommand {

	private ResourceInstanceRepository resourceInstanceRepo;

	public CreateRepositoryInstancesCommand(ResourceInstanceRepository resourceInstanceRepo) {
		super(resourceInstanceRepo);
		this.resourceInstanceRepo = resourceInstanceRepo;
	}

	@Override
	protected void doExecute() {
		// Bind componentInstance to input
		ModelExtent input = new BasicModelExtent(
				Collections.singletonList(resourceInstanceRepo));

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