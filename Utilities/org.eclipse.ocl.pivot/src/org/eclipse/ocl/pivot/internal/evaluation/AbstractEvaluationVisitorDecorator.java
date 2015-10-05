/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/

package org.eclipse.ocl.pivot.internal.evaluation;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.AssociationClassCallExp;
import org.eclipse.ocl.pivot.BooleanLiteralExp;
import org.eclipse.ocl.pivot.CollectionItem;
import org.eclipse.ocl.pivot.CollectionLiteralExp;
import org.eclipse.ocl.pivot.CollectionRange;
import org.eclipse.ocl.pivot.Constraint;
import org.eclipse.ocl.pivot.EnumLiteralExp;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.IfExp;
import org.eclipse.ocl.pivot.IntegerLiteralExp;
import org.eclipse.ocl.pivot.InvalidLiteralExp;
import org.eclipse.ocl.pivot.LetExp;
import org.eclipse.ocl.pivot.MapLiteralExp;
import org.eclipse.ocl.pivot.MapLiteralPart;
import org.eclipse.ocl.pivot.MessageExp;
import org.eclipse.ocl.pivot.NullLiteralExp;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.OppositePropertyCallExp;
import org.eclipse.ocl.pivot.PropertyCallExp;
import org.eclipse.ocl.pivot.RealLiteralExp;
import org.eclipse.ocl.pivot.ShadowExp;
import org.eclipse.ocl.pivot.StateExp;
import org.eclipse.ocl.pivot.StringLiteralExp;
import org.eclipse.ocl.pivot.TupleLiteralExp;
import org.eclipse.ocl.pivot.TupleLiteralPart;
import org.eclipse.ocl.pivot.TypeExp;
import org.eclipse.ocl.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.pivot.UnspecifiedValueExp;
import org.eclipse.ocl.pivot.Variable;
import org.eclipse.ocl.pivot.VariableExp;
import org.eclipse.ocl.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.pivot.evaluation.ModelManager;
import org.eclipse.ocl.pivot.util.AbstractExtendingVisitor;
import org.eclipse.ocl.pivot.util.Visitable;
import org.eclipse.ocl.pivot.utilities.EnvironmentFactory;

/**
 * A visitor that decorates another {@link EvaluationVisitor}, to intercept
 * invocations of the <code>visitXxx(...)</code> methods.  By default, every
 * visitation is simply delegated to the decorated visitor.  Subclasses may
 * extend these delegations with any additional behaviour that is required,
 * even replacing calls to the delegate where necessary.
 * <p>
 * This class works together with the {@link AbstractEvaluationVisitor} to
 * ensure that recursive <code>visitXxx()</code> calls are correctly intercepted
 * by me (and not just implemented within the decorated visitor).  Moreover,
 * this works with decorators nested to any depth.
 * </p>
 */
public abstract class AbstractEvaluationVisitorDecorator<EV extends EvaluationVisitor> extends AbstractExtendingVisitor<Object, Object> implements EvaluationVisitor {

    protected final @NonNull EV delegate;
    
    protected AbstractEvaluationVisitorDecorator(@NonNull EV decorated) {
        super(Object.class);						// Useless dummy object as context
        assert decorated != null : "cannot decorate a null visitor"; //$NON-NLS-1$
        
        this.delegate = decorated;
        
        decorated.setUndecoratedVisitor(this);
    }

    /**
     * Delegates to my decorated visitor.
     */
	@Override
	public @NonNull EvaluationVisitor createNestedEvaluator() {
        return delegate.createNestedEvaluator();
	}
  
    /**
     * Obtains the visitor that I decorate.
     * 
     * @return my decorated visitor
     */
	protected final @NonNull EV getDelegate() {
        return delegate;
    }

	@Override
	public int getDiagnosticSeverity(int severityPreference, @Nullable Object resultValue) {
        return delegate.getDiagnosticSeverity(severityPreference, resultValue);
	}
    
    /**
     * Obtains my delegate's environment.
     */
    @Override
	public @NonNull EnvironmentFactory getEnvironmentFactory() {
        return delegate.getEnvironmentFactory();
    }

    /**
     * Obtains my delegate's evaluation environment.
     */
    @Override
	public @NonNull EvaluationEnvironment getEvaluationEnvironment() {
        return delegate.getEvaluationEnvironment();
    }

