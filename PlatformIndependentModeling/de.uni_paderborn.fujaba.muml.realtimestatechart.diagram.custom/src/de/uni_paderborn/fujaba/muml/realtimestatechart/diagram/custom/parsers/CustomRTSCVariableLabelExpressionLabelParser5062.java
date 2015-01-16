package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.behavior.Operation;
import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.behavior.Variable;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.RealtimeStatechartLabelExpressionLabelParser5062;

public class CustomRTSCVariableLabelExpressionLabelParser5062 extends
		RealtimeStatechartLabelExpressionLabelParser5062 {

	@Override
	public String getPrintString(IAdaptable element, int flags) {
		// TODO Auto-generated method stub
		RealtimeStatechart stateChart = (RealtimeStatechart) element
				.getAdapter(EObject.class);
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
