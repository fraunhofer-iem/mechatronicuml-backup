package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.properties.metamodel;

public class MetamodelContributor
		implements
			de.uni_paderborn.fujaba.properties.runtime.metamodel.IMetamodelContributor {

	/**
	 * @generated
	 */
	public java.util.List<org.eclipse.emf.common.notify.AdapterFactory> getItemProviderFactories() {
		java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories = new java.util.ArrayList<org.eclipse.emf.common.notify.AdapterFactory>();
		fillItemProviderFactories(factories);
		return factories;
	}

	/**
	 * @generated
	 */
	protected void fillItemProviderFactories(
			java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories) {

		factories
				.add(new de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.provider.BooleanLogicItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.provider.PredicatesItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.provider.QuantifiersItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.provider.MtctlItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.provider.ComparablesItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.provider.SetsItemProviderAdapterFactory());

	}

}
