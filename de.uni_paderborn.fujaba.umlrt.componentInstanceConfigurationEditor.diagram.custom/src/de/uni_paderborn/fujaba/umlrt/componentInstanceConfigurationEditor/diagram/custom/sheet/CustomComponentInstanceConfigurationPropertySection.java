package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.sheet;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.ui.views.properties.IPropertySource;

import de.uni_paderborn.fujaba.umlrt.common.sheet.CustomPropertySource;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.sheet.ComponentInstanceConfigurationPropertySection;

public class CustomComponentInstanceConfigurationPropertySection extends
		ComponentInstanceConfigurationPropertySection {
	/**
	 * @generated
	 */
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object,
					IItemPropertySource.class);
			if (ips != null) {
				return new CustomPropertySource(object, ips);
			}
		}
//		if (object instanceof IAdaptable) {
//			return (IPropertySource) ((IAdaptable) object)
//					.getAdapter(IPropertySource.class);
//		}
//		return null;
		return super.getPropertySource(object);
	}
}
