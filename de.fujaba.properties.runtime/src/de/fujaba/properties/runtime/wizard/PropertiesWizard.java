package de.fujaba.properties.runtime.wizard;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;

public class PropertiesWizard extends Wizard {
	
	private CompoundCommand compoundCommand = new CompoundCommand("Properties Modification");

	private AdapterFactory adapterFactory;
	
	private EObject element;
	
	boolean canceled = false;
	
	public PropertiesWizard(AdapterFactory adapterFactory) {
		this(adapterFactory, null);
	}
	
	public PropertiesWizard(AdapterFactory adapterFactory, EObject element) {
		this.adapterFactory = adapterFactory;
		this.element = element;
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
	
	public EObject getElement() {
		return element;
	}
	
	public void setElement(EObject element) {
		this.element = element;
	}

	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

}
