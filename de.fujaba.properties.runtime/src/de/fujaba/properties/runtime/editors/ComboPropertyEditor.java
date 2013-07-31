package de.fujaba.properties.runtime.editors;

import java.util.Collection;

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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class ComboPropertyEditor extends AbstractStructuralFeaturePropertyEditor {
	protected ComboViewer comboViewer;

	public ComboPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	@Override
	public void createControls(Composite parent,
			FormToolkit toolkit) {
		Label label = toolkit.createLabel(parent, getLabelText());
		if (parent.getLayout() instanceof GridLayout) {
			label.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
		}

		Combo combo = new Combo(parent, SWT.BORDER);
		comboViewer = new ComboViewer(combo);
		comboViewer.setContentProvider(ArrayContentProvider.getInstance());
		comboViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		if (parent.getLayout() instanceof GridLayout) {
			GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
			combo.setLayoutData(gridData);
		}
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
		
		comboViewer.setInput(choices);
		
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
}