package org.muml.core.export.pages;

import org.eclipse.jface.wizard.IWizardPage;

/**
 * Wizard Page that supports an <code>activate()</code> method.
 * 
 * The IWizard calls that method before the page is activated, because the user
 * clicks on the "Next"-Button or because it is the first page and the wizard
 * has just been opened.
 * 
 * @author Basti & Bingo
 *
 */
public interface IActivatableWizardPage extends IWizardPage {
	
	/**
	 * Activates this page. This method should only be called by the IWizard when the page is being shown.
	 */
	void activate();
	
	/**
	 * Deactivates this page. This method should only be called by the IWizard when another page is being shown.
	 */
	void deactivate();
}
