package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.wizards;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
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

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;

public class ModifySynchronizationPage1 extends CommonModifyPage{
	
	protected Combo synchronizationTypeCombo = null;
	
	protected ListViewer syncChannelLViewer = null;
	
	boolean isChannelSelected = false;
	boolean isTypeSelected = false;
 
	public ModifySynchronizationPage1(String pageName)
	{
		super(pageName);
	}
	
	@Override
	public void setVisible(boolean visible) {

		if (visible)
    	{
			setPageComplete(false);
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
	    parameterNameFormData1.right = new FormAttachment(40, 0);
	    parameterNameFormData1.top = new FormAttachment(0, 0);
	    parameterNameFormData1.bottom = new FormAttachment(10, 0);
	    Label pNameLabel = new Label(main, SWT.NONE);
	    pNameLabel.setText("Available synchronization channels:\n" +
	    		"help :- choose via double click");
	    pNameLabel.setLayoutData(parameterNameFormData1);
	    
	    FormData syncChannelLViewerFormData = new FormData();
	    syncChannelLViewerFormData.left = new FormAttachment(0, 0);
	    syncChannelLViewerFormData.right = new FormAttachment(40, 0);
	    syncChannelLViewerFormData.top = new FormAttachment(10, 0);
	    syncChannelLViewerFormData.bottom = new FormAttachment(80, 0);
	    Composite syncChannelViewerComposite = new Composite(main, SWT.NONE);
	    syncChannelViewerComposite.setLayout(new FillLayout());
	    syncChannelViewerComposite.setLayoutData(syncChannelLViewerFormData);
	    syncChannelLViewer = new ListViewer(syncChannelViewerComposite);
	    syncChannelLViewer.setContentProvider(new SynchronizationChannelContentProvider());
	    syncChannelLViewer.setInput(((ModifySynchronizationWizard)getWizard()).getRealtimeStatechart());
	    syncChannelLViewer.addDoubleClickListener(new IDoubleClickListener()
		{
		  	public void doubleClick(DoubleClickEvent event)
		  	{
		  		setSelectedChannel();
		  		
		  		isChannelSelected=true;
				setPageComplete(isTypeSelected&&isChannelSelected);
		  	}
		  
		 });
	    
	    FormData parameterTypeFormData1 = new FormData();
	    parameterTypeFormData1.left = new FormAttachment(60, 0);
	    parameterTypeFormData1.right = new FormAttachment(80, 0);
	    parameterTypeFormData1.top = new FormAttachment(0, 0);
	    parameterTypeFormData1.bottom = new FormAttachment(10, 0);
	    Label parameterTypeLabel = new Label(main, SWT.NONE);
	    parameterTypeLabel.setText("SynchronizationType:  ");
	    parameterTypeLabel.setLayoutData(parameterTypeFormData1);
	   
	    FormData parameterTypeFormData2 = new FormData();
	    parameterTypeFormData2.left = new FormAttachment(60, 0);
	    parameterTypeFormData2.right = new FormAttachment(80, 0);
	    parameterTypeFormData2.top = new FormAttachment(10, 0);
	    parameterTypeFormData2.bottom = new FormAttachment(20, 0);
	    synchronizationTypeCombo = new Combo(main, SWT.SINGLE | SWT.BORDER);
	    synchronizationTypeCombo.setLayoutData(parameterTypeFormData2);
	    synchronizationTypeCombo.addSelectionListener(new SelectionListener()
	    {
	    	 public void widgetSelected(SelectionEvent event)
	    	 {
	    			int selection = synchronizationTypeCombo.getSelectionIndex();
	    			if(selection>=0)
	    			{
	    				setSelectedSynchronizationType();
	    				
	    				isTypeSelected=true;
	    				setPageComplete(isTypeSelected&&isChannelSelected);
	    			}
	    	 }
	    	 
	    	 public void widgetDefaultSelected(SelectionEvent event)
	    	 {

	    	 }
	      });
	    
	    instanciateSynchronizationCombo();
    	    
	     FormData deleteButtonFormData = new FormData();
	     deleteButtonFormData.left = new FormAttachment(60, 0);
	     deleteButtonFormData.right = new FormAttachment(80, 0);
	     deleteButtonFormData.top = new FormAttachment(80, 0);
	     deleteButtonFormData.bottom = new FormAttachment(90, 0);
	     Button deleteButton = new Button(main, SWT.PUSH);
	     deleteButton.setText("Delete Synchronization");
	     deleteButton.addListener(SWT.Selection, new Listener()
	     {
	    	 public void handleEvent(Event event)
	    	 {
	    		 handleDeleteSynchronizationEvent();
	    		 syncChannelLViewer.refresh();
	    	 }
		});
	     deleteButton.setLayoutData(deleteButtonFormData);		     

	}  
	
	
	private void handleDeleteSynchronizationEvent(){
		Transition transition = ((ModifySynchronizationWizard)getWizard()).getSelectedTransition();
		
		Synchronization event = transition.getSynchronization();

		if(event!=null){
			deleteObject(event);
		}
	}
	
	
	public Object[] getSynchronizationChannels(Object object)
	{
        if (object instanceof FujabaRealtimeStatechart)
        {
        	FujabaRealtimeStatechart statechart = (FujabaRealtimeStatechart)object;
        	ArrayList<String> list = new ArrayList<String>();
        	
        	if(statechart.getEmbeddingRegion()!=null && statechart.getEmbeddingRegion().getParentState() !=null){
        		Iterator<SynchronizationChannel> iter = statechart.getEmbeddingRegion().getParentState().getChannels().iterator();
        		while(iter.hasNext()){
        			SynchronizationChannel s = iter.next();
        			list.add(toMyString(s));
        		}
        		return list.toArray();
        	}
        }
		
        return new Object[0];
	}	
	
	class SynchronizationChannelContentProvider implements IStructuredContentProvider
	{
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput){}
		
		public Object[] getElements(Object parent)
		{
			return getSynchronizationChannels(parent);
		}
			
		public void dispose(){}
		   
	}

	
	private void instanciateSynchronizationCombo(){			
		synchronizationTypeCombo.add("send");
		synchronizationTypeCombo.add("receive");
	}
	
	private void setSelectedChannel(){
		
	      ISelection selection = syncChannelLViewer.getSelection();

      	  FujabaRealtimeStatechart statechart = ((ModifySynchronizationWizard)getWizard()).getRealtimeStatechart();
      	  
	      if(selection instanceof IStructuredSelection)
		  {
	    	  IStructuredSelection sel = (IStructuredSelection) selection;

	    	  for (Object obj : sel.toList()) {
	          	
	    		  if(statechart.getEmbeddingRegion()!=null && statechart.getEmbeddingRegion().getParentState() !=null){
	        		Iterator<SynchronizationChannel> iter = statechart.getEmbeddingRegion().getParentState().getChannels().iterator();
	        		while(iter.hasNext()){
	        			SynchronizationChannel s = iter.next();
	        			
	        			if(toMyString(s).equals(obj.toString())){
	        				((ModifySynchronizationWizard)getWizard()).setSelectedSynchronizationChannel(s);
	        				break;
	        			}
	        		}
	        	}
	    	  }
		  }	
	}
	
	private String toMyString(Object o) {
		return o.toString();
	}

	private void setSelectedSynchronizationType(){
	      
		String typeString = synchronizationTypeCombo.getItem(synchronizationTypeCombo.getSelectionIndex());
		((ModifySynchronizationWizard)getWizard()).setSelectedSynchronizationType(typeString);
	}
}
