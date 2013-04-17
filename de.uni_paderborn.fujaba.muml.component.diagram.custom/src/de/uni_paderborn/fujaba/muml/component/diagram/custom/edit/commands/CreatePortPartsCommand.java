package de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.commands;

import java.util.Collections;

import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.component.diagram.custom.part.Activator;

public class CreatePortPartsCommand extends ChangeCommand {

	private ComponentPart componentPart;

	public CreatePortPartsCommand(ComponentPart componentPart) {
		super(componentPart);
		this.componentPart = componentPart;
	}

	@Override
	protected void doExecute() {
		// Bind componentInstance to input
		ModelExtent input = new BasicModelExtent(
				Collections.singletonList(componentPart));

		// Load QVTO script
		TransformationExecutor transformationExecutor = Activator.getInstance()
				.getTransformationExecutor(false);

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