package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;

import de.uni_paderborn.fujaba.common.edit.policies.NotifyingGraphicalEditPolicy;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.protocol.RoleConnector;

/**
 * This policy is responsible for the correct refreshment of the
 * CoordinationProtocol when MessageBuffers are added or removed
 * 
 * @author sthiele2
 */
public class CustomCoordinationProtocolUpdateEditPolicy extends
		NotifyingGraphicalEditPolicy {
	@Override
	public void activate() {
		super.activate();
		List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
				.getRegisteredEditPolicies(getSemanticElement());
		for (Iterator<CanonicalEditPolicy> it = editPolicies.iterator(); it
				.hasNext();) {
			CanonicalEditPolicy nextEditPolicy = it.next();
			nextEditPolicy.refresh();
		}
	}

	@Override
	protected void addListeners() {
		EObject semanticElement = getSemanticElement();
		if (!(semanticElement instanceof CoordinationProtocol)) {
			// when the coordination protocol is getting deleted, updateListeners() calls this, 
			// getSemanticElement() fails to resolve the coordination protocol. 
			// In this case it is not necessary to add any listeners, so just return.
			return;
		}
		
		CoordinationProtocol protocol = (CoordinationProtocol) semanticElement;
		RoleConnector connector = protocol.getRoleConnector();
		if (connector != null) {
			this.addNotificationListener(connector);
		}

		addNotificationListener(protocol);
		for (Role role : protocol.getRoles()) {
			if (role != null)
				addNotificationListener(role);
		}
		ConnectorQualityOfServiceAssumptions quosa = protocol
				.getGmfConnectorQualityOfServiceAssumptions();
		if (quosa != null) {
			addNotificationListener(quosa);
		}
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		// TODO Auto-generated method stub
		super.handleNotificationEvent(notification);
		EStructuralFeature feature = (EStructuralFeature) notification
				.getFeature();

		if (feature == ProtocolPackage.Literals.ABSTRACT_COORDINATION_SPECIFICATION__ROLES
				|| feature == ProtocolPackage.Literals.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR
				|| feature == ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY
				|| feature == ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY
				|| feature == ProtocolPackage.Literals.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS) {
			updateListeners();
		}
		if (feature == ProtocolPackage.Literals.ABSTRACT_COORDINATION_SPECIFICATION__ROLES
				|| feature == ProtocolPackage.Literals.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR
				|| feature == ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY
				|| feature == ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY
				|| feature == ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER
				|| feature == ProtocolPackage.Literals.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS) {
			List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
					.getRegisteredEditPolicies(getSemanticElement());
			for (Iterator<CanonicalEditPolicy> it = editPolicies.iterator(); it
					.hasNext();) {
				CanonicalEditPolicy nextEditPolicy = it.next();
				nextEditPolicy.refresh();
			}
		}

	}

}
