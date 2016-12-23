package org.muml.core.common.edit.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

public class ExecuteQvtoTransformationCommand extends ChangeCommand {

	private List<ModelExtent> modelExtents;
	private TransformationExecutor transformationExecutor;
	private BasicDiagnostic diagnostic;
	private ExecutionContext executionContext;
	
	
	public ExecuteQvtoTransformationCommand(TransformationExecutor transformationExecutor, List<ModelExtent> modelExtents) {
		this(transformationExecutor, modelExtents, new ExecutionContextImpl());
	}
	
	

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ExecuteQvtoTransformationCommand(TransformationExecutor transformationExecutor, List<ModelExtent> modelExtents, ExecutionContext executionContext){
		super((Collection) getAllNotifiers(modelExtents));
		this.transformationExecutor = transformationExecutor;
		this.modelExtents = modelExtents;
		this.executionContext = executionContext;

		diagnostic = new BasicDiagnostic
	          (EObjectValidator.DIAGNOSTIC_SOURCE,
	           0,
	           "Diagnosis of several elements",
	           getAllNotifiers(modelExtents).toArray()
	          );
	}
	
	public BasicDiagnostic getDiagnostic() {
		return diagnostic;
	}

	private static Collection<EObject> getAllNotifiers(
			List<ModelExtent> modelExtents) {
		Collection<EObject> notifiers = new ArrayList<EObject>();
		for (ModelExtent modelExtent : modelExtents) {
			notifiers.addAll(modelExtent.getContents());
		}
		return notifiers;
	}

	@Override
	protected void doExecute() {

		

		// Execute transformation
		ExecutionDiagnostic result = null;
		try {
			result = transformationExecutor.execute(executionContext,  modelExtents.toArray(new ModelExtent[] {} ));
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (result != null && result.getSeverity() != ExecutionDiagnostic.OK) {
			System.out
					.println("QVT-O ERROR on rule transformation. Message was:");
			System.out.println(result.getMessage());
		}
	}
	
	public boolean hasChanged() {
		return !getChangeDescription().getObjectChanges().isEmpty();
	}

}