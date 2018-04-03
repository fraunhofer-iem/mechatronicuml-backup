package org.muml.pim.realtimestatechart.design;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.core.CorePackage;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.TextualExpression;
import org.muml.pim.actionlanguage.xtext.common.LanguageResource;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.realtimestatechart.Message;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.pim.realtimestatechart.SynchronizationKind;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate;
import org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing;
import org.muml.pim.realtimestatechart.one_to_n_schemata.MultiReceive;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Multicast;
import org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema;
import org.muml.pim.realtimestatechart.one_to_n_schemata.SingleReceive;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Unicast;
import org.muml.pim.valuetype.ValuetypePackage;

/**
 * The services class used by VSM.
 */
public class Services {

	public String invariantLabel(ClockConstraint clockConstraint) {
		return getClockConstraintExpression(clockConstraint);
	}
	public String guardLabel(Transition transition) {
		StringBuffer buf = new StringBuffer();
		if (!transition.getClockConstraints().isEmpty()) {
			buf.append('[');
			buf.append(getTransitionClockConstraintExpression(transition));
			buf.append(']');
		}
		buf.append(getGuardExpression(transition));
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
					list.add("if: " + getReceivingCommunicationSchemaConstraint(transition));
				}
				if (schema.getRetryAfter() != null) {
					list.add("retryAfter: " + getReceivingRetryAfterExpression(transition));
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
			buf.append(getSynchronizationExpression(sync, sync.getSelectorExpression()));
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
			buf.append(getMessageParameterBindingExpression(transition, msg.getMessage()));
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
					list.add("if: " + getSendingCommunicationSchemaConstraint(transition));
				}
				if (schema.getRetryAfter() != null) {
					list.add("retryAfter: " + getSendingRetryAfterExpression(transition));
				}
				if (schema.getAction() != null) {
					list.add("do: " + (schema.getAction().getName() != null ? schema.getAction().getName() : "null"));
				}
				if (schema instanceof Iterate) {
					Iterate iterate = (Iterate) schema;
					if (iterate.getTerminationCondition() != null) {
						list.add("until: " + getTransferCommunicationTermConstraint(transition));
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
			if (firstPart.length() > MAX_LINELENGTH) {
				firstPart += "\n";
			}
			firstPart += secondPart;
		}
		
		// #1001: Add manual linebreaks to prevent too long lines
		firstPart = ensureMaxLineLength(firstPart, MAX_LINELENGTH);
		firstPart = ensureMinLineLength(firstPart, MIN_LINELENGTH);
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
	

	public static final int MAX_LINELENGTH = 50;

	public static final int MIN_LINELENGTH = 10;

	public static String getSendingRetryAfterExpression(Transition transition) {
		AsynchronousMessageEvent raiseMsg = transition.getRaiseMessageEvent();
		if (raiseMsg != null && raiseMsg.getOneToManyCommunicationSchema() != null && raiseMsg.getOneToManyCommunicationSchema().getRetryAfter() != null) {
			return ParserUtilities.serializeTimeValue(raiseMsg.getOneToManyCommunicationSchema().getRetryAfter(), transition);
		}
		return "";
	}
	public static String getReceivingRetryAfterExpression(Transition transition) {
		AsynchronousMessageEvent triggerMsg = transition.getTriggerMessageEvent();
		if (triggerMsg != null && triggerMsg.getOneToManyCommunicationSchema() != null && triggerMsg.getOneToManyCommunicationSchema().getRetryAfter() != null) {
			return ParserUtilities.serializeTimeValue(triggerMsg.getOneToManyCommunicationSchema().getRetryAfter(), transition);
		}
		return "";
	}
	public static String ensureMinLineLength(String printString, int minLinelength) {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new StringReader(printString));
		String line;
		try {
			if (null != (line = br.readLine())) { // unrolled the first loop iteration: without \n at front
				sb.append(line);
			}
			while (null != (line = br.readLine())) {
				if (line.length() >= minLinelength) {
					sb.append("\n");
				}
				sb.append(line);
			}
		} catch (IOException e) {
		}
		return sb.toString();
	}
	public static String ensureMaxLineLength(String printString, int maxLinelength) {
		StringBuffer sb = new StringBuffer();
		StringBuffer white = new StringBuffer();
		char c;
		int lineLength = 0;
		for (int i = 0; i < printString.length(); i++) {
			c = printString.charAt(i);
			if (c == '\n' || c == '\r') {
				lineLength = 0;
			}
			if (Character.isWhitespace(c)) {
				white.append(c);
			} else {
				if (white.length() > 0) {
					if (lineLength > maxLinelength) {
						sb.append('\n');
						lineLength = 0;
					} else {
						sb.append(white);
					}
					white.setLength(0);
				}
				sb.append(c);
			}
			lineLength++;
		}
		return sb.toString();
	}
	public static String getTransitionClockConstraintExpression(Transition transition) {
		StringBuffer buf = new StringBuffer();
		boolean first = true;
		for (ClockConstraint cc : transition.getClockConstraints()) {
			if (!first) {
				buf.append(", ");
			}
			buf.append(getClockConstraintExpression(cc));
			first = false;
		}
		return buf.toString();
	}
	public static String getClockConstraintExpression(ClockConstraint cc) {
		StringBuffer buf = new StringBuffer();

		if (cc.getClock() != null) {
			buf.append(cc.getClock().getName());
		} else {
			buf.append("null");
		}
		buf.append(' ');
		
		// I wrote the following helper program to find out bytes of UTF-8 characters:
//		public static void main(String[] args) throws UnsupportedEncodingException {
//			for (byte c : "x".getBytes()) {
//				System.out.println((int)(byte)c);
//			}
//		}
		try {
			switch (cc.getOperator()) {
			case EQUAL: 			buf.append('='); break;
			case LESS: 				buf.append('<'); break;
			case LESS_OR_EQUAL: 	buf.append("<="); break; //buf.append(new String(new byte[] { -30, -119, -92}, "UTF-8")); break; 
			case GREATER_OR_EQUAL: 	buf.append(">="); break; //buf.append(new String(new byte[] { -30, -119, -91}, "UTF-8")); break;
			case GREATER:			buf.append('>'); break;
			case UNEQUAL:			buf.append("<>"); break; //buf.append(new String(new byte[] { -30, -119, -96}, "UTF-8")); break;
			case REGULAR_EXPRESSION:buf.append("regexp"); break; 
			}
		//} catch (UnsupportedEncodingException e) {
		} finally {				
		}
		buf.append(' ');
		if (cc.getBound() != null) {
			buf.append(ParserUtilities.serializeTimeValue(cc.getBound(), cc.eContainer()));
		} else {
			buf.append("null");
		}
		return buf.toString();
	}
//
//	public static static String addManualLinebreaks(String str, int maxLineLength) {
//		StringBuffer result = new StringBuffer();
//		for (String line : str.split("\n")) {
//			while (line.length() > MAX_LINELENGTH) {
//				int split = findLastWhitespace(line);
//				if (split == -1) {
//					split = MAX_LINELENGTH - 1;
//				}
//				result.append(line.substring(0, split + 1));
//				line = line.substring(split + 1);
//				if (!line.isEmpty()) {
//					result.append('\n');
//				}
//			}
//			result.append(line);
//			result.append('\n');
//		}
//		
//		return result.toString();
//
//	}
//
//	public static static int findLastWhitespace(String line) {
//		for (int p = line.length() - 1; p >= 0; p--) {
//			char c = line.charAt(p);
//			if (Character.isWhitespace(c)) {
//				return p;
//			}
//		}
//		return -1;
//	}

