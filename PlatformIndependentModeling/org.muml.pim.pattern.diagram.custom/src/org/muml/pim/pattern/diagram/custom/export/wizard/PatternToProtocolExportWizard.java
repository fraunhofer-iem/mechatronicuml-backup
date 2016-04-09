package org.muml.pim.pattern.diagram.custom.export.wizard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.muml.core.export.operation.AbstractFujabaExportOperation;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.wizard.AbstractFujabaExportWizard;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.common.LiteralExpression;
import org.muml.core.modelinstance.RootNode;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pim.pattern.AbstractCoordinationPattern;
import org.muml.pim.pattern.diagram.custom.part.Activator;
import org.muml.pim.protocol.CoordinationProtocol;

/**
 * The export wizard for the pattern to protocol transformation
 * 
 * @author sthiele2
 *
 */
public class PatternToProtocolExportWizard extends AbstractFujabaExportWizard {

	private PatternToProtocolExportWizardPage1 page1;
	private PatternToProtocolExportWizardPage2 page2;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle("Transform CoordinationPattern to CoordinationProtocol");
		setDefaultPageImageDescriptor(IDEWorkbenchPlugin.getIDEImageDescriptor("wizban/exportzip_wiz.png"));//$NON-NLS-1$
	}

	@Override
	public String wizardGetId() {
		return "org.muml.pim.pattern.diagram.custom.ExportWizardPatternToProtocol";
	}

	public void addPages() {
		// Source page
		page1 = new PatternToProtocolExportWizardPage1("source", toolkit, this.getResourceSet(), this.initialSelection);
		addPage(page1);
		page2 = new PatternToProtocolExportWizardPage2("DefineParameterBinding", toolkit, page1);
		addPage(page2);

	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		// final EObject[] sourceElements = page1.getSourceElements();

		return new AbstractFujabaExportOperation() {
			@Override
			protected IStatus doExecute(IProgressMonitor progressMonitor) {
				return Status.OK_STATUS;
			}
		};
	}

	/**
	 * Task for finishing the wizard: 1.) fetch the selected Coordination
	 * Pattern and the given Parameter Bindings 2.) check whether the Parameter
	 * Bindings assign correct values to the parameters, create the input for
	 * the transformation 3.) validate the Coordination Pattern, show error
	 * dialog if validation fails 4.) start transformation PatternToProtocol
	 */
	public boolean performFinish() {
		super.performFinish();

		EditingDomain domain = this.getEditingDomain();

		// 1) fetch the selected Coordination Pattern and the given Parameter
		// Bindings
		AbstractCoordinationPattern thePattern = null;
		ArrayList<ParameterBinding> bindings = null;
		for (EObject sourceElement : page1.getSourceElements()) {
			if (sourceElement instanceof AbstractCoordinationPattern)
				thePattern = (AbstractCoordinationPattern) sourceElement;
		}
		// 2)check whether the ParameterBindings assign correct values to the
		// parameter
		bindings = page2.getParameterBindings();
		for (ParameterBinding binding : bindings) {
			Expression value = binding.getValue();

			if (!(value instanceof LiteralExpression) || ((LiteralExpression) value).getValue().equals("")) {
				ErrorDialog dialog = new ErrorDialog(this.getShell(), "ERROR when validating the Parameter Bindings",
						null, new org.eclipse.core.runtime.Status(IStatus.ERROR, Activator.ID,
								"Each Parameter Binding must bind a value to its Parameter!"),
						IStatus.ERROR);
				dialog.open();
				return false;
			}
			String string = ((LiteralExpression) value).getValue();
			if (!string.equals("false") && !string.equals("true")) {
				try {
					Integer.parseInt(string);
				} catch (NumberFormatException e) {
					ErrorDialog dialog = new ErrorDialog(this.getShell(),
							"ERROR when validating the Parameter Bindings", null,
							new org.eclipse.core.runtime.Status(IStatus.ERROR, Activator.ID,
									"Each Parameter Binding must bind a parameter value that is of type integer or boolean!"),
							IStatus.ERROR);
					dialog.open();
					return false;
				}
			}
		}
		// 3) validate the Coordination Pattern, show error dialog if validation
		// fails
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(page1.getSelectedPattern());
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			PatternToProtocolExportWizardDiagnosticDialog dialog = new PatternToProtocolExportWizardDiagnosticDialog(
					this.getShell(), "Warning: Validation of Coordination Pattern failed!",
					"The Coordination Pattern does not validate. Press details for further information about the validation errors.",
					diagnostic, Diagnostic.ERROR);
			dialog.open();
			if (dialog.getReturnCode() == PatternToProtocolExportWizardDiagnosticDialog.CANCEL) {
				return false;
			}
		}
		// 4) start transformation PatternToProtocol
		transformPatternToProtocol(domain, (RootNode) thePattern.eContainer().eContainer(), bindings, this.getShell(),
				thePattern);
		return true;
	}

	private static void transformPatternToProtocol(EditingDomain editingDomain, RootNode rootNode,
			ArrayList<ParameterBinding> bindings, Shell shell, AbstractCoordinationPattern thePattern) {

		// get the protocol category and get the number of protocols within this
		// category
		CoordinationProtocol newProtocol = PatternToProtocolTransformation.transformPatternToProtocol(thePattern,
				rootNode, bindings, editingDomain);
		if (newProtocol == null)
			return;

		// // check whether there are mtclt constraints
		// if (thePattern.getVerificationConstraintRepositories().size() > 0) {
		// // create input for the second transformation step.
		// PatternToProtocolTransformation.TransformPatternToProtocolStep2(thePattern,
		// newProtocol, rootNode, editingDomain);
		// }
		// save the resource, e.g. the modified modelinstance, such that the
		// changes caused by the transformation are not lost.
		final Resource resource = newProtocol.eResource();

		try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}

		PatternToProtocolTransformation.createDiagrams(shell, newProtocol);

	}

	// @Override
	// public IWizardPage getNextPage(IWizardPage page) {
	// // TODO Auto-generated method stub
	// IWizardPage next = super.getNextPage(page);
	// if (next == page2)
	// page2.refresh();
	// return next;
	// }

}
