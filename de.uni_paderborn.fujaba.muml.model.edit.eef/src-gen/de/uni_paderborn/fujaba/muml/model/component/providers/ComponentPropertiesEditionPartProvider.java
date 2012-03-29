/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.component.parts.forms.AssemblyPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.component.parts.forms.AtomicComponentPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.component.parts.forms.ComponentPartPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.component.parts.forms.ContinuousPortPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.component.parts.forms.DelegationPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.component.parts.forms.DiscretePortPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.component.parts.forms.HybridPortPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.component.parts.forms.PatternOccurrencePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.component.parts.forms.StructuredComponentPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.component.parts.impl.AssemblyPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.component.parts.impl.AtomicComponentPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.component.parts.impl.ComponentPartPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.component.parts.impl.ContinuousPortPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.component.parts.impl.DelegationPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.component.parts.impl.DiscretePortPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.component.parts.impl.HybridPortPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.component.parts.impl.PatternOccurrencePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.component.parts.impl.StructuredComponentPropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class ComponentPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ComponentViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ComponentViewsRepository.ContinuousPort.class) {
			if (kind == ComponentViewsRepository.SWT_KIND)
				return new ContinuousPortPropertiesEditionPartImpl(component);
			if (kind == ComponentViewsRepository.FORM_KIND)
				return new ContinuousPortPropertiesEditionPartForm(component);
		}
		if (key == ComponentViewsRepository.DiscretePort.class) {
			if (kind == ComponentViewsRepository.SWT_KIND)
				return new DiscretePortPropertiesEditionPartImpl(component);
			if (kind == ComponentViewsRepository.FORM_KIND)
				return new DiscretePortPropertiesEditionPartForm(component);
		}
		if (key == ComponentViewsRepository.ComponentPart.class) {
			if (kind == ComponentViewsRepository.SWT_KIND)
				return new ComponentPartPropertiesEditionPartImpl(component);
			if (kind == ComponentViewsRepository.FORM_KIND)
				return new ComponentPartPropertiesEditionPartForm(component);
		}
		if (key == ComponentViewsRepository.StructuredComponent.class) {
			if (kind == ComponentViewsRepository.SWT_KIND)
				return new StructuredComponentPropertiesEditionPartImpl(component);
			if (kind == ComponentViewsRepository.FORM_KIND)
				return new StructuredComponentPropertiesEditionPartForm(component);
		}
		if (key == ComponentViewsRepository.AtomicComponent.class) {
			if (kind == ComponentViewsRepository.SWT_KIND)
				return new AtomicComponentPropertiesEditionPartImpl(component);
			if (kind == ComponentViewsRepository.FORM_KIND)
				return new AtomicComponentPropertiesEditionPartForm(component);
		}
		if (key == ComponentViewsRepository.Assembly.class) {
			if (kind == ComponentViewsRepository.SWT_KIND)
				return new AssemblyPropertiesEditionPartImpl(component);
			if (kind == ComponentViewsRepository.FORM_KIND)
				return new AssemblyPropertiesEditionPartForm(component);
		}
		if (key == ComponentViewsRepository.Delegation.class) {
			if (kind == ComponentViewsRepository.SWT_KIND)
				return new DelegationPropertiesEditionPartImpl(component);
			if (kind == ComponentViewsRepository.FORM_KIND)
				return new DelegationPropertiesEditionPartForm(component);
		}
		if (key == ComponentViewsRepository.HybridPort.class) {
			if (kind == ComponentViewsRepository.SWT_KIND)
				return new HybridPortPropertiesEditionPartImpl(component);
			if (kind == ComponentViewsRepository.FORM_KIND)
				return new HybridPortPropertiesEditionPartForm(component);
		}
		if (key == ComponentViewsRepository.PatternOccurrence.class) {
			if (kind == ComponentViewsRepository.SWT_KIND)
				return new PatternOccurrencePropertiesEditionPartImpl(component);
			if (kind == ComponentViewsRepository.FORM_KIND)
				return new PatternOccurrencePropertiesEditionPartForm(component);
		}
		return null;
	}

}
