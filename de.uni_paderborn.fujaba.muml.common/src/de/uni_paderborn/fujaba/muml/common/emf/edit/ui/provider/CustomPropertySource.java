package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.provider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.ecore.EAttribute;
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
import org.storydriven.modeling.calls.ParameterBinding;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.expressions.ExpressionsPackage;

import de.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.MultiFeatureCreationDialog;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.labelproviders.DefaultMultiLabelProvider;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.labelproviders.IMultiLabelProvider;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.parsers.DefaultMultiTextParser;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.parsers.IMultiTextParser;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.AbstractPropertyEditor;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.ComboPropertyEditor;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.IValidator;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.Property;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.TextPropertyEditor;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.typedelement.DefaultTypedElementParser;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.validator.IdentifierValidator;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint;
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
					if (feature instanceof EReference) {
						EReference reference = (EReference) feature;
						createAllowed = reference.isContainment();
					}

					if (CorePackage.Literals.NATURAL_NUMBER.isSuperTypeOf(eClass)) {
						EDataType eDataType = EcorePackage.Literals.ESTRING;
						return createEDataTypeCellEditor(eDataType, parent);

					} else if (feature.isMany() && createAllowed) {
						if (EcorePackage.Literals.EPARAMETER
								.isSuperTypeOf(eClass)) {
							return createTypedElementCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues(), ",", ", ");
						} else if (ExpressionsPackage.Literals.EXPRESSION.isSuperTypeOf(eClass)) {
							return createTextualExpressionCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues());
						} else if (RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT.isSuperTypeOf(eClass)) {
							return createClockConstraintCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues());
						} else if (CallsPackage.Literals.PARAMETER_BINDING.isSuperTypeOf(eClass)) {
							return createParameterBindingCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues());
						} else if (RealtimestatechartPackage.Literals.ABSOLUTE_DEADLINE.isSuperTypeOf(eClass)) {
							return createAbsoluteDeadlineCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues());
						} else if (RealtimestatechartPackage.Literals.CLOCK.isSuperTypeOf(eClass)) {
							return createClocksCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues());
						} else if (EcorePackage.Literals.EATTRIBUTE.isSuperTypeOf(eClass)) {
							return createTypedElementCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues(), ";", "; ");
						} else if (EcorePackage.Literals.EOPERATION.isSuperTypeOf(eClass)) {
							return createTypedElementCellEditor(parent,
									getLabelProvider(), feature,
									getCurrentValues(), ";", "; ");
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
		protected EStructuralFeature structuralFeature;
		protected List<Property> properties = new ArrayList<Property>();
		protected IMultiTextParser textParser;
		protected IMultiLabelProvider textProvider;
		protected EClass instanceClass;
		protected Collection<?> currentValues;

		private MultiFeatureCreationCellEditor(Composite composite,
				ILabelProvider labelProvider,
				EStructuralFeature structuralFeature,
				Collection<?> currentValues) {
			super(composite, labelProvider);
			this.structuralFeature = structuralFeature;
			this.currentValues = currentValues;
			instanceClass = (EClass) structuralFeature.getEType();
		}

		public void setMultiTextParser(IMultiTextParser textParser) {
			this.textParser = textParser;
		}

		public void setMultiLabelProvider(IMultiLabelProvider textProvider) {
			this.textProvider = textProvider;
		}

		public void addProperty(Property property) {
			properties.add(property);
		}

		public void removeProperty(Property property) {
			properties.remove(property);
		}

		public void setInstanceClass(EClass instanceClass) {
			this.instanceClass = instanceClass;
		}

		@Override
		protected Object openDialogBox(Control cellEditorWindow) {
			// Dialog creation
			MultiFeatureCreationDialog dialog = new MultiFeatureCreationDialog(
					PlatformUI.getWorkbench().getDisplay().getActiveShell(),
					labelProvider, (EObject) object, structuralFeature,
					currentValues, adapterFactory, properties, textParser,
					textProvider, instanceClass);

			// Open the dialog and retrieve the user
			// selection
			int result = dialog.open();
			labelProvider.dispose();
			if (result == Window.OK) {
				return dialog.getResult();
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

	private MultiFeatureCreationCellEditor createTextualExpressionCellEditor(
			Composite parent, ILabelProvider labelProvider,
			EStructuralFeature structuralFeature, Collection<?> currentValues) {

		MultiFeatureCreationCellEditor textualExpressionCellEditor = new MultiFeatureCreationCellEditor(
				parent, labelProvider, structuralFeature, currentValues);

		textualExpressionCellEditor
				.setInstanceClass(ExpressionsPackage.Literals.TEXTUAL_EXPRESSION);

		textualExpressionCellEditor
				.addProperty(createProperty(
						ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__EXPRESSION_TEXT,
						new TextPropertyEditor(adapterFactory, true, true)));

		textualExpressionCellEditor.addProperty(createProperty(
				ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__LANGUAGE,
				new TextPropertyEditor()));

		textualExpressionCellEditor
				.addProperty(createProperty(
						ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__LANGUAGE_VERSION,
						new TextPropertyEditor()));

		return textualExpressionCellEditor;
	}

	private CellEditor createClockConstraintCellEditor(Composite parent,
			ILabelProvider labelProvider, EStructuralFeature structuralFeature,
			Collection<?> currentValues) {

		MultiFeatureCreationCellEditor clockConstraintCellEditor = new MultiFeatureCreationCellEditor(
				parent, labelProvider, structuralFeature, currentValues);

		ComboPropertyEditor clockPropertyEditor = new ComboPropertyEditor(
				adapterFactory);
		clockPropertyEditor.setLabelProvider(labelProvider);

		clockConstraintCellEditor.addProperty(createProperty(
				RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__CLOCK,
				clockPropertyEditor));

		ComboPropertyEditor operatorPropertyEditor = new ComboPropertyEditor(
				adapterFactory);
		operatorPropertyEditor.setLabelProvider(labelProvider);

		clockConstraintCellEditor.addProperty(createProperty(
				RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__OPERATOR,
				operatorPropertyEditor));

		TextPropertyEditor boundPropertyEditor = new TextPropertyEditor();
		clockConstraintCellEditor.addProperty(createProperty(
				RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__BOUND,
				boundPropertyEditor));
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

		parameterBindingCellEditor.addProperty(createProperty(
				CallsPackage.Literals.PARAMETER_BINDING__PARAMETER,
				parameterEditor));

		TextPropertyEditor valueExpressionValueEditor = new TextPropertyEditor();
		parameterBindingCellEditor.addProperty(createProperty(
				ExpressionsPackage.Literals.LITERAL_EXPRESSION__VALUE,
				valueExpressionValueEditor));

		ComboPropertyEditor valueExpressionTypeEditor = new ComboPropertyEditor(
				adapterFactory);
		parameterBindingCellEditor.addProperty(createProperty(
				ExpressionsPackage.Literals.LITERAL_EXPRESSION__VALUE_TYPE,
				valueExpressionTypeEditor));
		valueExpressionTypeEditor.setLabelProvider(labelProvider);

		return parameterBindingCellEditor;
	}

	private CellEditor createAbsoluteDeadlineCellEditor(Composite parent,
			ILabelProvider labelProvider, EStructuralFeature structuralFeature,
			Collection<?> currentValues) {

		MultiFeatureCreationCellEditor absoluteDeadlineCellEditor = new MultiFeatureCreationCellEditor(
				parent, labelProvider, structuralFeature, currentValues);

		ComboPropertyEditor clockTypeEditor = new ComboPropertyEditor(
				adapterFactory);
		absoluteDeadlineCellEditor.addProperty(createProperty(
				RealtimestatechartPackage.Literals.ABSOLUTE_DEADLINE__CLOCK,
				clockTypeEditor));
		clockTypeEditor.setLabelProvider(labelProvider);

		TextPropertyEditor lowerBoundValueEditor = new TextPropertyEditor();
		absoluteDeadlineCellEditor.addProperty(createProperty(
				RealtimestatechartPackage.Literals.DEADLINE__LOWER_BOUND,
				lowerBoundValueEditor));

		TextPropertyEditor upperBoundValueEditor = new TextPropertyEditor();
		absoluteDeadlineCellEditor.addProperty(createProperty(
				RealtimestatechartPackage.Literals.DEADLINE__UPPER_BOUND,
				upperBoundValueEditor));

		return absoluteDeadlineCellEditor;
	}

	private CellEditor createClocksCellEditor(Composite parent,
			ILabelProvider labelProvider, EStructuralFeature structuralFeature,
			Collection<?> currentValues) {

		MultiFeatureCreationCellEditor clocksCellEditor = new MultiFeatureCreationCellEditor(
				parent, labelProvider, structuralFeature, currentValues);
		clocksCellEditor.addProperty(createProperty(
				SDMPackage.Literals.NAMED_ELEMENT__NAME,
				new TextPropertyEditor()));

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

		typedElementCellEditor.setMultiTextParser(multiTextParser);
		typedElementCellEditor.setMultiLabelProvider(multiLabelProvider);
		typedElementCellEditor.addProperty(createProperty(
				EcorePackage.Literals.ENAMED_ELEMENT__NAME, nameEditor));
		typedElementCellEditor.addProperty(createProperty(
				EcorePackage.Literals.ETYPED_ELEMENT__ETYPE, typeEditor));

		TextPropertyEditor upperBoundEditor = new TextPropertyEditor();
		upperBoundEditor.setDefaultValue("1");
		Property upperBoundProperty = createProperty(
				EcorePackage.Literals.ETYPED_ELEMENT__UPPER_BOUND,
				upperBoundEditor);
		upperBoundProperty.setDisplayName("Cardinality");
		typedElementCellEditor.addProperty(upperBoundProperty);

		return typedElementCellEditor;
	}

	private Property createProperty(EStructuralFeature feature,
			AbstractPropertyEditor propertyEditor) {
		Resource resource = ((EObject) object).eResource();
		return new Property(resource, feature, adapterFactory, propertyEditor);
	}

}
