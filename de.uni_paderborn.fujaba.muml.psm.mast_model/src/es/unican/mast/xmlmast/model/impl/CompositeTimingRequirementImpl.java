/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.CompositeTimingRequirement;
import es.unican.mast.xmlmast.model.GlobalMaxMissRatio;
import es.unican.mast.xmlmast.model.HardGlobalDeadline;
import es.unican.mast.xmlmast.model.HardLocalDeadline;
import es.unican.mast.xmlmast.model.LocalMaxMissRatio;
import es.unican.mast.xmlmast.model.MaxOutputJitterReq;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.SoftGlobalDeadline;
import es.unican.mast.xmlmast.model.SoftLocalDeadline;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Timing Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.CompositeTimingRequirementImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.CompositeTimingRequirementImpl#getMaxOutputJitterReq <em>Max Output Jitter Req</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.CompositeTimingRequirementImpl#getHardGlobalDeadline <em>Hard Global Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.CompositeTimingRequirementImpl#getSoftGlobalDeadline <em>Soft Global Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.CompositeTimingRequirementImpl#getGlobalMaxMissRatio <em>Global Max Miss Ratio</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.CompositeTimingRequirementImpl#getHardLocalDeadline <em>Hard Local Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.CompositeTimingRequirementImpl#getSoftLocalDeadline <em>Soft Local Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.CompositeTimingRequirementImpl#getLocalMaxMissRatio <em>Local Max Miss Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeTimingRequirementImpl extends MinimalEObjectImpl.Container implements CompositeTimingRequirement {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeTimingRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPOSITE_TIMING_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ModelPackage.COMPOSITE_TIMING_REQUIREMENT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaxOutputJitterReq> getMaxOutputJitterReq() {
		return getGroup().list(ModelPackage.Literals.COMPOSITE_TIMING_REQUIREMENT__MAX_OUTPUT_JITTER_REQ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardGlobalDeadline> getHardGlobalDeadline() {
		return getGroup().list(ModelPackage.Literals.COMPOSITE_TIMING_REQUIREMENT__HARD_GLOBAL_DEADLINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftGlobalDeadline> getSoftGlobalDeadline() {
		return getGroup().list(ModelPackage.Literals.COMPOSITE_TIMING_REQUIREMENT__SOFT_GLOBAL_DEADLINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalMaxMissRatio> getGlobalMaxMissRatio() {
		return getGroup().list(ModelPackage.Literals.COMPOSITE_TIMING_REQUIREMENT__GLOBAL_MAX_MISS_RATIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardLocalDeadline> getHardLocalDeadline() {
		return getGroup().list(ModelPackage.Literals.COMPOSITE_TIMING_REQUIREMENT__HARD_LOCAL_DEADLINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftLocalDeadline> getSoftLocalDeadline() {
		return getGroup().list(ModelPackage.Literals.COMPOSITE_TIMING_REQUIREMENT__SOFT_LOCAL_DEADLINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalMaxMissRatio> getLocalMaxMissRatio() {
		return getGroup().list(ModelPackage.Literals.COMPOSITE_TIMING_REQUIREMENT__LOCAL_MAX_MISS_RATIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__MAX_OUTPUT_JITTER_REQ:
				return ((InternalEList<?>)getMaxOutputJitterReq()).basicRemove(otherEnd, msgs);
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__HARD_GLOBAL_DEADLINE:
				return ((InternalEList<?>)getHardGlobalDeadline()).basicRemove(otherEnd, msgs);
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__SOFT_GLOBAL_DEADLINE:
				return ((InternalEList<?>)getSoftGlobalDeadline()).basicRemove(otherEnd, msgs);
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__GLOBAL_MAX_MISS_RATIO:
				return ((InternalEList<?>)getGlobalMaxMissRatio()).basicRemove(otherEnd, msgs);
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__HARD_LOCAL_DEADLINE:
				return ((InternalEList<?>)getHardLocalDeadline()).basicRemove(otherEnd, msgs);
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__SOFT_LOCAL_DEADLINE:
				return ((InternalEList<?>)getSoftLocalDeadline()).basicRemove(otherEnd, msgs);
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__LOCAL_MAX_MISS_RATIO:
				return ((InternalEList<?>)getLocalMaxMissRatio()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__MAX_OUTPUT_JITTER_REQ:
				return getMaxOutputJitterReq();
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__HARD_GLOBAL_DEADLINE:
				return getHardGlobalDeadline();
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__SOFT_GLOBAL_DEADLINE:
				return getSoftGlobalDeadline();
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__GLOBAL_MAX_MISS_RATIO:
				return getGlobalMaxMissRatio();
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__HARD_LOCAL_DEADLINE:
				return getHardLocalDeadline();
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__SOFT_LOCAL_DEADLINE:
				return getSoftLocalDeadline();
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__LOCAL_MAX_MISS_RATIO:
				return getLocalMaxMissRatio();
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
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__MAX_OUTPUT_JITTER_REQ:
				getMaxOutputJitterReq().clear();
				getMaxOutputJitterReq().addAll((Collection<? extends MaxOutputJitterReq>)newValue);
				return;
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__HARD_GLOBAL_DEADLINE:
				getHardGlobalDeadline().clear();
				getHardGlobalDeadline().addAll((Collection<? extends HardGlobalDeadline>)newValue);
				return;
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__SOFT_GLOBAL_DEADLINE:
				getSoftGlobalDeadline().clear();
				getSoftGlobalDeadline().addAll((Collection<? extends SoftGlobalDeadline>)newValue);
				return;
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__GLOBAL_MAX_MISS_RATIO:
				getGlobalMaxMissRatio().clear();
				getGlobalMaxMissRatio().addAll((Collection<? extends GlobalMaxMissRatio>)newValue);
				return;
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__HARD_LOCAL_DEADLINE:
				getHardLocalDeadline().clear();
				getHardLocalDeadline().addAll((Collection<? extends HardLocalDeadline>)newValue);
				return;
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__SOFT_LOCAL_DEADLINE:
				getSoftLocalDeadline().clear();
				getSoftLocalDeadline().addAll((Collection<? extends SoftLocalDeadline>)newValue);
				return;
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__LOCAL_MAX_MISS_RATIO:
				getLocalMaxMissRatio().clear();
				getLocalMaxMissRatio().addAll((Collection<? extends LocalMaxMissRatio>)newValue);
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
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__GROUP:
				getGroup().clear();
				return;
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__MAX_OUTPUT_JITTER_REQ:
				getMaxOutputJitterReq().clear();
				return;
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__HARD_GLOBAL_DEADLINE:
				getHardGlobalDeadline().clear();
				return;
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__SOFT_GLOBAL_DEADLINE:
				getSoftGlobalDeadline().clear();
				return;
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__GLOBAL_MAX_MISS_RATIO:
				getGlobalMaxMissRatio().clear();
				return;
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__HARD_LOCAL_DEADLINE:
				getHardLocalDeadline().clear();
				return;
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__SOFT_LOCAL_DEADLINE:
				getSoftLocalDeadline().clear();
				return;
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__LOCAL_MAX_MISS_RATIO:
				getLocalMaxMissRatio().clear();
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
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__GROUP:
				return group != null && !group.isEmpty();
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__MAX_OUTPUT_JITTER_REQ:
				return !getMaxOutputJitterReq().isEmpty();
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__HARD_GLOBAL_DEADLINE:
				return !getHardGlobalDeadline().isEmpty();
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__SOFT_GLOBAL_DEADLINE:
				return !getSoftGlobalDeadline().isEmpty();
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__GLOBAL_MAX_MISS_RATIO:
				return !getGlobalMaxMissRatio().isEmpty();
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__HARD_LOCAL_DEADLINE:
				return !getHardLocalDeadline().isEmpty();
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__SOFT_LOCAL_DEADLINE:
				return !getSoftLocalDeadline().isEmpty();
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT__LOCAL_MAX_MISS_RATIO:
				return !getLocalMaxMissRatio().isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //CompositeTimingRequirementImpl
