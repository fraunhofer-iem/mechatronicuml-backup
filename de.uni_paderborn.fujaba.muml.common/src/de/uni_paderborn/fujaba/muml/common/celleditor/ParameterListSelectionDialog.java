package de.uni_paderborn.fujaba.muml.common.celleditor;

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

public class ParameterListSelectionDialog extends Dialog {

	protected ILabelProvider labelProvider;
	protected IContentProvider contentProvider;
	protected EObject object;
	protected EClassifier eClassifier;
	protected List<EClassifier> typeClassifiers;
	protected String displayName;
	protected ItemProvider values;
	protected java.util.List<?> choiceOfValues;
	protected EList<?> result;
	protected Map<EParameter, TextSelection> parameterTextSelections;;
	protected ISelectionChangedListener parameterSelectionChangedListener;
	protected ModifyListener txtParameterLineModifyListener;
	protected boolean isValidParameterName;

	private StyledText txtName;
	private TableViewer parameterTableViewer;
	private ComboViewer typeComboViewer;
	private StyledText txtParameterLine;
	private Button btnModify;

	/**
	 * @wbp.parser.constructor
	 */
	public ParameterListSelectionDialog(Shell parent,
			ILabelProvider labelProvider, EObject eObject,
			EStructuralFeature eStructuralFeature,
			List<EClassifier> typeClassifiers) {
		super(parent);
		setShellStyle(getShellStyle() | SWT.RESIZE | SWT.MAX);
		this.labelProvider = labelProvider;
		this.object = eObject;
		this.eClassifier = eStructuralFeature.getEType();
		this.displayName = eStructuralFeature.getName();
		this.typeClassifiers = typeClassifiers;

		AdapterFactory adapterFactory = new ComposedAdapterFactory(
				Collections.<AdapterFactory> emptyList());
		values = new ItemProvider(adapterFactory,
				(java.util.List<?>) eObject.eGet(eStructuralFeature));
		contentProvider = new AdapterFactoryContentProvider(adapterFactory);
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText(EMFEditUIPlugin.INSTANCE.getString(
				"_UI_FeatureEditorDialog_title", new Object[] { displayName,
						labelProvider.getText(object) }));
		shell.setImage(labelProvider.getImage(object));
	}

