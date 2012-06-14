package de.uni_paderborn.fujaba.muml.common.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.storydriven.core.ExtendableElement;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.ModelinstancePackage;
import de.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.ObjectCreationDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.ObjectsListDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.PropertySheetDialogExtension;
import de.uni_paderborn.fujaba.muml.common.MumlCommonPlugin;
import de.uni_paderborn.fujaba.muml.common.emf.edit.provider.CustomPropertySource;
import de.uni_paderborn.fujaba.muml.common.modelinitializer.TypeCategoryInitializer;

public class OpenTypeDialogCommand extends AbstractHandler {

	private Shell shell;

	private AdapterFactory adapterFactory;

	private static final String TYPES_CATEGORY_KEY = "de.uni_paderborn.fujaba.muml.types.category";

	private static final String TYPES_CATEGORY_NAME = "types";

	public OpenTypeDialogCommand() {
		adapterFactory = MumlCommonPlugin.getInstance()
				.getItemProvidersAdapterFactory();
	}

	@Override
	public Object execute(ExecutionEvent event) {
		// Get shell and uri of current selection
		shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
			Object object = ((IStructuredSelection) selection)
					.getFirstElement();

			EObject element = null;
			if (object instanceof GraphicalEditPart) {
				element = ((GraphicalEditPart) object).getNotationView()
						.getElement();
			}
			if (object instanceof org.eclipse.core.runtime.IAdaptable) {
				org.eclipse.core.runtime.IAdaptable adapter = (org.eclipse.core.runtime.IAdaptable) object;
				element = (org.eclipse.emf.ecore.EObject) adapter
						.getAdapter(org.eclipse.emf.ecore.EObject.class);
			}

			if (element != null) {
				// factories
				// .add(new
				// de.uni_paderborn.fujaba.muml.model.core.provider.CoreItemProviderAdapterFactory());
				//
				Resource resource = element.eResource();
				if (resource != null) {
					EList<EObject> contents = resource.getContents();
					if (!contents.isEmpty()) {
						Object rootContainer = contents.get(0);
						if (rootContainer instanceof RootNode) {
							RootNode rootNode = (RootNode) rootContainer;
							ModelElementCategory typeCategory = getTypeCategory(rootNode);
							if (typeCategory == null) {
								new TypeCategoryInitializer()
										.initialize(rootNode);
							}
							typeCategory = getTypeCategory(rootNode);
							if (typeCategory != null) {
								AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) TransactionUtil
										.getEditingDomain(typeCategory);

								openTypeDialog(typeCategory, editingDomain);
							} else {
								// TODO: Error message
							}
						}
					}
				}
			}

		}

		return null;
	}

	private void openTypeDialog(ModelElementCategory typeCategory,
			AdapterFactoryEditingDomain editingDomain) {

		ILabelProvider labelProvider = null;
		IPropertySourceProvider propertySourceProvider = null;
		if (adapterFactory != null) {
			labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
			propertySourceProvider = createPropertySourceProvider();
		}

		if (propertySourceProvider == null || labelProvider == null) {
			return;
		}

		ExtensibleCreationDialog dialog = new ExtensibleCreationDialog(
				// PlatformUI.getWorkbench().getDisplay().getActiveShell(),
				shell,
				labelProvider,
				typeCategory,
				ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
				adapterFactory, null);

		// Create Extensions:
		// Copied from
		// CustomPropertyDescriptor.MultiFeatureCreationCellEditor.addExtensions()
		// TODO: Maybe we can reuse code here!
		List<ExtendableElement> currentValues = typeCategory.getModelElements();
		ObjectCreationDialogExtension objectCreationDialogExtension = new ObjectCreationDialogExtension(
				dialog, adapterFactory) {

			@Override
			protected List<EClass> getInstanceClasses() {
				List<EClass> subClasses = getSubClasses(de.uni_paderborn.fujaba.muml.model.core.CorePackage.Literals.DATA_TYPE);
				subClasses
						.remove(de.uni_paderborn.fujaba.muml.model.core.CorePackage.Literals.PRIMITIVE_DATA_TYPE);
				return subClasses;
			}

			// TODO: This only finds subclasses within the same package
			// (core-package in this case).
			private List<EClass> getSubClasses(EClass parentClass) {
				List<EClass> classList = new ArrayList<EClass>();
				EList<EClassifier> classifiers = parentClass.getEPackage()
						.getEClassifiers();

				for (EClassifier classifier : classifiers) {
					if (classifier instanceof EClass) {
						EClass clazz = (EClass) classifier;
						if (parentClass.isSuperTypeOf(clazz)
								&& !clazz.isAbstract()) {
							classList.add(clazz);
						}
					}
				}
				return classList;
			}

		};

		PropertySheetDialogExtension propertySheetDialogExtension = new PropertySheetDialogExtension(
				propertySourceProvider, dialog);

		ObjectsListDialogExtension objectsListDialogExtension = new ObjectsListDialogExtension(
				dialog, adapterFactory, currentValues);

		objectCreationDialogExtension
				.setObjectsListDialogExtension(objectsListDialogExtension);

		objectsListDialogExtension
				.setPropertySheetDialogExtension(propertySheetDialogExtension);

		dialog.addExtension(objectCreationDialogExtension,
				ExtensibleCreationDialog.EXTENSION_GROUP_DEFAULT);
		dialog.addExtension(objectsListDialogExtension,
				ExtensibleCreationDialog.EXTENSION_GROUP_DEFAULT);
		dialog.addExtension(propertySheetDialogExtension,
				ExtensibleCreationDialog.EXTENSION_GROUP_DEFAULT);

		if (dialog.open() == Window.OK) {
			org.eclipse.emf.common.command.Command setCommand = org.eclipse.emf.edit.command.SetCommand
					.create(editingDomain,
							typeCategory,
							ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS,
							objectsListDialogExtension.getResult());
			editingDomain.getCommandStack().execute(setCommand);
		}
	}

	private IPropertySourceProvider createPropertySourceProvider() {

		return new IPropertySourceProvider() {

			@Override
			public IPropertySource getPropertySource(Object object) {
				if (object instanceof IPropertySource) {
					return (IPropertySource) object;
				}
				AdapterFactory af = adapterFactory;
				if (af != null) {
					IItemPropertySource ips = (IItemPropertySource) af.adapt(
							object, IItemPropertySource.class);
					if (ips != null) {
						EditingDomain ed = getEditingDomainFor(object);
						return new CustomPropertySource(object, ips, af, ed,
								this, null);
					}
				}
				if (object instanceof IAdaptable) {
					return (IPropertySource) ((IAdaptable) object)
							.getAdapter(IPropertySource.class);
				}
				return null;
			}

			private AdapterFactoryEditingDomain getEditingDomainFor(
					Object object) {
				return (AdapterFactoryEditingDomain) TransactionUtil
						.getEditingDomain(object);
			}

			private AdapterFactory getAdapterFactory(Object object) {
				AdapterFactoryEditingDomain editingDomain = getEditingDomainFor(object);
				if (editingDomain != null) {
					return editingDomain.getAdapterFactory();
				}
				return null;
			}
		};
	}

	private ModelElementCategory getTypeCategory(RootNode rootNode) {
		for (ModelElementCategory category : rootNode.getCategories()) {
			if (TYPES_CATEGORY_KEY.equals(category.getKey())) {
				return category;
			}
		}
		return null;
	}

}
