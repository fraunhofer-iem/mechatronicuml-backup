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
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLClockItemProvider umlClockItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLClockAdapter() {
		if (umlClockItemProvider == null) {
			umlClockItemProvider = new UMLClockItemProvider(this);
		}

		return umlClockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRealtimeComplexStateItemProvider umlRealtimeComplexStateItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLRealtimeComplexStateAdapter() {
		if (umlRealtimeComplexStateItemProvider == null) {
			umlRealtimeComplexStateItemProvider = new UMLRealtimeComplexStateItemProvider(this);
		}

		return umlRealtimeComplexStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInterfaceStatechart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLInterfaceStatechartItemProvider umlInterfaceStatechartItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInterfaceStatechart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLInterfaceStatechartAdapter() {
		if (umlInterfaceStatechartItemProvider == null) {
			umlInterfaceStatechartItemProvider = new UMLInterfaceStatechartItemProvider(this);
		}

		return umlInterfaceStatechartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLInvariantAtomItemProvider umlInvariantAtomItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLInvariantAtomAdapter() {
		if (umlInvariantAtomItemProvider == null) {
			umlInvariantAtomItemProvider = new UMLInvariantAtomItemProvider(this);
		}

		return umlInvariantAtomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRealtimeActionItemProvider umlRealtimeActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLRealtimeActionAdapter() {
		if (umlRealtimeActionItemProvider == null) {
			umlRealtimeActionItemProvider = new UMLRealtimeActionItemProvider(this);
		}

		return umlRealtimeActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRealtimeEventItemProvider umlRealtimeEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLRealtimeEventAdapter() {
		if (umlRealtimeEventItemProvider == null) {
			umlRealtimeEventItemProvider = new UMLRealtimeEventItemProvider(this);
		}

		return umlRealtimeEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRealtimeFadingFunctionItemProvider umlRealtimeFadingFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLRealtimeFadingFunctionAdapter() {
		if (umlRealtimeFadingFunctionItemProvider == null) {
			umlRealtimeFadingFunctionItemProvider = new UMLRealtimeFadingFunctionItemProvider(this);
		}

		return umlRealtimeFadingFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRealtimeFlatSwitchingItemProvider umlRealtimeFlatSwitchingItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLRealtimeFlatSwitchingAdapter() {
		if (umlRealtimeFlatSwitchingItemProvider == null) {
			umlRealtimeFlatSwitchingItemProvider = new UMLRealtimeFlatSwitchingItemProvider(this);
		}

		return umlRealtimeFlatSwitchingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRealtimeStartStateItemProvider umlRealtimeStartStateItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLRealtimeStartStateAdapter() {
		if (umlRealtimeStartStateItemProvider == null) {
			umlRealtimeStartStateItemProvider = new UMLRealtimeStartStateItemProvider(this);
		}

		return umlRealtimeStartStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRealtimeStatechartItemProvider umlRealtimeStatechartItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLRealtimeStatechartAdapter() {
		if (umlRealtimeStatechartItemProvider == null) {
			umlRealtimeStatechartItemProvider = new UMLRealtimeStatechartItemProvider(this);
		}

		return umlRealtimeStatechartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStopState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRealtimeStopStateItemProvider umlRealtimeStopStateItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStopState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLRealtimeStopStateAdapter() {
		if (umlRealtimeStopStateItemProvider == null) {
			umlRealtimeStopStateItemProvider = new UMLRealtimeStopStateItemProvider(this);
		}

		return umlRealtimeStopStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRealtimeTransitionItemProvider umlRealtimeTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLRealtimeTransitionAdapter() {
		if (umlRealtimeTransitionItemProvider == null) {
			umlRealtimeTransitionItemProvider = new UMLRealtimeTransitionItemProvider(this);
		}

		return umlRealtimeTransitionItemProvider;
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
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeguardAtom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLTimeguardAtomItemProvider umlTimeguardAtomItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeguardAtom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLTimeguardAtomAdapter() {
		if (umlTimeguardAtomItemProvider == null) {
			umlTimeguardAtomItemProvider = new UMLTimeguardAtomItemProvider(this);
		}

		return umlTimeguardAtomItemProvider;
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
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoEventItemProvider doEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoEventAdapter() {
		if (doEventItemProvider == null) {
			doEventItemProvider = new DoEventItemProvider(this);
		}

		return doEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryOrExitEventItemProvider entryOrExitEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntryOrExitEventAdapter() {
		if (entryOrExitEventItemProvider == null) {
			entryOrExitEventItemProvider = new EntryOrExitEventItemProvider(this);
		}

		return entryOrExitEventItemProvider;
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
		if (umlClockItemProvider != null) umlClockItemProvider.dispose();
		if (umlRealtimeComplexStateItemProvider != null) umlRealtimeComplexStateItemProvider.dispose();
		if (umlInterfaceStatechartItemProvider != null) umlInterfaceStatechartItemProvider.dispose();
		if (umlInvariantAtomItemProvider != null) umlInvariantAtomItemProvider.dispose();
		if (umlRealtimeActionItemProvider != null) umlRealtimeActionItemProvider.dispose();
		if (umlRealtimeEventItemProvider != null) umlRealtimeEventItemProvider.dispose();
		if (umlRealtimeFadingFunctionItemProvider != null) umlRealtimeFadingFunctionItemProvider.dispose();
		if (umlRealtimeFlatSwitchingItemProvider != null) umlRealtimeFlatSwitchingItemProvider.dispose();
		if (umlRealtimeStartStateItemProvider != null) umlRealtimeStartStateItemProvider.dispose();
		if (umlRealtimeStatechartItemProvider != null) umlRealtimeStatechartItemProvider.dispose();
		if (umlRealtimeStopStateItemProvider != null) umlRealtimeStopStateItemProvider.dispose();
		if (umlRealtimeTransitionItemProvider != null) umlRealtimeTransitionItemProvider.dispose();
		if (synchronizationChannelItemProvider != null) synchronizationChannelItemProvider.dispose();
		if (umlTimeguardAtomItemProvider != null) umlTimeguardAtomItemProvider.dispose();
		if (historyStateItemProvider != null) historyStateItemProvider.dispose();
		if (doEventItemProvider != null) doEventItemProvider.dispose();
		if (entryOrExitEventItemProvider != null) entryOrExitEventItemProvider.dispose();
		if (synchronizationItemProvider != null) synchronizationItemProvider.dispose();
	}

}
