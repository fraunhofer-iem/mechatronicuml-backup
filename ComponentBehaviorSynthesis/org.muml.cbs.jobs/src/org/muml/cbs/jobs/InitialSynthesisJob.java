package org.muml.cbs.jobs;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.muml.mumlcore.CorePackage;
import org.muml.pim.component.AtomicComponent;

public class InitialSynthesisJob extends Job {

	private AtomicComponent comp;

	private AtomicComponent compWithSynthesizedBehavior;

	private TransformationExecutor executor;

	private String transformation;

	private IStatus loadStatus;

	public InitialSynthesisJob(AtomicComponent comp) {

		super("Software Component Behavior Synthesis");

		this.comp = comp;

		this.transformation = "/org.muml.cbs/transforms/SoftwareComponentBehaviorSynthesis.qvto";
		
		initializeTransformationExecutor();

	}

	public IStatus loadTransformation() {

		loadStatus = BasicDiagnostic.toIStatus(executor.loadTransformation());

		return loadStatus;

	}

	private void initializeTransformationExecutor() {

		executor = new TransformationExecutor(
				URI.createPlatformPluginURI(
						transformation,
						true));

		loadStatus = null;

	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {

		ExecutionContextImpl context;
		List<? extends EObject> inObjects;
		ModelExtent inoutExtent;
		//ModelExtent outputExtent;
		Diagnostic diagnostic = null;
		IStatus status;

		try {

			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(),
					100);

			if (loadStatus == null) {

				subMonitor.subTask("Load Synthesis");

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

			subMonitor.subTask("Execute Inititial Synthesis of: "+comp.getName());

			context = new ExecutionContextImpl();
			context.setConfigProperty("namesOfComponentsToSynthesize",
					'[' + comp.getName() +']');
			inObjects = comp.eResource().getContents();
			inoutExtent = new BasicModelExtent(inObjects);
			
			EditingDomain domain = TransactionUtil.getEditingDomain(comp);
			
			//FIXME Warnings that are produced during the transformation
			// are not in the diagnostics from the executor 
			// either the QVT-O implementation is wrong or here must be fixed something.
			if(domain!=null){
				TransformationRecordingCommand transform = new TransformationRecordingCommand((TransactionalEditingDomain)domain, "Inter-Behavior Synthesis", "Synthesis of "+comp.getName(), executor, context, inoutExtent);
				domain.getCommandStack().execute(transform);
				
				diagnostic = transform.getDiagnostic();
			}
			else{
				domain = AdapterFactoryEditingDomain.getEditingDomainFor(comp);
				if(domain!=null){
					TransformationChangeCommand transform = new TransformationChangeCommand(comp.eResource().getContents().get(0), executor, context, inoutExtent);
					domain.getCommandStack().execute(transform);
					
					diagnostic = transform.getDiagnostic();
				}
				else{
					diagnostic = executor.execute(context, inoutExtent);
				}
			}
			

			subMonitor.worked(25);
			
			status = BasicDiagnostic.toIStatus(diagnostic);
			if (status.isOK()) {
				
				for(EObject curObject : inoutExtent.getContents())
					if(curObject instanceof AtomicComponent){
						if(((AtomicComponent) curObject).getName().equals(comp.getName())){
							setResultsComponent((AtomicComponent) curObject);
							break;
						}
					}
				
			} else {
				return status;
			}

			if (monitor.isCanceled()) {
				if(domain.getCommandStack().canUndo()) {
					domain.getCommandStack().undo();
				}
				return Status.CANCEL_STATUS;
			}
			;

			//FIXME Currently the model becomes invalid through the used messages in RealtimeStatechart which have no port as BehavioralElement
//			subMonitor.subTask("Validate Target Model");
//			
//			if(compWithSynthesizedBehavior != null)
//			diagnostic = Diagnostician.INSTANCE.validate(compWithSynthesizedBehavior);
//
//			subMonitor.worked(5);
//
//			status = BasicDiagnostic.toIStatus(diagnostic);
//			if (!status.isOK()) {
//				return status;
//			}

			return Status.OK_STATUS;

		} finally {
			monitor.done();
		}

	}

	public AtomicComponent getResultsComponent() {
		return compWithSynthesizedBehavior;
	}

	public void setResultsComponent(
			AtomicComponent compWithSynthesizedBehavior) {
		this.compWithSynthesizedBehavior = compWithSynthesizedBehavior;
	};

}
