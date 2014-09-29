
package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IFilter;
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
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.IExpansionListener;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin;
import de.uni_paderborn.fujaba.properties.runtime.filter.ICreationFilter;

public class NavigationFeaturePropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {
	protected ObjectPropertyEditor navigatedEditor;
	protected Button buttonCreate;
	protected Button buttonRemove;
	protected ComboViewer classViewer;
	protected EObject manyValue;
	protected boolean createMode = false;
	private boolean initiallyOpen = false;
	private EClass selectedClass = null;
	private List<EClass> eClasses;

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

	public void setCreationFilters(List<ICreationFilter> filters) {
		this.creationFilters.clear();
		this.creationFilters.addAll(filters);
	}

	
	@Override
	public void updateVisibility(boolean relayout, boolean setDefaultValue) {
		super.updateVisibility(relayout, setDefaultValue);
	}
	
	
	@Override
	public void updateVisibility(boolean relayout) {
		super.updateVisibility(relayout);
	}
	
	public NavigationFeaturePropertyEditor(AdapterFactory adapterFactory,
			EStructuralFeature feature, boolean initiallyOpen, EObject currentValue) {
		this(adapterFactory, feature, initiallyOpen);
		Assert.isLegal(feature.isMany());
		manyValue = currentValue;
		createMode = currentValue == null;
	}

	protected ObjectPropertyEditor createNavigatedEditor() {
		ObjectPropertyEditor editor = new ObjectPropertyEditor(null, adapterFactory, "null", initiallyOpen);
		editor.setControllingVisibility(false);
		return editor;
	}

	@Override
	public void createControls(Composite parent, FormToolkit toolkit) {
		super.createControls(parent, toolkit);

		navigatedEditor.createControls(parent, toolkit);

		// Initialize section with buttons
		ExpandableComposite section = navigatedEditor.getSection();

		Composite composite = toolkit.createComposite(section);
		RowLayout layout = new RowLayout(SWT.HORIZONTAL);
		layout.marginLeft = layout.marginRight = layout.marginTop = layout.marginBottom = 0;
		layout.spacing = 5;
		layout.fill = true;
		composite.setLayout(layout);
		
		Combo combo = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		classViewer = new ComboViewer(combo);
		classViewer.setContentProvider(ArrayContentProvider.getInstance());
		classViewer.setLabelProvider(new LabelProvider() {
			public String getText(Object element) {
				return ((EClass) element).getName();
			}
		});
	
		classViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) classViewer
						.getSelection();
				EClass newClass = (EClass) selection.getFirstElement();
				if (newClass != selectedClass) {
					selectedClass = newClass;
					if (isSet()) {
						remove();
						create();
					}
				}
			}
		});

		
		if (hasCreateButton()) {
			buttonCreate = toolkit.createButton(composite, "", SWT.NONE);
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
		}
		
		if (hasRemoveButton()) {
			buttonRemove = toolkit.createButton(composite, "", SWT.NONE);
			buttonRemove.setImage(RuntimePlugin.getImage(
					RuntimePlugin.IMAGE_REMOVE, 12, 12));
			buttonRemove.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					if (!isDisposed()) {
						buttonRemove.removeSelectionListener(this);
					}
					remove();
					if (!isDisposed()) {
						buttonRemove.addSelectionListener(this);
					}
				}
			});
		}

		section.setTextClient(composite);

		section.addExpansionListener(new IExpansionListener() {

			@Override
			public void expansionStateChanging(ExpansionEvent e) {
				if (e.getState() == true) {
					create();
				}
			}

			@Override
			public void expansionStateChanged(ExpansionEvent e) {

			}
		});

		updateEClassesList();

	}
	
	private void updateEClassesList() {

		eClasses = getCreationEClasses();

		selectedClass = null;
		if (!eClasses.isEmpty()) {
			selectedClass = eClasses.get(0);
		}
		if (manyValue != null) {
			EClass eClass = manyValue.eClass();
			if (eClasses.contains(eClass)) {
				selectedClass = eClass;
			} else {
				selectedClass = null;
			}
		}

		if (classViewer != null) {
			classViewer.setInput(eClasses);
			if (!eClasses.isEmpty() && selectedClass != null) {
				classViewer.setSelection(new StructuredSelection(selectedClass));
			} else {
				classViewer.setSelection(new StructuredSelection());
			}
			classViewer.getCombo().setVisible(shouldShowClassesCombo());
		}
	}

	protected boolean shouldShowClassesCombo() {
		return eClasses != null && eClasses.size() > 1;
	}

	protected boolean shouldCreateInitially() {
		return createMode;
	}

	protected boolean hasCreateButton() {
		return !feature.isMany();
	}

	protected boolean hasRemoveButton() {
		return !feature.isMany();
	}

	@Override
	protected void inputChanged(Object oldObject) {
		super.inputChanged(oldObject);
		if (feature.isMany()) {
			navigatedEditor.setInput(manyValue);
		} else {
			navigatedEditor.setInput(value);
		}
		if (input != null && shouldCreateInitially()) {
			create();
		}
		updateTitle();
		updateEClassesList();
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();
		refreshButtons();
		if (feature.isMany()) {
			navigatedEditor.setInput(manyValue);
		} else {
			navigatedEditor.setInput(value);
		}
		updateTitle();
	}

	protected void updateTitle() {
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
			buttonCreate.setEnabled(value == null);
			buttonRemove.setEnabled(value != null);
			//buttonCreate.setSelection(isSet());
			//buttonRemove.setSelection(!isSet());
		}
	}

	public void dispose() {
		buttonCreate = null;
		buttonRemove = null;
		navigatedEditor.dispose();
		super.dispose();
	}

	protected void create() {
		if (!isSet() && selectedClass != null) {
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
			if (!navigatedEditor.isDisposed()) {
				navigatedEditor.getSection().setExpanded(true);
				navigatedEditor.getSection().setExpanded(false);
			}
			RuntimePlugin.revalidateLayout(parentComposite);
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

	@Override
	public void setTooltipMessage(String message) {
		super.setTooltipMessage(message);
		navigatedEditor.setTooltipMessage(message);
	}
	@Override
	public void setFocus() {
		navigatedEditor.setFocus();
	}

	@Override
	protected Collection<Control> getControls() {
		return navigatedEditor.getControls();
	}
	
	@Override
	public void addVisibilityFilter(IFilter filter) {
		super.addVisibilityFilter(filter);
		//navigatedEditor.addVisibilityFilter(filter);
	}
	
	@Override
	public void removeVisibilityFilter(IFilter filter) {
		super.removeVisibilityFilter(filter);
		//navigatedEditor.removeVisibilityFilter(filter);
	}
}
