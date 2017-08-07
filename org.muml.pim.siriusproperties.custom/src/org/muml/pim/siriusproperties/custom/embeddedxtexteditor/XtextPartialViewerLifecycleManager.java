package org.muml.pim.siriusproperties.custom.embeddedxtexteditor;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.muml.pim.actionlanguage.xtext.common.LanguageResource;
import org.muml.pim.actionlanguage.xtext.ui.internal.ActionLanguageActivator;

import com.google.inject.Injector;

public class XtextPartialViewerLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	private EEFCustomWidgetDescription description;
	
	private EmbeddedXtextEditor embeddedXtextEditor;
	
	private XtextPartialViewerController controller;
	
	private IConsumer<Object> newValueConsumer;
	
	public XtextPartialViewerLifecycleManager(
			EEFCustomWidgetDescription controlDescription,
			IVariableManager variableManager, 
			IInterpreter interpreter, 
			EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.description = controlDescription;
	}

	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {
		String languageName = "org.muml.pim.actionlanguage.xtext.ActionLanguage";
		Injector injector = ActionLanguageActivator.getInstance().getInjector(languageName);
		
		embeddedXtextEditor = new EmbeddedXtextEditor(parent, injector, SWT.BORDER | SWT.H_SCROLL);
		Control control = embeddedXtextEditor.getControl();
		GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		gridData.heightHint = 14 * 12;
		gridData.widthHint = 300;
		gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		control.setLayoutData(gridData);
		
		this.controller = new XtextPartialViewerController(description, variableManager, interpreter, contextAdapter);
	}

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
		String text = LanguageResource.serializeEObjectSafe((EObject)getWidgetSemanticElement(), (EObject) getWidgetSemanticElement());
		final String text2 = (text == null) ? "" : text;
		this.newValueConsumer = (newValue) -> this.embeddedXtextEditor.update(text2);
		this.controller.onNewValue(this.newValueConsumer);
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
		return this.embeddedXtextEditor.getControl();
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	protected void setEnabled(boolean enabled) {
		// Not handled.
	}

}
