package de.uni_paderborn.fujaba.newwizard.diagrams.pages;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.internal.common.ui.ExtensibleModelSelectionPage;
import org.eclipse.gmf.internal.common.ui.PredefinedModelExtension;
import org.eclipse.gmf.internal.common.ui.ResourceLocationProvider;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.newwizard.Messages;
import de.uni_paderborn.fujaba.newwizard.diagrams.DiagramElementValidator;

public class DiagramModelSelectionPage extends ExtensibleModelSelectionPage {

	private PredefinedModelExtension predefinedModelExtension;
	private DiagramModelElementSelectionPageExtension diagramModelElementSelectionPageExtension;
	private AddElementPageExtension addElementExtension;
	DiagramElementValidator diagramElementValidator;

	public DiagramModelSelectionPage(String pageId,
			ResourceLocationProvider rloc, ResourceSet resourceSet,
			String modelFileExtension,
			DiagramElementValidator diagramElementValidator) {
		super(pageId, rloc, resourceSet, modelFileExtension);
		this.diagramElementValidator = diagramElementValidator;
	}

	@Override
	public void addExtensions() {
		List<URI> uris = rloc.getSelectedURIs("fujaba"); //$NON-NLS-1$
		// uris.add(URI
		//				.createURI("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore")); //$NON-NLS-1$
		predefinedModelExtension = new PredefinedModelExtension(this, uris);
		diagramModelElementSelectionPageExtension = new DiagramModelElementSelectionPageExtension(
				this);
		addElementExtension = new AddElementPageExtension();
		addElementExtension.addObserver(new Observer() {

			@Override
			public void update(Observable o, Object arg) {
				boolean status = ((AddElementPageExtension) o)
						.shouldAddElement();
				updatedAddElement(status);
			}

		});

		addExtension("prem", predefinedModelExtension); //$NON-NLS-1$
		addExtension("domainElement", diagramModelElementSelectionPageExtension);
		addExtension("add", addElementExtension); //$NON-NLS-1$
	}

	protected void updatedAddElement(boolean status) {

		// Make the ModelSelectionPageExtension read only
		diagramModelElementSelectionPageExtension.setReadOnly(status);

		validatePage();
	}

	@Override
	public void validatePage() {
		// check if a file was selected
		super.validatePage();

		String error = null;
		EObject selectedModelElement = getSelectedModelElement();

		if (addElementExtension.shouldAddElement()) {
			boolean rootNodeFound = false;
			List<?> rootElements = getResource().getContents();
			if (!rootElements.isEmpty()) {
				Object rootElement = rootElements.get(0);
				if (rootElement instanceof RootNode) {
					rootNodeFound = true;
				}
			}
			if (!rootNodeFound) {
				error = "Selected file does not contain a valid Fujaba Root Node.";
			}
	
		} else if (selectedModelElement == null) {
			error = Messages.NewDiagramFileWizard_RootSelectionPageNoSelectionMessage;
	
		} else if (!diagramElementValidator.isValidDiagramElement(selectedModelElement)) {
			error = Messages.NewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage;
		}
		setPageComplete(error == null);
		setErrorMessage(error);
	}

	public EObject getSelectedModelElement() {
		// Add a new element
		if (!addElementExtension.shouldAddElement()) {

			return diagramModelElementSelectionPageExtension
					.getSelectedModelElement();

		}

		return null;
	}

	public void resourceChanged(Resource resource) {
		boolean shouldAddElement = false;
		if (!resource.getContents().isEmpty()) {
			EObject firstElement = resource.getContents().get(0);
			if (firstElement instanceof RootNode) {
				shouldAddElement = true;
			}
		}
		addElementExtension.setAddElement(shouldAddElement);
	}
}
