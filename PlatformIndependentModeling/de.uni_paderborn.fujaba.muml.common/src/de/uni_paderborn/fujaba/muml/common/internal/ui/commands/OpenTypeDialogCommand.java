package de.uni_paderborn.fujaba.muml.common.internal.ui.commands;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.internal.IWorkbenchHelpContextIds;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.dialogs.ImportExportWizard;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.common.MumlCommonPlugin;
import de.uni_paderborn.fujaba.muml.common.modelinitializer.TypeCategoryInitializer;
import de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin;

public class OpenTypeDialogCommand extends AbstractHandler {

	private static final String TYPES_CATEGORY_KEY = "de.uni_paderborn.fujaba.muml.types.category";

	public OpenTypeDialogCommand() {
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

			openTypeDialog(shell, typeCategory, editingDomain);

			for (Resource resource : rset.getResources()) {
				try {
					resource.save(Collections.emptyMap());
				} catch (IOException e) {
					// TODO: Error Message in Error Log
					e.printStackTrace();
				}
			}
		} else {
			// TODO: Display message box that the Fujaba Model is invalid.
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
	
	private void openTypeDialog(Shell shell, ModelElementCategory typeCategory,
			AdapterFactoryEditingDomain editingDomain) {
		RuntimePlugin.showEditElementDialog(editingDomain.getAdapterFactory(), typeCategory, "Data Type Editor"); 
	}


}
