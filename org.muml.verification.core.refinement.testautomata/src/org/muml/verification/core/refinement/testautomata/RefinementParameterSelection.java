package org.muml.verification.core.refinement.testautomata;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.PlatformUI;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.Role;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Transition;

public class RefinementParameterSelection {
	private Refinement[] refinementParameters;
	
	public RefinementParameterSelection(){

	}

	/**
	 * This method implements the decision tree for selecting a refinement definition
	 * based on the port and the role that it refines.
	 * @param port the DiscretePort to be checked for a correct refinement
	 * @return
	 */
	public Refinement[] selectRefinementParameters(DiscretePort port) {
		
		//obtain further model elements
		Role theRole = port.getRefinedRole();
		RealtimeStatechart roleRTSC = (RealtimeStatechart)theRole.getBehavior();
		
		//initialize result variable
		//refinementParameters = new Refinement[5]; // done in the get Parameters method since they can be called directly form elsewhere
		
		//Decision 1: Clocks or no clocks
		if(hasClocksInRTSC(roleRTSC)){
			//Decision 2: Existential Quantifiers or not
			if(usesOnlyUniversisalQuantifiersInVerifiedProperties((CoordinationProtocol)theRole.getCoordinationProtocol())){
				//Decision 3: Larger input buffer in port
				if(hasLargerMessageBufferInPort(port)){
					//relaxed timed bisimulation
					return getRelaxedTimedBisimulation();
				} else {
					// Decision 4: Uses urgent transitions
					if(hasUrgentTransitionsInRTSC(roleRTSC)){
						return getTimedReadySimulation();
					} else {
						// timed simulation
						return getTimedSimulation();
					}
				}
			} else {
				//Decision 3: Larger input buffer in port
				if(hasLargerMessageBufferInPort(port)){
					//relaxed timed bisimulation
					return getRelaxedTimedBisimulation();
				} else {
					// timed bisimulation
					return getTimedBisimulation();
				}
			}
		} else {
			//Decision 2: Only Universal Quantifiers or not
			if(usesOnlyUniversisalQuantifiersInVerifiedProperties((CoordinationProtocol)theRole.getCoordinationProtocol())){
				//simulation
				return getSimulation();
			} else {
				//bisimulation
				return getBisimulation();
			}
		}
	}

	public Refinement[] getSimulation() {
		//initialize result variable
		refinementParameters = new Refinement[5];
		refinementParameters[0]= new Refinement(TransitionType.ALL, Direction.REFINED,
		 Requirement.R1);
		return refinementParameters;
	}

	public Refinement[] getTimedReadySimulation() {
		//initialize result variable
		refinementParameters = new Refinement[5];
		refinementParameters[0] = new Refinement(TransitionType.ALL, Direction.REFINED,
				 Requirement.R2);
		refinementParameters[1] = new Refinement(TransitionType.URGENT, Direction.ABSTRACT,
				Requirement.R2);
		return refinementParameters;
	}

	public Refinement[] getTimedSimulation() {
		refinementParameters = new Refinement[5];
		refinementParameters[0] = new Refinement(TransitionType.ALL, Direction.REFINED,
				 Requirement.R2);
		return refinementParameters;
	}

	public Refinement[] getTimedBisimulation() {
		refinementParameters = new Refinement[5];
		refinementParameters[0] = new Refinement(TransitionType.ALL, Direction.REFINED,
				 Requirement.R2);
		refinementParameters[1] = new Refinement(TransitionType.ALL, Direction.ABSTRACT,
				Requirement.R2);
		return refinementParameters;
	}

