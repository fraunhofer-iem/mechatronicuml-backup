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
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.IPropertySheetEntry;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetSorter;

import de.uni_paderborn.fujaba.common.descriptor.IDifferentObjectItemPropertyDescriptor;
import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.ObjectCreationDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.ObjectsListDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.PropertySheetDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.SimpleTextualDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.UseParserDialogExtension;
import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.msgtype.MessageType;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Message;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

public class CustomPropertyDescriptor extends PropertyDescriptor {

	private EditingDomain editingDomain;
	private AdapterFactory adapterFactory;
	private IPropertySourceProvider propertySourceProvider;

	public CustomPropertyDescriptor(Object object,
			IItemPropertyDescriptor itemPropertyDescriptor,
			AdapterFactory adapterFactory, EditingDomain editingDomain,
			IPropertySourceProvider propertySourceProvider) {
		super(object, itemPropertyDescriptor);
		this.adapterFactory = adapterFactory;
		this.propertySourceProvider = propertySourceProvider;
		this.editingDomain = editingDomain;
	}

	@Override
	public CellEditor createPropertyEditor(Composite parent) {

		Object f = itemPropertyDescriptor.getFeature(itemPropertyDescriptor);

		if (object instanceof EObject && f instanceof EStructuralFeature
				&& ((EStructuralFeature) f).getEType() instanceof EClass) {

			final EStructuralFeature feature = (EStructuralFeature) f;
			EClass eClass = (EClass) feature.getEType();

			// Natural numbers should be entered like Strings
			if (ValuetypePackage.Literals.NATURAL_NUMBER.isSuperTypeOf(eClass)) {
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
						.equals(feature)
						|| BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS.equals(feature)
						|| BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION.equals(feature)) {
					return new ActionCreationCellEditor(parent, feature);
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

				} else {
					return new CreationCellEditor(parent, feature);
	
				}
			}
		}
		return super.createPropertyEditor(parent);
	}

	@SuppressWarnings("unchecked")
	private Collection<?> getCurrentValues() {
		Object value = itemPropertyDescriptor.getPropertyValue(object);
		Collection<Object> currentValues;
		if (value instanceof ItemPropertyDescriptor.PropertyValueWrapper) {
			value = ((ItemPropertyDescriptor.PropertyValueWrapper) value)
					.getEditableValue(value);
		}
		if (value instanceof Collection) {
			currentValues = (Collection<Object>) value;
		} else {
			currentValues = new ArrayList<Object>();
			if (value != null) {
				currentValues.add(value);
			}
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

			// Dialog creation
			dialog = new ExtensibleCreationDialog(PlatformUI.getWorkbench()
					.getDisplay().getActiveShell(), labelProvider,
					(EObject) object, feature, adapterFactory);
			addExtensions();
		}

		@Override
		protected Object openDialogBox(Control cellEditorWindow) {

			// Open the dialog and retrieve the user selection
			ChangeCommand changeCommand = new ChangeCommand((EObject) object) {

				@Override
				protected void doExecute() {
					dialog.open();
				}
				
			};
			editingDomain.getCommandStack().execute(changeCommand);
			labelProvider.dispose();

			if (dialog.getReturnCode() != Window.OK) {			
				editingDomain.getCommandStack().undo();
				return null;
			}
			return getResult();
		}

		protected abstract void addExtensions();

		protected abstract Object getResult();

	}

	public class ActionCreationCellEditor extends CreationCellEditor {
		private Collection<?> oldValues;
		private SimpleTextualDialogExtension textDialog;
		private UseParserDialogExtension useParserDialogExtension;

		public ActionCreationCellEditor(Composite composite, EStructuralFeature feature) {
			super(composite, feature);
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
						dialog.getContainerObject());
				if (initialString == null) {
					initialString = "// warning: existing expressions will be replaced!";
				}
			}

			SimpleTextualDialogExtension.ITextParser parser = new SimpleTextualDialogExtension.ITextParser() {
				@Override
				public Object parse(String text) {
					return LanguageResource.loadFromString(text,
							dialog.getContainerObject()).getEObject();
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
			if (feature.isMany()) {
				List<Object> list = new BasicEList<Object>();
				list.add(model);
				return list;
			}
			return model;
		}

	}

	public class CreationCellEditor extends
			AbstractCreationCellEditor {
		protected ObjectsListDialogExtension objectsListDialogExtension;

		public CreationCellEditor(Composite composite,
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
		private final class ParameterBindingPropertySheetDialogExtension extends
				PropertySheetDialogExtension {
			private ParameterBindingPropertySheetDialogExtension(
					IPropertySourceProvider propertySourceProvider,
					ExtensibleCreationDialog creationDialog) {
				super(propertySourceProvider, creationDialog);
			}

			@Override
			public void createMainArea(Composite parent) {
				super.createMainArea(parent);
				StatusLineManager statusLineManager = new StatusLineManager();
				statusLineManager.createControl(parent);
				statusLineManager.getControl().setLayoutData(
						new GridData(SWT.FILL, SWT.FILL, true, false));
				// the MenuManager and ToolBarManager are just "dummies"
				page.makeContributions(new MenuManager(), new ToolBarManager(),
						statusLineManager);
			}

			@Override
			public void close() {
				super.close();

				// Prevent NullPointerException; if the object is null, we do
				// not need to set anything
				if (parameterBindingsObject != null) {
					@SuppressWarnings("unchecked")
					Collection<ParameterBinding> parameterBindings = (Collection<ParameterBinding>) parameterBindingsObject
							.eGet(feature);
					Collection<ParameterBinding> filteredParameterBindings = new ArrayList<ParameterBinding>();

					// Filter ParameterBindings (remove those that have no valid
					// Parameter associated) and sort them so that the order of
					// ParameterBindings
					// is only depending on the order of Parameters and not on
					// the order in which they were created.
					Collection<Parameter> allParameters = ParameterBindingCreationCellEditor.this
							.getParameters(parameterBindingsObject);

					for (Parameter parameter : allParameters) {
						for (ParameterBinding parameterBinding : parameterBindings) {
							if (parameter == parameterBinding.getParameter()
									&& !filteredParameterBindings
											.contains(parameterBinding)) {
								filteredParameterBindings.add(parameterBinding);
							}
						}
					}

					Command setCommand = SetCommand.create(editingDomain,
							parameterBindingsObject, feature,
							filteredParameterBindings);
					editingDomain.getCommandStack().execute(setCommand);
				}
			}

			class UnsortedPropertySheetPage extends PropertySheetPage {
				class MyPropertySheetSorter extends PropertySheetSorter {

					@Override
					public void sort(IPropertySheetEntry[] entries) {
						// do nothing
					}
				}

				public UnsortedPropertySheetPage() {
					setSorter(new MyPropertySheetSorter());
				}

				@Override
				protected void setSorter(PropertySheetSorter sorter) {
					if (!(sorter instanceof MyPropertySheetSorter)) {
						sorter = new MyPropertySheetSorter();
					}
					super.setSorter(sorter);
				}

			}

			@Override
			protected PropertySheetPage createPropertySheetPage() {
				return new UnsortedPropertySheetPage();
			}
		}

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

			propertySheetDialogExtension = new ParameterBindingPropertySheetDialogExtension(
					provider, dialog);

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
			// Prevent NullPointerException
			if (parameterBindingsObject == null) {
				return null;
			}
			return parameterBindingsObject.eGet(feature);
		}

		@Override
		public EStructuralFeature getParameterBindingFeature() {
			return feature;
		}

	}
}
