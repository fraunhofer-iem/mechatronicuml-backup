package de.fujaba.modelinstance.presentation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class ModelinstanceSheetLabelProvider extends BaseLabelProvider
		implements ILabelProvider {

	private static ImageRegistry imageRegistry;

	public String getText(Object element) {
		Object unwrapped = unwrap(element);
		if (unwrapped instanceof EObject) {
			return ((EObject) unwrapped).eClass().getName();
		}
		return "";
	}

	public Image getImage(Object element) {
		Object unwrapped = unwrap(element);
		if (unwrapped instanceof EObject) {
			unwrapped = ((EObject) unwrapped).eClass();
		}
		ImageDescriptor imageDescriptor = null;
		String key = null;
		if (unwrapped instanceof ENamedElement) {
			key = getImageRegistryKey((ENamedElement) unwrapped);
			Image image = getImageRegistry().get(key);
			if (image != null) {
				return image;
			}
			imageDescriptor = getProvidedImageDescriptor((ENamedElement) unwrapped);
		}
		if (imageDescriptor == null) {
			imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
		} else {
			getImageRegistry().put(key, imageDescriptor);
		}
		return getImageRegistry().get(key);
	}

	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	private ImageDescriptor getProvidedImageDescriptor(ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return getItemImageDescriptor(eClass.getEPackage()
						.getEFactoryInstance().create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	public ImageDescriptor getItemImageDescriptor(Object item) {
		AdapterFactory adapterFactory = ModelinstanceEditor.getAdapterFactory();
		IItemLabelProvider labelProvider = null;
		if (adapterFactory != null) {
			labelProvider = (IItemLabelProvider) adapterFactory.adapt(item,
					IItemLabelProvider.class);
		}
		if (labelProvider != null) {
			return ExtendedImageRegistry.getInstance().getImageDescriptor(
					labelProvider.getImage(item));
		}
		return null;
	}

	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}

}
