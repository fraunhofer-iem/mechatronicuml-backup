package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.commands;



//TODO: reactivate when metamodel supports storing the ComponentPart in the AssemblyConnector again (after bug #414 was closed)


//public class CustomDelegationReorientCommand extends DelegationReorientCommand {
//
//	/**
//	 * The ComponentPart for this Delegation.
//	 */
//	private ComponentPart componentPart;
//
//	/**
//	 * The parent Component for this Delegation.
//	 */
//	private StructuredComponent parentComponent;
//
//	/**
//	 * Constructs this CustomDelegationReorientCommand.
//	 * 
//	 * @param request
//	 *            The ReorientRelationshipRequest.
//	 * @param componentPart
//	 *            The ComponentPart for this Delegation.
//	 * @param parentComponent
//	 *            The parent Component for this Delegation.
//	 */
//	public CustomDelegationReorientCommand(ReorientRelationshipRequest request,
//			ComponentPart componentPart, StructuredComponent parentComponent) {
//		super(request);
//		this.componentPart = componentPart;
//		this.parentComponent = parentComponent;
//	}
//
//	/**
//	 * Checks if this Delegation is allowed to be reoriented.
//	 * 
//	 * @return <code>true</code>, if this Delegation is allowed to be reoriented
//	 *         this way.
//	 */
//	@Override
//	public boolean canExecute() {
//		Port newSource = getOldSource();
//		Port newTarget = getOldTarget();
//		if (getReorientDirection() == ReorientRelationshipRequest.REORIENT_SOURCE) {
//			newSource = getNewSource();
//		} else if (getReorientDirection() == ReorientRelationshipRequest.REORIENT_TARGET) {
//			newTarget = getNewTarget();
//		}
//
//		// Make sure both Ports are set.
//		if (newSource == null || newTarget == null) {
//			return false;
//		}
//
//		// Make sure, ComponentPart and parentComponent are set.
//		if (componentPart == null || parentComponent == null) {
//			return false;
//		}
//
//		boolean valid = DelegationConstraints.isValidDelegation(newSource,
//				newTarget, parentComponent, componentPart);
//		if (!valid) {
//			return false;
//		}
//		return super.canExecute();
//	}
//
//	/**
//	 * Update both ComponentPart and parent Component of the Delegation
//	 * according to the ReorientRequest.
//	 */
//	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
//			IAdaptable info) throws ExecutionException {
//		// Set ComponentPart and parent Component
//		getLink().setComponentPart(componentPart);
//		getLink().setParentComponent(parentComponent);
//
//		// Call super implementation, which sets the new Port for the
//		// Delegation.
//		return super.doExecuteWithResult(monitor, info);
//	}
//
//}
