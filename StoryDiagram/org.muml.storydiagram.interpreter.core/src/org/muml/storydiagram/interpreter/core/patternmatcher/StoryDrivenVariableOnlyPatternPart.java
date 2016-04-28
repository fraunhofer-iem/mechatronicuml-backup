package org.muml.storydiagram.interpreter.core.patternmatcher;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.muml.mumlcore.expressions.Expression;
import org.muml.storydiagram.interpreter.core.mdelab.SDMException;
import org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.patternPartBased.ECheckResult;
import org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.patternPartBased.EMatchType;
import org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.patternPartBased.MatchState;
import org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.patternPartBased.PatternPartBasedMatcher;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;

public class StoryDrivenVariableOnlyPatternPart extends StoryDrivenPatternPart<AbstractVariable, AbstractLinkVariable>
{

	public StoryDrivenVariableOnlyPatternPart(
			PatternPartBasedMatcher<?, ?, ?, ?, AbstractVariable, AbstractLinkVariable, EClassifier, ?, Expression> patternMatcher,
			AbstractVariable variable)
	{
		super(patternMatcher, null, new AbstractVariable[]
		{
			variable
		});
	}

	@Override
	protected EMatchType doGetMatchType()
	{
		return EMatchType.OPTIONAL;
	}

	@Override
	protected void doCreateLink()
	{
		// Do nothing
	}

	@Override
	protected void doDestroyLink(Map<AbstractVariable, Object> deletedObjects)
	{
		// Do nothing
	}

	@Override
	public ECheckResult check() throws SDMException
	{
		return ECheckResult.OK;
	}

	@Override
	public int calculateMatchingCost()
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean match(MatchState matchState) throws SDMException
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public MatchState createMatchState()
	{
		return null;
	}

}
