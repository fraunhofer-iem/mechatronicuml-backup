package realtimestatechart.design;

import java.util.ArrayList;
import java.util.List;

import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.pim.realtimestatechart.SynchronizationKind;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.diagram.custom.parsers.CustomTransitionLabelExpressionLabelParser6005;
import org.muml.pim.realtimestatechart.diagram.custom.parsers.ParserUtilities;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate;
import org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing;
import org.muml.pim.realtimestatechart.one_to_n_schemata.MultiReceive;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Multicast;
import org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema;
import org.muml.pim.realtimestatechart.one_to_n_schemata.SingleReceive;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Unicast;

/**
 * The services class used by VSM.
 */
public class Services {

	public String invariantLabel(ClockConstraint clockConstraint) {
		return CustomTransitionLabelExpressionLabelParser6005.getClockConstraintExpression(clockConstraint);
	}

	public String guardLabel(Transition transition) {
		StringBuffer buf = new StringBuffer();
		if (!transition.getClockConstraints().isEmpty()) {
			buf.append('[');
			buf.append(CustomTransitionLabelExpressionLabelParser6005.getTransitionClockConstraintExpression(transition));
			buf.append(']');
		}
		buf.append(CustomTransitionLabelExpressionLabelParser6005.getGuardExpression(transition));
		if (transition.getTriggerMessageEvent() != null) {
			AsynchronousMessageEvent msg = transition.getTriggerMessageEvent();
			String name = "undefined";
			if (msg.getMessage() != null) {
				if (msg.getMessage().getInstanceOf() != null) {
					name = msg.getMessage().getInstanceOf().getName();
				}
			}
			buf.append(name);
			OneToManyCommunicationSchema schema = msg.getOneToManyCommunicationSchema();
			if (schema != null) {
				buf.append("->");
				if (schema instanceof SingleReceive) {
					buf.append("singleReceive");
				} else if (schema instanceof MultiReceive) {
					buf.append("multiReceive");
				}
				buf.append('(');
				List<String> list = new ArrayList<String>();
				if (schema.getCondition() != null) {
					list.add("if: " + CustomTransitionLabelExpressionLabelParser6005.getReceivingCommunicationSchemaConstraint(transition));
				}
				if (schema.getRetryAfter() != null) {
					list.add("retryAfter: " + CustomTransitionLabelExpressionLabelParser6005.getReceivingRetryAfterExpression(transition));
				}
				if (schema.getAction() != null) {
					list.add("do: " + (schema.getAction().getName() != null ? schema.getAction().getName() : "null"));
				}
				buf.append(String.join(" | ", list));
			}
		}
		if (transition.getSynchronization() != null) {
			Synchronization sync = transition.getSynchronization();
			if (sync.getSyncChannel() == null) {
				buf.append("null");
			} else {
				buf.append(sync.getSyncChannel().getName());
			}
			buf.append(CustomTransitionLabelExpressionLabelParser6005.getSynchronizationExpression(sync, sync.getSelectorExpression()));
			if (sync.getKind() == SynchronizationKind.SEND) {
				buf.append('!');
			} else {
				buf.append('?');
			}
			buf.append(' ');
		}
		String firstPart = buf.toString();
		buf = new StringBuffer();
		if (transition.getAction() != null) {
			buf.append("{ ");
			buf.append(transition.getAction().getName());
			buf.append(" } ");
		}
		
		if (transition.getRaiseMessageEvent() != null) {
			AsynchronousMessageEvent msg = transition.getRaiseMessageEvent();
			String name = "null";
			if (msg.getMessage() != null && msg.getMessage().getInstanceOf() != null) {
				name = msg.getMessage().getInstanceOf().getName();
			}
			buf.append(name);
			buf.append(CustomTransitionLabelExpressionLabelParser6005.getMessageParameterBindingExpression(transition, msg.getMessage()));
			if (msg.getOneToManyCommunicationSchema() != null) {
				OneToManyCommunicationSchema schema = msg.getOneToManyCommunicationSchema();
				buf.append("->");
				if (schema instanceof Multicast) {
					buf.append("multicast");
				} else if (schema instanceof Unicast) {
					buf.append("unicast");
				} else if (schema instanceof Iterate) {
					buf.append("iterate");
				} else if (schema instanceof LoadBalancing) {
					buf.append("loadBalancing");
				} else {
					buf.append("unknown");
				}
				buf.append('(');
				List<String> list = new ArrayList<String>();
				if (schema.getCondition() != null) {
					list.add("if: " + CustomTransitionLabelExpressionLabelParser6005.getSendingCommunicationSchemaConstraint(transition));
				}
				if (schema.getRetryAfter() != null) {
					list.add("retryAfter: " + CustomTransitionLabelExpressionLabelParser6005.getSendingRetryAfterExpression(transition));
				}
				if (schema.getAction() != null) {
					list.add("do: " + (schema.getAction().getName() != null ? schema.getAction().getName() : "null"));
				}
				if (schema instanceof Iterate) {
					Iterate iterate = (Iterate) schema;
					if (iterate.getTerminationCondition() != null) {
						list.add("until: " + CustomTransitionLabelExpressionLabelParser6005.getTransferCommunicationTermConstraint(transition));
					} 
					if (iterate.getDelay() != null) {
						list.add("delay: " + iterate.getDelay().toString());
					}
					if (iterate.isStartFromFirst()) {
						list.add("start from: first");
					} else {
						list.add("start from: last");
					}
				}
				if (schema instanceof LoadBalancing) {
					LoadBalancing loadBalancing = (LoadBalancing) schema;
					if (loadBalancing.getMaxWorkingTime() != null) {
						list.add("maxWT: " + loadBalancing.getMaxWorkingTime().toString());
					}
					if (loadBalancing.getResponseMessage() != null) {
						list.add("responseMsg: " + loadBalancing.getResponseMessage().getName());
					}
				}
				buf.append(String.join(" | ", list));
				buf.append(')');
			}
		}
		if (!transition.getClockResets().isEmpty()) {
			buf.append("{reset: ");
			List<String> list = new ArrayList<String>();
			for (Clock reset : transition.getClockResets()) {
				list.add(reset.getName());
			}
			buf.append(String.join(", ", list));
			buf.append("}");
		}
		
		String secondPart = buf.toString();
		if (!secondPart.isEmpty()) {
			firstPart += " / ";
			if (firstPart.length() > CustomTransitionLabelExpressionLabelParser6005.MAX_LINELENGTH) {
				firstPart += "\n";
			}
			firstPart += secondPart;
		}
		
		// #1001: Add manual linebreaks to prevent too long lines
		firstPart = CustomTransitionLabelExpressionLabelParser6005.ensureMaxLineLength(firstPart, CustomTransitionLabelExpressionLabelParser6005.MAX_LINELENGTH);
		firstPart = CustomTransitionLabelExpressionLabelParser6005.ensureMinLineLength(firstPart, CustomTransitionLabelExpressionLabelParser6005.MIN_LINELENGTH);
		return firstPart;
	}

	public String deadlineLabel(Transition transition) {
		StringBuffer buf = new StringBuffer();
		if (transition.getRelativeDeadline() != null) {

			String lowerBound = "null";
			if (transition.getRelativeDeadline().getLowerBound() != null) {
				if (transition.getRelativeDeadline().getLowerBound().getValue() != null) {
					if (transition.getRelativeDeadline().getLowerBound().getUnit() != null) {
						lowerBound = ParserUtilities.serializeTimeValue(transition.getRelativeDeadline().getLowerBound(), transition);
					}
				}
			}
			
			String upperBound = "null";
			if (transition.getRelativeDeadline().getUpperBound() != null) {
				if (transition.getRelativeDeadline().getUpperBound().getValue() != null) {
					if (transition.getRelativeDeadline().getUpperBound().getUnit() != null) {
						upperBound = ParserUtilities.serializeTimeValue(transition.getRelativeDeadline().getUpperBound(), transition);
					}
				}
			}
			buf.append('[');
			buf.append(lowerBound);
			buf.append(';');
			buf.append(upperBound);
			buf.append(']');
		}
		return buf.toString();
	}
}
