package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.parsers;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.storydriven.core.expressions.Expression;

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
		env.put("guardExpression", getGuardExpression(transition.getGuard()));

	}

	private String getGuardExpression(Expression guard) {
		if (guard != null) {
			// return getStringFor(guard)
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
