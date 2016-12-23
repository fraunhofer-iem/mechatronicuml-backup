package org.muml.storydiagram.interpreter.core.facade;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.core.expressions.Expression;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IActivityEdgeFacade;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IActivityFacade;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IClassifierFacade;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IDecisionNodeFacade;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IExpressionFacade;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IExpressionNodeFacade;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IFeatureFacade;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IFinalNodeFacade;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IInstanceFacade;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IStoryNodeFacade;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IStoryPatternFacade;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IStoryPatternLinkFacade;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IStoryPatternObjectFacade;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IUnspecificActivityNodeFacade;
import org.muml.storydiagram.interpreter.core.mdelab.facade.MetamodelFacadeFactory;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.StoryPattern;

public class StoryDrivenMetamodelFacadeFactory
		extends
		MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>
{
	public static final StoryDrivenMetamodelFacadeFactory	INSTANCE	= new StoryDrivenMetamodelFacadeFactory();

	@Override
	protected IClassifierFacade<EClassifier> createClassifierFacade()
	{
		return new StoryDrivenClassifierFacade();
	}

	@Override
	protected IFeatureFacade<EStructuralFeature> createFeatureFacade()
	{
		return new StoryDrivenFeatureFacade();
	}

	@Override
	protected IStoryPatternObjectFacade<AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> createStoryPatternObjectFacade()
	{
		return new StoryDrivenObjectVariableFacade();
	}

	@Override
	protected IStoryPatternLinkFacade<AbstractVariable, AbstractLinkVariable, EStructuralFeature> createStoryPatternLinkFacade()
	{
		return new StoryDrivenAbstractLinkVariableFacade();
	}

	@Override
	protected IStoryPatternFacade<StoryPattern, AbstractVariable, AbstractLinkVariable, Expression> createStoryPatternFacade()
	{
		return new StoryDrivenStoryPatternFacade();
	}

	@Override
	protected IInstanceFacade<AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> createInstanceFacade()
	{
		return new StoryDrivenInstanceFacade();
	}

	@Override
	protected IExpressionFacade<Expression> createExpressionFacade()
	{
		return new StoryDrivenExpressionFacade();
	}

	@Override
	protected IActivityFacade<Activity, ActivityNode> createActivityFacade()
	{
		return new StoryDrivenActivityFacade();
	}

	@Override
	protected IUnspecificActivityNodeFacade<ActivityNode, ActivityEdge> createUnspecificActivityNodeFacade()
	{
		return new StoryDrivenUnspecificActivityNodeFacade();
	}

	@Override
	protected IStoryNodeFacade<ActivityNode, ActivityEdge, StoryPattern> createStoryNodeFacade()
	{
		return new StoryDrivenStoryNodeFacade();
	}

	@Override
	protected IExpressionNodeFacade<ActivityNode, ActivityEdge, Expression> createExpressionNodeFacade()
	{
		return new StoryDrivenStatementNodeFacade();
	}

	@Override
	protected IDecisionNodeFacade<ActivityNode, ActivityEdge, Expression> createDecisionNodeFacade()
	{
		return new StoryDrivenJunctionNodeFacade();
	}

	@Override
	protected IFinalNodeFacade<ActivityNode, Expression> createFinalNodeFacade()
	{
		return new StoryDrivenActivityFinalNodeFacade();
	}

	@Override
	protected IActivityEdgeFacade<ActivityNode, ActivityEdge> createActivityEdgeFacade()
	{
		return new StoryDrivenActivityEdgeFacade();
	}

}
