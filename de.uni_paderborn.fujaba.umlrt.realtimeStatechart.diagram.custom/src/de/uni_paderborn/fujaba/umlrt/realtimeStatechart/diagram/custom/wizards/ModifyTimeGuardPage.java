package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.wizards;

import java.util.Iterator;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EParameter;
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

public class ModifyTimeGuardPage extends CommonModifyPage{
	
	protected Text value = null;
	protected Combo operator = null;
	protected Combo clock = null;
	
	protected ListViewer timeGuardLViewer = null;
 
	public ModifyTimeGuardPage(String pageName)
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
	    
	    FormData clockFormData1 = new FormData();
	    clockFormData1.left = new FormAttachment(0, 0);
	    clockFormData1.right = new FormAttachment(20, 0);
	    clockFormData1.top = new FormAttachment(0, 0);
	    clockFormData1.bottom = new FormAttachment(10, 0);
	    Label clockTypeLabel = new Label(main, SWT.NONE);
	    clockTypeLabel.setText("Clock:  ");
	    clockTypeLabel.setLayoutData(clockFormData1);
	   
	    FormData clockFormData2 = new FormData();
	    clockFormData2.left = new FormAttachment(0, 0);
	    clockFormData2.right = new FormAttachment(20, 0);
	    clockFormData2.top = new FormAttachment(10, 0);
	    clockFormData2.bottom = new FormAttachment(20, 0);
	    clock = new Combo(main, SWT.SINGLE | SWT.BORDER);
	    clock.setLayoutData(clockFormData2);
	    
	    instanciateClockCombo();
	    	    
	    FormData operatorFormData1 = new FormData();
	    operatorFormData1.left = new FormAttachment(0, 0);
	    operatorFormData1.right = new FormAttachment(20, 0);
	    operatorFormData1.top = new FormAttachment(20, 0);
	    operatorFormData1.bottom = new FormAttachment(30, 0);
	    Label operatorTypeLabel = new Label(main, SWT.NONE);
	    operatorTypeLabel.setText("Operator:  ");
	    operatorTypeLabel.setLayoutData(operatorFormData1);
	   
	    FormData operatorFormData2 = new FormData();
	    operatorFormData2.left = new FormAttachment(0, 0);
	    operatorFormData2.right = new FormAttachment(20, 0);
	    operatorFormData2.top = new FormAttachment(30, 0);
	    operatorFormData2.bottom = new FormAttachment(40, 0);
	    operator = new Combo(main, SWT.SINGLE | SWT.BORDER);
	    operator.setLayoutData(operatorFormData2);
	    
	    instanciateOperatorCombo();
	    
	    FormData valueFormData1 = new FormData();
	    valueFormData1.left = new FormAttachment(0, 0);
	    valueFormData1.right = new FormAttachment(20, 0);
	    valueFormData1.top = new FormAttachment(40, 0);
	    valueFormData1.bottom = new FormAttachment(50, 0);
	    Label valueLabel = new Label(main, SWT.NONE);
	    valueLabel.setText("Value:  ");
	    valueLabel.setLayoutData(valueFormData1);
	    
	    FormData ValueFormData2 = new FormData();
	    ValueFormData2.left = new FormAttachment(0, 0);
	    ValueFormData2.right = new FormAttachment(20, 0);
	    ValueFormData2.top = new FormAttachment(50, 0);
	    ValueFormData2.bottom = new FormAttachment(60, 0);
	    value = new Text(main, SWT.SINGLE | SWT.BORDER); 
	    value.setLayoutData(ValueFormData2);
	    
	    FormData exitingParameterFormData = new FormData();
	    exitingParameterFormData.left = new FormAttachment(40, 0);
	    exitingParameterFormData.right = new FormAttachment(80, 0);
	    exitingParameterFormData.top = new FormAttachment(0, 0);
	    exitingParameterFormData.bottom = new FormAttachment(20, 0);
	    Label exitingParameterLabel = new Label(main, SWT.NONE);
	    exitingParameterLabel.setText("Existing Time Guards of \n" +
	    		"selected transition: '"+ ((ModifyTimeGuardWizard)getWizard()).getSelectedTransition().getSource().getName()+"->"+
	    		((ModifyTimeGuardWizard)getWizard()).getSelectedTransition().getTarget().getName() +"'");
	    exitingParameterLabel.setLayoutData(exitingParameterFormData);
	    
