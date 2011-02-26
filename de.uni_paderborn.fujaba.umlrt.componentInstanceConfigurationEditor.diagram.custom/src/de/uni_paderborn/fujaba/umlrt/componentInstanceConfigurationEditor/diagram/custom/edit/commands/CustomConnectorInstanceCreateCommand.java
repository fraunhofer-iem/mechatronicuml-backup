package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.commands;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;

import de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.parts.CustomPortEditPart;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;

public class CustomConnectorInstanceCreateCommand extends EditElementCommand {

	CustomPortEditPart portEditPartSource;
	CustomPortEditPart portEditPartTarget;
	
	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	private final de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration container;

	/**
	 * @generated
	 */
	public CustomConnectorInstanceCreateCommand(CreateRelationshipRequest request,
			CustomPortEditPart p, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
		if(source instanceof Port){

			Map map =  p.getViewer().getEditPartRegistry();

	        for (Iterator it = map.keySet().iterator(); it.hasNext();) {
	            Object key = it.next();
	            Object value =  map.get(key);
	            if(key instanceof ShapeImpl){
	            	
		            if(source.equals(((ShapeImpl) key).basicGetElement())){
		            	portEditPartSource = (CustomPortEditPart) value;
		            	break;
		            }
	            }
	        }
		}
		if(getTarget() instanceof Port){

			Map map =  portEditPartSource.getViewer().getEditPartRegistry();

	        for (Iterator it = map.keySet().iterator(); it.hasNext();) {
	            Object key = it.next();
	            Object value =  map.get(key);
	            if(key instanceof ShapeImpl){
	            	
		            if(getTarget().equals(((ShapeImpl) key).basicGetElement())
		            		&& !portEditPartSource.equals(value)){
		            	portEditPartTarget = (CustomPortEditPart)value;
		            	break;
		            }
	            }
	        }
		}

		
		ComponentInstance cI = (ComponentInstance)((ShapeImpl) portEditPartSource.getParent().getModel()).basicGetElement();
		
		container = deduceContainer(cI, cI);
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null
				&& false == source instanceof de.uni_paderborn.fujaba.umlrt.model.component.Port) {
			return false;
		}
		if (target != null
				&& false == target instanceof de.uni_paderborn.fujaba.umlrt.model.component.Port) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		return de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.policies.ComponentInstanceConfigurationBaseItemSemanticEditPolicy
				.getLinkConstraints().canCreateConnectorInstance_4001(
						getContainer(), getSource(), getTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}

		de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance newElement = de.uni_paderborn.fujaba.umlrt.model.instance.InstanceFactory.eINSTANCE
				.createConnectorInstance();
		getContainer().getConnectorInstances().add(newElement);
		newElement.setFromPort(getSource());
		newElement.setToPort(getTarget());
		newElement.setFromComponentI((ComponentInstance)((ShapeImpl) portEditPartSource.getParent().getModel()).basicGetElement());
		newElement.setToComponentI((ComponentInstance)((ShapeImpl) portEditPartTarget.getParent().getModel()).basicGetElement());
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);

	}

	/**
	 * @generated
	 */
	protected void doConfigure(
			de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(CreateRelationshipRequest.SOURCE,
				getSource());
		configureRequest.setParameter(CreateRelationshipRequest.TARGET,
				getTarget());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.umlrt.model.component.Port getSource() {
		return (de.uni_paderborn.fujaba.umlrt.model.component.Port) source;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.umlrt.model.component.Port getTarget() {
		return (de.uni_paderborn.fujaba.umlrt.model.component.Port) target;
	}

	/**
	 * @generated
	 */
	public de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration getContainer() {
		return container;
	}

	/**
	 * Default approach is to traverse ancestors of the source to find instance of container.
	 * Modify with appropriate logic.
	 * @generated
	 */
	private static de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration deduceContainer(
			EObject source, EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration) {
				return (de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.ComponentInstanceConfiguration) element;
			}
		}
		return null;
	}

}
