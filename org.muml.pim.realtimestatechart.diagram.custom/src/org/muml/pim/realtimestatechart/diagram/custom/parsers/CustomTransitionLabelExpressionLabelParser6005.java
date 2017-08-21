package org.muml.pim.realtimestatechart.diagram.custom.parsers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
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
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.realtimestatechart.Message;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.diagram.parsers.TransitionLabelExpressionLabelParser6005;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate;
import org.muml.pim.valuetype.ValuetypePackage;

public class CustomTransitionLabelExpressionLabelParser6005 extends
		TransitionLabelExpressionLabelParser6005 /* implements ISemanticParser*/ {
	
	public CustomTransitionLabelExpressionLabelParser6005() {
	}
	
	public static final int MAX_LINELENGTH = 50;

	public static final int MIN_LINELENGTH = 10;

	public String getPrintString(IAdaptable element, int flags) {
		String printString = "";
		
		String segments[] = super.getPrintString(element, flags).split("\\{/\\}");
		printString = segments[0];
		if (segments.length == 2) {
			printString += " / ";
			if (printString.length() > MAX_LINELENGTH) {
				printString += "\n";
			}
			printString += segments[1];
		}
		
		Transition transition = (Transition) element.getAdapter(EObject.class);
		Synchronization synchronization = transition.getSynchronization();
		Expression synchronizationExpression = null;
		if (synchronization != null) {
			synchronizationExpression = synchronization.getSelectorExpression();
		}
		Message message = transition.getRaiseMessageEvent() == null ? null : transition.getRaiseMessageEvent().getMessage();

		printString = printString.replaceAll("\\{clockConstraintExpression}", getClockConstraintExpression(transition));
		printString = printString.replaceAll("\\{guardExpression\\}", getGuardExpression(transition));
		printString = printString.replaceAll("\\{receivingTransSchemaCondition\\}", getReceivingCommunicationSchemaConstraint(transition));
		printString = printString.replaceAll("\\{sendingTransSchemaCondition\\}", getSendingCommunicationSchemaConstraint(transition));
		printString = printString.replaceAll("\\{transSchemaTermCondition\\}", getTransferCommunicationTermConstraint(transition));
		printString = printString.replaceAll("\\{raiseMessageEventParameterBinding\\}", getMessageParameterBindingExpression(transition, message));
		printString = printString.replaceAll("\\{synchronizationExpression\\}", getSynchronizationExpression(synchronization, synchronizationExpression));
		printString = printString.replaceAll("\\{receivingRetryAfterExpression}", getReceivingRetryAfterExpression(transition));
		printString = printString.replaceAll("\\{sendingRetryAfterExpression}", getSendingRetryAfterExpression(transition));
		
		// #1001: Add manual linebreaks to prevent too long lines
		printString = ensureMaxLineLength(printString, MAX_LINELENGTH);
		printString = ensureMinLineLength(printString, MIN_LINELENGTH);
		return printString;
	}
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
	public static String getClockConstraintExpression(Transition transition) {
		StringBuffer buf = new StringBuffer();
		boolean first = true;
		for (ClockConstraint cc : transition.getClockConstraints()) {
			if (!first) {
				buf.append(", ");
			}
			if (cc.getClock() != null) {
				buf.append(cc.getClock().getName());
			} else {
				buf.append("null");
			}
			buf.append(' ');
			
			// I wrote the following helper program to find out bytes of UTF-8 characters:
//			public static void main(String[] args) throws UnsupportedEncodingException {
//				for (byte c : "x".getBytes()) {
//					System.out.println((int)(byte)c);
//				}
//			}
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
				buf.append(ParserUtilities.serializeTimeValue(cc.getBound(), transition));
			} else {
				buf.append("null");
			}
			first = false;
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
