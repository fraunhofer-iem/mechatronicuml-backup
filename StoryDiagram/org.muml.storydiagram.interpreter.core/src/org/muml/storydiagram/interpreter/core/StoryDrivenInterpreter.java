package org.muml.storydiagram.interpreter.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.core.expressions.Expression;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityCallNode;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.calls.ParameterBinding;
import org.muml.storydiagram.interpreter.core.facade.StoryDrivenMetamodelFacadeFactory;
import org.muml.storydiagram.interpreter.core.mdelab.SDMException;
import org.muml.storydiagram.interpreter.core.mdelab.SDMInterpreter;
import org.muml.storydiagram.interpreter.core.mdelab.expressions.ExpressionInterpreterManager;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.NotificationEmitter;
import org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.StoryPatternMatcher;
import org.muml.storydiagram.interpreter.core.mdelab.variables.Variable;
import org.muml.storydiagram.interpreter.core.mdelab.variables.VariablesScope;
import org.muml.storydiagram.interpreter.core.patternmatcher.StoryDrivenPatternMatcher;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.StoryPattern;
import org.muml.storydiagram.patterns.expressions.ObjectVariableExpression;
import org.muml.storydiagram.patterns.expressions.PrimitiveVariableExpression;

public class StoryDrivenInterpreter
		extends
		SDMInterpreter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>
{

	public StoryDrivenInterpreter(
			final ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> expressionInterpreterManager)
	{
		this(expressionInterpreterManager, null);
	}

	public StoryDrivenInterpreter(
			final ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> expressionInterpreterManager,
			final NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> notificationEmitter)
	{
		super(StoryDrivenMetamodelFacadeFactory.INSTANCE, expressionInterpreterManager, notificationEmitter);
	}

	@Override
	protected StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> createStoryPatternMatcher(
			final StoryPattern storyPattern,
			final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> variablesScope)
			throws SDMException
	{
		return new StoryDrivenPatternMatcher(storyPattern, variablesScope, this.getExpressionInterpreterManager(),
				this.getNotificationEmitter());
	}

	@Override
	protected ActivityNode executeCustomNode(
			final ActivityNode node,
			final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> variablesScope)
			throws SDMException
	{
		if (node instanceof ActivityCallNode)
		{
			final ActivityCallNode activityCallNode = (ActivityCallNode) node;

			assert !activityCallNode.getCalledActivities().isEmpty();

			final Collection<Variable<EClassifier>> parameters = new ArrayList<Variable<EClassifier>>();

			assert !activityCallNode.getCalledActivities().isEmpty();

			/*
			 * TODO: implement polymorphic dispatch to select most suitable
			 * activity
			 */
			if (activityCallNode.getCalledActivities().size() > 1)
			{
				throw new UnsupportedOperationException("Polymorphic dispatch for ActivityCallNodes is not yet implemented.");
			}

			final Activity activity = activityCallNode.getCalledActivities().get(0);

			for (final ParameterBinding pb : activityCallNode.getOwnedParameterBindings())
			{
				if (!activity.getOutParameters().contains(pb.getParameter())) {
					parameters.add(new Variable<EClassifier>(pb.getParameter().getName(), pb.getParameter().getEType(), this
							.getExpressionInterpreterManager().evaluateExpression(pb.getValueExpression(), null, null, variablesScope)
							.getValue()));
				}
			}
			
			final StoryDrivenInterpreter sdi = new StoryDrivenInterpreter(this.getExpressionInterpreterManager(),
					this.getNotificationEmitter());

			final Map<String, Variable<EClassifier>> returnValues = sdi.executeActivity(activity, parameters);

			assert activity.getOutParameters().size() <= 1;
			//FIXME for outParameters > 1
			//for (final EParameter param : activity.getOutParameters())
			//{
			//	variablesScope.createVariable(param.getName(), param.getEType(), returnValues.get(param.getName()).getValue());
			//}
			
			if (activity.getOutParameters().size() == 1) {
			
				for (final ParameterBinding pb : activityCallNode.getOwnedParameterBindings())
				{
					if (activity.getOutParameters().contains(pb.getParameter())) {
						assert pb.getValueExpression() instanceof ObjectVariableExpression ||
							pb.getValueExpression() instanceof PrimitiveVariableExpression;
						
						assert returnValues.containsKey(pb.getParameter().getName());
						
						String variableName = null;
						if (pb.getValueExpression() instanceof ObjectVariableExpression) {
							variableName = ((ObjectVariableExpression)pb.getValueExpression()).getObject().getVariableName();
						} else {
							variableName = ((PrimitiveVariableExpression)pb.getValueExpression()).getPrimitiveVariable().getVariableName();
						}
						
						if (variablesScope.variableExists(variableName)) {
							variablesScope.changeVariableValue(
								variableName,
								returnValues.get(pb.getParameter().getName()).getValue());
						} else {
							variablesScope.createVariable(
									variableName,
									pb.getParameter().getEType(),
									returnValues.get(pb.getParameter().getName()).getValue());
							
						}
						break;
					}
				}
				
			}
			
			assert node.getOutgoings().size() == 1;
			assert node.getOutgoings().get(0).getTarget() != null;

			return node.getOutgoings().get(0).getTarget();
		}
		else
		{
			throw new UnsupportedOperationException();
		}
	}
}
