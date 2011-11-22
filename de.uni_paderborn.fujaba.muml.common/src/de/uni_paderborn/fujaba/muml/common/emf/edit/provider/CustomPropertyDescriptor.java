package de.uni_paderborn.fujaba.muml.common.emf.edit.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.storydriven.modeling.calls.CallsPackage;

import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.ObjectCreationDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.ObjectsListDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.PropertySheetDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.TextualDialogExtension;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;

public class CustomPropertyDescriptor extends PropertyDescriptor {

	private AdapterFactory adapterFactory;
	private IPropertySourceProvider propertySourceProvider;

	public CustomPropertyDescriptor(Object object,
			IItemPropertyDescriptor itemPropertyDescriptor,
			AdapterFactory adapterFactory,
			IPropertySourceProvider propertySourceProvider) {
		super(object, itemPropertyDescriptor);
		this.adapterFactory = adapterFactory;
		this.propertySourceProvider = propertySourceProvider;
	}

	public CellEditor createPropertyEditor(Composite parent) {

		Object f = itemPropertyDescriptor.getFeature(itemPropertyDescriptor);

		if (object instanceof EObject && f instanceof EStructuralFeature
				&& ((EStructuralFeature) f).getEType() instanceof EClass) {

			final EStructuralFeature feature = (EStructuralFeature) f;
			EClass eClass = (EClass) feature.getEType();

			// Natural numbers should be entered like Strings
			if (CorePackage.Literals.NATURAL_NUMBER.isSuperTypeOf(eClass)) {
				EDataType eDataType = EcorePackage.Literals.ESTRING;
				return createEDataTypeCellEditor(eDataType, parent);

			}

			// #1 Rule: Only show creation dialog, if the feature is many and
			// containment.
			boolean create = feature.isMany();
			if (feature instanceof EReference) {
				EReference reference = (EReference) feature;
				if (!reference.isContainment()) {
					create = false;
				}
			}

			// Some properties override this rule:
			if (CallsPackage.Literals.CALLABLE__IN_PARAMETER.equals(feature)
					|| CallsPackage.Literals.CALLABLE__OUT_PARAMETER
							.equals(feature)) {
				create = true;
			} else if (CallsPackage.Literals.CALLABLE__CONTAINED_PARAMETERS
					.equals(feature)) {
				create = false;
			}

			if (create) {
//				// Which creation dialog?
//				if (CallsPackage.Literals.INVOCATION__OWNED_PARAMETER_BINDINGS
//						.equals(feature)) {
//					return new InvocationParameterBindingCreationCellEditor(parent, feature);
//				} else {
					return new MultiFeatureCreationCellEditor(parent, feature);
//				}
			}
		}
		return super.createPropertyEditor(parent);
	}

	private Collection<?> getCurrentValues() {
		Object value = itemPropertyDescriptor.getPropertyValue(object);
		Collection<?> currentValues;
		if (value instanceof ItemPropertyDescriptor.PropertyValueWrapper) {
			value = ((ItemPropertyDescriptor.PropertyValueWrapper) value)
					.getEditableValue(value);
		}
		if (value instanceof Collection) {
			currentValues = (Collection<?>) value;
		} else {
			currentValues = new ArrayList<Object>();
		}
		return currentValues;
	}

	public abstract class AbstractCreationCellEditor extends
			ExtendedDialogCellEditor {
		protected ExtensibleCreationDialog dialog;

		public AbstractCreationCellEditor(Composite composite,
				EStructuralFeature feature) {
			super(composite, getLabelProvider());

			// Dialog creation
			dialog = new ExtensibleCreationDialog(PlatformUI.getWorkbench()
					.getDisplay().getActiveShell(), labelProvider,
					(EObject) object, feature, adapterFactory);
			addExtensions();
		}

		@Override
		protected Object openDialogBox(Control cellEditorWindow) {

			// Open the dialog and retrieve the user selection
			int result = dialog.open();
			labelProvider.dispose();
			if (result == Window.OK) {
				return getResult();
			}

			return null;
		}

		protected abstract void addExtensions();
		
		protected abstract Object getResult();

	}
	
	public class MultiFeatureCreationCellEditor extends AbstractCreationCellEditor {
		private ObjectsListDialogExtension objectsListDialogExtension;

		public MultiFeatureCreationCellEditor(Composite composite,
				EStructuralFeature feature) {
			super(composite, feature);
		}

		@Override
		protected void addExtensions() {

			ObjectCreationDialogExtension objectCreationDialogExtension = new ObjectCreationDialogExtension(
					dialog, adapterFactory);

			PropertySheetDialogExtension propertySheetDialogExtension = new PropertySheetDialogExtension(
					propertySourceProvider, dialog);

			objectsListDialogExtension = new ObjectsListDialogExtension(dialog,
					adapterFactory, getCurrentValues());
			TextualDialogExtension textualDialogExtension = new TextualDialogExtension(
					dialog, null, null);

			objectCreationDialogExtension
					.setObjectsListDialogExtension(objectsListDialogExtension);

			objectCreationDialogExtension
					.setTextualDialogExtension(textualDialogExtension);

			objectsListDialogExtension
					.setPropertySheetDialogExtension(propertySheetDialogExtension);
			objectsListDialogExtension
					.setTextualDialogExtension(textualDialogExtension);
			textualDialogExtension
					.setObjectsListDialogExtension(objectsListDialogExtension);

			dialog.addExtension(objectCreationDialogExtension);
			dialog.addExtension(objectsListDialogExtension);
			dialog.addExtension(propertySheetDialogExtension);
			dialog.addExtension(textualDialogExtension);
		}

		@Override
		protected Object getResult() {
			return objectsListDialogExtension.getResult();
		}
	}
	
	public class InvocationParameterBindingCreationCellEditor extends AbstractCreationCellEditor {

		public InvocationParameterBindingCreationCellEditor(
				Composite composite, EStructuralFeature feature) {
			super(composite, feature);
		}

		@Override
		protected void addExtensions() {
			// TODO Auto-generated method stub
			
		}

		@Override
		protected Object getResult() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
