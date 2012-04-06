package de.uni_paderborn.fujaba.muml.common.emf.edit.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

import de.uni_paderborn.fujaba.common.descriptor.AbstractItemPropertyDescriptor;

public class InvocationParameterBindingPropertySourceProvider implements
		IPropertySourceProvider {

	private EditingDomain editingDomain;
	
	private IPropertySource propertySource;

	private IItemPropertySource itemProvider;

	public InvocationParameterBindingPropertySourceProvider(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
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
							EDataType eDataType = EcorePackage.Literals.ESTRING;
							return createEDataTypeCellEditor(eDataType,
									composite);
						}

					};
				}

			};
		}
		if (object instanceof EObject) {
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

				// TODO: Adapt to new Metamodel!

				// Invocation invocation = (Invocation) object;
				// if (invocation.getCallee() != null) {
				// int id = 0;
				// for (EParameter parameter : invocation.getCallee()
				// .getContainedParameters()) {
				// itemPropertyDescriptors
				// .add(new InvocationParameterBindingPropertyDescriptor(
				// Integer.toString(id), invocation, parameter));
				// id++;
				// }
				// }
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

	// TODO: adapt to new Metamodel!
	public class InvocationParameterBindingPropertyDescriptor extends
			AbstractItemPropertyDescriptor {
		// private String id;

		// TODO: Adapt to new Metamodel!
		// private Invocation invocation;
		// private EParameter parameter;

		// public InvocationParameterBindingPropertyDescriptor(String id,
		// Invocation invocation, EParameter parameter) {
		// this.id = id;
		// this.invocation = invocation;
		// this.parameter = parameter;
		// }
		//
		// private ParameterBinding getParameterBinding(EParameter parameter) {
		// for (ParameterBinding parameterBinding : invocation
		// .getOwnedParameterBindings()) {
		// if (parameterBinding.getParameter() == parameter) {
		// return parameterBinding;
		// }
		// }
		// return null;
		// }
		//
		// @Override
		// public Object getPropertyValue(Object object) {
		// ParameterBinding binding = getParameterBinding(parameter);
		// if (binding != null) {
		// if (binding.getValueExpression() instanceof LiteralExpression) {
		// LiteralExpression literalExpression = (LiteralExpression) binding
		// .getValueExpression();
		//
		// return literalExpression.getValue();
		// }
		// }
		// return null;
		// }
		//
		// @Override
		// public void setPropertyValue(Object object, Object value) {
		// ParameterBinding parameterBinding = getParameterBinding(parameter);
		// if (parameterBinding == null) {
		// parameterBinding = CallsFactory.eINSTANCE
		// .createParameterBinding();
		// parameterBinding.setParameter(parameter);
		//
		// // Add ParameterBinding to Invocation within a write transaction
		// List<ParameterBinding> newValue = new
		// ArrayList<ParameterBinding>(invocation.getOwnedParameterBindings());
		// newValue.add(parameterBinding);
		// setFeature(CallsPackage.Literals.INVOCATION__OWNED_PARAMETER_BINDINGS,
		// invocation, newValue);
		// }
		//
		// // Create Literal Expression for the value
		// LiteralExpression valueExpression = ExpressionsFactory.eINSTANCE
		// .createLiteralExpression();
		// valueExpression.setValue((String) value);
		//
		// // Set within a write transaction
		// setFeature(CallsPackage.Literals.PARAMETER_BINDING__VALUE_EXPRESSION,
		// parameterBinding, valueExpression);
		// }
		//
		// @Override
		// public String getDisplayName(Object object) {
		// if (parameter.getName() == null) {
		// return "null";
		// } else {
		// return parameter.getName();
		// }
		// }
		//
		// @Override
		// public String getId(Object object) {
		// return id;
		// }
		//
		// @Override
		// public IItemLabelProvider getLabelProvider(Object object) {
		// return new IItemLabelProvider() {
		//
		// @Override
		// public String getText(Object object) {
		//
		// return object.toString();
		// }
		//
		// @Override
		// public Object getImage(Object object) {
		//
		// return null;
		// }
		// };
		// }
		//
		// @Override
		// public Object getFeature(Object object) {
		// return CallsPackage.Literals.PARAMETER_BINDING__VALUE_EXPRESSION;
		// }
		//
		// private void setFeature(EStructuralFeature feature, EObject eObject,
		// Object value) {
		//
		// if (editingDomain == null) {
		// eObject.eSet(feature, value);
		// } else {
		// editingDomain.getCommandStack().execute(
		// SetCommand.create(editingDomain,
		// eObject, feature, value));
		// }
		// }

	}
}
