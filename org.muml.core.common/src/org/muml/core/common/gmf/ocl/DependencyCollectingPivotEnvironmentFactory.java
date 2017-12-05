package org.muml.core.common.gmf.ocl;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.ModelManager;
import org.eclipse.ocl.pivot.internal.evaluation.ExecutorInternal;
import org.eclipse.ocl.pivot.internal.utilities.PivotEnvironmentFactory;
import org.eclipse.ocl.pivot.internal.utilities.Technology;
import org.eclipse.ocl.pivot.resource.BasicProjectManager;
import org.eclipse.ocl.pivot.resource.ProjectManager;

public class DependencyCollectingPivotEnvironmentFactory extends PivotEnvironmentFactory {
	
	private Technology technology;
	
	/*
	 * Just for convenience...
	 */
	public DependencyCollectingPivotEnvironmentFactory() {
		this(BasicProjectManager.createDefaultProjectManager(), null);
	}

	public DependencyCollectingPivotEnvironmentFactory(@NonNull ProjectManager projectManager,
			@Nullable ResourceSet externalResourceSet) {
		super(projectManager, externalResourceSet);
		technology = new DependencyCollectingEcoreTechnology();
	}
	
	@Override
	public @NonNull DependencyCollectingOCLInternal createOCL() {
		return new DependencyCollectingOCLInternal(this);
	}
	
	@Override
	public @NonNull ExecutorInternal createExecutor(@NonNull ModelManager modelManager) {
		return new DependencyCollectingOCLExecutor(this, modelManager);
	}
	
	@Override
	public @NonNull Technology getTechnology() {
		return technology;
	}

}
