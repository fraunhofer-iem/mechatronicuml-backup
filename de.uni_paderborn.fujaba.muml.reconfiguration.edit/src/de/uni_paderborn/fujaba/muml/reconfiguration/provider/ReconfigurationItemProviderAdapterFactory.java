/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.provider;

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

import de.uni_paderborn.fujaba.muml.reconfiguration.util.ReconfigurationAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReconfigurationItemProviderAdapterFactory extends ReconfigurationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public ReconfigurationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurableStructuredComponentItemProvider reconfigurableStructuredComponentItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReconfigurableStructuredComponentAdapter() {
		if (reconfigurableStructuredComponentItemProvider == null) {
			reconfigurableStructuredComponentItemProvider = new ReconfigurableStructuredComponentItemProvider(this);
		}

		return reconfigurableStructuredComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerItemProvider managerItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createManagerAdapter() {
		if (managerItemProvider == null) {
			managerItemProvider = new ManagerItemProvider(this);
		}

		return managerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.reconfiguration.Executor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutorItemProvider executorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.reconfiguration.Executor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutorAdapter() {
		if (executorItemProvider == null) {
			executorItemProvider = new ExecutorItemProvider(this);
		}

		return executorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationMessagePortItemProvider reconfigurationMessagePortItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReconfigurationMessagePortAdapter() {
		if (reconfigurationMessagePortItemProvider == null) {
			reconfigurationMessagePortItemProvider = new ReconfigurationMessagePortItemProvider(this);
		}

		return reconfigurationMessagePortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationExecutionPortItemProvider reconfigurationExecutionPortItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReconfigurationExecutionPortAdapter() {
		if (reconfigurationExecutionPortItemProvider == null) {
			reconfigurationExecutionPortItemProvider = new ReconfigurationExecutionPortItemProvider(this);
		}

		return reconfigurationExecutionPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutorSpecificationEntryItemProvider executorSpecificationEntryItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutorSpecificationEntryAdapter() {
		if (executorSpecificationEntryItemProvider == null) {
			executorSpecificationEntryItemProvider = new ExecutorSpecificationEntryItemProvider(this);
		}

		return executorSpecificationEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerSpecificationEntryItemProvider managerSpecificationEntryItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createManagerSpecificationEntryAdapter() {
		if (managerSpecificationEntryItemProvider == null) {
			managerSpecificationEntryItemProvider = new ManagerSpecificationEntryItemProvider(this);
		}

		return managerSpecificationEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleBasedReconfigurationControllerItemProvider ruleBasedReconfigurationControllerItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuleBasedReconfigurationControllerAdapter() {
		if (ruleBasedReconfigurationControllerItemProvider == null) {
			ruleBasedReconfigurationControllerItemProvider = new RuleBasedReconfigurationControllerItemProvider(this);
		}

		return ruleBasedReconfigurationControllerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationPortInterfaceEntryItemProvider reconfigurationPortInterfaceEntryItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReconfigurationPortInterfaceEntryAdapter() {
		if (reconfigurationPortInterfaceEntryItemProvider == null) {
			reconfigurationPortInterfaceEntryItemProvider = new ReconfigurationPortInterfaceEntryItemProvider(this);
		}

		return reconfigurationPortInterfaceEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationMessagePortInterfaceEntryItemProvider reconfigurationMessagePortInterfaceEntryItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReconfigurationMessagePortInterfaceEntryAdapter() {
		if (reconfigurationMessagePortInterfaceEntryItemProvider == null) {
			reconfigurationMessagePortInterfaceEntryItemProvider = new ReconfigurationMessagePortInterfaceEntryItemProvider(this);
		}

		return reconfigurationMessagePortInterfaceEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationExecutionPortInterfaceEntryItemProvider reconfigurationExecutionPortInterfaceEntryItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReconfigurationExecutionPortInterfaceEntryAdapter() {
		if (reconfigurationExecutionPortInterfaceEntryItemProvider == null) {
			reconfigurationExecutionPortInterfaceEntryItemProvider = new ReconfigurationExecutionPortInterfaceEntryItemProvider(this);
		}

		return reconfigurationExecutionPortInterfaceEntryItemProvider;
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
		if (reconfigurableStructuredComponentItemProvider != null) reconfigurableStructuredComponentItemProvider.dispose();
		if (managerItemProvider != null) managerItemProvider.dispose();
		if (executorItemProvider != null) executorItemProvider.dispose();
		if (reconfigurationMessagePortItemProvider != null) reconfigurationMessagePortItemProvider.dispose();
		if (reconfigurationExecutionPortItemProvider != null) reconfigurationExecutionPortItemProvider.dispose();
		if (executorSpecificationEntryItemProvider != null) executorSpecificationEntryItemProvider.dispose();
		if (managerSpecificationEntryItemProvider != null) managerSpecificationEntryItemProvider.dispose();
		if (ruleBasedReconfigurationControllerItemProvider != null) ruleBasedReconfigurationControllerItemProvider.dispose();
		if (reconfigurationPortInterfaceEntryItemProvider != null) reconfigurationPortInterfaceEntryItemProvider.dispose();
		if (reconfigurationMessagePortInterfaceEntryItemProvider != null) reconfigurationMessagePortInterfaceEntryItemProvider.dispose();
		if (reconfigurationExecutionPortInterfaceEntryItemProvider != null) reconfigurationExecutionPortInterfaceEntryItemProvider.dispose();
	}

}
