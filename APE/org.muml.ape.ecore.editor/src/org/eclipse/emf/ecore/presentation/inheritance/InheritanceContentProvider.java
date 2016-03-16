package org.eclipse.emf.ecore.presentation.inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

public class InheritanceContentProvider extends AdapterFactoryContentProvider {

	protected InheritanceMode mode;

	public InheritanceContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		this.mode = InheritanceMode.NONE;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Object[] getChildren(Object object) {
		if (object instanceof EClass && mode == InheritanceMode.FEATURES) {
			EClass eClass = (EClass) object;
			Collection children = new ArrayList<Object>();
			if (mode == InheritanceMode.FEATURES) {
				for (EClass superType : eClass.getESuperTypes()) {
					for (EStructuralFeature superFeature : superType
							.getEAllStructuralFeatures()) {
						if (!children.contains(superFeature)) {
							children.add(new InheritanceNode(mode, superFeature));
						}
					}
				}
			}
			children.addAll(Arrays.asList(super.getChildren(object)));
			return children.toArray();
		} else if (object instanceof EGenericType && mode == InheritanceMode.HIERARCHY) {
			EGenericType type = (EGenericType) object;
			return new Object[] { type.getEClassifier() };
		}
		return super.getChildren(object);
	}

	public void setInheritanceMode(InheritanceMode mode) {
		this.mode = mode;
	}

	public boolean hasChildren(Object object) {
		if (object instanceof EGenericType) {
			return true;
		}
		return super.hasChildren(object);
	}

}