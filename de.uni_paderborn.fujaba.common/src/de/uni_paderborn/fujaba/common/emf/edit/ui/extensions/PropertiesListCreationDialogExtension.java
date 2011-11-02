package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import java.util.ArrayList;
import java.util.List;

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
import de.uni_paderborn.fujaba.common.emf.edit.ui.property.IValidationListener;
import de.uni_paderborn.fujaba.common.emf.edit.ui.property.Property;

public class PropertiesListCreationDialogExtension extends
		AbstractCreationDialogExtension {
	/**
	 * The instance class of the objects to create.
	 */
	private EClass instanceClass;

	/**
	 * A field, which remembers, if the values currently entered are valid.
	 */

	private boolean validInput;

	private TextualCreationDialogExtension textualCreationDialogExtension;
	private ObjectsListCreationDialogExtension objectsListCreationDialogExtension;

	public PropertiesListCreationDialogExtension(
			ExtensibleCreationDialog creationDialog, List<Property> properties,
			EClass instanceClass) {
		super(creationDialog);
		this.properties = properties;
		this.instanceClass = instanceClass;
	}

	public void setTextualCreationDialogExtension(
			TextualCreationDialogExtension textualCreationDialogExtension) {
		this.textualCreationDialogExtension = textualCreationDialogExtension;
	}

	public void setObjectsListCreationDialogExtension(
			ObjectsListCreationDialogExtension objectsListCreationDialogExtension) {
		this.objectsListCreationDialogExtension = objectsListCreationDialogExtension;
	}

	/**
	 * The Modify-Button.
	 */
	private Button btnModify;

	/**
	 * The Create-Button.
	 */
	private Button btnCreate;

	/**
	 * The properties to display.
	 */
	private List<Property> properties;

	@Override
	public void initialize() {
		for (Property property : properties) {
			property.getPropertyEditor().applyDefaultValue();
		}
	}

	/**
	 * Applies the properties to the given object.
	 * 
	 * @param object
	 *            The object to apply the properties to.
	 */
	protected void applyProperties(EObject object) {
		for (Property property : properties) {
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
		
		
		boolean extendVertically = false;

		for (Property property : properties) {
			if (property.getPropertyEditor().isExtendVertically()) {
				extendVertically = true;
				break;
			}
		}
		
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				extendVertically, 1, 1));

		Group grpParameterProps = new Group(parent, SWT.NONE);
		grpParameterProps.setLayout(new GridLayout(2, false));
		grpParameterProps.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				extendVertically, 1, 1));
		grpParameterProps.setText("&Properties");

		IValidationListener validationListener = new IValidationListener() {

			@Override
			public void validationOccurred(boolean valid) {
				boolean allValid = true;
				for (Property property : properties) {
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

		for (Property property : properties) {
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
			editorControl.setLayoutData(new GridData(SWT.FILL,
					verticalAlignment, true, extendPropertyVertically, 1, 1));

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

	@Override
	public void okPressed() {
		// TODO Auto-generated method stub

	}

}
