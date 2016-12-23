package org.muml.core.common.gmf.ocl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ExplicitNavigationProperty;

public class DependencyCollectingExplicitNavigationProperty extends ExplicitNavigationProperty {

	public DependencyCollectingExplicitNavigationProperty(@NonNull Property property) {
		super(property);
	}
	
	@Override
	public @Nullable Object evaluate(@NonNull Executor executor, @NonNull TypeId returnTypeId, @Nullable Object sourceValue) {
		if (!(executor instanceof DependencyCollectingOCLExecutor)) {
			throw new IllegalArgumentException("expected DependencyCollectingOCLExecutor");
		}
		/* do this first (just for future compatibility (maybe it changes
		 * in a way that some init code has to be execute first before
		 * executing the subsequent statements...)) - atm the order
		 * does not matter
		 */
		Object evaluationResult = super.evaluate(executor, returnTypeId, sourceValue);
		EObject source = asNavigableObject(sourceValue, propertyId, executor);
		EStructuralFeature feature = source.eClass()
				.getEStructuralFeature(propertyId.getName());
		((DependencyCollectingOCLExecutor) executor).getDependencyCollector()
				.registerDependency(source, feature);
		return evaluationResult;
	}

}
