package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;

import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.descriptors.ComponentTypeItemPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.provider.ComponentInstanceItemProvider;

public class CustomComponentInstanceItemProvider extends
		ComponentInstanceItemProvider {

	public CustomComponentInstanceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	protected void addComponentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ComponentTypeItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_componentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_componentType_feature", "_UI_ComponentInstance_type"),
				 InstancePackage.Literals.COMPONENT_INSTANCE__COMPONENT_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

}
