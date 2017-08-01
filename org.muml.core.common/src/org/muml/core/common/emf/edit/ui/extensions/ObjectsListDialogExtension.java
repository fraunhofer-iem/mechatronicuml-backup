package org.muml.core.common.emf.edit.ui.extensions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.muml.core.common.emf.edit.ui.ExtensibleCreationDialog;

public class ObjectsListDialogExtension extends AbstractDialogExtension {
	
	public interface IFilter {
		boolean select(EObject object);
	}
	
	private Collection<IFilter> filters = new ArrayList<IFilter>();
	
	private Adapter hookAdapter = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification notification) {
			if (objectsTableViewer != null
					&& !objectsTableViewer.getControl().isDisposed()) {
				objectsTableViewer.refresh();
			}
		}
	};

	private Button btnUp;
	private Button btnDown;
	private Button btnRemove;

	private PropertySheetDialogExtension propertySheetDialogExtension;

	/**
	 * The result, which can be accessed using getResult(), after the dialog was
	 * closed.
	 */
	private EList<?> result;

	/**
	 * Stores the Parameters currently set; they can be accessed using
	 * values.getChildren().
	 */
	private ItemProvider values;

	/**
	 * The Parameters-List TableViewer.
	 */
	private TableViewer objectsTableViewer;

	public ObjectsListDialogExtension(ExtensibleCreationDialog creationDialog,
			AdapterFactory adapterFactory, Collection<?> currentValues) {
		super(creationDialog);
		// currentValues = EcoreUtil.copyAll(currentValues);
		this.values = new ItemProvider(adapterFactory, currentValues);
		
		// Hook into initial elements
		for (Object object : values.getChildren()) {
			((EObject) object).eAdapters().add(hookAdapter);
		}
	}
	
	public void addFilter(IFilter filter) {
		filters.add(filter);
	}
	
	public void removeFilter(IFilter filter) {
		filters.remove(filter);
	}
	
	public void addListener(INotifyChangedListener listener) {
		values.addListener(listener);
	}
	
	public void removeListener(INotifyChangedListener listener) {
		values.removeListener(listener);
	}

	
	@Override
	public void initialize() {
	}
	
	public void dispose() {
		// Unhook from remaining elements
		for (Object object : values.getChildren()) {
			((EObject) object).eAdapters().remove(hookAdapter);
		}
	}

	@Override
	public void createMainArea(Composite parent) {
		super.createMainArea(parent);

		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		Label lblParameterList = new Label(parent, SWT.NONE);
		GridData gdLblParameterList = new GridData(SWT.LEFT, SWT.TOP, false,
				false, 1, 1);
		gdLblParameterList.verticalIndent = 7;
		lblParameterList.setLayoutData(gdLblParameterList);
		lblParameterList.setText("&List:");

		objectsTableViewer = new TableViewer(parent, SWT.BORDER | SWT.V_SCROLL);
		Table tblParameterTable = objectsTableViewer.getTable();
		tblParameterTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		
		objectsTableViewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				for (IFilter filter : filters) {
					if (!filter.select((EObject) element)) {
						return false;
					}
				}
				return true;
			}
			
		});

		// Create SelectionListener for objectsTableViewer to update
		// Button-enablement accordingly
		objectsTableViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {
						ISelection selection = event.getSelection();
						propertySheetDialogExtension.setInput(selection);
						if (event.getSelection() instanceof IStructuredSelection) {
							IStructuredSelection ssel = (IStructuredSelection) event
									.getSelection();
							EObject selectedElement = (EObject) ssel
									.getFirstElement();
							if (selectedElement != null) {
								int index = values.getChildren().indexOf(
										selectedElement);
								btnUp.setEnabled(index > 0);
								btnDown.setEnabled(index < values.getChildren()
										.size() - 1);
							} else {
								btnUp.setEnabled(false);
								btnDown.setEnabled(false);
							}
							btnRemove.setEnabled(selectedElement != null);
						}
					}
				});

		// Initialize objectsTableViewer
		objectsTableViewer.setContentProvider(getCreationDialog()
				.getContentProvider());

		objectsTableViewer.setLabelProvider(getCreationDialog()
				.getLabelProvider());
		objectsTableViewer.setInput(values);
	}

	@Override
	public void createButtonArea(Composite composite) {
		super.createButtonArea(composite);
		EStructuralFeature feature = getStructuralFeature();

		GridData firstLayoutData = new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1);

		firstLayoutData.verticalIndent = 20;

		btnRemove = new Button(composite, SWT.NONE);
		btnRemove.setLayoutData(firstLayoutData);
		btnRemove.setText("&Remove");

		btnUp = new Button(composite, SWT.NONE);
		GridData gdBtnUp = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gdBtnUp.verticalIndent = 10;
		btnUp.setLayoutData(gdBtnUp);
		btnUp.setText("&Up");
		btnUp.setVisible(feature.isOrdered());

		btnDown = new Button(composite, SWT.NONE);
		btnDown.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		btnDown.setText("&Down");
		btnDown.setVisible(feature.isOrdered());

		btnRemove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EObject previouslySelectedObject = getListSelection();
				if (previouslySelectedObject != null) {
					int index = values.getChildren().indexOf(
							previouslySelectedObject);

					// Unhook from the model element
					previouslySelectedObject.eAdapters().remove(hookAdapter);

					values.getChildren().remove(previouslySelectedObject);
					// Begin added because of #204
					getCreationDialog().setPropertyValue(values.getChildren());
					// End added

					int objectsCount = values.getChildren().size();
					if (index >= objectsCount) {
						index = objectsCount - 1;
					}

					// Update visuals
					objectsTableViewer.refresh();
					if (index >= 0) {
						Object newlySelectedObject = values.getChildren().get(
								index);
						objectsTableViewer
								.setSelection(new StructuredSelection(
										new Object[] { newlySelectedObject }));
					}
				}
			}
		});

		btnUp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EObject firstObject = getListSelection();
				int index = values.getChildren().indexOf(firstObject);
				if (index > 0) {
					Object secondObject = (EObject) values.getChildren().get(
							index - 1);
					values.getChildren().set(index - 1, firstObject);
					values.getChildren().set(index, secondObject);
					// Begin added because of #204
					getCreationDialog().setPropertyValue(values.getChildren());
					// End added

					// Update visuals
					objectsTableViewer.refresh();
					objectsTableViewer.setSelection(new StructuredSelection(
							new Object[] { firstObject }));
				}
			}
		});

		btnDown.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EObject firstObject = getListSelection();
				int index = values.getChildren().indexOf(firstObject);
				if (index < values.getChildren().size() - 1) {
					Object secondObject = (EObject) values.getChildren().get(
							index + 1);
					values.getChildren().set(index + 1, firstObject);
					values.getChildren().set(index, secondObject);
					// Begin added because of #204
					getCreationDialog().setPropertyValue(values.getChildren());
					// End added

					// Update visuals
					objectsTableViewer.refresh();
					objectsTableViewer.setSelection(new StructuredSelection(
							new Object[] { firstObject }));
				}
			}
		});

		// Create an empty selection.
		objectsTableViewer
				.setSelection(new StructuredSelection(new Object[] {}));
	}

	/**
	 * Returns the parameter currently selected within the Parameter-List.
	 * 
	 * @return The parameter currently selgected, or <code>null</code> if none
	 *         is selected.
	 */
	public EObject getListSelection() {
		if (objectsTableViewer.getSelection() instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) objectsTableViewer
					.getSelection();
			return (EObject) selection.getFirstElement();
		}
		return null;
	}


	@Override
	public void close() {
		result = new BasicEList<Object>(values.getChildren());
	}

	/**
	 * Returns the results that should be applied to the structuralFeature.
	 * 
	 * @return Returns the parameters to set, or <code>null</code>, if cancel
	 *         was clicked.
	 */
	public EList<?> getResult() {
		return result;
	}

	public List<Object> getCurrentListItems() {
		return values.getChildren();
	}

	public void addListItem(EObject newObject) {
		// Hook into the model element
		newObject.eAdapters().add(hookAdapter);

		// Add the element to the list
		values.getChildren().add(newObject);
		
		// Begin added because of #204
		getCreationDialog().setPropertyValue(values.getChildren());
		// End added
		
	}

	public TableViewer getTableViewer() {
		return objectsTableViewer;
	}

	public void setPropertySheetDialogExtension(
			PropertySheetDialogExtension propertySheetDialogExtension) {
		this.propertySheetDialogExtension = propertySheetDialogExtension;
	}


}
