/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.fotctl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.ExtendableElementImpl;
import org.muml.reconfigurationverification.fotctl.ConstantSymbolDecl;
import org.muml.reconfigurationverification.fotctl.EdgeLabelPredicate;
import org.muml.reconfigurationverification.fotctl.EdgeLabelPredicateDecl;
import org.muml.reconfigurationverification.fotctl.FoTCTLFormula;
import org.muml.reconfigurationverification.fotctl.FoTCTLSpec;
import org.muml.reconfigurationverification.fotctl.FotctlPackage;
import org.muml.reconfigurationverification.fotctl.NodeLabelPredicate;
import org.muml.reconfigurationverification.fotctl.NodeLabelPredicateDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fo TCTL Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.fotctl.impl.FoTCTLSpecImpl#getFormulas <em>Formulas</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.fotctl.impl.FoTCTLSpecImpl#getNodeLabelPredicates <em>Node Label Predicates</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.fotctl.impl.FoTCTLSpecImpl#getEdgeLabelPredicates <em>Edge Label Predicates</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.fotctl.impl.FoTCTLSpecImpl#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FoTCTLSpecImpl extends ExtendableElementImpl implements FoTCTLSpec {
	/**
	 * The cached value of the '{@link #getFormulas() <em>Formulas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulas()
	 * @generated
	 * @ordered
	 */
	protected EList<FoTCTLFormula> formulas;

	/**
	 * The cached value of the '{@link #getNodeLabelPredicates() <em>Node Label Predicates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeLabelPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeLabelPredicateDecl> nodeLabelPredicates;

	/**
	 * The cached value of the '{@link #getEdgeLabelPredicates() <em>Edge Label Predicates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeLabelPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<EdgeLabelPredicateDecl> edgeLabelPredicates;

	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstantSymbolDecl> constants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FoTCTLSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FotctlPackage.Literals.FO_TCTL_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FoTCTLFormula> getFormulas() {
		if (formulas == null) {
			formulas = new EObjectContainmentEList<FoTCTLFormula>(FoTCTLFormula.class, this, FotctlPackage.FO_TCTL_SPEC__FORMULAS);
		}
		return formulas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeLabelPredicateDecl> getNodeLabelPredicates() {
		if (nodeLabelPredicates == null) {
			nodeLabelPredicates = new EObjectContainmentEList<NodeLabelPredicateDecl>(NodeLabelPredicateDecl.class, this, FotctlPackage.FO_TCTL_SPEC__NODE_LABEL_PREDICATES);
		}
		return nodeLabelPredicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EdgeLabelPredicateDecl> getEdgeLabelPredicates() {
		if (edgeLabelPredicates == null) {
			edgeLabelPredicates = new EObjectContainmentEList<EdgeLabelPredicateDecl>(EdgeLabelPredicateDecl.class, this, FotctlPackage.FO_TCTL_SPEC__EDGE_LABEL_PREDICATES);
		}
		return edgeLabelPredicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstantSymbolDecl> getConstants() {
		if (constants == null) {
			constants = new EObjectContainmentEList<ConstantSymbolDecl>(ConstantSymbolDecl.class, this, FotctlPackage.FO_TCTL_SPEC__CONSTANTS);
		}
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FotctlPackage.FO_TCTL_SPEC__FORMULAS:
				return ((InternalEList<?>)getFormulas()).basicRemove(otherEnd, msgs);
			case FotctlPackage.FO_TCTL_SPEC__NODE_LABEL_PREDICATES:
				return ((InternalEList<?>)getNodeLabelPredicates()).basicRemove(otherEnd, msgs);
			case FotctlPackage.FO_TCTL_SPEC__EDGE_LABEL_PREDICATES:
				return ((InternalEList<?>)getEdgeLabelPredicates()).basicRemove(otherEnd, msgs);
			case FotctlPackage.FO_TCTL_SPEC__CONSTANTS:
				return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
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
			case FotctlPackage.FO_TCTL_SPEC__FORMULAS:
				return getFormulas();
			case FotctlPackage.FO_TCTL_SPEC__NODE_LABEL_PREDICATES:
				return getNodeLabelPredicates();
			case FotctlPackage.FO_TCTL_SPEC__EDGE_LABEL_PREDICATES:
				return getEdgeLabelPredicates();
			case FotctlPackage.FO_TCTL_SPEC__CONSTANTS:
				return getConstants();
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
			case FotctlPackage.FO_TCTL_SPEC__FORMULAS:
				getFormulas().clear();
				getFormulas().addAll((Collection<? extends FoTCTLFormula>)newValue);
				return;
			case FotctlPackage.FO_TCTL_SPEC__NODE_LABEL_PREDICATES:
				getNodeLabelPredicates().clear();
				getNodeLabelPredicates().addAll((Collection<? extends NodeLabelPredicateDecl>)newValue);
				return;
			case FotctlPackage.FO_TCTL_SPEC__EDGE_LABEL_PREDICATES:
				getEdgeLabelPredicates().clear();
				getEdgeLabelPredicates().addAll((Collection<? extends EdgeLabelPredicateDecl>)newValue);
				return;
			case FotctlPackage.FO_TCTL_SPEC__CONSTANTS:
				getConstants().clear();
				getConstants().addAll((Collection<? extends ConstantSymbolDecl>)newValue);
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
			case FotctlPackage.FO_TCTL_SPEC__FORMULAS:
				getFormulas().clear();
				return;
			case FotctlPackage.FO_TCTL_SPEC__NODE_LABEL_PREDICATES:
				getNodeLabelPredicates().clear();
				return;
			case FotctlPackage.FO_TCTL_SPEC__EDGE_LABEL_PREDICATES:
				getEdgeLabelPredicates().clear();
				return;
			case FotctlPackage.FO_TCTL_SPEC__CONSTANTS:
				getConstants().clear();
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
			case FotctlPackage.FO_TCTL_SPEC__FORMULAS:
				return formulas != null && !formulas.isEmpty();
			case FotctlPackage.FO_TCTL_SPEC__NODE_LABEL_PREDICATES:
				return nodeLabelPredicates != null && !nodeLabelPredicates.isEmpty();
			case FotctlPackage.FO_TCTL_SPEC__EDGE_LABEL_PREDICATES:
				return edgeLabelPredicates != null && !edgeLabelPredicates.isEmpty();
			case FotctlPackage.FO_TCTL_SPEC__CONSTANTS:
				return constants != null && !constants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FoTCTLSpecImpl
