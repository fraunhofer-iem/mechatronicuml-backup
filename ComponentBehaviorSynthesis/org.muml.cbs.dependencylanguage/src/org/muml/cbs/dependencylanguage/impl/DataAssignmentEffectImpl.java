/**
 */
package org.muml.cbs.dependencylanguage.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.cbs.dependencylanguage.AssignmentDirection;
import org.muml.cbs.dependencylanguage.DataAssignmentEffect;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.mumlcore.CommentableElement;
import org.muml.mumlcore.CorePackage;
import org.muml.mumlcore.ExtendableElement;
import org.muml.mumlcore.Extension;
import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.actionlanguage.ActionlanguagePackage;
import org.muml.pim.actionlanguage.AssignOperator;
import org.muml.pim.actionlanguage.Assignment;
import org.muml.pim.actionlanguage.IncrementDecrementOperator;
import org.muml.pim.actionlanguage.TypedNamedElementExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Assignment Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.DataAssignmentEffectImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.DataAssignmentEffectImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.DataAssignmentEffectImpl#getAssignOperator <em>Assign Operator</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.DataAssignmentEffectImpl#getRhs_assignExpression <em>Rhs assign Expression</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.DataAssignmentEffectImpl#getIncrementDecrementOperator <em>Increment Decrement Operator</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.DataAssignmentEffectImpl#getLhs_typedNamedElementExpression <em>Lhs typed Named Element Expression</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.DataAssignmentEffectImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAssignmentEffectImpl extends EffectImpl implements DataAssignmentEffect {
	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extensions;

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
	 * The default value of the '{@link #getAssignOperator() <em>Assign Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignOperator()
	 * @generated
	 * @ordered
	 */
	protected static final AssignOperator ASSIGN_OPERATOR_EDEFAULT = AssignOperator.UNSET;

	/**
	 * The cached value of the '{@link #getAssignOperator() <em>Assign Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignOperator()
	 * @generated
	 * @ordered
	 */
	protected AssignOperator assignOperator = ASSIGN_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRhs_assignExpression() <em>Rhs assign Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs_assignExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression rhs_assignExpression;

	/**
	 * The default value of the '{@link #getIncrementDecrementOperator() <em>Increment Decrement Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementDecrementOperator()
	 * @generated
	 * @ordered
	 */
	protected static final IncrementDecrementOperator INCREMENT_DECREMENT_OPERATOR_EDEFAULT = IncrementDecrementOperator.UNSET;

	/**
	 * The cached value of the '{@link #getIncrementDecrementOperator() <em>Increment Decrement Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementDecrementOperator()
	 * @generated
	 * @ordered
	 */
	protected IncrementDecrementOperator incrementDecrementOperator = INCREMENT_DECREMENT_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLhs_typedNamedElementExpression() <em>Lhs typed Named Element Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs_typedNamedElementExpression()
	 * @generated
	 * @ordered
	 */
	protected TypedNamedElementExpression lhs_typedNamedElementExpression;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final AssignmentDirection DIRECTION_EDEFAULT = AssignmentDirection.PUSH;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected AssignmentDirection direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAssignmentEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependencylanguagePackage.Literals.DATA_ASSIGNMENT_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentWithInverseEList<Extension>(Extension.class, this, DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__EXTENSIONS, CorePackage.EXTENSION__EXTENDABLE_BASE);
		}
		return extensions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignOperator getAssignOperator() {
		return assignOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignOperator(AssignOperator newAssignOperator) {
		AssignOperator oldAssignOperator = assignOperator;
		assignOperator = newAssignOperator == null ? ASSIGN_OPERATOR_EDEFAULT : newAssignOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__ASSIGN_OPERATOR, oldAssignOperator, assignOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRhs_assignExpression() {
		return rhs_assignExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs_assignExpression(Expression newRhs_assignExpression, NotificationChain msgs) {
		Expression oldRhs_assignExpression = rhs_assignExpression;
		rhs_assignExpression = newRhs_assignExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__RHS_ASSIGN_EXPRESSION, oldRhs_assignExpression, newRhs_assignExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs_assignExpression(Expression newRhs_assignExpression) {
		if (newRhs_assignExpression != rhs_assignExpression) {
			NotificationChain msgs = null;
			if (rhs_assignExpression != null)
				msgs = ((InternalEObject)rhs_assignExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__RHS_ASSIGN_EXPRESSION, null, msgs);
			if (newRhs_assignExpression != null)
				msgs = ((InternalEObject)newRhs_assignExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__RHS_ASSIGN_EXPRESSION, null, msgs);
			msgs = basicSetRhs_assignExpression(newRhs_assignExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__RHS_ASSIGN_EXPRESSION, newRhs_assignExpression, newRhs_assignExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementDecrementOperator getIncrementDecrementOperator() {
		return incrementDecrementOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementDecrementOperator(IncrementDecrementOperator newIncrementDecrementOperator) {
		IncrementDecrementOperator oldIncrementDecrementOperator = incrementDecrementOperator;
		incrementDecrementOperator = newIncrementDecrementOperator == null ? INCREMENT_DECREMENT_OPERATOR_EDEFAULT : newIncrementDecrementOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__INCREMENT_DECREMENT_OPERATOR, oldIncrementDecrementOperator, incrementDecrementOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedNamedElementExpression getLhs_typedNamedElementExpression() {
		return lhs_typedNamedElementExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs_typedNamedElementExpression(TypedNamedElementExpression newLhs_typedNamedElementExpression, NotificationChain msgs) {
		TypedNamedElementExpression oldLhs_typedNamedElementExpression = lhs_typedNamedElementExpression;
		lhs_typedNamedElementExpression = newLhs_typedNamedElementExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION, oldLhs_typedNamedElementExpression, newLhs_typedNamedElementExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs_typedNamedElementExpression(TypedNamedElementExpression newLhs_typedNamedElementExpression) {
		if (newLhs_typedNamedElementExpression != lhs_typedNamedElementExpression) {
			NotificationChain msgs = null;
			if (lhs_typedNamedElementExpression != null)
				msgs = ((InternalEObject)lhs_typedNamedElementExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION, null, msgs);
			if (newLhs_typedNamedElementExpression != null)
				msgs = ((InternalEObject)newLhs_typedNamedElementExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION, null, msgs);
			msgs = basicSetLhs_typedNamedElementExpression(newLhs_typedNamedElementExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION, newLhs_typedNamedElementExpression, newLhs_typedNamedElementExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(AssignmentDirection newDirection) {
		AssignmentDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension(final EClass type) {
		EList<Extension> extensions = this.getExtensions();
						for (Extension extension : extensions) {
							if (type.isInstance(extension)) {
								return extension;
							}
						}
						return null;
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
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__EXTENSIONS:
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
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__RHS_ASSIGN_EXPRESSION:
				return basicSetRhs_assignExpression(null, msgs);
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION:
				return basicSetLhs_typedNamedElementExpression(null, msgs);
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
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__EXTENSIONS:
				return getExtensions();
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__COMMENT:
				return getComment();
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__ASSIGN_OPERATOR:
				return getAssignOperator();
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__RHS_ASSIGN_EXPRESSION:
				return getRhs_assignExpression();
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__INCREMENT_DECREMENT_OPERATOR:
				return getIncrementDecrementOperator();
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION:
				return getLhs_typedNamedElementExpression();
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__DIRECTION:
				return getDirection();
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
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__EXTENSIONS:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Extension>)newValue);
				return;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__COMMENT:
				setComment((String)newValue);
				return;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__ASSIGN_OPERATOR:
				setAssignOperator((AssignOperator)newValue);
				return;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__RHS_ASSIGN_EXPRESSION:
				setRhs_assignExpression((Expression)newValue);
				return;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__INCREMENT_DECREMENT_OPERATOR:
				setIncrementDecrementOperator((IncrementDecrementOperator)newValue);
				return;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION:
				setLhs_typedNamedElementExpression((TypedNamedElementExpression)newValue);
				return;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__DIRECTION:
				setDirection((AssignmentDirection)newValue);
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
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__EXTENSIONS:
				getExtensions().clear();
				return;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__ASSIGN_OPERATOR:
				setAssignOperator(ASSIGN_OPERATOR_EDEFAULT);
				return;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__RHS_ASSIGN_EXPRESSION:
				setRhs_assignExpression((Expression)null);
				return;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__INCREMENT_DECREMENT_OPERATOR:
				setIncrementDecrementOperator(INCREMENT_DECREMENT_OPERATOR_EDEFAULT);
				return;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION:
				setLhs_typedNamedElementExpression((TypedNamedElementExpression)null);
				return;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__EXTENSIONS:
				return extensions != null && !extensions.isEmpty();
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__ASSIGN_OPERATOR:
				return assignOperator != ASSIGN_OPERATOR_EDEFAULT;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__RHS_ASSIGN_EXPRESSION:
				return rhs_assignExpression != null;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__INCREMENT_DECREMENT_OPERATOR:
				return incrementDecrementOperator != INCREMENT_DECREMENT_OPERATOR_EDEFAULT;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION:
				return lhs_typedNamedElementExpression != null;
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
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
		if (baseClass == ExtendableElement.class) {
			switch (derivedFeatureID) {
				case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__EXTENSIONS: return CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Assignment.class) {
			switch (derivedFeatureID) {
				case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__ASSIGN_OPERATOR: return ActionlanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR;
				case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__RHS_ASSIGN_EXPRESSION: return ActionlanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION;
				case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__INCREMENT_DECREMENT_OPERATOR: return ActionlanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR;
				case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION: return ActionlanguagePackage.ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION;
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
		if (baseClass == ExtendableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS: return DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__EXTENSIONS;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Assignment.class) {
			switch (baseFeatureID) {
				case ActionlanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR: return DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__ASSIGN_OPERATOR;
				case ActionlanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION: return DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__RHS_ASSIGN_EXPRESSION;
				case ActionlanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR: return DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__INCREMENT_DECREMENT_OPERATOR;
				case ActionlanguagePackage.ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION: return DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION;
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
		if (baseClass == ExtendableElement.class) {
			switch (baseOperationID) {
				case CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS: return DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT___GET_EXTENSION__ECLASS;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Assignment.class) {
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
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT___GET_EXTENSION__ECLASS:
				return getExtension((EClass)arguments.get(0));
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", assignOperator: ");
		result.append(assignOperator);
		result.append(", incrementDecrementOperator: ");
		result.append(incrementDecrementOperator);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //DataAssignmentEffectImpl
