package org.muml.simulink.adapter.reconfiguration.analysis.pre.reach.state;

import org.muml.pim.component.AtomicComponent;
import org.muml.pim.component.ComponentFactory;
import org.muml.pim.component.ComponentKind;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.component.Port;
import org.muml.pim.instance.AtomicComponentInstance;
import org.muml.pim.instance.DiscretePortInstance;
import org.muml.pim.instance.InstanceFactory;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.msgtype.MessageTypeRepository;
import org.muml.pim.msgtype.MsgtypeFactory;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pim.valuetype.NaturalNumber;
import org.muml.pim.valuetype.ValuetypeFactory;
import org.muml.reconfiguration.Executor;
import org.muml.reconfiguration.ReconfigurationExecutionPort;
import org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry;

/**
 * Generator for the structure of a State. Generates both types and instances.
 */
public class StateStructureGenerator 
{
	static final ComponentFactory 	typefactory 		= ComponentFactory.eINSTANCE;
	static final InstanceFactory 	instancefactory 	= InstanceFactory.eINSTANCE;
	static final ValuetypeFactory	valuefactory 		= ValuetypeFactory.eINSTANCE;
	static final MsgtypeFactory 	msgtypefactory 		= MsgtypeFactory.eINSTANCE; 
	
			
	/**
	 * Generate the Component for the State
	 */
	public AtomicComponent generateStateType(RealtimeStatechart behavior, String name, MessageTypeRepository msgTypes, Executor executorComp)
	{
		AtomicComponent state = typefactory.createStaticAtomicComponent();
		state.setComponentKind(ComponentKind.SOFTWARE_COMPONENT);
		state.setName("State_" + name);
		state.setBehavior(behavior);
		
		DiscretePort executor = typefactory.createDiscretePort();
		executor.setName("executor");
		executor.setComponent(state);
		executor.setBehavior(behavior.getStates().get(0).getEmbeddedRegions().get(0).getEmbeddedStatechart());
		
		for(MessageType msgType: msgTypes.getMessageTypes())
		{
			if(StateGenerator.MSGTYPE_FINISHED.equals(msgType.getName()))
				executor.getSenderMessageTypes().add(msgType);
			else if(StateGenerator.MSGTYPE_SETUP.equals(msgType.getName()))
				executor.getReceiverMessageTypes().add(msgType);
			else if(StateGenerator.MSGTYPE_FADING.equals(msgType.getName()))
				executor.getReceiverMessageTypes().add(msgType);
			else if(StateGenerator.MSGTYPE_TEARDOWN.equals(msgType.getName()))
				executor.getReceiverMessageTypes().add(msgType);
		}
		
		//Add ReconfigurationMessages
		for(ReconfigurationExecutionPort rePort: executorComp.getReconfigurationExecutionPorts())
			for(ReconfigurationExecutionPortInterfaceEntry entry: rePort.getInterfaceEntries())
				executor.getReceiverMessageTypes().add(entry.getMessageType());
		
		Cardinality executorCardinality = valuefactory.createCardinality();
		NaturalNumber lowerBound = valuefactory.createNaturalNumber();
		lowerBound.setValue(0);
		NaturalNumber upperBound = valuefactory.createNaturalNumber();
		upperBound.setValue(1);		
		executorCardinality.setLowerBound(lowerBound);
		executorCardinality.setUpperBound(upperBound);
		executor.setCardinality(executorCardinality);
		
		return state;
	}
	
	/**
	 * Generate a ComponentInstance for a given State Component
	 */
	public AtomicComponentInstance generateStateInstance(AtomicComponent type)
	{
		AtomicComponentInstance state = instancefactory.createAtomicComponentInstance();
		state.setComponentType(type);
		state.setName("State");
		
		DiscretePortInstance executor =  instancefactory.createDiscreteSinglePortInstance();
		executor.setName("executor");
		executor.setComponentInstance(state);
		for(Port port: type.getPorts())
			if(executor.getName().equals(port.getName()))
				executor.setType(port);
		
		return state;		
	}
}
