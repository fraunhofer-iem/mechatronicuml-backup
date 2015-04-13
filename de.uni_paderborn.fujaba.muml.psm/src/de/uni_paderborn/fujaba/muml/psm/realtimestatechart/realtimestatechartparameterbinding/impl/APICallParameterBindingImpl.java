/**
 */
package de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameterbinding.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.Extension;
import org.storydriven.core.NamedElement;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.util.ExtendableElementOperations;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.behavior.Operation;
import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameterbinding.APICallParameterBinding;
import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage;
import de.uni_paderborn.fujaba.muml.types.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Call Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameterbinding.impl.APICallParameterBindingImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameterbinding.impl.APICallParameterBindingImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameterbinding.impl.APICallParameterBindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameterbinding.impl.APICallParameterBindingImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameterbinding.impl.APICallParameterBindingImpl#getImplementations <em>Implementations</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameterbinding.impl.APICallParameterBindingImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameterbinding.impl.APICallParameterBindingImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameterbinding.impl.APICallParameterBindingImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class APICallParameterBindingImpl extends RealtimeStatechartParameterBindingImpl implements APICallParameterBinding {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<EAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extensions;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = "\"no comment provided\"";

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImplementations() <em>Implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> implementations;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected DataType returnType;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APICallParameterBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartparameterbindingPackage.Literals.API_CALL_PARAMETER_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList.Resolving<EAnnotation>(EAnnotation.class, this, RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__ANNOTATION);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentWithInverseEList.Resolving<Extension>(Extension.class, this, RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXTENSION, CorePackage.EXTENSION__EXTENDABLE_BASE);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getImplementations() {
		if (implementations == null) {
			implementations = new EObjectContainmentEList<Expression>(Expression.class, this, RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__IMPLEMENTATIONS);
		}
		return implementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (DataType)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(DataType newReturnType) {
		DataType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension(final EClass type) {
		return ExtendableElementOperations.getExtension(this, type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension provideExtension(final EClass type) {
		return ExtendableElementOperations.provideExtension(this, type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getAnnotation(final String source) {
		return ExtendableElementOperations.getAnnotation(this, source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation provideAnnotation(final String source) {
		return ExtendableElementOperations.provideAnnotation(this, source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXTENSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__ANNOTATION:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXTENSION:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__IMPLEMENTATIONS:
				return ((InternalEList<?>)getImplementations()).basicRemove(otherEnd, msgs);
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXPRESSION:
				return basicSetExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__ANNOTATION:
				return getAnnotations();
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXTENSION:
				return getExtensions();
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__NAME:
				return getName();
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__COMMENT:
				return getComment();
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__IMPLEMENTATIONS:
				return getImplementations();
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__PARAMETERS:
				return getParameters();
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXPRESSION:
				return getExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__ANNOTATION:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends EAnnotation>)newValue);
				return;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXTENSION:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Extension>)newValue);
				return;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__NAME:
				setName((String)newValue);
				return;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__COMMENT:
				setComment((String)newValue);
				return;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__IMPLEMENTATIONS:
				getImplementations().clear();
				getImplementations().addAll((Collection<? extends Expression>)newValue);
				return;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__RETURN_TYPE:
				setReturnType((DataType)newValue);
				return;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXPRESSION:
				setExpression((Expression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__ANNOTATION:
				getAnnotations().clear();
				return;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXTENSION:
				getExtensions().clear();
				return;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__IMPLEMENTATIONS:
				getImplementations().clear();
				return;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__PARAMETERS:
				getParameters().clear();
				return;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__RETURN_TYPE:
				setReturnType((DataType)null);
				return;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXPRESSION:
				setExpression((Expression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__ANNOTATION:
				return annotations != null && !annotations.isEmpty();
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXTENSION:
				return extensions != null && !extensions.isEmpty();
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__IMPLEMENTATIONS:
				return implementations != null && !implementations.isEmpty();
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__RETURN_TYPE:
				return returnType != null;
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EObject.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__ANNOTATION: return CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;
				case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXTENSION: return CorePackage.EXTENDABLE_ELEMENT__EXTENSION;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__NAME: return CorePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Operation.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__IMPLEMENTATIONS: return BehaviorPackage.OPERATION__IMPLEMENTATIONS;
				case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__PARAMETERS: return BehaviorPackage.OPERATION__PARAMETERS;
				case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__RETURN_TYPE: return BehaviorPackage.OPERATION__RETURN_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.EXTENDABLE_ELEMENT__ANNOTATION: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__ANNOTATION;
				case CorePackage.EXTENDABLE_ELEMENT__EXTENSION: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__EXTENSION;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ELEMENT__NAME: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__NAME;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Operation.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.OPERATION__IMPLEMENTATIONS: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__IMPLEMENTATIONS;
				case BehaviorPackage.OPERATION__PARAMETERS: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__PARAMETERS;
				case BehaviorPackage.OPERATION__RETURN_TYPE: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING__RETURN_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == EObject.class) {
			switch (baseOperationID) {
				case EcorePackage.EOBJECT___ECLASS: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___ECLASS;
				case EcorePackage.EOBJECT___EIS_PROXY: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___EIS_PROXY;
				case EcorePackage.EOBJECT___ERESOURCE: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___ERESOURCE;
				case EcorePackage.EOBJECT___ECONTAINER: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___ECONTAINER;
				case EcorePackage.EOBJECT___ECONTAINING_FEATURE: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___ECONTAINING_FEATURE;
				case EcorePackage.EOBJECT___ECONTAINMENT_FEATURE: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___ECONTAINMENT_FEATURE;
				case EcorePackage.EOBJECT___ECONTENTS: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___ECONTENTS;
				case EcorePackage.EOBJECT___EALL_CONTENTS: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___EALL_CONTENTS;
				case EcorePackage.EOBJECT___ECROSS_REFERENCES: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___ECROSS_REFERENCES;
				case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___EGET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___EGET__ESTRUCTURALFEATURE_BOOLEAN;
				case EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___ESET__ESTRUCTURALFEATURE_OBJECT;
				case EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___EIS_SET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___EUNSET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___EINVOKE__EOPERATION_ELIST;
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (baseOperationID) {
				case CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___GET_EXTENSION__ECLASS;
				case CorePackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___PROVIDE_EXTENSION__ECLASS;
				case CorePackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___GET_ANNOTATION__STRING;
				case CorePackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING: return RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___PROVIDE_ANNOTATION__STRING;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Operation.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___GET_EXTENSION__ECLASS:
				return getExtension((EClass)arguments.get(0));
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___PROVIDE_EXTENSION__ECLASS:
				return provideExtension((EClass)arguments.get(0));
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___GET_ANNOTATION__STRING:
				return getAnnotation((String)arguments.get(0));
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING___PROVIDE_ANNOTATION__STRING:
				return provideAnnotation((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //APICallParameterBindingImpl
