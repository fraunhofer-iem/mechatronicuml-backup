package org.muml.pim.pattern.diagram.custom.export.wizard;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.muml.core.export.operation.AbstractFujabaExportOperation;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.wizard.AbstractFujabaExportWizard;
import org.muml.mumlcore.expressions.Expression;
import org.muml.mumlcore.expressions.common.LiteralExpression;
import org.muml.mumlcore.modelinstance.RootNode;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pim.pattern.AbstractCoordinationPattern;
import org.muml.pim.pattern.diagram.custom.part.Activator;
import org.muml.pim.protocol.CoordinationProtocol;

public class PatternVerificationWizard extends AbstractFujabaExportWizard {

	AbstractCoordinationPattern selectedPattern;
	PatternVerificationWizardPage2 p2;
	CoordinationProtocol protocolFromSelectedPattern;

	public void init(IWorkbench workbench, IStructuredSelection currentSelection,
			AbstractCoordinationPattern selectedPattern) {
		// TODO Auto-generated method stub
		super.init(workbench, currentSelection);
		this.selectedPattern = selectedPattern;
		this.setWindowTitle("Pattern Verification Wizard");
	}

	@Override
	public String wizardGetId() {
		// TODO Auto-generated method stub
		return "org.muml.pim.pattern.diagram.custom.export.wizard.PatternVerificationWizard";
	}

	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		super.addPages();

		PatternVerificationWizardPage1 p1 = new PatternVerificationWizardPage1("DefineVerifiedConfiguration",
				"Step 1: Choose a verified configuration",
				"On this page you can select a VerifiedConfiguration for the parameters. The chosen configuration is used by the Uppaal Model Checking."
						+ "If you do not want to chooes a verified configuration, you can also define a configuration manually on the next page.",

				selectedPattern, toolkit);
		p2 = new PatternVerificationWizardPage2("SelectVerifiedConfiguration",
				"Step 2: Manual definition of a verified configuration",
				"On this page you can alter the values of the chosen VerifiedConfiguration or define your own configuration. "
						+ "If your configuration is complete, press the Finish-Button in order to start the Model Checking.",
				selectedPattern, toolkit, p1);

		this.addPage(p1);
		this.addPage(p2);
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

	public CoordinationProtocol getTransformedCoordinationProtocolFromCoordinationPattern() {
		return this.protocolFromSelectedPattern;
	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		super.performFinish();

		for (ParameterBinding binding : p2.getBindings()) {
			Expression value = binding.getValue();

			if (!(value instanceof LiteralExpression) || ((LiteralExpression) value).getValue().equals("")) {
				ErrorDialog dialog = new ErrorDialog(this.getShell(), "ERROR when validating the Parameter Bindings",
						null, new org.eclipse.core.runtime.Status(IStatus.ERROR, Activator.ID,
								"Each Parameter Binding must bind a value to its Parameter!"),
						IStatus.ERROR);
				dialog.open();
				return false;
			}
		}
		// PatternToProtocolTransformation.saveInput(selectedPattern,
		// (RootNode)selectedPattern.eContainer().eContainer(),
		// p2.getBindings(), editingDomain);
		this.startUppaalModelChecking();
		return true;
	}

	public void startUppaalModelChecking() {
		protocolFromSelectedPattern = PatternToProtocolTransformation.transformPatternToProtocolVerification(
				selectedPattern, (RootNode) selectedPattern.eContainer().eContainer(), p2.getBindings(), editingDomain);
		// PatternToProtocolTransformation.TransformPatternToProtocolStep2(selectedPattern,
		// protocolFromSelectedPattern,
		// (RootNode)protocolFromSelectedPattern.eContainer().eContainer(),
		// editingDomain);
	}

}
