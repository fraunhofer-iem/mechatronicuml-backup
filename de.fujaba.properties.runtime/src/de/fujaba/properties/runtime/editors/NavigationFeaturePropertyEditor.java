package de.fujaba.properties.runtime.editors;

import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.IExpansionListener;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.fujaba.properties.runtime.RuntimePlugin;

public class NavigationFeaturePropertyEditor extends
		AbstractStructuralFeaturePropertyEditor {
	protected ObjectPropertyEditor navigatedEditor;
	protected Button buttonCreate;
	protected Button buttonRemove;
	protected ComboViewer classViewer;

	public NavigationFeaturePropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		super(adapterFactory, feature);
		Assert.isLegal(!feature.isMany(),
				"Only features with upperBound = 1 are allowed as navigation feature.");
		this.navigatedEditor = createNavigatedEditor();
	}

	protected ObjectPropertyEditor createNavigatedEditor() {
		return new ObjectPropertyEditor(adapterFactory, "null", false);
	}

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetWidgetFactory toolkit) {
		navigatedEditor.createControls(parent, toolkit);

		// Initialize section with buttons
		Section section = navigatedEditor.getSection();

		Composite composite = toolkit.createComposite(section);
		RowLayout layout = new RowLayout(SWT.HORIZONTAL);
		layout.marginLeft = layout.marginRight = layout.marginTop = layout.marginBottom = 0;
		layout.spacing = 5;
		layout.fill = true;
		composite.setLayout(layout);

		CCombo combo = toolkit.createCCombo(composite);
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
		navigatedEditor.setInput(value);
		updateTitle();
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();
		refresh();
		navigatedEditor.setInput(value);
		updateTitle();
	}

	private void updateTitle() {
		navigatedEditor.setTitle(getFeatureDescription());
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
			buttonCreate.setSelection(value != null);
			buttonRemove.setSelection(value == null);
		}
	}

	public void dispose() {
		buttonCreate = null;
		buttonRemove = null;
		navigatedEditor.dispose();
		super.dispose();
	}

	protected void create() {
		if (value == null) {
			IStructuredSelection selection = (IStructuredSelection) classViewer
					.getSelection();
			EClass eClass = (EClass) selection.getFirstElement();
			Object newValue = EcoreUtil.create(eClass);
			setValue(newValue);
			refreshButtons();
			navigatedEditor.getSection().setExpanded(false);
			navigatedEditor.getSection().setExpanded(true);
		}
	}

	protected void remove() {
		if (value != null) {
			setValue(null);
			refreshButtons();
			navigatedEditor.getSection().setExpanded(true);
			navigatedEditor.getSection().setExpanded(false);
		}
	}
}
