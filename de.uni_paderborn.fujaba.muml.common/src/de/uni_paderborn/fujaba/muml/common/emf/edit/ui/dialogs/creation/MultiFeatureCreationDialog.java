package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.CaretListener;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;

import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.labelproviders.IMultiLabelProvider;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.parsers.IMultiTextParser;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.AbstractPropertyEditor;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.IValidationListener;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.Property;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.Range;

/**
 * 
 * @author bingo
 * 
 */
public class MultiFeatureCreationDialog extends Dialog {

	/**
	 * The initial size for this dialog.
	 */
	private static final Point INITIAL_DIALOG_SIZE = new Point(500, 470);

	/**
	 * A field, which remembers, if the values currently entered are valid.
	 */

	private boolean validInput;

	/**
	 * The text parser for the structural feature. It can parse a String to
	 * create new objects.
	 */
	private IMultiTextParser textParser;

	/**
	 * The text provider for the structural feature. It can and provide a text
	 * for a set of existing objects.
	 */
	private IMultiLabelProvider textProvider;

	/**
	 * The LabelProvider used to get Labels for Parameters and typeClassifiers.
	 */
	private ILabelProvider labelProvider;

	/**
	 * The ContentProvider to access items of an ItemProvider.
	 */
	private IContentProvider contentProvider;

	/**
	 * The instance class of the objects to create.
	 */
	private EClass instanceClass;

	/**
	 * The properties to display.
	 */
	private List<Property> properties;

	/**
	 * Stores the Parameters currently set; they can be accessed using
	 * values.getChildren().
	 */
	private ItemProvider values;

	/**
	 * The Object containing the StructuralFeature, we are setting the values
	 * for.
	 */
	private EObject containerObject;

	/**
	 * The StructuralFeature that we set the values for.
	 */
	private EStructuralFeature structuralFeature;

	/**
	 * The areas in the Parameter-Line Textfield that contain certain
	 * Parameters.
	 */
	private Map<Object, Range> textRanges;

	// Note: We store Listeners in order to be able to remove/add them
	// afterwards.

	/**
	 * A SelectionChangedListener, which is notified about selection changes in
	 * the Parameter List and updates the Parameter-Line Textfield selection
	 * accordingly.
	 */
	private ISelectionChangedListener parameterSelectionToRangeListener;

	/**
	 * A SelectionChangedListener, which is notified about selection changes in
	 * the Parameter List and updates the enable-status of the Buttons "Up",
	 * "Down" and "Modify" accordingly.
	 */
	private ISelectionChangedListener parameterSelectionToButtonEnablementListener;

	/**
	 * A ModifyListener, which is notified when the Parameter-Line Text was
	 * edited by the user.
	 */
	private ModifyListener txtParameterLineModifyListener;

	/**
	 * A CaretListener, which is notified when the user changes the
	 * Caret-Position in the Parameter-Line Textfield.
	 */
	private CaretListener txtParameterLineCaretListener;

	/**
	 * The result, which can be accessed using getResult(), after the dialog was
	 * closed.
	 */
	private EList<?> result;

	// UI-Controls:

	/**
	 * The Parameters-List TableViewer.
	 */
	private TableViewer parameterTableViewer;

	/**
	 * The textual Parameter-Line Textfield.
	 */
	private StyledText txtParameterLine;

	/**
	 * The Modify-Button.
	 */
	private Button btnModify;

	/**
	 * The Create-Button.
	 */
	private Button btnCreate;

