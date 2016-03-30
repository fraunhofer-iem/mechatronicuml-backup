package org.muml.core.common;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	static {
		NLS.initializeMessages("messages", Messages.class); //$NON-NLS-1$
	}

	private Messages() {
	}

	public static String ModelElementSelectionPageMessage;
	public static String NewDiagramFileWizard_RootSelectionPageNoSelectionMessage;
	public static String NewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage;
	public static String CreationWizardPageExtensionError;
	public static String CreationWizard_DiagramModelFilePageTitle;
	public static String CreationWizard_DiagramModelFilePageDescription;
	public static String CreationWizardOpenEditorError;
	public static String CreationWizardCreationError;
	public static String DiagramEditorUtil_CreateDiagramProgressTask;
	public static String DiagramEditorUtil_CreateDiagramCommandLabel;
	public static String NewDiagramFileWizard_CreationPageTitle;
	public static String NewDiagramFileWizard_CreationPageDescription;

	public static String CreateNewModelExtensionCreateNewModel;
	public static String ModelSelectionPageBadURI;
	public static String ModelSelectionPageBrowseFS;
	public static String ModelSelectionPageBrowseWS;
	public static String ModelSelectionPageErrorLoadingModel;
	public static String ModelSelectionPageFindInWS;
	public static String ModelSelectionPageLoad;
	public static String ModelSelectionPageModelNA;
	public static String ModelSelectionPageModelURI;
	public static String ModelSelectionPageSelectModel;
	public static String ModelSelectionPageSelectModelDesc;
	public static String PredefinedModelExtensionPredefinedModels;

}
