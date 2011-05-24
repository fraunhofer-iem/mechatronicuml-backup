/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.provider;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.util.RealtimestatechartAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimestatechartItemProviderAdapterFactory extends RealtimestatechartAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsoluteDeadlineItemProvider absoluteDeadlineItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbsoluteDeadlineAdapter() {
		if (absoluteDeadlineItemProvider == null) {
			absoluteDeadlineItemProvider = new AbsoluteDeadlineItemProvider(this);
		}

		return absoluteDeadlineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeDeadlineItemProvider relativeDeadlineItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelativeDeadlineAdapter() {
		if (relativeDeadlineItemProvider == null) {
			relativeDeadlineItemProvider = new RelativeDeadlineItemProvider(this);
		}

		return relativeDeadlineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockItemProvider clockItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClockAdapter() {
		if (clockItemProvider == null) {
			clockItemProvider = new ClockItemProvider(this);
		}

		return clockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateItemProvider stateItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateAdapter() {
		if (stateItemProvider == null) {
			stateItemProvider = new StateItemProvider(this);
		}

		return stateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizationChannelItemProvider synchronizationChannelItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSynchronizationChannelAdapter() {
		if (synchronizationChannelItemProvider == null) {
			synchronizationChannelItemProvider = new SynchronizationChannelItemProvider(this);
		}

		return synchronizationChannelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockConstraintItemProvider clockConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClockConstraintAdapter() {
		if (clockConstraintItemProvider == null) {
			clockConstraintItemProvider = new ClockConstraintItemProvider(this);
		}

		return clockConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryStateItemProvider historyStateItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHistoryStateAdapter() {
		if (historyStateItemProvider == null) {
			historyStateItemProvider = new HistoryStateItemProvider(this);
		}

		return historyStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AsynchronousEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsynchronousEventItemProvider asynchronousEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AsynchronousEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAsynchronousEventAdapter() {
		if (asynchronousEventItemProvider == null) {
			asynchronousEventItemProvider = new AsynchronousEventItemProvider(this);
		}

		return asynchronousEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoActionItemProvider doActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoActionAdapter() {
		if (doActionItemProvider == null) {
			doActionItemProvider = new DoActionItemProvider(this);
		}

		return doActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryActionItemProvider entryActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntryActionAdapter() {
		if (entryActionItemProvider == null) {
			entryActionItemProvider = new EntryActionItemProvider(this);
		}

		return entryActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ExitAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitActionItemProvider exitActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ExitAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExitActionAdapter() {
		if (exitActionItemProvider == null) {
			exitActionItemProvider = new ExitActionItemProvider(this);
		}

		return exitActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizationItemProvider synchronizationItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSynchronizationAdapter() {
		if (synchronizationItemProvider == null) {
			synchronizationItemProvider = new SynchronizationItemProvider(this);
		}

		return synchronizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionItemProvider regionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegionAdapter() {
		if (regionItemProvider == null) {
			regionItemProvider = new RegionItemProvider(this);
		}

		return regionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FujabaRealtimeStatechart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FujabaRealtimeStatechartItemProvider fujabaRealtimeStatechartItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FujabaRealtimeStatechart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFujabaRealtimeStatechartAdapter() {
		if (fujabaRealtimeStatechartItemProvider == null) {
			fujabaRealtimeStatechartItemProvider = new FujabaRealtimeStatechartItemProvider(this);
		}

		return fujabaRealtimeStatechartItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (absoluteDeadlineItemProvider != null) absoluteDeadlineItemProvider.dispose();
		if (relativeDeadlineItemProvider != null) relativeDeadlineItemProvider.dispose();
		if (clockItemProvider != null) clockItemProvider.dispose();
		if (regionItemProvider != null) regionItemProvider.dispose();
		if (stateItemProvider != null) stateItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (clockConstraintItemProvider != null) clockConstraintItemProvider.dispose();
		if (historyStateItemProvider != null) historyStateItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
		if (asynchronousEventItemProvider != null) asynchronousEventItemProvider.dispose();
		if (doActionItemProvider != null) doActionItemProvider.dispose();
		if (entryActionItemProvider != null) entryActionItemProvider.dispose();
		if (exitActionItemProvider != null) exitActionItemProvider.dispose();
		if (synchronizationChannelItemProvider != null) synchronizationChannelItemProvider.dispose();
		if (synchronizationItemProvider != null) synchronizationItemProvider.dispose();
		if (fujabaRealtimeStatechartItemProvider != null) fujabaRealtimeStatechartItemProvider.dispose();
	}

}
