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
	private EmbeddedXtextEditor embeddedXtextEditor;
	protected int saving = 0;

	public OCLPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	@Override
	public void createControls(Composite parent, FormToolkit toolkit) {
		Label label = toolkit.createLabel(parent, getLabelText());
		if (parent.getLayout() instanceof GridLayout) {
			label.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
		}
		Composite composite = new Composite(parent, SWT.BORDER);
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
		refreshSelection(element);
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
		refreshSelection(element);
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();
		updateText(value.toString());
		refresh();
	}

	protected void updateText(String text) {
		if (text != null
				&& !text.equals(embeddedXtextEditor.getDocument().get())
				&& saving == 0) {
			embeddedXtextEditor.update(text);
		}
	}

	private void refreshSelection(final Object selected) {
		final BaseDocument editorDocument = (BaseDocument) embeddedXtextEditor
				.getDocument();
		editorDocument.modify(new IUnitOfWork<Object, XtextResource>() {
			public Value exec(XtextResource resource) throws Exception {
				EObject contextObject = null;
				EClassifier contextClassifier = null;
				Object selectedObject = selected;
				if (selectedObject instanceof IOutlineNode) {
					if (selectedObject instanceof EObjectNode) {
						EObjectNode selectedObjectNode = (EObjectNode) selectedObject;
						contextObject = null;
						contextClassifier = selectedObjectNode.getEClass();
					} else if (selectedObject instanceof EStructuralFeatureNode) {
						contextObject = null;
						contextClassifier = ((EStructuralFeatureNode) selectedObject)
								.getEStructuralFeature().getEContainingClass();
					} else {
						contextObject = null;
						contextClassifier = null;
					}
				} else {
					if (selectedObject instanceof IAdaptable) {
						selectedObject = ((IAdaptable) selectedObject)
								.getAdapter(EObject.class);
					}
					if (selectedObject instanceof EObject) {
						contextObject = (EObject) selectedObject;
						contextClassifier = contextObject.eClass();
					} else {
						contextObject = null;
						contextClassifier = null;
					}
				}
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
}
