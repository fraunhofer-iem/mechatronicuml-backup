package de.uni_paderborn.fujaba.properties.runtime;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
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
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.uni_paderborn.fujaba.properties.runtime.editors.IValueChangedListener;
import de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor;
import de.uni_paderborn.fujaba.properties.runtime.editors.ObjectPropertyEditor;
import de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory;
import de.uni_paderborn.fujaba.properties.runtime.wizard.ElementSelectionWizardPage;
import de.uni_paderborn.fujaba.properties.runtime.wizard.ElementSelectionWizardPage.IElementValidator;
import de.uni_paderborn.fujaba.properties.runtime.wizard.PropertiesWizard;
import de.uni_paderborn.fujaba.properties.runtime.wizard.PropertiesWizardDialog;
import de.uni_paderborn.fujaba.properties.runtime.wizard.PropertyEditorWizardPage;

/**
 * The activator class controls the plug-in life cycle
 */
public class RuntimePlugin extends AbstractUIPlugin {



	private static Map<EReference, List<EClass>> foundEClasses = new HashMap<EReference, List<EClass>>();

	private Map<String, List<IPropertyEditorFactory>> propertyEditorFactoriesMap = null;

	// The plug-in ID
	public static final String PLUGIN_ID = "de.uni_paderborn.fujaba.properties.runtime"; //$NON-NLS-1$

	public static final String PROPERTY_EDITOR__EXTENSION_POINT_ID = PLUGIN_ID
			+ ".propertyEditors"; //$NON-NLS-1$
	
	public static final String METAMODEL_CONTRIBUTOR__EXTENSION_POINT_ID = PLUGIN_ID + ".metamodelContributor"; //$NON-NLS-1$


	public static final String IMAGE_ADD = "add";

	public static final String IMAGE_REMOVE = "remove";

	public static final String IMAGE_UP = "up";

	public static final String IMAGE_DOWN = "down";
	
	// The shared instance
	private static RuntimePlugin plugin;

	public static AdapterFactory DEFAULT_ADAPTER_FACTORY;

