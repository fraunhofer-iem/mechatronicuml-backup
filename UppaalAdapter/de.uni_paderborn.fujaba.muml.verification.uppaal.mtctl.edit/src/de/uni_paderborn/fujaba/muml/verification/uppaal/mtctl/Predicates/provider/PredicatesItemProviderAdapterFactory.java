/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.provider;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.util.PredicatesAdapterFactory;

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
public class PredicatesItemProviderAdapterFactory extends PredicatesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public PredicatesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.DeadlockExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeadlockExprItemProvider deadlockExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.DeadlockExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeadlockExprAdapter() {
		if (deadlockExprItemProvider == null) {
			deadlockExprItemProvider = new DeadlockExprItemProvider(this);
		}

		return deadlockExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ConnectorOverflowExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorOverflowExprItemProvider connectorOverflowExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ConnectorOverflowExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectorOverflowExprAdapter() {
		if (connectorOverflowExprItemProvider == null) {
			connectorOverflowExprItemProvider = new ConnectorOverflowExprItemProvider(this);
		}

		return connectorOverflowExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonExprItemProvider comparisonExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComparisonExprAdapter() {
		if (comparisonExprItemProvider == null) {
			comparisonExprItemProvider = new ComparisonExprItemProvider(this);
		}

		return comparisonExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInBufferExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageInBufferExprItemProvider messageInBufferExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInBufferExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageInBufferExprAdapter() {
		if (messageInBufferExprItemProvider == null) {
			messageInBufferExprItemProvider = new MessageInBufferExprItemProvider(this);
		}

		return messageInBufferExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInTransitExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageInTransitExprItemProvider messageInTransitExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInTransitExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageInTransitExprAdapter() {
		if (messageInTransitExprItemProvider == null) {
			messageInTransitExprItemProvider = new MessageInTransitExprItemProvider(this);
		}

		return messageInTransitExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateActiveExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateActiveExprItemProvider stateActiveExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateActiveExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateActiveExprAdapter() {
		if (stateActiveExprItemProvider == null) {
			stateActiveExprItemProvider = new StateActiveExprItemProvider(this);
		}

		return stateActiveExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.SubstateOfExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstateOfExprItemProvider substateOfExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.SubstateOfExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubstateOfExprAdapter() {
		if (substateOfExprItemProvider == null) {
			substateOfExprItemProvider = new SubstateOfExprItemProvider(this);
		}

		return substateOfExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TransitionFiringExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionFiringExprItemProvider transitionFiringExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TransitionFiringExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionFiringExprAdapter() {
		if (transitionFiringExprItemProvider == null) {
			transitionFiringExprItemProvider = new TransitionFiringExprItemProvider(this);
		}

		return transitionFiringExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicateExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateExprItemProvider predicateExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicateExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredicateExprAdapter() {
		if (predicateExprItemProvider == null) {
			predicateExprItemProvider = new PredicateExprItemProvider(this);
		}

		return predicateExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TrueExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrueExprItemProvider trueExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TrueExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrueExprAdapter() {
		if (trueExprItemProvider == null) {
			trueExprItemProvider = new TrueExprItemProvider(this);
		}

		return trueExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.FalseExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FalseExprItemProvider falseExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.FalseExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFalseExprAdapter() {
		if (falseExprItemProvider == null) {
			falseExprItemProvider = new FalseExprItemProvider(this);
		}

		return falseExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateInStatechartExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateInStatechartExprItemProvider stateInStatechartExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateInStatechartExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateInStatechartExprAdapter() {
		if (stateInStatechartExprItemProvider == null) {
			stateInStatechartExprItemProvider = new StateInStatechartExprItemProvider(this);
		}

		return stateInStatechartExprItemProvider;
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
		if (deadlockExprItemProvider != null) deadlockExprItemProvider.dispose();
		if (connectorOverflowExprItemProvider != null) connectorOverflowExprItemProvider.dispose();
		if (comparisonExprItemProvider != null) comparisonExprItemProvider.dispose();
		if (messageInBufferExprItemProvider != null) messageInBufferExprItemProvider.dispose();
		if (messageInTransitExprItemProvider != null) messageInTransitExprItemProvider.dispose();
		if (stateActiveExprItemProvider != null) stateActiveExprItemProvider.dispose();
		if (substateOfExprItemProvider != null) substateOfExprItemProvider.dispose();
		if (transitionFiringExprItemProvider != null) transitionFiringExprItemProvider.dispose();
		if (predicateExprItemProvider != null) predicateExprItemProvider.dispose();
		if (trueExprItemProvider != null) trueExprItemProvider.dispose();
		if (falseExprItemProvider != null) falseExprItemProvider.dispose();
		if (stateInStatechartExprItemProvider != null) stateInStatechartExprItemProvider.dispose();
	}

}
