/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.constraint.providers;

import de.uni_paderborn.fujaba.muml.model.constraint.parts.ConstraintViewsRepository;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import de.uni_paderborn.fujaba.muml.model.constraint.parts.forms.TextualConstraintPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.constraint.parts.impl.TextualConstraintPropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class ConstraintPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ConstraintViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ConstraintViewsRepository.TextualConstraint.class) {
			if (kind == ConstraintViewsRepository.SWT_KIND)
				return new TextualConstraintPropertiesEditionPartImpl(component);
			if (kind == ConstraintViewsRepository.FORM_KIND)
				return new TextualConstraintPropertiesEditionPartForm(component);
		}
		return null;
	}

}
