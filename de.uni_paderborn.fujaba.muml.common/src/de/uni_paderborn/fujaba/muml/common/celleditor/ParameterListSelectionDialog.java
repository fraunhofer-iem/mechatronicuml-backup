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
import org.eclipse.swt.custom.StyledText;
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
import org.eclipse.swt.widgets.Text;

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

	private Text txtName;
	private TableViewer parameterTableViewer;
	private ComboViewer typeComboViewer;
	private StyledText txtParameterLine;

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

		txtName = new Text(grpParameterProps, SWT.BORDER);
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

		Button btnCreate = new Button(composite, SWT.NONE);
		btnCreate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		btnCreate.setText("&Create");

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

		final Button btnModify = new Button(compositeActions, SWT.NONE);
		btnModify.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		btnModify.setText("&Modify");

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
					if (index > 0) {
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
						int index = values.getChildren().indexOf(selectedElement);
						btnUp.setEnabled(index > 0);
						btnDown.setEnabled(index < values.getChildren().size() - 1);
					} else {
						btnUp.setEnabled(false);
						btnDown.setEnabled(false);
					}
					btnRemove.setEnabled(selectedElement != null);
					btnModify.setEnabled(selectedElement != null);
					
				}
			}
		};
		parameterTableViewer
				.addSelectionChangedListener(parameterSelectionChangedListener);

		txtParameterLine.addCaretListener(new CaretListener() {

			@Override
			public void caretMoved(CaretEvent event) {

				for (EParameter parameter : parameterTextSelections.keySet()) {
					TextSelection textSelection = parameterTextSelections
							.get(parameter);
					int start = textSelection.getOffset();
					int end = start + textSelection.getLength();
					if (event.caretOffset >= start && event.caretOffset <= end) {
						parameterTableViewer
								.removeSelectionChangedListener(parameterSelectionChangedListener);
						ISelection parameterSelection = new StructuredSelection(
								new Object[] { parameter });
						parameterTableViewer.setSelection(parameterSelection);
						parameterTableViewer
								.addSelectionChangedListener(parameterSelectionChangedListener);

					}
				}

			}

		});

		// Initialize Textual Parameter Line
		rebuildTextualParameterLine();

		// Initialize parameterTableViewer
		parameterTableViewer.setContentProvider(contentProvider);
		parameterTableViewer.setLabelProvider(labelProvider);
		parameterTableViewer.setInput(values);
		if (!values.getChildren().isEmpty()) {
			parameterTableViewer.setSelection(new StructuredSelection(values
					.getChildren().get(0)));
		}

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

		AdapterFactory adapterFactory = new ComposedAdapterFactory(
				Collections.<AdapterFactory> emptyList());
		typeComboViewer.setInput(new ItemProvider(adapterFactory,
				typeClassifiers));

		return container;
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
		int pos = 0;
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
		txtParameterLine.setText(textualParameterLine);
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
