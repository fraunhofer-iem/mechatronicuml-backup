package de.uni_paderborn.fujaba.properties.runtime.filter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;

import de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin;
import de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory;

public class ElementFilter implements IFilter {
	protected String tab = null;

	public ElementFilter() {
	}

	public ElementFilter(String tab) {
		this.tab = tab;
	}

	@Override
	public boolean select(Object toTest) {
		Object resolved = RuntimePlugin.resolveSemanticObject(toTest);
		if (resolved instanceof EObject) {
			EClass eClass = ((EObject) resolved).eClass();
			for (IPropertyEditorFactory factory : RuntimePlugin.getPropertyEditorFactories(eClass)) {
				if (tab == null || factory.hasTab(tab)) {
					return true;
				}
			}
		}
		return false;
	}

}
