package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.wizards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.jface.wizard.WizardPage;

import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel;

public abstract class CommonModifyPage extends WizardPage{

	protected CommonModifyPage(String pageName) {
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
	
	protected List<EDataType> getDataTypes(){
		
		FujabaRealtimeStatechart statechart = ((CommonModifyWizard)getWizard()).getRealtimeStatechart();

		RootNode root = (RootNode)statechart.eContainer();
		
		return root.getEcoreDataTypes();
	}
	
	protected String getFullParameterName(EParameter parameter){
		return parameter.getName() +": "+parameter.getEType().getName();
	}

	protected void deleteObject(EObject obj){
		new ICommandProxy(new DestroyElementCommand(
			new DestroyElementRequest(obj, false))).execute();
	}
	
	public Object[] getParametersFromSynchronizationChannel(Object object)
	{
        if (object instanceof SynchronizationChannel)
        {
        	SynchronizationChannel syncChannel = (SynchronizationChannel)object;
        	ArrayList<String> list = new ArrayList<String>();
        	
        	if(syncChannel.getContainedParameters()!=null){
        		Iterator<EParameter> iter = syncChannel.getContainedParameters().iterator();
        		while(iter.hasNext()){
        			list.add(getFullParameterName(iter.next()));
        		}
        		return list.toArray();
        	}
        }
		
        return new Object[0];
	}
	
	
	public Object[] getParametersFromMessageType(Object object)
	{
        if (object instanceof MessageType)
        {
        	MessageType messageType = (MessageType)object;
        	ArrayList<String> list = new ArrayList<String>();
        	
        	if(messageType.getContainedParameters()!=null){
        		Iterator<EParameter> iter = messageType.getContainedParameters().iterator();
        		while(iter.hasNext()){
        			list.add(getFullParameterName(iter.next()));
        		}
        		return list.toArray();
        	}
        }
		
        return new Object[0];
	}	
}
