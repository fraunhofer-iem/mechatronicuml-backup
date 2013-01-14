package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.commands;


/**
 * A customized AssemblyCreateCommand. We make sure, an assembly may be created
 * between both ports. The created element is then configured to get references
 * for both ComponentParts and the StructuredComponent.
 * 
 * @author bingo
 * 
 */

//TODO: reactivate when metamodel supports storing the ComponentPart in the AssemblyConnector again (after bug #414 was closed)


//public class CustomAssemblyCreateCommand extends AssemblyCreateCommand {
//
//	/**
//	 * The ComponentPart of the source port.
//	 */
//	private ComponentPart sourceComponentPart;
//
//	/**
//	 * The ComponentPart of the target port.
//	 */
//	private ComponentPart targetComponentPart;
//
//	/**
//	 * Constructs this CustomAssemblyCreateCommand.
//	 * 
//	 * @param request
//	 *            The CreateRelationshipRequest.
//	 * @param source
//	 *            The source port element.
//	 * @param target
//	 *            The target port element.
//	 * @param sourceComponentPart
//	 *            The ComponentPart of the source port.
//	 * @param targetComponentPart
//	 *            The ComponentPart of the target port.
//	 */
//	public CustomAssemblyCreateCommand(CreateRelationshipRequest request,
//			Port source, Port target, ComponentPart sourceComponentPart, ComponentPart targetComponentPart) {
//		super(request, source, target);
//		this.sourceComponentPart = sourceComponentPart;
//		this.targetComponentPart = targetComponentPart;
//	}
//
//	/**
//	 * Checks if this Assembly is allowed to be created.
//	 */
//	@Override
//	public boolean canExecute() {
//		// We add checks that are only performed, when both source and target
//		// are set.
//		if (getSource() != null && getTarget() != null) {
//			// Make sure, both sourceComponentPart and targetComponentPart are
//			// set.
//			if (sourceComponentPart == null || targetComponentPart == null) {
//				return false;
//			}
//			// Get parent component of both ComponentParts.
//			StructuredComponent sourceParent = sourceComponentPart
//					.getParentComponent();
//			StructuredComponent targetParent = targetComponentPart
//					.getParentComponent();
//
//			// Make sure both ComponentParts are within the same parent
//			// component.
//			if (sourceParent != targetParent) {
//				return false;
//			}
//		}
//		
//		// Make sure, sourceComponentPart is set.
//		if (sourceComponentPart == null) {
//			return false;
//		}
//
//		return super.canExecute();
//	}
//
//	/**
//	 * Configure the newly created Assembly to additionally have references to
//	 * both ComponentParts and the parent component.
//	 */
//	protected void doConfigure(
//			de.uni_paderborn.fujaba.muml.model.component.Assembly newElement,
//			IProgressMonitor monitor, IAdaptable info)
//			throws ExecutionException {
//		super.doConfigure(newElement, monitor, info);
//		newElement.setFrom(sourceComponentPart);
//		newElement.setTo(targetComponentPart);
//		newElement.setParentComponent(sourceComponentPart.getParentComponent());
//	}
//	
//	@Override
//	public StructuredComponent getContainer() {
//		return sourceComponentPart.getParentComponent();
//	}
//
//}
