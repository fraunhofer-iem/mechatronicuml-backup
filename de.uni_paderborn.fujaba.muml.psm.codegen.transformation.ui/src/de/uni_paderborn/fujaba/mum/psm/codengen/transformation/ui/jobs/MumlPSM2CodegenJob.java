package de.uni_paderborn.fujaba.mum.psm.codengen.transformation.ui.jobs;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

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
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.WriterLog;

import de.uni_paderborn.fujaba.muml.psm.allocation.SystemAllocation;
import de.uni_paderborn.fujaba.muml.psm.codegen.CodGenAllocation;

public class MumlPSM2CodegenJob extends Job {

	private CodGenAllocation codegenModel;
	private SystemAllocation allocation;

	private TransformationExecutor executor;
	private IPath targetFilePath;

	private String transformation;

	private IStatus loadStatus;

	public MumlPSM2CodegenJob(SystemAllocation allocation,
			IPath targetFilePath, String transformation) {

		super("MUML-PSM to CodeGen Model Transformation");
		this.allocation = allocation;
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

			subMonitor.subTask("Execute MUML-PSM to Code-Gen Transformation");
			inputExtent = new BasicModelExtent();
			inputExtent.add((EObject) allocation);
			outputExtent = new BasicModelExtent();

			context = new ExecutionContextImpl();
			context.setLog(new WriterLog(new OutputStreamWriter(System.out)));

			diagnostic = executor.execute(context,  inputExtent,
					outputExtent);
			status = BasicDiagnostic.toIStatus(diagnostic);

			if (status.isOK()) {
				codegenModel = (CodGenAllocation) outputExtent.getContents()
						.get(0);

				Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
				Map<String, Object> m = reg.getExtensionToFactoryMap();
				m.put("codegen", new XMIResourceFactoryImpl());

				// Obtain a new resource set
				ResourceSet resSet = new ResourceSetImpl();
								// Create a resource
				Resource resource = resSet.createResource(URI.createURI(targetFilePath.toString()));
								// Get the first model element and cast it to the right type, in
				// my
				// example everything is hierarchical included in this first
				// node
				resource.getContents().add(codegenModel);

				// Now save the content.
				try {
					Map<String, Object> options = new HashMap<String, Object>();
					options.put(XMLResource.OPTION_ENCODING, "UTF-8");
					resource.save(options);
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
