/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.core.providers;

import de.uni_paderborn.fujaba.muml.model.core.parts.CoreViewsRepository;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import de.uni_paderborn.fujaba.muml.model.core.parts.forms.NaturalNumberPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.core.parts.impl.NaturalNumberPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.core.parts.forms.CardinalityPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.core.parts.impl.CardinalityPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.core.parts.forms.ActivityCallExpressionPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.core.parts.impl.ActivityCallExpressionPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.core.parts.forms.AttributePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.core.parts.impl.AttributePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.core.parts.forms.OperationPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.core.parts.impl.OperationPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.core.parts.forms.ParameterPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.core.parts.impl.ParameterPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.core.parts.forms.PrimitiveDataTypePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.core.parts.impl.PrimitiveDataTypePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.core.parts.forms.ArrayDataTypePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.core.parts.impl.ArrayDataTypePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.core.parts.forms.InnerDeclarationPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.core.parts.impl.InnerDeclarationPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.core.parts.forms.ParameterBindingPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.core.parts.impl.ParameterBindingPropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class CorePropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == CoreViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == CoreViewsRepository.NaturalNumber.class) {
			if (kind == CoreViewsRepository.SWT_KIND)
				return new NaturalNumberPropertiesEditionPartImpl(component);
			if (kind == CoreViewsRepository.FORM_KIND)
				return new NaturalNumberPropertiesEditionPartForm(component);
		}
		if (key == CoreViewsRepository.Cardinality.class) {
			if (kind == CoreViewsRepository.SWT_KIND)
				return new CardinalityPropertiesEditionPartImpl(component);
			if (kind == CoreViewsRepository.FORM_KIND)
				return new CardinalityPropertiesEditionPartForm(component);
		}
		if (key == CoreViewsRepository.ActivityCallExpression.class) {
			if (kind == CoreViewsRepository.SWT_KIND)
				return new ActivityCallExpressionPropertiesEditionPartImpl(component);
			if (kind == CoreViewsRepository.FORM_KIND)
				return new ActivityCallExpressionPropertiesEditionPartForm(component);
		}
		if (key == CoreViewsRepository.Attribute.class) {
			if (kind == CoreViewsRepository.SWT_KIND)
				return new AttributePropertiesEditionPartImpl(component);
			if (kind == CoreViewsRepository.FORM_KIND)
				return new AttributePropertiesEditionPartForm(component);
		}
		if (key == CoreViewsRepository.Operation.class) {
			if (kind == CoreViewsRepository.SWT_KIND)
				return new OperationPropertiesEditionPartImpl(component);
			if (kind == CoreViewsRepository.FORM_KIND)
				return new OperationPropertiesEditionPartForm(component);
		}
		if (key == CoreViewsRepository.Parameter.class) {
			if (kind == CoreViewsRepository.SWT_KIND)
				return new ParameterPropertiesEditionPartImpl(component);
			if (kind == CoreViewsRepository.FORM_KIND)
				return new ParameterPropertiesEditionPartForm(component);
		}
		if (key == CoreViewsRepository.PrimitiveDataType.class) {
			if (kind == CoreViewsRepository.SWT_KIND)
				return new PrimitiveDataTypePropertiesEditionPartImpl(component);
			if (kind == CoreViewsRepository.FORM_KIND)
				return new PrimitiveDataTypePropertiesEditionPartForm(component);
		}
		if (key == CoreViewsRepository.ArrayDataType.class) {
			if (kind == CoreViewsRepository.SWT_KIND)
				return new ArrayDataTypePropertiesEditionPartImpl(component);
			if (kind == CoreViewsRepository.FORM_KIND)
				return new ArrayDataTypePropertiesEditionPartForm(component);
		}
		if (key == CoreViewsRepository.InnerDeclaration.class) {
			if (kind == CoreViewsRepository.SWT_KIND)
				return new InnerDeclarationPropertiesEditionPartImpl(component);
			if (kind == CoreViewsRepository.FORM_KIND)
				return new InnerDeclarationPropertiesEditionPartForm(component);
		}
		if (key == CoreViewsRepository.ParameterBinding.class) {
			if (kind == CoreViewsRepository.SWT_KIND)
				return new ParameterBindingPropertiesEditionPartImpl(component);
			if (kind == CoreViewsRepository.FORM_KIND)
				return new ParameterBindingPropertiesEditionPartForm(component);
		}
		return null;
	}

}
