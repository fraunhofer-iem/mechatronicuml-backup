package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.ExpressionsPackage;

import de.uni_paderborn.fujaba.common.edit.policies.NotifyingGraphicalEditPolicy;
import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabelEditPart;
import de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;
/**
 * This policy is responsible for the correct refreshment of the CoordinationProtocol when MessageBuffers are added or removed
 * @author sthiele2 
 */
public class CustomCoordinationProtocolUpdateEditPolicy extends NotifyingGraphicalEditPolicy{
	
	@Override
	protected void addListeners() {
		CoordinationProtocol protocol = (CoordinationProtocol)getSemanticElement();
		addNotificationListener(protocol);
		for( Role role : protocol.getRoles())
		{			
			addNotificationListener(role);		
		}
		ConnectorQualityOfServiceAssumptions quosa = protocol.getGmfConnectorQualityOfServiceAssumptions();
		if(quosa!=null)
			{
				addNotificationListener(quosa);
			}		
	}
	
	@Override
	public void handleNotificationEvent(Notification notification) {
		// TODO Auto-generated method stub
		super.handleNotificationEvent(notification);		
		EStructuralFeature feature = (EStructuralFeature) notification.getFeature();	
		
		if (feature == ProtocolPackage.Literals.ABSTRACT_COORDINATION_SPECIFICATION__ROLES || feature == ProtocolPackage.Literals.COORDINATION_PROTOCOL__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS
				|| feature == ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY
				|| feature == ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY
				|| ExpressionsPackage.Literals.EXPRESSION.isSuperTypeOf(feature.getEContainingClass())
				) {
			updateListeners();
		}		
		List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies(getSemanticElement());
		for (Iterator<CanonicalEditPolicy> it = editPolicies.iterator(); it
				.hasNext();) {
			CanonicalEditPolicy nextEditPolicy = it.next();
			nextEditPolicy.refresh();
		}
		
	}
	
}
