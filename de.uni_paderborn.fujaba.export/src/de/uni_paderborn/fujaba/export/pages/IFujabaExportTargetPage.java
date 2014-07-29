package de.uni_paderborn.fujaba.export.pages;

import org.eclipse.jface.wizard.IWizardPage;

public interface IFujabaExportTargetPage extends IWizardPage {
	public boolean wizardPageSupportsOverwriteOption();
	public boolean wizardPageDirectoryDestination();
}
