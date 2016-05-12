package org.muml.storydiagram.interpreter.core.executiontrace;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

import org.eclipse.emf.ecore.EClassifier;
import org.muml.storydiagram.interpreter.core.executiontrace.ActivityEdgeTraversal;
import org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution;
import org.muml.storydiagram.interpreter.core.executiontrace.ActivityNodeExecution;
import org.muml.storydiagram.interpreter.core.executiontrace.AttributeValueSet;
import org.muml.storydiagram.interpreter.core.executiontrace.Execution;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontraceFactory;
import org.muml.storydiagram.interpreter.core.executiontrace.ExpressionEvaluation;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkCreation;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkDeletion;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectCreation;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectDeletion;
import org.muml.storydiagram.interpreter.core.executiontrace.LinkCheckFailed;
import org.muml.storydiagram.interpreter.core.executiontrace.LinkCheckSuccessful;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternApplication;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintHolds;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintViolated;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternInitialization;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternMatching;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBindingRevoked;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBound;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintHolds;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintViolated;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectNotBound;
import org.muml.storydiagram.interpreter.core.executiontrace.TraversingLink;
import org.muml.storydiagram.interpreter.core.executiontrace.VariableChanged;
import org.muml.storydiagram.interpreter.core.executiontrace.VariableCreated;
import org.muml.storydiagram.interpreter.core.executiontrace.VariableDeleted;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.ActivityExecutionFinishedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.ActivityExecutionStartedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.ActivityNodeExecutionFinishedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.ActivityNodeExecutionStartedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.AttributeValueSetNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.EvaluatedExpressionNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.EvaluatingExpressionNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.InstanceLinkCreatedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.InstanceLinkDestroyedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.InstanceObjectCreatedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.InstanceObjectDestroyedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.InterpreterNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.LinkCheckFailedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.LinkCheckSuccessfulNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.NotificationReceiver;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternApplicationFinishedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternApplicationStartedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternConstraintHoldsNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternConstraintViolatedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternInitializationFinishedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternInitializationStartedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternMatchingFailedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternMatchingStartedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternMatchingSuccessfulNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternObjectBindingRevokedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternObjectBoundNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternObjectConstraintHoldsNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternObjectConstraintViolatedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternObjectNotBoundNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.TraversingActivityEdgeNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.TraversingLinkNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.VariableCreatedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.VariableDeletedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.VariableValueChangedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.variables.Variable;

