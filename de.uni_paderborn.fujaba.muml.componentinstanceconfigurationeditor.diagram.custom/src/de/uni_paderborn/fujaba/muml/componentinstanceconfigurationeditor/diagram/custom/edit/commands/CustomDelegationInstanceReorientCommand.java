package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.commands;


/**
 * A customized DelegationInstanceReorientCommand. We make sure, an Delegation
 * instance may be reoriented this way.
 * 
 * @author bingo, braund
 * 
 */

//TODO: reactivate connectors (muml bug #405)

//public class CustomDelegationInstanceReorientCommand extends
//		DelegationInstanceReorientCommand {
//
//	/**
//	 * Constructs this CustomDelegationInstanceReorientCommand.
//	 * 
//	 * @param request
//	 *            The CreateRelationshipRequest.
//	 * @param source
//	 *            The source port instance element.
//	 * @param target
//	 *            The target port instance element.
//	 */
//	public CustomDelegationInstanceReorientCommand(
//			ReorientRelationshipRequest request) {
//		super(request);
//	}
//	
//	/**
//	 * Checks if this Delegation instance is allowed to be reoriented.
//	 */
//	@Override
//	public boolean canExecute() {
//		
//		// Find out the new source and target
//		PortInstance source = getLink().getSource();
//		PortInstance target = getLink().getTarget();
//		switch (getReorientDirection()) {
//		case ReorientRelationshipRequest.REORIENT_SOURCE:
//			source = getNewSource();
//			break;
//		case ReorientRelationshipRequest.REORIENT_TARGET:
//			target = getNewTarget();
//			break;
//		}
//		
//		// We add checks that are only performed, when both source and target
//		// are set.
//		if (source != null && target != null) {
//
//			ComponentInstance sourceComponentInstance = source
//					.getComponentInstance();
//
//			ComponentInstance targetComponentInstance = target
//					.getComponentInstance();
//
//			if (sourceComponentInstance.eContainer().equals(
//					targetComponentInstance.eContainer())) {
//				return false;
//			}
//		}
//		return super.canExecute();
//	}
//
//}
