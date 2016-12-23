package org.muml.core.common.gmf.ocl;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;

/**
 * Simplified version of org.eclipse.gmf.tooling.runtime.impl.ocl.tracker.activeocl.SimpleDependencyCollector.
 * Basically, just a wrapper around a hashmap. Each entry is associated with a set
 * of features (in our terminology, a feature is called a dependency).
 *
 */
public class DependencyCollector {
	
	private HashMap<EObject, Set<EStructuralFeature>> dependencyMap;
	
	public DependencyCollector() {
		dependencyMap = new HashMap<EObject, Set<EStructuralFeature>>();
	}
	
	public void registerDependency(@NonNull EObject object, @NonNull EStructuralFeature feature) {
		Set<EStructuralFeature> featureSet = dependencyMap.get(object);
		if (featureSet == null) {
			featureSet = new HashSet<EStructuralFeature>();
			dependencyMap.put(object, featureSet);
		}
		featureSet.add(feature);
	}
	
	public Set<EObject> getCollectedObjects() {
		return dependencyMap.keySet();
	}
	
	@NonNull
	public Set<EStructuralFeature> getDependencies(EObject object) {
		Set<EStructuralFeature> featureSet = dependencyMap.get(object);
		if (featureSet == null) {
			featureSet = Collections.<EStructuralFeature>emptySet();
		}
		return featureSet;
	}
	
	public void clear() {
		dependencyMap.clear();
	}

}
