package de.uni_paderborn.fujaba.muml.ui.properties;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.storydriven.core.expressions.Expression;

import com.google.inject.Injector;

import de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor;
import de.uni_paderborn.fujaba.muml.common.ILoadResult;
import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.ui.internal.ActionLanguageActivator;
import de.uni_paderborn.fujaba.muml.ui.xtfo.EmbeddedXtextEditor;

public class XtextPropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {
	private Composite container;
	private boolean active = false;
	private int updating = 0;
	private int saving = 0;

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
			if (updating > 0) {
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
		container = toolkit.createComposite(parent);
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
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.minimumWidth = 200;
		gridData.minimumHeight = 100;
		innerContainer.setLayoutData(gridData);
		
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

		final XtextDocument document = (XtextDocument) embeddedXtextEditor.getDocument();
		final Job validationJob = document.getValidationJob();
		document.setValidationJob(new Job(validationJob.getName()) {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				// Check if the text is empty and remove markers
				if (document.get() == null || document.get().isEmpty()) {
					removeMarkers();
					return Status.OK_STATUS;
				}
				
				// Run Xtext validation normally
				validationJob.schedule();
				try {
					validationJob.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
					return Status.CANCEL_STATUS;
				}
				return validationJob.getResult();
			}
			
		});
		

		embeddedXtextEditor.getViewer().getTextWidget().addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				active = true;				
			}
			public void focusLost(FocusEvent e) {
				active = false;
				modify();
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
		saving++;
		try {
			if (text == null || text.isEmpty()) {
				setSingleValue(null);

			} else {
				Expression expression = parseExpression(text);
				setSingleValue(expression);
			}
		} catch (CoreException e) {
			// eat this exception; it complains about a syntax error,
			// which is shown to the user in the document anyway.
		} finally {
			saving--;
		}
	}
	
	private void removeMarkers() {
		AnnotationModel annotationModel = (AnnotationModel) embeddedXtextEditor.getViewer().getAnnotationModel();
		annotationModel.removeAllAnnotations();
	}

	private void setSingleValue(Object singleValue) {
		if (feature.isMany()) {
			if (singleValue == null) {
				setValue(Collections.emptyList());
			} else {
				setValue(Collections.singletonList(singleValue));
			}
		} else {
			setValue(singleValue);
		}
	}

	private Object getSingleValue() {
		if (feature.isMany() && value != null) {
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
		if (saving == 0) {
			updateText();
		}
	}
	
	private void updateText() {
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

	private void updateText(String text) {
		if (embeddedXtextEditor != null && !text.equals(embeddedXtextEditor.getDocument().get())) {
			updating++;
			try {
				embeddedXtextEditor.update(text);
			} finally {
				updating--;
			}
		}
	}

	@Override
	public void dispose() {
		if (embeddedXtextEditor != null) {
			embeddedXtextEditor.getDocument()
					.removeModelListener(saveModelListener);
		}
		super.dispose();
	}

	@Override
	protected void doSetVisible(boolean visible) {
		for (Control control : new Control[] { container }) {
			if (control != null && !control.isDisposed()) {
				control.setVisible(visible);
				if (control.getLayoutData() instanceof GridData) {
					((GridData) control.getLayoutData()).exclude = !visible;
				}
			}
		}
	}
	
	@Override
	public void refresh() {
		super.refresh();
		if (saving == 0) {
			updateText();
		};
	}
	
	

}
