package de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.custom.export.wizard;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.jface.dialogs.IPageChangeProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.IWorkbench;

import pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.common.edit.commands.ExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.export.operation.AbstractFujabaExportOperation;
import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;
import de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.custom.part.Activator;

/**
 * 
 * @author sthiele2
 *
 */
public class ExportWizardPatternToProtocol extends
		de.uni_paderborn.fujaba.export.wizard.AbstractFujabaExportWizard {

	public static final String SELECTPATTERN = "SelectSource";
	public static final String BINDPARAMETERS = "BINDPARAMETERS";

	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {

		super.init(workbench, currentSelection);

	}

	@Override
	public void setContainer(IWizardContainer wizardContainer) {
		// TODO Auto-generated method stub
		super.setContainer(wizardContainer);
		if (wizardContainer != null)
			((IPageChangeProvider) this.getContainer())
					.addPageChangedListener((PatternToProtocolExportWizardPage1) this
							.getPage(BINDPARAMETERS));
	}

	public void addPages() {

		addPage(new PatternToProtocolExportSourcePage(SELECTPATTERN, toolkit,
				this.getResourceSet(), initialSelection));
		addPage(new PatternToProtocolExportWizardPage1(BINDPARAMETERS, toolkit));

	}

	@Override
	public String wizardGetId() {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		// TODO Auto-generated method stub
		return new AbstractFujabaExportOperation() {
			@Override
			protected IStatus doExecute(IProgressMonitor progressMonitor) {
				return Status.OK_STATUS;
			}
		};

	}

	public boolean performFinish() {
		super.performFinish();		
		TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE
				.createEditingDomain(new ResourceSetImpl());
		ICommandProxy cmd = new ICommandProxy(
				new PatternToProtocoTransformationCommand(domain,((PatternToProtocolExportSourcePage) this
						.getPage(SELECTPATTERN)).getSelectedPattern()));
		cmd.execute();
		/*TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE
				.createEditingDomain(this.getResourceSet());
		
		transformPatternToProtocol(domain,
				((PatternToProtocolExportSourcePage) this
						.getPage(SELECTPATTERN)).getSelectedPattern());
		*/
		return true;
	}

	private static void transformPatternToProtocol(EditingDomain editingDomain,
			CoordinationPattern pattern) {

		
		ModelExtent inputExtent = new BasicModelExtent(
				Arrays.asList(new EObject[] { pattern }));

		final List<ModelExtent> modelExtents = Arrays
				.asList(new ModelExtent[] { inputExtent });

		// Load QVTO script
		final TransformationExecutor transformationExecutor = Activator
				.getInstance()
				.getTransformationExecutor(Activator.TRANSFORM_PATTERN_TO_PROTOCOL
						,
						false);

		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents);

		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}

		if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
			editingDomain.getCommandStack().undo();
		}
	}
	
	class PatternToProtocoTransformationCommand extends AbstractTransactionalCommand
	{
		CoordinationPattern source=null;
	
		public PatternToProtocoTransformationCommand(TransactionalEditingDomain editingDomain, CoordinationPattern source)
		{
		    super(editingDomain, "Transform pattern to Protocol", null);
		    this.source = source;		  
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {
			URI transformationURI = URI
					.createPlatformPluginURI(
							Activator.TRANSFORM_PATTERN_TO_PROTOCOL,
							true);
			// create executor and execution context
			TransformationExecutor executor = new TransformationExecutor(
					transformationURI);
			ExecutionContextImpl context = new ExecutionContextImpl();

			// create model extent
			BasicModelExtent modelExtent = new BasicModelExtent();
			modelExtent.add(source);

			// execute transformation
			ExecutionDiagnostic result = executor.execute(context, modelExtent);
			if (result.getSeverity() != ExecutionDiagnostic.OK) {
				String message = "QVT-O ERROR on rule transformation. Message was:"
						+ result.getMessage();
				return CommandResult.newErrorCommandResult(message);
			}

			return CommandResult.newOKCommandResult();
		}		
	}
}
