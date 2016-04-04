/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st.provider;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.util.StAdapterFactory;

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
public class StItemProviderAdapterFactory extends StAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public StItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Operator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorItemProvider operatorItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperatorAdapter() {
		if (operatorItemProvider == null) {
			operatorItemProvider = new OperatorItemProvider(this);
		}

		return operatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryExpressionItemProvider primaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimaryExpressionAdapter() {
		if (primaryExpressionItemProvider == null) {
			primaryExpressionItemProvider = new PrimaryExpressionItemProvider(this);
		}

		return primaryExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.UnaryOperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryOperatorItemProvider unaryOperatorItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnaryOperatorAdapter() {
		if (unaryOperatorItemProvider == null) {
			unaryOperatorItemProvider = new UnaryOperatorItemProvider(this);
		}

		return unaryOperatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FunctionInvocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionInvocationItemProvider functionInvocationItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FunctionInvocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionInvocationAdapter() {
		if (functionInvocationItemProvider == null) {
			functionInvocationItemProvider = new FunctionInvocationItemProvider(this);
		}

		return functionInvocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.StatementList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementListItemProvider statementListItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.StatementList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatementListAdapter() {
		if (statementListItemProvider == null) {
			statementListItemProvider = new StatementListItemProvider(this);
		}

		return statementListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.AssignmentStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentStatementItemProvider assignmentStatementItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.AssignmentStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentStatementAdapter() {
		if (assignmentStatementItemProvider == null) {
			assignmentStatementItemProvider = new AssignmentStatementItemProvider(this);
		}

		return assignmentStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.NILStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NILStatementItemProvider nilStatementItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.NILStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNILStatementAdapter() {
		if (nilStatementItemProvider == null) {
			nilStatementItemProvider = new NILStatementItemProvider(this);
		}

		return nilStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FBInvocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FBInvocationItemProvider fbInvocationItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FBInvocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFBInvocationAdapter() {
		if (fbInvocationItemProvider == null) {
			fbInvocationItemProvider = new FBInvocationItemProvider(this);
		}

		return fbInvocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Return} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnItemProvider returnItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Return}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReturnAdapter() {
		if (returnItemProvider == null) {
			returnItemProvider = new ReturnItemProvider(this);
		}

		return returnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamImplicationItemProvider paramImplicationItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParamImplicationAdapter() {
		if (paramImplicationItemProvider == null) {
			paramImplicationItemProvider = new ParamImplicationItemProvider(this);
		}

		return paramImplicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamExpressionItemProvider paramExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParamExpressionAdapter() {
		if (paramExpressionItemProvider == null) {
			paramExpressionItemProvider = new ParamExpressionItemProvider(this);
		}

		return paramExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementItemProvider ifStatementItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement}.
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
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseStatementItemProvider caseStatementItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCaseStatementAdapter() {
		if (caseStatementItemProvider == null) {
			caseStatementItemProvider = new CaseStatementItemProvider(this);
		}

		return caseStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Else} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElseItemProvider elseItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Else}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElseAdapter() {
		if (elseItemProvider == null) {
			elseItemProvider = new ElseItemProvider(this);
		}

		return elseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseElementItemProvider caseElementItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCaseElementAdapter() {
		if (caseElementItemProvider == null) {
			caseElementItemProvider = new CaseElementItemProvider(this);
		}

		return caseElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForStatementItemProvider forStatementItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForStatementAdapter() {
		if (forStatementItemProvider == null) {
			forStatementItemProvider = new ForStatementItemProvider(this);
		}

		return forStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.WhileStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileStatementItemProvider whileStatementItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.WhileStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhileStatementAdapter() {
		if (whileStatementItemProvider == null) {
			whileStatementItemProvider = new WhileStatementItemProvider(this);
		}

		return whileStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.RepeatStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatStatementItemProvider repeatStatementItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.RepeatStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepeatStatementAdapter() {
		if (repeatStatementItemProvider == null) {
			repeatStatementItemProvider = new RepeatStatementItemProvider(this);
		}

		return repeatStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ExitStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitStatementItemProvider exitStatementItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ExitStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExitStatementAdapter() {
		if (exitStatementItemProvider == null) {
			exitStatementItemProvider = new ExitStatementItemProvider(this);
		}

		return exitStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.VariableRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableRefItemProvider variableRefItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.VariableRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableRefAdapter() {
		if (variableRefItemProvider == null) {
			variableRefItemProvider = new VariableRefItemProvider(this);
		}

		return variableRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.EnumeratedValueRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedValueRefItemProvider enumeratedValueRefItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.EnumeratedValueRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumeratedValueRefAdapter() {
		if (enumeratedValueRefItemProvider == null) {
			enumeratedValueRefItemProvider = new EnumeratedValueRefItemProvider(this);
		}

		return enumeratedValueRefItemProvider;
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
		if (operatorItemProvider != null) operatorItemProvider.dispose();
		if (primaryExpressionItemProvider != null) primaryExpressionItemProvider.dispose();
		if (unaryOperatorItemProvider != null) unaryOperatorItemProvider.dispose();
		if (functionInvocationItemProvider != null) functionInvocationItemProvider.dispose();
		if (statementListItemProvider != null) statementListItemProvider.dispose();
		if (assignmentStatementItemProvider != null) assignmentStatementItemProvider.dispose();
		if (nilStatementItemProvider != null) nilStatementItemProvider.dispose();
		if (fbInvocationItemProvider != null) fbInvocationItemProvider.dispose();
		if (returnItemProvider != null) returnItemProvider.dispose();
		if (paramImplicationItemProvider != null) paramImplicationItemProvider.dispose();
		if (paramExpressionItemProvider != null) paramExpressionItemProvider.dispose();
		if (ifStatementItemProvider != null) ifStatementItemProvider.dispose();
		if (caseStatementItemProvider != null) caseStatementItemProvider.dispose();
		if (elseItemProvider != null) elseItemProvider.dispose();
		if (caseElementItemProvider != null) caseElementItemProvider.dispose();
		if (forStatementItemProvider != null) forStatementItemProvider.dispose();
		if (whileStatementItemProvider != null) whileStatementItemProvider.dispose();
		if (repeatStatementItemProvider != null) repeatStatementItemProvider.dispose();
		if (exitStatementItemProvider != null) exitStatementItemProvider.dispose();
		if (variableRefItemProvider != null) variableRefItemProvider.dispose();
		if (enumeratedValueRefItemProvider != null) enumeratedValueRefItemProvider.dispose();
	}

}