package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.sheet;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySource;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.common.sheet.CustomPropertySource;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts.CustomPortEditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.sheet.UmlrtPropertySection;

public class CustomStructuredcomponentPropertySection extends
		UmlrtPropertySection {

	/**
	 * Customized to create our own CustomPropertySource objects.
	 */
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object,
					IItemPropertySource.class);
			if (ips != null) {
				return new CustomPropertySource(object, ips);
			}
		}
		return super.getPropertySource(object);
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			StructuredSelection sel = (StructuredSelection) selection;
			if (sel.size() == 1) {
				Object ep = sel.getFirstElement();
				if (ep instanceof CustomPortEditPart) {
					EObject parentElement = getParentElement((CustomPortEditPart) ep);
					if (parentElement instanceof ComponentPart) {
						selection = StructuredSelection.EMPTY;
					}
				}
			}
		}
		super.setInput(part, selection);
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
