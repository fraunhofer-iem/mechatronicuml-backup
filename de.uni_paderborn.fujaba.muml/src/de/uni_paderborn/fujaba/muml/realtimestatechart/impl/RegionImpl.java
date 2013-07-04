/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.Extension;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RegionImpl#getAnnotations <em>Annotation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RegionImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RegionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RegionImpl#getEmbeddedStatechart <em>Embedded Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RegionImpl#getParentState <em>Parent State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RegionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends PrioritizedElementImpl implements Region {
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
	 * The cached value of the '{@link #getEmbeddedStatechart() <em>Embedded Statechart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedStatechart()
	 * @generated
	 * @ordered
	 */
	protected RealtimeStatechart embeddedStatechart;

	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.REGION__NAME).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList.Resolving<EAnnotation>(EAnnotation.class, this, RealtimestatechartPackage.REGION__ANNOTATION);
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
			extensions = new EObjectContainmentWithInverseEList.Resolving<Extension>(Extension.class, this, RealtimestatechartPackage.REGION__EXTENSION, CorePackage.EXTENSION__EXTENDABLE_BASE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REGION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart getEmbeddedStatechart() {
		return embeddedStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbeddedStatechart(RealtimeStatechart newEmbeddedStatechart, NotificationChain msgs) {
		RealtimeStatechart oldEmbeddedStatechart = embeddedStatechart;
		embeddedStatechart = newEmbeddedStatechart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REGION__EMBEDDED_STATECHART, oldEmbeddedStatechart, newEmbeddedStatechart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddedStatechart(RealtimeStatechart newEmbeddedStatechart) {
		if (newEmbeddedStatechart != embeddedStatechart) {
			NotificationChain msgs = null;
			if (embeddedStatechart != null)
				msgs = ((InternalEObject)embeddedStatechart).eInverseRemove(this, RealtimestatechartPackage.REALTIME_STATECHART__PARENT_REGION, RealtimeStatechart.class, msgs);
			if (newEmbeddedStatechart != null)
				msgs = ((InternalEObject)newEmbeddedStatechart).eInverseAdd(this, RealtimestatechartPackage.REALTIME_STATECHART__PARENT_REGION, RealtimeStatechart.class, msgs);
			msgs = basicSetEmbeddedStatechart(newEmbeddedStatechart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REGION__EMBEDDED_STATECHART, newEmbeddedStatechart, newEmbeddedStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getParentState() {
		if (eContainerFeatureID() != RealtimestatechartPackage.REGION__PARENT_STATE) return null;
		return (State)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentState(State newParentState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentState, RealtimestatechartPackage.REGION__PARENT_STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentState(State newParentState) {
		if (newParentState != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.REGION__PARENT_STATE && newParentState != null)) {
			if (EcoreUtil.isAncestor(this, newParentState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentState != null)
				msgs = ((InternalEObject)newParentState).eInverseAdd(this, RealtimestatechartPackage.STATE__EMBEDDED_REGIONS, State.class, msgs);
			msgs = basicSetParentState(newParentState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REGION__PARENT_STATE, newParentState, newParentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension(EClass type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension provideExtension(EClass type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getAnnotation(String source) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation provideAnnotation(String source) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case RealtimestatechartPackage.REGION__EXTENSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensions()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.REGION__EMBEDDED_STATECHART:
				if (embeddedStatechart != null)
					msgs = ((InternalEObject)embeddedStatechart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.REGION__EMBEDDED_STATECHART, null, msgs);
				return basicSetEmbeddedStatechart((RealtimeStatechart)otherEnd, msgs);
			case RealtimestatechartPackage.REGION__PARENT_STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentState((State)otherEnd, msgs);
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
			case RealtimestatechartPackage.REGION__ANNOTATION:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.REGION__EXTENSION:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.REGION__EMBEDDED_STATECHART:
				return basicSetEmbeddedStatechart(null, msgs);
			case RealtimestatechartPackage.REGION__PARENT_STATE:
				return basicSetParentState(null, msgs);
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
			case RealtimestatechartPackage.REGION__PARENT_STATE:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.STATE__EMBEDDED_REGIONS, State.class, msgs);
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
			case RealtimestatechartPackage.REGION__ANNOTATION:
				return getAnnotations();
			case RealtimestatechartPackage.REGION__EXTENSION:
				return getExtensions();
			case RealtimestatechartPackage.REGION__COMMENT:
				return getComment();
			case RealtimestatechartPackage.REGION__EMBEDDED_STATECHART:
				return getEmbeddedStatechart();
			case RealtimestatechartPackage.REGION__PARENT_STATE:
				return getParentState();
			case RealtimestatechartPackage.REGION__NAME:
				return getName();
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
			case RealtimestatechartPackage.REGION__ANNOTATION:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends EAnnotation>)newValue);
				return;
			case RealtimestatechartPackage.REGION__EXTENSION:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Extension>)newValue);
				return;
			case RealtimestatechartPackage.REGION__COMMENT:
				setComment((String)newValue);
				return;
			case RealtimestatechartPackage.REGION__EMBEDDED_STATECHART:
				setEmbeddedStatechart((RealtimeStatechart)newValue);
				return;
			case RealtimestatechartPackage.REGION__PARENT_STATE:
				setParentState((State)newValue);
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
			case RealtimestatechartPackage.REGION__ANNOTATION:
				getAnnotations().clear();
				return;
			case RealtimestatechartPackage.REGION__EXTENSION:
				getExtensions().clear();
				return;
			case RealtimestatechartPackage.REGION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case RealtimestatechartPackage.REGION__EMBEDDED_STATECHART:
				setEmbeddedStatechart((RealtimeStatechart)null);
				return;
			case RealtimestatechartPackage.REGION__PARENT_STATE:
				setParentState((State)null);
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
			case RealtimestatechartPackage.REGION__ANNOTATION:
				return annotations != null && !annotations.isEmpty();
			case RealtimestatechartPackage.REGION__EXTENSION:
				return extensions != null && !extensions.isEmpty();
			case RealtimestatechartPackage.REGION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case RealtimestatechartPackage.REGION__EMBEDDED_STATECHART:
				return embeddedStatechart != null;
			case RealtimestatechartPackage.REGION__PARENT_STATE:
				return getParentState() != null;
			case RealtimestatechartPackage.REGION__NAME:
				return isSetName();
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
				case RealtimestatechartPackage.REGION__ANNOTATION: return CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;
				case RealtimestatechartPackage.REGION__EXTENSION: return CorePackage.EXTENDABLE_ELEMENT__EXTENSION;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartPackage.REGION__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
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
				case CorePackage.EXTENDABLE_ELEMENT__ANNOTATION: return RealtimestatechartPackage.REGION__ANNOTATION;
				case CorePackage.EXTENDABLE_ELEMENT__EXTENSION: return RealtimestatechartPackage.REGION__EXTENSION;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return RealtimestatechartPackage.REGION__COMMENT;
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
				case EcorePackage.EOBJECT___ECLASS: return RealtimestatechartPackage.REGION___ECLASS;
				case EcorePackage.EOBJECT___EIS_PROXY: return RealtimestatechartPackage.REGION___EIS_PROXY;
				case EcorePackage.EOBJECT___ERESOURCE: return RealtimestatechartPackage.REGION___ERESOURCE;
				case EcorePackage.EOBJECT___ECONTAINER: return RealtimestatechartPackage.REGION___ECONTAINER;
				case EcorePackage.EOBJECT___ECONTAINING_FEATURE: return RealtimestatechartPackage.REGION___ECONTAINING_FEATURE;
				case EcorePackage.EOBJECT___ECONTAINMENT_FEATURE: return RealtimestatechartPackage.REGION___ECONTAINMENT_FEATURE;
				case EcorePackage.EOBJECT___ECONTENTS: return RealtimestatechartPackage.REGION___ECONTENTS;
				case EcorePackage.EOBJECT___EALL_CONTENTS: return RealtimestatechartPackage.REGION___EALL_CONTENTS;
				case EcorePackage.EOBJECT___ECROSS_REFERENCES: return RealtimestatechartPackage.REGION___ECROSS_REFERENCES;
				case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE: return RealtimestatechartPackage.REGION___EGET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN: return RealtimestatechartPackage.REGION___EGET__ESTRUCTURALFEATURE_BOOLEAN;
				case EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT: return RealtimestatechartPackage.REGION___ESET__ESTRUCTURALFEATURE_OBJECT;
				case EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE: return RealtimestatechartPackage.REGION___EIS_SET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE: return RealtimestatechartPackage.REGION___EUNSET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST: return RealtimestatechartPackage.REGION___EINVOKE__EOPERATION_ELIST;
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (baseOperationID) {
				case CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS: return RealtimestatechartPackage.REGION___GET_EXTENSION__ECLASS;
				case CorePackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS: return RealtimestatechartPackage.REGION___PROVIDE_EXTENSION__ECLASS;
				case CorePackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING: return RealtimestatechartPackage.REGION___GET_ANNOTATION__STRING;
				case CorePackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING: return RealtimestatechartPackage.REGION___PROVIDE_ANNOTATION__STRING;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
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
			case RealtimestatechartPackage.REGION___GET_EXTENSION__ECLASS:
				return getExtension((EClass)arguments.get(0));
			case RealtimestatechartPackage.REGION___PROVIDE_EXTENSION__ECLASS:
				return provideExtension((EClass)arguments.get(0));
			case RealtimestatechartPackage.REGION___GET_ANNOTATION__STRING:
				return getAnnotation((String)arguments.get(0));
			case RealtimestatechartPackage.REGION___PROVIDE_ANNOTATION__STRING:
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //RegionImpl