    /**
     * Obtains my delegate's extent map.
     */
    @Override
	public @NonNull ModelManager getModelManager() {
        return delegate.getModelManager();
    }

	@Override
	public int getSeverity(@Nullable Object validationKey) {
        return delegate.getSeverity(validationKey);
	}

    /**
     * Delegates to my decorated visitor.
     */
	@Override
	public void setUndecoratedVisitor(@NonNull EvaluationVisitor evaluationVisitor) {
        delegate.setUndecoratedVisitor(evaluationVisitor);
	}

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitConstraint(@NonNull Constraint constraint) {
        return delegate.visitConstraint(constraint);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitAssociationClassCallExp(
            @NonNull AssociationClassCallExp callExp) {
        return delegate.visitAssociationClassCallExp(callExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitBooleanLiteralExp(@NonNull BooleanLiteralExp literalExp) {
        return delegate.visitBooleanLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitCollectionItem(@NonNull CollectionItem item) {
        return delegate.visitCollectionItem(item);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitCollectionLiteralExp(@NonNull CollectionLiteralExp literalExp) {
        return delegate.visitCollectionLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitCollectionRange(@NonNull CollectionRange range) {
        return delegate.visitCollectionRange(range);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitEnumLiteralExp(@NonNull EnumLiteralExp literalExp) {
        return delegate.visitEnumLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitExpressionInOCL(@NonNull ExpressionInOCL expression) {
        return delegate.visitExpressionInOCL(expression);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitIfExp(@NonNull IfExp ifExp) {
        return delegate.visitIfExp(ifExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitIntegerLiteralExp(@NonNull IntegerLiteralExp literalExp) {
        return delegate.visitIntegerLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitInvalidLiteralExp(@NonNull InvalidLiteralExp literalExp) {
        return delegate.visitInvalidLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitLetExp(@NonNull LetExp letExp) {
        return delegate.visitLetExp(letExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
    public @Nullable Object visitMapLiteralExp(@NonNull MapLiteralExp literalExp) {
        return delegate.visitMapLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
    public @Nullable Object visitMapLiteralPart(@NonNull MapLiteralPart range) {
        return delegate.visitMapLiteralPart(range);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitMessageExp(@NonNull MessageExp messageExp) {
        return delegate.visitMessageExp(messageExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitNullLiteralExp(@NonNull NullLiteralExp literalExp) {
        return delegate.visitNullLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitOperationCallExp(@NonNull OperationCallExp callExp) {
        return delegate.visitOperationCallExp(callExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitOppositePropertyCallExp(@NonNull OppositePropertyCallExp callExp) {
        return delegate.visitOppositePropertyCallExp(callExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitPropertyCallExp(@NonNull PropertyCallExp callExp) {
        return delegate.visitPropertyCallExp(callExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitRealLiteralExp(@NonNull RealLiteralExp literalExp) {
        return delegate.visitRealLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitShadowExp(@NonNull ShadowExp shadowExp) {
        return delegate.visitShadowExp(shadowExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitStateExp(@NonNull StateExp stateExp) {
        return delegate.visitStateExp(stateExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitStringLiteralExp(@NonNull StringLiteralExp literalExp) {
        return delegate.visitStringLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitTupleLiteralExp(@NonNull TupleLiteralExp literalExp) {
        return delegate.visitTupleLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitTupleLiteralPart(@NonNull TupleLiteralPart part) {
        return delegate.visitTupleLiteralPart(part);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitTypeExp(@NonNull TypeExp typeExp) {
        return delegate.visitTypeExp(typeExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitUnlimitedNaturalLiteralExp(
            @NonNull UnlimitedNaturalLiteralExp literalExp) {
        return delegate.visitUnlimitedNaturalLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitUnspecifiedValueExp(@NonNull UnspecifiedValueExp unspecExp) {
        return delegate.visitUnspecifiedValueExp(unspecExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitVariable(@NonNull Variable variable) {
        return delegate.visitVariable(variable);
    }

    /**
     * Delegates to my decorated visitor.
     */
    @Override
	public Object visitVariableExp(@NonNull VariableExp variableExp) {
        return delegate.visitVariableExp(variableExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
	@Override
	public Object visiting(@NonNull Visitable visitable) {
        return delegate.visiting(visitable);
	}
}
