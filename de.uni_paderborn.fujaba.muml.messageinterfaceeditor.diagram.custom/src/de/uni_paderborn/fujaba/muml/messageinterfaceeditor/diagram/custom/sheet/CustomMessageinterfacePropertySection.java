package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.sheet;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.ui.views.properties.IPropertySource;

import de.uni_paderborn.fujaba.muml.common.sheet.CustomPropertySource;
import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.sheet.MessageinterfacePropertySection;

public class CustomMessageinterfacePropertySection extends
		MessageinterfacePropertySection {

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
				return new CustomPropertySource(object, ips, af);
			}
		}
		return super.getPropertySource(object);
	}

//	@Override
//	public void setInput(IWorkbenchPart part, ISelection selection) {
//		if (selection instanceof StructuredSelection) {
//			StructuredSelection sel = (StructuredSelection) selection;
//			if (sel.size() == 1) {
//				Object ep = sel.getFirstElement();
//				if (ep instanceof CustomPortInstanceEditPart) {
//					EObject parentElement = getParentElement((CustomPortInstanceEditPart) ep);
//					if (parentElement instanceof ComponentPart) {
//						selection = StructuredSelection.EMPTY;
//					}
//				}
//			}
//		}
//		super.setInput(part, selection);
//	}

//	/**
//	 * Retrieves the model element of the editPart's parent EditPart.
//	 * 
//	 * @param editPart
//	 *            the editPart.
//	 * @return the model element of the parent EditPart.
//	 */
//	private EObject getParentElement(EditPart editPart) {
//		ShapeNodeEditPart parentEditPart = (ShapeNodeEditPart) editPart
//				.getParent();
//		return parentEditPart.getNotationView().getElement();
//	}
}
