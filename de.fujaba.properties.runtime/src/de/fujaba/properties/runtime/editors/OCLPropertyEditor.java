package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.xtext.console.XtextConsolePlugin;
import org.eclipse.ocl.examples.xtext.console.xtfo.EmbeddedXtextEditor;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.google.inject.Injector;

public class OCLPropertyEditor extends AbstractStructuralFeaturePropertyEditor {
	protected String currentValue = "";
	private EmbeddedXtextEditor embeddedXtextEditor;

	public OCLPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	@Override
	public void createControls(Composite parent,
			FormToolkit toolkit) {
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
		Injector injector = XtextConsolePlugin.getInstance().getInjector(EssentialOCLPlugin.LANGUAGE_ID);
		embeddedXtextEditor = new EmbeddedXtextEditor(composite, injector, /*SWT.BORDER |*/ SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);

		refresh();
	}

	protected void modify() {
		// Do not read from text field, as it could have been disposed, see comment in dispose()
		//String newValue = text.getText();
		String newValue = currentValue; 
		if (!newValue.equals(value)) {
			setValue(newValue);
		}
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();
		refresh();
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



