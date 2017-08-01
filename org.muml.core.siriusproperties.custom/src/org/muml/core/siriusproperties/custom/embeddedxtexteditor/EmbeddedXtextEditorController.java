package org.muml.core.siriusproperties.custom.embeddedxtexteditor;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFCustomWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

public class EmbeddedXtextEditorController extends AbstractEEFCustomWidgetController {

	private static final String VALUE_EXPRESSION_ID = "valueExpression"; //$NON-NLS-1$

	private static final String ON_CLICK_EXPRESSION_ID = "onClickExpression"; //$NON-NLS-1$

	private static final String SELECTION_VARIABLE_NAME = "selection"; //$NON-NLS-1$

	private IConsumer<Object> newValueConsumer;

	public EmbeddedXtextEditorController(EEFCustomWidgetDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter) {
		super(description, variableManager, interpreter, contextAdapter);
	}

	@Override
	protected EEFCustomWidgetDescription getDescription() {
		return this.description;
	}

	@Override
	public void refresh() {
		super.refresh();
		this.newEval().call(this.getCustomExpression(VALUE_EXPRESSION_ID), this.newValueConsumer);
	}

	public void handleClick(Object object) {
		this.contextAdapter.performModelChange(() -> {
			String onClickExpression = this.getCustomExpression(ON_CLICK_EXPRESSION_ID);

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(this.variableManager.getVariables());
			variables.put(SELECTION_VARIABLE_NAME, object);

			EvalFactory.of(this.interpreter, variables).call(onClickExpression);
		});
	}

	public void onNewValue(IConsumer<Object> consumer) {
		this.newValueConsumer = consumer;
	}

	public void removeValueConsumer() {
		this.newValueConsumer = null;
	}
}
