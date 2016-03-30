package org.muml.storydiagram.interpreter.core.patternmatcher;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.muml.core.expressions.Expression;
import org.muml.storydiagram.interpreter.core.mdelab.SDMException;
import org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.patternPartBased.ECheckResult;
import org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.patternPartBased.EMatchType;
import org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.patternPartBased.MatchState;
import org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.patternPartBased.PatternPartBasedMatcher;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.BindingOperator;
import org.muml.storydiagram.patterns.BindingSemantics;

public class StoryDrivenNACPatternPart extends StoryDrivenPatternPart<AbstractVariable, AbstractLinkVariable>
{

	private final StoryDrivenPatternPart<AbstractVariable, ? extends AbstractLinkVariable>	nacPatternPart;

	public StoryDrivenNACPatternPart(
			final PatternPartBasedMatcher<?, ?, ?, ?, AbstractVariable, AbstractLinkVariable, EClassifier, ?, Expression> patternMatcher,
			final StoryDrivenPatternPart<AbstractVariable, ? extends AbstractLinkVariable> nacPatternPart)
	{
		super(patternMatcher, nacPatternPart.link, nacPatternPart.variables);

		assert this.nacPatternPart.link.getBindingSemantics() == BindingSemantics.NEGATIVE;
		assert this.nacPatternPart.link.getBindingOperator() == BindingOperator.CHECK_ONLY;

		this.nacPatternPart = nacPatternPart;
	}

	@Override
	protected EMatchType doGetMatchType()
	{
		return EMatchType.MANDATORY;
	}

	@Override
	protected void doCreateLink()
	{
		throw new UnsupportedOperationException();
	}

	@Override
	protected void doDestroyLink(final Map<AbstractVariable, Object> deletedObjects)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public ECheckResult check() throws SDMException
	{
		switch (this.nacPatternPart.check())
		{
			case OK:
				return ECheckResult.FAIL;
			case FAIL:
				return ECheckResult.OK;
			case UNKNOWN:
				return ECheckResult.UNKNOWN;
			default:
				throw new UnsupportedOperationException();
		}
	}

	@Override
	public boolean match(final MatchState matchState) throws SDMException
	{
		return !this.nacPatternPart.match(matchState);
	}

	@Override
	public int calculateMatchingCost()
	{
		return Integer.MAX_VALUE;
	}

	@Override
	public MatchState createMatchState()
	{
		return this.nacPatternPart.createMatchState();
	}

}