	/**
	 * Create contents of the dialog. This method was created by the
	 * SWT-Designer Eclipse Plugin.
	 * 
	 * @param parent
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

		// Add SelectionListener to btnModify
		btnModify.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EParameter oldParameter = getSelectedParameter();
				int index = values.getChildren().indexOf(oldParameter);

				if (index > -1) {
					EParameter newParameter = EcoreUtil.copy(oldParameter);
					onConfigureParameter(newParameter);
					values.getChildren().set(index, newParameter);
					rebuildTextualParameterLine();

					// Update visuals
					parameterTableViewer.refresh();
					parameterTableViewer.setSelection(new StructuredSelection(
							new EParameter[] { newParameter }));
				}
			}
		});

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
		// txtParameterLine.setEnabled(false);
		txtParameterLine.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, 1, 1));

		new Label(container, SWT.NONE);

		txtName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent event) {
				boolean valid = validateParameterName(txtName);
				isValidParameterName = !txtName.getText().isEmpty() && valid;
				btnCreate.setEnabled(isValidParameterName);
				updateModifyButton();
			}
		});

		// Initialize btnCreate
		btnCreate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EParameter newParameter = EcoreFactory.eINSTANCE
						.createEParameter();
				onConfigureParameter(newParameter);
				values.getChildren().add(newParameter);
				rebuildTextualParameterLine();

				// Update visuals
				parameterTableViewer.refresh();
				parameterTableViewer.setSelection(new StructuredSelection(
						new EParameter[] { newParameter }));
			}
		});

		// Add SelectionListener to btnRemove
		btnRemove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EParameter oldParameter = getSelectedParameter();
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

		// Add SelectionListener to btnUp
		btnUp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EParameter firstParameter = getSelectedParameter();
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

		// Add SelectionListener to btnDown
		btnDown.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EParameter firstParameter = getSelectedParameter();
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

		// Create SelectionListener for parameterTableViewer
		parameterSelectionChangedListener = new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) event
							.getSelection();
					Object selectedElement = selection.getFirstElement();
					if (selectedElement != null) {
						setTextSelection((EParameter) selectedElement);
						int index = values.getChildren().indexOf(
								selectedElement);
						btnUp.setEnabled(index > 0);
						btnDown.setEnabled(index < values.getChildren().size() - 1);
					} else {
						btnUp.setEnabled(false);
						btnDown.setEnabled(false);
					}
					btnRemove.setEnabled(selectedElement != null);
					updateModifyButton();
				}
			}
		};
		parameterTableViewer
				.addSelectionChangedListener(parameterSelectionChangedListener);

		txtParameterLine.addCaretListener(new CaretListener() {

			@Override
			public void caretMoved(CaretEvent event) {
				if (parameterTextSelections != null) {
					for (EParameter parameter : parameterTextSelections
							.keySet()) {
						TextSelection textSelection = parameterTextSelections
								.get(parameter);
						int start = textSelection.getOffset();
						int end = start + textSelection.getLength();
						if (event.caretOffset >= start
								&& event.caretOffset <= end) {
							ISelection parameterSelection = new StructuredSelection(
									new Object[] { parameter });
							setParameterSelection(parameterSelection);
						}
					}
				}
			}

		});

		txtParameterLineModifyListener = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				parameterTextSelections = null;
				values.getChildren().clear();
				for (String s : txtParameterLine.getText().split(",")) {
					String[] parts = s.split("\\:");

					EClassifier type = null;
					if (parts.length > 1) {
						type = getTypeClassifierByName(parts[1].trim(), true);
					}

					EParameter parameter = EcoreFactory.eINSTANCE
							.createEParameter();
					parameter.setLowerBound(1);
					parameter.setUpperBound(1);
					parameter.setOrdered(true);
					parameter.setUnique(true);
					parameter.setEType(type);
					parameter.setName(parts[0].trim());
					values.getChildren().add(parameter);
				}
				parameterTableViewer.refresh();
			}
		};
		txtParameterLine.addModifyListener(txtParameterLineModifyListener);
		txtParameterLine.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				rebuildTextualParameterLine();
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

	protected boolean validateParameterName(StyledText styledText) {
		boolean error = false;
		StyleRange errorStyle = new StyleRange();
		errorStyle.length = 1;
		errorStyle.underline = true;
		errorStyle.fontStyle = SWT.BOLD;
		errorStyle.underlineStyle = SWT.UNDERLINE_ERROR;

		String text = styledText.getText();

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (!Character.isJavaIdentifierPart(ch)) {
				errorStyle.start = i;
				styledText.setStyleRange(errorStyle);
				error = true;
			}
		}
		return !error;
	}

	protected EClassifier getTypeClassifierByName(String string,
			boolean ignoreCase) {
		for (EClassifier typeClassifier : typeClassifiers) {
			String text = typeClassifier.getName();
			if (text != null) {
				if (ignoreCase && text.equalsIgnoreCase(string)
						|| text.equals(string)) {
					return typeClassifier;
				}
			}
		}
		return null;
	}

	protected void updateModifyButton() {
		btnModify.setEnabled(getSelectedParameter() != null
				&& isValidParameterName);
	}

	private void setTextSelection(EParameter selectedElement) {
		if (parameterTextSelections != null) {
			TextSelection textSelection = parameterTextSelections
					.get(selectedElement);
			if (textSelection != null) {
				int start = textSelection.getOffset();
				int end = start + textSelection.getLength();
				txtParameterLine.setSelection(start, end);
			}
		}
	}

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

	private void setParameterLine(String textualParameterLine) {
		txtParameterLine.removeModifyListener(txtParameterLineModifyListener);
		txtParameterLine.setText(textualParameterLine);
		txtParameterLine.addModifyListener(txtParameterLineModifyListener);
	}

	private void setParameterSelection(ISelection parameterSelection) {
		parameterTableViewer
				.removeSelectionChangedListener(parameterSelectionChangedListener);
		parameterTableViewer.setSelection(parameterSelection);
		parameterTableViewer
				.addSelectionChangedListener(parameterSelectionChangedListener);
	}

	private void onConfigureParameter(EParameter parameter) {
		EClassifier type = getSelectedType();
		parameter.setName(txtName.getText());
		parameter.setLowerBound(1);
		parameter.setUpperBound(1);
		parameter.setUnique(true);
		parameter.setOrdered(true);
		parameter.setEType(type);

		// Reset txtName Textfield.
		txtName.setSelection(0, txtName.getText().length());
		txtName.setFocus();
	}

	private EParameter getSelectedParameter() {
		if (parameterTableViewer.getSelection() instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) parameterTableViewer
					.getSelection();
			return (EParameter) selection.getFirstElement();
		}
		return null;
	}

	private EClassifier getSelectedType() {
		if (typeComboViewer.getSelection() instanceof StructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) typeComboViewer
					.getSelection();
			return (EDataType) selection.getFirstElement();
		}
		return null;
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

	public EList<?> getResult() {
		return result;
	}

}
