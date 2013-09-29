package de.uni_paderborn.fujaba.muml.ui.properties;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.storydriven.core.expressions.Expression;

import com.google.inject.Injector;

import de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor;
import de.uni_paderborn.fujaba.muml.common.ILoadResult;
import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.ui.internal.ActionLanguageActivator;
import de.uni_paderborn.fujaba.muml.ui.xtfo.EmbeddedXtextEditor;

public class XtextPropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {

	private boolean active = false;
	private boolean updating = false;
	private boolean saving = false;
	

	public XtextPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	private static final String languageName = "de.uni_paderborn.fujaba.muml.ActionLanguage";

	private EmbeddedXtextEditor embeddedXtextEditor;
	private SaveModelListener saveModelListener;

	class SaveModelListener implements IXtextModelListener {

		@Override
		public void modelChanged(XtextResource resource) {
			if (updating) {
				return;
			}
			// using the resource directly isn't "thread safe"
			// because the resource might have been changed again after we
			// checked it via getErrors()...
			if (active) {
				modify();
			}
		}

	}

	@Override
	public void createControls(Composite parent, FormToolkit toolkit) {

		// Outer container
		Composite container = toolkit.createComposite(parent);
		if (parent.getLayout() instanceof GridLayout) {
			container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
					true, 2, 1));
		}
		container.setLayout(new GridLayout(1, false));
		
		// Create label
		Label label = toolkit.createLabel(container, getLabelText());
		label.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));

		// Create container with border
		Composite innerContainer = toolkit.createComposite(container, SWT.BORDER);
		if (parent.getLayout() instanceof GridLayout) {
			GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
			gridData.minimumWidth = 400;
			gridData.minimumHeight = 100;
			innerContainer.setLayoutData(gridData);
		}
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.horizontalSpacing = gridLayout.verticalSpacing = 0;
		gridLayout.marginWidth = gridLayout.marginHeight = 0;
		innerContainer.setLayout(gridLayout);

		// Create embedded xtext editor
		Injector injector = ActionLanguageActivator.getInstance().getInjector(
				languageName);
		LanguageResource.setInjector(injector);
		embeddedXtextEditor = new EmbeddedXtextEditor(innerContainer, injector);
		saveModelListener = new SaveModelListener();
		embeddedXtextEditor.getDocument().addModelListener(saveModelListener);
		embeddedXtextEditor.getViewer().getTextWidget().addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				active = true;				
			}
			public void focusLost(FocusEvent e) {
				modify();
				active = false;
			}
		});
	}

	private void modify() {
		String text = embeddedXtextEditor.getDocument().get();
		try {
			save(text);
			// System.out.println("valid");
		} catch (CoreException e) {
			e.printStackTrace();
			// System.out.println("invalid");
			// text is invalid
		}
	}

	private void save(String text) throws CoreException {
		saving = true;
		Expression expression = parseExpression(text);
		setSingleValue(expression);
		saving = false;
	}
	
	private void setSingleValue(Object singleValue) {
		if (feature.isMany()) {
			setValue(Collections.singletonList(singleValue));
		} else {
			setValue(singleValue);
		}
	}

	private Object getSingleValue() {
		if (feature.isMany()) {
			Collection<?> values = (Collection<?>) value;
			if (!values.isEmpty()) {
				return values.iterator().next();
			}
			return null;
		}
		return value;
	}

	private Expression parseExpression(String text) throws CoreException {
		ILoadResult loadResult = LanguageResource.loadFromString(text, element);
		if (loadResult.hasError()) {
			String pluginId = "FIXME"; //ActionLanguageActivator.getInstance().getBundle().getSymbolicName();
			IStatus status = new Status(IStatus.ERROR, pluginId, IStatus.ERROR, loadResult.getError(), null);
			throw new CoreException(status);
		}
		return (Expression) loadResult.getEObject();
	}


	@Override
	protected void valueChanged() {
		super.valueChanged();
		if (!saving) {
			
			String text = null;
			try {
				text = LanguageResource.serializeEObjectSafe((EObject) getSingleValue(), element);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (text == null) {
				text = "";
			}
			updateText(text);
		}
	}

	private synchronized void updateText(String text) {
		if (embeddedXtextEditor != null && !text.equals(embeddedXtextEditor.getDocument().get())) {
			updating = true;
			embeddedXtextEditor.update(text);
			updating = false;
		}
	}

	@Override
	public void dispose() {
		embeddedXtextEditor.getDocument()
				.removeModelListener(saveModelListener);
		super.dispose();
	}
	
	

}
