package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;

public class TypeSelectionDialogExtension extends
		AbstractCreationDialogExtension implements
		ITypeSelectionDialogExtension {

	private ItemProvider values;

	private ComboViewer comboViewer;

	private AdapterFactory adapterFactory;

	private IPropertiesListCreationDialogExtension propertiesListCreationDialogExtension;

	public TypeSelectionDialogExtension(
			ExtensibleCreationDialog creationDialog,
			AdapterFactory adapterFactory) {
		super(creationDialog);
		this.adapterFactory = adapterFactory;
	}

	@Override
	public void initialize() {

	}

	@Override
	public void createMainArea(Composite parent) {
		EClass defaultClass = propertiesListCreationDialogExtension
				.getInstanceClass();

		Collection<EClass> instanceClasses = propertiesListCreationDialogExtension
				.getInstanceClasses();

		values = new ItemProvider(adapterFactory, instanceClasses);
		comboViewer = new ComboViewer(parent, SWT.NONE);

		comboViewer
				.setContentProvider(getCreationDialog().getContentProvider());
		comboViewer.setLabelProvider(getCreationDialog().getLabelProvider());
		comboViewer.setInput(values);

		comboViewer.setSelection(new StructuredSelection(
				new Object[] { defaultClass }));

		comboViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						if (event.getSelection() instanceof IStructuredSelection) {
							IStructuredSelection ssel = (IStructuredSelection) event
									.getSelection();
							EClass currentClass = (EClass) ssel.getFirstElement();
							propertiesListCreationDialogExtension
									.setInstanceClass(currentClass);
						}
					}

				});
	}

	@Override
	public void createButtonArea(Composite parent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void okPressed() {
		// TODO Auto-generated method stub

	}

	public void setPropertiesListCreationDialogExtension(
			IPropertiesListCreationDialogExtension propertiesListCreationDialogExtension) {
		this.propertiesListCreationDialogExtension = propertiesListCreationDialogExtension;
	}

}
