package de.uni_paderborn.fujaba.muml.coordinationspecification.common.edit.policies;
import org.eclipse.emf.common.notify.Notification;
import org.muml.common.edit.policies.NotifyingGraphicalEditPolicy;

import de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;
/**
 * This Policy is responsible for the correct refreshment of the expression of the ExpressionLabel * 
 * @author sthiele2 
 */
public class CustomConnectorOfServiceAssumptionsWrappedLabelUpdateEditPolicy extends NotifyingGraphicalEditPolicy {	
	
	@Override
	protected void addListeners() 
	{
		ConnectorQualityOfServiceAssumptions quosa = (ConnectorQualityOfServiceAssumptions)this.getSemanticElement();
		//this.addNotificationListener(quosa);		
		if(quosa!=null)
			{
				addNotificationListener(quosa);
				TimeValue tMax = quosa.getMaxMessageDelay();
				if(tMax!=null)
					addNotificationListener(quosa.getMaxMessageDelay());
				TimeValue tMin = quosa.getMinMessageDelay();
				if(tMin!=null)				
					addNotificationListener(tMin);				
			}
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		// TODO Auto-generated method stub
		super.handleNotificationEvent(notification);
		//if(ExpressionsPackage.Literals.EXPRESSION.isSuperTypeOf(((EStructuralFeature)notification.getFeature()).getEContainingClass()))
			updateListeners();
		this.getHost().refresh();
	}
}