public class ExecutionTraceNotificationReceiver<ActivityType, ActivityNodeType, ActivityEdgeType, StoryPatternType, StoryPatternObjectType, StoryPatternLinkType, ClassifierType, FeatureType, ExpressionType>
		implements NotificationReceiver<ClassifierType>
{
	private ExecutionTrace							executionTrace;

	private Stack<Execution>						currentContainerStack;

	private Map<Execution, List<Execution>>			containerToChildrenMap;

	private List<Execution>							executionTraceChildren;

	private final ProfilingFilter<ClassifierType>[]	filters;

	@SuppressWarnings("unchecked")
	public ExecutionTraceNotificationReceiver(final ProfilingFilter<ClassifierType>[] filters)
	{
		this.reset();

		if (filters == null)
		{
			this.filters = new ProfilingFilter[0];
		}
		else
		{
			this.filters = filters;
		}
	}

	public ExecutionTraceNotificationReceiver()
	{
		this(null);
	}

	public void reset()
	{
		this.executionTrace = ExecutiontraceFactory.eINSTANCE.createExecutionTrace();
		this.currentContainerStack = new Stack<Execution>();
		this.containerToChildrenMap = new HashMap<Execution, List<Execution>>();
		this.executionTraceChildren = new LinkedList<Execution>();
	}

	private void addChildToCurrentContainer(final Execution child)
	{
		List<Execution> list = this.containerToChildrenMap.get(this.currentContainerStack.peek());

		if (list == null)
		{
			list = new LinkedList<Execution>();
			this.containerToChildrenMap.put(this.currentContainerStack.peek(), list);
		}

		list.add(child);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void notifyChanged(final InterpreterNotification<ClassifierType> notification)
	{
		for (final ProfilingFilter<ClassifierType> filter : this.filters)
		{
			if (!filter.doProfile(notification))
			{
				return;
			}
		}

		switch (notification.getNotificationType())
		{
			case ACTIVITY_EXECUTION_STARTED:
			{
				this.handleActivityExecutionStarted((ActivityExecutionStartedNotification<ActivityType, ClassifierType>) notification);

				break;
			}
			case ACTIVITY_EXECUTION_FINISHED:
			{
				this.handleActivityExecutionFinished((ActivityExecutionFinishedNotification<ActivityType, ClassifierType>) notification);

				break;
			}
			case ACTIVITY_NODE_EXECUTION_STARTED:
			{
				this.handleActivityNodeExecutionStarted((ActivityNodeExecutionStartedNotification<ActivityNodeType, ClassifierType>) notification);

				break;
			}
			case ACTIVITY_NODE_EXECUTION_FINISHED:
			{
				this.handleActivityNodeExecutionFinished((ActivityNodeExecutionFinishedNotification<ActivityNodeType, ClassifierType>) notification);

				break;
			}
			case TRAVERSING_ACTIVITY_EDGE:
			{
				this.handleTraversingActivityEdge((TraversingActivityEdgeNotification<ActivityEdgeType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_INITIALIZATION_STARTED:
			{
				this.handleStoryPatternInitializationStarted((StoryPatternInitializationStartedNotification<StoryPatternType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_INITIALIZATION_FINISHED:
			{
				this.handleStoryPatternInitializationFinished((StoryPatternInitializationFinishedNotification<StoryPatternType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_MATCHING_STARTED:
			{
				this.handleStoryPatternMatchingStarted((StoryPatternMatchingStartedNotification<StoryPatternType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_MATCHING_SUCCESSFUL:
			{
				this.handleStoryPatternMatchingSuccesful((StoryPatternMatchingSuccessfulNotification<StoryPatternType, ClassifierType>) notification);

				break;
			}

			case STORY_PATTERN_MATCHING_FAILED:
			{
				this.handleStoryPatternMatchingFailed((StoryPatternMatchingFailedNotification<StoryPatternType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_APPLICATION_STARTED:
			{
				this.handleStoryPatternApplicationStarted((StoryPatternApplicationStartedNotification<StoryPatternType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_APPLICATION_FINISHED:
			{
				this.handleStoryPatternApplicationFinished((StoryPatternApplicationFinishedNotification<StoryPatternType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_OBJECT_BOUND:
			{
				this.handleStoryPatternObjectBound((StoryPatternObjectBoundNotification<StoryPatternObjectType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_OBJECT_NOT_BOUND:
			{
				this.handleStoryPatternObjectNotBound((StoryPatternObjectNotBoundNotification<StoryPatternObjectType, ClassifierType>) notification);

				break;
			}
			case STORY_PATTERN_OBJECT_BINDING_REVOKED:
			{
				this.handleStoryPatternObjectBindingRevoked((StoryPatternObjectBindingRevokedNotification<StoryPatternObjectType, ClassifierType>) notification);

				break;
			}
			case TRAVERSING_LINK:
			{
				this.handleTraversingLink((TraversingLinkNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType>) notification);

				break;
			}
			case LINK_CHECK_SUCCESSFUL:
			{
				this.handleLinkCheckSuccessful((LinkCheckSuccessfulNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType>) notification);

				break;
			}
			case LINK_CHECK_FAILED:
			{
				this.handleLinkCheckFailed((LinkCheckFailedNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType>) notification);

				break;
			}
			case EVALUATING_EXPRESSION:
			{
				this.handleEvaluatingExpression((EvaluatingExpressionNotification<ClassifierType, ExpressionType>) notification);

				break;
			}
			case EVALUATED_EXPRESSION:
			{
				this.handleEvaluatedExpression((EvaluatedExpressionNotification<ClassifierType, ExpressionType>) notification);

				break;
			}
			case INSTANCE_OBJECT_CREATED:
			{
				this.handleInstanceObjectCreated((InstanceObjectCreatedNotification<StoryPatternObjectType, ClassifierType>) notification);

				break;
			}
			case INSTANCE_OBJECT_DESTROYED:
			{
				this.handleInstanceObjectDesctroyed((InstanceObjectDestroyedNotification<StoryPatternObjectType, ClassifierType>) notification);

				break;
			}
			case INSTANCE_LINK_CREATED:
			{
				this.handleInstanceLinkCreated((InstanceLinkCreatedNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType>) notification);

				break;
			}
			case INSTANCE_LINK_DESTROYED:
			{
				this.handleInstanceLinkDestroyed((InstanceLinkDestroyedNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType>) notification);

				break;
			}
			case VARIABLE_CREATED:
			{
				this.handleVariableCreated((VariableCreatedNotification<ClassifierType>) notification);

				break;
			}
			case VARIABLE_DELETED:
			{
				this.handleVariableDeleted((VariableDeletedNotification<ClassifierType>) notification);

				break;
			}
			case VARIABLE_VALUE_CHANGED:
			{
				this.handleVariableValueChanged((VariableValueChangedNotification<ClassifierType>) notification);

				break;
			}
			case ATTRIBUTE_VALUE_SET:
			{
				this.handleAttributeValueSet((AttributeValueSetNotification<StoryPatternObjectType, ClassifierType, FeatureType>) notification);

				break;
			}
			case STORY_PATTERN_CONSTRAINT_HOLDS:
			{
				this.handleStoryPatternConstraintHolds((StoryPatternConstraintHoldsNotification<StoryPatternType, ClassifierType, ExpressionType>) notification);

				break;
			}
			case STORY_PATTERN_CONSTRAINT_VIOLATED:
			{
				this.handleStoryPatternConstraintViolated((StoryPatternConstraintViolatedNotification<StoryPatternType, ClassifierType, ExpressionType>) notification);

				break;
			}
			case STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS:
			{
				this.handleStoryPatternObjectConstraintHolds((StoryPatternObjectConstraintHoldsNotification<StoryPatternObjectType, ClassifierType, ExpressionType>) notification);

				break;
			}
			case STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED:
			{
				this.handleStoryPatternObjectConstraintViolated((StoryPatternObjectConstraintViolatedNotification<StoryPatternObjectType, ClassifierType, ExpressionType>) notification);

				break;
			}
			default:
				throw new UnsupportedOperationException();
		}
	}

	private void handleActivityNodeExecutionStarted(
			final ActivityNodeExecutionStartedNotification<ActivityNodeType, ClassifierType> notification)
	{
		final ActivityNodeExecution<ActivityNodeType> a = ExecutiontraceFactory.eINSTANCE.createActivityNodeExecution();

		a.setActivityNode(notification.getActivityNode());
		a.setExecutionStartedTimeStamp(System.nanoTime());

		this.addChildToCurrentContainer(a);

		this.currentContainerStack.push(a);
	}

	private void handleActivityNodeExecutionFinished(
			final ActivityNodeExecutionFinishedNotification<ActivityNodeType, ClassifierType> notification)
	{
		assert this.currentContainerStack.peek() instanceof ActivityNodeExecution;

		@SuppressWarnings("unchecked")
		final ActivityNodeExecution<ActivityNodeType> e = (ActivityNodeExecution<ActivityNodeType>) this.currentContainerStack.pop();

		assert e.getActivityNode() == notification.getActivityNode();

		e.setExecutionFinishedTimeStamp(System.nanoTime());
	}

	private void handleTraversingActivityEdge(final TraversingActivityEdgeNotification<ActivityEdgeType, ClassifierType> notification)
	{
		final ActivityEdgeTraversal<ActivityEdgeType> a = ExecutiontraceFactory.eINSTANCE.createActivityEdgeTraversal();
		a.setActivityEdge(notification.getActivityEdge());
		a.setExecutionStartedTimeStamp(System.nanoTime());
		a.setExecutionFinishedTimeStamp(a.getExecutionStartedTimeStamp());

		this.addChildToCurrentContainer(a);
	}

	private void handleStoryPatternInitializationStarted(
			final StoryPatternInitializationStartedNotification<StoryPatternType, ClassifierType> notification)
	{
		final StoryPatternInitialization<StoryPatternType> s = ExecutiontraceFactory.eINSTANCE.createStoryPatternInitialization();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setStoryPattern(notification.getStoryPattern());

		this.addChildToCurrentContainer(s);

		this.currentContainerStack.push(s);
	}

	private void handleStoryPatternInitializationFinished(
			final StoryPatternInitializationFinishedNotification<StoryPatternType, ClassifierType> notification)
	{
		assert this.currentContainerStack.peek() instanceof StoryPatternInitialization;

		@SuppressWarnings("unchecked")
		final StoryPatternInitialization<StoryPatternType> s = (StoryPatternInitialization<StoryPatternType>) this.currentContainerStack
				.pop();

		assert s.getStoryPattern() == notification.getStoryPattern();

		s.setExecutionFinishedTimeStamp(System.nanoTime());
	}

	private void handleStoryPatternMatchingStarted(
			final StoryPatternMatchingStartedNotification<StoryPatternType, ClassifierType> notification)
	{
		final StoryPatternMatching<StoryPatternType> s = ExecutiontraceFactory.eINSTANCE.createStoryPatternMatching();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setStoryPattern(notification.getStoryPattern());

		this.addChildToCurrentContainer(s);

		this.currentContainerStack.push(s);
	}

	@SuppressWarnings("unchecked")
	private void handleStoryPatternMatchingSuccesful(
			final StoryPatternMatchingSuccessfulNotification<StoryPatternType, ClassifierType> notification)
	{
		final StoryPatternMatching<StoryPatternType> s = (StoryPatternMatching<StoryPatternType>) this.currentContainerStack.pop();

		assert ((StoryPatternMatchingSuccessfulNotification<StoryPatternType, EClassifier>) notification).getStoryPattern() == s
				.getStoryPattern();

		s.setExecutionFinishedTimeStamp(System.nanoTime());

		s.setSuccessful(true);
	}

	@SuppressWarnings("unchecked")
	private void handleStoryPatternMatchingFailed(
			final StoryPatternMatchingFailedNotification<StoryPatternType, ClassifierType> notification)
	{
		final StoryPatternMatching<StoryPatternType> s = (StoryPatternMatching<StoryPatternType>) this.currentContainerStack.pop();

		assert ((StoryPatternMatchingFailedNotification<StoryPatternType, EClassifier>) notification).getStoryPattern() == s
				.getStoryPattern();

		s.setExecutionFinishedTimeStamp(System.nanoTime());

		s.setSuccessful(false);
	}

	private void handleStoryPatternApplicationStarted(
			final StoryPatternApplicationStartedNotification<StoryPatternType, ClassifierType> notification)
	{
		final StoryPatternApplication<StoryPatternType> s = ExecutiontraceFactory.eINSTANCE.createStoryPatternApplication();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setStoryPattern(notification.getStoryPattern());

		this.addChildToCurrentContainer(s);

		this.currentContainerStack.push(s);
	}

	private void handleStoryPatternApplicationFinished(
			final StoryPatternApplicationFinishedNotification<StoryPatternType, ClassifierType> notification)
	{
		assert this.currentContainerStack.peek() instanceof StoryPatternApplication;

		@SuppressWarnings("unchecked")
		final StoryPatternApplication<StoryPatternType> s = (StoryPatternApplication<StoryPatternType>) this.currentContainerStack.pop();

		assert s.getStoryPattern() == notification.getStoryPattern();

		s.setExecutionFinishedTimeStamp(System.nanoTime());
	}

	private void handleStoryPatternObjectBound(
			final StoryPatternObjectBoundNotification<StoryPatternObjectType, ClassifierType> notification)
	{
		final StoryPatternObjectBound<StoryPatternObjectType> s = ExecutiontraceFactory.eINSTANCE.createStoryPatternObjectBound();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setExecutionFinishedTimeStamp(s.getExecutionStartedTimeStamp());
		s.setStoryPatternObject(notification.getStoryPatternObject());
		s.setValue(notification.getInstanceObject().toString());

		this.addChildToCurrentContainer(s);
	}

	private void handleStoryPatternObjectNotBound(
			final StoryPatternObjectNotBoundNotification<StoryPatternObjectType, ClassifierType> notification)
	{
		final StoryPatternObjectNotBound<StoryPatternObjectType> s = ExecutiontraceFactory.eINSTANCE.createStoryPatternObjectNotBound();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setExecutionFinishedTimeStamp(s.getExecutionStartedTimeStamp());
		s.setStoryPatternObject(notification.getStoryPatternObject());

		this.addChildToCurrentContainer(s);
	}

	private void handleStoryPatternObjectBindingRevoked(
			final StoryPatternObjectBindingRevokedNotification<StoryPatternObjectType, ClassifierType> notification)
	{
		final StoryPatternObjectBindingRevoked<StoryPatternObjectType> s = ExecutiontraceFactory.eINSTANCE
				.createStoryPatternObjectBindingRevoked();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setExecutionFinishedTimeStamp(s.getExecutionStartedTimeStamp());
		s.setStoryPatternObject(notification.getStoryPatternObject());
		s.setPreviousValue(notification.getInstanceObject().toString());

		this.addChildToCurrentContainer(s);
	}

	private void handleTraversingLink(
			final TraversingLinkNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType> notification)
	{
		final TraversingLink<StoryPatternLinkType, StoryPatternObjectType> e = ExecutiontraceFactory.eINSTANCE.createTraversingLink();
		e.setExecutionStartedTimeStamp(System.nanoTime());
		e.setExecutionFinishedTimeStamp(e.getExecutionStartedTimeStamp());
		e.setStoryPatternLink(notification.getLink());
		e.setSourceStoryPatternObject(notification.getSourceStoryPatternObject());
		e.setTargetStoryPatternObject(notification.getTargetStoryPatternObject());
		e.setSourceObject(notification.getSourceObject().toString());

		this.addChildToCurrentContainer(e);
	}

	private void handleLinkCheckSuccessful(
			final LinkCheckSuccessfulNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType> notification)
	{
		final LinkCheckSuccessful<StoryPatternLinkType, StoryPatternObjectType> e = ExecutiontraceFactory.eINSTANCE
				.createLinkCheckSuccessful();
		e.setExecutionStartedTimeStamp(System.nanoTime());
		e.setExecutionFinishedTimeStamp(e.getExecutionStartedTimeStamp());
		e.setSourceStoryPatternObject(notification.getSourceStoryPatternObject());
		e.setTargetStoryPatternObject(notification.getTargetStoryPatternObject());
		e.setSourceObject(notification.getSourceObject().toString());
		e.setTargetObject(notification.getTargetObject().toString());
		e.setStoryPatternLink(notification.getLink());

		this.addChildToCurrentContainer(e);
	}

	private void handleLinkCheckFailed(
			final LinkCheckFailedNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType> notification)
	{
		final LinkCheckFailed<StoryPatternLinkType, StoryPatternObjectType> e = ExecutiontraceFactory.eINSTANCE.createLinkCheckFailed();
		e.setExecutionStartedTimeStamp(System.nanoTime());
		e.setExecutionFinishedTimeStamp(e.getExecutionStartedTimeStamp());
		e.setSourceStoryPatternObject(notification.getSourceStoryPatternObject());
		e.setTargetStoryPatternObject(notification.getTargetStoryPatternObject());
		e.setSourceObject(notification.getSourceObject().toString());
		e.setTargetObject(notification.getTargetObject().toString());
		e.setStoryPatternLink(notification.getLink());

		this.addChildToCurrentContainer(e);
	}

	private void handleEvaluatingExpression(final EvaluatingExpressionNotification<ClassifierType, ExpressionType> notification)
	{
		final ExpressionEvaluation<ExpressionType> e = ExecutiontraceFactory.eINSTANCE.createExpressionEvaluation();
		e.setExecutionStartedTimeStamp(System.nanoTime());
		e.setExpression(notification.getExpression());

		this.addChildToCurrentContainer(e);

		this.currentContainerStack.push(e);
	}

	private void handleEvaluatedExpression(final EvaluatedExpressionNotification<ClassifierType, ExpressionType> notification)
	{
		assert this.currentContainerStack.peek() instanceof ExpressionEvaluation;

		@SuppressWarnings("unchecked")
		final ExpressionEvaluation<ExpressionType> e = (ExpressionEvaluation<ExpressionType>) this.currentContainerStack.pop();

		assert e.getExpression() == notification.getExpression();
		e.setExecutionFinishedTimeStamp(System.nanoTime());

		if (notification.getResult() == null)
		{
			e.setResult("null");
		}
		else
		{
			e.setResult(notification.getResult().toString());
		}
	}

	private void handleInstanceObjectCreated(final InstanceObjectCreatedNotification<StoryPatternObjectType, ClassifierType> notification)
	{
		final InstanceObjectCreation<StoryPatternObjectType> i = ExecutiontraceFactory.eINSTANCE.createInstanceObjectCreation();

		i.setExecutionStartedTimeStamp(System.nanoTime());
		i.setExecutionFinishedTimeStamp(i.getExecutionFinishedTimeStamp());
		i.setStoryPatternObject(notification.getStoryPatternObject());
		i.setInstanceObject(notification.getInstanceObject().toString());

		this.addChildToCurrentContainer(i);
	}

	private void handleInstanceObjectDesctroyed(
			final InstanceObjectDestroyedNotification<StoryPatternObjectType, ClassifierType> notification)
	{
		final InstanceObjectDeletion<StoryPatternObjectType> i = ExecutiontraceFactory.eINSTANCE.createInstanceObjectDeletion();

		i.setExecutionStartedTimeStamp(System.nanoTime());
		i.setExecutionFinishedTimeStamp(i.getExecutionFinishedTimeStamp());
		i.setStoryPatternObject(notification.getStoryPatternObject());
		i.setInstanceObject(notification.getInstanceObject().toString());

		this.addChildToCurrentContainer(i);
	}

	private void handleInstanceLinkCreated(
			final InstanceLinkCreatedNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType> notification)
	{
		final InstanceLinkCreation<StoryPatternLinkType, StoryPatternObjectType> i = ExecutiontraceFactory.eINSTANCE
				.createInstanceLinkCreation();

		i.setExecutionStartedTimeStamp(System.nanoTime());
		i.setExecutionFinishedTimeStamp(i.getExecutionStartedTimeStamp());
		i.setSourceStoryPatternObject(notification.getSourceStoryPatternObject());
		i.setTargetStoryPatternObject(notification.getTargetStoryPatternObject());
		i.setSourceInstanceObject(notification.getSourceObject().toString());
		i.setTargetInstanceObject(notification.getTargetObject().toString());

		this.addChildToCurrentContainer(i);
	}

	private void handleInstanceLinkDestroyed(
			final InstanceLinkDestroyedNotification<StoryPatternObjectType, StoryPatternLinkType, ClassifierType> notification)
	{
		final InstanceLinkDeletion<StoryPatternLinkType, StoryPatternObjectType> i = ExecutiontraceFactory.eINSTANCE
				.createInstanceLinkDeletion();

		i.setExecutionStartedTimeStamp(System.nanoTime());
		i.setExecutionFinishedTimeStamp(i.getExecutionStartedTimeStamp());
		i.setSourceStoryPatternObject(notification.getSourceStoryPatternObject());
		i.setTargetStoryPatternObject(notification.getTargetStoryPatternObject());
		i.setSourceInstanceObject(notification.getSourceObject().toString());
		i.setTargetInstanceObject(notification.getTargetObject().toString());

		this.addChildToCurrentContainer(i);
	}

	private void handleVariableCreated(final VariableCreatedNotification<ClassifierType> notification)
	{
		final VariableCreated<ClassifierType> v = ExecutiontraceFactory.eINSTANCE.createVariableCreated();
		v.setExecutionStartedTimeStamp(System.nanoTime());
		v.setExecutionFinishedTimeStamp(v.getExecutionStartedTimeStamp());

		final Variable<ClassifierType> variable = notification.getVariable();
		v.setVariableName(variable.getName());
		v.setClassifier(variable.getClassifier());

		if (variable.getValue() == null)
		{
			v.setValue("null");
		}
		else
		{
			v.setValue(variable.getValue().toString());
		}

		this.addChildToCurrentContainer(v);
	}

	private void handleVariableDeleted(final VariableDeletedNotification<ClassifierType> notification)
	{
		final VariableDeleted<ClassifierType> v = ExecutiontraceFactory.eINSTANCE.createVariableDeleted();
		v.setExecutionStartedTimeStamp(System.nanoTime());
		v.setExecutionFinishedTimeStamp(v.getExecutionStartedTimeStamp());

		final Variable<ClassifierType> variable = notification.getVariable();
		v.setVariableName(variable.getName());
		v.setClassifier(variable.getClassifier());

		if (variable.getValue() == null)
		{
			v.setValue("null");
		}
		else
		{
			v.setValue(variable.getValue().toString());
		}

		this.addChildToCurrentContainer(v);
	}

	private void handleVariableValueChanged(final VariableValueChangedNotification<ClassifierType> notification)
	{
		final VariableChanged<ClassifierType> v = ExecutiontraceFactory.eINSTANCE.createVariableChanged();
		v.setExecutionStartedTimeStamp(System.nanoTime());
		v.setExecutionFinishedTimeStamp(v.getExecutionStartedTimeStamp());

		final Variable<ClassifierType> variable = notification.getVariable();
		v.setVariableName(variable.getName());
		v.setClassifier(variable.getClassifier());

		if (variable.getValue() == null)
		{
			v.setValue("null");
		}
		else
		{
			v.setValue(variable.getValue().toString());
		}

		if (notification.getOldValue() == null)
		{
			v.setOldValue("null");
		}
		else
		{
			v.setOldValue(notification.getOldValue().toString());
		}

		this.addChildToCurrentContainer(v);
	}

	private void handleAttributeValueSet(
			final AttributeValueSetNotification<StoryPatternObjectType, ClassifierType, FeatureType> notification)
	{
		final AttributeValueSet<StoryPatternObjectType, FeatureType> a = ExecutiontraceFactory.eINSTANCE.createAttributeValueSet();
		a.setExecutionStartedTimeStamp(System.nanoTime());
		a.setExecutionFinishedTimeStamp(a.getExecutionStartedTimeStamp());
		a.setFeature(notification.getFeature());
		a.setStoryPatternObject(notification.getStoryPatternObject());
		a.setInstanceObject(notification.getInstanceObject().toString());

		if (notification.getFeatureValue() == null)
		{
			a.setNewValue("null");
		}
		else
		{
			a.setNewValue(notification.getFeatureValue().toString());
		}

		this.addChildToCurrentContainer(a);
	}

	private void handleStoryPatternConstraintHolds(
			final StoryPatternConstraintHoldsNotification<StoryPatternType, ClassifierType, ExpressionType> notification)
	{
		final StoryPatternConstraintHolds<StoryPatternType, ExpressionType> s = ExecutiontraceFactory.eINSTANCE
				.createStoryPatternConstraintHolds();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setExecutionFinishedTimeStamp(s.getExecutionStartedTimeStamp());
		s.setStoryPattern(notification.getStoryPattern());
		s.setConstraint(notification.getConstraint());

		this.addChildToCurrentContainer(s);
	}

	private void handleStoryPatternConstraintViolated(
			final StoryPatternConstraintViolatedNotification<StoryPatternType, ClassifierType, ExpressionType> notification)
	{
		final StoryPatternConstraintViolated<StoryPatternType, ExpressionType> s = ExecutiontraceFactory.eINSTANCE
				.createStoryPatternConstraintViolated();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setExecutionFinishedTimeStamp(s.getExecutionStartedTimeStamp());
		s.setStoryPattern(notification.getStoryPattern());
		s.setConstraint(notification.getConstraint());

		this.addChildToCurrentContainer(s);
	}

	private void handleStoryPatternObjectConstraintHolds(
			final StoryPatternObjectConstraintHoldsNotification<StoryPatternObjectType, ClassifierType, ExpressionType> notification)
	{
		final StoryPatternObjectConstraintHolds<StoryPatternObjectType, ExpressionType> s = ExecutiontraceFactory.eINSTANCE
				.createStoryPatternObjectConstraintHolds();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setExecutionFinishedTimeStamp(s.getExecutionStartedTimeStamp());
		s.setStoryPatternObject(notification.getStoryPatternObject());
		s.setConstraint(notification.getConstraint());

		this.addChildToCurrentContainer(s);
	}

	private void handleStoryPatternObjectConstraintViolated(
			final StoryPatternObjectConstraintViolatedNotification<StoryPatternObjectType, ClassifierType, ExpressionType> notification)
	{
		final StoryPatternObjectConstraintViolated<StoryPatternObjectType, ExpressionType> s = ExecutiontraceFactory.eINSTANCE
				.createStoryPatternObjectConstraintViolated();
		s.setExecutionStartedTimeStamp(System.nanoTime());
		s.setExecutionFinishedTimeStamp(s.getExecutionStartedTimeStamp());
		s.setStoryPatternObject(notification.getStoryPatternObject());
		s.setConstraint(notification.getConstraint());

		this.addChildToCurrentContainer(s);
	}

	private void handleActivityExecutionStarted(final ActivityExecutionStartedNotification<ActivityType, ClassifierType> notification)
	{
		final ActivityExecution<ActivityType> a = ExecutiontraceFactory.eINSTANCE.createActivityExecution();
		a.setActivity(notification.getActivity());
		a.setExecutionStartedTimeStamp(System.nanoTime());

		for (final Variable<ClassifierType> var : notification.getParameters())
		{
			if (var.getValue() != null)
			{
				a.getInParameterValues().put(var.getName(), var.getValue().toString());
			}
			else
			{
				a.getInParameterValues().put(var.getName(), "null");
			}
		}

		if (this.currentContainerStack.isEmpty())
		{
			this.executionTraceChildren.add(a);
		}
		else
		{
			this.addChildToCurrentContainer(a);
		}

		this.currentContainerStack.push(a);
	}

	private void handleActivityExecutionFinished(final ActivityExecutionFinishedNotification<ActivityType, ClassifierType> notification)
	{
		assert this.currentContainerStack.peek() instanceof ActivityExecution;

		@SuppressWarnings("unchecked")
		final ActivityExecution<ActivityType> a = (ActivityExecution<ActivityType>) this.currentContainerStack.pop();

		assert a.getActivity() == notification.getActivity();

		a.setExecutionFinishedTimeStamp(System.nanoTime());

		for (final Variable<ClassifierType> var : notification.getReturnValues().values())
		{
			if (var.getValue() != null)
			{
				a.getOutParameterValues().put(var.getName(), var.getValue().toString());
			}
			else
			{
				a.getOutParameterValues().put(var.getName(), "null");
			}
		}
	}

	public ExecutionTrace createExecutionTrace()
	{
		this.executionTrace.getExecutions().addAll(this.executionTraceChildren);

		for (final Entry<Execution, List<Execution>> entry : this.containerToChildrenMap.entrySet())
		{
			entry.getKey().getElements().addAll(entry.getValue());
		}

		return this.executionTrace;
	}
}
