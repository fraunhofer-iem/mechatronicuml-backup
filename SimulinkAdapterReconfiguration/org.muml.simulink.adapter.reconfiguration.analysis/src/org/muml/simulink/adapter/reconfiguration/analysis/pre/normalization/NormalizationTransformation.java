package org.muml.simulink.adapter.reconfiguration.analysis.pre.normalization;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.muml.pim.component.AssemblyConnector;
import org.muml.pim.component.AtomicComponent;
import org.muml.pim.component.ComponentFactory;
import org.muml.pim.component.DelegationConnector;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pim.valuetype.NaturalNumber;
import org.muml.pim.valuetype.ValuetypeFactory;
import org.muml.reconfiguration.Executor;
import org.muml.reconfiguration.Manager;
import org.muml.reconfiguration.ReconfigurationPort;
import org.muml.reconfiguration.ReconfigurationPortAssemblyConnector;
import org.muml.reconfiguration.ReconfigurationPortDelegationConnector;

public class NormalizationTransformation 
{
	private HashMap<EObject, EObject> mapping = new HashMap<EObject, EObject>();
	/**
	 * Creates a Cardinality
	 */
	public Cardinality cardinality(long lower, long upper)
	{
		Cardinality cardinality = ValuetypeFactory.eINSTANCE.createCardinality();
		
		NaturalNumber lowerNumber = ValuetypeFactory.eINSTANCE.createNaturalNumber();
		lowerNumber.setValue(lower);
		cardinality.setLowerBound(lowerNumber);
		
		NaturalNumber upperNumber = ValuetypeFactory.eINSTANCE.createNaturalNumber();
		upperNumber.setValue(upper);	
		cardinality.setUpperBound(upperNumber);
		
		return cardinality;
	}
	
	/**
	 * Create DiscretePort from ReconfigurationPort
	 */
	public DiscretePort mapReconfigurationPort2DiscretePort(ReconfigurationPort rePort)
	{
		DiscretePort port = ComponentFactory.eINSTANCE.createDiscretePort();
		port.setCardinality(rePort.getCardinality());
		port.setName(rePort.getName());
		port.setBehavior(rePort.getBehavior());
		port.setCoordinatorBehavior(rePort.getCoordinatorBehavior());
		port.getReceiverMessageBuffer().addAll(rePort.getReceiverMessageBuffer());
		port.getReceiverMessageTypes().addAll(rePort.getReceiverMessageTypes());
		port.getSenderMessageTypes().addAll(rePort.getSenderMessageTypes());
				
		this.setMapping(rePort, port);
		
		return port;
	}
	
	/**
	 * Create DelegationConnector from ReconfigurationPortDelegationConnector
	 */
	public DelegationConnector mapReconfigurationPortDelegationConnector2DelegationConnector(ReconfigurationPortDelegationConnector reConn)
	{
		DelegationConnector conn = ComponentFactory.eINSTANCE.createDelegationConnector();
		conn.setComment(reConn.getComment());
		
		for(ConnectorEndpoint end: reConn.getConnectorEndpoints())
			conn.getConnectorEndpoints().add((ConnectorEndpoint) this.getMapping(end));		
		
		this.setMapping(reConn, conn);
		return conn;
	}
	
	/**
	 * Create DelegationConnector from ReconfigurationPortDelegationConnector
	 */
	public AssemblyConnector mapReconfigurationPortAssemblyConnector2AssemblyConnector(ReconfigurationPortAssemblyConnector reConn)
	{
		AssemblyConnector conn = ComponentFactory.eINSTANCE.createAssemblyConnector();
		conn.setComment(reConn.getComment());
		
		for(ConnectorEndpoint end: reConn.getConnectorEndpoints())
		{
			if(end instanceof ReconfigurationPort)
				conn.getConnectorEndpoints().add((ConnectorEndpoint) this.getMapping(end));
			else
				conn.getConnectorEndpoints().add(end);
		}
		
		this.setMapping(reConn, conn);
		return conn;
	}	
	
	/**
	 * Create AtomicComponent from Manager
	 */
	public AtomicComponent mapManager2AtomicComponent(Manager manager)
	{
		//1. Create Atomic Component
		AtomicComponent atomComp = ComponentFactory.eINSTANCE.createStaticAtomicComponent();
		atomComp.setName("Manager");
		
		//2. Create Ports
		for(ReconfigurationPort rePort: manager.getPorts())
			atomComp.getPorts().add(mapReconfigurationPort2DiscretePort(rePort));			
				
		//3. Move Behavior
		atomComp.setBehavior(manager.getBehavior());
		
		this.setMapping(manager, atomComp);
		
		return atomComp;
	}
	
	/**
	 * Create AtomicComponent from Executor
	 */
	public AtomicComponent mapExecutor2AtomicComponent(Executor executor)
	{
		//1. Create Atomic Component
		AtomicComponent atomComp = ComponentFactory.eINSTANCE.createStaticAtomicComponent();
		atomComp.setName("Executor");
		
		//2. Create Ports
		for(ReconfigurationPort rePort: executor.getPorts())
			atomComp.getPorts().add(mapReconfigurationPort2DiscretePort(rePort));			
				
		//3. Move Behavior
		atomComp.setBehavior(executor.getBehavior());
		
		this.setMapping(executor, atomComp);
		
		return atomComp;
	}	
	
	public EObject getMapping(EObject source)
	{
		if(this.mapping.containsKey(source))
			return this.mapping.get(source);
		throw new IllegalArgumentException("No mapping for " + source);
	}
	
	protected void setMapping(EObject source, EObject target)
	{
		this.mapping.put(source, target);
	}

}
