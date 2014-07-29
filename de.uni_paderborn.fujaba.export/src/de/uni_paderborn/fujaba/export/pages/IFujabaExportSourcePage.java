package de.uni_paderborn.fujaba.export.pages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.IWizardPage;

public interface IFujabaExportSourcePage extends IWizardPage {
	public String wizardPageGetSourceFileExtension();
    public ElementSelectionMode wizardPageGetSupportedSelectionMode();
    public boolean wizardPageSupportsSourceModelElement(EObject element);
    public ISelection wizardPageGetDefaultSelection(Resource resource);
	public Object[] getSourceElements();
}
