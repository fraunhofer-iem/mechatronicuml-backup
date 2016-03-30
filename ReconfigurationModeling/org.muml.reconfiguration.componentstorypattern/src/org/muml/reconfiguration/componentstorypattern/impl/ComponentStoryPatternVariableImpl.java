/**
 */
package org.muml.reconfiguration.componentstorypattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.core.CommentableElement;
import org.muml.core.CorePackage;
import org.muml.core.impl.NamedElementImpl;
import org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.BindingState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Story Pattern Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.ComponentStoryPatternVariableImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.ComponentStoryPatternVariableImpl#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.ComponentStoryPatternVariableImpl#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.ComponentStoryPatternVariableImpl#getBindingState <em>Binding State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentStoryPatternVariableImpl extends NamedElementImpl implements ComponentStoryPatternVariable {
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
	 * The default value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingSemantics()
	 * @generated
	 * @ordered
	 */
	protected static final BindingSemantics BINDING_SEMANTICS_EDEFAULT = BindingSemantics.MANDATORY;

	/**
	 * The cached value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingSemantics()
	 * @generated
	 * @ordered
	 */
	protected BindingSemantics bindingSemantics = BINDING_SEMANTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBindingOperator() <em>Binding Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BindingOperator BINDING_OPERATOR_EDEFAULT = BindingOperator.CHECK_ONLY;

	/**
	 * The cached value of the '{@link #getBindingOperator() <em>Binding Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingOperator()
	 * @generated
	 * @ordered
	 */
	protected BindingOperator bindingOperator = BINDING_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBindingState() <em>Binding State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingState()
	 * @generated
	 * @ordered
	 */
	protected static final BindingState BINDING_STATE_EDEFAULT = BindingState.UNBOUND;

	/**
	 * The cached value of the '{@link #getBindingState() <em>Binding State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingState()
	 * @generated
	 * @ordered
	 */
	protected BindingState bindingState = BINDING_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentStoryPatternVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingSemantics getBindingSemantics() {
		return bindingSemantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingSemantics(BindingSemantics newBindingSemantics) {
		BindingSemantics oldBindingSemantics = bindingSemantics;
		bindingSemantics = newBindingSemantics == null ? BINDING_SEMANTICS_EDEFAULT : newBindingSemantics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS, oldBindingSemantics, bindingSemantics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingOperator getBindingOperator() {
		return bindingOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingOperator(BindingOperator newBindingOperator) {
		BindingOperator oldBindingOperator = bindingOperator;
		bindingOperator = newBindingOperator == null ? BINDING_OPERATOR_EDEFAULT : newBindingOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR, oldBindingOperator, bindingOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingState getBindingState() {
		return bindingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingState(BindingState newBindingState) {
		BindingState oldBindingState = bindingState;
		bindingState = newBindingState == null ? BINDING_STATE_EDEFAULT : newBindingState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_STATE, oldBindingState, bindingState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__COMMENT:
				return getComment();
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS:
				return getBindingSemantics();
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR:
				return getBindingOperator();
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_STATE:
				return getBindingState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__COMMENT:
				setComment((String)newValue);
				return;
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS:
				setBindingSemantics((BindingSemantics)newValue);
				return;
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR:
				setBindingOperator((BindingOperator)newValue);
				return;
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_STATE:
				setBindingState((BindingState)newValue);
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
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS:
				setBindingSemantics(BINDING_SEMANTICS_EDEFAULT);
				return;
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR:
				setBindingOperator(BINDING_OPERATOR_EDEFAULT);
				return;
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_STATE:
				setBindingState(BINDING_STATE_EDEFAULT);
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
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS:
				return bindingSemantics != BINDING_SEMANTICS_EDEFAULT;
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR:
				return bindingOperator != BINDING_OPERATOR_EDEFAULT;
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_STATE:
				return bindingState != BINDING_STATE_EDEFAULT;
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
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
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
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE__COMMENT;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (comment: ");
		result.append(comment);
		result.append(", bindingSemantics: ");
		result.append(bindingSemantics);
		result.append(", bindingOperator: ");
		result.append(bindingOperator);
		result.append(", bindingState: ");
		result.append(bindingState);
		result.append(')');
		return result.toString();
	}

} //ComponentStoryPatternVariableImpl
