package de.uni_paderborn.fujaba.muml.common.sheet;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.views.properties.tabbed.AbstractTypeMapper;

public class MumlTypeMapper extends AbstractTypeMapper {

	public Class<?> mapType(Object object) {
		if (object instanceof IAdaptable) {
			Object adapter = ((IAdaptable) object).getAdapter(EObject.class);
			if (adapter == null) {
				adapter = ((IAdaptable) object).getAdapter(View.class);
			}
			if (adapter != null) {
				object = adapter;
			}
		}
		if (object instanceof EditPart
				&& ((EditPart) object).getModel() != null) {
			object = ((EditPart) object).getModel();
		}
		if (object instanceof View && ((View) object).getElement() != null) {
			object = ((View) object).getElement();
		}
		return super.mapType(object);
	}
}
