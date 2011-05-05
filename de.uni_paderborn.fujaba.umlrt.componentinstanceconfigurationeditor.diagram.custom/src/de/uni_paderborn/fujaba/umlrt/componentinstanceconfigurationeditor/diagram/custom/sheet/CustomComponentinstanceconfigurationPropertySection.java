package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.sheet;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySource;

import de.uni_paderborn.fujaba.umlrt.common.sheet.CustomPropertySource;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.sheet.ComponentinstanceconfigurationPropertySection;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.parts.CustomPortInstanceEditPart;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.providers.CustomComponentInstanceItemProvider;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.providers.CustomInstanceItemProviderAdapterFactory;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.provider.ComponentInstanceItemProvider;
import de.uni_paderborn.fujaba.umlrt.model.instance.provider.InstanceItemProviderAdapterFactory;

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
		IItemPropertySource ips = getItemPropertySource(object);
		if (ips != null) {
			return new CustomPropertySource(object, ips);
		}

		return super.getPropertySource(object);
	}

	private IItemPropertySource getItemPropertySource(Object object) {
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
		}

		return ips;
	}

}