	/**
	 * Constructs this MultiFeatureCreationDialog.
	 * 
	 * @param parentShell
	 *            The parent shell to use for this Dialog.
	 * @param labelProvider
	 *            The LabelProvider to use in order to create element names.
	 * @param containerObject
	 *            The object containing the <code>structuralFeature</code>.
	 * @param structuralFeature
	 *            The StructuralFeature to set values for.
	 * @param currentValues
	 *            The current objects of the feature.
	 * @param adapterFactory
	 *            The adapter factory for content providers, item providers and
	 *            ItemPropertyDescriptors.
	 * @param properties
	 *            The list of properties to display.
	 * @param textParser
	 *            The TextParser that is able to create objects represented by a
	 *            text.
	 * @param textProvider
	 *            The TextProvider that is able to build a text for a set of
	 *            objects.
	 * @param instanceClass
	 *            The instance class to create new objects.
	 * 
	 */
	public MultiFeatureCreationDialog(Shell parentShell,
			ILabelProvider labelProvider, EObject containerObject,
			EStructuralFeature structuralFeature, Collection<?> currentValues,
			AdapterFactory adapterFactory, List<Property> properties,
			IMultiTextParser textParser, IMultiLabelProvider textProvider,
			EClass instanceClass) {
		super(parentShell);
		setShellStyle(getShellStyle() | SWT.RESIZE | SWT.MAX);
		this.labelProvider = labelProvider;
		this.structuralFeature = structuralFeature;
		this.containerObject = containerObject;
		this.textParser = textParser;
		this.textProvider = textProvider;
		this.instanceClass = instanceClass;
		this.properties = properties;

		this.values = new ItemProvider(adapterFactory, currentValues);
		contentProvider = new AdapterFactoryContentProvider(adapterFactory);
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText(EMFEditUIPlugin.INSTANCE.getString(
				"_UI_FeatureEditorDialog_title",
				new Object[] { structuralFeature.getName(),
						labelProvider.getText(containerObject) }));
		shell.setImage(labelProvider.getImage(containerObject));
	}

