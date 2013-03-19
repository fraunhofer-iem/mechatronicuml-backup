package de.uni_paderborn.fujaba.muml.common.sheet;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import de.uni_paderborn.fujaba.muml.common.MumlCommonPlugin;

/**
 * @generated
 */
public class MumlSheetLabelProvider extends BaseLabelProvider implements
		ILabelProvider {
	private ImageRegistry registry = new ImageRegistry();
	private static final String BLANK = "";
	private Image emptyImage;

	public MumlSheetLabelProvider() {
		emptyImage = new Image(Display.getCurrent(), 16, 16);
	}

	public String getText(Object element) {
		element = unwrap(element);
		// if (element instanceof de.uni_paderborn.fujaba.muml.XXX.diagram.navigator.XXXNavigatorGroup)	{
		//	 return ((de.uni_paderborn.fujaba.muml.XXX.diagram.navigator.XXXNavigatorGroup) element).getGroupName();
		// }
		IElementType etype = getElementType(getView(element));
		return etype == null ? "" : etype.getDisplayName();
	}

	public Image getImage(Object object) {
		// Unwrap semantic element
		EObject element = null;
		View view = getView(unwrap(object));
		if (view != null) {
			element = view.getElement();
		}
		
		// get image for that semantic element
		String key = getImageKey(element);
		ImageDescriptor descriptor = getImageDescriptor(element);
		Image image = registry.get(key);;
		if (image == null) {
			registry.put(key, descriptor);
			image = registry.get(key);
		}
		return image;
	}

	private String getImageKey(Object element) {
		String key = null;
		if (element instanceof EObject) {
			key = ((EObject) element).eClass().getName();
		}
		if (key == null) {
			key = BLANK;
		}
		return key;
	}

	public ImageDescriptor getImageDescriptor(Object element) {
		ImageDescriptor descriptor = null;
		AdapterFactory adapterFactory = MumlCommonPlugin.getInstance()
				.getItemProvidersAdapterFactory();
		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory
				.adapt(element, IItemLabelProvider.class);
		if (labelProvider != null) {
			descriptor = ExtendedImageRegistry.getInstance().getImageDescriptor(
					labelProvider.getImage(element));
		}
		if (descriptor == null) {
			descriptor = ImageDescriptor.getMissingImageDescriptor();  
		}
		return descriptor;
	}

	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}

	private View getView(Object element) {
		if (element instanceof View) {
			return (View) element;
		}
		if (element instanceof IAdaptable) {
			return (View) ((IAdaptable) element).getAdapter(View.class);
		}
		return null;
	}

	private IElementType getElementType(View view) {
		// Generic code:
		if (view != null) {
			IElementType[] elementTypes = ElementTypeRegistry.getInstance()
					.getAllTypesMatching(view.getElement());
			if (elementTypes != null && elementTypes.length > 0) {
				return elementTypes[0];
			}
		}

		// Editor specific code:

		// // For intermediate views climb up the containment hierarchy to find
		// the
		// // one associated with an element type.
		// while (view != null) {
		// int vid =
		// de.uni_paderborn.fujaba.muml.XXX.diagram.part.MumlVisualIDRegistry
		// .getVisualID(view);
		// IElementType etype =
		// de.uni_paderborn.fujaba.muml.XXX.diagram.providers.MumlElementTypes
		// .getElementType(vid);
		// if (etype != null) {
		// return etype;
		// }
		// view = view.eContainer() instanceof View ? (View) view.eContainer()
		// : null;
		// }
		return null;
	}

}
