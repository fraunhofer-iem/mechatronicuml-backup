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
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import de.fujaba.properties.runtime.editors.IPropertyEditor;

/**
 * The activator class controls the plug-in life cycle
 */
public class RuntimePlugin extends AbstractUIPlugin {

	private static Map<EReference, List<EClass>> foundEClasses = new HashMap<EReference, List<EClass>>();

	private Map<String, List<IPropertyEditor>> propertyEditorsMap = null;

	// The plug-in ID
	public static final String PLUGIN_ID = "de.fujaba.properties.runtime"; //$NON-NLS-1$

	public static final String PROPERTY_EDITOR__EXTENSION_POINT_ID = PLUGIN_ID
			+ ".propertyEditor"; //$NON-NLS-1$

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

	public static Image getImage(String key, Display display) {
		ImageDescriptor descriptor = plugin.getImageRegistry().getDescriptor(
				key);
		return new Image(display, descriptor.getImageData());
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
		getPropertyEditorsMap();
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

	public static List<IPropertyEditor> getPropertyEditors(EClassifier eClass) {
		// TODO can this be done in a nicer way to get the qualified class name?
		String qualifiedName = eClass.getInstanceClassName();

		return getPropertyEditors(qualifiedName);
	}
	
	public static List<IPropertyEditor> getPropertyEditors(String type, String tab) {
		if (tab == null) {
			return Collections.emptyList();
		}
		List<IPropertyEditor> selectedEditors = new ArrayList<IPropertyEditor>();
		for (IPropertyEditor editor : getPropertyEditors(type)) {
			if (tab.equals(editor.getTab())) {
				selectedEditors.add(editor);
			}
		}
		return selectedEditors;
	}

	public static List<IPropertyEditor> getPropertyEditors(String type) {
		List<IPropertyEditor> list = getDefault().getPropertyEditorsMap().get(
				type);
		if (list != null) {
			return list;
		}
		return Collections.emptyList();
	}

	public static Set<String> getRegisteredPropertyEditorTypes() {
		return getDefault().getPropertyEditorsMap().keySet();
	}

	private Map<String, List<IPropertyEditor>> getPropertyEditorsMap() {
		if (propertyEditorsMap == null) {
			propertyEditorsMap = new HashMap<String, List<IPropertyEditor>>();
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
					List<IPropertyEditor> list = propertyEditorsMap
							.get(type);
					if (list == null) {
						list = new ArrayList<IPropertyEditor>();
						propertyEditorsMap.put(type, list);
					}
					
					// Read tab
					String tab = element.getAttribute("tab");

					// Read editor
					IPropertyEditor editor = null;
					try {
						Object object = element
								.createExecutableExtension("editor");
						if (object instanceof IPropertyEditor) {
							editor = (IPropertyEditor) object;
						}
					} catch (CoreException e) {
						e.printStackTrace();
					}
					
					// Set Tab
					editor.setTab(tab);

					// Add to list
					if (editor != null) {
						list.add(editor);
					}
				}
			}
		}
		return propertyEditorsMap;
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

}