	/**
	 * Create contents of the dialog window.
	 * 
	 * @param parent
	 *            the parent composite to contain the dialog area.
	 * @return The dialog area.
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(2, false));

		boolean extendGroupVertically = false;

		for (Property property : properties) {
			if (property.getPropertyEditor().isExtendVertically()) {
				extendGroupVertically = true;
				break;
			}
		}

		Group grpParameterProps = new Group(container, SWT.NONE);
		grpParameterProps.setLayout(new GridLayout(2, false));
		grpParameterProps.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				extendGroupVertically, 1, 1));
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
			boolean extendVertically = editor.isExtendVertically();
			int verticalAlignment = SWT.CENTER;
			if (extendVertically) {
				verticalAlignment = SWT.FILL;
			}
			editorControl.setLayoutData(new GridData(SWT.FILL,
					verticalAlignment, true, extendVertically, 1, 1));

		}

		Composite composite = new Composite(container, SWT.NONE);
		GridLayout glComposite = new GridLayout(1, false);
		glComposite.marginTop = 7;
		composite.setLayout(glComposite);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false,
				1, 1));

		btnCreate = new Button(composite, SWT.NONE);
		btnCreate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		btnCreate.setText("&Create");

		btnModify = new Button(composite, SWT.NONE);
		btnModify.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		btnModify.setText("&Modify");

		Label lblParameterList = new Label(container, SWT.NONE);
		GridData gdLblParameterList = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 1, 1);
		gdLblParameterList.verticalIndent = 5;
		lblParameterList.setLayoutData(gdLblParameterList);
		lblParameterList.setText("&List:");
		new Label(container, SWT.NONE);

		parameterTableViewer = new TableViewer(container, SWT.BORDER
				| SWT.V_SCROLL);
		Table tblParameterTable = parameterTableViewer.getTable();
		tblParameterTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));

		Composite compositeActions = new Composite(container, SWT.NONE);
		compositeActions.setLayout(new GridLayout(1, false));
		compositeActions.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
				false, 1, 1));

		final Button btnRemove = new Button(compositeActions, SWT.NONE);
		btnRemove.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		btnRemove.setText("&Remove");

		final Button btnUp = new Button(compositeActions, SWT.NONE);
		GridData gdBtnUp = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gdBtnUp.verticalIndent = 10;
		btnUp.setLayoutData(gdBtnUp);
		btnUp.setText("&Up");
		btnUp.setVisible(structuralFeature.isOrdered());

		final Button btnDown = new Button(compositeActions, SWT.NONE);
		btnDown.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		btnDown.setText("&Down");
		btnDown.setVisible(structuralFeature.isOrdered());

		if (this.textProvider != null) {
			Label lblParameters = new Label(container, SWT.NONE);
			GridData gdLblParameters = new GridData(SWT.LEFT, SWT.CENTER,
					false, false, 1, 1);
			gdLblParameters.verticalIndent = 5;
			lblParameters.setLayoutData(gdLblParameters);
			lblParameters.setText("&Textual representation:");
			new Label(container, SWT.NONE);

			txtParameterLine = new StyledText(container, SWT.BORDER
					| SWT.SINGLE);
			txtParameterLine.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, false, 1, 1));
			txtParameterLine.setEnabled(this.textParser != null);

			new Label(container, SWT.NONE);
		}

		btnCreate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EObject newObject = EcoreUtil.create(instanceClass);

				applyProperties(newObject);

				values.getChildren().add(newObject);
				rebuildTextualParameterLine();

				// Update visuals
				// TODO:
				// txtName.setSelection(0, txtName.getText().length());
				// txtName.setFocus();
				parameterTableViewer.refresh();
				parameterTableViewer.setSelection(new StructuredSelection(
						new Object[] { newObject }));
			}
		});

		btnModify.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EObject oldObject = getParameterListSelection();
				int index = values.getChildren().indexOf(oldObject);

				if (index > -1) {
					EObject newObject = EcoreUtil.copy(oldObject);

					applyProperties(newObject);

					// configureParameter((EParameter) newParameter,
					// txtName.getText(), getSelectedType());
					values.getChildren().set(index, newObject);
					rebuildTextualParameterLine();

					// Update visuals
					// TODO:
					// txtName.setSelection(0, txtName.getText().length());
					// txtName.setFocus();
					parameterTableViewer.refresh();
					parameterTableViewer.setSelection(new StructuredSelection(
							new EObject[] { newObject }));
				}
			}
		});

		btnRemove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				Object previouslySelectedObject = getParameterListSelection();
				if (previouslySelectedObject != null) {
					int index = values.getChildren().indexOf(
							previouslySelectedObject);
					values.getChildren().remove(previouslySelectedObject);
					rebuildTextualParameterLine();

					int objectsCount = values.getChildren().size();
					if (index >= objectsCount) {
						index = objectsCount - 1;
					}

					// Update visuals
					parameterTableViewer.refresh();
					if (index >= 0) {
						Object newlySelectedObject = values.getChildren().get(
								index);
						parameterTableViewer
								.setSelection(new StructuredSelection(
										new Object[] { newlySelectedObject }));
					}
				}
			}
		});

		btnUp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EObject firstObject = getParameterListSelection();
				int index = values.getChildren().indexOf(firstObject);
				if (index > 0) {
					Object secondObject = (EObject) values.getChildren().get(
							index - 1);
					values.getChildren().set(index - 1, firstObject);
					values.getChildren().set(index, secondObject);
					rebuildTextualParameterLine();

					// Update visuals
					parameterTableViewer.refresh();
					parameterTableViewer.setSelection(new StructuredSelection(
							new Object[] { firstObject }));
				}
			}
		});

		btnDown.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EObject firstObject = getParameterListSelection();
				int index = values.getChildren().indexOf(firstObject);
				if (index < values.getChildren().size() - 1) {
					Object secondObject = (EObject) values.getChildren().get(
							index + 1);
					values.getChildren().set(index + 1, firstObject);
					values.getChildren().set(index, secondObject);
					rebuildTextualParameterLine();

					// Update visuals
					parameterTableViewer.refresh();
					parameterTableViewer.setSelection(new StructuredSelection(
							new Object[] { firstObject }));
				}
			}
		});

		// Create SelectionListener for parameterTableViewer to update text
		// selection accordingly
		parameterSelectionToRangeListener = new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) event
							.getSelection();
					Object selectedElement = selection.getFirstElement();
					if (selectedElement != null) {
						setTextRange((EObject) selectedElement);
					}
				}
			}
		};
		parameterTableViewer
				.addSelectionChangedListener(parameterSelectionToRangeListener);

		// Create SelectionListener for parameterTableViewer to update
		// Button-enablement accordingly
		parameterSelectionToButtonEnablementListener = new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) event
							.getSelection();
					Object selectedElement = selection.getFirstElement();
					if (selectedElement != null) {
						int index = values.getChildren().indexOf(
								selectedElement);
						btnUp.setEnabled(index > 0);
						btnDown.setEnabled(index < values.getChildren().size() - 1);
					} else {
						btnUp.setEnabled(false);
						btnDown.setEnabled(false);
					}
					btnRemove.setEnabled(selectedElement != null);
					updateModifyButtonEnablement();
				}
			}
		};
		parameterTableViewer
				.addSelectionChangedListener(parameterSelectionToButtonEnablementListener);

		if (txtParameterLine != null) {
			// Create CaretListener for txtParameterLine to update
			// Parameter-List
			// selection accordingly.
			txtParameterLineCaretListener = new CaretListener() {
				@Override
				public void caretMoved(CaretEvent event) {
					onParameterLineCaretMoved(event.caretOffset);
				}
			};
			txtParameterLine.addCaretListener(txtParameterLineCaretListener);

			// Create ModifyListener for txtParameterLine to recreate all
			// parameters.
			txtParameterLineModifyListener = new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					textRanges = null;

					String text = txtParameterLine.getText();

					Map<Object, Range> newRanges = new HashMap<Object, Range>();
					List<Range> newErrorRanges = new ArrayList<Range>();
					List<Object> newObjects = textParser.createObjects(
							text.toCharArray(), newRanges, newErrorRanges);

					clearTextStyle(txtParameterLine);
					markErrors(txtParameterLine, newErrorRanges);

					textRanges = newRanges;
					values.getChildren().clear();
					values.getChildren().addAll(newObjects);
					parameterTableViewer.refresh();

					onParameterLineCaretMoved(txtParameterLine.getCaretOffset());
				}
			};
			txtParameterLine.addModifyListener(txtParameterLineModifyListener);
			txtParameterLine.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					rebuildTextualParameterLine();

					// Make sure, the selection for txtParameterLine will be
					// set.
					parameterTableViewer.setSelection(parameterTableViewer
							.getSelection());
				}
			});

			// Initialize Textual Parameter Line
			rebuildTextualParameterLine();
		}

		// Initialize parameterTableViewer
		parameterTableViewer.setContentProvider(contentProvider);
		parameterTableViewer.setLabelProvider(labelProvider);
		parameterTableViewer.setInput(values);

		// Create an empty selection.
		parameterTableViewer.setSelection(new StructuredSelection(
				new Object[] {}));

		for (Property property : properties) {
			property.getPropertyEditor().applyDefaultValue();
		}

		return container;
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
	 * Clears the TextStyle of the passed StyledText control.
	 * 
	 * @param styledText
	 *            The StyledText Control to clear the style for.
	 */
	private void clearTextStyle(StyledText styledText) {
		StyleRange styleRange = new StyleRange();
		styleRange.start = 0;
		styleRange.length = styledText.getCharCount();
		styledText.setStyleRange(styleRange);
	}