	public static String getSynchronizationExpression(Synchronization context, Expression expression) {
		String serialization = null;
		if (context != null && expression != null) {
			serialization = getExpressionText(expression, context);
		}
		if (serialization != null) {
			return "[" + serialization + "]";
		}
		return "";
	}

	public static String getExpressionText(Expression expression, EObject context) {
		String text = "";
		if (expression instanceof TextualExpression) {
			text = ((TextualExpression) expression).getExpressionText();
		} else {
			text = LanguageResource.serializeEObjectSafe(expression, context);
		}

		if (text != null && text.length() > 0) {
			// remove some from the beginning...
			char c = text.charAt(0);
			while (c == '{' || c == '\t' || c == ' ' || c == '\n') {
				text = text.substring(1);
				c = text.charAt(0);
			}
		}
		return text;
	}
	public static String getGuardExpression(Transition transition) {
		Expression guard = transition.getGuard();
		if (guard != null) {
			String text = getExpressionText(guard, transition);
			return "[" + text + "]";
		}
		return "";
	}

	public static String getParameterBindingExpression(Transition transition,
			ParameterBinding parameterBinding) {
		String value = LanguageResource.serializeEObjectSafe(
				parameterBinding.getValue(), transition);
		return value;
	}

	public static String getParameterBindingExpressionFromList(Transition transition,
			List<ParameterBinding> parameterBindingList) {
		StringBuffer buffer = new StringBuffer();
		for (ParameterBinding parameterBinding : parameterBindingList) {
			buffer.append(getParameterBindingExpression(transition,
					parameterBinding) + ", ");
		}
		if (buffer.length() > 1) {
			// remove last comma
			return buffer.substring(0, buffer.length() - 2).toString();
		}
		return "";
	}

