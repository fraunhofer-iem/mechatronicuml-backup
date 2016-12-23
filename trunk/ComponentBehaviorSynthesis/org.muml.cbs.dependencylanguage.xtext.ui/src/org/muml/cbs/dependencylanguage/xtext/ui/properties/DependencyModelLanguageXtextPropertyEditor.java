package org.muml.cbs.dependencylanguage.xtext.ui.properties;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.muml.ape.runtime.RuntimePlugin;
import org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor;
import org.muml.cbs.dependencylanguage.xtext.common.DependencyModelLanguageResource;
import org.muml.cbs.dependencylanguage.xtext.ui.internal.DependencyModelLanguageActivator;
import org.muml.cbs.dependencylanguage.xtext.ui.xtfo.EmbeddedXtextEditor;
import org.muml.core.common.xtext.ILoadResult;

import com.google.inject.Injector;

public class DependencyModelLanguageXtextPropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {
	private final int MINIMUM_HEIGHT = 100; 
	
	private Label label;
	private Composite container;
	private boolean active = false;
	private int updating = 0;
	private int saving = 0;
	
	private GridData gridData;

	public DependencyModelLanguageXtextPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	private static final String languageName = "org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage";

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
	public void doCreateControls(Composite parent, FormToolkit toolkit) {
		boolean useContainer = parent.getLayout() instanceof RowLayout;
		if (useContainer) {
			// Outer container
			container = toolkit.createComposite(parent);
			if (parent.getLayout() instanceof GridLayout) {
				container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
						true, 2, 1));
			}
			GridLayout containerLayout = new GridLayout(1, false);
			containerLayout.marginWidth = containerLayout.marginHeight = 0;
			container.setLayout(containerLayout);
			parent = container;
		}

		// Create label
		label = toolkit.createLabel(parent, getLabelText());
		label.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));

		// Create container with border
		final Composite innerContainer = toolkit.createComposite(parent, SWT.BORDER);
		gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.minimumWidth = 200;
		gridData.minimumHeight = MINIMUM_HEIGHT;
		innerContainer.setLayoutData(gridData);

		
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.horizontalSpacing = gridLayout.verticalSpacing = 0;
		gridLayout.marginWidth = gridLayout.marginHeight = 0;
		innerContainer.setLayout(gridLayout);

		// Create embedded xtext editor
		Injector injector = DependencyModelLanguageActivator.getInstance().getInjector(
				languageName);
		DependencyModelLanguageResource.setInjector(injector);
		embeddedXtextEditor = new EmbeddedXtextEditor(innerContainer, injector);
		saveModelListener = new SaveModelListener();
		embeddedXtextEditor.getDocument().addModelListener(saveModelListener);
		final StyledText textWidget = embeddedXtextEditor.getViewer().getTextWidget();
		textWidget.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				int height = textWidget.computeSize(SWT.DEFAULT, SWT.DEFAULT).y + 20;
				gridData.minimumHeight = Math.max(MINIMUM_HEIGHT, height);
				RuntimePlugin.revalidateLayout(innerContainer);
			}
			
		});

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
				EObject expression = parseExpression(text);
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

	private EObject parseExpression(String text) throws CoreException {
		ILoadResult loadResult = DependencyModelLanguageResource.loadFromString(text, element);
		if (loadResult.hasError()) {
			//FIXME String pluginId = DependencyModelLanguageActivator.getInstance().getBundle().getSymbolicName();
			String pluginId = "FIXME";			
			IStatus status = new Status(IStatus.ERROR, pluginId, IStatus.ERROR, loadResult.getError(), null);
			throw new CoreException(status);
		}
		return loadResult.getEObject();
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
			text = DependencyModelLanguageResource.serializeEObjectSafe((EObject) getSingleValue(), element);
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
	protected Collection<Control> getControls() {
		List<Control> controls = new ArrayList<Control>();
		if (embeddedXtextEditor != null) {
			controls.add(embeddedXtextEditor.getViewer().getTextWidget());
		}
		if (label !=null){
			controls.add(label);
		}
		if (container != null){
			controls.add(container);
		}
		
		return controls;
	}
	
	@Override
	public void refresh() {
		super.refresh();
		if (saving == 0) {
			updateText();
		};
	}
	
	@Override
	public void setFocus() {
		if (embeddedXtextEditor != null) {
			embeddedXtextEditor.getViewer().getTextWidget().setFocus();
		}
	}
}
