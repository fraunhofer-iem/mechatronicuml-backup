package de.uni_paderborn.fujaba.muml.utilities;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.storydriven.modeling.activities.expressions.provider.ExpressionsItemProviderAdapterFactory;
import org.storydriven.modeling.activities.provider.ActivitiesItemProviderAdapterFactory;
import org.storydriven.modeling.calls.provider.CallsItemProviderAdapterFactory;
import org.storydriven.modeling.patterns.provider.PatternsItemProviderAdapterFactory;
import org.storydriven.modeling.provider.SDMItemProviderAdapterFactory;
import org.storydriven.modeling.templates.provider.TemplatesItemProviderAdapterFactory;

import de.fujaba.modelinstance.provider.ModelinstanceItemProviderAdapterFactory;

/**
 * The activator class controls the plug-in life cycle
 */
public class UtilitiesPlugin extends AbstractUIPlugin {

	private AdapterFactory adapterFactory;

	// The plug-in ID
	public static final String ID = "de.uni_paderborn.fujaba.muml.utilities"; //$NON-NLS-1$

	// The shared instance
	private static UtilitiesPlugin plugin;
	
	/**
	 * The constructor
	 */
	public UtilitiesPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		adapterFactory = createAdapterFactory();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static UtilitiesPlugin getDefault() {
		return plugin;
	}

	/**
	 * @generated
	 */
	protected ComposedAdapterFactory createAdapterFactory() {
		ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		fillItemProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	/**
	 * @generated
	 */
	protected void fillItemProviderFactories(List<AdapterFactory> factories) {
		List<AdapterFactory> positivePriorityFactories = de.uni_paderborn.fujaba.common.FujabaCommonPlugin
				.getInstance().getCustomItemProviderAdapterFactories(ID, true);
		List<AdapterFactory> negativePriorityFactories = de.uni_paderborn.fujaba.common.FujabaCommonPlugin
				.getInstance().getCustomItemProviderAdapterFactories(ID, false);

		// Custom Factories with positive priority
		factories.addAll(positivePriorityFactories);

		// Default Factories
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.component.provider.ComponentItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.constraint.provider.ConstraintItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.core.provider.CoreItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.instance.provider.InstanceItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.pattern.provider.PatternItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.realtimestatechart.provider.RealtimestatechartItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.msgiface.provider.MsgifaceItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.model.deployment.provider.DeploymentItemProviderAdapterFactory());
		factories.add(new EcoreItemProviderAdapterFactory());
		factories.add(new ModelinstanceItemProviderAdapterFactory());
		factories.add(new SDMItemProviderAdapterFactory());
		factories.add(new ActivitiesItemProviderAdapterFactory());
		factories.add(new ExpressionsItemProviderAdapterFactory());
		factories
				.add(new org.storydriven.modeling.expressions.provider.ExpressionsItemProviderAdapterFactory());
		factories.add(new CallsItemProviderAdapterFactory());
		factories
				.add(new org.storydriven.modeling.calls.expressions.provider.ExpressionsItemProviderAdapterFactory());
		factories.add(new PatternsItemProviderAdapterFactory());
		factories
				.add(new org.storydriven.modeling.patterns.expressions.provider.ExpressionsItemProviderAdapterFactory());
		factories.add(new TemplatesItemProviderAdapterFactory());

		// Custom Factories with negative priority
		factories.addAll(negativePriorityFactories);
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	/**
	 * @generated
	 */
	public AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
	}

}
