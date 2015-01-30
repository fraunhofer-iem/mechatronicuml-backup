package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.ide.IDE;
import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.common.edit.commands.ExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.export.operation.AbstractFujabaExportOperation;
import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;
import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.modelinstance.util.ModelinstanceResourceImpl;
import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.diagram.custom.part.Activator;

/**
 * 
 * @author sthiele2
 *
 */
public class ExportWizardPatternToProtocol extends
		de.uni_paderborn.fujaba.export.wizard.AbstractFujabaExportWizard {

	private static final String patternModelElementCategoryKey = "pattern.category";
	ArrayList<CoordinationPattern> patternList = new ArrayList<CoordinationPattern>();

	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {

		initialSelection = currentSelection;
		List<?> selectedResources = IDE
				.computeSelectedResources(currentSelection);
		if (!selectedResources.isEmpty()) {
			initialSelection = new StructuredSelection(selectedResources);
		}
		setNeedsProgressMonitor(true);

		// try to infer editing domain from initial selection

		for (Object element : initialSelection.toArray()) {
			EObject eObject = null;
			if (element instanceof IAdaptable) {
				IAdaptable adaptable = (IAdaptable) element;
				eObject = (EObject) adaptable.getAdapter(EObject.class);
			}
			if (element instanceof EObject) {
				eObject = (EObject) element;
			}

			if (eObject != null) {
				// cases that the RootNode or a ModelElementCategory is
				// seleceted
				if (eObject instanceof RootNode) {
					RootNode root = (RootNode) eObject;
					this.findCoordinationPattern(root);
				} else if (eObject instanceof ModelElementCategory) {
					ModelElementCategory category = (ModelElementCategory) eObject;
					if (category.getKey()
							.equals(patternModelElementCategoryKey)) {
						this.findCoordinationPatternfromPatternModelElementCategory(category);
					} else {
						this.findCoordinationPattern((RootNode) category
								.eContainer());
					}
				} else {
					EObject iterator = eObject;
					while (iterator != null && !(iterator instanceof RootNode)) {
						iterator = iterator.eContainer();
					}
					if (iterator != null) {
						this.findCoordinationPattern((RootNode) iterator);
					}
				}
			}
			if (element instanceof ModelinstanceResourceImpl) {
				ModelinstanceResourceImpl res = (ModelinstanceResourceImpl) element;
				RootNode root = (RootNode) res.getContents().get(0);
				this.findCoordinationPattern(root);
			}

			if (eObject != null) {
				editingDomain = AdapterFactoryEditingDomain
						.getEditingDomainFor(eObject);
				if (editingDomain != null) {
					break;
				}
			}
		}

		// create default editing domain, if none was found
		if (editingDomain == null) {
			editingDomain = WorkspaceEditingDomainFactory.INSTANCE
					.createEditingDomain();
		}

	}

	private void findCoordinationPatternfromPatternModelElementCategory(
			ModelElementCategory category) {
		for (ExtendableElement pattern : category.getModelElements()) {
			patternList.add((CoordinationPattern) pattern);
		}
	}

	private void findCoordinationPattern(RootNode root) {
		EList<ModelElementCategory> categories = root.getCategories();
		for (ModelElementCategory category : categories) {
			if (category.getKey().equals(patternModelElementCategoryKey)) {
				findCoordinationPatternfromPatternModelElementCategory(category);
			}
		}
	}

	public void addPages() {
		addPage(new PatternToProtocolExportWizardPage1("Page 1", toolkit));
		addPage(new PatternToProtocolExportWizardPage2("Page 2", toolkit));

	}

	public ArrayList<CoordinationPattern> getPatternList() {
		return this.patternList;
	}

	@Override
	public String wizardGetId() {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		// TODO Auto-generated method stub
		return new AbstractFujabaExportOperation() {
			@Override
			protected IStatus doExecute(IProgressMonitor progressMonitor) {
				return Status.OK_STATUS;
			}
		};
		
	}
	
	public boolean performFinish()
	{
		super.performFinish();
		System.out.println("Finished Pressed!!");
		 TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE
				 	.createEditingDomain(this.getResourceSet());
		 transformPatternToProtocol(domain, this.getPatternList().get(((PatternToProtocolExportWizardPage1)this.getPages()[0]).getSelectedPattern()));
		return true;
	}
	
	private static void transformPatternToProtocol(
			EditingDomain editingDomain, CoordinationPattern pattern) 
	{
		
		ModelExtent inputExtent = new BasicModelExtent(
				Arrays.asList(new EObject[] { pattern,pattern.eContainer().eContainer() }));

		final List<ModelExtent> modelExtents = Arrays
				.asList(new ModelExtent[] { inputExtent });

		// Load QVTO script
		final TransformationExecutor transformationExecutor = Activator
				.getInstance().getTransformationExecutor(
						"/ExampleProject/transforms/TransformPatternToProtocol.qvto", false);

		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents);

		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}

		if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
			editingDomain.getCommandStack().undo();
		}
	}
}
