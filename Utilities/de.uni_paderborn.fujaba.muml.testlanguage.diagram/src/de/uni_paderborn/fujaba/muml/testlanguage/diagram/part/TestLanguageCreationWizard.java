package de.uni_paderborn.fujaba.muml.testlanguage.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class TestLanguageCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.Messages.TestLanguageCreationWizardTitle);
		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewTestLanguageWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageCreationWizardPage(
				"DiagramModelFile", getSelection(), "testlanguage_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.Messages.TestLanguageCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.Messages.TestLanguageCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageCreationWizardPage(
				"DomainModelFile", getSelection(), "testlanguage") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".testlanguage_diagram".length()); //$NON-NLS-1$
					setFileName(de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "testlanguage")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.Messages.TestLanguageCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.Messages.TestLanguageCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.Messages.TestLanguageCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.Messages.TestLanguageCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
