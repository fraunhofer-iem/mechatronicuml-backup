package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.sheet;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.ui.views.properties.IPropertySource;

import de.uni_paderborn.fujaba.muml.common.emf.edit.provider.CustomPropertySource;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.sheet.MumlPropertySection;

public class CustomStructuredcomponentPropertySection extends
		MumlPropertySection {

	/**
	 * Customized to create our own CustomPropertySource objects.
	 */
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		Object transformed = super.transformSelection(object);

		boolean readOnlyOverride = false;
		if (object instanceof GraphicalEditPart) {
			readOnlyOverride = isReadOnlyPart((GraphicalEditPart) object);
		}

		AdapterFactory af = getAdapterFactory(transformed);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(
					transformed, IItemPropertySource.class);
			if (ips != null) {
				return new CustomPropertySource(transformed, ips,
						readOnlyOverride);
			}
		}
		return super.getPropertySource(transformed);
	}

	private boolean isReadOnlyPart(GraphicalEditPart part) {
		if (part.getNotationView().getElement() instanceof Port) {
			EObject parentElement = getParentElement(part);
			if (parentElement instanceof ComponentPart) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected Object transformSelection(Object selected) {
		return selected;
	}

	/**
	 * Retrieves the model element of the editPart's parent EditPart.
	 * 
	 * @param editPart
	 *            the editPart.
	 * @return the model element of the parent EditPart.
	 */
	private EObject getParentElement(EditPart editPart) {
		ShapeNodeEditPart parentEditPart = (ShapeNodeEditPart) editPart
				.getParent();
		return parentEditPart.getNotationView().getElement();
	}
}
