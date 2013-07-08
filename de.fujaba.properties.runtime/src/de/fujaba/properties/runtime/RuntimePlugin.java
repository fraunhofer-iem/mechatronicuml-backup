package de.fujaba.properties.runtime;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import de.fujaba.properties.runtime.factory.IPropertyEditorFactory;

/**
 * The activator class controls the plug-in life cycle
 */
public class RuntimePlugin extends AbstractUIPlugin {

	private static Map<EReference, List<EClass>> foundEClasses = new HashMap<EReference, List<EClass>>();

	private Map<String, List<IPropertyEditorFactory>> propertyEditorFactoriesMap = null;

	// The plug-in ID
	public static final String PLUGIN_ID = "de.fujaba.properties.runtime"; //$NON-NLS-1$

	public static final String PROPERTY_EDITOR__EXTENSION_POINT_ID = PLUGIN_ID
			+ ".propertyEditors"; //$NON-NLS-1$

	public static final String IMAGE_ADD = "add";

	public static final String IMAGE_REMOVE = "remove";

	// The shared instance
	private static RuntimePlugin plugin;

	/**
	 * The constructor
	 */
	public RuntimePlugin() {
	}

	protected void initializeImageRegistry(ImageRegistry registry) {
		registry.put(IMAGE_ADD, createDescriptor("icons/add.png"));
		registry.put(IMAGE_REMOVE, createDescriptor("icons/remove.png"));
	}

	private ImageDescriptor createDescriptor(String location) {
		Bundle bundle = Platform.getBundle(PLUGIN_ID);
		IPath path = new Path(location);
		URL url = FileLocator.find(bundle, path, null);
		return ImageDescriptor.createFromURL(url);
	}
	

	public static Image getImage(String key) {
		ImageDescriptor descriptor = plugin.getImageRegistry().getDescriptor(
				key);
		return new Image(Display.getCurrent(), descriptor.getImageData());
	}


