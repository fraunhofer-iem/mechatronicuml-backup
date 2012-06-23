package de.uni_paderborn.fujaba.muml.common.emf.edit.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
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

import de.uni_paderborn.fujaba.common.descriptor.IDifferentObjectItemPropertyDescriptor;
import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;
import de.uni_paderborn.fujaba.common.emf.edit.ui.IRefreshProhibitedPropertySection;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.ObjectCreationDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.ObjectsListDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.PropertySheetDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.SimpleTextualDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.UseParserDialogExtension;
import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.common.emf.edit.provider.ParameterBindingPropertySourceProvider.IParameterBindingElement;
import de.uni_paderborn.fujaba.muml.model.core.Attribute;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.Parameter;
import de.uni_paderborn.fujaba.muml.model.core.ParameterBinding;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Message;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel;
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

	@Override
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
			// if (CallsPackage.Literals.CALLABLE__IN_PARAMETER.equals(feature)
			// || CallsPackage.Literals.CALLABLE__OUT_PARAMETER
			// .equals(feature)) {
			// create = true;
			// } else if (CallsPackage.Literals.CALLABLE__CONTAINED_PARAMETERS
			// .equals(feature)) {
			// create = false;
			// }

			// If the creation dialog should be shown, check which one.
			if (create) {
				// Which creation dialog should be shown?
				if (RealtimestatechartPackage.Literals.ACTION__EXPRESSIONS
						.equals(feature)) {
					return new ActionCellEditor(parent, feature);
				} else if (RealtimestatechartPackage.Literals.SYNCHRONIZATION__PARAMETER_BINDING
						.equals(feature)) {
					return new ParameterBindingCreationCellEditor(parent,
							feature) {
						@Override
						public Collection<Parameter> getParameters(
								EObject object) {
							Synchronization synchronization = (Synchronization) object;
							if (synchronization != null
									&& synchronization.getSyncChannel() != null) {
								SynchronizationChannel syncChannel = synchronization
										.getSyncChannel();
								return syncChannel.getParameters();
							}
							return Collections.emptyList();
						}
					};
				} else if (RealtimestatechartPackage.Literals.MESSAGE__PARAMETER_BINDING
						.equals(feature)) {
					return new ParameterBindingCreationCellEditor(parent,
							feature) {
						@Override
						public Collection<Parameter> getParameters(
								EObject object) {
							Message message = (Message) object;
							if (message != null
									&& message.getInstanceOf() != null) {
								MessageType messageType = message
										.getInstanceOf();
								return messageType.getParameters();
							}
							return Collections.emptyList();
						}
					};

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
		protected EStructuralFeature feature;

		public AbstractCreationCellEditor(Composite composite,
				EStructuralFeature feature) {
			super(composite, getLabelProvider());
			this.feature = feature;
			addListener(new ICellEditorListener() {
				@Override
				public void applyEditorValue() {
					// We must call refresh, after it is allowed again (part of
					// the fix of the Widget-Disposed bug).
					if (mainPropertySection != null) {
						mainPropertySection.refresh();
					}
				}

				@Override
				public void cancelEditor() {
				}

				@Override
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

	public class ActionCellEditor extends MultiFeatureCreationCellEditor {
		private Collection<?> oldValues;
		private SimpleTextualDialogExtension textDialog;
		private UseParserDialogExtension useParserDialogExtension;

		public ActionCellEditor(Composite composite, EStructuralFeature feature) {
			super(composite, feature);
		}

		private List<Attribute> getAllAvailableAttributes() {
			EObject containerObject = dialog.getContainerObject();
			if (containerObject instanceof StateEvent) {
				return ((RealtimeStatechart) containerObject.eContainer()
						.eContainer()).getAllAvailableAttributes();
			} else if (containerObject instanceof Transition) {
				return ((Transition) containerObject).getStatechart()
						.getAllAvailableAttributes();
			}
			return null;
		}

		@Override
		protected void addExtensions() {
			// store old values because if OK is pressed the old property value
			// is always overridden (see ExtensibleCreationDialog) with an empty
			// collection
			oldValues = EcoreUtil.copyAll(getCurrentValues());
			String initialString = "";
			if (!oldValues.isEmpty()) {
				EObject eobject = (EObject) oldValues.iterator().next();
				initialString = LanguageResource.serializeEObject(eobject,
						getAllAvailableAttributes());
				if (initialString == null) {
					initialString = "// warning: existing expressions will be replaced!";
				}
			}

			SimpleTextualDialogExtension.ITextParser parser = new SimpleTextualDialogExtension.ITextParser() {
				@Override
				public Object parse(String text) {
					return LanguageResource.loadFromString(text,
							getAllAvailableAttributes());
				}
			};
			textDialog = new SimpleTextualDialogExtension(dialog,
					initialString, parser);

			useParserDialogExtension = new UseParserDialogExtension(dialog);
			dialog.addExtension(useParserDialogExtension,
					ExtensibleCreationDialog.EXTENSION_GROUP_ALWAYS_VISIBLE);
			super.addExtensions();
			// add the objectsListDialogExtension object after it's created
			useParserDialogExtension
					.setObjectsListDialogExtension(objectsListDialogExtension);
			useParserDialogExtension.setTextualDialogExtension(textDialog);
			dialog.addExtension(textDialog,
					ExtensibleCreationDialog.EXTENSION_GROUP_XTEXT_PARSER);
		}

		@Override
		protected Object getResult() {
			Object model = useParserDialogExtension.getResult();
			if (model == null) {
				return oldValues;
			} else if (model instanceof Collection) {
				return model;
			}
			List<Object> list = new BasicEList<Object>();
			list.add(model);
			return list;
		}

	}

	public class MultiFeatureCreationCellEditor extends
			AbstractCreationCellEditor {
		protected ObjectsListDialogExtension objectsListDialogExtension;

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

			dialog.addExtension(objectCreationDialogExtension,
					ExtensibleCreationDialog.EXTENSION_GROUP_DEFAULT);
			dialog.addExtension(objectsListDialogExtension,
					ExtensibleCreationDialog.EXTENSION_GROUP_DEFAULT);
			dialog.addExtension(propertySheetDialogExtension,
					ExtensibleCreationDialog.EXTENSION_GROUP_DEFAULT);
		}

		@Override
		protected Object getResult() {
			return objectsListDialogExtension.getResult();
		}
	}

	public abstract class ParameterBindingCreationCellEditor extends
			AbstractCreationCellEditor implements
			ParameterBindingPropertySourceProvider.IParameterBindingElement {
		private EObject parameterBindingsObject;
		private PropertySheetDialogExtension propertySheetDialogExtension;

		public ParameterBindingCreationCellEditor(Composite composite,
				EStructuralFeature parameterBindingsFeature) {
			super(composite, parameterBindingsFeature);
		}

		@Override
		protected void addExtensions() {

			IPropertySourceProvider provider;
			provider = new ParameterBindingPropertySourceProvider(
					editingDomain, this);

			propertySheetDialogExtension = new PropertySheetDialogExtension(
					provider, dialog) {

				@Override
				public void okPressed() {
					super.okPressed();

					@SuppressWarnings("unchecked")
					Collection<ParameterBinding> parameterBindings = (Collection<ParameterBinding>) parameterBindingsObject
							.eGet(feature);
					Collection<ParameterBinding> filteredParameterBindings = new ArrayList<ParameterBinding>();

					// Filter ParameterBindings (remove those that have no valid
					// Parameter associated).
					Collection<Parameter> allParameters = ParameterBindingCreationCellEditor.this
							.getParameters(parameterBindingsObject);
					Collection<Parameter> usedParameters = new ArrayList<Parameter>();

					for (ParameterBinding parameterBinding : parameterBindings) {
						Parameter parameter = parameterBinding.getParameter();
						if (parameter != null
								&& allParameters.contains(parameter)
								&& !usedParameters.contains(parameter)) {
							usedParameters.add(parameter);
							filteredParameterBindings.add(parameterBinding);
						}
					}

					Command setCommand = SetCommand.create(editingDomain,
							parameterBindingsObject, feature,
							filteredParameterBindings);
					editingDomain.getCommandStack().execute(setCommand);
				}

			};
			Object actualObject = object;
			if (itemPropertyDescriptor instanceof IDifferentObjectItemPropertyDescriptor) {
				actualObject = ((IDifferentObjectItemPropertyDescriptor) itemPropertyDescriptor)
						.getActualObject(object);
			}
			parameterBindingsObject = (EObject) actualObject;

			propertySheetDialogExtension
					.setInitialObject(parameterBindingsObject);
			dialog.addExtension(propertySheetDialogExtension,
					ExtensibleCreationDialog.EXTENSION_GROUP_DEFAULT);
		}

		@Override
		protected Object getResult() {
			return parameterBindingsObject.eGet(feature);
		}

		@Override
		public EStructuralFeature getParameterBindingFeature() {
			return feature;
		}
	}
}
