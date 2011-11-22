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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.storydriven.modeling.calls.CallsPackage;

import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.ObjectCreationDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.ObjectsListDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.PropertySheetDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.TextualDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.labelproviders.IMultiLabelProvider;
import de.uni_paderborn.fujaba.common.emf.edit.ui.parsers.IMultiTextParser;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;

public class CustomPropertySource extends PropertySource {

	private final boolean readOnlyOverride;
	private AdapterFactory adapterFactory;
	private IPropertySourceProvider propertySourceProvider;
	private EditingDomain editingDomain;

	public CustomPropertySource(Object object,
			IItemPropertySource itemPropertySource,
			AdapterFactory adapterFactory,
			EditingDomain editingDomain, IPropertySourceProvider propertySourceProvider) {
		this(object, itemPropertySource, false, propertySourceProvider);
		this.adapterFactory = adapterFactory;
		this.editingDomain = editingDomain;
	}

	public CustomPropertySource(Object object,
			IItemPropertySource itemPropertySource, boolean readOnlyOverride,
			IPropertySourceProvider propertySourceProvider) {
		super(object, itemPropertySource);
		this.readOnlyOverride = readOnlyOverride;
		this.propertySourceProvider = propertySourceProvider;
	}

	protected IPropertyDescriptor createPropertyDescriptor(
			IItemPropertyDescriptor itemPropertyDescriptor) {
		ResourceSet resourceSet = null;
		if (editingDomain != null) {
			resourceSet = editingDomain.getResourceSet();
		}
		IItemPropertyDescriptor delegatingItemPropertyDescriptor = new CustomDelegatingItemPropertyDescriptor(
				itemPropertyDescriptor, resourceSet);

		return new CustomPropertyDescriptor(this.object,
				delegatingItemPropertyDescriptor);
	}

	protected class CustomPropertyDescriptor extends PropertyDescriptor {

		public CustomPropertyDescriptor(Object object,
				IItemPropertyDescriptor itemPropertyDescriptor) {
			super(object, itemPropertyDescriptor);
		}

		public CellEditor createPropertyEditor(Composite parent) {
			if (readOnlyOverride) {
				return null;
			}

			Object f = itemPropertyDescriptor
					.getFeature(itemPropertyDescriptor);

			if (object instanceof EObject && f instanceof EStructuralFeature
					&& ((EStructuralFeature) f).getEType() instanceof EClass) {
				final EStructuralFeature feature = (EStructuralFeature) f;
				EClass eClass = (EClass) feature.getEType();

				// We only allow creating new objects, if the Reference is a
				// containment reference.
				boolean createAllowed = true;
				boolean createForced = false;
				if (feature instanceof EReference) {
					EReference reference = (EReference) feature;
					createAllowed = reference.isContainment();
				}

				if (feature
						.equals(CallsPackage.Literals.CALLABLE__IN_PARAMETER)
						|| feature
								.equals(CallsPackage.Literals.CALLABLE__OUT_PARAMETER)) {
					createForced = true;
				}

				if (feature
						.equals(CallsPackage.Literals.CALLABLE__CONTAINED_PARAMETERS)) {
					createAllowed = false;
				}

				if (CorePackage.Literals.NATURAL_NUMBER.isSuperTypeOf(eClass)) {
					EDataType eDataType = EcorePackage.Literals.ESTRING;
					return createEDataTypeCellEditor(eDataType, parent);

				} else if (feature.isMany() && createAllowed || createForced) {

					return new MultiFeatureCreationCellEditor(parent,
							getLabelProvider(), feature, getCurrentValues());
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

	}

	protected class MultiFeatureCreationCellEditor extends
			ExtendedDialogCellEditor {
		protected IMultiTextParser textParser;
		protected IMultiLabelProvider textProvider;
		protected ExtensibleCreationDialog dialog;
		private ObjectCreationDialogExtension objectCreationDialogExtension;
		private PropertySheetDialogExtension propertySheetDialogExtension;
		private ObjectsListDialogExtension objectsListDialogExtension;

		private MultiFeatureCreationCellEditor(Composite composite,
				ILabelProvider labelProvider,
				EStructuralFeature structuralFeature,
				Collection<?> currentValues) {
			super(composite, labelProvider);

			// Dialog creation
			dialog = new ExtensibleCreationDialog(PlatformUI.getWorkbench()
					.getDisplay().getActiveShell(), labelProvider,
					(EObject) object, structuralFeature, adapterFactory);

			objectCreationDialogExtension = new ObjectCreationDialogExtension(
					dialog, adapterFactory);

			propertySheetDialogExtension = new PropertySheetDialogExtension(
					propertySourceProvider, dialog);

			objectsListDialogExtension = new ObjectsListDialogExtension(dialog,
					adapterFactory, currentValues);
			TextualDialogExtension textualDialogExtension = new TextualDialogExtension(
					dialog, textParser, textProvider);

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

		public void setMultiTextParser(IMultiTextParser textParser) {
			this.textParser = textParser;
		}

		public void setMultiLabelProvider(IMultiLabelProvider textProvider) {
			this.textProvider = textProvider;
		}

		@Override
		protected Object openDialogBox(Control cellEditorWindow) {

			// Open the dialog and retrieve the user
			// selection
			int result = dialog.open();
			labelProvider.dispose();
			if (result == Window.OK) {
				return objectsListDialogExtension.getResult();
			}

			return null;
		}
	}

}
