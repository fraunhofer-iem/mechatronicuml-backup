package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin;

public class FlattenedListPropertyEditor extends AbstractStructuralFeaturePropertyEditor {

	protected CategoryPropertyEditor categoryPropertyEditor;
	protected IPropertyEditor createElementEditor;
	
	protected Map<Object, IPropertyEditor> editors = new HashMap<Object, IPropertyEditor>();

	public FlattenedListPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		super(adapterFactory, feature);
		categoryPropertyEditor = new CategoryPropertyEditor(adapterFactory, SWT.VERTICAL, getTitle(), false, false);
	}
	
	@Override
	public void createControls(Composite parent, FormToolkit toolkit) {
		super.createControls(parent, toolkit);
		categoryPropertyEditor.createControls(parent, toolkit);
	}

	protected String getTitle() {
		return RuntimePlugin.makeHumanReadable(feature.getName(), true);
	}

	@Override
	public void setFocus() {
		categoryPropertyEditor.setFocus();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		categoryPropertyEditor.dispose();
	}

	@Override
	protected Collection<Control> getControls() {
		return categoryPropertyEditor.getControls();
	}
	
	@Override
	protected void inputChanged(Object oldObject) {
		super.inputChanged(oldObject);
		for (IPropertyEditor editor : editors.values()) {
			editor.setInput(element);
		}
		createElementEditor.setInput(element);
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();

		// Remove editors for non-existing values
		categoryPropertyEditor.clearPropertyEditors(true);
		editors.clear();
		createElementEditor = null;

//		for (Object object : new ArrayList<Object>(editors.keySet())) {
//			if (!((Collection<?>) value).contains(object)) {
//				categoryPropertyEditor.removePropertyEditor(editors.get(object));
//				editors.remove(object);
//			}
//		}
		
		
		// Add new editors for new values
		for (Object object : (Collection<?>) value) {
			if (!editors.containsKey(object)) {
				IPropertyEditor editor = new NavigationFeaturePropertyEditor(adapterFactory, feature, false, (EObject) object) {
					protected boolean hasRemoveButton() {
						return true;
					};
					@Override
					protected boolean shouldShowClassesCombo() {
						return false;
					}
				};
				editor.setInput(element);
				categoryPropertyEditor.addPropertyEditor(editor);
				editors.put(object, editor);
			}
		}
		createElementEditor = new CreateElementEditor(adapterFactory);
		createElementEditor.setInput(element);
		categoryPropertyEditor.addPropertyEditor(createElementEditor);
		RuntimePlugin.revalidateLayout(parentComposite);
	}
	
	protected class CreateElementEditor extends AbstractPropertyEditor {
		private Button buttonCreate;
		private EClass selectedClass;
		private Combo combo;

		protected CreateElementEditor(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public void createControls(Composite parent, FormToolkit toolkit) {
			super.createControls(parent, toolkit);
			
			List<EClass> eClasses = RuntimePlugin.getEClasses((EReference) feature);

			selectedClass = null;
			if (!eClasses.isEmpty()) {
				selectedClass = eClasses.get(0);
			}
			
			if (eClasses.size() > 1) {
				combo = new Combo(parent, SWT.BORDER | SWT.READ_ONLY);
				ComboViewer classViewer = new ComboViewer(combo);
				classViewer.setContentProvider(ArrayContentProvider.getInstance());
				classViewer.setLabelProvider(new LabelProvider() {
					public String getText(Object element) {
						return ((EClass) element).getName();
					}
				});
				classViewer.setInput(eClasses);
				if (!eClasses.isEmpty()) {
					classViewer.setSelection(new StructuredSelection(selectedClass));
				}
			}
				

			buttonCreate = new Button(parent, SWT.NONE);
			buttonCreate.setImage(RuntimePlugin.getImage(RuntimePlugin.IMAGE_ADD,
					12, 12));
			String text = RuntimePlugin.makeHumanReadable(feature.getName()).toLowerCase();
			if (feature.isMany()) {
				text = RuntimePlugin.makeSingular(text);
			}
			buttonCreate.setText("New " + text);
			buttonCreate.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					create();
				}
			});

		}

		@Override
		public void dispose() {
			super.dispose();
			for (Control control : getControls()) {
				if (control != null) {
					control.dispose();
				}
			}
		}

		private void create() {
			if (selectedClass != null) {
				Object newValue = EcoreUtil.create(selectedClass);
				if (feature.isMany()) {
					List<Object> newValues = new ArrayList<Object>();
					newValues.addAll((Collection<?>) value);
					newValues.add((EObject) newValue);
					newValue = newValues;
				}
				setValue(newValue);
			}
		}

		@Override
		public void setFocus() {
			buttonCreate.setFocus();
		}

		@Override
		protected Collection<Control> getControls() {
			return Arrays.asList(new Control[] { buttonCreate, combo });
		}
	}


}
