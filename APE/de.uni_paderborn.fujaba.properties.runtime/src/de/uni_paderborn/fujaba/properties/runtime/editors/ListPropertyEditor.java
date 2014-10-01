package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
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

import de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin;
import de.uni_paderborn.fujaba.properties.runtime.wizard.ElementSelectionWizardPage.IElementValidator;

public class ListPropertyEditor extends AbstractStructuralFeaturePropertyEditor {
	// The resource set that we add our refresh listener to
	protected ResourceSet resourceSet;
	protected Adapter refreshAdapter = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification notification) {
			refresh();
		}
	};
	protected Label label;
	protected Composite listContainer;

	protected TableViewer tableViewer;
	protected EObject selection;
	private Button buttonCreate;
	private Button buttonRemove;
	private Button buttonUp;
	private Button buttonDown;
	
	private Composite container;

	private ISelectionChangedListener selectionChangedListener = new ISelectionChangedListener() {
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			EObject newSelection = null;
			if (event.getSelection() instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) event
						.getSelection();
				if (!structuredSelection.isEmpty()) {
					newSelection = (EObject) structuredSelection
							.iterator().next();
				}
			}
			ListPropertyEditor.this.selectionChanged(newSelection);
		}
	};

	public ListPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);
		Assert.isLegal(feature instanceof EReference && feature.isMany());
	}
	
	@Override
	public void createControls(Composite parent,
			FormToolkit toolkit) {
		super.createControls(parent, toolkit);

		// Outer container
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

		// List container
		listContainer = new Composite(parent, SWT.NONE);
		GridLayout listContainerLayout = new GridLayout(2, false);
		listContainerLayout.marginWidth = listContainerLayout.marginHeight = 0;
		listContainer.setLayout(listContainerLayout);
		listContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		

		org.eclipse.swt.widgets.Table table = toolkit.createTable(
				listContainer, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);

		GridData tableGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		tableGridData.minimumWidth = 120;
		table.setLayoutData(tableGridData);
		table.addFocusListener(new FocusAdapter() {

			@Override
			public void focusLost(FocusEvent e) {
				List<Object> selectionList = Collections.singletonList(input);
				RuntimePlugin.setCurrentEditorSelection(selectionList);				
			}

		});

		tableViewer = new TableViewer(table);
		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		tableViewer.setLabelProvider(new AdapterFactoryLabelProvider(
				adapterFactory));
		tableViewer.addSelectionChangedListener(selectionChangedListener);
		tableViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				if (selection != null) {
					RuntimePlugin.showEditElementDialog(adapterFactory, element, feature, selection);
				}
			}
		});

		// Button container and buttons
		Composite buttonContainer = toolkit.createComposite(listContainer);
		buttonContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
				false));
		buttonContainer.setLayout(new RowLayout(SWT.VERTICAL));

		buttonCreate = toolkit.createButton(buttonContainer, "", SWT.NONE);
		buttonCreate.setImage(RuntimePlugin.getImage(RuntimePlugin.IMAGE_ADD,
				12, 12));
		buttonCreate.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				add();
			}
		});

		buttonRemove = toolkit.createButton(buttonContainer, "", SWT.NONE);
		buttonRemove.setImage(RuntimePlugin.getImage(
				RuntimePlugin.IMAGE_REMOVE, 12, 12));
		buttonRemove.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				remove();
			}
		});

		buttonUp = toolkit.createButton(buttonContainer, "", SWT.NONE);
		buttonUp.setImage(RuntimePlugin
				.getImage(RuntimePlugin.IMAGE_UP, 12, 12));
		buttonUp.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				move(-1);
			}
		});

		buttonDown = toolkit.createButton(buttonContainer, "", SWT.NONE);
		buttonDown.setImage(RuntimePlugin.getImage(RuntimePlugin.IMAGE_DOWN,
				12, 12));
		buttonDown.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				move(1);
			}
		});

		// Set initial selection
		tableViewer.setInput(value);
		tableViewer.setSelection(new StructuredSelection());
	}
	
	@Override
	protected void inputChanged(Object oldObject) {
		super.inputChanged(oldObject);
		if (element != null && element.eResource() != null && resourceSet == null) {
			resourceSet = element.eResource().getResourceSet();
			resourceSet.eAdapters().add(refreshAdapter);
		}
	}
	
	

	protected void selectionChanged(EObject newSelection) {
		Object first = null, last = null;
		Object[] values;
		if (value == null) {
			values = new Object[0];
		} else {
			values = ((Collection<?>) value).toArray();
		}
		if (values.length > 0) {
			first = values[0];
			last = values[values.length - 1];
		}
		selection = newSelection;
		buttonRemove.setEnabled(selection != null);
		buttonUp.setEnabled(selection != null && selection != first);
		buttonDown.setEnabled(selection != null && selection != last);

		// Update current editor's selection
		List<Object> selectionList = null;
		if (selection == null) {
			selectionList = Collections.emptyList();
		}else {
			selectionList = Collections.singletonList((Object) selection);
		}
		RuntimePlugin.setCurrentEditorSelection(selectionList);
	}

	protected void add() {
		// this cast is safe, as we assert this in the constructor.
		EReference reference = (EReference) feature;
		if (reference.isContainment()) {
			RuntimePlugin.showCreateElementDialog(adapterFactory, element, feature, creationFilters);
		} else {
			final Collection<?> currentValues = (Collection<?>) value;
			
			IElementValidator validator = new IElementValidator() {
				@Override
				public String validate(Object element) {
					if (currentValues.contains(element)) {
						return "This value is already referenced.";
					}
					return null;
				}

			};
			List<Object> newObjects = RuntimePlugin.showReferenceElementDialog(adapterFactory, getChoices(), Arrays.asList(new IElementValidator[] { validator }));

			// Add objects that were selected
			if (newObjects != null && !newObjects.isEmpty()) {
				List<Object> newValues = new ArrayList<Object>((Collection<?>)value);
				boolean changed = false;
				for (Object newObject : newObjects) {
					if (!newValues.contains(newObject)) {
						newValues.add(newObject);
						changed = true;
					}
				}
				if (changed) {
					setValue(newValues);		
				}
			}
		}
	}

	protected void remove() {
		@SuppressWarnings("unchecked")
		Collection<Object> values = (Collection<Object>) value;

		// Create the new value
		List<Object> newValues = new ArrayList<Object>(values);
		newValues.remove(selection);

		// Update selection so that the neighbour is selected
		int index = findIndex(values, selection);
		index = Math.min(Math.max(index - 1, 0), newValues.size() - 1);
		if (index == -1) { // newValues is empty!
			selection = null;
		} else {
			selection = (EObject) newValues.get(index);
		}
		
		// Set the new value and apply the new selection
		setValue(newValues);
	}

	protected void move(int amount) {
		@SuppressWarnings("unchecked")
		Collection<Object> values = (Collection<Object>) value;

		// Find out current index
		int index = findIndex(values, selection);
		if (index == -1) {
			return;
		}

		// Calculate new index
		int newIndex = index + amount;

		// Move
		List<Object> newValues = new ArrayList<Object>(values);
		newValues.add(newIndex, newValues.remove(index));
		setValue(newValues);
	}

	private static <T> int findIndex(Collection<T> values, T selection) {
		int index = 0;
		for (Object object : values) {
			if (object == selection) {
				return index;
			}
			index++;
		}
		return -1;
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();
		updateAdapters(); // we register an adapter for each value, see addListeners()

		if (tableViewer != null && !tableViewer.getTable().isDisposed()) {
			tableViewer.removeSelectionChangedListener(selectionChangedListener);
			tableViewer.setInput(value);
			tableViewer.addSelectionChangedListener(selectionChangedListener);
			
//			// Relayout because item size could have been changed
//			tableViewer.refresh(true);
//			RuntimePlugin.revalidateLayout(tableViewer.getTable());
//			
			applySelection();
		}
	}
	
	private void applySelection() {
		// Set selection
		ISelection sel;
		if (selection == null) {
			sel = new StructuredSelection();
		} else {
			sel = new StructuredSelection(selection);
		}
		tableViewer.setSelection(sel);
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (!isDisposed()) {
			refresh();
		}
		super.handleNotificationEvent(notification);
	}

	// Hook into every EObject of our values
	@Override
	protected void addListeners() {
		super.addListeners();
		for (Object object : (Collection<?>)(value)) {
			if (object instanceof EObject) {
				registerListener((EObject) object);
			}
		}
	}
	
	@Override
	public void refresh() {
		super.refresh();
		
		if (tableViewer != null && !tableViewer.getTable().isDisposed()) {
			// Refresh table viewer without loosing selection (XXX still a hack)
//			EObject selection = this.selection;
//			tableViewer.setInput(null);
//			tableViewer.setInput(value);
//			this.selection = selection;
//			if (value != null) {
//				applySelection();
//			}
			tableViewer.refresh(true);
		
			// Relayout because item size could have been changed
//			layout();
		}

	}

	@Override
	protected Collection<Control> getControls() {
		List<Control> controls = new ArrayList<Control>();
		if (tableViewer != null) {
			controls.add(tableViewer.getTable());
		}
		controls.add(label);
		controls.add(container);
		controls.add(listContainer);
		return controls;
	}
	
	@Override
	public void dispose() {
		super.dispose();
		if (resourceSet != null) {
			resourceSet.eAdapters().remove(refreshAdapter);
		}
	}
	
	@Override
	public void setFocus() {
		if (tableViewer != null && !tableViewer.getTable().isDisposed())
		tableViewer.getTable().setFocus();
	}
	
}
