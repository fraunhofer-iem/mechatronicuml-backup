package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class OptionPropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {
	private ILabelProvider labelProvider;
	private FormToolkit toolkit;
	private Composite composite;
	private Label label;
	private Collection<Object> currentChoices = null;
	private Map<Object, Button> buttons = new HashMap<Object, Button>();
	
	public OptionPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		super(adapterFactory, feature);
		//refreshWhenResourceSetChanges = true;
	}

	@Override
	public void doCreateControls(Composite parent,
			FormToolkit toolkit) {

		labelProvider = new AdapterFactoryLabelProvider(adapterFactory);

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
		label = toolkit.createLabel(parent, getLabelText());
		RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
		rowLayout.marginTop = 0;
		rowLayout.marginHeight = 0;
		composite = toolkit.createComposite(parent);
		composite.setLayout(rowLayout);
		updateChoices(input);
		
	}
	
	@Override
	protected void inputChanged(Object oldObject) {
		super.inputChanged(oldObject);
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
			Collection<Object> choices = null;
			if (input != null) {
				choices = getChoices();
			}
			
			// Find out if choices changed
			boolean changed = true;
			if (choices != null && currentChoices != null) {
				Iterator<?> it1 = choices.iterator();
				Iterator<?> it2 = currentChoices.iterator();
				while (it1.hasNext() && it2.hasNext() && it1.next() == it2.next()) {
				}
				changed = it1.hasNext() || it2.hasNext();
			}
			
			if (changed) {
				currentChoices = choices;
				for (Button button : buttons.values()) {
					button.dispose();
				}
				buttons.clear();
				
				if (choices != null) {
					for (final Object choice : choices) {
						String label = labelProvider.getText(choice);
						if (choice == null) {
							label = "null";
						}
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
			}
			
			updateSelection();
		}
	}

	protected void modify(Object newValue) {
		setValue(newValue);
	}

//	private String getLabel(Object choice) {
//		String label = null;
//
//		if (choice instanceof Enumerator) {
//			label = ((Enumerator) choice).getLiteral();
//		}
//		
//		if (label == null) {
//			IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(choice,
//					IItemLabelProvider.class);
//			if (labelProvider != null) {
//				label = labelProvider.getText(choice);
//			}
//		}
//		if (label == null) {
//			label = choice.toString();
//		}
//		return label;
//	}
	
	@Override
	protected void valueChanged() {
		super.valueChanged();
		refresh();
	}
	
	@Override
	public void refresh() {
		super.refresh();
		updateChoices(input);
	}

	protected void updateSelection() {

		Button selectedButton = buttons.get(value);
		
		// Deselect all buttons that were selected
		for (Button button : buttons.values()) {
			if (!button.isDisposed()) {
				button.setSelection(button == selectedButton);
			}
		}
	}

	@Override
	protected Collection<Control> getControls() {
		List<Control> controls = new ArrayList<Control>();
		controls.add(label);
		controls.addAll(buttons.values());
		controls.add(composite);
		return controls;
	}
	
	@Override
	public void setFocus() {
		if (composite != null && !composite.isDisposed()) {
			if (buttons.isEmpty()) {
				composite.setFocus();
			} else {
				buttons.get(0).setFocus();
			}
		}
	}
}