	public Refinement[] getBisimulation() {
		refinementParameters = new Refinement[5];
		refinementParameters[0]= new Refinement(TransitionType.ALL, Direction.REFINED,
				 Requirement.R1);
		refinementParameters[1] = new Refinement(TransitionType.ALL, Direction.ABSTRACT,
				Requirement.R1);
		return refinementParameters;
	}
	
	
	public Refinement[] getRelaxedTimedBisimulation() {
		
		//initialize result variable
		refinementParameters = new Refinement[5];
		
		refinementParameters[0] = new Refinement(TransitionType.INCOMING, Direction.REFINED,
				Requirement.R1);
		refinementParameters[1] = new Refinement(TransitionType.NONE, Direction.REFINED,
					Requirement.R1); 
		refinementParameters[2] = new Refinement(TransitionType.INCOMING, Direction.ABSTRACT,
				Requirement.R1);
		refinementParameters[3] = new Refinement(TransitionType.OUTGOING, Direction.REFINED,
				Requirement.R3);
		refinementParameters[4] = new Refinement(TransitionType.INCOMING, Direction.ABSTRACT,
				Requirement.R3);
		
		return refinementParameters;

	}
	
	/**
	 * Helper function that returns whether the RTSC of the role utilizes any clocks.
	 * @param roleRTSC
	 * @return
	 */
	private boolean hasClocksInRTSC(RealtimeStatechart roleRTSC){
		
		if(roleRTSC.getAvailableClocks().isEmpty()){
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * Helper function that returns whether the RTSC of the role utilizes any urgent transitions.
	 * @param roleRTSC
	 * @return
	 */
	private boolean hasUrgentTransitionsInRTSC(RealtimeStatechart roleRTSC){
		
		//check all transitions of the RTSC
		for(Transition trans : roleRTSC.getTransitions()){
			if(trans.isUrgent()){
				return true;
			}
		}
		
		//check all embedded RTSCs recursively
		for(State state : roleRTSC.getStates()){
			//iterate regions of state
			for (Region region : state.getEmbeddedRegions()){ 
				boolean urgentTrans = hasUrgentTransitionsInRTSC(region.getEmbeddedStatechart());
				if(urgentTrans) return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Helper function that returns whether the role and port use different message buffers.
	 * @param port
	 * @return
	 */
	private boolean hasLargerMessageBufferInPort(DiscretePort port){

		//get buffers
		List<MessageBuffer> roleBuffers = port.getRefinedRole().getReceiverMessageBuffer();
		List<MessageBuffer> portBuffers = port.getReceiverMessageBuffer();
		
		//iterate buffers
		for(MessageBuffer curRoleBuffer : roleBuffers){
			//locate a port buffer that accepts the same set of messages as the role buffer
			MessageBuffer correspondingPortBuffer = null;
			
			for(MessageBuffer curPortBuffer : portBuffers){
				
				boolean uncontainedMsgTypeFound = false;
				
				//iterate messages
				for(MessageType msgType : curRoleBuffer.getMessageType()){
					if(!curPortBuffer.getMessageType().contains(msgType)){
						uncontainedMsgTypeFound = true;
						break;
					}
				}
				
				if (uncontainedMsgTypeFound == false){
					correspondingPortBuffer = curPortBuffer;
					break;
				}
			}
			
			//since a precondition check ensures that there exists a corresponding buffer, we don't need to 
			//check it here.
			
			//check buffer size
			if(correspondingPortBuffer.getBufferSize().getValue() <= curRoleBuffer.getBufferSize().getValue()){
				return false;
			}
		}
		
		
		return true;
	}
	
	/**
	 * Helper function that returns whether the properties that have been verified for the
	 * coordination protocol contain existential quantifiers.
	 * @param port
	 * @return
	 */
	private boolean usesOnlyUniversisalQuantifiersInVerifiedProperties(CoordinationProtocol protocol){
		
		//TODO: As long as we do not specify constraint directly in MUML, we need to ask the developer.
		MessageBox dialog = new MessageBox(PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getShell(), SWT.YES
				| SWT.NO);
		dialog.setText("Verify Refinement");
		dialog.setMessage("Did you only use universal quantifiers in your verified properties?");
		Object result = dialog.open();
		if (result.equals(SWT.YES)) {
			return true;
		} else {		
			return false;
		}
	}

}