	    FormData parameterLViewerFormData = new FormData();
	    parameterLViewerFormData.left = new FormAttachment(40, 0);
	    parameterLViewerFormData.right = new FormAttachment(90, 0);
	    parameterLViewerFormData.top = new FormAttachment(20, 0);
	    parameterLViewerFormData.bottom = new FormAttachment(90, 0);
	    Composite parametersViewerComposite = new Composite(main, SWT.NONE);
	    parametersViewerComposite.setLayout(new FillLayout());
	    parametersViewerComposite.setLayoutData(parameterLViewerFormData);
	    timeGuardLViewer = new ListViewer(parametersViewerComposite);
	    timeGuardLViewer.setContentProvider(new ParametersContentProvider());
	    timeGuardLViewer.setInput(((ModifyTimeGuardWizard)getWizard()).getSelectedTransition());
	    
	    FormData createButtonFormData = new FormData();
	    createButtonFormData.left = new FormAttachment(0, 0);
	    createButtonFormData.right = new FormAttachment(15, 0);
	    createButtonFormData.top = new FormAttachment(80, 0);
	    createButtonFormData.bottom = new FormAttachment(90, 0);
	    Button createButton = new Button(main, SWT.PUSH);
	    createButton.setText("Create Time Guard");
	    createButton.addListener(SWT.Selection, new Listener()
	    {
	    	public void handleEvent(Event event)
	    	{
	    		handleCreateParameterEvent();
	    		timeGuardLViewer.refresh();
	        }
	     });
	     createButton.setLayoutData(createButtonFormData);
	     
	     FormData deleteButtonFormData = new FormData();
	     deleteButtonFormData.left = new FormAttachment(20, 0);
	     deleteButtonFormData.right = new FormAttachment(35, 0);
	     deleteButtonFormData.top = new FormAttachment(80, 0);
	     deleteButtonFormData.bottom = new FormAttachment(90, 0);
	     Button deleteButton = new Button(main, SWT.PUSH);
	     deleteButton.setText("Delete Time Guard");
	     deleteButton.addListener(SWT.Selection, new Listener()
	     {
	    	 public void handleEvent(Event event)
	    	 {
	    		 handleDeleteParameterEvent();
	    		 timeGuardLViewer.refresh();
	    	 }
		});
	     deleteButton.setLayoutData(deleteButtonFormData);		     

	}  
	
	private void handleCreateParameterEvent(){
	  	  
//		if(!value.getText().equals("") && getSelectedDataType()!= null){
//			CreateElementRequest request = new CreateElementRequest(((ModifyParameterWizard)getWizard()).getSelectedSyncChannel(),
//					RealtimeStatechartElementTypes.Action_3024);
//							  
//						ParameterCreateCommand command = new ParameterCreateCommand(request, 
//								this.value.getText(), getSelectedDataType());
//				
//						new ICommandProxy(command).execute();
//		}
	}
	
	private void handleDeleteParameterEvent(){
		
	      ISelection selection = timeGuardLViewer.getSelection();

	      if(selection instanceof IStructuredSelection)
	      {
	    	  IStructuredSelection sel = (IStructuredSelection) selection;

	    	  for (Object obj : sel.toList()) {
//
//	    		  if(obj != null){
//	    			  
//	    			  Iterator<EParameter> iter = ((ModifyParameterWizard)getWizard()).
//	    			  	getSelectedSyncChannel().getContainedParameters().iterator();
//	    			  while(iter.hasNext()){
//	    				  EParameter tmp = iter.next();
//	    				  if(getFullParameterName(tmp).equals(obj.toString())){
//	    					  deleteObject(tmp);
//	    					  break;
//	    				  }
//	    			  }
//	    		  }
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
	
	private void instanciateClockCombo(){
//		if(getDataTypes()!=null){
//		
//			Iterator<EDataType> iter = getDataTypes().iterator();
//			while(iter.hasNext()){
//				EDataType dataType = iter.next();
//				
//				clock.add(dataType.getName());
//			}
//		}
	}
	
	private void instanciateOperatorCombo(){
//		if(getDataTypes()!=null){
//		
//			Iterator<EDataType> iter = getDataTypes().iterator();
//			while(iter.hasNext()){
//				EDataType dataType = iter.next();
//				
//				operator.add(dataType.getName());
//			}
//		}
	}	
}
