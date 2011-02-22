package de.uni_paderborn.fujaba.newwizard.diagrams.pages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.internal.common.ui.ModelSelectionPageExtension;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.uni_paderborn.fujaba.newwizard.FujabaNewwizardPlugin;
import de.uni_paderborn.fujaba.newwizard.Messages;

public class DiagramModelElementSelectionPageExtension implements
		ModelSelectionPageExtension {

	private Composite plate;

	/**
	 * 
	 */
	protected EObject selectedModelElement;


	/**
	 * 
	 */
	private TreeViewer modelViewer;

	private DiagramModelSelectionPage wizardPage;

	public DiagramModelElementSelectionPageExtension(
			DiagramModelSelectionPage wizardPage) {
		this.wizardPage = wizardPage;
	}

	public EObject getSelectedModelElement() {
		return selectedModelElement;
	}

	@Override
	public void createControl(Composite parent) {
		// initializeDialogUnits(parent);

		plate = new Composite(parent, SWT.NONE);
		plate.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		plate.setLayout(layout);

		Label label = new Label(plate, SWT.NONE);
		label.setText(getSelectionTitle());
		label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

		modelViewer = new TreeViewer(plate, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.heightHint = 300;
		layoutData.widthHint = 300;
		modelViewer.getTree().setLayoutData(layoutData);
		modelViewer
				.setContentProvider(new AdapterFactoryContentProvider(
						FujabaNewwizardPlugin.getDefault().getItemProvidersAdapterFactory()));
		modelViewer
				.setLabelProvider(new AdapterFactoryLabelProvider(
						FujabaNewwizardPlugin.getDefault().getItemProvidersAdapterFactory()));
		if (selectedModelElement != null) {
			modelViewer.setInput(selectedModelElement.eResource());
			modelViewer.setSelection(new StructuredSelection(
					selectedModelElement));
		}
		modelViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {
						DiagramModelElementSelectionPageExtension.this
								.updateSelection((IStructuredSelection) event
										.getSelection());
					}
				});

	}

	public void setReadOnly(boolean value) {
		modelViewer.getTree().setEnabled(!value);
	}

	@Override
	public void setResource(Resource resource) {
		modelViewer.setInput(resource);
		if (!resource.getContents().isEmpty()) {
			EObject firstElement = resource.getContents().get(0);
			modelViewer.setSelection(new StructuredSelection(firstElement));
		}
		wizardPage.resourceChanged(resource);
	}

	/**
	 * @generated
	 */
	protected void updateSelection(IStructuredSelection selection) {
		selectedModelElement = null;
		if (selection.size() == 1) {
			Object selectedElement = selection.getFirstElement();
			if (selectedElement instanceof IWrapperItemProvider) {
				selectedElement = ((IWrapperItemProvider) selectedElement)
						.getValue();
			}
			if (selectedElement instanceof FeatureMap.Entry) {
				selectedElement = ((FeatureMap.Entry) selectedElement)
						.getValue();
			}
			if (selectedElement instanceof EObject) {
				selectedModelElement = (EObject) selectedElement;
			}
		}
		wizardPage.validatePage();
	}

	/**
	 * Override to provide custom model element description.
	 * 
	 * @generated
	 */
	protected String getSelectionTitle() {
		return Messages.ModelElementSelectionPageMessage;
	}

}
