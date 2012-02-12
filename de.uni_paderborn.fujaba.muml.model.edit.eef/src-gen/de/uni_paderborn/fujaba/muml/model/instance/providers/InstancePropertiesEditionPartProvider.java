/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.instance.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import de.uni_paderborn.fujaba.muml.model.instance.parts.InstanceViewsRepository;
import de.uni_paderborn.fujaba.muml.model.instance.parts.forms.AssemblyInstancePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.instance.parts.forms.ComponentInstanceConfigurationPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.instance.parts.forms.ComponentInstancePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.instance.parts.forms.ConnectorInstancePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.instance.parts.forms.ContinuousPortInstancePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.instance.parts.forms.DelegationInstancePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.instance.parts.forms.DiscreteMultiPortInstancePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.instance.parts.forms.DiscreteSinglePortInstancePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.instance.parts.forms.HybridPortInstancePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.instance.parts.impl.AssemblyInstancePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.instance.parts.impl.ComponentInstanceConfigurationPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.instance.parts.impl.ComponentInstancePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.instance.parts.impl.ConnectorInstancePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.instance.parts.impl.ContinuousPortInstancePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.instance.parts.impl.DelegationInstancePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.instance.parts.impl.DiscreteMultiPortInstancePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.instance.parts.impl.DiscreteSinglePortInstancePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.instance.parts.impl.HybridPortInstancePropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class InstancePropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == InstanceViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == InstanceViewsRepository.ComponentInstance.class) {
			if (kind == InstanceViewsRepository.SWT_KIND)
				return new ComponentInstancePropertiesEditionPartImpl(component);
			if (kind == InstanceViewsRepository.FORM_KIND)
				return new ComponentInstancePropertiesEditionPartForm(component);
		}
		if (key == InstanceViewsRepository.ConnectorInstance.class) {
			if (kind == InstanceViewsRepository.SWT_KIND)
				return new ConnectorInstancePropertiesEditionPartImpl(component);
			if (kind == InstanceViewsRepository.FORM_KIND)
				return new ConnectorInstancePropertiesEditionPartForm(component);
		}
		if (key == InstanceViewsRepository.AssemblyInstance.class) {
			if (kind == InstanceViewsRepository.SWT_KIND)
				return new AssemblyInstancePropertiesEditionPartImpl(component);
			if (kind == InstanceViewsRepository.FORM_KIND)
				return new AssemblyInstancePropertiesEditionPartForm(component);
		}
		if (key == InstanceViewsRepository.DelegationInstance.class) {
			if (kind == InstanceViewsRepository.SWT_KIND)
				return new DelegationInstancePropertiesEditionPartImpl(component);
			if (kind == InstanceViewsRepository.FORM_KIND)
				return new DelegationInstancePropertiesEditionPartForm(component);
		}
		if (key == InstanceViewsRepository.ComponentInstanceConfiguration.class) {
			if (kind == InstanceViewsRepository.SWT_KIND)
				return new ComponentInstanceConfigurationPropertiesEditionPartImpl(component);
			if (kind == InstanceViewsRepository.FORM_KIND)
				return new ComponentInstanceConfigurationPropertiesEditionPartForm(component);
		}
		if (key == InstanceViewsRepository.ContinuousPortInstance.class) {
			if (kind == InstanceViewsRepository.SWT_KIND)
				return new ContinuousPortInstancePropertiesEditionPartImpl(component);
			if (kind == InstanceViewsRepository.FORM_KIND)
				return new ContinuousPortInstancePropertiesEditionPartForm(component);
		}
		if (key == InstanceViewsRepository.HybridPortInstance.class) {
			if (kind == InstanceViewsRepository.SWT_KIND)
				return new HybridPortInstancePropertiesEditionPartImpl(component);
			if (kind == InstanceViewsRepository.FORM_KIND)
				return new HybridPortInstancePropertiesEditionPartForm(component);
		}
		if (key == InstanceViewsRepository.DiscreteSinglePortInstance.class) {
			if (kind == InstanceViewsRepository.SWT_KIND)
				return new DiscreteSinglePortInstancePropertiesEditionPartImpl(component);
			if (kind == InstanceViewsRepository.FORM_KIND)
				return new DiscreteSinglePortInstancePropertiesEditionPartForm(component);
		}
		if (key == InstanceViewsRepository.DiscreteMultiPortInstance.class) {
			if (kind == InstanceViewsRepository.SWT_KIND)
				return new DiscreteMultiPortInstancePropertiesEditionPartImpl(component);
			if (kind == InstanceViewsRepository.FORM_KIND)
				return new DiscreteMultiPortInstancePropertiesEditionPartForm(component);
		}
		return null;
	}

}
