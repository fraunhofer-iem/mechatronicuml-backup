package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.wizards;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.internal.ole.win32.COMObject;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.umlrt.common.wizard.GenericWizardPage;
import de.uni_paderborn.fujaba.umlrt.model.component.Component;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel;

public class ModifyParameterPage extends GenericWizardPage{
	
	protected Text parameterNameText = null;
	protected Text parameterTypeText = null;
	
	protected ListViewer parameterLViewer = null;
 
	public ModifyParameterPage(String pageName,
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

	    Composite main = new Composite(parent, SWT.NONE);
	    FormLayout layout = new FormLayout();
	    main.setLayout(layout);
	    main.setFont(parent.getFont());
	    
	    FormData parameterNameFormData = new FormData();
	    parameterNameFormData.left = new FormAttachment(0, 0);
	    parameterNameFormData.right = new FormAttachment(20, 0);
	    parameterNameFormData.top = new FormAttachment(0, 0);
	    parameterNameFormData.bottom = new FormAttachment(20, 0);
	    Composite parameterNameComposite = new Composite(main, SWT.TOP);
	    GridLayout parameterNameGridLayout = new GridLayout();
	    parameterNameGridLayout.numColumns = 2;
	    parameterNameComposite.setLayout(parameterNameGridLayout);
	    parameterNameComposite.setLayoutData(parameterNameFormData);

	    Label pNameLabel = new Label(parameterNameComposite, SWT.TOP);
	    pNameLabel.setText("ParameterName:  ");
	    GridData pNameLabelGridData = new GridData();
	    pNameLabel.setLayoutData(pNameLabelGridData);
	    parameterNameText = new Text(parameterNameComposite, SWT.DOWN);
	    GridData pNameTextGridData = new GridData();
	    parameterNameText.setLayoutData(pNameTextGridData);
	    
	    
	    
	    FormData parameterTypeFormData = new FormData();
	    parameterTypeFormData.left = new FormAttachment(0, 0);
	    parameterTypeFormData.right = new FormAttachment(20, 0);
	    parameterTypeFormData.top = new FormAttachment(20, 0);
	    parameterTypeFormData.bottom = new FormAttachment(40, 0);
	    Composite parameterTypeComposite = new Composite(main, SWT.TOP);
	    GridLayout parameterTypeGridLayout = new GridLayout();
	    parameterTypeGridLayout.numColumns = 2;
	    parameterTypeComposite.setLayout(parameterTypeGridLayout);
	    parameterTypeComposite.setLayoutData(parameterTypeFormData);

	    Label parameterTypeLabel = new Label(parameterTypeComposite, SWT.TOP);
	    parameterTypeLabel.setText("ParameterType:  ");
	    GridData pTypeLabelGridData = new GridData();
	    parameterTypeLabel.setLayoutData(pTypeLabelGridData);
	    parameterTypeText = new Text(parameterTypeComposite, SWT.DOWN);
	    GridData pTypeTextGridData = new GridData();
	    parameterTypeText.setLayoutData(pTypeTextGridData);

	}  
	
	//provider
	class FormulasListContentProvider implements IStructuredContentProvider
	{

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput){}

		public Object[] getElements(Object parent)
		{
	        if (parent instanceof SynchronizationChannel)
	        {
	        	SynchronizationChannel syncChannel = (SynchronizationChannel)parent;
	        }
			
	        return null;
		}
		
		public void dispose(){}
		      
	}
	
}
