/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.pattern.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import de.uni_paderborn.fujaba.muml.model.pattern.parts.PatternViewsRepository;
import de.uni_paderborn.fujaba.muml.model.pattern.parts.forms.CoordinationPatternPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.pattern.parts.forms.RoleConnectorPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.pattern.parts.forms.RolePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.pattern.parts.impl.CoordinationPatternPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.pattern.parts.impl.RoleConnectorPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.pattern.parts.impl.RolePropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class PatternPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == PatternViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == PatternViewsRepository.RoleConnector.class) {
			if (kind == PatternViewsRepository.SWT_KIND)
				return new RoleConnectorPropertiesEditionPartImpl(component);
			if (kind == PatternViewsRepository.FORM_KIND)
				return new RoleConnectorPropertiesEditionPartForm(component);
		}
		if (key == PatternViewsRepository.CoordinationPattern.class) {
			if (kind == PatternViewsRepository.SWT_KIND)
				return new CoordinationPatternPropertiesEditionPartImpl(component);
			if (kind == PatternViewsRepository.FORM_KIND)
				return new CoordinationPatternPropertiesEditionPartForm(component);
		}
		if (key == PatternViewsRepository.Role.class) {
			if (kind == PatternViewsRepository.SWT_KIND)
				return new RolePropertiesEditionPartImpl(component);
			if (kind == PatternViewsRepository.FORM_KIND)
				return new RolePropertiesEditionPartForm(component);
		}
		return null;
	}

}
