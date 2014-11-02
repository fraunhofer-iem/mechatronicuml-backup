package de.uni_paderborn.fujaba.muml.allocationalgorithm.ui.jobs;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.ModelinstanceFactory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.psm.allocation.SystemAllocation;

public class AllocationAlgorithmJob extends Job {

	private SpecificationCS allocationSpecification;
	private ComponentInstanceConfiguration cic;
	private HWPlatformInstanceConfiguration hwpic;

	private TransformationExecutor executor;

	private String transformation;

	private IStatus loadStatus;

	public AllocationAlgorithmJob(SpecificationCS allocationSpecification,
			ComponentInstanceConfiguration cic,
			HWPlatformInstanceConfiguration hwpic, String transformation) {

		super("Allocation Algorithm Transformation");
		this.allocationSpecification = allocationSpecification;
		this.cic = cic;
		this.hwpic = hwpic;
		this.transformation = transformation;
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

			subMonitor.subTask("Execute Allocation Transformation");
			inputExtent = new BasicModelExtent();
			inputExtent.add((EObject) allocationSpecification);
			inputExtent.add((EObject) cic);
			inputExtent.add((EObject) hwpic);

			outputExtent = new BasicModelExtent();

			context = new ExecutionContextImpl();

			diagnostic = executor.execute(context, inputExtent, outputExtent);
			status = BasicDiagnostic.toIStatus(diagnostic);

			if (status.isOK()) {
				SystemAllocation systemAllocation = (SystemAllocation) outputExtent
						.getContents().get(0);
				Resource fujabaResource = cic.eResource();
				RootNode rootNode = (RootNode) fujabaResource.getContents()
						.get(0);
				ModelElementCategory category = ModelinstanceFactory.eINSTANCE
						.createModelElementCategory();
				category.setName("allocation");
				category.setKey("de.uni_paderborn.fujaba.muml.allocation.category");
				category.getModelElements().add(systemAllocation);

				rootNode.getCategories().add(category);

				// Now save the content.
				try {
					Map<String, Object> options = new HashMap<String, Object>();
					options.put(XMLResource.OPTION_ENCODING, "UTF-8");
					 fujabaResource.save(options);
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
