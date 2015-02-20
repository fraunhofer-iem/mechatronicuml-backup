package de.uni_paderborn.fujaba.muml.verification.uppaal.ui;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import de.uni_paderborn.fujaba.muml.verification.uppaal.results.PropertyResultRepository;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces.VerificationPropertyResultAcceptor;

public class PropertiesResultWizard extends Wizard implements VerificationPropertyResultAcceptor  {
	protected PropertyResultRepository result = null;
	private WizardDialog dialog = null;
	
	@Override
	public boolean performFinish() {
		return true;
	}

	@Override
	public void addPages() {
		addPage(new PropertiesResultWizardPage("Verification Results", result));
	}
	
	@Override
	public boolean canFinish() {
		return true;
	}
	
	@Override
	public String getWindowTitle() {
		return "Verification Results";
	}

	@Override
	public void acceptResult(PropertyResultRepository result) {
		this.result = result;
		//Open dialog
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), PropertiesResultWizard.this);
				dialog.open();
			}
		});
	}
}
