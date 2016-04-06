/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd.impl;

import de.uni_paderborn.fujaba.muml.verification.sdd.impl.AbstractStoryDecisionDiagramImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.core.CommentableElement;
import org.muml.core.CorePackage;

import org.muml.pim.behavior.Parameter;

import org.muml.reconfiguration.ReconfigurableComponent;
import org.muml.reconfiguration.ReconfigurationPackage;
import org.muml.reconfiguration.StructuralCondition;

import org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd.ComponentStoryDecisionDiagram;
import org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd.ComponentsddPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Story Decision Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd.impl.ComponentStoryDecisionDiagramImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd.impl.ComponentStoryDecisionDiagramImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd.impl.ComponentStoryDecisionDiagramImpl#getReconfigurableComponent <em>Reconfigurable Component</em>}</li>
 *   <li>{@link org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd.impl.ComponentStoryDecisionDiagramImpl#isInvariantSDD <em>Invariant SDD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentStoryDecisionDiagramImpl extends AbstractStoryDecisionDiagramImpl implements ComponentStoryDecisionDiagram {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getReconfigurableComponent() <em>Reconfigurable Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfigurableComponent()
	 * @generated
	 * @ordered
	 */
	protected ReconfigurableComponent reconfigurableComponent;

	/**
	 * The default value of the '{@link #isInvariantSDD() <em>Invariant SDD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvariantSDD()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVARIANT_SDD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInvariantSDD() <em>Invariant SDD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvariantSDD()
	 * @generated
	 * @ordered
	 */
	protected boolean invariantSDD = INVARIANT_SDD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentStoryDecisionDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsddPackage.Literals.COMPONENT_STORY_DECISION_DIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurableComponent getReconfigurableComponent() {
		if (reconfigurableComponent != null && reconfigurableComponent.eIsProxy()) {
			InternalEObject oldReconfigurableComponent = (InternalEObject)reconfigurableComponent;
			reconfigurableComponent = (ReconfigurableComponent)eResolveProxy(oldReconfigurableComponent);
			if (reconfigurableComponent != oldReconfigurableComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__RECONFIGURABLE_COMPONENT, oldReconfigurableComponent, reconfigurableComponent));
			}
		}
		return reconfigurableComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurableComponent basicGetReconfigurableComponent() {
		return reconfigurableComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigurableComponent(ReconfigurableComponent newReconfigurableComponent) {
		ReconfigurableComponent oldReconfigurableComponent = reconfigurableComponent;
		reconfigurableComponent = newReconfigurableComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__RECONFIGURABLE_COMPONENT, oldReconfigurableComponent, reconfigurableComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvariantSDD() {
		return invariantSDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariantSDD(boolean newInvariantSDD) {
		boolean oldInvariantSDD = invariantSDD;
		invariantSDD = newInvariantSDD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__INVARIANT_SDD, oldInvariantSDD, invariantSDD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__COMMENT:
				return getComment();
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__PARAMETERS:
				return getParameters();
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__RECONFIGURABLE_COMPONENT:
				if (resolve) return getReconfigurableComponent();
				return basicGetReconfigurableComponent();
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__INVARIANT_SDD:
				return isInvariantSDD();
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
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__COMMENT:
				setComment((String)newValue);
				return;
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__RECONFIGURABLE_COMPONENT:
				setReconfigurableComponent((ReconfigurableComponent)newValue);
				return;
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__INVARIANT_SDD:
				setInvariantSDD((Boolean)newValue);
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
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__PARAMETERS:
				getParameters().clear();
				return;
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__RECONFIGURABLE_COMPONENT:
				setReconfigurableComponent((ReconfigurableComponent)null);
				return;
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__INVARIANT_SDD:
				setInvariantSDD(INVARIANT_SDD_EDEFAULT);
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
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__RECONFIGURABLE_COMPONENT:
				return reconfigurableComponent != null;
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__INVARIANT_SDD:
				return invariantSDD != INVARIANT_SDD_EDEFAULT;
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
				case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == StructuralCondition.class) {
			switch (derivedFeatureID) {
				case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__PARAMETERS: return ReconfigurationPackage.STRUCTURAL_CONDITION__PARAMETERS;
				case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__RECONFIGURABLE_COMPONENT: return ReconfigurationPackage.STRUCTURAL_CONDITION__RECONFIGURABLE_COMPONENT;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == StructuralCondition.class) {
			switch (baseFeatureID) {
				case ReconfigurationPackage.STRUCTURAL_CONDITION__PARAMETERS: return ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__PARAMETERS;
				case ReconfigurationPackage.STRUCTURAL_CONDITION__RECONFIGURABLE_COMPONENT: return ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM__RECONFIGURABLE_COMPONENT;
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
		result.append(", invariantSDD: ");
		result.append(invariantSDD);
		result.append(')');
		return result.toString();
	}

} //ComponentStoryDecisionDiagramImpl
