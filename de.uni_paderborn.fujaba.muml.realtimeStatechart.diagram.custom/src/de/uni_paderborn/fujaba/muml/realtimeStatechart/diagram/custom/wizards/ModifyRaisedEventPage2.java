package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.wizards;

import java.util.Iterator;

import org.eclipse.emf.ecore.EParameter;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
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

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.commands.RaisedEventCreateCommand;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes;

public class ModifyRaisedEventPage2 extends CommonEventModifyPage{

	public ModifyRaisedEventPage2(String pageName)
	{
		super(pageName);
	}
	
	protected MessageType getSelectedMessageType(){
		return ((ModifyRaisedEventWizard)getWizard()).getSelectedMessageType();
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
	    
	    FormData parameterFormData1 = new FormData();
	    parameterFormData1.left = new FormAttachment(0, 0);
	    parameterFormData1.right = new FormAttachment(40, 0);
	    parameterFormData1.top = new FormAttachment(0, 0);
	    parameterFormData1.bottom = new FormAttachment(10, 0);
	    Label pLabel = new Label(main, SWT.NONE);
	    pLabel.setText("Available parameters:");
	    pLabel.setLayoutData(parameterFormData1);
	    
	    FormData parameterLViewerFormData = new FormData();
	    parameterLViewerFormData.left = new FormAttachment(0, 0);
	    parameterLViewerFormData.right = new FormAttachment(40, 0);
	    parameterLViewerFormData.top = new FormAttachment(10, 0);
	    parameterLViewerFormData.bottom = new FormAttachment(80, 0);
	    Composite parameterLViewerComposite = new Composite(main, SWT.NONE);
	    parameterLViewerComposite.setLayout(new FillLayout());
	    parameterLViewerComposite.setLayoutData(parameterLViewerFormData);
	    parameterLViewer = new ListViewer(parameterLViewerComposite);
	    parameterLViewer.setContentProvider(new ParametersContentProvider());
	    parameterLViewer.setInput(null);
	    parameterLViewer.addDoubleClickListener(new IDoubleClickListener()
		{
		  	public void doubleClick(DoubleClickEvent event)
		  	{
		  		updateValue();
		  	}
		  
		 });
	    
	    FormData parameterTypeFormData1 = new FormData();
	    parameterTypeFormData1.left = new FormAttachment(60, 0);
	    parameterTypeFormData1.right = new FormAttachment(80, 0);
	    parameterTypeFormData1.top = new FormAttachment(0, 0);
	    parameterTypeFormData1.bottom = new FormAttachment(10, 0);
	    Label parameterTypeLabel = new Label(main, SWT.NONE);
	    parameterTypeLabel.setText("Value for Parameter:  ");
	    parameterTypeLabel.setLayoutData(parameterTypeFormData1);
	   
	    FormData parameterTypeFormData2 = new FormData();
	    parameterTypeFormData2.left = new FormAttachment(60, 0);
	    parameterTypeFormData2.right = new FormAttachment(80, 0);
	    parameterTypeFormData2.top = new FormAttachment(10, 0);
	    parameterTypeFormData2.bottom = new FormAttachment(20, 0);
	    valueText = new Text(main, SWT.SINGLE | SWT.BORDER);
	    valueText.setLayoutData(parameterTypeFormData2);
 
	     FormData setValueFormData = new FormData();
	     setValueFormData.left = new FormAttachment(60, 0);
	     setValueFormData.right = new FormAttachment(80, 0);
	     setValueFormData.top = new FormAttachment(60, 0);
	     setValueFormData.bottom = new FormAttachment(70, 0);
	     Button setValueButton = new Button(main, SWT.PUSH);
	     setValueButton.setText("Set value");
	     setValueButton.addListener(SWT.Selection, new Listener()
	     {
	    	 public void handleEvent(Event event)
	    	 {
	    		 setValue();
	    	 }
		});
	     setValueButton.setLayoutData(setValueFormData);
	     
	     FormData createSynchronizationFormData = new FormData();
	     createSynchronizationFormData.left = new FormAttachment(60, 0);
	     createSynchronizationFormData.right = new FormAttachment(80, 0);
	     createSynchronizationFormData.top = new FormAttachment(80, 0);
	     createSynchronizationFormData.bottom = new FormAttachment(90, 0);
	     Button createSynchronizationButton = new Button(main, SWT.PUSH);
	     createSynchronizationButton.setText("Create Raised event");
	     createSynchronizationButton.addListener(SWT.Selection, new Listener()
	     {
	    	 public void handleEvent(Event event)
	    	 {
	    		 if(allParametersHaveValues()){
	    			 startCreateRaisedEventCommand();
	    		 }
	    	 }
		});
	     createSynchronizationButton.setLayoutData(createSynchronizationFormData);

	}  

	private void updateValue(){
	      ISelection selection = parameterLViewer.getSelection();

      	  MessageType messageType = ((ModifyRaisedEventWizard)getWizard()).getSelectedMessageType();
      	  
	      if(selection instanceof IStructuredSelection)
		  {
	    	  IStructuredSelection sel = (IStructuredSelection) selection;

	    	  for (Object obj : sel.toList()) {
	    		  Iterator<EParameter> iter = messageType.getContainedParameters().iterator();
	    		  while(iter.hasNext()){
	    			  EParameter parameter = iter.next();
	    			  if(getFullParameterName(parameter).equals(obj.toString())){
	    				  selectedEParameter=parameter;
	    				  if(parameterValuesHashMap.get(selectedEParameter)!=null){
	    					  valueText.setText(parameterValuesHashMap.get(selectedEParameter));
	    				  }
	    				  else{
	    					  valueText.setText("");
	    				  }
	    			  }
	    		  }
	    	  }
		  }
	}
	
	private void startCreateRaisedEventCommand(){
		
		CreateElementRequest request = new CreateElementRequest(((ModifyRaisedEventWizard)getWizard()).getSelectedTransition(),
				MumlElementTypes.DoEvent_3002);
						  
					RaisedEventCreateCommand command = new RaisedEventCreateCommand(request, 
							parameterValuesHashMap,
							((ModifyRaisedEventWizard)getWizard()).getSelectedMessageType());
			
					new ICommandProxy(command).execute();
					setPageComplete(true);
	}
	
}
