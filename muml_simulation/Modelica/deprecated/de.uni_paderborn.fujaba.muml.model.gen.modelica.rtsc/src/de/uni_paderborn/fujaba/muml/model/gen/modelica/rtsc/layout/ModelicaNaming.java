package de.uni_paderborn.fujaba.muml.model.gen.modelica.rtsc.layout;

import de.uni_paderborn.fujaba.muml.model.gen.graphviz.layout.Naming;
import de.uni_paderborn.fujaba.muml.msgtype.MessageType;
import de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex;

public class ModelicaNaming {
	

	public static String getQuotedVertexName(Vertex vertex) {
		return Naming.getQuotedName(vertex.getName());
	}
	public static String getTransitionName(Transition transition) {
		return transition.getSource().getName() + transition.getTarget().getName();
	}
	
	public static String getQuotedTransitionName(Transition transition) {
		return Naming.getQuotedName(getTransitionName(transition));
	}
	
	private static String getMessageTypeName(MessageType messageType) {
		return messageType.getName().replaceAll(" ", "_");
	}
	
	public static String getRaiseMessageEventId(AsynchronousMessageEvent ev) {
		return "message_" + getMessageTypeName(ev.getMessage().getInstanceOf());
	}
	
	public static String getOutputDelegationPortName(AsynchronousMessageEvent ev) {
		return getMessageTypeName(ev.getMessage().getInstanceOf()) + "_" + "outputDelegationPort";
	}
	
	public static String getTriggerMessageEventId(AsynchronousMessageEvent ev) {
		return "mailbox_" + getMessageTypeName(ev.getMessage().getInstanceOf());
	}
	
	public static String getInputDelegationPortName(AsynchronousMessageEvent ev) {
		return getMessageTypeName(ev.getMessage().getInstanceOf()) + "_" + "inputDelegationPort";
	}

}
