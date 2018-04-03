package org.muml.core.common.ocltracker;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.internal.utilities.EcoreTechnology;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.library.LibraryProperty;

public class DependencyCollectingEcoreTechnology extends EcoreTechnology {
	
	@Override
	public @NonNull LibraryProperty createExplicitNavigationPropertyImplementation(@NonNull EnvironmentFactoryInternal environmentFactory,
			@Nullable Element asNavigationExp, @Nullable Object sourceValue, @NonNull Property property) {
		return new DependencyCollectingExplicitNavigationProperty(property);
	}
	
}
