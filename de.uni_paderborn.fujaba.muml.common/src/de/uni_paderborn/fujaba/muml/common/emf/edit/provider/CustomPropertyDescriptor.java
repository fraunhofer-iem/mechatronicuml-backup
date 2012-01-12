package de.uni_paderborn.fujaba.muml.common.emf.edit.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellEditorListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.Invocation;
import org.storydriven.modeling.calls.ParameterBinding;

import de.uni_paderborn.fujaba.common.descriptor.IDifferentObjectItemPropertyDescriptor;
import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;
import de.uni_paderborn.fujaba.common.emf.edit.ui.IRefreshProhibitedPropertySection;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.ObjectCreationDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.ObjectsListDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.PropertySheetDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.SimpleTextualDialogExtension;
import de.uni_paderborn.fujaba.muml.ActionLanguageResource;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;

public class CustomPropertyDescriptor extends PropertyDescriptor {

	private EditingDomain editingDomain;
	private AdapterFactory adapterFactory;
	private IPropertySourceProvider propertySourceProvider;
	private IRefreshProhibitedPropertySection mainPropertySection;

	public CustomPropertyDescriptor(Object object,
			IItemPropertyDescriptor itemPropertyDescriptor,
			AdapterFactory adapterFactory, EditingDomain editingDomain,
			IPropertySourceProvider propertySourceProvider,
			IRefreshProhibitedPropertySection mainPropertySection) {
		super(object, itemPropertyDescriptor);
		this.adapterFactory = adapterFactory;
		this.propertySourceProvider = propertySourceProvider;
		this.editingDomain = editingDomain;
		this.mainPropertySection = mainPropertySection;
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

			// #1 Rule: Only show creation dialog, if we have a containment
			// reference.
			boolean create = false;
			if (feature instanceof EReference) {
				EReference reference = (EReference) feature;
				if (reference.isContainment()) {
					create = true;
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

			// If the creation dialog should be shown, check which one.
			if (create) {
				// Which creation dialog should be shown?
				if (CallsPackage.Literals.INVOCATION__OWNED_PARAMETER_BINDINGS
						.equals(feature)) {
					return new InvocationParameterBindingCreationCellEditor(
							parent, feature);
				} else if (feature.isMany()) {
					return new MultiFeatureCreationCellEditor(parent, feature);
				} else {
					// Don't show a creation dialog
				}
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
			addListener(new ICellEditorListener() {
				public void applyEditorValue() {
					// We must call refresh, after it is allowed again (part of
					// the fix of the Widget-Disposed bug).
					mainPropertySection.refresh();
				}

				public void cancelEditor() {
				}

				public void editorValueChanged(boolean oldValidState,
						boolean newValidState) {
				}
			});

			// Dialog creation
			dialog = new ExtensibleCreationDialog(PlatformUI.getWorkbench()
					.getDisplay().getActiveShell(), labelProvider,
					(EObject) object, feature, adapterFactory,
					mainPropertySection);
			addExtensions();
		}

		@Override
		protected Object openDialogBox(Control cellEditorWindow) {

			// Open the dialog and retrieve the user selection
			int result = dialog.open();
			labelProvider.dispose();

			// Currently Cancel is disabled:
			// if (result == Window.OK) {
			// return getResult();
			// }
			//
			// return null;
			return getResult();
		}

		protected abstract void addExtensions();

		protected abstract Object getResult();

	}
	
	public class ActionCellEditor extends AbstractCreationCellEditor {
		private Collection<?> oldValues;
		private SimpleTextualDialogExtension textDialog;

		public ActionCellEditor(Composite composite, EStructuralFeature feature) {
			super(composite, feature);
		}
		
		private List<EAttribute> getAllAvailableAttributes() {
			EObject containerObject = dialog.getContainerObject();
			if (containerObject instanceof StateEvent) {
				return ((RealtimeStatechart) containerObject.eContainer().eContainer()).getAllAvailableAttributes();
			} else if (containerObject instanceof Transition) {
				return ((Transition) containerObject).getStatechart().getAllAvailableAttributes();
			}
			return null;
		}

		private void addParserExtension() {
			// store old values because if OK is pressed the old property value
			// is always overridden (see ExtensibleCreationDialog) with an empty collection
			oldValues = getCurrentValues();
			String initialString = "";
			if (!oldValues.isEmpty()) {
				EObject eobject = (EObject) oldValues.iterator().next();
				initialString = ActionLanguageResource.serializeEObject(eobject, getAllAvailableAttributes());
			}
			System.out.println(oldValues);
			textDialog = new SimpleTextualDialogExtension(dialog, initialString);
			this.dialog.addExtension(textDialog);			
		}
		
		@Override
		protected void addExtensions() {
			addParserExtension();
		}

		@Override
		protected Object getResult() {
			// TODO Auto-generated method stub
			EObject model = ActionLanguageResource.loadFromString(textDialog.getResult(), getAllAvailableAttributes());
			if (model == null) {
				return oldValues;
			}
			List<Object> list = new BasicEList<Object>();
			list.add(model);
			return list;
		}
		
	}

	public class MultiFeatureCreationCellEditor extends
			AbstractCreationCellEditor {
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

			objectCreationDialogExtension
					.setObjectsListDialogExtension(objectsListDialogExtension);

			objectsListDialogExtension
					.setPropertySheetDialogExtension(propertySheetDialogExtension);

			dialog.addExtension(objectCreationDialogExtension);
			dialog.addExtension(objectsListDialogExtension);
			dialog.addExtension(propertySheetDialogExtension);
		}

		@Override
		protected Object getResult() {
			return objectsListDialogExtension.getResult();
		}
	}

	public class InvocationParameterBindingCreationCellEditor extends
			AbstractCreationCellEditor {
		private Invocation invocation;

		private PropertySheetDialogExtension propertySheetDialogExtension;

		public InvocationParameterBindingCreationCellEditor(
				Composite composite, EStructuralFeature feature) {
			super(composite, feature);
		}

		@Override
		protected void addExtensions() {

			IPropertySourceProvider provider;
			provider = new InvocationParameterBindingPropertySourceProvider(
					editingDomain);

			propertySheetDialogExtension = new PropertySheetDialogExtension(
					provider, dialog) {

				@Override
				public void okPressed() {
					super.okPressed();
					// Filter ParameterBindings:
					// Only return those ParameterBindings that have an
					// Parameter
					List<ParameterBinding> allBindings = (List<ParameterBinding>) invocation
							.getOwnedParameterBindings();
					List<ParameterBinding> filteredBindings = new ArrayList<ParameterBinding>();

					if (invocation.getCallee() != null) {
						List<EParameter> parameters = invocation.getCallee()
								.getContainedParameters();

						for (ParameterBinding binding : allBindings) {
							if (parameters.contains(binding.getParameter())) {
								filteredBindings.add(binding);
							}
						}
					}

					editingDomain
							.getCommandStack()
							.execute(
									SetCommand
											.create(editingDomain,
													invocation,
													CallsPackage.Literals.INVOCATION__OWNED_PARAMETER_BINDINGS,
													filteredBindings));
				}

			};
			Object actualObject = object;
			if (itemPropertyDescriptor instanceof IDifferentObjectItemPropertyDescriptor) {
				actualObject = ((IDifferentObjectItemPropertyDescriptor) itemPropertyDescriptor)
						.getActualObject(object);
			}

			invocation = (Invocation) actualObject;

			propertySheetDialogExtension
					.setInitialObject((EObject) actualObject);
			dialog.addExtension(propertySheetDialogExtension);
		}

		@Override
		protected Object getResult() {
			return invocation.getOwnedParameterBindings();
		}
	}
}
