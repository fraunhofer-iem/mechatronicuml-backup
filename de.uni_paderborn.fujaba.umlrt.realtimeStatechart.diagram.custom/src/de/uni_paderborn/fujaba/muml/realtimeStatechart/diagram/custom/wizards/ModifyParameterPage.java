package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.wizards;

import java.util.Iterator;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.muml.common.command.ParameterCreateCommand;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes;

public class ModifyParameterPage extends CommonModifyPage{
	
	protected Text parameterNameText = null;
	protected Combo parameterTypeCombo = null;
	
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
	    parameterTypeCombo = new Combo(main, SWT.SINGLE | SWT.BORDER);
	    parameterTypeCombo.setLayoutData(parameterTypeFormData2);
	    
	    instanciateParameterTypeCombo();
	    
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
	    parameterLViewer.setContentProvider(new ParametersContentProvider());
	    parameterLViewer.setInput(((ModifyParameterWizard)getWizard()).getSelectedSyncChannel());
	    
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
	    		parameterLViewer.refresh();
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
	    		 parameterLViewer.refresh();
	    	 }
		});
	     deleteButton.setLayoutData(deleteButtonFormData);		     

	}  
	
	private void handleCreateParameterEvent(){
	  	  
		if(!parameterNameText.getText().equals("") && getSelectedDataType()!= null){
			CreateElementRequest request = new CreateElementRequest(((ModifyParameterWizard)getWizard()).getSelectedSyncChannel(),
					UmlrtElementTypes.DoEvent_3008);
							  
						ParameterCreateCommand command = new ParameterCreateCommand(request, 
								this.parameterNameText.getText(), getSelectedDataType());
				
						new ICommandProxy(command).execute();
		}
	}
	
	private void handleDeleteParameterEvent(){
		
	      ISelection selection = parameterLViewer.getSelection();

	      if(selection instanceof IStructuredSelection)
	      {
	    	  IStructuredSelection sel = (IStructuredSelection) selection;

	    	  for (Object obj : sel.toList()) {

	    		  if(obj != null){
	    			  
	    			  Iterator<EParameter> iter = ((ModifyParameterWizard)getWizard()).
	    			  	getSelectedSyncChannel().getContainedParameters().iterator();
	    			  while(iter.hasNext()){
	    				  EParameter tmp = iter.next();
	    				  if(getFullParameterName(tmp).equals(obj.toString())){
	    					  deleteObject(tmp);
	    					  break;
	    				  }
	    			  }
	    		  }
	    	  }
	      }
	}
	
	class ParametersContentProvider implements IStructuredContentProvider
	{
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput){}
		
		public Object[] getElements(Object parent)
		{
			return getParametersFromSynchronizationChannel(parent);
		}
			
		public void dispose(){}
		   
	}
	
	private void instanciateParameterTypeCombo(){
		if(getDataTypes()!=null){
		
			Iterator<EDataType> iter = getDataTypes().iterator();
			while(iter.hasNext()){
				EDataType dataType = iter.next();
				
				parameterTypeCombo.add(dataType.getName());
			}
		}
	}
	
	private EDataType getSelectedDataType(){
	      
		String dataTypeString = parameterTypeCombo.getItem(parameterTypeCombo.getSelectionIndex());
		Iterator<EDataType> iter = getDataTypes().iterator();
		while(iter.hasNext()){
			EDataType tmp = iter.next();
			if(tmp.getName().equals(dataTypeString)){
				return tmp;
			}
		}
		return null;
	}
	
}
