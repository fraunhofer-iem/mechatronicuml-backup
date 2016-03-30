package org.muml.psm.transformation.ui.jobs;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

public class CodegenFlatHierarchyJob extends Job {


	private TransformationExecutor executor;
	private IPath targetFilePath;

	private String transformation;

	private IStatus loadStatus;

	public CodegenFlatHierarchyJob(IPath targetFilePath, String transformation) {

		super("MUML-PSM to CodeGen Model Transformation");
		this.transformation = transformation;
		this.targetFilePath = targetFilePath;
		initializeTransformationExecutor();

	}

	public IStatus loadTransformation() {

		loadStatus = BasicDiagnostic.toIStatus(executor.loadTransformation());

		return loadStatus;

	}

	private void initializeTransformationExecutor() {

		executor = new TransformationExecutor(URI.createPlatformPluginURI(
				transformation, true));

		loadStatus = null;

	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {

		ExecutionContextImpl context;
		BasicModelExtent inputExtent;

		ModelExtent outputExtent;
		Diagnostic diagnostic;
		IStatus status;

		try {

			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(),
					100);

			if (loadStatus == null) {

				subMonitor.subTask("Load Model-to-Model Transformation");

				status = loadTransformation();

				if (!status.isOK()) {

					// re-initialize the transformation executor when the
					// compilation fails
					// this ensures a new compilation and allows possible fixes
					// to be considered
					initializeTransformationExecutor();

					return status;
				}

				if (monitor.isCanceled()) {
					return Status.CANCEL_STATUS;
				}
				;

				subMonitor.worked(70);

			}
			;

			subMonitor.setWorkRemaining(30);

			subMonitor.subTask("Execute Model-to-Model Transformation");
			inputExtent = new BasicModelExtent();
			// Obtain a new resource set
			ResourceSet resSet = new ResourceSetImpl();
							// Create a resource
			Resource resource = resSet.getResource(URI.createPlatformResourceURI(targetFilePath.toString(),true),true);
			
			
			inputExtent.add((EObject) resource.getContents().get(0));

			context = new ExecutionContextImpl();

			diagnostic = executor.execute(context,  inputExtent);
			status = BasicDiagnostic.toIStatus(diagnostic);
			
			
			

			if (status.isOK()) {
				
				context = new ExecutionContextImpl();

				diagnostic = executor.execute(context,  inputExtent);
				status = BasicDiagnostic.toIStatus(diagnostic);
				
			

				// Now save the content.
				try {
					resource.save(Collections.EMPTY_MAP);
				} catch (IOException e) {
					return BasicDiagnostic.toIStatus(BasicDiagnostic
							.toDiagnostic(e));
				}
			} else {
				return status;
			}

			return status;

		} finally {
			monitor.done();
		}

	};
}
