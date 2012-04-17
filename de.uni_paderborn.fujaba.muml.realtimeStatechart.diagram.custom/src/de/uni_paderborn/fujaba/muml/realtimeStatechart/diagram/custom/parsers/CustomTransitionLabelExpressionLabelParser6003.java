package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.parsers;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action;
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

		typeEnv.put("actionExpression", EcorePackage.Literals.ESTRING);
		env.put("actionExpression", getActionExpression(transition.getAction()));

		typeEnv.put("guardExpression", EcorePackage.Literals.ESTRING);
		env.put("guardExpression", getGuardExpression(transition));

	}

	private String getGuardExpression(Transition transition) {
		Expression guard = transition.getGuard();
		if (guard != null) {
			String text = LanguageResource.serializeEObject(guard,
				transition.getStatechart().getAllAvailableAttributes());
			if (text != null) {
				// text is at least "{}"
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

	private String getActionExpression(Action action) {
		if (action != null) {
			// return getStringFor(action)
		}
		return "";
	}

}
