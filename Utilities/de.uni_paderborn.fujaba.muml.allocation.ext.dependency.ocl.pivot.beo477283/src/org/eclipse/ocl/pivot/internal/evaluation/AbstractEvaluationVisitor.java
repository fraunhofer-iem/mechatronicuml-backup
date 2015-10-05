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

import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.CompleteEnvironment;
import org.eclipse.ocl.pivot.Constraint;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.LanguageExpression;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.pivot.evaluation.EvaluationLogger;
import org.eclipse.ocl.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.pivot.evaluation.ModelManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.internal.complete.CompleteEnvironmentInternal;
import org.eclipse.ocl.pivot.internal.complete.StandardLibraryInternal;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.messages.StatusCodes;
import org.eclipse.ocl.pivot.util.AbstractExtendingVisitor;
import org.eclipse.ocl.pivot.util.Visitable;
import org.eclipse.ocl.pivot.util.Visitor;
import org.eclipse.ocl.pivot.utilities.EnvironmentFactory;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * An evaluation visitor implementation for OCL expressions.
 * <p>
 * <b>Note</b> that this class is not intended to be used or extended by
 * clients.  Use the {@link EvaluationVisitor} interface, instead.
 * </p>
 */
public abstract class AbstractEvaluationVisitor
	extends AbstractExtendingVisitor<Object, Object> implements EvaluationVisitor {

	// This is the same as HashMap's default initial capacity
	private static final int DEFAULT_REGEX_CACHE_LIMIT = 16;

	// this is the same as HashMap's default load factor
	private static final float DEFAULT_REGEX_CACHE_LOAD_FACTOR = 0.75f;
	
	protected final @NonNull EnvironmentFactoryInternal environmentFactory;
	protected final @NonNull EvaluationEnvironment evaluationEnvironment;
	protected final @NonNull PivotMetamodelManager metamodelManager;	
	protected final @NonNull CompleteEnvironmentInternal completeEnvironment;
	protected final @NonNull StandardLibraryInternal standardLibrary;
	protected final @NonNull ModelManager modelManager;

    protected @NonNull EvaluationVisitor undecoratedVisitor;
	
	/**
	 * Lazily-created cache of reusable regex patterns to avoid
	 * repeatedly parsing the same regexes.
	 */
	private /*@LazyNonNull*/ Map<String, Pattern> regexPatterns = null;

	private EvaluationLogger logger = new EvaluationLogger()
	{
		@Override
		public void append(@NonNull String message) {
			System.out.append(message);
		}		
	};

    /**
     * Set non-null by {@link #setMonitor} to terminate execution at next iteration/operation call.
     */
	protected @Nullable Monitor monitor = null;
	
	/**
	 * Initializes me.
	 * 
	 * @param evalEnv an evaluation environment (map of variable names to values)
	 */
	protected AbstractEvaluationVisitor(@NonNull EvaluationEnvironment evalEnv) {
        super(Object.class);						// Useless dummy object as context
        this.environmentFactory = (EnvironmentFactoryInternal) evalEnv.getEnvironmentFactory();
        this.evaluationEnvironment = evalEnv;
        this.metamodelManager = environmentFactory.getMetamodelManager();
		this.completeEnvironment = metamodelManager.getCompleteEnvironment();
		this.standardLibrary = completeEnvironment.getOwnedStandardLibrary();
        this.modelManager = evalEnv.getModelManager();
        this.undecoratedVisitor = this;  // assume I have no decorator
    }
	
	/**
	 * Creates (on demand) the regular-expression matcher cache. The default
	 * implementation creates an access-ordered LRU cache with a limit of 16
	 * entries. Subclasses may override to create a map with whatever different
	 * performance characteristics may be required.
	 * 
	 * @return the new regular-expression matcher cache
	 * 
	 * @see #getRegexPattern(String)
	 */
	protected @NonNull Map<String, Pattern> createRegexCache() {
		return new java.util.LinkedHashMap<String, Pattern>(
			DEFAULT_REGEX_CACHE_LIMIT, DEFAULT_REGEX_CACHE_LOAD_FACTOR, true) {

			private static final long serialVersionUID = 1L;

			@Override
			protected boolean removeEldestEntry(
					Map.Entry<String, Pattern> eldest) {
				return size() > DEFAULT_REGEX_CACHE_LIMIT;
			}
		};
	}

	@Override
	public @NonNull CompleteEnvironment getCompleteEnvironment() {
		return completeEnvironment;
	}

    @Override
	public @NonNull EnvironmentFactory getEnvironmentFactory() {
		return environmentFactory;
	}
    
	@Override
	public @NonNull EvaluationEnvironment getEvaluationEnvironment() {
		return evaluationEnvironment;
	}

	@Override
	public @NonNull IdResolver getIdResolver() {
		return environmentFactory.getIdResolver();
	}

	@Override
	public @Nullable EvaluationLogger getLogger() {
		return logger;
	}

	@Override
	public @NonNull PivotMetamodelManager getMetamodelManager() {
		return metamodelManager;
	}
	
    // implements the interface method
	@Override
	public @NonNull ModelManager getModelManager() {
		return modelManager;
	}

	@Override
	public @Nullable Monitor getMonitor() {
		return monitor;
	}

	/**
	 * Return a cached matcher for a give regular expression.
	 */
	@Override
	public @NonNull Pattern getRegexPattern(@NonNull String regex) {
		if (regexPatterns == null) {
			synchronized (this) {
				if (regexPatterns == null) {
					regexPatterns = createRegexCache();
				}
			}
		}
		synchronized (regexPatterns) {
			Pattern pattern = regexPatterns.get(regex);
			if (pattern == null) {
//				System.out.println("Compile " + regex);
				pattern = Pattern.compile(regex);
				assert pattern != null;
				regexPatterns.put(regex, pattern);
			}
//			else {
//				System.out.println("Re-use " + regex);
//			}
			return pattern;
		}
	}
	
	@Override
	public int getDiagnosticSeverity(int severityPreference, @Nullable Object resultValue) {
		if (resultValue == null) {
			return Diagnostic.ERROR;
		}
		else if (resultValue instanceof InvalidValueException) {
			return Diagnostic.CANCEL;
		}
		else {
			return severityPreference;
		}
	}

	@Override
	public int getSeverity(@Nullable Object validationKey) {
		StatusCodes.Severity severity = environmentFactory.getSeverity(validationKey);
		return severity != null ? severity.getStatusCode() : StatusCodes.WARNING;
	}

	@Override
	public @NonNull StandardLibrary getStandardLibrary() {
		return standardLibrary;
	}

	@Override
	public @NonNull org.eclipse.ocl.pivot.Class getStaticTypeOf(@Nullable Object value) {
		return environmentFactory.getIdResolver().getStaticTypeOf(value);
	}

	@Override
	public @NonNull org.eclipse.ocl.pivot.Class getStaticTypeOf(@Nullable Object value, @NonNull Object... values) {
		return environmentFactory.getIdResolver().getStaticTypeOf(value, values);
	}
 
	@Override
	public @NonNull org.eclipse.ocl.pivot.Class getStaticTypeOf(@Nullable Object value, @NonNull Iterable<?> values) {
		return environmentFactory.getIdResolver().getStaticTypeOf(value, values);
	}
 
    /**
     * Obtains the visitor on which I perform nested
     * {@link Visitable#accept(Visitor)} calls.  This
     * handles the case in which I am decorated by another visitor that must
     * intercept every <tt>visitXxx()</tt> method.  If I internally just
     * recursively visit myself, then this decorator is cut out of the picture.
     * 
     * @return my delegate visitor, which may be my own self or some other
     */
	protected final @NonNull EvaluationVisitor getUndecoratedVisitor() {
        return undecoratedVisitor;
    }

	@Override
	public boolean isCanceled() {
		return (monitor != null) && monitor.isCanceled();
	}

	@Override
	public void setCanceled(boolean isCanceled) {
		if (monitor != null) {
			monitor.setCanceled(isCanceled);
		}
		else if (isCanceled) {
			monitor = new BasicMonitor();
			monitor.setCanceled(isCanceled);
		}
	}

	@Override
	public void setLogger(@Nullable EvaluationLogger logger) {
		this.logger = logger;
	}

	@Override
	public void setMonitor(@Nullable Monitor monitor) {
		this.monitor = monitor;
	}

    /**
     * Sets the visitor on which I perform nested
     * {@link Visitable#accept(Visitor)} calls.
     * 
     * @param evaluationVisitor my delegate visitor
     * 
     * @see #getUndecoratedVisitor()
     */
	@Override
	public void setUndecoratedVisitor(@NonNull EvaluationVisitor evaluationVisitor) {
        this.undecoratedVisitor = evaluationVisitor;
	}
	
	@Override
    public String toString() {
		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (evaluation environment: ");//$NON-NLS-1$
		result.append(getEvaluationEnvironment());
		result.append(')');
		return result.toString();
	}

	/**
	 * This default implementation asserts that the <tt>constraint</tt> is
	 * boolean-valued if it is an invariant, pre-condition, or post-condition
	 * constraint and returns the value of its body expression by delegation to
	 * {@link Visitable#accept(Visitor)}.
	 */
	@Override
    public Object visitConstraint(@NonNull Constraint constraint) {
		LanguageExpression specification = constraint.getOwnedSpecification();
		if (!(specification instanceof ExpressionInOCL)) {
			return null;
		}
		OCLExpression body = ((ExpressionInOCL)specification).getOwnedBody();
//		boolean isBoolean = BOOLEAN_CONSTRAINTS.contains(constraint.getStereotype());
		
		if (body == null) {
			throw new IllegalArgumentException("constraint has no body expression"); //$NON-NLS-1$
		}
		
//		if (isBoolean && !(body.getType() != metamodelManager.getBooleanType())) {
//			throw new IllegalArgumentException("constraint is not boolean"); //$NON-NLS-1$
//		}
		
		Object result = body.accept(undecoratedVisitor);
//		try {
//			if (result == null) {
//				return evaluationEnvironment.throwInvalidEvaluation("null constraint result");
//			}
			return ValueUtil.asBoolean(result);
//		} catch (InvalidValueException e) {
//			return e.getValue();
//		}
	}
} //EvaluationVisitorImpl
