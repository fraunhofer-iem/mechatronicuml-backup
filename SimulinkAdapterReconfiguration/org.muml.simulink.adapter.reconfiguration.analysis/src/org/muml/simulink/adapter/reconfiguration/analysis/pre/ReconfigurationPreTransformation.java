package org.muml.simulink.adapter.reconfiguration.analysis.pre;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.muml.mumlcore.modelinstance.ModelElementCategory;
import org.muml.mumlcore.modelinstance.RootNode;
import org.muml.pim.component.AssemblyConnector;
import org.muml.pim.component.AtomicComponent;
import org.muml.pim.component.Component;
import org.muml.pim.component.ComponentFactory;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.component.DelegationConnector;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.component.Port;
import org.muml.pim.component.PortConnector;
import org.muml.pim.component.PortPart;
import org.muml.pim.connector.Connector;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pim.instance.AtomicComponentInstance;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.DiscreteSinglePortInstance;
import org.muml.pim.instance.InstanceFactory;
import org.muml.pim.instance.PortConnectorInstance;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.instance.StructuredComponentInstance;
import org.muml.reconfiguration.Executor;
import org.muml.reconfiguration.Manager;
import org.muml.reconfiguration.ReconfigurableStructuredComponent;
import org.muml.reconfiguration.ReconfigurationPort;
import org.muml.reconfiguration.ReconfigurationPortAssemblyConnector;
import org.muml.reconfiguration.ReconfigurationPortDelegationConnector;
import org.muml.simulink.adapter.reconfiguration.analysis.pre.normalization.NormalizationTransformation;

/**
 * Normalizes all reconfigurable elements to 'normal' elements.
 * Transforms:
 * 	1. Manager to AtomicComponent
 * 	2. Executor to AtomicComponent
 *  3. ReconfigurationExecutionPort to DiscretePort
 *  4. ReconfigurationMessagePort to DiscretePort
 *  5. ReconfigurationPortAssemblyConnector to AssemblyConnector
 *  6. ReconfigurationPortDelegationConnector to DelegationConnector
 */
public class ReconfigurationPreTransformation 
{	
	
	private RootNode model = null;
	private NormalizationTransformation t = new NormalizationTransformation();
	
	public ReconfigurationPreTransformation(RootNode model)
	{
		this.model = model;
	}
	
	/**
	 * Normalizes all components, ports, and connectors
	 */
	public void transform(ComponentInstanceConfiguration configuration)
	{
		//Collect instances
		List<StructuredComponentInstance> instances = new LinkedList<StructuredComponentInstance>();		
		for(TreeIterator<EObject> it=configuration.eAllContents(); it.hasNext();)
		{
			EObject object = it.next();
			if(object instanceof StructuredComponentInstance)
				instances.add((StructuredComponentInstance) object);
		}
		
		//1. Transform Manager/Executor
		for(StructuredComponentInstance instance: instances)
			this.normalizeManagerExecutor(instance);
		
		//2. Transform Ports
		for(StructuredComponentInstance instance: instances)
			this.normalizePorts(instance);
		
		//3. Transform Connections
		for(StructuredComponentInstance instance: instances)
			this.normalizeConnectors(instance);		
	}
	
	/**
	 * Normalize all connectors inside a component
	 */
	private void normalizeConnectors(StructuredComponentInstance instance) 
	{		
		ReconfigurableStructuredComponent component = (ReconfigurableStructuredComponent) instance.getComponentType();
		
		//Map connections
		LinkedList<PortConnector> newConn = new LinkedList<PortConnector>();
		for(Connector conn: component.getConnectors())
		{
			if(conn instanceof ReconfigurationPortDelegationConnector)
				newConn.add(t.mapReconfigurationPortDelegationConnector2DelegationConnector((ReconfigurationPortDelegationConnector) conn));
			else if(conn instanceof ReconfigurationPortAssemblyConnector)
				newConn.add(t.mapReconfigurationPortAssemblyConnector2AssemblyConnector((ReconfigurationPortAssemblyConnector) conn));
		}
		component.getConnectors().addAll(newConn);
		
		//Create connections in instance
		AtomicComponentInstance managerInst = this.getManagerInstance(instance);
		AtomicComponentInstance executorInst = this.getExecutorInstance(instance);
		this.injectConnectorsIntoInstance(newConn, instance, managerInst, executorInst);
		
	}

	/**
	 * Returns the embedded instance of the manager atomic component
	 */
	private AtomicComponentInstance getManagerInstance(StructuredComponentInstance instance) 
	{
		ReconfigurableStructuredComponent component = (ReconfigurableStructuredComponent) instance.getComponentType();
		AtomicComponent manager = (AtomicComponent) this.t.getMapping(component.getManager());
		for(ComponentInstance embedded: instance.getEmbeddedCIC().getComponentInstances())
			if(embedded.getComponentType() == manager)
				return (AtomicComponentInstance) embedded;
		throw new IllegalArgumentException("No Manager Instance found in " + instance);
	}
	
