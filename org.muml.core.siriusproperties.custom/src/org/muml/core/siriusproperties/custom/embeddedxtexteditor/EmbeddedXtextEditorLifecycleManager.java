package org.muml.core.siriusproperties.custom.embeddedxtexteditor;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;

public class EmbeddedXtextEditorLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	private EEFCustomWidgetDescription description;

	private TableViewer tableViewer;

	private ComposedAdapterFactory composedAdapterFactory;

	private SelectionListener onClickListener;

	private EmbeddedXtextEditorController controller;

	private IConsumer<Object> newValueConsumer;

	public EmbeddedXtextEditorLifecycleManager(EEFCustomWidgetDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.description = description;
	}

	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {
		Table table = formContainer.getWidgetFactory().createTable(parent,
				SWT.READ_ONLY | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER | SWT.SINGLE);
		this.tableViewer = new TableViewer(table);
		this.composedAdapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		this.tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		this.tableViewer.setLabelProvider(new DelegatingStyledCellLabelProvider(new AdapterFactoryLabelProvider.StyledLabelProvider(
				this.composedAdapterFactory, this.tableViewer)));

		this.controller = new EmbeddedXtextEditorController(description, variableManager, interpreter, contextAdapter);
	}

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.newValueConsumer = (newValue) -> this.tableViewer.setInput(newValue);
		this.controller.onNewValue(this.newValueConsumer);

		this.onClickListener = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				Object selection = ((IStructuredSelection) EmbeddedXtextEditorLifecycleManager.this.tableViewer.getSelection()).getFirstElement();
				EmbeddedXtextEditorLifecycleManager.this.controller.handleClick(selection);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent event) {
				Object selection = ((IStructuredSelection) EmbeddedXtextEditorLifecycleManager.this.tableViewer.getSelection()).getFirstElement();
				EmbeddedXtextEditorLifecycleManager.this.controller.handleClick(selection);
			}
		};
		this.tableViewer.getTable().addSelectionListener(this.onClickListener);
	}

	@Override
	public void refresh() {
		super.refresh();

		this.controller.refresh();
	}

	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
		this.controller.removeValueConsumer();
		this.newValueConsumer = null;

		this.tableViewer.getTable().removeSelectionListener(this.onClickListener);
		this.onClickListener = null;
	}

	@Override
	protected IEEFWidgetController getController() {
		return this.controller;
	}

	@Override
	protected EEFWidgetDescription getWidgetDescription() {
		return this.description;
	}

	@Override
	protected Control getValidationControl() {
		return this.tableViewer.getTable();
	}

	@Override
	public void dispose() {
		super.dispose();
		this.composedAdapterFactory.dispose();
	}

	@Override
	protected void setEnabled(boolean isEnabled) {
		// TODO Auto-generated method stub
		
	}
}