	public static String getMessageParameterBindingExpression(Transition transition,
			Message message) {
		if (message == null) {
			return "";
		}
		return getParameterBindingExpressionFromList(transition,
				message.getParameterBinding());
	}

	// TODO: Replace this implementation by the OCL impact analyzer!
	final static Collection<EStructuralFeature> FEATURES = Arrays
			.asList(new EStructuralFeature[] {
					CorePackage.Literals.NAMED_ELEMENT__NAME,
					RealtimestatechartPackage.Literals.TRANSITION__CLOCK_CONSTRAINTS,
					RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__CLOCK,
					RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__OPERATOR,
					RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__BOUND,
					ValuetypePackage.Literals.TIME_VALUE__UNIT,
					ValuetypePackage.Literals.TIME_VALUE__VALUE,
					RealtimestatechartPackage.Literals.TRANSITION__GUARD,
					RealtimestatechartPackage.Literals.TRANSITION__TRIGGER_MESSAGE_EVENT,
					RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE,
					RealtimestatechartPackage.Literals.MESSAGE__INSTANCE_OF,
					RealtimestatechartPackage.Literals.TRANSITION__SYNCHRONIZATION,
					RealtimestatechartPackage.Literals.SYNCHRONIZATION__SYNC_CHANNEL,
					RealtimestatechartPackage.Literals.SYNCHRONIZATION__KIND,
					RealtimestatechartPackage.Literals.SYNCHRONIZATION__SELECTOR_EXPRESSION,
					RealtimestatechartPackage.Literals.TRANSITION__ACTION,
					RealtimestatechartPackage.Literals.TRANSITION__RAISE_MESSAGE_EVENT,
					RealtimestatechartPackage.Literals.TRANSITION__CLOCK_RESETS,
					RealtimestatechartPackage.Literals.MESSAGE__PARAMETER_BINDING,
					BehaviorPackage.Literals.PARAMETER_BINDING__VALUE,//
					BehaviorPackage.Literals.PARAMETER_BINDING__PARAMETER,//
			});

	final static Collection<EReference> REFERENCES = getReferences(FEATURES);

	private static Collection<EReference> getReferences(
			Collection<EStructuralFeature> features) {
		List<EReference> references = new ArrayList<EReference>(features.size());
		for (EStructuralFeature feature : features) {
			if (feature instanceof EReference) {
				references.add((EReference) feature);
			}
		}
		return references;
	}
/*
	@Override
	public List<EObject> getSemanticElementsBeingParsed(EObject semanticElement) {
		return ParserUtilities.deduceAllElements(semanticElement, REFERENCES);
	}

	@Override
	public boolean areSemanticElementsAffected(EObject listener,
			Object notification) {
		return FEATURES.contains(((ENotificationImpl) notification)
				.getFeature());
	}
*/
	public static String getReceivingCommunicationSchemaConstraint(Transition transition) {
		Expression condition = null;
		AsynchronousMessageEvent triggerMsg = transition.getTriggerMessageEvent();
		if(triggerMsg != null && triggerMsg.getOneToManyCommunicationSchema() != null){
			condition = triggerMsg.getOneToManyCommunicationSchema().getCondition();
		}
		
		if (condition != null) {
			String text = getExpressionText(condition, transition);
			if (text != null) {
				return text;
			}
		}
		return "";
	}
	
	public static String getSendingCommunicationSchemaConstraint(Transition transition) {
		Expression condition = null;
		AsynchronousMessageEvent raiseMsg = transition.getRaiseMessageEvent();
		if(raiseMsg != null && raiseMsg.getOneToManyCommunicationSchema() != null){
			condition = raiseMsg.getOneToManyCommunicationSchema().getCondition();
		}
		
		if (condition != null) {
			String text = getExpressionText(condition, transition);
			if (text != null) {
				return text;
			}
		}
		return "";
	}
	
	public static String getTransferCommunicationTermConstraint(Transition transition) {
		Expression condition = null;
		AsynchronousMessageEvent raiseMsg = transition.getRaiseMessageEvent();
		if(raiseMsg != null && raiseMsg.getOneToManyCommunicationSchema() != null && raiseMsg.getOneToManyCommunicationSchema() instanceof Iterate){
			condition = ((Iterate)(raiseMsg.getOneToManyCommunicationSchema())).getTerminationCondition();
		}
		
		if (condition != null) {
			String text = getExpressionText(condition, transition);
			if (text != null) {
				return text;
			}
		}
		return "";
	}

}
