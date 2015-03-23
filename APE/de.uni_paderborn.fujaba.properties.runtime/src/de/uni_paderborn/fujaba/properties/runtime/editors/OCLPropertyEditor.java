package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.xtext.console.XtextConsolePlugin;
import org.eclipse.ocl.examples.xtext.console.xtfo.EmbeddedXtextEditor;
import org.eclipse.ocl.examples.xtext.essentialocl.ui.model.BaseDocument;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCSResource;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin;

public class OCLPropertyEditor extends AbstractStructuralFeaturePropertyEditor {
	private final int MINIMUM_HEIGHT = 100; 

	private Composite composite;
	private EmbeddedXtextEditor embeddedXtextEditor;
	protected int saving = 0;
	protected Label label;

	public OCLPropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	@Override
	public void createControls(Composite parent, FormToolkit toolkit) {
		super.createControls(parent, toolkit);
		label = toolkit.createLabel(parent, getLabelText());
		if (parent.getLayout() instanceof GridLayout) {
			label.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
		}
		composite = new Composite(parent, SWT.BORDER);
		
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
		final StyledText textWidget = embeddedXtextEditor.getViewer().getTextWidget();
		textWidget.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				textModified();
			}
			
		});
		
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
		textModified();
	}

	protected void textModified() {
		final StyledText textWidget = embeddedXtextEditor.getViewer().getTextWidget();
		int height = textWidget.computeSize(SWT.DEFAULT, SWT.DEFAULT).y + 40;
		GridData gridData = null;
		if (composite.getParent().getLayout() instanceof GridLayout) {
			gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
			gridData.minimumWidth = 200;
			gridData.minimumHeight = MINIMUM_HEIGHT;
			composite.setLayoutData(gridData);
		}
		if (gridData != null) {
			gridData.minimumHeight = Math.max(MINIMUM_HEIGHT, height);
			RuntimePlugin.revalidateLayout(composite);
		}
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
	protected void inputChanged(Object oldObject) {
		super.inputChanged(oldObject);
		updateContext();
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();
		updateText();
		refresh();
	}

	protected void updateText() {
		if (value == null) {
			updateText("");
		} else {
			updateText(value.toString());
		}
	}

	protected void updateText(String text) {
		if (text != null
				&& !text.equals(embeddedXtextEditor.getDocument().get())
				&& saving == 0) {
			embeddedXtextEditor.update(text);
			textModified();
		}
	}
	
	protected void updateContext() {
		if (element != null) {
			updateContext(element.eClass());
		}
	}

	protected void updateContext(final EClassifier contextClassifier) {
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
	protected Collection<Control> getControls() {
		List<Control> controls = new ArrayList<Control>();
		if (embeddedXtextEditor != null) {
			controls.add(embeddedXtextEditor.getViewer().getTextWidget());
		}
		controls.add(label);
		controls.add(composite);
		return controls;
	}
	
	@Override
	public void setFocus() {
		if (embeddedXtextEditor != null) {
			embeddedXtextEditor.getViewer().getTextWidget().setFocus();
		}
	}
}
