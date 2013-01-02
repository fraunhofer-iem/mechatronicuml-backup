package de.uni_paderborn.fujaba.muml.common;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.storydriven.core.expressions.provider.ExpressionsItemProviderAdapterFactory;
import org.storydriven.core.provider.CoreItemProviderAdapterFactory;
import org.storydriven.storydiagrams.activities.expressions.provider.ActivitiesExpressionsItemProviderAdapterFactory;
import org.storydriven.storydiagrams.activities.provider.ActivitiesItemProviderAdapterFactory;
import org.storydriven.storydiagrams.calls.expressions.provider.CallsExpressionsItemProviderAdapterFactory;
import org.storydriven.storydiagrams.calls.provider.CallsItemProviderAdapterFactory;
import org.storydriven.storydiagrams.patterns.expressions.provider.PatternsExpressionsItemProviderAdapterFactory;
import org.storydriven.storydiagrams.provider.StorydiagramsItemProviderAdapterFactory;
import org.storydriven.storydiagrams.templates.provider.TemplatesItemProviderAdapterFactory;

import de.fujaba.modelinstance.provider.ModelinstanceItemProviderAdapterFactory;
import de.uni_paderborn.fujaba.muml.model.connector.provider.ConnectorItemProviderAdapterFactory;
import de.uni_paderborn.fujaba.muml.model.protocol.provider.ProtocolItemProviderAdapterFactory;

public class MumlCommonPlugin implements BundleActivator {

	private ComposedAdapterFactory adapterFactory;

	private static MumlCommonPlugin instance;

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public static MumlCommonPlugin getInstance() {
		return MumlCommonPlugin.instance;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		adapterFactory = createAdapterFactory();
		MumlCommonPlugin.context = bundleContext;
		MumlCommonPlugin.instance = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		adapterFactory.dispose();
		adapterFactory = null;
		MumlCommonPlugin.context = null;
		MumlCommonPlugin.instance = null;
	}

	protected ComposedAdapterFactory createAdapterFactory() {
		ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		fillDefaultItemProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	public static void fillDefaultItemProviderFactories(List<AdapterFactory> factories) {

		// Default Factories
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.component.provider.ComponentItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.constraint.provider.ConstraintItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.types.provider.TypesItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.behavior.provider.BehaviorItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.connector.provider.ConnectorItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.model.valuetype.provider.ValuetypeItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.instance.provider.InstanceItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.protocol.provider.ProtocolItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.realtimestatechart.provider.RealtimestatechartItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.msgtype.provider.MsgtypeItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.deployment.provider.DeploymentItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.types.provider.TypesItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.connector.provider.ConnectorItemProviderAdapterFactory());
		factories.add(new CoreItemProviderAdapterFactory());
		factories.add(new ExpressionsItemProviderAdapterFactory());
		factories.add(new EcoreItemProviderAdapterFactory());
		factories.add(new ModelinstanceItemProviderAdapterFactory());
		factories.add(new StorydiagramsItemProviderAdapterFactory());
		factories.add(new ActivitiesItemProviderAdapterFactory());
		factories.add(new ActivitiesExpressionsItemProviderAdapterFactory());
		factories.add(new CallsItemProviderAdapterFactory());
		factories.add(new CallsExpressionsItemProviderAdapterFactory());
		factories.add(new ProtocolItemProviderAdapterFactory());
		factories.add(new PatternsExpressionsItemProviderAdapterFactory());
		factories.add(new TemplatesItemProviderAdapterFactory());

		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	public AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
	}

}
