package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.ecore.util.EcoreUtil;
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

/**
 * A PropertyEditor using a ComboBox with predefined choices.
 * 
 * @author bingo
 * 
 */
public class ComboPropertyEditor extends AbstractPropertyEditor {

	/**
	 * The Viewer for the ComboBox.
	 */
	protected ComboViewer comboViewer;

	/**
	 * The ContentProvider for the Viewer.
	 */
	protected IContentProvider contentProvider;

	/**
	 * The LabelProvider for the Viewer.
	 */
	protected ILabelProvider labelProvider;

	/**
	 * The list of valid choices to show in the ComboBox.
	 */
	protected List<?> choices;

	/**
	 * Creates this ComboPropertyEditor.
	 * 
	 * @param adapterFactory
	 *            The AdapterFactory to use to create the ContentProvider.
	 */
	public ComboPropertyEditor(AdapterFactory adapterFactory) {
		super(adapterFactory);
		contentProvider = new AdapterFactoryContentProvider(adapterFactory);
	}

	/**
	 * Creates the ComboBox control.
	 * 
	 * @param parent
	 *            the parent control.
	 * @return The ComboBox control.
	 */
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
		comboViewer.setInput(new ItemProvider(adapterFactory, getChoices()));
		return comboViewer.getCombo();
	}

	/**
	 * Retrieves the current selection of the ComboBox.
	 * 
	 * @return the current selection.
	 */
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

	/**
	 * Selects the first element in the ComboBox, if it exists.
	 */
	@Override
	public void setDefaultValue() {
		Object selectedElement = null;
		List<?> choices = getChoices();
		if (choices != null && !choices.isEmpty()) {
			selectedElement = choices.get(0);
		}
		comboViewer.setSelection(new StructuredSelection(
				new Object[] { selectedElement }));

	}

	/**
	 * Gets the value of the LabelProvider for the viewer.
	 * 
	 * @return The LabelProvider for the viewer.
	 */
	public ILabelProvider getLabelProvider() {
		return labelProvider;
	}

	/**
	 * Sets the value of the LabelProvider for the viewer.
	 * 
	 * @param labelProvider
	 *            The LabelProvider to use for the viewer.
	 */
	public void setLabelProvider(ILabelProvider labelProvider) {
		this.labelProvider = labelProvider;
	}

	/**
	 * Gets the choices for the viewer.
	 * 
	 * @return The choices for the viewer.
	 */
	public List<?> getChoices() {
		if (choices == null) {
			choices = ECollections.EMPTY_ELIST;
//			EObject helperObject = EcoreUtil.create();
//			choices = property.getPossibleChoices(helperObject);
		}
		return choices;
	}

	/**
	 * Sets the choices for the viewer.
	 * 
	 * @param choices
	 *            The choices to use for the viewer.
	 */
	public void setChoices(List<?> choices) {
		this.choices = choices;
	}

}
