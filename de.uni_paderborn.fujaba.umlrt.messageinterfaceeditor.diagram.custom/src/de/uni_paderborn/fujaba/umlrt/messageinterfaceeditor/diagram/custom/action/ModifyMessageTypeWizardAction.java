package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.custom.action;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.custom.wizard.ModifyParameterWizard;
import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.parts.MessageTypeEditPart;

public class ModifyMessageTypeWizardAction extends
		AbstractMessageinterfaceEditorAction implements
		IWorkbenchWindowActionDelegate {
	protected MessageType selectedMessageType = null;

	private IWorkbenchWindow window;

	public void dispose() {
		// nothing to do
	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	@Override
	public void run(IAction action) {

		org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag = (org.eclipse.gmf.runtime.notation.impl.DiagramImpl) getEditor()
				.getDiagram();

		Shell shell = null;
		IWorkbench workbench = null;
		if (this.getEditor() != null) {
			shell = this.getEditor().getSite().getShell();
			workbench = this.getEditor().getEditorSite().getWorkbenchWindow()
					.getWorkbench();
		} else {
			shell = this.window.getShell();
			workbench = this.window.getWorkbench();
		}

		ModifyParameterWizard wizard = new ModifyParameterWizard(
				selectedMessageType);
		wizard.init(workbench, null);
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.create();
		dialog.open();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {

		if ((selection instanceof IStructuredSelection)) {
			IStructuredSelection structured = (IStructuredSelection) selection;
			Object obj = structured.getFirstElement();

			if (obj instanceof MessageTypeEditPart
					&& ((MessageTypeEditPart) obj).getNotationView()
							.getElement() instanceof MessageType) {

				selectedMessageType = (MessageType) ((MessageTypeEditPart) obj)
						.getNotationView().getElement();
			}
		}

		super.selectionChanged(action, selection);
	}
}
