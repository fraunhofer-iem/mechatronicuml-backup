
package de.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.IExpansionListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import de.fujaba.properties.runtime.RuntimePlugin;

public class NavigationFeaturePropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {
	protected ObjectPropertyEditor navigatedEditor;
	protected Button buttonCreate;
	protected Button buttonRemove;
	protected ComboViewer classViewer;
	private EObject manyValue;
	private boolean createMode = false;
	private boolean initiallyOpen = false;

	public NavigationFeaturePropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature, boolean initiallyOpen) {
		super(adapterFactory, feature);
		this.initiallyOpen = initiallyOpen;
		this.navigatedEditor = createNavigatedEditor();
		createMode = feature.isMany();
	}
	
	public NavigationFeaturePropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature) {
		this(adapterFactory, feature, false);
	}


	public NavigationFeaturePropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature, boolean initiallyOpen, EObject currentValue) {
		this(adapterFactory, feature, initiallyOpen);
		Assert.isLegal(feature.isMany());
		manyValue = currentValue;
		createMode = currentValue == null;
	}

	protected ObjectPropertyEditor createNavigatedEditor() {
		return new ObjectPropertyEditor(adapterFactory, "null", initiallyOpen);
	}

	@Override
	public void createControls(Composite parent, FormToolkit toolkit) {
		navigatedEditor.createControls(parent, toolkit);

		// Initialize section with buttons
		Section section = navigatedEditor.getSection();

		Composite composite = toolkit.createComposite(section);
		RowLayout layout = new RowLayout(SWT.HORIZONTAL);
		layout.marginLeft = layout.marginRight = layout.marginTop = layout.marginBottom = 0;
		layout.spacing = 5;
		layout.fill = true;
		composite.setLayout(layout);

		Combo combo = new Combo(composite, SWT.BORDER);
		classViewer = new ComboViewer(combo);
		classViewer.setContentProvider(ArrayContentProvider.getInstance());
		classViewer.setLabelProvider(new LabelProvider() {
			public String getText(Object element) {
				return ((EClass) element).getName();
			}
		});
		List<EClass> eClasses = RuntimePlugin.getEClasses((EReference) feature);
		classViewer.setInput(eClasses);
		if (!eClasses.isEmpty()) {
			classViewer.setSelection(new StructuredSelection(eClasses.get(0)));
		}
		if (eClasses.size() == 1) {
			combo.setEnabled(false);
		}

		buttonCreate = toolkit.createButton(composite, "", SWT.TOGGLE);
		buttonCreate.setImage(RuntimePlugin.getImage(RuntimePlugin.IMAGE_ADD,
				12, 12));
		buttonCreate.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				buttonCreate.removeSelectionListener(this);
				create();
				RuntimePlugin.revalidateLayout(navigatedEditor.getSection()
						.getClient());// no idea why this is necessary
				buttonCreate.addSelectionListener(this);
			}

		});

		buttonRemove = toolkit.createButton(composite, "", SWT.TOGGLE);
		buttonRemove.setImage(RuntimePlugin.getImage(
				RuntimePlugin.IMAGE_REMOVE, 12, 12));
		buttonRemove.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				buttonRemove.removeSelectionListener(this);
				remove();
				buttonRemove.addSelectionListener(this);
			}
		});

		section.setTextClient(composite);

		section.addExpansionListener(new IExpansionListener() {

			@Override
			public void expansionStateChanging(ExpansionEvent e) {

			}

			@Override
			public void expansionStateChanged(ExpansionEvent e) {
				if (e.getState() == true) {
					create();
				}
			}
		});

		// section.setSeparatorControl(toolkit.createSeparator(section,
		// SWT.NONE));

	}

	@Override
	protected void inputChanged() {
		super.inputChanged();
		if (feature.isMany()) {
			navigatedEditor.setInput(manyValue);
		} else {
			navigatedEditor.setInput(value);
		}
		updateTitle();
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();
		refresh();
		if (feature.isMany()) {
			navigatedEditor.setInput(manyValue);
		} else {
			navigatedEditor.setInput(value);
		}
		updateTitle();
	}

	private void updateTitle() {
		navigatedEditor.setTitle(getFeatureDescription());
	}
	
	public String getFeatureDescription() {
		if (createMode) {
			String featureName = RuntimePlugin.makeHumanReadable(feature.getName()).toLowerCase();
			if (feature.isMany()) {
				featureName = RuntimePlugin.makeSingular(featureName);
			}
			return "New " + featureName;
		}
		return super.getFeatureDescription();
	}


	public void refresh() {
		super.refresh();
		navigatedEditor.refresh();
		refreshButtons();
	}

	private void refreshButtons() {
		if (buttonCreate != null && buttonRemove != null) {
			// buttonCreate.setEnabled(value == null);
			// buttonRemove.setEnabled(value != null);
			buttonCreate.setSelection(isSet());
			buttonRemove.setSelection(!isSet());
		}
	}

	public void dispose() {
		buttonCreate = null;
		buttonRemove = null;
		navigatedEditor.dispose();
		super.dispose();
	}

	protected void create() {
		if (!isSet()) {
			IStructuredSelection selection = (IStructuredSelection) classViewer
					.getSelection();
			EClass eClass = (EClass) selection.getFirstElement();
			Object newValue = EcoreUtil.create(eClass);
			if (feature.isMany()) {
				manyValue = (EObject) newValue;
				List<Object> newValues = new ArrayList<Object>();
				newValues.addAll((Collection<?>) value);
				newValues.add(manyValue);
				newValue = newValues;
			}
			setValue(newValue);
			refreshButtons();
			navigatedEditor.getSection().setExpanded(false);
			navigatedEditor.getSection().setExpanded(true);
		}
	}

	protected void remove() {
		if (isSet()) {
			Object newValue = null;
			if (feature.isMany()) {
				List<Object> newValues = new ArrayList<Object>();
				newValues.addAll((Collection<?>) value);
				newValues.remove(manyValue);
				newValue = newValues;
				manyValue = null;
			}
			setValue(newValue);
			refreshButtons();
			navigatedEditor.getSection().setExpanded(true);
			navigatedEditor.getSection().setExpanded(false);
		}
	}

	protected boolean isSet() {
		if (feature.isMany()) {
			return manyValue != null;
		} else {
			return value != null;
		}
	}
}