	/**
	 * Marks errors in the given StyledText-Control.
	 * 
	 * @param styledText
	 *            The control to mark errors in.
	 * @param errorRanges
	 *            The list of error ranges.
	 */
	protected void markErrors(StyledText styledText, List<Range> errorRanges) {
		for (Range range : errorRanges) {
			StyleRange errorStyle = new StyleRange();
			errorStyle.start = range.getStart();
			errorStyle.length = range.getLength();
			errorStyle.underline = true;
			errorStyle.fontStyle = SWT.BOLD;
			errorStyle.underlineStyle = SWT.UNDERLINE_ERROR;
			styledText.setStyleRange(errorStyle);
		}
	}

	/**
	 * Updates the Parameter-List selection based on the caret position in the
	 * Parameter-Line Textfield.
	 * 
	 * @param caretOffset
	 *            The new caret offset.
	 */
	protected void onParameterLineCaretMoved(int caretOffset) {
		if (textRanges != null) {
			Object selectedObject = null;
			for (Object object : values.getChildren()) {
				selectedObject = object;
				Range textSelection = textRanges.get(object);
				int start = textSelection.getStart();
				int end = start + textSelection.getLength();
				if (end >= caretOffset) {
					break;
				}
			}
			if (selectedObject != null) {
				ISelection listSelection = new StructuredSelection(
						new Object[] { selectedObject });
				setListSelection(listSelection);
			}
		}
	}

