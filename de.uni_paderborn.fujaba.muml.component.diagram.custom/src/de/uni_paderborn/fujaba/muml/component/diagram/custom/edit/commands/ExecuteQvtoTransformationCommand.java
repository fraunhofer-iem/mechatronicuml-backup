package de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.commands;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.uni_paderborn.fujaba.muml.component.diagram.custom.part.Activator;

public class ExecuteQvtoTransformationCommand extends ChangeCommand {

	private List<ModelExtent> modelExtents;
	private String transformationPath;

	public ExecuteQvtoTransformationCommand(String transformationPath, List<ModelExtent> modelExtents) {
		super(getAllNotifiers(modelExtents));
		this.transformationPath = transformationPath;
		this.modelExtents = modelExtents;
	}

	private static Collection<Notifier> getAllNotifiers(
			List<ModelExtent> modelExtents) {
		Collection<Notifier> notifiers = new ArrayList<Notifier>();
		for (ModelExtent modelExtent : modelExtents) {
			notifiers.addAll(modelExtent.getContents());
		}
		return notifiers;
	}

	@Override
	protected void doExecute() {

		// Load QVTO script
		TransformationExecutor transformationExecutor = Activator.getInstance()
				.getTransformationExecutor(transformationPath, false);

		// Create execution context
		ExecutionContextImpl context = new ExecutionContextImpl();

		// Execute transformation
		ExecutionDiagnostic result = null;
		try {
			Method m = TransformationExecutor.class.getDeclaredMethod("execute", ExecutionContext.class, ModelExtent[].class);
			result = (ExecutionDiagnostic) m.invoke(transformationExecutor, new Object[] { context, modelExtents.toArray(new ModelExtent[] {} ) });
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (result != null && result.getSeverity() != ExecutionDiagnostic.OK) {
			System.out
					.println("QVT-O ERROR on rule transformation. Message was:");
			System.out.println(result.getMessage());
		}
	}

}