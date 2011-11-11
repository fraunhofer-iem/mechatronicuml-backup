package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;
import de.uni_paderborn.fujaba.common.emf.edit.ui.property.AbstractPropertyEditor;
import de.uni_paderborn.fujaba.common.emf.edit.ui.property.Property;
import de.uni_paderborn.fujaba.common.emf.edit.ui.validator.IValidationListener;

public class PropertiesListDialogExtension extends
		AbstractDialogExtension implements
		IPropertiesListDialogExtension {

	/**
	 * The instance class of the objects to create.
	 */
	private EClass instanceClass;

	/**
	 * The Modify-Button.
	 */
	private Button btnModify;

	/**
	 * The Create-Button.
	 */
	private Button btnCreate;

	/**
	 * The properties to display for an instanceClass.
	 */
	private Map<EClass, Collection<Property>> instanceClassToProperties = new HashMap<EClass, Collection<Property>>();

	/**
	 * A field, which remembers, if the values currently entered are valid.
	 */
	private boolean validInput;

	/**
	 * The control of the ExtensibleCreationDialog.
	 */
	private Composite parentControl;

	/**
	 * Our container that actually contains the property editors.
	 */
	private Composite propertyEditorContainer;

	private ITextualDialogExtension textualCreationDialogExtension;

	private IObjectsListDialogExtension objectsListCreationDialogExtension;

	public PropertiesListDialogExtension(
			ExtensibleCreationDialog creationDialog) {
		super(creationDialog);
		setInstanceClass((EClass) creationDialog.getStructuralFeature().getEType());
	}

	public void addProperties(EClass instanceClass,
			Collection<Property> properties) {
		instanceClassToProperties.put(instanceClass, properties);
	}

	@Override
	public void initialize() {
		for (Property property : getProperties()) {
			property.getPropertyEditor().applyDefaultValue();
		}
	}

	/**
	 * Convenience method to get the properties that should be displayed
	 * currently (for the instanceClass currently set).
	 * 
	 * @return The collection of Properties, which can be empty but is never
	 *         null.
	 */
	private Collection<Property> getProperties() {
		if (instanceClassToProperties.containsKey(instanceClass)) {
			return instanceClassToProperties.get(instanceClass);
		}
		return Collections.emptyList();
	}

	/**
	 * Applies the properties to the given object.
	 * 
	 * @param object
	 *            The object to apply the properties to.
	 */
	protected void applyProperties(EObject object) {
		for (Property property : getProperties()) {
			AbstractPropertyEditor editor = property.getPropertyEditor();
			try {
				property.setPropertyValue(object, editor.getValue());
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Updates the enable-status of the modify button.
	 */
	public void updateModifyButtonEnablement() {
		btnModify.setEnabled(objectsListCreationDialogExtension
				.getListSelection() != null && validInput);
	}

	/**
	 * Updates the enable-status of the create button.
	 */
	public void updateCreateButtonEnablement() {
		int upperBound = getStructuralFeature().getUpperBound();
		boolean canCreateOneMore = upperBound == -1
				|| upperBound > objectsListCreationDialogExtension
						.getCurrentListItems().size();

		btnCreate.setEnabled(validInput && canCreateOneMore);
	}

	@Override
	public void createMainArea(Composite parent) {
		this.parentControl = parent;
		createPropertyEditors();
	}

	@Override
	public EClass getInstanceClass() {
		return instanceClass;
	}

	public void setInstanceClass(EClass instanceClass) {
		if (this.instanceClass != instanceClass) {
			this.instanceClass = instanceClass;
			createPropertyEditors();
		}
	}

	private void createPropertyEditors() {

		if (instanceClass != null && parentControl != null) {
			// Dispose old property editors
			if (propertyEditorContainer != null) {
				propertyEditorContainer.dispose();
			}

			// Create a new container
			propertyEditorContainer = new Composite(parentControl, 0);
			propertyEditorContainer.setLayout(new GridLayout(1, false));

			/*
			 * Create new property editors
			 */

			boolean extendVertically = false;
			for (Property property : getProperties()) {
				if (property.getPropertyEditor().isExtendVertically()) {
					extendVertically = true;
					break;
				}
			}

			parentControl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
					extendVertically, 1, 1));

			propertyEditorContainer.setLayoutData(new GridData(SWT.FILL,
					SWT.FILL, true, extendVertically, 1, 1));

			Group grpParameterProps = new Group(propertyEditorContainer,
					SWT.NONE);
			grpParameterProps.setLayout(new GridLayout(2, false));
			grpParameterProps.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, extendVertically, 1, 1));
			grpParameterProps.setText("&Properties");

			IValidationListener validationListener = new IValidationListener() {

				@Override
				public void validationOccurred(boolean valid) {
					boolean allValid = true;
					for (Property property : getProperties()) {
						if (!property.getPropertyEditor().isValid()) {
							allValid = false;
							break;
						}
					}
					validInput = allValid;
					updateModifyButtonEnablement();
					updateCreateButtonEnablement();
				}
			};

			for (Property property : getProperties()) {
				Label lblName = new Label(grpParameterProps, SWT.NONE);
				lblName.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
						false, 1, 1));
				lblName.setText(property.getDisplayName() + ":");

				AbstractPropertyEditor editor = property.getPropertyEditor();
				editor.addValidationListener(validationListener);

				Control editorControl = editor.create(grpParameterProps);
				boolean extendPropertyVertically = editor.isExtendVertically();
				int verticalAlignment = SWT.CENTER;
				if (extendPropertyVertically) {
					verticalAlignment = SWT.FILL;
				}
				editorControl
						.setLayoutData(new GridData(SWT.FILL,
								verticalAlignment, true,
								extendPropertyVertically, 1, 1));

			}
			parentControl.getParent().layout();
		}
		
	}

	@Override
	public void createButtonArea(Composite composite) {
		btnCreate = new Button(composite, SWT.NONE);
		btnCreate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		btnCreate.setText("&Create");

		btnModify = new Button(composite, SWT.NONE);
		btnModify.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		btnModify.setText("&Modify");

		btnCreate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EObject newObject = EcoreUtil.create(instanceClass);

				applyProperties(newObject);

				objectsListCreationDialogExtension.addListItem(newObject);
				textualCreationDialogExtension.rebuildTextualParameterLine();

				// Update visuals
				// TODO:
				// txtName.setSelection(0, txtName.getText().length());
				// txtName.setFocus();
				objectsListCreationDialogExtension.getTableViewer().refresh();
				objectsListCreationDialogExtension.getTableViewer()
						.setSelection(
								new StructuredSelection(
										new Object[] { newObject }));
			}
		});

		btnModify.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EObject oldObject = objectsListCreationDialogExtension
						.getListSelection();
				int index = objectsListCreationDialogExtension
						.getCurrentListItems().indexOf(oldObject);

				if (index > -1) {
					EObject newObject = EcoreUtil.copy(oldObject);

					applyProperties(newObject);

					// configureParameter((EParameter) newParameter,
					// txtName.getText(), getSelectedType());
					objectsListCreationDialogExtension.getCurrentListItems()
							.set(index, newObject);
					textualCreationDialogExtension
							.rebuildTextualParameterLine();

					// Update visuals
					// TODO:
					// txtName.setSelection(0, txtName.getText().length());
					// txtName.setFocus();
					objectsListCreationDialogExtension.getTableViewer()
							.refresh();
					objectsListCreationDialogExtension.getTableViewer()
							.setSelection(
									new StructuredSelection(
											new EObject[] { newObject }));
				}
			}
		});

	}

	public void setTextualCreationDialogExtension(
			ITextualDialogExtension textualCreationDialogExtension) {
		this.textualCreationDialogExtension = textualCreationDialogExtension;
	}

	public void setObjectsListCreationDialogExtension(
			IObjectsListDialogExtension objectsListCreationDialogExtension) {
		this.objectsListCreationDialogExtension = objectsListCreationDialogExtension;
	}

	@Override
	public void okPressed() {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<EClass> getInstanceClasses() {
		return instanceClassToProperties.keySet();
	}

}
