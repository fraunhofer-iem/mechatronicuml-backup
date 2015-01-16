package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import de.uni_paderborn.fujaba.muml.behavior.Behavior;
import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.RegionLabelExpressionLabelParser5065;

public class CustomRegionVariableLabelExpressionLabelParser5065 extends
		RegionLabelExpressionLabelParser5065 {

	@Override
	public String getPrintString(IAdaptable element, int flags) {
		// TODO Auto-generated method stub
		Region region = (Region) element.getAdapter(EObject.class);
		RealtimeStatechart stateChart =  region.getEmbeddedStatechart();
		return AbstractRTSCLabelParser.getStringForVariablesOperationsClocks(stateChart);
	}

	@Override
	public boolean isAffectingEvent(Object event, int flags) {
		// TODO Auto-generated method stub
		if(event instanceof Notification){
			Notification notification = (Notification) event;
			if(notification.getFeature() == BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION)
				return true;
		}
		return super.isAffectingEvent(event, flags);
	}
	
	

}
