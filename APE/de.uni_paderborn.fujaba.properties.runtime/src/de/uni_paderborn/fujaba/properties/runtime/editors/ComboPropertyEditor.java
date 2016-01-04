package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IOpenListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.OpenEvent;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin;

public class ComboPropertyEditor extends AbstractStructuralFeaturePropertyEditor {
	
	private static class NullHelper {
		public String toString() {
			return "";
		}
	}

	private static final NullHelper NULL_HELPER = new NullHelper();
	
	protected boolean hasSearchButton;
	
	protected Label label;
	
	protected Composite composite;
	
	protected ComboViewer comboViewer;
	
	protected Button searchButton;
	
	
	
	public ComboPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		this(adapterFactory, feature, feature instanceof EReference);
		//refreshWhenResourceSetChanges = true;
	}

	public ComboPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature, boolean hasSearchButton) {
		super(adapterFactory, feature);
		if (hasSearchButton) {
			Assert.isLegal(feature instanceof EReference, "Currently, only references can be searched via search dialog.");
		}
		this.hasSearchButton = hasSearchButton;
	}

	@Override
	public void doCreateControls(Composite parent,
			FormToolkit toolkit) {

		label = toolkit.createLabel(parent, getLabelText());
		if (parent.getLayout() instanceof GridLayout) {
			label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		}
		
		if (hasSearchButton) {
			composite = new Composite(parent, SWT.NONE) {
				public void layout (Control [] changed, int flags) {
					super.layout(changed, flags);
				}
			};
			parent = composite; // use the composite as parent from now on
			GridLayout compositeLayout = new GridLayout(2, false);
			compositeLayout.marginWidth = compositeLayout.marginHeight = 0;
			parent.setLayout(compositeLayout);
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
		    	// Remove possibility to use the scroll wheel in the ComboPropertyEditor to change values,
		    	// because it often happend accidently when the user only wanted to scroll
		    	// the complete properties page and accidently had a ComboBox under his mouse.
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
		
		// Sort alphabetically
		comboViewer.setSorter(new ViewerSorter());
		comboViewer.addOpenListener(new IOpenListener() {

			@Override
			public void open(OpenEvent event) {
				// TODO Auto-generated method stub
				System.out.println("");
			} });
		
		if (hasSearchButton) {
			searchButton = new Button(parent, SWT.PUSH);
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
		if (newSelection == NULL_HELPER) {
			newSelection = null;
		}
		setValue(newSelection);
	}

	@Override
	protected void inputChanged(Object oldObject) {		
		super.inputChanged(oldObject);
		setInput();
	}
	
	private void setInput() {
		if (comboViewer != null && comboViewer.getCombo() != null && !comboViewer.getCombo().isDisposed()) {
			Object value = this.value;
	
			Collection<Object> choices = getChoices();
			
			// Problem: AbstractListViewer does not allow null, use NULL_HELPER
			List<Object> safeChoices = new ArrayList<Object>();
			for (Object choice : choices) {
				if (choice == null) {
					choice = NULL_HELPER;
				}
				safeChoices.add(choice);
			}
			choices = safeChoices;
	
			if (comboViewer != null) {
				comboViewer.setInput(choices);
			}
	
			applySelection(value);
		}
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
		
		if (selection == null) {
			selection = NULL_HELPER;
		}

		// Set selection
		Collection<?> comboInput = (Collection<?>) comboViewer.getInput();
		if (comboInput != null && comboInput.contains(selection) || selection == null) {
			ISelection sel;
			if (selection == null) {
				sel = new StructuredSelection();
			} else {
				sel = new StructuredSelection(selection);
			}
			comboViewer.setSelection(sel);
		}
	}


	protected void removeListeners() {
		super.removeListeners();
		
	}
	
	protected void addListeners() {
		super.addListeners();
	}
	
	@Override
	public void refresh() {
		super.refresh();
		if (comboViewer != null && !comboViewer.getCombo().isDisposed()) {
			comboViewer.refresh();
		}
		setInput();
	}
	
	public void search() {
		@SuppressWarnings("unchecked")
		List<Object> selectedElements = RuntimePlugin.showReferenceElementDialog(adapterFactory, getChoices(), value, Collections.EMPTY_LIST, false);

		// Add object, if one was selected
		if (selectedElements != null && !selectedElements.isEmpty()) {
			setValue(selectedElements.get(0));
		}
	}
	

	@Override
	protected Collection<Control> getControls() {
		List<Control> controls = new ArrayList<Control>();
		if (comboViewer != null) {
			controls.add(comboViewer.getCombo());
		}
		controls.add(label);
		controls.add(searchButton);
		controls.add(composite);
		return controls;
	}
	
	@Override
	public void setFocus() {
		if (comboViewer != null && !comboViewer.getCombo().isDisposed()) {
			comboViewer.getCombo().setFocus();
		}
	}
}