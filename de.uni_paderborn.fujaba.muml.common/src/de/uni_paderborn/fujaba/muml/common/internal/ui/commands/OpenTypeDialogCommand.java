package de.uni_paderborn.fujaba.muml.common.internal.ui.commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
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
import de.uni_paderborn.fujaba.muml.model.types.PrimitiveDataType;

public class OpenTypeDialogCommand extends AbstractHandler {

	private Shell shell;

	private AdapterFactory adapterFactory;

	private static final String TYPES_CATEGORY_KEY = "de.uni_paderborn.fujaba.muml.types.category";

	public OpenTypeDialogCommand() {
		adapterFactory = MumlCommonPlugin.getInstance()
				.getItemProvidersAdapterFactory();
	}

	@Override
	public Object execute(ExecutionEvent event) {
		// Get shell
		shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		if (shell == null) {
			shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		}

		// Get currently selected element
		EObject element = null;
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
			Object object = ((IStructuredSelection) selection)
					.getFirstElement();

			if (object instanceof GraphicalEditPart) {
				element = ((GraphicalEditPart) object).getNotationView()
						.getElement();
			}
			if (object instanceof org.eclipse.core.runtime.IAdaptable) {
				org.eclipse.core.runtime.IAdaptable adapter = (org.eclipse.core.runtime.IAdaptable) object;
				element = (org.eclipse.emf.ecore.EObject) adapter
						.getAdapter(org.eclipse.emf.ecore.EObject.class);
			}
			if (object instanceof IFile) {
				IFile file = (IFile) object;
				ResourceSet rset = new ResourceSetImpl();
				URI uri = URI.createPlatformResourceURI(file.getFullPath()
						.toString(), true);
				Resource resource = rset.getResource(uri, true);
				if (!resource.getContents().isEmpty()) {
					element = resource.getContents().get(0);
				}
			}

			if (element instanceof Diagram) {
				Diagram diagram = (Diagram) element;
				element = diagram.getElement();
			}
		}

		// Get rootContainer of selected element.
		EObject rootContainer = null;
		if (element != null) {
			Resource resource = element.eResource();
			if (resource != null) {
				EList<EObject> contents = resource.getContents();
				if (!contents.isEmpty()) {
					rootContainer = contents.get(0);
				}
			}
		}

		// Get ModelElementCategory for Types
		ModelElementCategory typeCategory = null;
		if (rootContainer instanceof RootNode) {
			RootNode rootNode = (RootNode) rootContainer;
			typeCategory = getTypeCategory(rootNode);
			if (typeCategory == null) {
				new TypeCategoryInitializer().initialize(rootNode);
			}
			typeCategory = getTypeCategory(rootNode);
		}

		// Open Type Dialog for this ModelElementCategory
		if (typeCategory != null) {
			AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) TransactionUtil
					.getEditingDomain(typeCategory);
			ResourceSet rset = typeCategory.eResource().getResourceSet();
			if (editingDomain == null) {
				editingDomain = (AdapterFactoryEditingDomain) TransactionalEditingDomain.Factory.INSTANCE
						.createEditingDomain(rset);
			}

			openTypeDialog(typeCategory, editingDomain);

			for (Resource resource : rset.getResources()) {
				try {
					resource.save(Collections.emptyMap());
				} catch (IOException e) {
					// TODO: Error Message in Error Log
					e.printStackTrace();
				}
			}
		} else {
			// TODO: Error message in Error Log
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

		final ExtensibleCreationDialog dialog = new ExtensibleCreationDialog(
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
				List<EClass> subClasses = getSubClasses(de.uni_paderborn.fujaba.muml.model.types.TypesPackage.Literals.DATA_TYPE);
				subClasses
						.remove(de.uni_paderborn.fujaba.muml.model.types.TypesPackage.Literals.PRIMITIVE_DATA_TYPE);
				return subClasses;
			}

			private List<EClass> getSubClasses(EClass parentClass) {
				List<EClass> classList = new ArrayList<EClass>();

				// TODO: Provide Extension Point, which fills packages array

				EPackage packages[] = new EPackage[] { de.uni_paderborn.fujaba.muml.model.types.TypesPackage.eINSTANCE };
				for (EPackage _package : packages) {
					EList<EClassifier> classifiers = _package.getEClassifiers();

					for (EClassifier classifier : classifiers) {
						if (classifier instanceof EClass) {
							EClass clazz = (EClass) classifier;
							if (parentClass.isSuperTypeOf(clazz)
									&& !clazz.isAbstract()) {
								classList.add(clazz);
							}
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

		objectsListDialogExtension
				.addFilter(new ObjectsListDialogExtension.IFilter() {

					@Override
					public boolean select(EObject object) {
						return !(object instanceof PrimitiveDataType);
					}

				});

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

		// Open the dialog and retrieve the user selection
		ChangeCommand changeCommand = new ChangeCommand(typeCategory) {

			@Override
			protected void doExecute() {
				dialog.open();
			}
			
		};
		editingDomain.getCommandStack().execute(changeCommand);

		if (dialog.getReturnCode() != Window.OK) {			
			editingDomain.getCommandStack().undo();

		} else {
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
