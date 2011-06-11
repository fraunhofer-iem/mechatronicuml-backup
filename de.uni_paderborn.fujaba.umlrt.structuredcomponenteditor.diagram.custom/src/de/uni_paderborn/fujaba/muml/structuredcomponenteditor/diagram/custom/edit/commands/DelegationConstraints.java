package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.commands;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.PortKind;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;

public class DelegationConstraints {

	public static boolean isValidDelegation(Port source, Port target,
			StructuredComponent parentComponent, ComponentPart componentPart) {
		boolean sourceReceiver = source.getReceiverMessageInterface() != null;
		boolean sourceSender = source.getSenderMessageInterface() != null;
		boolean targetReceiver = target.getReceiverMessageInterface() != null;
		boolean targetSender = target.getSenderMessageInterface() != null;

		boolean sourceIn = sourceReceiver && !sourceSender;
		boolean sourceOut = !sourceReceiver && sourceSender;
		boolean sourceInOut = sourceReceiver && sourceSender;

		boolean targetIn = targetReceiver && !targetSender;
		boolean targetOut = !targetReceiver && targetSender;
		boolean targetInOut = targetReceiver & targetSender;

		// Port of StructuredComponent
		switch (source.getPortKind()) {
		case DISCRETE:
			if (target.getPortKind() == PortKind.DISCRETE) {
				if (sourceReceiver == targetReceiver
						&& sourceSender == targetSender) {
					return true;
				}
			}
			if (target.getPortKind() == PortKind.HYBRID
					&& (sourceIn && targetIn || sourceOut && targetOut)) {
				return true;
			}
			break;
		case CONTINUOUS:
			if (target.getPortKind() == PortKind.CONTINUOUS
					|| target.getPortKind() == PortKind.HYBRID) {
				if (sourceIn && targetIn || sourceOut && targetOut) {
					return true;
				}
			}
			break;
		case HYBRID:
			if (target.getPortKind() == PortKind.HYBRID) {
				if (sourceIn && targetIn || sourceOut && targetOut) {
					return true;
				}
			}
			break;
		default:
			break;
		}
		return false;
	}

}
