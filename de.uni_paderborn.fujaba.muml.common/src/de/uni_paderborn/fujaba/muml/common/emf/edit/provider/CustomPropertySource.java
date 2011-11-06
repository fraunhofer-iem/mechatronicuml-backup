package de.uni_paderborn.fujaba.muml.common.emf.edit.provider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.expressions.ExpressionsPackage;

import de.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.ObjectsListCreationDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.PropertiesListCreationDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.TextualCreationDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.TypeSelectionDialogExtension;
import de.uni_paderborn.fujaba.common.emf.edit.ui.labelproviders.DefaultMultiLabelProvider;
import de.uni_paderborn.fujaba.common.emf.edit.ui.labelproviders.IMultiLabelProvider;
import de.uni_paderborn.fujaba.common.emf.edit.ui.parsers.DefaultMultiTextParser;
import de.uni_paderborn.fujaba.common.emf.edit.ui.parsers.IMultiTextParser;
import de.uni_paderborn.fujaba.common.emf.edit.ui.property.AbstractPropertyEditor;
import de.uni_paderborn.fujaba.common.emf.edit.ui.property.ComboPropertyEditor;
import de.uni_paderborn.fujaba.common.emf.edit.ui.property.Property;
import de.uni_paderborn.fujaba.common.emf.edit.ui.property.TextPropertyEditor;
import de.uni_paderborn.fujaba.common.emf.edit.ui.typedelement.DefaultTypedElementParser;
import de.uni_paderborn.fujaba.common.emf.edit.ui.validator.IValidator;
import de.uni_paderborn.fujaba.common.emf.edit.ui.validator.IdentifierValidator;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;

public class CustomPropertySource extends PropertySource {

	private final boolean readOnlyOverride;
	private AdapterFactory adapterFactory;

	public CustomPropertySource(Object object,
			IItemPropertySource itemPropertySource,
			AdapterFactory itemProvidersAdapterFactory) {
		this(object, itemPropertySource, false);
		this.adapterFactory = itemProvidersAdapterFactory;
	}

	public CustomPropertySource(Object object,
			IItemPropertySource itemPropertySource, boolean readOnlyOverride) {
		super(object, itemPropertySource);
		this.readOnlyOverride = readOnlyOverride;
	}

