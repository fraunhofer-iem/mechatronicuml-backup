package org.muml.storydiagram.diagram.interpreter.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.diagram.interpreter.wizards.InterpreteActivityWizard;
import org.muml.storydiagram.diagram.part.StorydiagramsDiagramEditor;

public class StartInterpreterHandler extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// search the editor to get the activity
		Activity activity = getActivity(event);

		// open the wizard
		if (activity != null) {
			Shell shell = HandlerUtil.getActiveShell(event);
			InterpreteActivityWizard wizard = new InterpreteActivityWizard(activity);
			new WizardDialog(shell, wizard).open();
		}

		return null;
	}

	private static Activity getActivity(ExecutionEvent event) {
		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
		if (activeEditor instanceof StorydiagramsDiagramEditor) {
			DiagramEditor dtp = (DiagramEditor) activeEditor;

			EObject element = ((Diagram) dtp.getDiagramEditPart().getModel()).getElement();

			if (element instanceof Activity) {
				return (Activity) element;
			}
		}

		return null;
	}
}
