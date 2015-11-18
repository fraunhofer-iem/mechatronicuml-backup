package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.uni_paderborn.fujaba.muml.pattern.AbstractCoordinationPattern;

public abstract class AbstractPatternVerificationWizardPage 
	extends WizardPage implements IWizardPage{
	AbstractCoordinationPattern pattern;
	FormToolkit toolkit;
	

	public AbstractPatternVerificationWizardPage(String pageName,String pageTitle, String pageDescription, AbstractCoordinationPattern pattern, FormToolkit toolkit) {
		super(pageName);
		this.pattern = pattern;
		this.toolkit = toolkit;
		this.setDescription(pageDescription);
		this.setTitle(pageTitle);
	}
	
	
	
}