	protected IPropertyDescriptor createPropertyDescriptor(
			IItemPropertyDescriptor itemPropertyDescriptor) {

		return new PropertyDescriptor(this.object, itemPropertyDescriptor) {

			public CellEditor createPropertyEditor(Composite parent) {
				if (readOnlyOverride) {
					return null;
				}

				Object f = itemPropertyDescriptor
						.getFeature(itemPropertyDescriptor);

				if (object instanceof EObject
						&& f instanceof EStructuralFeature
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

					if (CorePackage.Literals.NATURAL_NUMBER
							.isSuperTypeOf(eClass)) {
						EDataType eDataType = EcorePackage.Literals.ESTRING;
						return createEDataTypeCellEditor(eDataType, parent);

					} else if (feature.isMany() && createAllowed
							|| createForced) {

						// TODO: Use PropertyDescriptors to find out properties.

						if (EcorePackage.Literals.EPARAMETER
								.isSuperTypeOf(eClass)) {
							return createTypedElementCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues(), ",", ", ");
						} else if (ExpressionsPackage.Literals.EXPRESSION
								.isSuperTypeOf(eClass)) {
							return createExpressionCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues());
						} else if (RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT
								.isSuperTypeOf(eClass)) {
							return createClockConstraintCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues());
						} else if (CallsPackage.Literals.PARAMETER_BINDING
								.isSuperTypeOf(eClass)) {
							return createParameterBindingCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues());
						} else if (RealtimestatechartPackage.Literals.ABSOLUTE_DEADLINE
								.isSuperTypeOf(eClass)) {
							return createAbsoluteDeadlineCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues());
						} else if (RealtimestatechartPackage.Literals.CLOCK
								.isSuperTypeOf(eClass)) {
							return createClocksCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues());
						} else if (EcorePackage.Literals.EATTRIBUTE
								.isSuperTypeOf(eClass)) {
							return createAttributeCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues());
						} else if (EcorePackage.Literals.EOPERATION
								.isSuperTypeOf(eClass)) {
							return createOperationCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues());
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

		};
	}

	protected class MultiFeatureCreationCellEditor extends
			ExtendedDialogCellEditor {
		protected IMultiTextParser textParser;
		protected IMultiLabelProvider textProvider;
		protected ExtensibleCreationDialog dialog;
		private TypeSelectionDialogExtension typeSelectionDialogExtension;
		private PropertiesListCreationDialogExtension propertiesDialogExtension;
		private ObjectsListCreationDialogExtension objectsListCreationDialogExtension;

		private MultiFeatureCreationCellEditor(Composite composite,
				ILabelProvider labelProvider,
				EStructuralFeature structuralFeature,
				Collection<?> currentValues) {
			super(composite, labelProvider);

			// Dialog creation
			dialog = new ExtensibleCreationDialog(PlatformUI.getWorkbench()
					.getDisplay().getActiveShell(), labelProvider,
					(EObject) object, structuralFeature, adapterFactory);

			typeSelectionDialogExtension = new TypeSelectionDialogExtension(
					dialog, adapterFactory);

			propertiesDialogExtension = new PropertiesListCreationDialogExtension(
					dialog);

			objectsListCreationDialogExtension = new ObjectsListCreationDialogExtension(
					dialog, adapterFactory, currentValues);
			TextualCreationDialogExtension textualCreationDialogExtension = new TextualCreationDialogExtension(
					dialog, textParser, textProvider);

			typeSelectionDialogExtension
					.setPropertiesListCreationDialogExtension(propertiesDialogExtension);

			propertiesDialogExtension
					.setObjectsListCreationDialogExtension(objectsListCreationDialogExtension);
			propertiesDialogExtension
					.setTextualCreationDialogExtension(textualCreationDialogExtension);
			objectsListCreationDialogExtension
					.setPropertiesListCreationDialogExtension(propertiesDialogExtension);
			objectsListCreationDialogExtension
					.setTextualCreationDialogExtension(textualCreationDialogExtension);
			textualCreationDialogExtension
					.setObjectsListCreationDialogExtension(objectsListCreationDialogExtension);

			dialog.addExtension(typeSelectionDialogExtension);
			dialog.addExtension(propertiesDialogExtension);
			dialog.addExtension(objectsListCreationDialogExtension);
			dialog.addExtension(textualCreationDialogExtension);

		}

		public void setMultiTextParser(IMultiTextParser textParser) {
			this.textParser = textParser;
		}

		public void setMultiLabelProvider(IMultiLabelProvider textProvider) {
			this.textProvider = textProvider;
		}

		public void addProperties(EClass instanceClass,
				Collection<Property> properties) {
			propertiesDialogExtension.addProperties(instanceClass, properties);
		}

		public void setInstanceClass(EClass instanceClass) {
			propertiesDialogExtension.setInstanceClass(instanceClass);
		}

		@Override
		protected Object openDialogBox(Control cellEditorWindow) {

			// Open the dialog and retrieve the user
			// selection
			int result = dialog.open();
			labelProvider.dispose();
			if (result == Window.OK) {
				return objectsListCreationDialogExtension.getResult();
			}

			return null;
		}
	}

	private RootNode getRootNodeElement() {
		List<EObject> contents = ((EObject) object).eResource().getContents();
		if (!contents.isEmpty() && contents.get(0) instanceof RootNode) {
			return (RootNode) contents.get(0);
		}
		return null;
	}

	private MultiFeatureCreationCellEditor createExpressionCellEditor(
			Composite parent, ILabelProvider labelProvider,
			EStructuralFeature structuralFeature, Collection<?> currentValues) {

		MultiFeatureCreationCellEditor expressionCellEditor = new MultiFeatureCreationCellEditor(
				parent, labelProvider, structuralFeature, currentValues);

		expressionCellEditor
				.setInstanceClass(ExpressionsPackage.Literals.TEXTUAL_EXPRESSION);

		// Add Properties for TextualExpression
		List<Property> textualExpressionProperties = new ArrayList<Property>();
		textualExpressionProperties
				.add(createProperty(
						ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__EXPRESSION_TEXT,
						new TextPropertyEditor(adapterFactory, true, true)));

		textualExpressionProperties.add(createProperty(
				SDMPackage.Literals.COMMENTABLE_ELEMENT__COMMENT,
				new TextPropertyEditor(adapterFactory, true, true)));
		textualExpressionProperties.add(createProperty(
				ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__LANGUAGE,
				new TextPropertyEditor()));

		textualExpressionProperties
				.add(createProperty(
						ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__LANGUAGE_VERSION,
						new TextPropertyEditor()));

		expressionCellEditor.addProperties(
				ExpressionsPackage.Literals.TEXTUAL_EXPRESSION,
				textualExpressionProperties);

		// Add Properties for ActivityCallExpression:
		List<Property> methodCallExpressionProperties = new ArrayList<Property>();

		ComboPropertyEditor opaqueCallablePropertyEditor = new ComboPropertyEditor(
				adapterFactory);
		opaqueCallablePropertyEditor.setLabelProvider(labelProvider);

		methodCallExpressionProperties
				.add(createProperty(
						org.storydriven.modeling.calls.expressions.ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE,
						opaqueCallablePropertyEditor));
		
		expressionCellEditor.addProperties(org.storydriven.modeling.calls.expressions.ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION, methodCallExpressionProperties);

		return expressionCellEditor;
	}

	private CellEditor createClockConstraintCellEditor(Composite parent,
			ILabelProvider labelProvider, EStructuralFeature structuralFeature,
			Collection<?> currentValues) {

		MultiFeatureCreationCellEditor clockConstraintCellEditor = new MultiFeatureCreationCellEditor(
				parent, labelProvider, structuralFeature, currentValues);

		ComboPropertyEditor clockPropertyEditor = new ComboPropertyEditor(
				adapterFactory);
		clockPropertyEditor.setLabelProvider(labelProvider);

		Collection<Property> properties = new ArrayList<Property>();
		properties.add(createProperty(
				RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__CLOCK,
				clockPropertyEditor));

		ComboPropertyEditor operatorPropertyEditor = new ComboPropertyEditor(
				adapterFactory);
		operatorPropertyEditor.setLabelProvider(labelProvider);

		properties.add(createProperty(
				RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__OPERATOR,
				operatorPropertyEditor));

		TextPropertyEditor boundPropertyEditor = new TextPropertyEditor();
		properties.add(createProperty(
				RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__BOUND,
				boundPropertyEditor));

		clockConstraintCellEditor
				.addProperties(
						RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT,
						properties);

		return clockConstraintCellEditor;
	}

	private CellEditor createParameterBindingCellEditor(Composite parent,
			ILabelProvider labelProvider, EStructuralFeature structuralFeature,
			Collection<?> currentValues) {

		MultiFeatureCreationCellEditor parameterBindingCellEditor = new MultiFeatureCreationCellEditor(
				parent, labelProvider, structuralFeature, currentValues);

		ComboPropertyEditor parameterEditor = new ComboPropertyEditor(
				adapterFactory);
		parameterEditor.setLabelProvider(labelProvider);

		Collection<Property> properties = new ArrayList<Property>();

		properties.add(createProperty(
				CallsPackage.Literals.PARAMETER_BINDING__PARAMETER,
				parameterEditor));

		TextPropertyEditor valueExpressionValueEditor = new TextPropertyEditor();
		properties.add(createProperty(
				ExpressionsPackage.Literals.LITERAL_EXPRESSION__VALUE,
				valueExpressionValueEditor));

		ComboPropertyEditor valueExpressionTypeEditor = new ComboPropertyEditor(
				adapterFactory);
		properties.add(createProperty(
				ExpressionsPackage.Literals.LITERAL_EXPRESSION__VALUE_TYPE,
				valueExpressionTypeEditor));
		valueExpressionTypeEditor.setLabelProvider(labelProvider);

		parameterBindingCellEditor.addProperties(
				CallsPackage.Literals.PARAMETER_BINDING, properties);

		return parameterBindingCellEditor;
	}

	private CellEditor createAbsoluteDeadlineCellEditor(Composite parent,
			ILabelProvider labelProvider, EStructuralFeature structuralFeature,
			Collection<?> currentValues) {

		MultiFeatureCreationCellEditor absoluteDeadlineCellEditor = new MultiFeatureCreationCellEditor(
				parent, labelProvider, structuralFeature, currentValues);

		Collection<Property> properties = new ArrayList<Property>();

		ComboPropertyEditor clockTypeEditor = new ComboPropertyEditor(
				adapterFactory);
		properties.add(createProperty(
				RealtimestatechartPackage.Literals.ABSOLUTE_DEADLINE__CLOCK,
				clockTypeEditor));
		clockTypeEditor.setLabelProvider(labelProvider);

		TextPropertyEditor lowerBoundValueEditor = new TextPropertyEditor();
		properties.add(createProperty(
				RealtimestatechartPackage.Literals.DEADLINE__LOWER_BOUND,
				lowerBoundValueEditor));

		TextPropertyEditor upperBoundValueEditor = new TextPropertyEditor();
		properties.add(createProperty(
				RealtimestatechartPackage.Literals.DEADLINE__UPPER_BOUND,
				upperBoundValueEditor));

		absoluteDeadlineCellEditor.addProperties(
				RealtimestatechartPackage.Literals.ABSOLUTE_DEADLINE,
				properties);

		return absoluteDeadlineCellEditor;
	}

	private CellEditor createClocksCellEditor(Composite parent,
			ILabelProvider labelProvider, EStructuralFeature structuralFeature,
			Collection<?> currentValues) {

		MultiFeatureCreationCellEditor clocksCellEditor = new MultiFeatureCreationCellEditor(
				parent, labelProvider, structuralFeature, currentValues);

		Collection<Property> properties = new ArrayList<Property>();

		properties.add(createProperty(SDMPackage.Literals.NAMED_ELEMENT__NAME,
				new TextPropertyEditor()));

		clocksCellEditor.addProperties(
				RealtimestatechartPackage.Literals.CLOCK, properties);

		return clocksCellEditor;
	}

	private MultiFeatureCreationCellEditor createTypedElementCellEditor(
			Composite parent, ILabelProvider labelProvider,
			EStructuralFeature structuralFeature, Collection<?> currentValues,
			String parserSplitElement, String labelProviderSplitElement) {

		MultiFeatureCreationCellEditor typedElementCellEditor = new MultiFeatureCreationCellEditor(
				parent, labelProvider, structuralFeature, currentValues);

		List<EClassifier> choices = null;

		RootNode rootNode = getRootNodeElement();
		if (rootNode != null) {
			List<EDataType> ecoreDataTypes = rootNode.getEcoreDataTypes();

			EDataType[] array = ecoreDataTypes.toArray(new EDataType[] {});
			choices = Arrays.asList((EClassifier[]) array);
		}

		IValidator identifierValidator = new IdentifierValidator();

		DefaultMultiTextParser multiTextParser = new DefaultMultiTextParser(
				parserSplitElement, new DefaultTypedElementParser(choices,
						identifierValidator,
						(EClass) structuralFeature.getEType()));

		IMultiLabelProvider multiLabelProvider = new DefaultMultiLabelProvider(
				labelProviderSplitElement, labelProvider);

		TextPropertyEditor nameEditor = new TextPropertyEditor();
		nameEditor.setDefaultValue(structuralFeature.getEType().getName());
		nameEditor.addValidator(identifierValidator);

		ComboPropertyEditor typeEditor = new ComboPropertyEditor(adapterFactory);
		typeEditor.setLabelProvider(labelProvider);
		typeEditor.setChoices(choices);

		Collection<Property> properties = new ArrayList<Property>();

		typedElementCellEditor.setMultiTextParser(multiTextParser);
		typedElementCellEditor.setMultiLabelProvider(multiLabelProvider);
		properties.add(createProperty(
				EcorePackage.Literals.ENAMED_ELEMENT__NAME, nameEditor));
		properties.add(createProperty(
				EcorePackage.Literals.ETYPED_ELEMENT__ETYPE, typeEditor));

		TextPropertyEditor upperBoundEditor = new TextPropertyEditor();
		upperBoundEditor.setDefaultValue("1");
		Property upperBoundProperty = createProperty(
				EcorePackage.Literals.ETYPED_ELEMENT__UPPER_BOUND,
				upperBoundEditor);
		upperBoundProperty.setDisplayName("Cardinality");
		properties.add(upperBoundProperty);

		typedElementCellEditor.addProperties(
				EcorePackage.Literals.ETYPED_ELEMENT, properties);

		return typedElementCellEditor;
	}

	protected CellEditor createOperationCellEditor(Composite parent,
			ILabelProvider labelProvider, EStructuralFeature feature,
			Collection<?> currentValues) {
		MultiFeatureCreationCellEditor cellEditor = createTypedElementCellEditor(
				parent, labelProvider, feature, currentValues, ";", "; ");
		// Property inParameters= createProperty(
		// EcorePackage.Literals.EOPERATION__EPARAMETERS,
		// upperBoundEditor);
		// upperBoundProperty.setDisplayName("Cardinality");
		// cellEditor.addPriority();
		return cellEditor;
	}

	protected CellEditor createAttributeCellEditor(Composite parent,
			ILabelProvider labelProvider, EStructuralFeature feature,
			Collection<?> currentValues) {
		return createTypedElementCellEditor(parent, labelProvider, feature,
				currentValues, ";", "; ");
	}

	private Property createProperty(EStructuralFeature feature,
			AbstractPropertyEditor propertyEditor) {
		Resource resource = ((EObject) object).eResource();
		return new Property(resource, feature, adapterFactory, propertyEditor);
	}

}
