package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.parsers;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.core.expressions.common.LiteralExpression;

import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.model.core.ParameterBinding;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Message;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser6003;

/**
 * @generated
 */
public class CustomTransitionLabelExpressionLabelParser6003 extends TransitionLabelExpressionLabelParser6003 {

	@Override
	protected void initializeEnvironment(Map<String, EClassifier> typeEnv,
			Map<String, Object> env, EObject context) {
		super.initializeEnvironment(typeEnv, env, context);
		Transition transition = (Transition) context;

		typeEnv.put("guardExpression", EcorePackage.Literals.ESTRING);
		env.put("guardExpression", getGuardExpression(transition));
		typeEnv.put("raiseMessageEventParameterBinding", EcorePackage.Literals.ESTRING);
		env.put("raiseMessageEventParameterBinding",
				getMessageParameterBindingExpression(transition,
						transition.getRaiseMessageEvent() == null ? null : transition.getRaiseMessageEvent().getMessage()));
		typeEnv.put("synchronizationParameterBinding", EcorePackage.Literals.ESTRING);

	}

	private String getGuardExpression(Transition transition) {
		Expression guard = transition.getGuard();
		if (guard != null) {
			String text = LanguageResource.serializeEObject(guard, transition);
			if (text == null) {
				// Xtext was not able to create a string for this kind of Model
				// Element.
				if (guard instanceof TextualExpression) {
					// Textual Expressions are not part of the Action Language,
					// so we process them separately here.
					text = ((TextualExpression) guard).getExpressionText();
				}
			}
			if (text != null && text.length() > 0) {
				// remove some from the beginning...
				char c = text.charAt(0);
				while (c == '{' || c == '\t' || c == ' ' || c == '\n') {
					text = text.substring(1);
					c = text.charAt(0);
				}
				return text;
			}
		}
		return "";
	}
	
	private String getParameterBindingExpression(Transition transition, ParameterBinding parameterBinding) {
		String value = LanguageResource.serializeEObject(parameterBinding.getValue(), transition);
		if (value == null && (parameterBinding.getValue() instanceof LiteralExpression)) {
			// just keep the LiteralExpression
			return ((LiteralExpression) parameterBinding.getValue()).getValue();
		}
		return value;
	}
	
	private String getParameterBindingExpressionFromList(Transition transition, List<ParameterBinding> parameterBindingList) {
		StringBuffer buffer = new StringBuffer();
		for (ParameterBinding parameterBinding : parameterBindingList) {
			buffer.append(getParameterBindingExpression(transition, parameterBinding) + ", ");
		}
		if (buffer.length() > 1) {
			// remove last comma
			return buffer.substring(0, buffer.length() - 2).toString();
		}
		return "";
	}
	
	private String getMessageParameterBindingExpression(Transition transition, Message message) {
		if (message == null) {
			return "";
		}
		return getParameterBindingExpressionFromList(transition, message.getParameterBinding());
	}
	

}
