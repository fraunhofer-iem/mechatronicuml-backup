package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.fujaba.properties.runtime.RuntimePlugin;

public class ListPropertyEditor extends AbstractStructuralFeaturePropertyEditor {
	protected TableViewer tableViewer;

	public ListPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetWidgetFactory toolkit) {

		// Outer container
		Composite container = toolkit.createComposite(parent);
		if (parent.getLayout() instanceof GridLayout) {
			container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		}
		container.setLayout(new GridLayout(1, false));
		
		
		Label label = toolkit.createLabel(container, getLabelText());
		label.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		// List container
		Composite listContainer = toolkit.createComposite(container);
		listContainer.setLayout(new GridLayout(2, false));
		listContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		
		org.eclipse.swt.widgets.Table table = toolkit.createTable(listContainer,
				SWT.BORDER);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		tableViewer = new TableViewer(table);
		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		tableViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		// Button container and buttons
		Composite buttonContainer = toolkit.createComposite(listContainer);
		buttonContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		buttonContainer.setLayout(new RowLayout(SWT.VERTICAL));
		
		final Button buttonCreate = toolkit.createButton(buttonContainer, "", SWT.NONE);
		buttonCreate.setImage(RuntimePlugin.getImage(RuntimePlugin.IMAGE_ADD,
				12, 12));
		buttonCreate.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				add();
			}
		});
		
		
		final Button buttonRemove = toolkit.createButton(buttonContainer, "", SWT.NONE);
		buttonRemove.setImage(RuntimePlugin.getImage(RuntimePlugin.IMAGE_REMOVE,
				12, 12));
		buttonRemove.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				remove();
			}
		});
		
		final Button buttonUp = toolkit.createButton(buttonContainer, "", SWT.NONE);
		buttonUp.setImage(RuntimePlugin.getImage(RuntimePlugin.IMAGE_UP,
				12, 12));
		buttonUp.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				move(true);
			}
		});
		
		final Button buttonDown = toolkit.createButton(buttonContainer, "", SWT.NONE);
		buttonDown.setImage(RuntimePlugin.getImage(RuntimePlugin.IMAGE_DOWN,
				12, 12));
		buttonDown.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				move(false);
			}
		});
	}

	protected void add() {
		
	}

	protected void remove() {
		
	}


	protected void move(boolean up) {
		
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();
		tableViewer.setInput(value);
	}
}
