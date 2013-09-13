package de.fujaba.properties.runtime.editors;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.fujaba.properties.runtime.RuntimePlugin;

public class ComboPropertyEditor extends AbstractStructuralFeaturePropertyEditor {
	protected ComboViewer comboViewer;
	
	protected boolean hasSearchButton;
	
	public ComboPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		this(adapterFactory, feature, true);
	}

	public ComboPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature, boolean hasSearchButton) {
		super(adapterFactory, feature);
		this.hasSearchButton = hasSearchButton;
	}

	@Override
	public void createControls(Composite parent,
			FormToolkit toolkit) {
		Label label = toolkit.createLabel(parent, getLabelText());
		if (parent.getLayout() instanceof GridLayout) {
			label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		}
		
		if (hasSearchButton) {
			parent = new Composite(parent, SWT.NONE);
			parent.setLayout(new GridLayout(2, false));
			parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		}

		Combo combo = new Combo(parent, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
		comboViewer = new ComboViewer(combo);
		comboViewer.setContentProvider(ArrayContentProvider.getInstance());
		comboViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		if (parent.getLayout() instanceof GridLayout) {
			GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
			combo.setLayoutData(gridData);
		}
		comboViewer.getCombo().addListener(SWT.MouseWheel, new Listener() {

		      @Override
		      public void handleEvent(final Event event) {
		        event.doit = false;
		      }
		    });

		comboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object newSelection = null;
				if (event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection structuredSelection = (IStructuredSelection) event
							.getSelection();
					if (!structuredSelection.isEmpty()) {
						newSelection = structuredSelection
								.iterator().next();
					}
				}
				ComboPropertyEditor.this.selectionChanged(newSelection);
			}

			
		});
		
		if (hasSearchButton) {
			Button searchButton = new Button(parent, SWT.PUSH);
			searchButton.setText("...");
			searchButton.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false));
			searchButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					search();
				}
			});
		}

		refresh();

	}

	protected void selectionChanged(Object newSelection) {
		setValue(newSelection);
	}

	@Override
	protected void inputChanged() {		
		super.inputChanged();

		Collection<?> choices = getChoices();

		// Problem: AbstractListViewer does not allow null!
		choices.remove(null);
		
		if (comboViewer != null) {
			comboViewer.setInput(choices);
		}

		applySelection(value);
		
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();
		applySelection(value);
	}
	

	private void applySelection(Object selection) {
		if (comboViewer == null) {
			return;
		}

		// Set selection
		Collection<?> comboInput = (Collection<?>) comboViewer.getInput();
		if (comboInput != null && comboInput.contains(selection)) {
			ISelection sel;
			if (selection == null) {
				sel = new StructuredSelection();
			} else {
				sel = new StructuredSelection(selection);
			}
			comboViewer.setSelection(sel);
		}
	}

	
	@Override
	public void refresh() {
		super.refresh();
		if (comboViewer != null) {
			comboViewer.refresh();
		}
	}
	
	public void search() {
		@SuppressWarnings("unchecked")
		Object selectedElement = RuntimePlugin.showReferenceElementDialog(adapterFactory, getChoices(), value, Collections.EMPTY_LIST);

		// Add object, if one was selected
		if (selectedElement != null) {
			setValue(selectedElement);
		}
	}
}