	public static org.eclipse.ocl.ecore.OCL OCL_ECORE = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);

	/**
	 * The constructor
	 */
	public RuntimePlugin() {
	}

	protected void initializeImageRegistry(ImageRegistry registry) {
		registry.put(IMAGE_ADD, createDescriptor("icons/add.png"));
		registry.put(IMAGE_REMOVE, createDescriptor("icons/remove.png"));
		registry.put(IMAGE_UP, createDescriptor("icons/up.png"));
		registry.put(IMAGE_DOWN, createDescriptor("icons/down.png"));
	}

	private ImageDescriptor createDescriptor(String location) {
		IPath path = new Path(location);
		URL url = FileLocator.find(getDefault().getBundle(), path, null);
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

		// Create default adapter factory
		List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		factories.add(new org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory());
		factories.add(new org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory());
		DEFAULT_ADAPTER_FACTORY = new ComposedAdapterFactory(factories);
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
		DEFAULT_ADAPTER_FACTORY = null;
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
		// XXX: Legacy support; remove
		String qualifiedName = eClass.getInstanceClassName();
		List<IPropertyEditorFactory> factories = getPropertyEditorFactories(qualifiedName);
		
		qualifiedName = eClass.getEPackage().getNsURI() + "#" + eClass.getName();
		factories.addAll(getPropertyEditorFactories(qualifiedName));
		return factories;
	}

	public static List<IPropertyEditorFactory> getPropertyEditorFactories(String type) {
		List<IPropertyEditorFactory> list = getDefault().getPropertyEditorFactoriesMap().get(
				type);
		if (list != null) {
			return list;
		}
		return new ArrayList<IPropertyEditorFactory>();
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
			if (newWord && !oldWord && buffer.length() > 1) {
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

			// New implementation considering the whole package registry.
			org.eclipse.emf.ecore.EPackage.Registry registry = EPackage.Registry.INSTANCE;
			for (String key : new HashSet<String>(registry.keySet())) {
			    EPackage ePackage = registry.getEPackage(key);
			   for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				   if (eClassifier instanceof EClass) {
					   EClass eClass = (EClass) eClassifier;
					   if (eClass != null && !eClass.isAbstract() && feature.getEReferenceType().isSuperTypeOf(eClass)) {
							eClasses.add(eClass);
					   }
				   }
			   }
			}
			
			// This implementation has problems: It does not find eClasses of extending metamodels.
//			AdapterFactory adapterFactory = new ReflectiveItemProviderAdapterFactory();
//	
//			IItemPropertySource ips = (IItemPropertySource) adapterFactory.adapt(
//					feature, IItemPropertySource.class);
//	
//			if (ips != null) {
//				IItemPropertyDescriptor itemPropertyDescriptor = ips
//						.getPropertyDescriptor(
//								feature,
//								org.eclipse.emf.ecore.EcorePackage.Literals.ETYPED_ELEMENT__ETYPE);
//				for (Object object : itemPropertyDescriptor
//						.getChoiceOfValues(feature)) {
//					if (object instanceof EClass) {
//						EClass eClass = (EClass) object;
//						if (eClass != null && !eClass.isAbstract() && feature.getEReferenceType().isSuperTypeOf(eClass)) {
//							eClasses.add(eClass);
//						}
//						
//					}
//				}
//			}
			foundEClasses.put(feature, eClasses);
		}
		return new ArrayList<EClass>(eClasses); 
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
		//System.out.println("Relayouting...");
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

	
	// TODO: Unify the following dialog creation methods
	public static void showEditElementDialog(AdapterFactory adapterFactory, EObject element) {
		PropertiesWizard wizard = new PropertiesWizard();
		ObjectPropertyEditor editor = new ObjectPropertyEditor(null, adapterFactory, "Object properties", true);
		PropertyEditorWizardPage page = new PropertyEditorWizardPage(editor);
		page.setTitle(String.format("Modify ", element.eClass().getName()));
		page.setDescription(String.format("Changes properties of the existing %s", element.eClass().getName()));
		wizard.addPage(page);
		page.setInput(element);
		showWizardWithUndo(wizard, element);
	}

	public static void showCreateElementDialog(AdapterFactory adapterFactory, EObject container,
			EStructuralFeature feature) {
		PropertiesWizard wizard = new PropertiesWizard();
		NavigationFeaturePropertyEditor editor = new NavigationFeaturePropertyEditor(adapterFactory, feature, true);
		
		final PropertyEditorWizardPage page = new PropertyEditorWizardPage(editor);
		editor.addValueChangedListener(new IValueChangedListener() {
			Collection<?> initialElements = null;
			@Override
			public void valueChanged(Object newValue) {
				if (initialElements == null) {
					initialElements = new ArrayList<Object>((Collection<?>)newValue);
				}
				page.setPageComplete(!initialElements.equals(newValue));
			}
		});

		// Get Element Name
		String elementName = container.eClass().getName();
		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(container, IItemLabelProvider.class);
		if (labelProvider != null) {
			elementName = labelProvider.getText(container);
		}
		
		// Get feature name
		String featureName = makeHumanReadable(feature.getName()).toLowerCase();
		if (feature.isMany()) {
			featureName = makeSingular(featureName);
		}
		
		// Set Title and Description
		page.setTitle(String.format("Create new %s", feature.getEType().getName()));
		page.setDescription(String.format("Creates a new %s for the %s.", featureName, elementName));
	
		// Add page, set input and show wizard
		wizard.addPage(page);
		page.setInput(container);
		showWizardWithUndo(wizard, container);
	}
	
	public static void showEditElementDialog(AdapterFactory adapterFactory, EObject container, EStructuralFeature feature, EObject currentValue) {
		PropertiesWizard wizard = new PropertiesWizard();
		NavigationFeaturePropertyEditor editor = new NavigationFeaturePropertyEditor(adapterFactory, feature, true, currentValue);
		PropertyEditorWizardPage page = new PropertyEditorWizardPage(editor);

		// Get Element Name
		String elementName = container.eClass().getName();
		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(container, IItemLabelProvider.class);
		if (labelProvider != null) {
			elementName = labelProvider.getText(container);
		}
		
		// Get feature name
		String featureName = makeHumanReadable(feature.getName()).toLowerCase();
		if (feature.isMany()) {
			featureName = makeSingular(featureName);
		}
		
		// Set Title and Description
		page.setTitle(String.format("Modify %s", feature.getEType().getName()));
		page.setDescription(String.format("Changes properties of the existing %s", featureName, elementName));
	
		// Add page, set input and show wizard
		wizard.addPage(page);
		page.setInput(container);
		showWizardWithUndo(wizard, container);
	}
	
	public static List<Object> showReferenceElementDialog(
			AdapterFactory adapterFactory, Collection<?> choices) {
		return showReferenceElementDialog(adapterFactory, choices, null);
	}
	
	@SuppressWarnings("unchecked")
	public static List<Object> showReferenceElementDialog(
			AdapterFactory adapterFactory, Collection<?> choices, Object defaultValue) {
		return showReferenceElementDialog(adapterFactory, choices, defaultValue, Collections.EMPTY_LIST, true);
	}

	public static List<Object> showReferenceElementDialog(
			AdapterFactory adapterFactory, Collection<?> choices, Object defaultValue, List<IElementValidator> validators, boolean multi) {
		PropertiesWizard wizard = new PropertiesWizard();
		wizard.setWindowTitle("Selection");
		ElementSelectionWizardPage page = new ElementSelectionWizardPage(adapterFactory, choices, defaultValue, multi);
		wizard.addPage(page);
		for (IElementValidator validator : validators) {
			page.addElementValidator(validator);
		}
		final WizardDialog wizardDialog = new WizardDialog(Display.getCurrent().getActiveShell(), wizard);
		if (wizardDialog.open() == Window.OK) {
			return page.getElements();
		}
		return null;
	}
	
	
	
	
	
	
	public static String makeSingular(String word) {
		if (word.substring(word.length() - 3).equals("ies")) {
			word = word.substring(0, word.length() - 3) + "y";
		} else if (word.charAt(word.length() - 1) == 's') {
			word = word.substring(0, word.length() - 1);
		}
		return word;
	}

	public static void showWizardWithUndo(Wizard wizard, Notifier notifier) {
		final PropertiesWizardDialog wizardDialog = new PropertiesWizardDialog(Display.getCurrent().getActiveShell(), wizard);
		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(notifier);
		wizardDialog.openWithUndo(editingDomain, notifier);

	}
	public static void setCurrentEditorSelection(List<Object> selection) {
		setCurrentEditorSelection(selection, false);
	}

	public static void setCurrentEditorSelection(List<Object> selection, boolean allowEmpty) {
		if (selection == null || selection.isEmpty()) {
			selection = Collections.emptyList();
		}
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IEditorPart editorPart = null;
		if (window != null && window.getActivePage() != null) {
			editorPart = window.getActivePage().getActiveEditor();
		}
		ISelectionProvider selectionProvider = null;
		if (editorPart != null && editorPart.getSite() != null) {
			selectionProvider = editorPart.getSite().getSelectionProvider();
		}
		if (selection.isEmpty()) {
			// do not remove selection, as it closes the properties
			//selectionProvider.setSelection(new StructuredSelection());
		} else if (selectionProvider instanceof EditPartViewer) {
			List<Object> selectedElements = new ArrayList<Object>();
			EditPartViewer viewer = (EditPartViewer) selectionProvider;
			for (Object part : viewer.getEditPartRegistry().values()) {
				if (part instanceof IAdaptable) {
					Object model = ((IAdaptable) part).getAdapter(EObject.class);
					if (selection.contains(model) && ((EditPart) part).isSelectable()) {
						selectedElements.add(part);
					}
				}
			}
			if (!selectedElements.isEmpty() || allowEmpty) {
				selectionProvider.setSelection(new StructuredSelection(selectedElements));
			}
		} else if (selectionProvider != null) {
			// Currently we only want to set the selection of graphical editors
			//selectionProvider.setSelection(new StructuredSelection(selection));
		}
	}



}
