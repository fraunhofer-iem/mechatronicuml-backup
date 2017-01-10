package org.muml.pim.coordinationspecification.common.edit.policies;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.muml.core.common.edit.policies.NotifyingGraphicalEditPolicy;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.protocol.AbstractCoordinationSpecification;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.protocol.Role;
import org.muml.pim.protocol.RoleConnector;

/**
 * This policy is responsible for the correct refreshment of the
 * AbstractCoordinationSpecification when MessageBuffers are added or removed
 * 
 * @author sthiele2
 */
public class CustomAbstractCoordinationSpecificationUpdateEditPolicy extends
		NotifyingGraphicalEditPolicy {

	

	@Override
	protected void addListeners() {
		EObject semanticElement = getSemanticElement();
		if (semanticElement instanceof AbstractCoordinationSpecification) {
			AbstractCoordinationSpecification acs = (AbstractCoordinationSpecification) getSemanticElement();
			
			RoleConnector connector = acs.getRoleConnector();
			if (connector != null) {
				this.addNotificationListener(connector);
			}
	
			addNotificationListener(acs);
			for (Role role : acs.getRoles()) {
				if (role != null)
					addNotificationListener(role);
			}
			ConnectorQualityOfServiceAssumptions quosa = acs
					.getGmfConnectorQualityOfServiceAssumptions();
			if (quosa != null) {
				addNotificationListener(quosa);
			}
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
				|| feature == ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY
				|| feature == ProtocolPackage.Literals.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS) {
			updateListeners();
		}
		if (feature == ProtocolPackage.Literals.ABSTRACT_COORDINATION_SPECIFICATION__ROLES
				|| feature == ProtocolPackage.Literals.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR
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
