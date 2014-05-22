/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.provider;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.util.SetsAdapterFactory;

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
public class SetsItemProviderAdapterFactory extends SetsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public SetsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ClockSetExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockSetExprItemProvider clockSetExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ClockSetExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClockSetExprAdapter() {
		if (clockSetExprItemProvider == null) {
			clockSetExprItemProvider = new ClockSetExprItemProvider(this);
		}

		return clockSetExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.IntervalSetExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalSetExprItemProvider intervalSetExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.IntervalSetExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntervalSetExprAdapter() {
		if (intervalSetExprItemProvider == null) {
			intervalSetExprItemProvider = new IntervalSetExprItemProvider(this);
		}

		return intervalSetExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.MessageSetExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageSetExprItemProvider messageSetExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.MessageSetExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageSetExprAdapter() {
		if (messageSetExprItemProvider == null) {
			messageSetExprItemProvider = new MessageSetExprItemProvider(this);
		}

		return messageSetExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.StateSetExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateSetExprItemProvider stateSetExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.StateSetExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateSetExprAdapter() {
		if (stateSetExprItemProvider == null) {
			stateSetExprItemProvider = new StateSetExprItemProvider(this);
		}

		return stateSetExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.TransitionSetExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionSetExprItemProvider transitionSetExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.TransitionSetExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionSetExprAdapter() {
		if (transitionSetExprItemProvider == null) {
			transitionSetExprItemProvider = new TransitionSetExprItemProvider(this);
		}

		return transitionSetExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.BufferSetExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferSetExprItemProvider bufferSetExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.BufferSetExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBufferSetExprAdapter() {
		if (bufferSetExprItemProvider == null) {
			bufferSetExprItemProvider = new BufferSetExprItemProvider(this);
		}

		return bufferSetExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ConnectorEndpointInstanceSetExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorEndpointInstanceSetExprItemProvider connectorEndpointInstanceSetExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ConnectorEndpointInstanceSetExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectorEndpointInstanceSetExprAdapter() {
		if (connectorEndpointInstanceSetExprItemProvider == null) {
			connectorEndpointInstanceSetExprItemProvider = new ConnectorEndpointInstanceSetExprItemProvider(this);
		}

		return connectorEndpointInstanceSetExprItemProvider;
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
		if (clockSetExprItemProvider != null) clockSetExprItemProvider.dispose();
		if (intervalSetExprItemProvider != null) intervalSetExprItemProvider.dispose();
		if (messageSetExprItemProvider != null) messageSetExprItemProvider.dispose();
		if (stateSetExprItemProvider != null) stateSetExprItemProvider.dispose();
		if (transitionSetExprItemProvider != null) transitionSetExprItemProvider.dispose();
		if (bufferSetExprItemProvider != null) bufferSetExprItemProvider.dispose();
		if (connectorEndpointInstanceSetExprItemProvider != null) connectorEndpointInstanceSetExprItemProvider.dispose();
	}

}
