package org.muml.pim.realtimestatechart.diagram.custom.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.diagram.parsers.RegionLabelExpressionLabelParser5065;

public class CustomRegionVariableLabelExpressionLabelParser5065 extends
		RegionLabelExpressionLabelParser5065 {

	@Override
	public String getPrintString(IAdaptable element, int flags) {
		// TODO Auto-generated method stub
		Region region = (Region) element.getAdapter(EObject.class);
		if (region != null) {
			RealtimeStatechart stateChart =  region.getEmbeddedStatechart();
			if (stateChart != null) {
				return AbstractRTSCLabelParser.getStringForVariablesOperationsClocks(stateChart);
			}
		}
		return "";
	}

	@Override
	public boolean isAffectingEvent(Object event, int flags) {
		// NOTE: This has side effects and must always be called.
		// It does some book-keeping in the OCL-Tracker.
		boolean isAffecting = super.isAffectingEvent(event, flags);
		
		if (event instanceof Notification) {
			Notification notification = (Notification) event;
			if (notification.getFeature() == BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION) {
				isAffecting = true;
			}
		}
		return isAffecting;
	}

	
	

}
