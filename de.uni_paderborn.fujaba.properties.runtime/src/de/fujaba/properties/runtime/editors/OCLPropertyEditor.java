package de.fujaba.properties.runtime.editors;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.xtext.console.XtextConsolePlugin;
import org.eclipse.ocl.examples.xtext.console.xtfo.EmbeddedXtextEditor;
import org.eclipse.ocl.examples.xtext.essentialocl.ui.model.BaseDocument;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCSResource;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Injector;

public class OCLPropertyEditor extends AbstractStructuralFeaturePropertyEditor {
	private Composite composite;
	private EmbeddedXtextEditor embeddedXtextEditor;
	protected int saving = 0;

	public OCLPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	@Override
	public void createControls(Composite parent, FormToolkit toolkit) {
		super.createControls(parent, toolkit);
		Label label = toolkit.createLabel(parent, getLabelText());
		if (parent.getLayout() instanceof GridLayout) {
			label.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
		}
		composite = new Composite(parent, SWT.BORDER);
		if (parent.getLayout() instanceof GridLayout) {
			GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
			gridData.minimumHeight = 80;
			gridData.heightHint = 80;
			composite.setLayoutData(gridData);
		}
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.horizontalSpacing = gridLayout.verticalSpacing = 0;
		gridLayout.marginWidth = gridLayout.marginHeight = 0;
		composite.setLayout(gridLayout);

		// create ocl editor
		Injector injector = XtextConsolePlugin.getInstance().getInjector(
				EssentialOCLPlugin.LANGUAGE_ID);
		embeddedXtextEditor = new EmbeddedXtextEditor(composite, injector, /*
																			 * SWT.
																			 * BORDER
																			 * |
																			 */
		SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		installTooltip(embeddedXtextEditor.getViewer().getTextWidget());
		installTooltip(label);

		embeddedXtextEditor.getDocument().addModelListener(
				new IXtextModelListener() {
					public void modelChanged(XtextResource resource) {
						modify();
					}
				});
		embeddedXtextEditor.getViewer().getTextWidget()
				.addFocusListener(new FocusAdapter() {

					@Override
					public void focusLost(FocusEvent e) {
						modify();
					}

				});
		updateContext();
		refresh();
	}

	protected void modify() {
		if (embeddedXtextEditor != null) {
			String newValue = embeddedXtextEditor.getDocument().get();
			if (!newValue.equals(value)) {
				setValue(newValue);
			}
		}
	}
	
	@Override
	public void setValue(Object newValue) {
		saving++;
		try {
			super.setValue(newValue);
		} finally {
			saving--;
		}
	}

	@Override
	protected void inputChanged() {
		super.inputChanged();
		updateContext();
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();
		if (value == null) {
			updateText("");
		} else {
			updateText(value.toString());
		}
		refresh();
	}

	protected void updateText(String text) {
		if (text != null
				&& !text.equals(embeddedXtextEditor.getDocument().get())
				&& saving == 0) {
			embeddedXtextEditor.update(text);
		}
	}
	
	private void updateContext() {
		// Find Class object by running up the containment hierarchy and use it as context element
		EObject object = element;
		while (object != null && false == object instanceof de.fujaba.properties.Class) {
			object = object.eContainer();
		}
		if (object != null) {
			de.fujaba.properties.Class clazz = (de.fujaba.properties.Class) object;
			updateContext(clazz.getGenClass().getEcoreClassifier());
		}
	}

	private void updateContext(final EClassifier contextClassifier) {
		final BaseDocument editorDocument = (BaseDocument) embeddedXtextEditor
				.getDocument();
		editorDocument.modify(new IUnitOfWork<Object, XtextResource>() {
			public Value exec(XtextResource resource) throws Exception {
				editorDocument.setContext((EssentialOCLCSResource) resource,
						contextClassifier, null);
				return null;
			}
		});
	}

	@Override
	public void refresh() {
		super.refresh();

	}

	@Override
	public void dispose() {
		modify(); // If dialog was closed before text lost focus
		super.dispose();
	}

	@Override
	protected void doSetVisible(boolean visible) {
		for (Control control : new Control[] { composite }) {
			if (control != null && !control.isDisposed()) {
				control.setVisible(visible);
				if (control.getLayoutData() instanceof GridData) {
					((GridData) control.getLayoutData()).exclude = !visible;
				}
			}
		}
	}
	
	@Override
	public void setFocus() {
		if (embeddedXtextEditor != null) {
			embeddedXtextEditor.getViewer().getTextWidget().setFocus();
		}
	}
}
