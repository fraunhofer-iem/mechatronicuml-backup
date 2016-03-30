package org.muml.core.common.emf.edit.ui.extensions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
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
import org.muml.core.common.FujabaCommonPlugin;
import org.muml.core.common.emf.edit.ui.ExtensibleCreationDialog;
import org.muml.core.common.emf.edit.ui.elementinitializer.IElementInitializer;

public class ObjectCreationDialogExtension extends AbstractDialogExtension {

	private ObjectsListDialogExtension objectsListDialogExtension;

	private ItemProvider values;

	private ComboViewer comboViewer;

	private AdapterFactory adapterFactory;

	private INotifyChangedListener listener = new INotifyChangedListener() {

		@Override
		public void notifyChanged(Notification notification) {
			updateButtonEnablement();
		}

	};

	/**
	 * The Create-Button.
	 */
	private Button btnCreate;

	public ObjectCreationDialogExtension(
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
		super.createMainArea(parent);
		values = new ItemProvider(adapterFactory, getInstanceClasses());
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

	protected List<EClass> getInstanceClasses() {
		List<EClass> instanceClasses = new ArrayList<EClass>();
		EStructuralFeature structuralFeature = getCreationDialog()
				.getStructuralFeature();
		Assert.isLegal(structuralFeature.getEType() instanceof EClass);

		EClass type = getFeatureType(structuralFeature);

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
		return instanceClasses;
	}

	protected EClass getFeatureType(EStructuralFeature structuralFeature) {
		return (EClass) structuralFeature.getEType();
	}

	@Override
	public void createButtonArea(Composite composite) {
		super.createButtonArea(composite);
		btnCreate = new Button(composite, SWT.NONE);
		btnCreate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		btnCreate.setText("&Create");

		btnCreate.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {
				// Get instance class
				EClass instanceClass = getInstanceClass();
				
				// Create object
				final EObject newObject = EcoreUtil.create(getInstanceClass());
				
				// Initialize object
				for (IElementInitializer initializer : FujabaCommonPlugin.getElementInitializers(instanceClass)) {
					initializer.initialize(newObject);
				}

				if (objectsListDialogExtension != null) {
					objectsListDialogExtension.addListItem(newObject);
					objectsListDialogExtension.getTableViewer().refresh();
					objectsListDialogExtension.getTableViewer().setSelection(
							new StructuredSelection(new Object[] { newObject }));
				}
			}
		});
	
		updateButtonEnablement();
	}

	private void updateButtonEnablement() {
		if (objectsListDialogExtension != null && btnCreate != null && !btnCreate.isDisposed()) {
			if (!getCreationDialog().isManyProperty()) {
				btnCreate.setEnabled(objectsListDialogExtension
						.getCurrentListItems().isEmpty());
			}
		}
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
	public void close() {
		setObjectsListDialogExtension(null);
	}

	public void setObjectsListDialogExtension(
			ObjectsListDialogExtension objectsListDialogExtension) {

		if (this.objectsListDialogExtension != null) {
			this.objectsListDialogExtension.removeListener(listener);
		}
		
		this.objectsListDialogExtension = objectsListDialogExtension;
		
		if (this.objectsListDialogExtension != null) {
			this.objectsListDialogExtension.addListener(listener);
			updateButtonEnablement();
		}
		
	}

}
