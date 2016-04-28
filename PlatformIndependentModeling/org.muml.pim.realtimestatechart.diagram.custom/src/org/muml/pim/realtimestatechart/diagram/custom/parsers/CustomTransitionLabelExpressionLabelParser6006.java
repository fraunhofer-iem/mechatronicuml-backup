package org.muml.pim.realtimestatechart.diagram.custom.parsers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.muml.mumlcore.CorePackage;
import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.actionlanguage.xtext.common.LanguageResource;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.realtimestatechart.AbsoluteDeadline;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.RelativeDeadline;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.diagram.parsers.TransitionLabelExpressionLabelParser6006;
import org.muml.pim.valuetype.TimeValue;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.pim.valuetype.impl.TimeValueImpl;

public class CustomTransitionLabelExpressionLabelParser6006 extends
		TransitionLabelExpressionLabelParser6006 implements ISemanticParser {
	
	public String getPrintString(IAdaptable element, int flags) {
		String printString = super.getPrintString(element, flags);
		Transition transition = (Transition) element.getAdapter(EObject.class);

		RelativeDeadline relativeDeadline = transition.getRelativeDeadline();
		if (relativeDeadline != null) {
			TimeValue lowerBound = relativeDeadline.getLowerBound();
			if (lowerBound != null && lowerBound.getValue() != null
					&& lowerBound.getUnit() != null) {
				printString = printString.replaceAll(
						"\\{relativeLowerBoundExpression\\}",
						ParserUtilities.serializeTimeValue(transition.getRelativeDeadline()
								.getLowerBound(), transition));
			}
			TimeValue upperBound = relativeDeadline.getUpperBound();
			if (upperBound != null && upperBound.getValue() != null) {
				printString = printString.replaceAll(
						"\\{relativeUpperBoundExpression\\}",
						ParserUtilities.serializeTimeValue(transition.getRelativeDeadline()
								.getUpperBound(), transition));
			}
		}

		boolean first = true;
		StringBuffer absoluteDeadlinesExpression = new StringBuffer();
		for (AbsoluteDeadline absoluteDeadline : transition
				.getAbsoluteDeadlines()) {
			if (!first) {
				absoluteDeadlinesExpression.append('\n');
			}
			first = false;
			if (absoluteDeadline.getClock() != null
					&& absoluteDeadline.getClock().getName() != null) {
				absoluteDeadlinesExpression.append(absoluteDeadline.getClock()
						.getName());
			} else {
				absoluteDeadlinesExpression.append("null");

			}

			absoluteDeadlinesExpression.append(" ∈ [");

			TimeValue lowerBound = absoluteDeadline.getLowerBound();
			if (lowerBound != null && lowerBound.getValue() != null
					&& lowerBound.getUnit() != null) {
				absoluteDeadlinesExpression.append(ParserUtilities.serializeTimeValue(
						lowerBound, transition));
			} else {
				absoluteDeadlinesExpression.append("null");
			}

			absoluteDeadlinesExpression.append(";");

			TimeValue upperBound = absoluteDeadline.getUpperBound();
			if (upperBound != null && upperBound.getValue() != null
					&& upperBound.getUnit() != null) {
				absoluteDeadlinesExpression.append(ParserUtilities.serializeTimeValue(
						upperBound, transition));
			} else {
				absoluteDeadlinesExpression.append("null");
			}

			absoluteDeadlinesExpression.append("]");
		}
		printString = printString.replaceAll(
				"\\{absoluteDeadlinesExpression\\}",
				absoluteDeadlinesExpression.toString());

		return printString;
	}

	// TODO: Replace this implementation by the OCL impact analyzer!
	final static Collection<EStructuralFeature> FEATURES = Arrays
			.asList(new EStructuralFeature[] {
					CorePackage.Literals.NAMED_ELEMENT__NAME,
					RealtimestatechartPackage.Literals.DEADLINE__LOWER_BOUND,
					RealtimestatechartPackage.Literals.DEADLINE__UPPER_BOUND,
					RealtimestatechartPackage.Literals.ABSOLUTE_DEADLINE__CLOCK,
					RealtimestatechartPackage.Literals.TRANSITION__ABSOLUTE_DEADLINES,
					RealtimestatechartPackage.Literals.TRANSITION__RELATIVE_DEADLINE,
					ValuetypePackage.Literals.TIME_VALUE__UNIT,
					ValuetypePackage.Literals.TIME_VALUE__VALUE //
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
		return ParserUtilities.deduceAllElements(semanticElement, REFERENCES);
	}

	@Override
	public boolean areSemanticElementsAffected(EObject listener,
			Object notification) {
		return FEATURES.contains(((ENotificationImpl) notification)
				.getFeature());
	}

}
