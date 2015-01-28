package de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.custom.edit.handlers;

import org.eclipse.jface.PatternToProtocolWizardPage;
import org.eclipse.jface.wizard.Wizard;

public class PatternToProtocolWizard extends Wizard {
	
protected PatternToProtocolWizardPage page1;

	
	public PatternToProtocolWizard() {
		    super();
		    setNeedsProgressMonitor(true);
		    page1 = new PatternToProtocolWizardPage("Set Parameters");
		  }

	 @Override
		public void addPages() {
		 this.addPage(page1);
		 
	    }
	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		System.out.println(page1.getText());
		return true;
	}

	
	
}
