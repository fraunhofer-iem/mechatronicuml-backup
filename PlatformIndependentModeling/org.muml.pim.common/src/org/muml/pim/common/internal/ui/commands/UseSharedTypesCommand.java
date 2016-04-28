package org.muml.pim.common.internal.ui.commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.RootNode;
import org.muml.pim.common.modelinitializer.TypeCategoryInitializer;
import org.muml.pim.types.PredefinedTypesResourceFactory;
import org.muml.pim.types.PrimitiveDataType;

public class UseSharedTypesCommand extends AbstractHandler {

	private static final String TYPES_CATEGORY_KEY = "org.muml.types.category";

	public UseSharedTypesCommand() {
	}

	@Override
	public Object execute(ExecutionEvent event) {
		// Get shell
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
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
		} else if (rootContainer instanceof ModelElementCategory) {
			ModelElementCategory category = (ModelElementCategory) rootContainer;
			if (TYPES_CATEGORY_KEY.equals(category.getKey())) {
				typeCategory = category;
			}
		}
		
		// Open Type Dialog for this ModelElementCategory
		if (typeCategory != null) {
			AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) TransactionUtil
					.getEditingDomain(typeCategory);
			final ResourceSet rset = typeCategory.eResource().getResourceSet();
			final Resource predefinedResource = rset.getResource(PredefinedTypesResourceFactory.PREDEFINED_TYPES_URI, true);
			if (predefinedResource == null) {
				return null;
			}
			EcoreUtil.resolveAll(rset);
			if (editingDomain == null) {
				editingDomain = (AdapterFactoryEditingDomain) TransactionalEditingDomain.Factory.INSTANCE
						.createEditingDomain(rset);
			}
			
			final ModelElementCategory typeCategoryFinal = typeCategory;
			
			editingDomain.getCommandStack().execute(new ChangeCommand(typeCategory) {

				@SuppressWarnings({ "rawtypes", "unchecked" })
				@Override
				protected void doExecute() {

					List<PrimitiveDataType> primitiveDataTypes = new ArrayList<PrimitiveDataType>();
					for (Object object : typeCategoryFinal.getModelElements()) {
						if (object instanceof PrimitiveDataType) {
							// Remove and redirect references
							primitiveDataTypes.add((PrimitiveDataType) object);
						}
					}
				    
					// Migrate Cross References to use shared types
					for (Map.Entry<EObject, Collection<EStructuralFeature.Setting>> entry : EcoreUtil.UsageCrossReferencer.findAll(primitiveDataTypes, rset).entrySet()) {
						PrimitiveDataType sourceType = (PrimitiveDataType) entry.getKey();
						PrimitiveDataType targetType = findTargetType(predefinedResource, sourceType);
						if (targetType != null) {
							for (EStructuralFeature.Setting setting : entry.getValue()) {
								if (setting.getEStructuralFeature().isMany()) {
									Collection<Object> values = (Collection) setting.getEObject().eGet(setting.getEStructuralFeature());
									values.remove(sourceType);
									values.add(targetType);
								} else {
									setting.getEObject().eSet(setting.getEStructuralFeature(), targetType);
								}
							}
						}
					}
					
					typeCategoryFinal.getModelElements().removeAll(primitiveDataTypes);
					
					try {
						typeCategoryFinal.eResource().save(Collections.emptyMap());
					} catch (IOException e) {
						e.printStackTrace();
					}
					

				}

				private PrimitiveDataType findTargetType(Resource predefinedResource, PrimitiveDataType sourceType) {
					for (EObject element : predefinedResource.getContents()) {
						if (element instanceof PrimitiveDataType) {
							PrimitiveDataType targetType = (PrimitiveDataType) element;
							if (targetType.getPrimitiveType() == sourceType.getPrimitiveType()) {
								return targetType;
							}
						}
					}
					return null;
				}
			});

		}

		return null;
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
