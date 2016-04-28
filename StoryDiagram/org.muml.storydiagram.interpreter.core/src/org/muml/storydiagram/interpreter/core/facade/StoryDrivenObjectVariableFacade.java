package org.muml.storydiagram.interpreter.core.facade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.mumlcore.expressions.Expression;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IStoryPatternObjectFacade;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.AttributeAssignment;
import org.muml.storydiagram.patterns.BindingOperator;
import org.muml.storydiagram.patterns.BindingSemantics;
import org.muml.storydiagram.patterns.BindingState;
import org.muml.storydiagram.patterns.Constraint;
import org.muml.storydiagram.patterns.ObjectVariable;

public class StoryDrivenObjectVariableFacade implements
		IStoryPatternObjectFacade<AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>
{

	@Override
	public String getName(AbstractVariable spo)
	{
		assert spo != null;

		return spo.getName();
	}

	@Override
	public EClassifier getClassifier(AbstractVariable spo)
	{
		assert spo != null;

		return spo.getClassifier();
	}

	@Override
	public boolean isBound(AbstractVariable spo)
	{
		assert spo != null;

		return spo.getBindingState() == BindingState.BOUND;
	}

	@Override
	public boolean isMaybeBound(AbstractVariable spo)
	{
		assert spo != null;

		return spo.getBindingState() == BindingState.MAYBE_BOUND;
	}

	@Override
	public boolean isCreate(AbstractVariable spo)
	{
		assert spo != null;

		if (spo instanceof ObjectVariable)
		{
			return ((ObjectVariable) spo).getBindingOperator() == BindingOperator.CREATE;
		}

		return false;
	}

	@Override
	public boolean isDestroy(AbstractVariable spo)
	{
		assert spo != null;

		if (spo instanceof ObjectVariable)
		{
			return ((ObjectVariable) spo).getBindingOperator() == BindingOperator.DESTROY;
		}

		return false;
	}

	@Override
	public boolean isOptional(AbstractVariable spo)
	{
		assert spo != null;

		if (spo instanceof ObjectVariable)
		{
			return ((ObjectVariable) spo).getBindingSemantics() == BindingSemantics.OPTIONAL;
		}

		return false;
	}

	@Override
	public Map<EStructuralFeature, Expression> getAttributeAssignments(AbstractVariable spo)
	{
		assert spo != null;

		if (spo instanceof ObjectVariable)
		{
			ObjectVariable v = (ObjectVariable) spo;

			Map<EStructuralFeature, Expression> map = new HashMap<EStructuralFeature, Expression>();

			for (AttributeAssignment aa : v.getAttributeAssignments())
			{
				map.put(aa.getAttribute(), aa.getValueExpression());
			}

			return map;
		}
		else
		{
			return Collections.emptyMap();
		}
	}

	@Override
	public Expression getAssignmentExpression(AbstractVariable spo)
	{
		assert spo != null;

		return spo.getBindingExpression();
	}

	@Override
	public Collection<Expression> getConstraints(AbstractVariable spo)
	{
		assert spo != null;

		Collection<Expression> constraints = new ArrayList<Expression>(spo.getConstraints().size());

		for (Constraint c : spo.getConstraints())
		{
			constraints.add(c.getConstraintExpression());
		}

		return constraints;
	}

}
