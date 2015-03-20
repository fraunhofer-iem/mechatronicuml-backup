package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.dialogs.WizardDataTransferPage;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class PatternVerificationWizardPage1 extends WizardDataTransferPage implements IWizardPage{

	FormToolkit toolkit;
	protected PatternVerificationWizardPage1(String pageName, 	FormToolkit toolkit) {
		super(pageName);
		// TODO Auto-generated constructor stub
		this.toolkit = toolkit;
	}

	@Override
	public void handleEvent(Event event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		
		toolkit.createLabel(parent, "Hello World");
	}

	@Override
	protected boolean allowNewContainerName() {
		// TODO Auto-generated method stub
		return false;
	}

}
