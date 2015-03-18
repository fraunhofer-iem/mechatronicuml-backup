package de.uni_paderborn.fujaba.muml.reachanalysis.rtsc.export;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.reachanalysis.core.export.ApplicationSpecificDecorator;
import de.uni_paderborn.fujaba.muml.reachanalysis.core.export.GraphVizExport;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.DelayTransition;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphTransition;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex;
import de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.runtime.VariableBinding;

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
			if (location.getActiveTransition() != null)
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
