
package org.muml.storydiagram.properties.metamodel;

public class MetamodelContributor implements org.muml.ape.runtime.metamodel.IMetamodelContributor {

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
	protected void fillItemProviderFactories(java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories) {

		factories.add(new org.muml.storydiagram.provider.StorydiagramItemProviderAdapterFactory());

		factories.add(new org.muml.storydiagram.activities.provider.ActivitiesItemProviderAdapterFactory());

		factories.add(new org.muml.storydiagram.calls.provider.CallsItemProviderAdapterFactory());

		factories.add(new org.muml.storydiagram.patterns.provider.PatternsItemProviderAdapterFactory());

		factories.add(new org.muml.storydiagram.templates.provider.TemplatesItemProviderAdapterFactory());

		factories
				.add(new org.muml.storydiagram.calls.expressions.provider.CallsExpressionsItemProviderAdapterFactory());

		factories.add(
				new org.muml.storydiagram.patterns.expressions.provider.PatternsExpressionsItemProviderAdapterFactory());

		factories.add(
				new org.muml.storydiagram.activities.expressions.provider.ActivitiesExpressionsItemProviderAdapterFactory());

	}

}
