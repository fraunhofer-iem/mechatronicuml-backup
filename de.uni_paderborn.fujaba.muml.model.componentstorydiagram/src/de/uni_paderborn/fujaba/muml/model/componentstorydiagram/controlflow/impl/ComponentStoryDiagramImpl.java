/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryDiagram;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage;

import de.uni_paderborn.fujaba.muml.model.core.Parameter;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.storydiagrams.activities.impl.ActivityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Story Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryDiagramImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ComponentStoryDiagramImpl#getReturnParameters <em>Return Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentStoryDiagramImpl extends ActivityImpl implements ComponentStoryDiagram {
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
	 * The cached value of the '{@link #getReturnParameters() <em>Return Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> returnParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentStoryDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlflowPackage.Literals.COMPONENT_STORY_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ControlflowPackage.COMPONENT_STORY_DIAGRAM__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getReturnParameters() {
		if (returnParameters == null) {
			returnParameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, ControlflowPackage.COMPONENT_STORY_DIAGRAM__RETURN_PARAMETERS);
		}
		return returnParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControlflowPackage.COMPONENT_STORY_DIAGRAM__PARAMETERS:
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
			case ControlflowPackage.COMPONENT_STORY_DIAGRAM__PARAMETERS:
				return getParameters();
			case ControlflowPackage.COMPONENT_STORY_DIAGRAM__RETURN_PARAMETERS:
				return getReturnParameters();
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
			case ControlflowPackage.COMPONENT_STORY_DIAGRAM__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ControlflowPackage.COMPONENT_STORY_DIAGRAM__RETURN_PARAMETERS:
				getReturnParameters().clear();
				getReturnParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case ControlflowPackage.COMPONENT_STORY_DIAGRAM__PARAMETERS:
				getParameters().clear();
				return;
			case ControlflowPackage.COMPONENT_STORY_DIAGRAM__RETURN_PARAMETERS:
				getReturnParameters().clear();
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
			case ControlflowPackage.COMPONENT_STORY_DIAGRAM__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ControlflowPackage.COMPONENT_STORY_DIAGRAM__RETURN_PARAMETERS:
				return returnParameters != null && !returnParameters.isEmpty();
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
		if (baseClass == ReconfigurationRule.class) {
			switch (derivedFeatureID) {
				case ControlflowPackage.COMPONENT_STORY_DIAGRAM__PARAMETERS: return ReconfigurationPackage.RECONFIGURATION_RULE__PARAMETERS;
				case ControlflowPackage.COMPONENT_STORY_DIAGRAM__RETURN_PARAMETERS: return ReconfigurationPackage.RECONFIGURATION_RULE__RETURN_PARAMETERS;
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
		if (baseClass == ReconfigurationRule.class) {
			switch (baseFeatureID) {
				case ReconfigurationPackage.RECONFIGURATION_RULE__PARAMETERS: return ControlflowPackage.COMPONENT_STORY_DIAGRAM__PARAMETERS;
				case ReconfigurationPackage.RECONFIGURATION_RULE__RETURN_PARAMETERS: return ControlflowPackage.COMPONENT_STORY_DIAGRAM__RETURN_PARAMETERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComponentStoryDiagramImpl
