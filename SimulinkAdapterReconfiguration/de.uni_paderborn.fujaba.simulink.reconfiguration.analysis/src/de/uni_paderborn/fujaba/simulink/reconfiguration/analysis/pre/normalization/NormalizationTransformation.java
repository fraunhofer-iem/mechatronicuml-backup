package de.uni_paderborn.fujaba.simulink.reconfiguration.analysis.pre.normalization;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.component.AssemblyConnector;
import de.uni_paderborn.fujaba.muml.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.component.ComponentFactory;
import de.uni_paderborn.fujaba.muml.component.DelegationConnector;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.reconfiguration.Executor;
import de.uni_paderborn.fujaba.muml.reconfiguration.Manager;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPort;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortAssemblyConnector;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortDelegationConnector;
import de.uni_paderborn.fujaba.muml.valuetype.Cardinality;
import de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory;

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
		port.setAdaptationBehavior(rePort.getAdaptationBehavior());
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
