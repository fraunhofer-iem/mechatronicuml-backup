package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.wizards;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel;

public class ModifyParameterPage extends WizardPage{
	
	protected Text parameterNameText = null;
	protected Text parameterTypeText = null;
	
	protected ListViewer parameterLViewer = null;
 
	public ModifyParameterPage(String pageName)
	{
		super(pageName);
	}

	@Override
	public void setVisible(boolean visible) {

		if (visible)
    	{
			setPageComplete(true);
    	}

    	super.setVisible(visible);
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		
	    Composite main = new Composite(parent, SWT.NONE);
	    FormLayout layout = new FormLayout();
	    main.setLayout(layout);
	    main.setFont(parent.getFont());
	            
	    setErrorMessage(null);	      
	    setMessage(null);
	    setControl(main);
	    
	    FormData parameterNameFormData1 = new FormData();
	    parameterNameFormData1.left = new FormAttachment(0, 0);
	    parameterNameFormData1.right = new FormAttachment(20, 0);
	    parameterNameFormData1.top = new FormAttachment(0, 0);
	    parameterNameFormData1.bottom = new FormAttachment(10, 0);
	    Label pNameLabel = new Label(main, SWT.NONE);
	    pNameLabel.setText("ParameterName:  ");
	    pNameLabel.setLayoutData(parameterNameFormData1);
	    
	    FormData parameterNameFormData2 = new FormData();
	    parameterNameFormData2.left = new FormAttachment(0, 0);
	    parameterNameFormData2.right = new FormAttachment(20, 0);
	    parameterNameFormData2.top = new FormAttachment(10, 0);
	    parameterNameFormData2.bottom = new FormAttachment(20, 0);
	    parameterNameText = new Text(main, SWT.SINGLE | SWT.BORDER); 
	    parameterNameText.setLayoutData(parameterNameFormData2);
	    
	    FormData parameterTypeFormData1 = new FormData();
	    parameterTypeFormData1.left = new FormAttachment(0, 0);
	    parameterTypeFormData1.right = new FormAttachment(20, 0);
	    parameterTypeFormData1.top = new FormAttachment(20, 0);
	    parameterTypeFormData1.bottom = new FormAttachment(30, 0);
	    Label parameterTypeLabel = new Label(main, SWT.NONE);
	    parameterTypeLabel.setText("ParameterType:  ");
	    parameterTypeLabel.setLayoutData(parameterTypeFormData1);
	   
	    FormData parameterTypeFormData2 = new FormData();
	    parameterTypeFormData2.left = new FormAttachment(0, 0);
	    parameterTypeFormData2.right = new FormAttachment(20, 0);
	    parameterTypeFormData2.top = new FormAttachment(30, 0);
	    parameterTypeFormData2.bottom = new FormAttachment(40, 0);
	    parameterTypeText = new Text(main, SWT.SINGLE | SWT.BORDER);
	    parameterTypeText.setLayoutData(parameterTypeFormData2);
	    
	    
	    FormData exitingParameterFormData = new FormData();
	    exitingParameterFormData.left = new FormAttachment(40, 0);
	    exitingParameterFormData.right = new FormAttachment(80, 0);
	    exitingParameterFormData.top = new FormAttachment(0, 0);
	    exitingParameterFormData.bottom = new FormAttachment(20, 0);
	    Label exitingParameterLabel = new Label(main, SWT.NONE);
	    exitingParameterLabel.setText("Existing Parameter of \n" +
	    		"synchronization channel: '"+ ((ModifyParameterWizard)getWizard()).getSelectedSyncChannel().getName()+ "'");
	    exitingParameterLabel.setLayoutData(exitingParameterFormData);
	    
	    FormData parameterLViewerFormData = new FormData();
	    parameterLViewerFormData.left = new FormAttachment(40, 0);
	    parameterLViewerFormData.right = new FormAttachment(90, 0);
	    parameterLViewerFormData.top = new FormAttachment(20, 0);
	    parameterLViewerFormData.bottom = new FormAttachment(90, 0);
	    Composite parametersViewerComposite = new Composite(main, SWT.NONE);
	    parametersViewerComposite.setLayout(new FillLayout());
	    parametersViewerComposite.setLayoutData(parameterLViewerFormData);
	    parameterLViewer = new ListViewer(parametersViewerComposite);
	    parameterLViewer.setContentProvider(new ParameterListContentProvider());
	    parameterLViewer.setInput(null);
	    
	    FormData createButtonFormData = new FormData();
	    createButtonFormData.left = new FormAttachment(0, 0);
	    createButtonFormData.right = new FormAttachment(15, 0);
	    createButtonFormData.top = new FormAttachment(80, 0);
	    createButtonFormData.bottom = new FormAttachment(90, 0);
	    Button createButton = new Button(main, SWT.PUSH);
	    createButton.setText("Create Parameter");
	    createButton.addListener(SWT.Selection, new Listener()
	    {
	    	public void handleEvent(Event event)
	    	{
	    		handleCreateParameterEvent();
	        }
	     });
	     createButton.setLayoutData(createButtonFormData);
	     
	     FormData deleteButtonFormData = new FormData();
	     deleteButtonFormData.left = new FormAttachment(20, 0);
	     deleteButtonFormData.right = new FormAttachment(35, 0);
	     deleteButtonFormData.top = new FormAttachment(80, 0);
	     deleteButtonFormData.bottom = new FormAttachment(90, 0);
	     Button deleteButton = new Button(main, SWT.PUSH);
	     deleteButton.setText("Delete Parameter");
	     deleteButton.addListener(SWT.Selection, new Listener()
	     {
	    	 public void handleEvent(Event event)
	    	 {
	    		 handleDeleteParameterEvent();
	    	 }
		});
	     deleteButton.setLayoutData(deleteButtonFormData);		     

	}  
	
	private void handleCreateParameterEvent(){
		
	}
	
	private void handleDeleteParameterEvent(){
		
	}
	
	//provider
	class ParameterListContentProvider implements IStructuredContentProvider
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
