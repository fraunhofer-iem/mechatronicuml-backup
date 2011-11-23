package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.sheet;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.ui.views.properties.IPropertySource;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.providers.CustomComponentInstanceItemProvider;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.providers.CustomInstanceItemProviderAdapterFactory;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.sheet.ComponentinstanceconfigurationPropertySection;
import de.uni_paderborn.fujaba.muml.model.instance.provider.ComponentInstanceItemProvider;

public class CustomComponentinstanceconfigurationPropertySection extends
		ComponentinstanceconfigurationPropertySection {
	CustomInstanceItemProviderAdapterFactory instanceFactory = new CustomInstanceItemProviderAdapterFactory();

	public CustomComponentinstanceconfigurationPropertySection() {

	}

	/**
	 * Customized to create our own CustomPropertySource objects.
	 */
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}

		IItemPropertySource ips = null;
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			ips = (IItemPropertySource) af.adapt(object,
					IItemPropertySource.class);
			if (ips instanceof ComponentInstanceItemProvider) {
				CustomComponentInstanceItemProvider adapter = (CustomComponentInstanceItemProvider) instanceFactory
						.createComponentInstanceAdapter();
				ips = (IItemPropertySource) adapter;
			}

			if (ips != null) {
				EditingDomain ed = getEditingDomainFor(object);
				return new de.uni_paderborn.fujaba.muml.common.emf.edit.provider.CustomPropertySource(
						object, ips, af, ed, this, this);
			}
		}
		return super.getPropertySource(object);
	}

}
