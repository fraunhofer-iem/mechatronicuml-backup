package org.muml.pim.pattern.diagram.custom.export.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.muml.core.export.pages.IActivatableWizardPage;
import org.muml.pim.pattern.AbstractCoordinationPattern;

public abstract class AbstractPatternVerificationWizardPage 
	extends WizardPage implements IActivatableWizardPage{
	AbstractCoordinationPattern pattern;
	FormToolkit toolkit;
	

	public AbstractPatternVerificationWizardPage(String pageName,String pageTitle, String pageDescription, AbstractCoordinationPattern pattern, FormToolkit toolkit) {
		super(pageName);
		this.pattern = pattern;
		this.toolkit = toolkit;
		this.setDescription(pageDescription);
		this.setTitle(pageTitle);
	}
	
	@Override
	public void deactivate() {
		// do nothing
	}
	
	@Override 
	public void activate() {
		// do nothing
	}
	
}
