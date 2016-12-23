package org.muml.psm.transformation.ui.jobs;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.muml.core.modelinstance.RootNode;
import org.muml.psm.portapimapping.MappingRepository;

public class MumlPIM2MumlPSMJob extends Job {

	private RootNode rootNode;
	private MappingRepository apiMapping;


	private  TransformationExecutor executor;

	private String transformation;

	private  IStatus loadStatus;
	
	

	public MumlPIM2MumlPSMJob(RootNode rootNode, MappingRepository apiMapping, String transformation) {

		super("MUML-PIM to MUML-PSM Transformation");

		this.rootNode = rootNode;
		this.transformation = transformation;
		this.apiMapping = apiMapping;

	initializeTransformationExecutor();

	}

	public  IStatus loadTransformation() {

		loadStatus = BasicDiagnostic.toIStatus(executor.loadTransformation());

		return loadStatus;

	}

	private  void initializeTransformationExecutor() {

		executor = new TransformationExecutor(
				URI.createPlatformPluginURI(
						transformation,
						true));

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

			subMonitor.subTask("Execute MUML-PIM 2 PSM Transformation");
			inputExtent1 = new BasicModelExtent();
			inputExtent1.add((EObject)rootNode);
			

			inputExtent2 = new BasicModelExtent();
			inputExtent2.add((EObject)apiMapping);
			 context = new ExecutionContextImpl();

			diagnostic = executor.execute(context, inputExtent1, inputExtent2);
			try {
				rootNode.eResource().save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			status = BasicDiagnostic.toIStatus(diagnostic);
			
				return status;

		} finally {
			monitor.done();
		}

	};
}
