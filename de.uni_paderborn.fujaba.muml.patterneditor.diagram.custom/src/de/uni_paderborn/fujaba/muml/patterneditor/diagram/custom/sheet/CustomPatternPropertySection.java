package de.uni_paderborn.fujaba.muml.patterneditor.diagram.custom.sheet;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.ui.views.properties.IPropertySource;

import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.provider.CustomPropertySource;
import de.uni_paderborn.fujaba.muml.patterneditor.diagram.sheet.MumlPropertySection;

public class CustomPatternPropertySection extends MumlPropertySection {

	/**
	 * Customized to create our own CustomPropertySource objects.
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
				return new CustomPropertySource(object, ips, af);
			}
		}
		return super.getPropertySource(object);
	}

}
