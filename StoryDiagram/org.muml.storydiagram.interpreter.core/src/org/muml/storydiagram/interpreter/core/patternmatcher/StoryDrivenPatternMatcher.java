package org.muml.storydiagram.interpreter.core.patternmatcher;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.core.expressions.Expression;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.interpreter.core.facade.StoryDrivenMetamodelFacadeFactory;
import org.muml.storydiagram.interpreter.core.mdelab.SDMException;
import org.muml.storydiagram.interpreter.core.mdelab.expressions.ExpressionInterpreterManager;
import org.muml.storydiagram.interpreter.core.mdelab.facade.MetamodelFacadeFactory;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.NotificationEmitter;
import org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.MatchingStrategy;
import org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.patternPartBased.DefaultMatchingStrategy;
import org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.patternPartBased.PatternPart;
import org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.patternPartBased.PatternPartBasedMatcher;
import org.muml.storydiagram.interpreter.core.mdelab.variables.VariablesScope;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.BindingSemantics;
import org.muml.storydiagram.patterns.InclusionLink;
import org.muml.storydiagram.patterns.LinkVariable;
import org.muml.storydiagram.patterns.ObjectVariable;
import org.muml.storydiagram.patterns.Path;
import org.muml.storydiagram.patterns.PatternsPackage;
import org.muml.storydiagram.patterns.StoryPattern;

public class StoryDrivenPatternMatcher
		extends
		PatternPartBasedMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>
{

	public StoryDrivenPatternMatcher(
			final StoryPattern storyPattern,
			final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> variablesScope,
			final ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> expressionInterpreterManager,
			final NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> notificationEmitter)
			throws SDMException
	{
		this(
				storyPattern,
				variablesScope,
				new DefaultMatchingStrategy<StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>(
						StoryDrivenMetamodelFacadeFactory.INSTANCE), StoryDrivenMetamodelFacadeFactory.INSTANCE,
				expressionInterpreterManager, notificationEmitter);
	}

	public StoryDrivenPatternMatcher(
			final StoryPattern storyPattern,
			final VariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> variablesScope,
			final MatchingStrategy<StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> matchingStrategy,
			final MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> facadeFactory,
			final ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> expressionInterpreterManager,
			final NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> notificationEmitter)
			throws SDMException
	{
		super(storyPattern, variablesScope, matchingStrategy, facadeFactory, expressionInterpreterManager, notificationEmitter);
	}

	@Override
	protected Collection<PatternPart<AbstractVariable, AbstractLinkVariable, EClassifier, Expression>> createPatternParts()
	{
		final List<AbstractLinkVariable> storyPatternLinks = new LinkedList<AbstractLinkVariable>(this.getStoryPattern().getLinkVariables());
		final Collection<PatternPart<AbstractVariable, AbstractLinkVariable, EClassifier, Expression>> patternParts = new HashSet<PatternPart<AbstractVariable, AbstractLinkVariable, EClassifier, Expression>>();

		/*
		 * Create pattern parts for story pattern links and objects connected to
		 * links
		 */
		while (!storyPatternLinks.isEmpty())
		{
			final AbstractLinkVariable link = storyPatternLinks.remove(0);

			final EClass linkEClass = link.eClass();

			StoryDrivenPatternPart<AbstractVariable, ? extends AbstractLinkVariable> part = null;

			if (linkEClass == PatternsPackage.Literals.LINK_VARIABLE)
			{
				part = new StoryDrivenLinkVariablePatternPart(this, (LinkVariable) link);
			}
			else if (linkEClass == PatternsPackage.Literals.INCLUSION_LINK)
			{
				part = new StoryDrivenInclusionLinkPatternPart(this, (InclusionLink) link);
			}
			else if (linkEClass == PatternsPackage.Literals.PATH)
			{
				part = new StoryDrivenPathPatternPart(this, (Path) link);
			}
			else
			{
				throw new UnsupportedOperationException();
			}

			assert part != null;

			if (link.getBindingSemantics() == BindingSemantics.NEGATIVE)
			{
				part = new StoryDrivenNACPatternPart(this, part);
			}

			patternParts.add(part);
		}

		/*
		 * Create pattern parts for objects that are not connected to any links.
		 */
		for (final AbstractVariable var : this.getStoryPattern().getVariables())
		{
			if (var.getIncomingLinks().isEmpty()
					&& (!(var instanceof ObjectVariable) || ((ObjectVariable) var).getOutgoingLinks().isEmpty()))
			{
				final StoryDrivenVariableOnlyPatternPart part = new StoryDrivenVariableOnlyPatternPart(this, var);

				patternParts.add(part);
			}
		}

		return patternParts;
	}

}
