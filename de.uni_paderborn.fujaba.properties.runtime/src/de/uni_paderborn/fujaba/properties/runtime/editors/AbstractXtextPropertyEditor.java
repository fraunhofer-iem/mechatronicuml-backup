package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.AdapterFactory;
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

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin;
import de.uni_paderborn.fujaba.properties.runtime.xtfo.EmbeddedXtextEditor;

/**
 * Abstract base class for a xtext based property editor.
 *
 */
public abstract class AbstractXtextPropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {
	
	private final int MINIMUM_HEIGHT = 100;
	
	protected EmbeddedXtextEditor embeddedXtextEditor;
	private Injector injector;
	private Composite container;
	private Composite innerContainer;
	private GridData gridData;
	private Label label;
	protected List<IXtextModelListener> modelListenerList;
	private boolean active;

	public AbstractXtextPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature, Injector injector) {
		super(adapterFactory, feature);
		this.injector = injector;
		modelListenerList = new ArrayList<IXtextModelListener>();
	}
	
	protected void createEmbeddedXtextEditor(Composite container) {
		embeddedXtextEditor = new EmbeddedXtextEditor(container, injector);
	}
	
	/**
	 * Create and register IXtextModelListeners.
	 * These are notified if the xtext model changed.
	 */
	protected void createAndRegisterModelListeners() {
		modelListenerList.add(new SaveModelListener());
		for (IXtextModelListener modelListener : modelListenerList) {
			embeddedXtextEditor.getDocument().addModelListener(modelListener);
		}
	}
	
	/**
	 * Sets the embedded xtext editor's validation job.
	 */
	protected void createAndSetValidationJob() {
		final XtextDocument document = (XtextDocument) embeddedXtextEditor.getDocument();
		final Job validationJob = document.getValidationJob();
		document.setValidationJob(new Job(validationJob.getName()) {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				// Check if the text is empty and remove markers
				if (document.get() == null || document.get().isEmpty()) {
					AnnotationModel annotationModel = (AnnotationModel) embeddedXtextEditor.getViewer()
							.getAnnotationModel();
					annotationModel.removeAllAnnotations();
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
	}
	
	/**
	 * Creates and registers listeners for the embedded xtext editor
	 * viewer's text widget.
	 */
	protected void createAndRegisterTextWidgetListeners() {
		final StyledText textWidget = embeddedXtextEditor.getViewer().getTextWidget();
		textWidget.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				int height = textWidget.computeSize(SWT.DEFAULT, SWT.DEFAULT).y + 20;
				gridData.minimumHeight = Math.max(MINIMUM_HEIGHT, height);
				RuntimePlugin.revalidateLayout(innerContainer);
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
	
	/**
	 * Checks if the embedded xtext editor has the focus
	 * @return true if it has the focus
	 */
	protected boolean isActive() {
		return active;
	}
	
	/**
	 * Creates the container, which contains the embedded
	 * xtext editor.
	 */
	protected void createInnerContainer(Composite parent, FormToolkit toolkit) {
		// Create container with border
		innerContainer = toolkit.createComposite(parent, SWT.BORDER);
		gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.minimumWidth = 200;
		gridData.minimumHeight = MINIMUM_HEIGHT;
		innerContainer.setLayoutData(gridData);

		
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.horizontalSpacing = gridLayout.verticalSpacing = 0;
		gridLayout.marginWidth = gridLayout.marginHeight = 0;
		innerContainer.setLayout(gridLayout);
	}

	@Override
	public void createControls(Composite parent, FormToolkit toolkit) {
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
		
		createInnerContainer(parent, toolkit);
		createEmbeddedXtextEditor(innerContainer);
		createAndRegisterModelListeners();
		createAndSetValidationJob();
		createAndRegisterTextWidgetListeners();
	}
	
	@Override
	public void dispose() {
		if (embeddedXtextEditor != null) {
			for (IXtextModelListener modelListener : modelListenerList) {
				embeddedXtextEditor.getDocument().removeModelListener(modelListener);
			}
		}
		super.dispose();
	}

	@Override
	protected Collection<Control> getControls() {
		List<Control> controls = new ArrayList<Control>();
		if (embeddedXtextEditor != null) {
			controls.add(embeddedXtextEditor.getViewer().getTextWidget());
		}
		controls.add(label);
		// XXX: container might be null
		controls.add(container);
		return controls;
	}

	private void modify() {
		String text = embeddedXtextEditor.getDocument().get();
		save(text);
	}
	
	/**
	 * Parses the passed text and stores it in the model.
	 * @param text the string that should be parsed
	 */
	protected abstract void save(String text);
	
	/**
	 * Checks if the editor's text is currently saved.
	 * @return true if the editor's text is saved.
	 */
	protected abstract boolean isSaving();
	
	/**
	 * Updates the editor's text with the serialized
	 * model's text.
	 */
	protected abstract void updateText();
	
	/**
	 * Checks if the editor's text is currently updated.
	 * @return true if the editor's text is going to be updated
	 */
	protected abstract boolean isUpdating();
	
	class SaveModelListener implements IXtextModelListener {

		@Override
		public void modelChanged(XtextResource resource) {
			if (isUpdating()) {
				return;
			}

			// using the resource directly isn't "thread safe"
			// because the resource might have been changed again after we
			// checked it via getErrors()...
			if (isActive()) {
				modify();
			}
		}

	}
	
	@Override
	public void setFocus() {
		if (embeddedXtextEditor != null) {
			embeddedXtextEditor.getViewer().getTextWidget().setFocus();
		}
	}
	
	@Override
	public void refresh() {
		super.refresh();
		if (!isSaving()) {
			updateText();
		};
	}
	
	@Override
	protected void valueChanged() {
		super.valueChanged();
		if (!isSaving()) {
			updateText();
		}
	}

}
