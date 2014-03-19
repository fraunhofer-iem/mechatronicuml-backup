/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.provider;

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

import de.uni_paderborn.fujaba.muml.component.util.ComponentAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProviderAdapterFactory extends ComponentAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public ComponentItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.component.ContinuousPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousPortItemProvider continuousPortItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.component.ContinuousPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContinuousPortAdapter() {
		if (continuousPortItemProvider == null) {
			continuousPortItemProvider = new ContinuousPortItemProvider(this);
		}

		return continuousPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.component.DiscretePort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscretePortItemProvider discretePortItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.component.DiscretePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiscretePortAdapter() {
		if (discretePortItemProvider == null) {
			discretePortItemProvider = new DiscretePortItemProvider(this);
		}

		return discretePortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.component.ComponentPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPartItemProvider componentPartItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.component.ComponentPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentPartAdapter() {
		if (componentPartItemProvider == null) {
			componentPartItemProvider = new ComponentPartItemProvider(this);
		}

		return componentPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.component.StaticStructuredComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticStructuredComponentItemProvider staticStructuredComponentItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.component.StaticStructuredComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaticStructuredComponentAdapter() {
		if (staticStructuredComponentItemProvider == null) {
			staticStructuredComponentItemProvider = new StaticStructuredComponentItemProvider(this);
		}

		return staticStructuredComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.component.AssemblyConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorItemProvider assemblyConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.component.AssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblyConnectorAdapter() {
		if (assemblyConnectorItemProvider == null) {
			assemblyConnectorItemProvider = new AssemblyConnectorItemProvider(this);
		}

		return assemblyConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.component.DelegationConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationConnectorItemProvider delegationConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.component.DelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelegationConnectorAdapter() {
		if (delegationConnectorItemProvider == null) {
			delegationConnectorItemProvider = new DelegationConnectorItemProvider(this);
		}

		return delegationConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.component.HybridPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridPortItemProvider hybridPortItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.component.HybridPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHybridPortAdapter() {
		if (hybridPortItemProvider == null) {
			hybridPortItemProvider = new HybridPortItemProvider(this);
		}

		return hybridPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.component.CoordinationProtocolPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationProtocolPartItemProvider coordinationProtocolPartItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.component.CoordinationProtocolPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoordinationProtocolPartAdapter() {
		if (coordinationProtocolPartItemProvider == null) {
			coordinationProtocolPartItemProvider = new CoordinationProtocolPartItemProvider(this);
		}

		return coordinationProtocolPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.component.PortPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortPartItemProvider portPartItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.component.PortPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortPartAdapter() {
		if (portPartItemProvider == null) {
			portPartItemProvider = new PortPartItemProvider(this);
		}

		return portPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.component.StaticAtomicComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticAtomicComponentItemProvider staticAtomicComponentItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.component.StaticAtomicComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaticAtomicComponentAdapter() {
		if (staticAtomicComponentItemProvider == null) {
			staticAtomicComponentItemProvider = new StaticAtomicComponentItemProvider(this);
		}

		return staticAtomicComponentItemProvider;
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
		if (continuousPortItemProvider != null) continuousPortItemProvider.dispose();
		if (discretePortItemProvider != null) discretePortItemProvider.dispose();
		if (componentPartItemProvider != null) componentPartItemProvider.dispose();
		if (staticStructuredComponentItemProvider != null) staticStructuredComponentItemProvider.dispose();
		if (assemblyConnectorItemProvider != null) assemblyConnectorItemProvider.dispose();
		if (delegationConnectorItemProvider != null) delegationConnectorItemProvider.dispose();
		if (hybridPortItemProvider != null) hybridPortItemProvider.dispose();
		if (coordinationProtocolPartItemProvider != null) coordinationProtocolPartItemProvider.dispose();
		if (portPartItemProvider != null) portPartItemProvider.dispose();
		if (staticAtomicComponentItemProvider != null) staticAtomicComponentItemProvider.dispose();
	}

}
