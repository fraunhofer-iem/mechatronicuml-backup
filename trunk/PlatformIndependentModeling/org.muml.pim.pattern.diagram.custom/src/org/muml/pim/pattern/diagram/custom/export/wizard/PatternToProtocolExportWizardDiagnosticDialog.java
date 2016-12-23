package org.muml.pim.pattern.diagram.custom.export.wizard;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/**
 * The diagnostic wizard for displaying the Validation Results of the Coordination Pattern that should be transformed to a Coordination Protocol.
 * @author sthiele2
 *
 */
public class PatternToProtocolExportWizardDiagnosticDialog extends
		org.eclipse.emf.common.ui.dialogs.DiagnosticDialog {

	public PatternToProtocolExportWizardDiagnosticDialog(Shell parentShell,
			String dialogTitle, String message, Diagnostic diagnostic,
			int severityMask) {
		super(parentShell, dialogTitle, message, diagnostic, severityMask);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		// TODO Auto-generated method stub
		createButton(parent, IDialogConstants.OK_ID,
				"Execute the transformation anyway!", true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				"Cancel and do not execute the transformation!", true);
		createDetailsButton(parent);
	}

}
