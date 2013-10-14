
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
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
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
	private EClass selectedClass = null;

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
		return new ObjectPropertyEditor(null, adapterFactory, "null", initiallyOpen);
	}

	@Override
	public void createControls(Composite parent, FormToolkit toolkit) {
		super.createControls(parent, toolkit);

		navigatedEditor.createControls(parent, toolkit);

		// Initialize section with buttons
		Section section = navigatedEditor.getSection();

		Composite composite = toolkit.createComposite(section);
		RowLayout layout = new RowLayout(SWT.HORIZONTAL);
		layout.marginLeft = layout.marginRight = layout.marginTop = layout.marginBottom = 0;
		layout.spacing = 5;
		layout.fill = true;
		composite.setLayout(layout);

		List<EClass> eClasses = RuntimePlugin.getEClasses((EReference) feature);
		
		if (eClasses.size() > 1) {
			Combo combo = new Combo(section, SWT.BORDER);
			classViewer = new ComboViewer(combo);
			classViewer.setContentProvider(ArrayContentProvider.getInstance());
			classViewer.setLabelProvider(new LabelProvider() {
				public String getText(Object element) {
					return ((EClass) element).getName();
				}
			});
			section.setDescriptionControl(combo);
		
			classViewer.addSelectionChangedListener(new ISelectionChangedListener() {
				
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					IStructuredSelection selection = (IStructuredSelection) classViewer
							.getSelection();
					selectedClass = (EClass) selection.getFirstElement();
					if (isSet()) {
						remove();
						create();
					}
				}
			});
			classViewer.setInput(eClasses);
			if (!eClasses.isEmpty()) {
				classViewer.setSelection(new StructuredSelection(eClasses.get(0)));
			}
		}
		selectedClass = eClasses.get(0);
		if (!feature.isMany()) {
			buttonCreate = toolkit.createButton(composite, "", SWT.TOGGLE);
			buttonCreate.setImage(RuntimePlugin.getImage(RuntimePlugin.IMAGE_ADD,
					12, 12));
			buttonCreate.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					buttonCreate.removeSelectionListener(this);
					create();
					layout();
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
		}

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
		if (createMode) {
			create();
		}
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
			Object newValue = EcoreUtil.create(selectedClass);
			if (feature.isMany()) {
				manyValue = (EObject) newValue;
				List<Object> newValues = new ArrayList<Object>();
				newValues.addAll((Collection<?>) value);
				newValues.add(manyValue);
				newValue = newValues;
			}
			navigatedEditor.getSection().setExpanded(false);
			navigatedEditor.getSection().setExpanded(true);
			setValue(newValue);
			refreshButtons();
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

	@Override
	protected void doSetVisible(boolean visible) {
		navigatedEditor.setVisible(visible);
	}
}
