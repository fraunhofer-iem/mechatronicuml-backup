package de.uni_paderborn.fujaba.muml.ontology.edit.properties.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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

import de.uni_paderborn.fujaba.muml.ontology.OntologyExtension;
import de.uni_paderborn.fujaba.muml.ontology.edit.properties.dialog.OntologyDialog;
import de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin;
import de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor;

public class OntologyPropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {

	protected Label label;
	protected Composite listContainer;
	protected String currentValue = "";
//	protected TableViewer tableViewer;
	protected Button ontologyButton;

	protected EObject selection;
	private Button buttonCreate;
	private Button buttonRemove;
	private Composite container;

	public OntologyPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);
		// TODO Auto-generated constructor stub

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void createControls(Composite parent, FormToolkit toolkit) {
		super.createControls(parent, toolkit);

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


		ontologyButton = toolkit.createButton(parent,getOntologyString(), SWT.PUSH);
		ontologyButton.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false));

		ontologyButton.setSize(200, 20);
		
		ontologyButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String projectName = getElement().eResource().getURI().segment(1);
				OntologyDialog dialog = new OntologyDialog(parentComposite.getShell(),projectName);
				int status = dialog.open();
				if(status == IDialogConstants.OK_ID){
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
	
	private String getOntologyString(){
		String ontologyRefernce ="";
		if(this.getElement() instanceof OntologyExtension){
			ontologyRefernce = ((OntologyExtension) element).getOntologyReference();
			if(ontologyRefernce!=null && !ontologyRefernce.isEmpty()){
				int splittNumber = ontologyRefernce.lastIndexOf("#");
				String name = ontologyRefernce.substring(splittNumber);
				ontologyRefernce = name+" - " +ontologyRefernce;
			}
			else{
				ontologyRefernce="No valid Ontology Entity";
			}
			
		}
		return ontologyRefernce;
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		// TODO Auto-generated method stub
		super.handleNotificationEvent(notification);
		if(notification.getFeature() == feature){
			ontologyButton.setText(getOntologyString());
			RuntimePlugin.revalidateLayout(ontologyButton);
		}
	}
	
	
	
	
	
	

}
