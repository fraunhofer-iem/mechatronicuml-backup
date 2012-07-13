package de.uni_paderborn.fujaba.muml.common.emf.edit.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.common.CommonExpressionsFactory;
import org.storydriven.core.expressions.common.LiteralExpression;

import de.uni_paderborn.fujaba.common.descriptor.AbstractItemPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.common.ILoadResult;
import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.model.core.Attribute;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.Parameter;
import de.uni_paderborn.fujaba.muml.model.core.ParameterBinding;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;

public class ParameterBindingPropertySourceProvider implements
		IPropertySourceProvider {
	
	static class ParameterBindingCellEditor extends TextCellEditor {
		
		/**
		 * Convenience class to transform expression <-> String.
		 * Inspired by EDataTypeValueHandler.
		 *
		 */
		static class ValueWrapper implements ICellEditorValidator {
			
			private EObject container;
			
			public ValueWrapper(EObject object) {
				container = object;
			}
			
			public static List<Attribute> getAttributeList(EObject object) {
				EObject container = object.eContainer().eContainer();
				if (container instanceof Transition) {
					return ((Transition) container).getStatechart().getAllAvailableAttributes();	
				} else if (container instanceof RealtimeStatechart) {
					return ((RealtimeStatechart) container).getAllAvailableAttributes();
				}
				// we need to support actions containers, too (later)
				throw new IllegalArgumentException(
						"expected Transition instead of: " + container);
			}

			@Override
			public String isValid(Object value) {
				ILoadResult loadResult = loadFromString((String) value);
				if (loadResult != null && loadResult.hasError()) {
					return loadResult.getError();
				}
				return null;
			}
			
			private ILoadResult loadFromString(String text) {
				if (text == null) {
					return null;
				}
				ILoadResult loadResult = LanguageResource.loadFromString(text, getAttributeList(container));
				return loadResult;
			}
			
			public EObject toValue(String text) {
				ILoadResult loadResult = loadFromString(text);
				return loadResult == null ? null : loadResult.getEObject();
			}
			
			public String toString(EObject object) {
				if (object == null) {
					return "";
				}
				String text = LanguageResource.serializeEObject((EObject) object, getAttributeList(object));
				return text == null ? "" : text;
			}

		}

		private ValueWrapper valueWrapper;
		
		public ParameterBindingCellEditor(Composite parent, EObject object) {
			super(parent);
			valueWrapper = new ValueWrapper(object);
			setValidator(valueWrapper);
		}

	    @Override
	    public Object doGetValue()
	    {
	    	return valueWrapper.toValue((String) super.doGetValue());
	    }

	    @Override
	    public void doSetValue(Object value) {
	    	if (value instanceof EObject) {
	    		value = valueWrapper.toString((EObject) value);
	    	}
	    	super.doSetValue(value == null ? "" : value);
	    }
	}

	public static interface IParameterBindingElement {
		Collection<Parameter> getParameters(EObject object);
		EStructuralFeature getParameterBindingFeature();
	}

	private EditingDomain editingDomain;
	private IPropertySource propertySource;
	private IItemPropertySource itemProvider;
	private IParameterBindingElement parameterBindingsElement;

	public ParameterBindingPropertySourceProvider(EditingDomain editingDomain,
			IParameterBindingElement parameterBindingsElement) {
		this.editingDomain = editingDomain;
		this.parameterBindingsElement = parameterBindingsElement;
	}

	public IItemPropertySource getItemProvider() {
		if (itemProvider == null) {
			itemProvider = new InvocationParameterBindingItemProvider();
		}
		return itemProvider;
	}

	@Override
	public IPropertySource getPropertySource(Object object) {
		if (propertySource == null) {
			propertySource = new PropertySource(object, getItemProvider()) {

				@Override
				protected IPropertyDescriptor createPropertyDescriptor(
						IItemPropertyDescriptor itemPropertyDescriptor) {
					return new PropertyDescriptor(object,
							itemPropertyDescriptor) {

						@Override
						public CellEditor createPropertyEditor(
								Composite composite) {
							return new ParameterBindingCellEditor(composite, (EObject) object);
						}

					};
				}

			};
		}
		if ((object instanceof EObject) && !(object instanceof Expression)) {
			// do not return the propertySource in case of an expression
			// otherwise it does not work
			return propertySource;
		}
		return null;
	}

	public class InvocationParameterBindingItemProvider implements
			IItemPropertySource {

		List<IItemPropertyDescriptor> itemPropertyDescriptors;

		@Override
		public List<IItemPropertyDescriptor> getPropertyDescriptors(
				Object object) {

			if (itemPropertyDescriptors == null) {
				itemPropertyDescriptors = new ArrayList<IItemPropertyDescriptor>();
				Collection<Parameter> parameters = parameterBindingsElement
						.getParameters((EObject) object);

				int id = 0;
				for (Parameter parameter : parameters) {
					itemPropertyDescriptors
							.add(new ParameterBindingPropertyDescriptor(Integer
									.toString(id), (EObject) object, parameter));
					id++;
				}

			}
			return itemPropertyDescriptors;
		}

		/**
		 * This convenience method finds a particular descriptor given its
		 * {@link IItemPropertyDescriptor#getId(Object) ID} or
		 * {@link IItemPropertyDescriptor#getFeature(Object) feature}.
		 */
		@Override
		public IItemPropertyDescriptor getPropertyDescriptor(Object object,
				Object propertyId) {
			for (IItemPropertyDescriptor itemPropertyDescriptor : getPropertyDescriptors(object)) {
				if (propertyId.equals(itemPropertyDescriptor.getId(object))
						|| propertyId.equals(itemPropertyDescriptor
								.getFeature(object))) {
					return itemPropertyDescriptor;
				}
			}

			return null;
		}

		@Override
		public Object getEditableValue(Object object) {

			return "";
		}

	}

	public class ParameterBindingPropertyDescriptor extends
			AbstractItemPropertyDescriptor {
		private String id;
		private EObject object;
		private Parameter parameter;

		public ParameterBindingPropertyDescriptor(String id,
				EObject parameterBindingsElement, Parameter parameter) {
			this.id = id;
			this.object = parameterBindingsElement;
			this.parameter = parameter;
		}

		private ParameterBinding getParameterBinding(Parameter parameter) {
			@SuppressWarnings("unchecked")
			Collection<ParameterBinding> parameterBindings = (Collection<ParameterBinding>) object
					.eGet(parameterBindingsElement.getParameterBindingFeature());

			for (ParameterBinding parameterBinding : parameterBindings) {
				if (parameterBinding.getParameter() == parameter) {
					return parameterBinding;
				}
			}
			return null;
		}

		@Override
		public Object getPropertyValue(Object object) {
			ParameterBinding binding = getParameterBinding(parameter);
			if (binding != null) {
				if (binding.getValue() instanceof LiteralExpression) {
					LiteralExpression literalExpression = (LiteralExpression) binding
							.getValue();
					return literalExpression.getValue();
				} else if (binding.getValue() instanceof Expression) {
					return LanguageResource.serializeEObject(binding.getValue(),
							ParameterBindingCellEditor.ValueWrapper.getAttributeList((EObject) object));
				}
			}
			return null;
		}

		@Override
		public void setPropertyValue(Object object, Object value) {
			EStructuralFeature feature = parameterBindingsElement.getParameterBindingFeature();
			ParameterBinding parameterBinding = getParameterBinding(parameter);
			if (parameterBinding == null) {
				parameterBinding = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
						.createParameterBinding();
				parameterBinding.setParameter(parameter);

				// Add ParameterBinding to parameterBindingsElement within a
				// write transaction
				@SuppressWarnings("unchecked")
				Collection<ParameterBinding> parameterBindings = (Collection<ParameterBinding>) this.object
						.eGet(feature);
				List<ParameterBinding> newValue = new ArrayList<ParameterBinding>(
						parameterBindings);
				newValue.add(parameterBinding);
				setFeature(
						feature,
						this.object, newValue);
			}

			Expression expression = null;
			if (value instanceof String) {
				// Create Literal Expression for the value
				LiteralExpression valueExpression = CommonExpressionsFactory.eINSTANCE
						.createLiteralExpression();
				valueExpression.setValue((String) value);
				expression = valueExpression;
			} else if (value instanceof Expression) {
				expression = (Expression) value;
			}
			// Set within a write transaction
			setFeature(CorePackage.Literals.PARAMETER_BINDING__VALUE,
					parameterBinding, expression);
		}

		@Override
		public String getDisplayName(Object object) {
			if (parameter.getName() == null) {
				return "null";
			} else {
				return parameter.getName();
			}
		}

		@Override
		public String getId(Object object) {
			return id;
		}

		@Override
		public IItemLabelProvider getLabelProvider(Object object) {
			return new IItemLabelProvider() {

				@Override
				public String getText(Object object) {

					return object.toString();
				}

				@Override
				public Object getImage(Object object) {

					return null;
				}
			};
		}

		@Override
		public Object getFeature(Object object) {
			return CorePackage.Literals.PARAMETER_BINDING__VALUE;
		}

		private void setFeature(EStructuralFeature feature, EObject eObject,
				Object value) {

			if (editingDomain == null) {
				eObject.eSet(feature, value);
			} else {
				editingDomain.getCommandStack().execute(
						SetCommand.create(editingDomain, eObject, feature,
								value));
			}
		}
	}

}
