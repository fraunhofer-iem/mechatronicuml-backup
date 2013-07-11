package de.fujaba.properties.runtime.wizard;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

import de.fujaba.properties.runtime.editors.IPropertyEditor;

public class PropertiesWizard extends Wizard {
	
	private CompoundCommand compoundCommand = new CompoundCommand("Properties Modification");

	private AdapterFactory adapterFactory;
	
	boolean canceled = false;
	
	public PropertiesWizard(AdapterFactory adapterFactory) {
		this.adapterFactory = adapterFactory;
		setWindowTitle("Properties");
	}
	
	@Override
	public boolean performFinish() {
		canceled = false;
		return true;
	}

	@Override
	public boolean performCancel() {
		canceled = true;
		return true;
	}

	public CompoundCommand getCompoundCommand() {
		return compoundCommand;
	}
	
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}
	
	public void setInput(Object input) {
		for (IWizardPage page : getPages()) {
			if (page instanceof IPropertyEditor) {
				((IPropertyEditor) page).setInput(input);
			}
		}
	}

}