	/**
	 * Returns the embedded instance of the executor atomic component
	 */
	private AtomicComponentInstance getExecutorInstance(StructuredComponentInstance instance) 
	{
		ReconfigurableStructuredComponent component = (ReconfigurableStructuredComponent) instance.getComponentType();
		AtomicComponent executor = (AtomicComponent) this.t.getMapping(component.getExecutor());
		for(ComponentInstance embedded: instance.getEmbeddedCIC().getComponentInstances())
			if(embedded.getComponentType() == executor)
				return (AtomicComponentInstance) embedded;
		throw new IllegalArgumentException("No Executor Instance found in " + instance);
	}	

	/**
	 * Normalize all ports
	 */
	private void normalizePorts(StructuredComponentInstance instance) 
	{
		Component component = instance.getComponentType();		
		//Map ports
		LinkedList<DiscretePort> newPorts = new LinkedList<DiscretePort>();
		for(Port port:component.getPorts())
			if(port instanceof ReconfigurationPort)
				newPorts.add(t.mapReconfigurationPort2DiscretePort((ReconfigurationPort) port));
		component.getPorts().addAll(newPorts);
		this.injectPortsIntoInstance(newPorts, instance);
	}

	/**
	 * Normalize manager and executor
	 */
	private void normalizeManagerExecutor(StructuredComponentInstance instance) 
	{				
		ReconfigurableStructuredComponent component = (ReconfigurableStructuredComponent) instance.getComponentType();
		
		if(component.getManager() == null && component.getExecutor() == null)
			return;		
		
		if(component.getManager().getBehavior() == null && component.getExecutor().getBehavior() == null)
			return;				
		
		if(component.getManager() != null)
			this.normalizeManager(instance, component, component.getManager());
		if(component.getExecutor() != null)
			this.normalizeExecutor(instance, component, component.getExecutor());
		
		//Connect State<->Executor
		AtomicComponentInstance executorInst = this.getExecutorInstance(instance);
		AtomicComponentInstance stateInst = (AtomicComponentInstance) this.getEmbeddedInstanceByName("State", instance);
		AssemblyConnectorInstance stateExecutorInst = InstanceFactory.eINSTANCE.createAssemblyConnectorInstance();
		stateExecutorInst.getConnectorEndpointInstances().add(this.getEndPointInstanceByName("executor", stateInst.getPortInstances()));
		stateExecutorInst.getConnectorEndpointInstances().add(this.getEndPointInstanceByName("state", executorInst.getPortInstances()));
		instance.getEmbeddedCIC().getPortConnectorInstances().add(stateExecutorInst);		
		
	}
	
	/**
	 * Returns the embedded instance with the given name
	 */
	private ComponentInstance getEmbeddedInstanceByName(String name, StructuredComponentInstance instance) 
	{
		for(ComponentInstance embedd: instance.getEmbeddedCIC().getComponentInstances())
			if(name.equals(embedd.getName()))
				return (ComponentInstance) embedd;
		throw new IllegalArgumentException("No embedded instance for " + name);
	}
	
	/**
	 * Returns the port with the given name
	 */
	private ConnectorEndpointInstance getEndPointInstanceByName(String name, EList<PortInstance>  ports )
	{
		for(PortInstance port: ports)
			if(name.equals(port.getName()))
				return port;
		throw new IllegalArgumentException("No endpoint instance for " + name);
	}

	/**
	 * Normalize the manager
	 */
	private AtomicComponentInstance normalizeManager(StructuredComponentInstance instance, ReconfigurableStructuredComponent component, Manager manager) 
	{
		//1. Create Atomic Component	
		AtomicComponent atomComp = t.mapManager2AtomicComponent(manager);		
		((ModelElementCategory)component.eContainer()).getModelElements().add(atomComp);
		atomComp.setName(atomComp.getName() + "_" + component.getName());
				
		//2. Inject into Component
		ComponentPart atomPart = this.injectIntoComponent(atomComp, component);
		
		//3. Inject into instance
		return this.injectIntoInstance(atomPart, instance);
	}	
	
	/**
	 * Normalize the executor
	 */
	private AtomicComponentInstance normalizeExecutor(StructuredComponentInstance instance, ReconfigurableStructuredComponent component, Executor executor) 
	{
		//1. Create Atomic Component	
		AtomicComponent atomComp = t.mapExecutor2AtomicComponent(executor);		
		((ModelElementCategory)component.eContainer()).getModelElements().add(atomComp);
		atomComp.setName(atomComp.getName() + "_" + component.getName());
				
		//2. Inject into Component
		ComponentPart atomPart = this.injectIntoComponent(atomComp, component);
		
		//3. Inject into instance
		return this.injectIntoInstance(atomPart, instance);
	}		
	
