package org.storydriven.storydiagrams.properties.metamodel;

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
				.add(new org.storydriven.storydiagrams.provider.StorydiagramsItemProviderAdapterFactory());

		factories
				.add(new org.storydriven.storydiagrams.activities.provider.ActivitiesItemProviderAdapterFactory());

		factories
				.add(new org.storydriven.storydiagrams.calls.provider.CallsItemProviderAdapterFactory());

		factories
				.add(new org.storydriven.storydiagrams.patterns.provider.PatternsItemProviderAdapterFactory());

		factories
				.add(new org.storydriven.storydiagrams.templates.provider.TemplatesItemProviderAdapterFactory());

	}

}