	/**
	 * Updates the enable-status of the modify button.
	 */
	protected void updateModifyButtonEnablement() {
		btnModify.setEnabled(getParameterListSelection() != null && validInput);
	}

	/**
	 * Updates the enable-status of the create button.
	 */
	protected void updateCreateButtonEnablement() {
		int upperBound = structuralFeature.getUpperBound();
		boolean canCreateOneMore = upperBound == -1
				|| upperBound > values.getChildren().size();

		btnCreate.setEnabled(validInput && canCreateOneMore);
	}

	/**
	 * Selects the substring representing the passed parameter.
	 * 
	 * @param selectedObject
	 *            The parameter to select.
	 */
	private void setTextRange(EObject selectedObject) {
		if (txtParameterLine != null && textRanges != null) {
			Range textSelection = textRanges.get(selectedObject);
			if (textSelection != null) {
				int start = textSelection.getStart();
				int end = start + textSelection.getLength();
				txtParameterLine.setSelection(start, end);
			}
		}
	}

	/**
	 * Fills the textual Parameter-Line with the existing parameters and updates
	 * the parameterRanges hash-map to store the new substring-positions.
	 */
	private void rebuildTextualParameterLine() {
		if (textProvider != null) {
			textRanges = new HashMap<Object, Range>();

			String text = textProvider
					.getText(values.getChildren(), textRanges);

			setParameterLine(text);
		}
	}

	/**
	 * Sets the text of the Parameter-Line Control without firing notifications,
	 * which are only useful, if the user enters a value.
	 * 
	 * @param parameterLineString
	 *            The string to set.
	 */
	private void setParameterLine(String parameterLineString) {
		if (txtParameterLine != null) {
			txtParameterLine.removeCaretListener(txtParameterLineCaretListener);
			txtParameterLine
					.removeModifyListener(txtParameterLineModifyListener);
			txtParameterLine.setText(parameterLineString);
			txtParameterLine.addModifyListener(txtParameterLineModifyListener);
			txtParameterLine.addCaretListener(txtParameterLineCaretListener);
		}
	}

	/**
	 * Selects the given parameter within the Parameters-List without firing
	 * notifications, which are only useful, if the users selects a parameter.
	 * 
	 * @param parameterSelection
	 *            The parameter to select.
	 */
	private void setListSelection(ISelection parameterSelection) {
		parameterTableViewer
				.removeSelectionChangedListener(parameterSelectionToRangeListener);
		parameterTableViewer.setSelection(parameterSelection);
		parameterTableViewer
				.addSelectionChangedListener(parameterSelectionToRangeListener);
	}

	/**
	 * Returns the parameter currently selected within the Parameter-List.
	 * 
	 * @return The parameter currently selected, or <code>null</code> if none is
	 *         selected.
	 */
	private EObject getParameterListSelection() {
		if (parameterTableViewer.getSelection() instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) parameterTableViewer
					.getSelection();
			return (EObject) selection.getFirstElement();
		}
		return null;
	}

	@Override
	protected Point getInitialSize() {
		return INITIAL_DIALOG_SIZE;
	}

	@Override
	protected void okPressed() {
		result = new BasicEList<Object>(values.getChildren());
		super.okPressed();
	}

	@Override
	public boolean close() {
		contentProvider.dispose();
		return super.close();
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

}
