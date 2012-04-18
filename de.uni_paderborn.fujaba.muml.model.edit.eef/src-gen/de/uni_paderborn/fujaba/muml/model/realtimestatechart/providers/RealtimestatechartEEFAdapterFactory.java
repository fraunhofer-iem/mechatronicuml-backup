/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory;


/**
 * 
 * 
 */
public class RealtimestatechartEEFAdapterFactory extends RealtimestatechartAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createAbsoluteDeadlineAdapter()
	 * 
	 */
	public Adapter createAbsoluteDeadlineAdapter() {
		return new AbsoluteDeadlinePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createClockAdapter()
	 * 
	 */
	public Adapter createClockAdapter() {
		return new ClockPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createRegionAdapter()
	 * 
	 */
	public Adapter createRegionAdapter() {
		return new RegionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createStateAdapter()
	 * 
	 */
	public Adapter createStateAdapter() {
		return new StatePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createTransitionAdapter()
	 * 
	 */
	public Adapter createTransitionAdapter() {
		return new TransitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createClockConstraintAdapter()
	 * 
	 */
	public Adapter createClockConstraintAdapter() {
		return new ClockConstraintPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createActionAdapter()
	 * 
	 */
	public Adapter createActionAdapter() {
		return new ActionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createAsynchronousMessageEventAdapter()
	 * 
	 */
	public Adapter createAsynchronousMessageEventAdapter() {
		return new AsynchronousMessageEventPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createDoEventAdapter()
	 * 
	 */
	public Adapter createDoEventAdapter() {
		return new DoEventPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createSynchronizationChannelAdapter()
	 * 
	 */
	public Adapter createSynchronizationChannelAdapter() {
		return new SynchronizationChannelPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createSynchronizationAdapter()
	 * 
	 */
	public Adapter createSynchronizationAdapter() {
		return new SynchronizationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createRealtimeStatechartAdapter()
	 * 
	 */
	public Adapter createRealtimeStatechartAdapter() {
		return new RealtimeStatechartPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createMessageAdapter()
	 * 
	 */
	public Adapter createMessageAdapter() {
		return new MessagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createEntryEventAdapter()
	 * 
	 */
	public Adapter createEntryEventAdapter() {
		return new EntryEventPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createExitEventAdapter()
	 * 
	 */
	public Adapter createExitEventAdapter() {
		return new ExitEventPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createEntryPointAdapter()
	 * 
	 */
	public Adapter createEntryPointAdapter() {
		return new EntryPointPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createExitPointAdapter()
	 * 
	 */
	public Adapter createExitPointAdapter() {
		return new ExitPointPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createStateEntryPointAdapter()
	 * 
	 */
	public Adapter createStateEntryPointAdapter() {
		return new StateEntryPointPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.util.RealtimestatechartAdapterFactory#createStateExitPointAdapter()
	 * 
	 */
	public Adapter createStateExitPointAdapter() {
		return new StateExitPointPropertiesEditionProvider();
	}

}
