package de.uni_paderborn.fujaba.properties.runtime.wizard;

import org.eclipse.jface.wizard.Wizard;

public class PropertiesWizard extends Wizard {

	public PropertiesWizard() {
		setWindowTitle("Properties");
	}

	@Override
	public boolean performFinish() {
		return true;
	}

	@Override
	public boolean performCancel() {
		return true;
	}
}
