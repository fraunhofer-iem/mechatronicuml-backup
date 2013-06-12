package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.parsers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.storydriven.core.CorePackage;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.core.expressions.common.LiteralExpression;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Message;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.TransitionLabelExpressionLabelParser6005;

public class CustomTransitionLabelExpressionLabelParser6005 extends
		TransitionLabelExpressionLabelParser6005 implements ISemanticParser {

	public String getPrintString(IAdaptable element, int flags) {
		String printString = super.getPrintString(element, flags);
		Transition transition = (Transition) element.getAdapter(EObject.class);

		printString = printString.replaceAll("\\{guardExpression\\}",
				getGuardExpression(transition));

		Message message = transition.getRaiseMessageEvent() == null ? null
				: transition.getRaiseMessageEvent().getMessage();

		printString = printString.replaceAll(
				"\\{raiseMessageEventParameterBinding\\}",
				getMessageParameterBindingExpression(transition, message));
		
		Synchronization synchronization = transition.getSynchronization();
		Expression expression = null;
		if (synchronization != null) {
			expression = synchronization.getSelectorExpression();
		}
		
		printString = printString.replaceAll(
				"\\{synchronizationExpression\\}",
				getSynchronizationExpression(synchronization, expression));

		return printString;
	}

	private String getSynchronizationExpression(Synchronization context, Expression expression) {
		String serialization = null;
		if (context != null && expression != null) {
			if (expression instanceof TextualExpression) {
				serialization = ((TextualExpression) expression).getExpressionText();
			} else {
				serialization = LanguageResource.serializeEObjectSafe(expression, context);
			}
		}
		if (serialization != null) {
			return "[" + serialization + "]";
		}
		return "";
	}

	private String getGuardExpression(Transition transition) {
		Expression guard = transition.getGuard();
		if (guard != null) {
			String text = null;
			if (guard instanceof TextualExpression) {
				// Textual Expressions are not part of the Action Language,
				// so we process them separately here.
				text = ((TextualExpression) guard).getExpressionText();
			} else {
				text = LanguageResource.serializeEObjectSafe(guard, transition);
			}
		
			if (text != null && text.length() > 0) {
				// remove some from the beginning...
				char c = text.charAt(0);
				while (c == '{' || c == '\t' || c == ' ' || c == '\n') {
					text = text.substring(1);
					c = text.charAt(0);
				}
				return "[" + text + "]";
			}
		}
		return "";
	}

	private String getParameterBindingExpression(Transition transition,
			ParameterBinding parameterBinding) {
		String value = LanguageResource.serializeEObjectSafe(
				parameterBinding.getValue(), transition);
		return value;
	}

	private String getParameterBindingExpressionFromList(Transition transition,
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

	private String getMessageParameterBindingExpression(Transition transition,
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
					RealtimestatechartPackage.Literals.TRANSITION__GUARD,
					RealtimestatechartPackage.Literals.TRANSITION__TRIGGER_MESSAGE_EVENT,
					RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE,
					RealtimestatechartPackage.Literals.MESSAGE__INSTANCE_OF,
					RealtimestatechartPackage.Literals.TRANSITION__SYNCHRONIZATION,
					RealtimestatechartPackage.Literals.SYNCHRONIZATION__SYNC_CHANNEL,
					RealtimestatechartPackage.Literals.SYNCHRONIZATION__KIND,
					RealtimestatechartPackage.Literals.TRANSITION__ACTION,
					RealtimestatechartPackage.Literals.TRANSITION__RAISE_MESSAGE_EVENT,
					RealtimestatechartPackage.Literals.TRANSITION__CLOCK_RESETS,
					RealtimestatechartPackage.Literals.MESSAGE__PARAMETER_BINDING,
					BehaviorPackage.Literals.PARAMETER_BINDING__VALUE,//
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

	@Override
	public List<EObject> getSemanticElementsBeingParsed(EObject semanticElement) {
		// deduce semantic elements
		List<EObject> elements = new ArrayList<EObject>();
		elements.add(semanticElement); // start with the parser element

		// deduce other elements
		List<EObject> foundElements;
		List<EObject> lastElements = new ArrayList<EObject>(elements);
		do {
			foundElements = new ArrayList<EObject>();
			for (EObject element : lastElements) {
				for (EReference reference : REFERENCES) {
					if (reference.getEContainingClass()
							.equals(element.eClass())) {
						Object value = element.eGet(reference);
						if (value instanceof Collection) {
							foundElements.addAll((Collection<EObject>) value);
						} else if (value instanceof EObject) {
							foundElements.add((EObject) value);
						} else if (value != null) {
							throw new UnsupportedOperationException(
									"Invalid reference value");
						}
					}
				}
				// Watch complete expression hierarchy
				if (element instanceof Expression) {
					foundElements.addAll(element.eContents());
				}
			}
			elements.addAll(foundElements);
			lastElements = foundElements;
		} while (!foundElements.isEmpty());

		return elements;
	}

	@Override
	public boolean areSemanticElementsAffected(EObject listener,
			Object notification) {
		return FEATURES.contains(((ENotificationImpl) notification)
				.getFeature());
	}
}
