/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.core.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import de.uni_paderborn.fujaba.muml.model.core.parts.CoreViewsRepository;
import de.uni_paderborn.fujaba.muml.model.core.parts.forms.ActivityCallExpressionPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.core.parts.forms.CardinalityPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.core.parts.forms.NaturalNumberPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.core.parts.impl.ActivityCallExpressionPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.core.parts.impl.CardinalityPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.core.parts.impl.NaturalNumberPropertiesEditionPartImpl;




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
		return null;
	}

}
