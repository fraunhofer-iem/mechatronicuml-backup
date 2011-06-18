package de.uni_paderborn.fujaba.muml.common.celleditor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
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
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;

/**
 * 
 * @author bingo
 * 
 */
public class ParameterListSelectionDialog extends Dialog {

	/**
	 * The LabelProvider used to get Labels for Parameters and typeClassifiers.
	 */
	protected ILabelProvider labelProvider;

	/**
	 * The ContentProvider to access items of an ItemProvider.
	 */
	protected IContentProvider contentProvider;

	/**
	 * Stores the Parameters currently set; they can be accessed using
	 * values.getChildren().
	 */
	protected ItemProvider values;

	/**
	 * The Object containing the StructuralFeature, we are setting the values
	 * for.
	 */
	protected EObject containerObject;

	/**
	 * The StructuralFeature that we set the values for.
	 */
	protected EStructuralFeature structuralFeature;

	/**
	 * The Classifiers allowed to be used as EType of Parameters. They will be
	 * added into the Type-ComboBox.
	 */
	protected List<EClassifier> typeClassifiers;

	/**
	 * The areas in the Parameter-Line Textfield that contain certain
	 * Parameters.
	 */
	protected Map<EParameter, TextSelection> parameterTextSelections;

	// NOTE: We store Listeners in order to be able to remove/add them
	// afterwards.

	/**
	 * A SelectionChangedListener, which is notified about selection changes in
	 * the Parameter List and updates the Parameter-Line Textfield selection
	 * accordingly.
	 */
	protected ISelectionChangedListener parameterSelectionToTextSelectionListener;

	/**
	 * A SelectionChangedListener, which is notified about selection changes in
	 * the Parameter List and updates the enable-status of the Buttons "Up",
	 * "Down" and "Modify" accordingly.
	 */
	protected ISelectionChangedListener parameterSelectionToButtonEnablementListener;

	/**
	 * A ModifyListener, which is notified when the Parameter-Line Text was
	 * edited by the user.
	 */
	protected ModifyListener txtParameterLineModifyListener;

	/**
	 * A CaretListener, which is notified when the user changes the
	 * Caret-Position in the Parameter-Line Textfield.
	 */
	protected CaretListener txtParameterLineCaretListener;

	/**
	 * A field, which remembers, if the Parameter-Name currently entered is
	 * valid.
	 */
	protected boolean isValidParameterName;

	/**
	 * The result, which can be accessed using getResult(), after the dialog was
	 * closed.
	 */
	protected EList<?> result;

	// UI-Controls:

	/**
	 * The Parameter-Name Textfield.
	 */
	private StyledText txtName;

	/**
	 * The Parameters-List TableViewer.
	 */
	private TableViewer parameterTableViewer;

	/**
	 * The Parameter-Type ComboViewer.
	 */
	private ComboViewer typeComboViewer;

	/**
	 * The textual Parameter-Line Textfield.
	 */
	private StyledText txtParameterLine;

	/**
	 * The Modify-Button.
	 */
	private Button btnModify;

