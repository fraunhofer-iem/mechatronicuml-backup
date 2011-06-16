package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part;

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
public class MumlCreationWizard extends Wizard implements INewWizard {

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
	protected de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlCreationWizardPage domainModelFilePage;

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
		setWindowTitle(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.Messages.MumlCreationWizardTitle);
		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewModelinstanceWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlCreationWizardPage(
				"DiagramModelFile", getSelection(), "atomiccomponent_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.Messages.MumlCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.Messages.MumlCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlCreationWizardPage(
				"DomainModelFile", getSelection(), "fujaba") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".atomiccomponent_diagram".length()); //$NON-NLS-1$
					setFileName(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "fujaba")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.Messages.MumlCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.Messages.MumlCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.Messages.MumlCreationWizardOpenEditorError,
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
								de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.Messages.MumlCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
