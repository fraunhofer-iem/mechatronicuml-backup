package org.muml.reconfigurationverification.timedmodelchecking.ui.commands;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.core.reachanalysis.core.export.GraphVizExportFileTypes;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.reconfigurationverification.reachanalysis.gtautomaton.GtAutomatonComputation;
import org.muml.reconfigurationverification.reachanalysis.gtautomaton.export.GtAutomatonExporter;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton;
import org.muml.reconfigurationverification.timedstorychart.transform.TSCTransformationRunner;
import org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem;


public class TimedMCCommand extends AbstractHandler {

	private Shell shell;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get shell
		shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		if (shell == null) {
			shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		}

		// Get currently selected element
		EObject element = null;
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
			Object object = ((IStructuredSelection) selection)
					.getFirstElement();
			
			if (object instanceof GraphicalEditPart) {
				element = ((GraphicalEditPart) object).getNotationView()
						.getElement();
			}
			
			if(element instanceof CoordinationProtocol){
				launchJob((CoordinationProtocol) element);
			}

		}

		return null;
	}
	
	private void launchJob(final CoordinationProtocol protocol){
		Job job = new Job("Timed Model Checking") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("Performing Timed Model Checking...", 100);
				
				monitor.subTask("Performing TSC Transformation...");



				TSCTransformationRunner transformationRunner = new TSCTransformationRunner();
				transformationRunner.execute(protocol.getRoleConnector());
				
				TimedGraphTransformationSystem tgts = transformationRunner.getTgts();
				
				GtAutomatonComputation gtAutomatonComputation = new GtAutomatonComputation(tgts);
				gtAutomatonComputation.setMaxPathLength(15);
				gtAutomatonComputation.computeReachabilityGraph();
				GtAutomaton gtAutomaton = gtAutomatonComputation.getReachabilityGraph();
				
				GtAutomatonExporter exporter = new GtAutomatonExporter();
				exporter.setType(GraphVizExportFileTypes.SVG);
				//exporter.setDecorator(new GtAutomatonDecorator());
				exporter.export(gtAutomaton);
				
//				MuComputation muComputation = new MuComputation();
//				muComputation.computeMu(gtAutomaton, formula);
//				
//				KronosAutomatonWriter kronosExport = new KronosAutomatonWriter();
//				kronosExport.setModel(gtAutomaton);
//				kronosExport.writeToFile("", monitor);
				
//				KronosCommand kronosCommand = new KronosCommand();
//				kronosCommand.setKronosPath(kronosPath)
//
//				kronosCommand.execute(null).run();
//				kronosCommand.printOutput(null, System.out);
				
				finished();
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.schedule();
	}
	
	private void finished() {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				MessageDialog.openInformation(shell, "Report",
						"Finished.");
			}
		});

	}
	
	
}