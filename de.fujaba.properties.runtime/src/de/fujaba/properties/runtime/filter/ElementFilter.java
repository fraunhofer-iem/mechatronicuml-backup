package de.fujaba.properties.runtime.filter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;

import de.fujaba.properties.runtime.RuntimePlugin;

public class ElementFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		Object resolved = RuntimePlugin.resolveSemanticObject(toTest);
		if (resolved instanceof EObject) {
			EClass eClass = ((EObject) resolved).eClass();
			return !RuntimePlugin.getPropertyEditorFactories(eClass).isEmpty();
		}
		return false;
	}

}
