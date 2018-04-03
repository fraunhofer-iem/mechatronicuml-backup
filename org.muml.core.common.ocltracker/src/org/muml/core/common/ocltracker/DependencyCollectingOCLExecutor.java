package org.muml.core.common.ocltracker;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.evaluation.ModelManager;
import org.eclipse.ocl.pivot.internal.evaluation.BasicOCLExecutor;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal.EnvironmentFactoryInternalExtension;

/**
 * BasicOCLExecutor that provides access to a DependencyCollector.
 *
 */
public class DependencyCollectingOCLExecutor extends BasicOCLExecutor {
	
	private DependencyCollector dependencyCollector;

	public DependencyCollectingOCLExecutor(@NonNull EnvironmentFactoryInternalExtension environmentFactory,
			@NonNull ModelManager modelManager) {
		super(environmentFactory, modelManager);
	}
	
	/*
	 * This is called from initializeExecutor in DependencyCollectingOCLInternal
	 * (note: this should be only called once - passing it to the constructor
	 * would require more changes in DependencyCollectingOCLInternal - that's not
	 * worth the effort)
	 * 
	 */
	public void setDependencyCollector(@NonNull DependencyCollector dependencyCollector) {
		this.dependencyCollector = dependencyCollector;
	}
	
	public @NonNull DependencyCollector getDependencyCollector() {
		if (dependencyCollector == null) {
			throw new IllegalStateException("dependencyCollector must not be null");
		}
		return dependencyCollector;
	}

}
