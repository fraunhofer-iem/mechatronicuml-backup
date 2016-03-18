/*******************************************************************************
 * Copyright (c) 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.library.string;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.AbstractOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.util.PivotValidator;
import org.eclipse.ocl.pivot.utilities.PivotConstants;
import org.eclipse.ocl.pivot.utilities.StringUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * CGStringLogDiagnosticOperation realises the String::logDiagnostic(severity, status) library operation
 * used by the code generator for post validation handling.
 */
public class CGStringLogDiagnosticOperation extends AbstractOperation
{
	public static final @NonNull CGStringLogDiagnosticOperation INSTANCE = new CGStringLogDiagnosticOperation();

	@Override
	public @Nullable Object dispatch(@NonNull Evaluator evaluator, @NonNull OperationCallExp callExp, @Nullable Object sourceValue) {
		throw new UnsupportedOperationException(getClass().getSimpleName() + " should only be invoked directly.");
/*		List<? extends OCLExpression> arguments = callExp.getOwnedArguments();
		OCLExpression argument0 = arguments.get(0);
		OCLExpression argument1 = arguments.get(1);
		OCLExpression argument2 = arguments.get(2);
		OCLExpression argument3 = arguments.get(3);
		OCLExpression argument4 = arguments.get(4);
		OCLExpression argument5 = arguments.get(5);
		assert argument0 != null;
		assert argument1 != null;
		assert argument2 != null;
		assert argument3 != null;
		assert argument4 != null;
		assert argument5 != null;
		Object firstArgument = evaluator.evaluate(argument0);
		Object secondArgument = evaluator.evaluate(argument1);
		Object thirdArgument = evaluator.evaluate(argument2);
		Object fourthArgument = evaluator.evaluate(argument3);
		Object fifthArgument = evaluator.evaluate(argument4);
		Object sixthArgument = evaluator.evaluate(argument5);
		return evaluate(evaluator, callExp.getTypeId(), sourceValue, firstArgument, secondArgument, thirdArgument, fourthArgument, fifthArgument, sixthArgument); */
	}

	/**
	 * @noreference This new method is not API for 1.0
	 */
	public @NonNull /*@Thrown*/ Boolean evaluate(@NonNull Evaluator evaluator, @NonNull TypeId returnTypeId,
			@Nullable Object constraintName, @Nullable Object object, @Nullable Object feature,
			@Nullable Object diagnostics, @Nullable Object context,
			@Nullable Object message, @Nullable Object severity, @Nullable Object status, @Nullable Object code) {
		if (status == Boolean.TRUE) {
		    return ValueUtil.TRUE_VALUE;
		}
		TupleValue tupleValue = null;
		if (status instanceof TupleValue) {		// Overt tuples are unpacked in the caller. Obfuscated tuples are handled here.
			tupleValue = (TupleValue)status;
			TupleTypeId tupleTypeId = tupleValue.getTypeId();
			TuplePartId statusPartId = tupleTypeId.getPartId(PivotConstants.STATUS_PART_NAME);
			if (statusPartId != null) {
				status = tupleValue.getValue(statusPartId);
				if (status == Boolean.TRUE) {
				    return ValueUtil.TRUE_VALUE;
				}
			}
		}
		if (diagnostics != null) {
			String emfMessage = (String)message;
		    int emfSeverity;
		    int emfCode = ValueUtil.asIntegerValue(code).intValue();
			if (tupleValue != null) {
				TupleTypeId tupleTypeId = tupleValue.getTypeId();
				TuplePartId severityPartId = tupleTypeId.getPartId(PivotConstants.SEVERITY_PART_NAME);
				if (severityPartId != null) {
					IntegerValue value = ValueUtil.integerValueOf(tupleValue.getValue(severityPartId));
					int signum = value.signum();
					if (signum < 0) {
						emfSeverity = Diagnostic.ERROR;
					}
					else if (signum == 0) {
						emfSeverity = Diagnostic.INFO;
					}
					else {
						emfSeverity = Diagnostic.WARNING;
					}
				}
				else {
					emfSeverity = status == null ? Diagnostic.ERROR : Diagnostic.WARNING;
				}
				TuplePartId messagePartId = tupleTypeId.getPartId(PivotConstants.MESSAGE_PART_NAME);
				if (messagePartId != null) {
					emfMessage = String.valueOf(tupleValue.getValue(messagePartId));
				}
			}
			else {
				emfSeverity = ValueUtil.asIntegerValue(severity).intValue();
			}
			if (emfMessage == null) {
				Object objectLabel;
				if (object instanceof EObject) {
					@SuppressWarnings("unchecked")
					Map<Object, Object> castContext = (Map<Object, Object>) context;
					objectLabel = EObjectValidator.getObjectLabel((EObject) object, castContext);
				}
				else {
					objectLabel = "<<unknown>>";
				}
				emfMessage = StringUtil.bind(PivotMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{constraintName, objectLabel});
			}
		    Object emfData[] = feature != null ? new Object [] { object, feature } : new Object [] { object };
			((DiagnosticChain) diagnostics).add(new BasicDiagnostic(emfSeverity, PivotValidator.DIAGNOSTIC_SOURCE, emfCode, emfMessage, emfData));
		}
		return ValueUtil.FALSE_VALUE;
	}

	/**
	 * @deprecated Add feature/message arguments 
	 */
	@Deprecated
	public @NonNull /*@Thrown*/ Boolean evaluate(@NonNull Evaluator evaluator, @NonNull TypeId returnTypeId, @Nullable Object constraintName,
			@Nullable Object object, @Nullable Object diagnostics, @Nullable Object context,
			@Nullable Object severity, @Nullable Object status, @Nullable Object code) {
		return evaluate(evaluator, returnTypeId, constraintName, object, null, diagnostics, context, null, severity, status, code);
	}

	@Deprecated
	public @NonNull /*@Thrown*/ Boolean evaluate(@NonNull Evaluator evaluator, @NonNull TypeId returnTypeId,
			String strValidateorderedsetki, DiagnosticChain diagnostics,
			Object cAUGHT_getSeverity, Object cAUGHT_implies) {
	    return ValueUtil.TRUE_VALUE;
	}
}
