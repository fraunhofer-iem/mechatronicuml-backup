package org.muml.storydiagram.diagram.custom.dialogs;


import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.muml.core.modelinstance.ui.diagrams.AbstractFujabaDiagramNewWizard;
import org.muml.storydiagram.diagram.part.StorydiagramsDiagramEditor;
import org.muml.storydiagram.diagram.part.StorydiagramsDiagramEditorPlugin;

/**
 * A CreationWizard for Activity diagrams. It implements the abstract creation
 * wizard from the org.muml.core.modelinstance.ui plugin.
 * 
 * @author bingo
 * 
 */
public class CustomActivityDiagramCreationWizard extends AbstractFujabaDiagramNewWizard {

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setWindowTitle(getWindowTitle());
		setDefaultPageImageDescriptor(StorydiagramsDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewActivitiesWizard.gif")); //$NON-NLS-1$
	}

	@Override
	public String getEditorId() {
		return StorydiagramsDiagramEditor.ID;
	}

	@Override
	public AdapterFactory getItemProvidersAdapterFactory() {
		return StorydiagramsDiagramEditorPlugin.getInstance()
				.getItemProvidersAdapterFactory();
	}

}