	/**
	 * Constructs this parameterListSelectionDialog.
	 * 
	 * @param parentShell
	 *            The parent shell to use for this Dialog.
	 * @param labelProvider
	 *            The LabelProvider to use in order to create element names.
	 * @param containingObject
	 *            The object containing the <code>structuralFeature</code>.
	 * @param structuralFeature
	 *            The StructuralFeature to set values for.
	 * @param typeClassifiers
	 *            The allowed Parameter Types.
	 */
	public ParameterListSelectionDialog(Shell parentShell,
			ILabelProvider labelProvider, EObject containingObject,
			EStructuralFeature structuralFeature,
			List<EClassifier> typeClassifiers) {
		super(parentShell);
		setShellStyle(getShellStyle() | SWT.RESIZE | SWT.MAX);
		this.labelProvider = labelProvider;
		this.containerObject = containingObject;
		this.structuralFeature = structuralFeature;
		this.typeClassifiers = typeClassifiers;

		AdapterFactory adapterFactory = new ComposedAdapterFactory(
				Collections.<AdapterFactory> emptyList());
		values = new ItemProvider(adapterFactory,
				(java.util.List<?>) containingObject.eGet(structuralFeature));
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

		Group grpParameterProps = new Group(container, SWT.NONE);
		grpParameterProps.setLayout(new GridLayout(2, false));
		grpParameterProps.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, 1, 1));
		grpParameterProps.setText("Para&meter Properties");

		Label lblName = new Label(grpParameterProps, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblName.setText("Name:");

		txtName = new StyledText(grpParameterProps, SWT.BORDER | SWT.SINGLE);
		txtName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		Label lblType = new Label(grpParameterProps, SWT.NONE);
		lblType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblType.setText("Type:");

		typeComboViewer = new ComboViewer(grpParameterProps, SWT.NONE);
		Combo cmbType = typeComboViewer.getCombo();
		cmbType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		Composite composite = new Composite(container, SWT.NONE);
		GridLayout gl_composite = new GridLayout(1, false);
		gl_composite.marginTop = 7;
		composite.setLayout(gl_composite);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false,
				1, 1));

		final Button btnCreate = new Button(composite, SWT.NONE);
		btnCreate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		btnCreate.setText("&Create");

		btnModify = new Button(composite, SWT.NONE);
		btnModify.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		btnModify.setText("&Modify");

		Label lblParameterList = new Label(container, SWT.NONE);
		GridData gd_lblParameterList = new GridData(SWT.LEFT, SWT.CENTER,
				false, false, 1, 1);
		gd_lblParameterList.verticalIndent = 5;
		lblParameterList.setLayoutData(gd_lblParameterList);
		lblParameterList.setText("Parameter &List");
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
		GridData gd_btnUp = new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1);
		gd_btnUp.verticalIndent = 10;
		btnUp.setLayoutData(gd_btnUp);
		btnUp.setText("&Up");

		final Button btnDown = new Button(compositeActions, SWT.NONE);
		btnDown.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		btnDown.setText("&Down");

		Label lblParameters = new Label(container, SWT.NONE);
		GridData gd_lblParameters = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 1, 1);
		gd_lblParameters.verticalIndent = 5;
		lblParameters.setLayoutData(gd_lblParameters);
		lblParameters.setText("&Textual Parameter Line");
		new Label(container, SWT.NONE);

		txtParameterLine = new StyledText(container, SWT.BORDER | SWT.SINGLE);
		txtParameterLine.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, 1, 1));

		new Label(container, SWT.NONE);

		// Initialize controls:

		txtName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent event) {
				clearTextStyle(txtName);
				String name = getValidatedParameterName(txtName, 0,
						txtName.getCharCount());
				isValidParameterName = name != null && !name.isEmpty();
				btnCreate.setEnabled(isValidParameterName);
				updateModifyButtonEnablement();
			}
		});

		btnCreate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EParameter newParameter = EcoreFactory.eINSTANCE
						.createEParameter();
				configureParameter(newParameter, txtName.getText(),
						getSelectedType());
				values.getChildren().add(newParameter);
				rebuildTextualParameterLine();

				// Update visuals
				txtName.setSelection(0, txtName.getText().length());
				txtName.setFocus();
				parameterTableViewer.refresh();
				parameterTableViewer.setSelection(new StructuredSelection(
						new EParameter[] { newParameter }));
			}
		});

		btnModify.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EParameter oldParameter = getParameterListSelection();
				int index = values.getChildren().indexOf(oldParameter);

				if (index > -1) {
					EParameter newParameter = EcoreUtil.copy(oldParameter);
					configureParameter(newParameter, txtName.getText(),
							getSelectedType());
					values.getChildren().set(index, newParameter);
					rebuildTextualParameterLine();

					// Update visuals
					txtName.setSelection(0, txtName.getText().length());
					txtName.setFocus();
					parameterTableViewer.refresh();
					parameterTableViewer.setSelection(new StructuredSelection(
							new EParameter[] { newParameter }));
				}
			}
		});

		btnRemove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EParameter oldParameter = getParameterListSelection();
				if (oldParameter != null) {
					int index = values.getChildren().indexOf(oldParameter);
					values.getChildren().remove(oldParameter);
					rebuildTextualParameterLine();

					int parametersCount = values.getChildren().size();
					if (index >= parametersCount) {
						index = parametersCount - 1;
					}

					// Update visuals
					parameterTableViewer.refresh();
					if (index >= 0) {
						EParameter newSelectedParameter = (EParameter) values
								.getChildren().get(index);
						parameterTableViewer
								.setSelection(new StructuredSelection(
										new EParameter[] { newSelectedParameter }));
					}
				}
			}
		});

		btnUp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EParameter firstParameter = getParameterListSelection();
				int index = values.getChildren().indexOf(firstParameter);
				if (index > 0) {
					EParameter secondParameter = (EParameter) values
							.getChildren().get(index - 1);
					values.getChildren().set(index - 1, firstParameter);
					values.getChildren().set(index, secondParameter);
					rebuildTextualParameterLine();

					// Update visuals
					parameterTableViewer.refresh();
					parameterTableViewer.setSelection(new StructuredSelection(
							new EParameter[] { firstParameter }));
				}
			}
		});

		btnDown.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EParameter firstParameter = getParameterListSelection();
				int index = values.getChildren().indexOf(firstParameter);
				if (index < values.getChildren().size() - 1) {
					EParameter secondParameter = (EParameter) values
							.getChildren().get(index + 1);
					values.getChildren().set(index + 1, firstParameter);
					values.getChildren().set(index, secondParameter);
					rebuildTextualParameterLine();

					// Update visuals
					parameterTableViewer.refresh();
					parameterTableViewer.setSelection(new StructuredSelection(
							new EParameter[] { firstParameter }));
				}
			}
		});

		// Create SelectionListener for parameterTableViewer to update text
		// selection accordingly
		parameterSelectionToTextSelectionListener = new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) event
							.getSelection();
					Object selectedElement = selection.getFirstElement();
					if (selectedElement != null) {
						setParameterTextSelection((EParameter) selectedElement);
					}
				}
			}
		};
		parameterTableViewer
				.addSelectionChangedListener(parameterSelectionToTextSelectionListener);

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

		// Create CaretListener for txtParameterLine to update Parameter-List
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
				clearTextStyle(txtParameterLine);
				parameterTextSelections = null;

				Map<EParameter, TextSelection> newTextSelections = new HashMap<EParameter, TextSelection>();
				List<EParameter> newParameters = new ArrayList<EParameter>();

				getValidatedParameters(txtParameterLine, newParameters,
						newTextSelections);
				parameterTextSelections = newTextSelections;
				values.getChildren().clear();
				values.getChildren().addAll(newParameters);
				parameterTableViewer.refresh();

				onParameterLineCaretMoved(txtParameterLine.getCaretOffset());
			}
		};
		txtParameterLine.addModifyListener(txtParameterLineModifyListener);
		txtParameterLine.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				rebuildTextualParameterLine();

				// Make sure, the selection for txtParameterLine will be set.
				parameterTableViewer.setSelection(parameterTableViewer
						.getSelection());
			}
		});

		// Initialize Textual Parameter Line
		rebuildTextualParameterLine();

		// Initialize parameterTableViewer
		parameterTableViewer.setContentProvider(contentProvider);
		parameterTableViewer.setLabelProvider(labelProvider);
		parameterTableViewer.setInput(values);

		// Create an empty selection.
		parameterTableViewer.setSelection(new StructuredSelection(
				new Object[] {}));

		// Initialize typeComboViewer
		typeComboViewer.setContentProvider(contentProvider);
		typeComboViewer.setLabelProvider(labelProvider);
		typeComboViewer.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				return element instanceof EDataType;
			}
		});

		txtName.setText("");

		AdapterFactory adapterFactory = new ComposedAdapterFactory(
				Collections.<AdapterFactory> emptyList());
		typeComboViewer.setInput(new ItemProvider(adapterFactory,
				typeClassifiers));

		return container;
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
	 * Updates the Parameter-List selection based on the caret position in the
	 * Parameter-Line Textfield.
	 * 
	 * @param caretOffset
	 *            The new caret offset.
	 */
	protected void onParameterLineCaretMoved(int caretOffset) {
		if (parameterTextSelections != null) {
			EParameter selectedParameter = null;
			for (Object parameter : values.getChildren()) {
				selectedParameter = (EParameter) parameter;
				TextSelection textSelection = parameterTextSelections
						.get(parameter);
				int start = textSelection.getOffset();
				int end = start + textSelection.getLength();
				if (end >= caretOffset) {
					break;
				}
			}
			if (selectedParameter != null) {
				ISelection parameterSelection = new StructuredSelection(
						new Object[] { selectedParameter });
				setParameterSelection(parameterSelection);
			}
		}
	}

	/**
	 * Finds the parameter type Classifier using the passed name.
	 * 
	 * @param name
	 *            The name of the Classifier to find.
	 * @param ignoreCase
	 *            Specifies, if the search should ignore upper-case /
	 *            lower-case.
	 * @return The Classifier, or <code>null</code> if none was found.
	 */
	protected EClassifier getTypeClassifierByName(String name,
			boolean ignoreCase) {
		for (EClassifier typeClassifier : typeClassifiers) {
			String text = typeClassifier.getName();
			if (text != null) {
				if (ignoreCase && text.equalsIgnoreCase(name)
						|| text.equals(name)) {
					return typeClassifier;
				}
			}
		}
		return null;
	}

	/**
	 * Updates the enable-status of the modify button.
	 */
	protected void updateModifyButtonEnablement() {
		btnModify.setEnabled(getParameterListSelection() != null
				&& isValidParameterName);
	}

	/**
	 * Selects the substring representing the passed parameter.
	 * 
	 * @param selectedParameter
	 *            The parameter to select.
	 */
	private void setParameterTextSelection(EParameter selectedParameter) {
		if (parameterTextSelections != null) {
			TextSelection textSelection = parameterTextSelections
					.get(selectedParameter);
			if (textSelection != null) {
				int start = textSelection.getOffset();
				int end = start + textSelection.getLength();
				txtParameterLine.setSelection(start, end);
			}
		}
	}

	/**
	 * Fills the textual Parameter-Line with the existing parameters and updates
	 * the parameterTextSelections hash-map to store the new
	 * substring-positions.
	 */
	private void rebuildTextualParameterLine() {
		parameterTextSelections = new HashMap<EParameter, TextSelection>();
		String textualParameterLine = "";
		boolean first = true;
		for (Object element : values.getChildren()) {
			EParameter parameter = (EParameter) element;
			String text = labelProvider.getText(element);

			if (!first) {
				textualParameterLine += ", ";
			} else {
				first = false;
			}

			parameterTextSelections.put(parameter, new TextSelection(
					textualParameterLine.length(), text.length()));

			textualParameterLine += text;

		}
		setParameterLine(textualParameterLine);
	}

	/**
	 * Sets the text of the Parameter-Line Control without firing notifications,
	 * which are only useful, if the user enters a value.
	 * 
	 * @param parameterLineString
	 *            The string to set.
	 */
	private void setParameterLine(String parameterLineString) {
		txtParameterLine.removeCaretListener(txtParameterLineCaretListener);
		txtParameterLine.removeModifyListener(txtParameterLineModifyListener);
		txtParameterLine.setText(parameterLineString);
		txtParameterLine.addModifyListener(txtParameterLineModifyListener);
		txtParameterLine.addCaretListener(txtParameterLineCaretListener);
	}

	/**
	 * Selects the given parameter within the Parameters-List without firing
	 * notifications, which are only useful, if the users selects a parameter.
	 * 
	 * @param parameterSelection
	 *            The parameter to select.
	 */
	private void setParameterSelection(ISelection parameterSelection) {
		parameterTableViewer
				.removeSelectionChangedListener(parameterSelectionToTextSelectionListener);
		parameterTableViewer.setSelection(parameterSelection);
		parameterTableViewer
				.addSelectionChangedListener(parameterSelectionToTextSelectionListener);
	}

	/**
	 * Initializes the parameter using the passed values and default values.
	 * 
	 * @param parameter
	 *            The parameter to set features for.
	 * @param name
	 *            The name to set.
	 * @param type
	 *            The EType to set.
	 */
	private void configureParameter(EParameter parameter, String name,
			EClassifier type) {
		parameter.setName(name);
		parameter.setLowerBound(1);
		parameter.setUpperBound(1);
		parameter.setUnique(true);
		parameter.setOrdered(true);
		parameter.setEType(type);
	}

	/**
	 * Returns the parameter currently selected within the Parameter-List.
	 * 
	 * @return The parameter currently selected, or <code>null</code> if none is
	 *         selected.
	 */
	private EParameter getParameterListSelection() {
		if (parameterTableViewer.getSelection() instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) parameterTableViewer
					.getSelection();
			return (EParameter) selection.getFirstElement();
		}
		return null;
	}

	/**
	 * Returns the parameter type currently selected within the ComboBox.
	 * 
	 * @return The Classifier to use as parameter type.
	 */
	private EClassifier getSelectedType() {
		if (typeComboViewer.getSelection() instanceof StructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) typeComboViewer
					.getSelection();
			return (EClassifier) selection.getFirstElement();
		}
		return null;
	}

	/**
	 * Returns the parameter name entered in the passed StyledText between
	 * positions "start" and "end". Additionally it marks forbidden characters
	 * within this name.
	 * 
	 * @param styledText
	 *            The StyledText to parse and validate.
	 * @param start
	 *            The beginning index of the substring to handle
	 * @param end
	 *            The ending index of the substring to handle.
	 * @return The substring from "start" to "end", or <code>null</code> if
	 *         errors were found.
	 */
	protected String getValidatedParameterName(StyledText styledText,
			int start, int end) {
		boolean error = false;
		StyleRange errorStyle = new StyleRange();
		errorStyle.length = 1;
		errorStyle.underline = true;
		errorStyle.fontStyle = SWT.BOLD;
		errorStyle.underlineStyle = SWT.UNDERLINE_ERROR;

		String text = styledText.getText();

		for (int i = start; i < end; i++) {
			char ch = text.charAt(i);
			if (!Character.isJavaIdentifierPart(ch)) {
				errorStyle.start = i;
				styledText.setStyleRange(errorStyle);
				error = true;
			}
		}
		if (error) {
			return null;
		}
		return text.substring(start, end);
	}

	/**
	 * Returns the Classifier for the parameter type entered in the passed
	 * StyledText between positions "start" and "end". Additionally it marks an
	 * unrecognized type as syntax error.
	 * 
	 * @param styledText
	 *            The StyledText control to parse and validate.
	 * @param start
	 *            The beginning index of the substring to handle.
	 * @param end
	 *            The ending index of the substring to handle.
	 * @return The classifier for the parameter type, or <code>null</code> if
	 *         none was found.
	 */
	private EClassifier getValidatedParameterType(StyledText styledText,
			int start, int end) {
		String strType = styledText.getText().substring(start, end);

		// Find the Classifier ignoring uppercase/lowercase.
		EClassifier type = getTypeClassifierByName(strType, true);

		// Allow entering no Classifier, when only whitespaces are entered.
		if (type == null && !strType.trim().isEmpty()) {
			StyleRange errorStyle = new StyleRange();
			errorStyle.start = start;
			errorStyle.length = end - start;
			errorStyle.underline = true;
			errorStyle.fontStyle = SWT.BOLD;
			errorStyle.underlineStyle = SWT.UNDERLINE_ERROR;
			styledText.setStyleRange(errorStyle);
		}
		return type;
	}

	/**
	 * Creates Parameters for the text in the passed StyledText-Control.
	 * Additionally it marks syntax errors within the text, if any were found.
	 * 
	 * The generated Parameters will be put into the list provided as
	 * returnedParameters-Argument.
	 * 
	 * @param styledText
	 *            The StyledText control to parse and validate.
	 * @param returnedParameters
	 *            A list to put the created parameters into.
	 * @param returnedTextSelections
	 *            A map to put the substring boundaries for each Parameter
	 *            within the StyledText into.
	 * @return <code>true</code>, if and only if no error was found.
	 */
	protected boolean getValidatedParameters(StyledText styledText,
			List<EParameter> returnedParameters,
			Map<EParameter, TextSelection> returnedTextSelections) {
		boolean error = false;
		int pos = 0;
		for (String s : txtParameterLine.getText().split(",")) {
			if (!s.isEmpty()) {
				String[] parts = s.split("\\:");
				int leadingWhitespacesName = s.length()
						- s.concat("A").trim().length() + 1;
				int startName = pos + leadingWhitespacesName;

				EClassifier type = null;
				if (parts.length > 1) {
					int leadingWhitespacesType = parts[1].length()
							- parts[1].concat("A").trim().length() + 1;
					int startType = pos + parts[0].length()
							+ leadingWhitespacesType + 1; // Add one for the
															// colon

					type = getValidatedParameterType(styledText, startType,
							startType + parts[1].trim().length());
					if (type == null && !parts[1].trim().isEmpty()) {
						error = true;
					}

					type = getTypeClassifierByName(parts[1].trim(), true);
				}

				if (getValidatedParameterName(styledText, startName, startName
						+ parts[0].trim().length()) == null) {
					error = true;
				} else {
					EParameter parameter = EcoreFactory.eINSTANCE
							.createEParameter();
					configureParameter(parameter, parts[0].trim(), type);
					returnedParameters.add(parameter);

					TextSelection textSelection = new TextSelection(pos,
							s.length());
					if (returnedTextSelections != null) {
						returnedTextSelections.put(parameter, textSelection);
					}
				}
			}
			pos += s.length() + 1; // Add one for the comma-delimiter.
		}
		return !error;
	}

	@Override
	protected Point getInitialSize() {
		return new Point(480, 470);
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
