package de.uni_paderborn.fujaba.modelica.m2t.rtsc.layout;

import java.util.HashMap;

import de.uni_paderborn.fujaba.muml.model.gen.graphviz.layout.AbstractGraphData;
import de.uni_paderborn.fujaba.muml.model.gen.graphviz.layout.EdgePort;
import de.uni_paderborn.fujaba.muml.model.gen.graphviz.layout.IGraphData;
import de.uni_paderborn.fujaba.muml.model.gen.graphviz.layout.IGraphDataProvider;
import de.uni_paderborn.fujaba.muml.model.gen.modelica.instance.transform.RegionInstance;
import de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.EntryPoint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex;


public class ModelicaGraphDataProvider implements IGraphDataProvider<Node, Edge> {
	private ModelicaGraphData graphData;
	
	public ModelicaGraphDataProvider(RealtimeStatechart rtsc) {
		graphData = new ModelicaGraphData(rtsc);
	}
	
	private static boolean isPortRTSC(RealtimeStatechart rtsc) {
		return rtsc.isEmbedded()
				&& ((RegionInstance) rtsc.getParentRegion()).isEmbedsSinglePortStatechart();
	}
	
	class ModelicaGraphData extends AbstractGraphData<Node, Edge> {
		private RealtimeStatechart rtsc;
		private HashMap<String, Boolean> mapRaiseSeen = new HashMap<String, Boolean>();
		private HashMap<String, Boolean> mapTriggerSeen = new HashMap<String, Boolean>();
		
		public ModelicaGraphData(RealtimeStatechart rtsc) {
			this.rtsc = rtsc;
			for (Vertex vertex : rtsc.getStates()) {
				addNode(new Node(vertex));
			}
			for (Transition transition : rtsc.getTransitions()) {
				if (!(transition.getSource() instanceof EntryPoint)) {
					addTransition(transition);
				}
			}
			if (isPortRTSC(rtsc)) {
				addAsyncMessageEvents(rtsc);
			}
			// XXX: add pseudo edge for rtsc with exactly one state and no transitions
			if (rtsc.getStates().size() == 1 && rtsc.getTransitions().isEmpty()) {
				addPseudoEdge(rtsc.getStates().get(0));
			}
		}
		
		private void addPseudoEdge(State state) {
			Node node = getNode(state.getName());
			addEdge(new Edge(null, node, node, EdgeType.PSEUDO, null, null));
		}

		private void addTransition(Transition transition) {
			Node source = getNode(transition.getSource().getName());
			Node target = getNode(transition.getTarget().getName());
			if (transition.getTarget() instanceof EntryPoint) {
				target = getNode(((EntryPoint) transition.getTarget()).getState().getName());
			}
			//String transitionId = ModelicaNaming.getTransitionName(transition);
			String transitionId = Integer.toString(transition.hashCode());
			PseudoNode pseudoNode = new PseudoNode(transitionId);
			addNode(pseudoNode);
			addEdge(new Edge(transition, source, pseudoNode));
			addEdge(new Edge(transition, pseudoNode, target));
		}
		
		private void addAsyncMessageEvents(RealtimeStatechart rtsc) {
			for (Transition transition : rtsc.getTransitions()) {
				AsynchronousMessageEvent ev = transition.getRaiseMessageEvent();
				if (ev != null && !mapRaiseSeen.containsKey(ev.getMessage().getInstanceOf().getName())) {
					addRaiseMessage(ev);
					mapRaiseSeen.put(ev.getMessage().getInstanceOf().getName(), true);
				}
				ev = transition.getTriggerMessageEvent();
				if (ev != null && !mapTriggerSeen.containsKey(ev.getMessage().getInstanceOf().getName())) {
					addTriggerMessage(ev);
					mapTriggerSeen.put(ev.getMessage().getInstanceOf().getName(), true);
				}
			}
			for (State state : rtsc.getStates()) {
				for (Region region : state.getEmbeddedRegions()) {
					addAsyncMessageEvents(region.getEmbeddedStatechart());
				}
			}
		}
			
		private void addRaiseMessage(AsynchronousMessageEvent ev) {
			String delegationPortId = ModelicaNaming.getOutputDelegationPortName(ev);
			String messageId = ModelicaNaming.getRaiseMessageEventId(ev);
			Node delegationPortPseudoNode = new PseudoNode(delegationPortId);
			Node messagePseudoNode = new PseudoNode(messageId);
			addNode(delegationPortPseudoNode);
			addNode(messagePseudoNode);
			addEdge(new Edge(getStatechart(), messagePseudoNode, delegationPortPseudoNode,
					EdgeType.MESSAGE, EdgePort.WEST, EdgePort.EAST));
		}
		
		private void addTriggerMessage(AsynchronousMessageEvent ev) {
			String delegationPortId = ModelicaNaming.getInputDelegationPortName(ev);
			String mailboxId = ModelicaNaming.getTriggerMessageEventId(ev);
			Node delegationPortPseudoNode = new PseudoNode(delegationPortId);
			Node mailboxPseudoNode = new PseudoNode(mailboxId);
			addNode(delegationPortPseudoNode);
			addNode(mailboxPseudoNode);
			addEdge(new Edge(getStatechart(), delegationPortPseudoNode, mailboxPseudoNode,
					EdgeType.MAILBOX, EdgePort.WEST, EdgePort.EAST));
		}

		@Override
		public String getId() {
			return rtsc.getName();
		}
		
		public RealtimeStatechart getStatechart() {
			return rtsc;
		}

	}

	@Override
	public IGraphData<Node, Edge> getGraphData() {
		return graphData;
	}

}