	public static Image getImage(String key, int width, int height) {
		ImageDescriptor descriptor = plugin.getImageRegistry().getDescriptor(
				key);
		return new Image(Display.getCurrent(), descriptor.getImageData().scaledTo(width,  height));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		getPropertyEditorFactoriesMap();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static RuntimePlugin getDefault() {
		return plugin;
	}

	public static List<IPropertyEditorFactory> getPropertyEditorFactories(EClassifier eClass) {
		// TODO can this be done in a nicer way to get the qualified class name?
		String qualifiedName = eClass.getInstanceClassName();

		return getPropertyEditorFactories(qualifiedName);
	}

	public static List<IPropertyEditorFactory> getPropertyEditorFactories(String type) {
		List<IPropertyEditorFactory> list = getDefault().getPropertyEditorFactoriesMap().get(
				type);
		if (list != null) {
			return list;
		}
		return Collections.emptyList();
	}

	public static Set<String> getRegisteredPropertyEditorTypes() {
		return getDefault().getPropertyEditorFactoriesMap().keySet();
	}

	private Map<String, List<IPropertyEditorFactory>> getPropertyEditorFactoriesMap() {
		if (propertyEditorFactoriesMap == null) {
			propertyEditorFactoriesMap = new HashMap<String, List<IPropertyEditorFactory>>();
			List<IConfigurationElement> elements = Arrays.asList(Platform
					.getExtensionRegistry().getConfigurationElementsFor(
							PROPERTY_EDITOR__EXTENSION_POINT_ID));

			for (IConfigurationElement toplevel : elements) {
				for (IConfigurationElement element : toplevel.getChildren()) {

					// Read type
					String type = element.getAttribute("type");
					if (type == null) {
						continue;
					}

					// Get or create list for that type
					List<IPropertyEditorFactory> list = propertyEditorFactoriesMap
							.get(type);
					if (list == null) {
						list = new ArrayList<IPropertyEditorFactory>();
						propertyEditorFactoriesMap.put(type, list);
					}

					// Read factory
					IPropertyEditorFactory factory = null;
					try {
						Object object = element
								.createExecutableExtension("factory");
						if (object instanceof IPropertyEditorFactory) {
							factory = (IPropertyEditorFactory) object;
						}
					} catch (CoreException e) {
						e.printStackTrace();
					}

					if (factory != null) {
						
						// Add to list
						list.add(factory);
					}
				}
			}
		}
		return propertyEditorFactoriesMap;
	}

	public static String makeHumanReadable(String camelCased) {
		return makeHumanReadable(camelCased, false);
	}

	public static String makeHumanReadable(String camelCased, boolean firstUpper) {
		StringBuffer buffer = new StringBuffer();
		boolean newWord = true, oldWord = true;
		for (int p = 0; p < camelCased.length(); p++) {
			char c = camelCased.charAt(p);
			newWord = Character.isUpperCase(c);
			if (newWord && !oldWord) {
				buffer.append(' ');
			}
			oldWord = newWord;
			buffer.append(c);
		}
		if (buffer.length() != 0 && firstUpper) {
			return buffer.substring(0, 1).toUpperCase() + buffer.substring(1);
		}
		return buffer.toString();
	}

	public static List<EClass> getEClasses(EReference feature) {
		List<EClass> eClasses = foundEClasses.get(feature);
		if (eClasses == null) {
			eClasses = new ArrayList<EClass>();

			AdapterFactory adapterFactory = new ReflectiveItemProviderAdapterFactory();
	
			IItemPropertySource ips = (IItemPropertySource) adapterFactory.adapt(
					feature, IItemPropertySource.class);
	
			if (ips != null) {
				IItemPropertyDescriptor itemPropertyDescriptor = ips
						.getPropertyDescriptor(
								feature,
								org.eclipse.emf.ecore.EcorePackage.Literals.ETYPED_ELEMENT__ETYPE);
				for (Object object : itemPropertyDescriptor
						.getChoiceOfValues(feature)) {
					if (object instanceof EClass) {
						EClass eClass = (EClass) object;
						if (eClass != null && !eClass.isAbstract() && feature.getEReferenceType().isSuperTypeOf(eClass)) {
							eClasses.add(eClass);
						}
						
					}
				}
			}
		}
		return eClasses; 
	}

	public static Object resolveSemanticObject(Object object) {
		if (object instanceof IStructuredSelection) {
			for (Object unresolved : ((IStructuredSelection) object).toArray()) {
				Object resolved = resolveSemanticObject(unresolved);
				if (resolved != null) {
					return resolved;
				}
			}
			return null;
		}
		if(object instanceof EObject) {
			return (EObject) object;
		} else if(object instanceof IAdaptable) {
			IAdaptable adaptable = (IAdaptable)object;
			if(adaptable.getAdapter(EObject.class) != null) {
				return (EObject)adaptable.getAdapter(EObject.class);
			}
		}
		return null;
	}
	
	public static void revalidateLayout (Control control) {

		Control c = control;
		do {
			if (c instanceof ExpandBar) {
				ExpandBar expandBar = (ExpandBar) c;
				for (ExpandItem expandItem : expandBar.getItems()) {
					expandItem
						.setHeight(expandItem.getControl().computeSize(expandBar.getSize().x, SWT.DEFAULT, true).y);
				}
			}
			c = c.getParent();

		} while (c != null && c.getParent() != null && !(c instanceof ScrolledComposite));

		if (c instanceof ScrolledComposite) {
			ScrolledComposite scrolledComposite = (ScrolledComposite) c;
			if (scrolledComposite.getExpandHorizontal() || scrolledComposite.getExpandVertical()) {
				scrolledComposite
					.setMinSize(scrolledComposite.getContent().computeSize(SWT.DEFAULT, SWT.DEFAULT, true));
			} else {
				scrolledComposite.getContent().pack(true);
			}
		}
		if (c instanceof Composite) {
			Composite composite = (Composite) c;
			composite.layout(true, true);
		}
	}


}
