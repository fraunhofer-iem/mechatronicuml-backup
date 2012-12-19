package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.commands;


/**
 * A customized DelegationInstanceCreateCommand. We make sure, an Delegation
 * instance may be created between both ports.
 * 
 * @author bingo, braund
 * 
 */

//TODO: reactivate connectors (muml bug #405)

//public class CustomDelegationInstanceCreateCommand extends
//		DelegationInstanceCreateCommand {
//	/**
//	 * Constructs this CustomDelegationInstanceCreateCommand.
//	 * 
//	 * @param request
//	 *            The CreateRelationshipRequest.
//	 * @param source
//	 *            The source port instance element.
//	 * @param target
//	 *            The target port instance element.
//	 */
//	public CustomDelegationInstanceCreateCommand(
//			CreateRelationshipRequest request, PortInstance source,
//			PortInstance target) {
//		super(request, source, target);
//	}
//
//	/**
//	 * Checks if this Delegation instance is allowed to be created.
//	 */
//	@Override
//	public boolean canExecute() {
//		// We add checks that are only performed, when both source and target
//		// are set.
//		if (getSource() != null && getTarget() != null) {
//
//			ComponentInstance sourceComponentInstance = getSource()
//					.getComponentInstance();
//
//			ComponentInstance targetComponentInstance = getTarget()
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
//	@Override
//	public de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration getContainer() {
//
//		ComponentInstance sourceComponentInstance = getSource()
//				.getComponentInstance();
//
//		if (getTarget() == null) {
//			return (ComponentInstanceConfiguration) sourceComponentInstance
//					.eContainer();
//		}
//
//		ComponentInstance targetComponentInstance = getTarget()
//				.getComponentInstance();
//
//		ComponentInstanceConfiguration sourceEmbeddedCIC = getEmbeddedCIC(sourceComponentInstance);
//		ComponentInstanceConfiguration targetEmbeddedCIC = getEmbeddedCIC(targetComponentInstance);
//		if (sourceEmbeddedCIC != null
//				&& sourceEmbeddedCIC.getComponentInstances().contains(
//						targetComponentInstance)) {
//			return sourceEmbeddedCIC;
//		} else {
//			return targetEmbeddedCIC;
//		}
//	}
//
//	private ComponentInstanceConfiguration getEmbeddedCIC(
//			ComponentInstance componentInstance) {
//		if (componentInstance instanceof StructuredComponentInstance) {
//			return ((StructuredComponentInstance) componentInstance)
//					.getEmbeddedCIC();
//		}
//		return null;
//	}
//}
