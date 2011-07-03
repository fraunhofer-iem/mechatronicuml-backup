package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class ComboPropertyEditor extends AbstractPropertyEditor {

	protected ComboViewer comboViewer;
	protected IContentProvider contentProvider;
	protected ILabelProvider labelProvider;

	protected List<?> choices;

	// TODO: Remove all args except "adapterFactory", and create setters for
	// them instead.
	public ComboPropertyEditor(AdapterFactory adapterFactory,
			ILabelProvider labelProvider, List<?> choices) {
		super(adapterFactory);
		contentProvider = new AdapterFactoryContentProvider(adapterFactory);
		this.labelProvider = labelProvider;
		this.choices = choices;
	}

	@Override
	protected Control createControl(Composite parent) {
		comboViewer = new ComboViewer(parent, SWT.NONE);
		comboViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						revalidate();
					}
				});

		// comboViewer.setContentProvider(new ArrayContentProvider());
		comboViewer.setContentProvider(contentProvider);
		comboViewer.setLabelProvider(labelProvider);
		comboViewer.setInput(new ItemProvider(adapterFactory, choices));
		return comboViewer.getCombo();
	}

	@Override
	protected Object doGetValue() {
		ISelection selection = comboViewer.getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = ((IStructuredSelection) selection);
			if (!ssel.isEmpty()) {
				return ssel.getFirstElement();
			}
		}
		return null;
	}

	@Override
	public void setDefaultValue() {
		Object selectedElement = null;
		if (choices != null && !choices.isEmpty()) {
			selectedElement = choices.get(0);
		}
		comboViewer.setSelection(new StructuredSelection(
				new Object[] { selectedElement }));

	}

}
