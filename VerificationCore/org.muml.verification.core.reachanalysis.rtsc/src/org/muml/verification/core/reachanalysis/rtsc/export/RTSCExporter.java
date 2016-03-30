package org.muml.verification.core.reachanalysis.rtsc.export;

import org.eclipse.emf.common.util.EList;
import org.muml.core.reachanalysis.core.export.ApplicationSpecificDecorator;
import org.muml.core.reachanalysis.core.export.GraphVizExport;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.Vertex;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.DelayTransition;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraphState;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraphTransition;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;
import org.muml.verification.core.runtime.VariableBinding;

public class RTSCExporter extends GraphVizExport {

	public RTSCExporter() {
		super();
	}

	public RTSCExporter(ApplicationSpecificDecorator decorator) {
		super(decorator);
	}

	@Override
	public String getStateLabel(ReachabilityGraphState state) {

		StringBuffer result = new StringBuffer();
		result.append("\"");
		for (RealtimeStatechartInstance location : ((ZoneGraphState) state)
				.getLocations()) {
			if (!(result.length() == 0))
				result.append("\\n");
			//TODO replace with MumlQualifiedNameProvider
			result.append(location.getInstanceOf().getName());
			result.append(".");
			
			// states
			if (location.getActiveVertex() != null)
				result.append(location.getActiveVertex().getName());
			
			// transitions
			else if (location.getActiveTransition() != null) {
				Vertex source = location.getActiveTransition().getSource();
				Vertex target = location.getActiveTransition().getTarget();
				if (source != null && target != null)
					result.append(source.getName() + "_to_" + target.getName());
			}

			// variable bindings
			if (location.getVariableBindings() != null
					&& !location.getVariableBindings().isEmpty()) {
				result.append("\\n");
				result.append("Variables of "
						+ location.getInstanceOf().getName() + ": ");
			}
			for (VariableBinding curVarBinding : location.getVariableBindings()) {
				if (curVarBinding.getValue() == null)
					result.append(curVarBinding.getVariable().getName()
							.toString()
							+ "=" + "null" + " ");
				else
					result.append(curVarBinding.getVariable().getName()
							.toString()
							+ "=" + curVarBinding.getValue().toString() + " ");
			}
		}
		result.append(";\\n");

		// federation
		if (((ZoneGraphState) state).getFederation() != null) {
			String fed = ((ZoneGraphState) state).getFederation().toString()
					.replaceAll("&", "&\\\\n");
			String or = "\\|";
			String fed2 = fed.replaceAll(or, "|\\\\n");
			result.append(fed2);
		}
		result.append("\"");
		return result.toString();
	}

	@Override
	public String getTransitionLabel(ReachabilityGraphTransition transition) {

		String result = "";

		if (transition instanceof DelayTransition) {
			result = "delay";
		} else if (transition instanceof ZoneGraphTransition) {
			EList<Transition> transitionSet = ((ZoneGraphTransition) transition)
					.getFiredRTSCTransitions();

			if (!transitionSet.isEmpty()) {

				Transition singleRtscTransition = transitionSet.iterator()
						.next();

				// synchronized transition
				if (singleRtscTransition.getSynchronization() != null) {
					result = singleRtscTransition.getSynchronization()
							.getSyncChannel().getName();
				} else {
					result = "tau";
				}

			}

		}
		return result;
	}

}
