/*******************************************************************************
 * Copyright (c) 2011, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - initial API and implementation
 * 	 E.D.Willink (CEA LIST) - Bug 425799 - validity view
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.library;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.LanguageExpression;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.Variable;
import org.eclipse.ocl.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.evaluation.OCLEvaluationVisitor;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
import org.eclipse.ocl.pivot.library.AbstractProperty;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * An instance of ConstrainedProperty supports evaluation of
 * a relationship defined by constraints.
 */
public class ConstrainedProperty extends AbstractProperty
{
	protected final @NonNull Property property;
	protected /*@LazyNonNull*/ ExpressionInOCL expression = null;
	
	public ConstrainedProperty(@NonNull Property property) {
		this.property = property;
	}

	@Override
	public @Nullable Object evaluate(@NonNull Evaluator evaluator, @NonNull TypeId returnTypeId, @Nullable Object sourceValue) {
		ExpressionInOCL expression2 = expression;
		if (expression2 == null) {
			LanguageExpression defaultSpecification = property.getOwnedExpression();
			if (defaultSpecification == null) {
				throw new InvalidValueException("No defaultExpression for '{0}'", property);
			}
			try {
				PivotMetamodelManager metamodelManager = ((OCLEvaluationVisitor)evaluator).getMetamodelManager();
				expression = expression2 = metamodelManager.parseSpecification(defaultSpecification);
			} catch (ParserException e) {
				throw new InvalidValueException(e, "Bad defaultExpression for '{0}'", property);
			}
		}
		PivotUtil.checkExpression(expression2);
		EvaluationVisitor evaluationVisitor = (EvaluationVisitor)evaluator;
		EvaluationVisitor nestedVisitor;
		if (evaluationVisitor instanceof OCLEvaluationVisitor) {
			nestedVisitor = ((OCLEvaluationVisitor)evaluationVisitor).createNestedUndecoratedEvaluator(expression2);
		}
		else {
			nestedVisitor = evaluationVisitor.createNestedEvaluator();
		}
		EvaluationEnvironment nestedEvaluationEnvironment = nestedVisitor.getEvaluationEnvironment();
		Variable contextVariable = expression2.getOwnedContext();
		if (contextVariable != null) {
			nestedEvaluationEnvironment.add(contextVariable, sourceValue);
		}
		try {
			OCLExpression bodyExpression = expression2.getOwnedBody();
			assert bodyExpression != null;
			return nestedVisitor.evaluate(bodyExpression);
		}
		finally {
			nestedVisitor.dispose();
		}
	}
}