/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component.provider;

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

import de.uni_paderborn.fujaba.umlrt.model.component.util.ComponentAdapterFactory;

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
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.component.ContinuousComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousComponentItemProvider continuousComponentItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.component.ContinuousComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContinuousComponentAdapter() {
		if (continuousComponentItemProvider == null) {
			continuousComponentItemProvider = new ContinuousComponentItemProvider(this);
		}

		return continuousComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.component.Port} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortItemProvider portItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.component.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortAdapter() {
		if (portItemProvider == null) {
			portItemProvider = new PortItemProvider(this);
		}

		return portItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.component.ContinuousPortSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousPortSpecificationItemProvider continuousPortSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.component.ContinuousPortSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContinuousPortSpecificationAdapter() {
		if (continuousPortSpecificationItemProvider == null) {
			continuousPortSpecificationItemProvider = new ContinuousPortSpecificationItemProvider(this);
		}

		return continuousPortSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscretePortSpecificationItemProvider discretePortSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiscretePortSpecificationAdapter() {
		if (discretePortSpecificationItemProvider == null) {
			discretePortSpecificationItemProvider = new DiscretePortSpecificationItemProvider(this);
		}

		return discretePortSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.component.HardwarePortSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwarePortSpecificationItemProvider hardwarePortSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.component.HardwarePortSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHardwarePortSpecificationAdapter() {
		if (hardwarePortSpecificationItemProvider == null) {
			hardwarePortSpecificationItemProvider = new HardwarePortSpecificationItemProvider(this);
		}

		return hardwarePortSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPartItemProvider componentPartItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart}.
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
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredComponentItemProvider structuredComponentItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructuredComponentAdapter() {
		if (structuredComponentItemProvider == null) {
			structuredComponentItemProvider = new StructuredComponentItemProvider(this);
		}

		return structuredComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.component.AtomicComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicComponentItemProvider atomicComponentItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.component.AtomicComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtomicComponentAdapter() {
		if (atomicComponentItemProvider == null) {
			atomicComponentItemProvider = new AtomicComponentItemProvider(this);
		}

		return atomicComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.component.Assembly} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyItemProvider assemblyItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.component.Assembly}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblyAdapter() {
		if (assemblyItemProvider == null) {
			assemblyItemProvider = new AssemblyItemProvider(this);
		}

		return assemblyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.umlrt.model.component.Delegation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationItemProvider delegationItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.component.Delegation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelegationAdapter() {
		if (delegationItemProvider == null) {
			delegationItemProvider = new DelegationItemProvider(this);
		}

		return delegationItemProvider;
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
		if (continuousComponentItemProvider != null) continuousComponentItemProvider.dispose();
		if (portItemProvider != null) portItemProvider.dispose();
		if (continuousPortSpecificationItemProvider != null) continuousPortSpecificationItemProvider.dispose();
		if (discretePortSpecificationItemProvider != null) discretePortSpecificationItemProvider.dispose();
		if (hardwarePortSpecificationItemProvider != null) hardwarePortSpecificationItemProvider.dispose();
		if (componentPartItemProvider != null) componentPartItemProvider.dispose();
		if (structuredComponentItemProvider != null) structuredComponentItemProvider.dispose();
		if (atomicComponentItemProvider != null) atomicComponentItemProvider.dispose();
		if (assemblyItemProvider != null) assemblyItemProvider.dispose();
		if (delegationItemProvider != null) delegationItemProvider.dispose();
	}

}
