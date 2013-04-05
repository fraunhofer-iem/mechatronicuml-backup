package de.fujaba.properties.reconcile;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.fujaba.properties.PropertyGenerator;

public class ReconcileCommand extends ChangeCommand {

	private PropertyGenerator generator;

	public ReconcileCommand(PropertyGenerator generator) {
		super(generator.eResource());
		setLabel("Reconcile Model");
		this.generator = generator;
	}

	public boolean hasChanged() {
		ChangeDescription description = getChangeDescription();
		if (description != null) {
			return !description.getObjectChanges().isEmpty();
		}
		return false;
	}

	@Override
	protected void doExecute() {
		// pre reconcile
		if (generator.getPrereconcileQvtoTransformation() != null) {
			URI uri = URI.createPlatformResourceURI(
					generator.getPrereconcileQvtoTransformation(), true);
			transform(PropertiesReconcilePlugin.getDefault()
					.createTransformationExecutor(uri));
		}

		// reconcile
		transform(PropertiesReconcilePlugin.getDefault()
				.getDefaultTransformationExecutor(false));

		// post reconcile
		if (generator.getPostreconcileQvtoTransformation() != null) {
			URI uri = URI.createPlatformResourceURI(
					generator.getPostreconcileQvtoTransformation(), true);
			transform(PropertiesReconcilePlugin.getDefault()
					.createTransformationExecutor(uri));
		}
	}

	private void transform(TransformationExecutor transformationExecutor) {
		if (transformationExecutor == null) {
			return;
		}

		// Bind componentInstance to input
		ModelExtent input = new BasicModelExtent(
				Collections.singletonList(generator));

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
