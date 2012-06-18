package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.commands;

import java.util.Collections;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;

public class CreateInstancesCommand extends AbstractCommand {

	private ComponentInstance componentInstance;

	public CreateInstancesCommand(ComponentInstance componentInstance) {
		this.componentInstance = componentInstance;
	}

	@Override
	public boolean prepare() {
		return true;
	}

	@Override
	public void execute() {
		// Bind componentInstance to input
		ModelExtent input = new BasicModelExtent(
				Collections.singletonList(componentInstance));

		// execute transformation
		TransformationExecutor transformationExecutor = Activator.getInstance()
				.getTransformationExecutor();

		ExecutionContextImpl context = new ExecutionContextImpl();
		
		ExecutionDiagnostic result = transformationExecutor.execute(context,
				input);
		
		if (result.getSeverity() != ExecutionDiagnostic.OK) {
			System.out
					.println("QVT-O ERROR on rule transformation. Message was:");
			System.out.println(result.getMessage());
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub

	}

}
