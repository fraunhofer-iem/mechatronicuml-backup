package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;

public class ObjectCreationDialogExtension extends AbstractDialogExtension
		implements IObjectCreationDialogExtension {

	private IObjectsListDialogExtension objectsListDialogExtension;

	private ITextualDialogExtension textualDialogExtension;

	private ItemProvider values;

	private ComboViewer comboViewer;

	private AdapterFactory adapterFactory;

	private List<EClass> instanceClasses = new ArrayList<EClass>();

	/**
	 * The Create-Button.
	 */
	private Button btnCreate;

	public ObjectCreationDialogExtension(
			ExtensibleCreationDialog creationDialog,
			AdapterFactory adapterFactory) {
		super(creationDialog);
		this.adapterFactory = adapterFactory;

		EStructuralFeature structuralFeature = creationDialog
				.getStructuralFeature();
		Assert.isLegal(structuralFeature.getEType() instanceof EClass);

		EClass type = (EClass) structuralFeature.getEType();

		IItemPropertySource ips = (IItemPropertySource) adapterFactory.adapt(
				structuralFeature, IItemPropertySource.class);

		if (ips != null) {
			IItemPropertyDescriptor itemPropertyDescriptor = ips
					.getPropertyDescriptor(
							structuralFeature,
							org.eclipse.emf.ecore.EcorePackage.Literals.ETYPED_ELEMENT__ETYPE);
			Collection<?> choices = itemPropertyDescriptor
					.getChoiceOfValues(structuralFeature);
			for (Object choice : choices) {
				org.eclipse.emf.ecore.EClassifier classifier = (org.eclipse.emf.ecore.EClassifier) choice;
				if (classifier instanceof EClass
						&& type.isSuperTypeOf((EClass) classifier)
						&& !((EClass) classifier).isAbstract()) {
					instanceClasses.add((EClass) classifier);
				}
			}
		}

		creationDialog.getStructuralFeature(); // Create
												// EStructuralFeatureItemProvider
												// by adapting adapterFactory,
												// see CustomPropertySource
	}

	@Override
	public void initialize() {

	}

	@Override
	public void createMainArea(Composite parent) {
		values = new ItemProvider(adapterFactory, instanceClasses);
		comboViewer = new ComboViewer(parent, SWT.NONE);

		comboViewer
				.setContentProvider(getCreationDialog().getContentProvider());
		comboViewer.setLabelProvider(new LabelProvider() {

			@Override
			public String getText(Object element) {
				if (element instanceof org.eclipse.emf.ecore.ENamedElement) {
					return ((org.eclipse.emf.ecore.ENamedElement) element)
							.getName();
				}
				return super.getText(element);
			}

		});
		comboViewer.setInput(values);

		// Select first instanceClass
		if (values.hasChildren()) {
			comboViewer.setSelection(new StructuredSelection(
					new Object[] { values.getChildren().get(0) }));
		}
	}

	@Override
	public void createButtonArea(Composite composite) {
		btnCreate = new Button(composite, SWT.NONE);
		btnCreate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		btnCreate.setText("&Create");

		// btnModify = new Button(composite, SWT.NONE);
		// btnModify.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
		// false,
		// 1, 1));
		// btnModify.setText("&Modify");

		btnCreate.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {
				EObject newObject = EcoreUtil.create(getInstanceClass());

				// applyProperties(newObject);

				objectsListDialogExtension.addListItem(newObject);
				textualDialogExtension.rebuildTextualString();

				// Update visuals
				// TODO:
				// txtName.setSelection(0, txtName.getText().length());
				// txtName.setFocus();
				objectsListDialogExtension.getTableViewer().refresh();
				objectsListDialogExtension.getTableViewer().setSelection(
						new StructuredSelection(new Object[] { newObject }));
			}
		});
	}

	protected EClass getInstanceClass() {
		ISelection selection = comboViewer.getSelection();
		if (selection instanceof IStructuredSelection) {
			return (EClass) ((IStructuredSelection) selection)
					.getFirstElement();
		}
		return null;
	}

	@Override
	public void okPressed() {
		// TODO Auto-generated method stub

	}

	public void setTextualDialogExtension(
			ITextualDialogExtension textualDialogExtension) {
		this.textualDialogExtension = textualDialogExtension;
	}

	public void setObjectsListDialogExtension(
			IObjectsListDialogExtension objectsListDialogExtension) {
		this.objectsListDialogExtension = objectsListDialogExtension;
	}

}
