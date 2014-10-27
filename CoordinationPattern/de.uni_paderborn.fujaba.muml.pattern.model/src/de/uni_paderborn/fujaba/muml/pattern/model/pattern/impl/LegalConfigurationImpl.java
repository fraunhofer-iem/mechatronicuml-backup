/**
 */
package de.uni_paderborn.fujaba.muml.pattern.model.pattern.impl;

import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;

import de.uni_paderborn.fujaba.muml.pattern.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.model.pattern.LegalConfiguration;
import de.uni_paderborn.fujaba.muml.pattern.model.pattern.PatternPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;

import org.storydriven.core.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.model.pattern.impl.LegalConfigurationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.model.pattern.impl.LegalConfigurationImpl#getParameterBindings <em>Parameter Bindings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.model.pattern.impl.LegalConfigurationImpl#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LegalConfigurationImpl extends NamedElementImpl implements LegalConfiguration {
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
	 * The cached value of the '{@link #getParameterBindings() <em>Parameter Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterBinding> parameterBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegalConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.LEGAL_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.LEGAL_CONFIGURATION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterBinding> getParameterBindings() {
		if (parameterBindings == null) {
			parameterBindings = new EObjectContainmentEList<ParameterBinding>(ParameterBinding.class, this, PatternPackage.LEGAL_CONFIGURATION__PARAMETER_BINDINGS);
		}
		return parameterBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPattern getCoordinationPattern() {
		if (eContainerFeatureID() != PatternPackage.LEGAL_CONFIGURATION__COORDINATION_PATTERN) return null;
		return (CoordinationPattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinationPattern(CoordinationPattern newCoordinationPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCoordinationPattern, PatternPackage.LEGAL_CONFIGURATION__COORDINATION_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationPattern(CoordinationPattern newCoordinationPattern) {
		if (newCoordinationPattern != eInternalContainer() || (eContainerFeatureID() != PatternPackage.LEGAL_CONFIGURATION__COORDINATION_PATTERN && newCoordinationPattern != null)) {
			if (EcoreUtil.isAncestor(this, newCoordinationPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCoordinationPattern != null)
				msgs = ((InternalEObject)newCoordinationPattern).eInverseAdd(this, PatternPackage.COORDINATION_PATTERN__LEGAL_CONFIGURATIONS, CoordinationPattern.class, msgs);
			msgs = basicSetCoordinationPattern(newCoordinationPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.LEGAL_CONFIGURATION__COORDINATION_PATTERN, newCoordinationPattern, newCoordinationPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternPackage.LEGAL_CONFIGURATION__COORDINATION_PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCoordinationPattern((CoordinationPattern)otherEnd, msgs);
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
			case PatternPackage.LEGAL_CONFIGURATION__PARAMETER_BINDINGS:
				return ((InternalEList<?>)getParameterBindings()).basicRemove(otherEnd, msgs);
			case PatternPackage.LEGAL_CONFIGURATION__COORDINATION_PATTERN:
				return basicSetCoordinationPattern(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PatternPackage.LEGAL_CONFIGURATION__COORDINATION_PATTERN:
				return eInternalContainer().eInverseRemove(this, PatternPackage.COORDINATION_PATTERN__LEGAL_CONFIGURATIONS, CoordinationPattern.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternPackage.LEGAL_CONFIGURATION__COMMENT:
				return getComment();
			case PatternPackage.LEGAL_CONFIGURATION__PARAMETER_BINDINGS:
				return getParameterBindings();
			case PatternPackage.LEGAL_CONFIGURATION__COORDINATION_PATTERN:
				return getCoordinationPattern();
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
			case PatternPackage.LEGAL_CONFIGURATION__COMMENT:
				setComment((String)newValue);
				return;
			case PatternPackage.LEGAL_CONFIGURATION__PARAMETER_BINDINGS:
				getParameterBindings().clear();
				getParameterBindings().addAll((Collection<? extends ParameterBinding>)newValue);
				return;
			case PatternPackage.LEGAL_CONFIGURATION__COORDINATION_PATTERN:
				setCoordinationPattern((CoordinationPattern)newValue);
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
			case PatternPackage.LEGAL_CONFIGURATION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case PatternPackage.LEGAL_CONFIGURATION__PARAMETER_BINDINGS:
				getParameterBindings().clear();
				return;
			case PatternPackage.LEGAL_CONFIGURATION__COORDINATION_PATTERN:
				setCoordinationPattern((CoordinationPattern)null);
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
			case PatternPackage.LEGAL_CONFIGURATION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case PatternPackage.LEGAL_CONFIGURATION__PARAMETER_BINDINGS:
				return parameterBindings != null && !parameterBindings.isEmpty();
			case PatternPackage.LEGAL_CONFIGURATION__COORDINATION_PATTERN:
				return getCoordinationPattern() != null;
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
				case PatternPackage.LEGAL_CONFIGURATION__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return PatternPackage.LEGAL_CONFIGURATION__COMMENT;
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
		result.append(')');
		return result.toString();
	}

} //LegalConfigurationImpl