	/**
	 * Inject the given atomic component into the given structured component. Creates a ComponentPart
	 * and references the atomic component.
	 */
	private ComponentPart injectIntoComponent(AtomicComponent atomComp, ReconfigurableStructuredComponent component)
	{		
		ComponentPart atomPart = ComponentFactory.eINSTANCE.createComponentPart();
		atomPart.setCardinality(t.cardinality(1, 1));
		atomPart.setComponentType(atomComp);
		atomPart.setName(atomComp.getName());
		component.getEmbeddedComponentParts().add(atomPart);
		
		//Create PortParts
		for(Port port: atomComp.getPorts())
		{
			PortPart portPart = ComponentFactory.eINSTANCE.createPortPart();		
			portPart.setComponentPart(atomPart);
			portPart.setPortType(port);
		}		
		
		return atomPart;
	}
	
	/**
	 * Inject the given ComponentPart into the given structured component instance.
	 */
	private AtomicComponentInstance injectIntoInstance(ComponentPart atomPart, StructuredComponentInstance instance)
	{
		AtomicComponentInstance atomInst = InstanceFactory.eINSTANCE.createAtomicComponentInstance();
		atomInst.setComponentType(atomPart.getComponentType());
		atomInst.setComponentPart(atomPart);
		atomInst.setName(atomPart.getName());
		for(Port port: atomPart.getComponentType().getPorts())
		{
			DiscreteSinglePortInstance portInst = InstanceFactory.eINSTANCE.createDiscreteSinglePortInstance();
			portInst.setType(port);
			portInst.setName(port.getName());
			atomInst.getPortInstances().add(portInst);
		}
		instance.getEmbeddedCIC().getComponentInstances().add(atomInst);
		return atomInst;
	}
	
	/**
	 * Inject instances the given ports into the given instance
	 */
	private void injectPortsIntoInstance(List<DiscretePort> ports, StructuredComponentInstance instance)
	{
		for(DiscretePort port: ports)
		{
			DiscreteSinglePortInstance inst = InstanceFactory.eINSTANCE.createDiscreteSinglePortInstance();
			inst.setName(port.getName());
			inst.setType(port);
			inst.setComponentInstance(instance);
		}
	}
	
	/**
	 * Inject instances for the given connectors into the given instance
	 */
	private void injectConnectorsIntoInstance(List<PortConnector> connectors, StructuredComponentInstance instance, AtomicComponentInstance managerInst, AtomicComponentInstance executorInst)
	{
		for(PortConnector conn: connectors)
		{			
			PortConnectorInstance inst = null;
			if(conn instanceof AssemblyConnector)
				inst = InstanceFactory.eINSTANCE.createAssemblyConnectorInstance();
			if(conn instanceof DelegationConnector)
				inst = InstanceFactory.eINSTANCE.createDelegationConnectorInstance();
			
			inst.setType(conn);
			instance.getEmbeddedCIC().getPortConnectorInstances().add(inst);
			for(ConnectorEndpoint end: conn.getConnectorEndpoints())
			{ 
				ComponentInstance targetInst = instance;
				String name = "";
				if(end instanceof DiscretePort)
				{
					DiscretePort dp = (DiscretePort) end;	
					name = dp.getName();
					if(dp.getComponent() == managerInst.getComponentType())
						targetInst = managerInst;
					else if(dp.getComponent() == executorInst.getComponentType())
						targetInst = executorInst;
				}
				else if(end instanceof PortPart)
				{
					PortPart pp = (PortPart) end;
					name = pp.getName();
				}
				inst.getConnectorEndpointInstances().add(this.getPortInstance(name, targetInst));
			}			
		}
		
	}

	/**
	 * Returns the port instance with the given name
	 */
	private DiscreteSinglePortInstance getPortInstance(String name, ComponentInstance instance)
	{
		for(PortInstance port: instance.getPortInstances())
		{
			if(name.equals(port.getName()))
				return (DiscreteSinglePortInstance) port;
		}
		
		//Find embedded ports
		if(instance instanceof StructuredComponentInstance)
		{
			StructuredComponentInstance struInst = (StructuredComponentInstance) instance;
			for(ComponentInstance embeddedInst: struInst.getEmbeddedCIC().getComponentInstances())
			{
				for(PortInstance port: embeddedInst.getPortInstances())
				{
					if(name.equals(port.getName()))
						return (DiscreteSinglePortInstance) port;
				}				
			}			
		}
		throw new IllegalArgumentException("No PortInstance found for name " + name);
	}
}
