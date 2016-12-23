package org.muml.reconfigurationverification.timedstorychart.transform;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.common.LiteralExpression;
import org.muml.pim.behavior.Variable;
import org.muml.pim.protocol.Role;
import org.muml.pim.protocol.RoleConnector;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.State;
import org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;
import org.muml.verification.core.runtime.RoleInstance;
import org.muml.verification.core.runtime.RuntimeFactory;
import org.muml.verification.core.runtime.RuntimeMessageBuffer;
import org.muml.verification.core.runtime.VariableBinding;

public class GraphObjectsInitializer {

	/**
	 * Creates the initial graph objects and stores the necessary type graph objects in the tgts.
	 * @param connector
	 * @param tgts
	 * @return
	 */
	public void createRoleInstances(RoleConnector connector, TimedGraphTransformationSystem tgts){
		
		Role role1 = connector.getRoles().get(0);
		if(role1.isMultiRole()){
			createInstancesForRole(role1, tgts);
		} else {
			//store RTSC in type graph reference (has been copied)
			storeTypeGraphObject(role1.getBehavior(), tgts);
		}
		
		Role role2 = connector.getRoles().get(1);
		if(role2.isMultiRole()){
			createInstancesForRole(role2, tgts);
		} else {
			//store RTSC in type graph reference (has been copied)
			storeTypeGraphObject(role2.getBehavior(), tgts);
		}

		//add coordination protocol to type graph objects -> necessary for serializing the GtAutomaton
		storeTypeGraphObject(connector.getCoordinationProtocol(), tgts);
		
	}

	private void createInstancesForRole(Role role, TimedGraphTransformationSystem tgts) {
		RoleInstance roleInstance;
		roleInstance = RuntimeFactory.eINSTANCE.createMultiRoleInstance();

		RealtimeStatechartInstance realtimeStatechartInstanceAdaptation = RuntimeFactory.eINSTANCE.createRealtimeStatechartInstance();
		realtimeStatechartInstanceAdaptation.setInstanceOf((RealtimeStatechart) role.getCoordinatorBehavior());
		realtimeStatechartInstanceAdaptation.setActiveVertex(getInitialState((RealtimeStatechart) role.getCoordinatorBehavior()));
		storeInitialGraphObject(realtimeStatechartInstanceAdaptation, tgts);
		for(Variable var : role.getCoordinatorBehavior().getVariables()){
			VariableBinding varBinding = RuntimeFactory.eINSTANCE.createVariableBinding();
			
			Expression initializeExpression = var.getInitializeExpression();
			Object parsedValue = null;
			if(initializeExpression instanceof LiteralExpression){
				String value = ((LiteralExpression) initializeExpression).getValue();
				
				try{
					parsedValue = Integer.parseInt(value);
				}
				catch(NumberFormatException e1){
					try{
						parsedValue = Double.parseDouble(value);
					}
					catch(NumberFormatException e2){
						parsedValue = Boolean.parseBoolean(value);
					}
				}
			}
			varBinding.setValue(parsedValue);

			
			varBinding.setVariable(var);
			realtimeStatechartInstanceAdaptation.getVariableBindings().add(varBinding);	
		}
		
		RealtimeStatechartInstance realtimeStatechartInstance = RuntimeFactory.eINSTANCE.createRealtimeStatechartInstance();
		realtimeStatechartInstance.setInstanceOf((RealtimeStatechart) role.getBehavior());
		realtimeStatechartInstance.setActiveVertex(getInitialState((RealtimeStatechart) role.getBehavior()));
		roleInstance.setStatechartInstance(realtimeStatechartInstance);
		realtimeStatechartInstance.getSubRealtimeStatechartInstances().add(realtimeStatechartInstanceAdaptation);
		storeInitialGraphObject(realtimeStatechartInstance, tgts);
		storeTypeGraphObject(role.getBehavior(), tgts);
		for(Variable var : role.getBehavior().getVariables()){
			VariableBinding varBinding = RuntimeFactory.eINSTANCE.createVariableBinding();
			varBinding.setVariable(var);
			Expression initializeExpression = var.getInitializeExpression();
			Object parsedValue = null;
			if(initializeExpression instanceof LiteralExpression){
				String value = ((LiteralExpression) initializeExpression).getValue();
				
				try{
					parsedValue = Integer.parseInt(value);
				}
				catch(NumberFormatException e1){
					try{
						parsedValue = Double.parseDouble(value);
					}
					catch(NumberFormatException e2){
						parsedValue = Boolean.parseBoolean(value);
					}
				}
			}
			varBinding.setValue(parsedValue);
			realtimeStatechartInstance.getVariableBindings().add(varBinding);	
		}

		roleInstance.setType(role);
		roleInstance.setName(role.getName() + "_instance");

		RuntimeMessageBuffer messageBuffer = RuntimeFactory.eINSTANCE.createRuntimeMessageBuffer();
		roleInstance.getMessageBuffer().add(messageBuffer);

		storeInitialGraphObject(roleInstance, tgts);
	}

	/**
	 * Returns the initial state of a given Realtime Statechart.
	 * @param behavior
	 * @return
	 */
	private State getInitialState(RealtimeStatechart behavior) {
		for(State state : behavior.getStates()){
			if (state.isInitial())
				return state;
		}
		return null;
	}

	private void storeInitialGraphObject(EObject obj, TimedGraphTransformationSystem tgts){
		if(obj.eContainer() == null){
			tgts.getInitialGraphObjects().add(obj);
		}
	}
	
	private void storeTypeGraphObject(EObject obj, TimedGraphTransformationSystem tgts){
		if(obj.eContainer() == null){
			tgts.getTypeGraphObjects().add(obj);
		}
	}
}
