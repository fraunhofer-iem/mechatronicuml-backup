/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.patterns.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.CommentableElementImpl;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.BindingSemantics;
import org.muml.storydiagram.patterns.Constraint;
import org.muml.storydiagram.patterns.PatternsPackage;
import org.muml.storydiagram.patterns.StoryPattern;
import org.muml.storydiagram.templates.TemplateSignature;
import org.muml.storydiagram.templates.TemplatesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Story Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl#getLinkVariable <em>Link Variable</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl#getParentPattern <em>Parent Pattern</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl#getContainedPattern <em>Contained Pattern</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl#getTemplateSignature <em>Template Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoryPatternImpl extends CommentableElementImpl implements
		StoryPattern {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractVariable> variable;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getLinkVariable() <em>Link Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractLinkVariable> linkVariable;

	/**
	 * The cached value of the '{@link #getContainedPattern() <em>Contained Pattern</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPattern()
	 * @generated
	 * @ordered
	 */
	protected EList<StoryPattern> containedPattern;

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
	 * The cached value of the '{@link #getTemplateSignature() <em>Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature templateSignature;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.STORY_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractVariable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentWithInverseEList<AbstractVariable>(AbstractVariable.class, this, PatternsPackage.STORY_PATTERN__VARIABLE, PatternsPackage.ABSTRACT_VARIABLE__PATTERN);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, PatternsPackage.STORY_PATTERN__CONSTRAINT, PatternsPackage.CONSTRAINT__PATTERN);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractLinkVariable> getLinkVariable() {
		if (linkVariable == null) {
			linkVariable = new EObjectContainmentWithInverseEList<AbstractLinkVariable>(AbstractLinkVariable.class, this, PatternsPackage.STORY_PATTERN__LINK_VARIABLE, PatternsPackage.ABSTRACT_LINK_VARIABLE__PATTERN);
		}
		return linkVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPattern getParentPattern() {
		if (eContainerFeatureID() != PatternsPackage.STORY_PATTERN__PARENT_PATTERN) return null;
		return (StoryPattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentPattern(
			StoryPattern newParentPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentPattern, PatternsPackage.STORY_PATTERN__PARENT_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentPattern(StoryPattern newParentPattern) {
		if (newParentPattern != eInternalContainer() || (eContainerFeatureID() != PatternsPackage.STORY_PATTERN__PARENT_PATTERN && newParentPattern != null)) {
			if (EcoreUtil.isAncestor(this, newParentPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentPattern != null)
				msgs = ((InternalEObject)newParentPattern).eInverseAdd(this, PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN, StoryPattern.class, msgs);
			msgs = basicSetParentPattern(newParentPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.STORY_PATTERN__PARENT_PATTERN, newParentPattern, newParentPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StoryPattern> getContainedPattern() {
		if (containedPattern == null) {
			containedPattern = new EObjectContainmentWithInverseEList<StoryPattern>(StoryPattern.class, this, PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN, PatternsPackage.STORY_PATTERN__PARENT_PATTERN);
		}
		return containedPattern;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS, oldBindingSemantics, bindingSemantics));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getTemplateSignature() {
		return templateSignature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateSignature(
			TemplateSignature newTemplateSignature, NotificationChain msgs) {
		TemplateSignature oldTemplateSignature = templateSignature;
		templateSignature = newTemplateSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE, oldTemplateSignature, newTemplateSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateSignature(TemplateSignature newTemplateSignature) {
		if (newTemplateSignature != templateSignature) {
			NotificationChain msgs = null;
			if (templateSignature != null)
				msgs = ((InternalEObject)templateSignature).eInverseRemove(this, TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN, TemplateSignature.class, msgs);
			if (newTemplateSignature != null)
				msgs = ((InternalEObject)newTemplateSignature).eInverseAdd(this, TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN, TemplateSignature.class, msgs);
			msgs = basicSetTemplateSignature(newTemplateSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE, newTemplateSignature, newTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.STORY_PATTERN__VARIABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable()).basicAdd(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__CONSTRAINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraint()).basicAdd(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinkVariable()).basicAdd(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentPattern((StoryPattern)otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedPattern()).basicAdd(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
				if (templateSignature != null)
					msgs = ((InternalEObject)templateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE, null, msgs);
				return basicSetTemplateSignature((TemplateSignature)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.STORY_PATTERN__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
				return ((InternalEList<?>)getLinkVariable()).basicRemove(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
				return basicSetParentPattern(null, msgs);
			case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN:
				return ((InternalEList<?>)getContainedPattern()).basicRemove(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
				return basicSetTemplateSignature(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
				return eInternalContainer().eInverseRemove(this, PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN, StoryPattern.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternsPackage.STORY_PATTERN__VARIABLE:
				return getVariable();
			case PatternsPackage.STORY_PATTERN__CONSTRAINT:
				return getConstraint();
			case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
				return getLinkVariable();
			case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
				return getParentPattern();
			case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN:
				return getContainedPattern();
			case PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS:
				return getBindingSemantics();
			case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
				return getTemplateSignature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternsPackage.STORY_PATTERN__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends AbstractVariable>)newValue);
				return;
			case PatternsPackage.STORY_PATTERN__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
				getLinkVariable().clear();
				getLinkVariable().addAll((Collection<? extends AbstractLinkVariable>)newValue);
				return;
			case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
				setParentPattern((StoryPattern)newValue);
				return;
			case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN:
				getContainedPattern().clear();
				getContainedPattern().addAll((Collection<? extends StoryPattern>)newValue);
				return;
			case PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS:
				setBindingSemantics((BindingSemantics)newValue);
				return;
			case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
				setTemplateSignature((TemplateSignature)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatternsPackage.STORY_PATTERN__VARIABLE:
				getVariable().clear();
				return;
			case PatternsPackage.STORY_PATTERN__CONSTRAINT:
				getConstraint().clear();
				return;
			case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
				getLinkVariable().clear();
				return;
			case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
				setParentPattern((StoryPattern)null);
				return;
			case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN:
				getContainedPattern().clear();
				return;
			case PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS:
				setBindingSemantics(BINDING_SEMANTICS_EDEFAULT);
				return;
			case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
				setTemplateSignature((TemplateSignature)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatternsPackage.STORY_PATTERN__VARIABLE:
				return variable != null && !variable.isEmpty();
			case PatternsPackage.STORY_PATTERN__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
				return linkVariable != null && !linkVariable.isEmpty();
			case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
				return getParentPattern() != null;
			case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERN:
				return containedPattern != null && !containedPattern.isEmpty();
			case PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS:
				return bindingSemantics != BINDING_SEMANTICS_EDEFAULT;
			case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
				return templateSignature != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bindingSemantics: ");
		result.append(bindingSemantics);
		result.append(')');
		return result.toString();
	}

} // StoryPatternImpl
