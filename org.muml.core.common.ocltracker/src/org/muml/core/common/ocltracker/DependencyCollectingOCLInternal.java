package org.muml.core.common.ocltracker;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.pivot.evaluation.EvaluationVisitor.EvaluationVisitorExtension;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.internal.utilities.OCLInternal;

public class DependencyCollectingOCLInternal extends OCLInternal {

	protected DependencyCollectingOCLInternal(@NonNull EnvironmentFactoryInternal environmentFactory) {
		super(environmentFactory);
	}
	
	public void initializeExecutor(@NonNull Executor executor, @NonNull DependencyCollector dependencyCollector) {
		if (!(executor instanceof DependencyCollectingOCLExecutor)) {
			throw new IllegalStateException("expected executor of type DependencyCollectingOCLExecutor");
		}
		((DependencyCollectingOCLExecutor) executor).setDependencyCollector(dependencyCollector);
	}
	
	public @Nullable Object evaluate(@Nullable Object context, @NonNull ExpressionInOCL expression,
			@NonNull DependencyCollector dependencyCollector) {
		EvaluationVisitor evaluationVisitor = createEvaluationVisitor(context,
				expression);
		if (!(evaluationVisitor instanceof EvaluationVisitorExtension)) {
			throw new IllegalStateException("expected visitor of type EvaluationVisitorExtension");
		}
		Executor executor = ((EvaluationVisitorExtension) evaluationVisitor).getExecutor();
		initializeExecutor(executor, dependencyCollector);
		return expression.accept(evaluationVisitor);
	}

}
