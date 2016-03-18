package de.uni_paderborn.fujaba.muml.testlanguage.custom.validation;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.service.IValidationListener;
import org.eclipse.emf.validation.service.ValidationEvent;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.URIConversion;

public class MarkerListener implements IValidationListener {

	@Override
	public void validationOccurred(final ValidationEvent event) {

		// Cancel if the listener gets called from some weird other place that
		// has nothing to do with the TestLanguage and that made it almost
		// impossible to use it...
		if (!event.getEvaluationMode().isBatchOnly()
				|| !event
						.getClientContextIds()
						.contains(
								"de.uni_paderborn.fujaba.muml.testlanguage.topologicalContext")) {
			return;
		}

		// Give console feedback ending the validation.
		ValidationLog.endValidation(event);

		// Try to show some more elaborate feedback using dialogues if not in
		// JUnit mode.
		if (URIConversion.RUNNING_FROM_JUNIT) {
			return;
		}

		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				Shell activeShell = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell();

				if (event.matches(IStatus.ERROR)) {
					new ValidationErrorDialog(activeShell, event.getValidationResults()).open();
				} else {
					MessageDialog.openInformation(activeShell,
							"Validation Successful",
							"The validation was successful!");
				}
			}
		});
	}

}
