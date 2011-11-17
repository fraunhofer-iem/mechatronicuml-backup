package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import de.fujaba.newwizard.diagrams.FujabaDiagramNewWizard;

/**
 * @generated
 */
public abstract class MumlCreationWizard extends FujabaDiagramNewWizard {

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setDefaultPageImageDescriptor(de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageinterfaceDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewModelinstanceWizard.gif")); //$NON-NLS-1$

	}

	/**
	 * @generated
	 */
	@Override
	protected String getDiagramFileExtension() {
		return "messageinterface_diagram"; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	@Override
	protected String getModelId() {
		return "Messageinterface";
	}

	/**
	 * @generated
	 */
	@Override
	protected PreferencesHint getDiagramPreferencesHint() {
		return de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageinterfaceDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	/**
	 * @generated
	 */
	@Override
	protected String getEditorId() {
		return de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageinterfaceDiagramEditor.ID;

	}

	/**
	 * @generated
	 */
	@Override
	protected EObject createDiagramElement() {

		return null;

	}
}
