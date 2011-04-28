package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;

import de.uni_paderborn.fujaba.umlrt.common.wizard.GenericWizardPage;

public class AddEParameterPage extends GenericWizardPage {
 
  public AddEParameterPage(String pageName,
      IStructuredSelection selection)
  {
    super(pageName, selection);
  }

  @Override
  public void setVisible(boolean visible) {

    if (visible)
    {
    	
    	setPageComplete(true);
    }

    super.setVisible(visible);
  }


  public void addCustomFields(Composite parent) {

  }
  
}
