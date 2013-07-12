package de.fujaba.properties.runtime.editors;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class OptionPropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {

	private FormToolkit toolkit;
	private Composite composite;
	private Map<Object, Button> buttons = new HashMap<Object, Button>();
	
	public OptionPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		super(adapterFactory, feature);
	}

	@Override
	public void createControls(Composite parent,
			FormToolkit toolkit) {
		this.toolkit = toolkit;
		if (parent.getLayout() instanceof RowLayout) {
			Composite container = new Composite(parent, SWT.NONE);
			GridLayout layout = new GridLayout(2, false);
			layout.marginTop = layout.marginBottom = 0;
			layout.verticalSpacing = 0;
			layout.marginHeight = 0;
			container.setLayout(layout);
			parent = container;
		}
		toolkit.createLabel(parent, getLabelText());
		RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
		rowLayout.marginTop = 0;
		rowLayout.marginHeight = 0;
		composite = toolkit.createComposite(parent);
		composite.setLayout(rowLayout);
		updateChoices(input);
	}
	
	@Override
	protected void inputChanged() {
		super.inputChanged();
		updateChoices(input);
	}
	
	@Override
	public void dispose() {
		super.dispose();
		// remove all buttons
		updateChoices(null);
	}
	
	public void updateChoices(Object input) {
		if (composite != null) {
			for (Button button : buttons.values()) {
				button.dispose();

			}
			buttons.clear();
			
			if (input != null) {
				Collection<?> choices = getChoices(input);
				for (final Object choice : choices) {
					String label = getLabel(choice);
					Button button = toolkit.createButton(composite, label, SWT.RADIO);
					button.addSelectionListener(new SelectionAdapter() {
						@Override
						public void widgetSelected(SelectionEvent e) {
							modify(choice);
							super.widgetSelected(e);
						}

					});
					buttons.put(choice, button);
				}
			}
			refresh();
		}
	}

	// TODO: Pull up to AbstractStructuralFeaturePropertyEditor; make protected
	private Collection<?> getChoices(Object input) {
		Collection<?> choices = null;
		if (feature.getEType() == EcorePackage.Literals.EBOOLEAN) {
			return Arrays.asList(new Boolean[] { true, false });
		}
		if (choices == null && itemPropertyDescriptor != null) {
			choices = itemPropertyDescriptor.getChoiceOfValues(input);
		}
		if (choices == null) {
			choices = Collections.emptyList();
		}
		return choices;
	}

	protected void modify(Object newValue) {
		setValue(newValue);
	}

	private String getLabel(Object choice) {
		String label = null;

		if (choice instanceof Enumerator) {
			label = ((Enumerator) choice).getLiteral();
		}
		
		if (label == null) {
			IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(choice,
					IItemLabelProvider.class);
			if (labelProvider != null) {
				label = labelProvider.getText(choice);
			}
		}
		if (label == null) {
			label = choice.toString();
		}
		return label;
	}
	
	@Override
	protected void valueChanged() {
		super.valueChanged();
		refresh();
	}
	
	@Override
	public void refresh() {
		super.refresh();

		Button selectedButton = buttons.get(value);
		if (selectedButton == null) {
			// Deselect all buttons that were selected
			for (Button button : buttons.values()) {
				if (!button.isDisposed() && button.getSelection()) {
					button.setSelection(false);
				}
			}
		} else if (!selectedButton.isDisposed() && !selectedButton.getSelection()) {
			// Select the right button, if it was unselected
			selectedButton.setSelection(true);
		}
	}
}
