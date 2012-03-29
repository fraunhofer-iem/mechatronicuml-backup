/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.deployment.providers;

import de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentViewsRepository;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.forms.DeploymentPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.impl.DeploymentPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.forms.HardwareNodePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.impl.HardwareNodePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.forms.HardwarePortPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.impl.HardwarePortPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.forms.CommunicationLinkPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.impl.CommunicationLinkPropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class DeploymentPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == DeploymentViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == DeploymentViewsRepository.Deployment_.class) {
			if (kind == DeploymentViewsRepository.SWT_KIND)
				return new DeploymentPropertiesEditionPartImpl(component);
			if (kind == DeploymentViewsRepository.FORM_KIND)
				return new DeploymentPropertiesEditionPartForm(component);
		}
		if (key == DeploymentViewsRepository.HardwareNode.class) {
			if (kind == DeploymentViewsRepository.SWT_KIND)
				return new HardwareNodePropertiesEditionPartImpl(component);
			if (kind == DeploymentViewsRepository.FORM_KIND)
				return new HardwareNodePropertiesEditionPartForm(component);
		}
		if (key == DeploymentViewsRepository.HardwarePort.class) {
			if (kind == DeploymentViewsRepository.SWT_KIND)
				return new HardwarePortPropertiesEditionPartImpl(component);
			if (kind == DeploymentViewsRepository.FORM_KIND)
				return new HardwarePortPropertiesEditionPartForm(component);
		}
		if (key == DeploymentViewsRepository.CommunicationLink.class) {
			if (kind == DeploymentViewsRepository.SWT_KIND)
				return new CommunicationLinkPropertiesEditionPartImpl(component);
			if (kind == DeploymentViewsRepository.FORM_KIND)
				return new CommunicationLinkPropertiesEditionPartForm(component);
		}
		return null;
	}

}
