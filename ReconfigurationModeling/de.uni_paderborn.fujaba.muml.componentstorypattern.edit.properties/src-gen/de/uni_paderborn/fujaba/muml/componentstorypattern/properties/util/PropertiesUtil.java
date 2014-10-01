package de.uni_paderborn.fujaba.muml.componentstorypattern.properties.util;

/**
 * @generated
 */
public class PropertiesUtil {

	/**
	 * @generated
	 */
	public static PropertiesUtil INSTANCE = new PropertiesUtil();

	/**
	 * @generated
	 */
	private PropertiesUtil() {
	}

	/**
	 * @generated
	 */
	private org.eclipse.emf.common.notify.AdapterFactory adapterFactory;

	/**
	 * @generated
	 */
	public org.eclipse.emf.common.notify.AdapterFactory getAdapterFactory() {
		if (adapterFactory == null) {
			adapterFactory = createAdapterFactory();
		}
		return adapterFactory;
	}

	/**
	 * @generated
	 */
	protected org.eclipse.emf.edit.provider.ComposedAdapterFactory createAdapterFactory() {
		java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories = new java.util.ArrayList<org.eclipse.emf.common.notify.AdapterFactory>();
		fillItemProviderFactories(factories);
		return new org.eclipse.emf.edit.provider.ComposedAdapterFactory(
				factories);
	}

	/**
	 * @generated
	 */
	protected void fillItemProviderFactories(
			java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories) {

		factories
				.add(new de.uni_paderborn.fujaba.muml.componentstorypattern.provider.ComponentstorypatternItemProviderAdapterFactory());

		factories
				.add(new org.storydriven.core.provider.CoreItemProviderAdapterFactory());

		factories
				.add(new org.storydriven.core.expressions.provider.ExpressionsItemProviderAdapterFactory());

		factories
				.add(new org.storydriven.core.expressions.common.provider.CommonExpressionsItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.provider.ProtocolinstantiationItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.reconfiguration.provider.ReconfigurationItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.reconfiguration.expression.provider.ExpressionItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.provider.StructdatatypeItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.valuetype.provider.ValuetypeItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.provider.RealtimestatechartItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.instance.provider.InstanceItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.msgtype.provider.MsgtypeItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.types.provider.TypesItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.protocol.provider.ProtocolItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.constraint.provider.ConstraintItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.behavior.provider.BehaviorItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.component.provider.ComponentItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.connector.provider.ConnectorItemProviderAdapterFactory());

		factories
				.add(new org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory());
		factories
				.add(new org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory());
	}

	/**
	 * @generated
	 */
	public org.eclipse.emf.common.notify.AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
	}
}
