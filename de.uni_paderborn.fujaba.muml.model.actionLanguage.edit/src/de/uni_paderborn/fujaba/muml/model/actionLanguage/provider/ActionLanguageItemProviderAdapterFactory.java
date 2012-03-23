/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage.provider;

import de.uni_paderborn.fujaba.muml.model.actionLanguage.util.ActionLanguageAdapterFactory;

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
public class ActionLanguageItemProviderAdapterFactory extends ActionLanguageAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public ActionLanguageItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextualExpressionItemProvider textualExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextualExpressionAdapter() {
		if (textualExpressionItemProvider == null) {
			textualExpressionItemProvider = new TextualExpressionItemProvider(this);
		}

		return textualExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.LiteralExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralExpressionItemProvider literalExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.LiteralExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiteralExpressionAdapter() {
		if (literalExpressionItemProvider == null) {
			literalExpressionItemProvider = new LiteralExpressionItemProvider(this);
		}

		return literalExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryExpressionItemProvider unaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnaryExpressionAdapter() {
		if (unaryExpressionItemProvider == null) {
			unaryExpressionItemProvider = new UnaryExpressionItemProvider(this);
		}

		return unaryExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparisonExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonExpressionItemProvider comparisonExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparisonExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComparisonExpressionAdapter() {
		if (comparisonExpressionItemProvider == null) {
			comparisonExpressionItemProvider = new ComparisonExpressionItemProvider(this);
		}

		return comparisonExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticExpressionItemProvider arithmeticExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArithmeticExpressionAdapter() {
		if (arithmeticExpressionItemProvider == null) {
			arithmeticExpressionItemProvider = new ArithmeticExpressionItemProvider(this);
		}

		return arithmeticExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.BinaryLogicExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryLogicExpressionItemProvider binaryLogicExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.BinaryLogicExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryLogicExpressionAdapter() {
		if (binaryLogicExpressionItemProvider == null) {
			binaryLogicExpressionItemProvider = new BinaryLogicExpressionItemProvider(this);
		}

		return binaryLogicExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Block} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockItemProvider blockItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBlockAdapter() {
		if (blockItemProvider == null) {
			blockItemProvider = new BlockItemProvider(this);
		}

		return blockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.WhileLoop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileLoopItemProvider whileLoopItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.WhileLoop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhileLoopAdapter() {
		if (whileLoopItemProvider == null) {
			whileLoopItemProvider = new WhileLoopItemProvider(this);
		}

		return whileLoopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.DoWhileLoop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoWhileLoopItemProvider doWhileLoopItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.DoWhileLoop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoWhileLoopAdapter() {
		if (doWhileLoopItemProvider == null) {
			doWhileLoopItemProvider = new DoWhileLoopItemProvider(this);
		}

		return doWhileLoopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentItemProvider assignmentItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentAdapter() {
		if (assignmentItemProvider == null) {
			assignmentItemProvider = new AssignmentItemProvider(this);
		}

		return assignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForLoopItemProvider forLoopItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForLoopAdapter() {
		if (forLoopItemProvider == null) {
			forLoopItemProvider = new ForLoopItemProvider(this);
		}

		return forLoopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementItemProvider ifStatementItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfStatementAdapter() {
		if (ifStatementItemProvider == null) {
			ifStatementItemProvider = new IfStatementItemProvider(this);
		}

		return ifStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.AttributeExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeExpressionItemProvider attributeExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.AttributeExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeExpressionAdapter() {
		if (attributeExpressionItemProvider == null) {
			attributeExpressionItemProvider = new AttributeExpressionItemProvider(this);
		}

		return attributeExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationCallItemProvider operationCallItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationCallAdapter() {
		if (operationCallItemProvider == null) {
			operationCallItemProvider = new OperationCallItemProvider(this);
		}

		return operationCallItemProvider;
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
		if (textualExpressionItemProvider != null) textualExpressionItemProvider.dispose();
		if (literalExpressionItemProvider != null) literalExpressionItemProvider.dispose();
		if (unaryExpressionItemProvider != null) unaryExpressionItemProvider.dispose();
		if (comparisonExpressionItemProvider != null) comparisonExpressionItemProvider.dispose();
		if (arithmeticExpressionItemProvider != null) arithmeticExpressionItemProvider.dispose();
		if (binaryLogicExpressionItemProvider != null) binaryLogicExpressionItemProvider.dispose();
		if (blockItemProvider != null) blockItemProvider.dispose();
		if (whileLoopItemProvider != null) whileLoopItemProvider.dispose();
		if (doWhileLoopItemProvider != null) doWhileLoopItemProvider.dispose();
		if (assignmentItemProvider != null) assignmentItemProvider.dispose();
		if (forLoopItemProvider != null) forLoopItemProvider.dispose();
		if (ifStatementItemProvider != null) ifStatementItemProvider.dispose();
		if (attributeExpressionItemProvider != null) attributeExpressionItemProvider.dispose();
		if (operationCallItemProvider != null) operationCallItemProvider.dispose();
	}

}
