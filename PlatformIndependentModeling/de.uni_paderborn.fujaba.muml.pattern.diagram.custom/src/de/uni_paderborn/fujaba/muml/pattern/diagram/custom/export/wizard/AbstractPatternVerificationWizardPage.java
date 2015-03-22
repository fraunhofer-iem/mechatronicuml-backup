package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;

public abstract class AbstractPatternVerificationWizardPage 
	extends WizardPage implements IWizardPage{
	CoordinationPattern pattern;
	FormToolkit toolkit;
	

	public AbstractPatternVerificationWizardPage(String pageName,String pageTitle, String pageDescription, CoordinationPattern pattern, FormToolkit toolkit) {
		super(pageName);
		this.pattern = pattern;
		this.toolkit = toolkit;
		this.setDescription(pageDescription);
		this.setTitle(pageTitle);
	}
	
	
	
}
