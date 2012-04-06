/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.msgiface.providers;

import de.uni_paderborn.fujaba.muml.model.msgiface.parts.MsgifaceViewsRepository;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import de.uni_paderborn.fujaba.muml.model.msgiface.parts.forms.MessageInterfacePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.msgiface.parts.impl.MessageInterfacePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.msgiface.parts.forms.MessageTypePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.msgiface.parts.impl.MessageTypePropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class MsgifacePropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == MsgifaceViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == MsgifaceViewsRepository.MessageInterface.class) {
			if (kind == MsgifaceViewsRepository.SWT_KIND)
				return new MessageInterfacePropertiesEditionPartImpl(component);
			if (kind == MsgifaceViewsRepository.FORM_KIND)
				return new MessageInterfacePropertiesEditionPartForm(component);
		}
		if (key == MsgifaceViewsRepository.MessageType.class) {
			if (kind == MsgifaceViewsRepository.SWT_KIND)
				return new MessageTypePropertiesEditionPartImpl(component);
			if (kind == MsgifaceViewsRepository.FORM_KIND)
				return new MessageTypePropertiesEditionPartForm(component);
		}
		return null;
	}

}
