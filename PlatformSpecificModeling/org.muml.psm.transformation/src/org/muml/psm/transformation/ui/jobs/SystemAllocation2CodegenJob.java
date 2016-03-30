package org.muml.psm.transformation.ui.jobs;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
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
import org.muml.core.common.DiagramEditorUtil;
import org.muml.psm.allocation.SystemAllocation;
import org.muml.psm.portapimapping.MappingRepository;

public class SystemAllocation2CodegenJob extends Job {

	private SystemAllocation allocation;
	private MappingRepository mapping;

	private TransformationExecutor executor;
	private URI directoryPath;

	private String transformation;

	private IStatus loadStatus;

	public SystemAllocation2CodegenJob(SystemAllocation allocation, MappingRepository mapping, URI directoryPath,
			String transformation) {
		super("PIM 2 Codegen Transformation");
		this.allocation = allocation;
		this.mapping = mapping;
		this.transformation = transformation;
		this.directoryPath = directoryPath;
		initializeTransformationExecutor();
	}

	public IStatus loadTransformation() {

		loadStatus = BasicDiagnostic.toIStatus(executor.loadTransformation());

		return loadStatus;

	}

	private void initializeTransformationExecutor() {

		executor = new TransformationExecutor(URI.createPlatformPluginURI(transformation, true));

		loadStatus = null;

	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {

		ExecutionContextImpl context;
		BasicModelExtent inputExtent1;
		BasicModelExtent inputExtent2;

		ModelExtent outputExtent;
		Diagnostic diagnostic;
		IStatus status;

		try {

			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);

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

			subMonitor.subTask("Execute MUML-PIM 2 Codegen Transformation");
			inputExtent1 = new BasicModelExtent();
			inputExtent1.add((EObject) allocation);

			inputExtent2 = new BasicModelExtent();
			inputExtent2.add((EObject) mapping);
			context = new ExecutionContextImpl();
			outputExtent = new BasicModelExtent();
			diagnostic = executor.execute(context, inputExtent1, inputExtent2, outputExtent);
			// put in own file
			String fileExtension = "codegen"; // convention by ingo budde ;P
			String hint = "Code";

			IPath dirPath = new Path(directoryPath.toPlatformString(true));

			// Get a unique filename for the new file
			String fileName = DiagramEditorUtil.getUniqueFileName(dirPath, hint, fileExtension);

			// Create the new file
			ResourceSet resourceSet = new ResourceSetImpl();
			URI uri = URI.createPlatformResourceURI(dirPath.append(fileName).toString(), true);
			Resource resource = resourceSet.createResource(uri);
			resource.getContents().addAll(outputExtent.getContents());
			try {
				resource.save(Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
			}
			status = BasicDiagnostic.toIStatus(diagnostic);

			return status;

		} finally {
			monitor.done();
		}

	};

}
