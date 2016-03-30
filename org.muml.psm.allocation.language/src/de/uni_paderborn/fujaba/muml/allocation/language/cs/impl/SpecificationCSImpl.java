/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.cs.impl;

import de.uni_paderborn.fujaba.muml.allocation.language.cs.ConstraintCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.Goal;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.MeasureFunctionCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.ServiceCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS;

import de.uni_paderborn.fujaba.muml.allocation.language.cs.util.LanguageSpecificationCSVisitor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jdt.annotation.NonNull;

import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;

import org.eclipse.ocl.xtext.completeoclcs.impl.CompleteOCLDocumentCSImpl;
import org.muml.core.CorePackage;
import org.muml.core.ExtendableElement;
import org.muml.core.Extension;
import org.muml.core.util.ExtendableElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.SpecificationCSImpl#getAnnotations <em>Annotation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.SpecificationCSImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.SpecificationCSImpl#getServices <em>Services</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.SpecificationCSImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.SpecificationCSImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.SpecificationCSImpl#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationCSImpl extends CompleteOCLDocumentCSImpl implements SpecificationCS {
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
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceCS> services;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintCS> constraints;

	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected MeasureFunctionCS measure;

	/**
	 * The default value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected static final Goal GOAL_EDEFAULT = Goal.MAX;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected Goal goal = GOAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.SPECIFICATION_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList.Resolving<EAnnotation>(EAnnotation.class, this, CsPackage.SPECIFICATION_CS__ANNOTATION);
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
			extensions = new EObjectContainmentWithInverseEList.Resolving<Extension>(Extension.class, this, CsPackage.SPECIFICATION_CS__EXTENSION, CorePackage.EXTENSION__EXTENDABLE_BASE);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceCS> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<ServiceCS>(ServiceCS.class, this, CsPackage.SPECIFICATION_CS__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintCS> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<ConstraintCS>(ConstraintCS.class, this, CsPackage.SPECIFICATION_CS__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureFunctionCS getMeasure() {
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(MeasureFunctionCS newMeasure, NotificationChain msgs) {
		MeasureFunctionCS oldMeasure = measure;
		measure = newMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.SPECIFICATION_CS__MEASURE, oldMeasure, newMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasure(MeasureFunctionCS newMeasure) {
		if (newMeasure != measure) {
			NotificationChain msgs = null;
			if (measure != null)
				msgs = ((InternalEObject)measure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.SPECIFICATION_CS__MEASURE, null, msgs);
			if (newMeasure != null)
				msgs = ((InternalEObject)newMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.SPECIFICATION_CS__MEASURE, null, msgs);
			msgs = basicSetMeasure(newMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SPECIFICATION_CS__MEASURE, newMeasure, newMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(Goal newGoal) {
		Goal oldGoal = goal;
		goal = newGoal == null ? GOAL_EDEFAULT : newGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SPECIFICATION_CS__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		return super.toString();
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
			case CsPackage.SPECIFICATION_CS__EXTENSION:
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
			case CsPackage.SPECIFICATION_CS__ANNOTATION:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case CsPackage.SPECIFICATION_CS__EXTENSION:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case CsPackage.SPECIFICATION_CS__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case CsPackage.SPECIFICATION_CS__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case CsPackage.SPECIFICATION_CS__MEASURE:
				return basicSetMeasure(null, msgs);
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
			case CsPackage.SPECIFICATION_CS__ANNOTATION:
				return getAnnotations();
			case CsPackage.SPECIFICATION_CS__EXTENSION:
				return getExtensions();
			case CsPackage.SPECIFICATION_CS__SERVICES:
				return getServices();
			case CsPackage.SPECIFICATION_CS__CONSTRAINTS:
				return getConstraints();
			case CsPackage.SPECIFICATION_CS__MEASURE:
				return getMeasure();
			case CsPackage.SPECIFICATION_CS__GOAL:
				return getGoal();
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
			case CsPackage.SPECIFICATION_CS__ANNOTATION:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends EAnnotation>)newValue);
				return;
			case CsPackage.SPECIFICATION_CS__EXTENSION:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Extension>)newValue);
				return;
			case CsPackage.SPECIFICATION_CS__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends ServiceCS>)newValue);
				return;
			case CsPackage.SPECIFICATION_CS__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends ConstraintCS>)newValue);
				return;
			case CsPackage.SPECIFICATION_CS__MEASURE:
				setMeasure((MeasureFunctionCS)newValue);
				return;
			case CsPackage.SPECIFICATION_CS__GOAL:
				setGoal((Goal)newValue);
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
			case CsPackage.SPECIFICATION_CS__ANNOTATION:
				getAnnotations().clear();
				return;
			case CsPackage.SPECIFICATION_CS__EXTENSION:
				getExtensions().clear();
				return;
			case CsPackage.SPECIFICATION_CS__SERVICES:
				getServices().clear();
				return;
			case CsPackage.SPECIFICATION_CS__CONSTRAINTS:
				getConstraints().clear();
				return;
			case CsPackage.SPECIFICATION_CS__MEASURE:
				setMeasure((MeasureFunctionCS)null);
				return;
			case CsPackage.SPECIFICATION_CS__GOAL:
				setGoal(GOAL_EDEFAULT);
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
			case CsPackage.SPECIFICATION_CS__ANNOTATION:
				return annotations != null && !annotations.isEmpty();
			case CsPackage.SPECIFICATION_CS__EXTENSION:
				return extensions != null && !extensions.isEmpty();
			case CsPackage.SPECIFICATION_CS__SERVICES:
				return services != null && !services.isEmpty();
			case CsPackage.SPECIFICATION_CS__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case CsPackage.SPECIFICATION_CS__MEASURE:
				return measure != null;
			case CsPackage.SPECIFICATION_CS__GOAL:
				return goal != GOAL_EDEFAULT;
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
				case CsPackage.SPECIFICATION_CS__ANNOTATION: return CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;
				case CsPackage.SPECIFICATION_CS__EXTENSION: return CorePackage.EXTENDABLE_ELEMENT__EXTENSION;
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
				case CorePackage.EXTENDABLE_ELEMENT__ANNOTATION: return CsPackage.SPECIFICATION_CS__ANNOTATION;
				case CorePackage.EXTENDABLE_ELEMENT__EXTENSION: return CsPackage.SPECIFICATION_CS__EXTENSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(@NonNull BaseCSVisitor<R> visitor) {
		return (R) ((LanguageSpecificationCSVisitor<?>)visitor).visitSpecificationCS(this);
	}

} //SpecificationCSImpl
