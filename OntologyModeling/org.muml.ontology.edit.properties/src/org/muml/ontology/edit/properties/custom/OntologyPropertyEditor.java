package org.muml.ontology.edit.properties.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.muml.ape.runtime.RuntimePlugin;
import org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor;
import org.muml.ontology.OntologyExtension;
import org.muml.ontology.edit.properties.dialog.OntologyDialog;
import org.muml.ontology.edit.properties.dialog.OntologyDialogFactory;

public class OntologyPropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {

	protected Label label;
	protected Composite listContainer;
	protected String currentValue = "";
	protected Button ontologyButton;
	protected EObject selection;
	private Composite container;

	public OntologyPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);

	}

	@Override
	public void setFocus() {
	}

	@Override
	protected void doCreateControls(Composite parent, FormToolkit toolkit) {
		boolean useContainer = parent.getLayout() instanceof RowLayout;
		if (useContainer) {
			container = toolkit.createComposite(parent);
			if (parent.getLayout() instanceof GridLayout) {
				container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
						true, 2, 1));
			}
			container.setLayout(new GridLayout(1, false));
			parent = container;
		}

		label = toolkit.createLabel(parent, getLabelText());
		label.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));

		ontologyButton = toolkit.createButton(parent, getOntologyString(),
				SWT.PUSH);
		ontologyButton.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false,
				false));

		ontologyButton.setSize(200, 20);

		ontologyButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				OntologyDialog dialog = OntologyDialogFactory.getInstance()
						.createOntologyDialog(parentComposite.getShell(),
								getElement().eContainer());
				if (value instanceof String) {
					IRI iri = IRI.create((String) value);
					dialog.setDefaultIRI(iri);
				}
				int status = dialog.open();
				if (status == IDialogConstants.OK_ID) {
					setValue(dialog.getResult().getIRI().toString());
				}
			}
		});

	}

	@Override
	protected Collection<Control> getControls() {
		List<Control> controls = new ArrayList<Control>();
		controls.add(ontologyButton);

		return controls;
	}

	private String getOntologyString() {
		String ontologyRefernce = "";
		if (this.getElement() instanceof OntologyExtension) {
			ontologyRefernce = ((OntologyExtension) element)
					.getOntologyReference();
			if (ontologyRefernce != null && !ontologyRefernce.isEmpty()) {
				int splittNumber = ontologyRefernce.lastIndexOf("#");
				String name = ontologyRefernce.substring(splittNumber);
				ontologyRefernce = name + " - " + ontologyRefernce;
			} else {
				ontologyRefernce = "No valid Ontology Entity";
			}

		}
		return ontologyRefernce;
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		// TODO Auto-generated method stub
		super.handleNotificationEvent(notification);
		if (notification.getFeature() == feature) {
			if (ontologyButton != null) {
				ontologyButton.setText(getOntologyString());
			}
			RuntimePlugin.revalidateLayout(ontologyButton);
		}
	}

}
