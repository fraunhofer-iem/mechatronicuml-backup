/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier;

import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.ObjectIdentifierImpl#getIdentifierToEObject <em>Identifier To EObject</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.ObjectIdentifierImpl#getEObjectToIdentifier <em>EObject To Identifier</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.ObjectIdentifierImpl#getFreeClockInstanceIdentifiers <em>Free Clock Instance Identifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectIdentifierImpl extends EObjectImpl implements ObjectIdentifier {
	/**
	 * The cached value of the '{@link #getIdentifierToEObject() <em>Identifier To EObject</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierToEObject()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EObject> identifierToEObject;

	/**
	 * The cached value of the '{@link #getEObjectToIdentifier() <em>EObject To Identifier</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEObjectToIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EMap<EObject, String> eObjectToIdentifier;

	/**
	 * The cached value of the '{@link #getFreeClockInstanceIdentifiers() <em>Free Clock Instance Identifiers</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeClockInstanceIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EMap<ClockInstanceStoryDiagram, EList<String>> freeClockInstanceIdentifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtautomatonPackage.Literals.OBJECT_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EObject> getIdentifierToEObject() {
		if (identifierToEObject == null) {
			identifierToEObject = new EcoreEMap<String,EObject>(GtautomatonPackage.Literals.IDENTIFIER_TO_EOBJECT, IdentifierToEObjectImpl.class, this, GtautomatonPackage.OBJECT_IDENTIFIER__IDENTIFIER_TO_EOBJECT);
		}
		return identifierToEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<EObject, String> getEObjectToIdentifier() {
		if (eObjectToIdentifier == null) {
			eObjectToIdentifier = new EcoreEMap<EObject,String>(GtautomatonPackage.Literals.EOBJECT_TO_IDENTIFIER, EObjectToIdentifierImpl.class, this, GtautomatonPackage.OBJECT_IDENTIFIER__EOBJECT_TO_IDENTIFIER);
		}
		return eObjectToIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<ClockInstanceStoryDiagram, EList<String>> getFreeClockInstanceIdentifiers() {
		if (freeClockInstanceIdentifiers == null) {
			freeClockInstanceIdentifiers = new EcoreEMap<ClockInstanceStoryDiagram,EList<String>>(GtautomatonPackage.Literals.CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER, ClockInstanceStoryDiagramToIdentifierImpl.class, this, GtautomatonPackage.OBJECT_IDENTIFIER__FREE_CLOCK_INSTANCE_IDENTIFIERS);
		}
		return freeClockInstanceIdentifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void putEObjectToIdentifier(final EObject currentObject, final String identifier) {
		this.getEObjectToIdentifier().put(currentObject, identifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void putIdentifierToEObject(final String identifier, final EObject currentObject) {
		this.getIdentifierToEObject().put(identifier,currentObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier(final EObject currentObject) {
		return this.getEObjectToIdentifier().get(currentObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getEObject(final String currentIdentifier) {
		return this.getIdentifierToEObject().get(currentIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFreeClockInstanceIdentifier(final ClockInstanceStoryDiagram clockInstanceStoryDiagram) {
		EList<String> identifiers = this.getFreeClockInstanceIdentifiers().get(clockInstanceStoryDiagram);
		if(identifiers == null || identifiers.size() == 0){
			return null;
		} else {
			String result = identifiers.get(0);
			identifiers.remove(0);
			return result;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtautomatonPackage.OBJECT_IDENTIFIER__IDENTIFIER_TO_EOBJECT:
				return ((InternalEList<?>)getIdentifierToEObject()).basicRemove(otherEnd, msgs);
			case GtautomatonPackage.OBJECT_IDENTIFIER__EOBJECT_TO_IDENTIFIER:
				return ((InternalEList<?>)getEObjectToIdentifier()).basicRemove(otherEnd, msgs);
			case GtautomatonPackage.OBJECT_IDENTIFIER__FREE_CLOCK_INSTANCE_IDENTIFIERS:
				return ((InternalEList<?>)getFreeClockInstanceIdentifiers()).basicRemove(otherEnd, msgs);
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
			case GtautomatonPackage.OBJECT_IDENTIFIER__IDENTIFIER_TO_EOBJECT:
				if (coreType) return getIdentifierToEObject();
				else return getIdentifierToEObject().map();
			case GtautomatonPackage.OBJECT_IDENTIFIER__EOBJECT_TO_IDENTIFIER:
				if (coreType) return getEObjectToIdentifier();
				else return getEObjectToIdentifier().map();
			case GtautomatonPackage.OBJECT_IDENTIFIER__FREE_CLOCK_INSTANCE_IDENTIFIERS:
				if (coreType) return getFreeClockInstanceIdentifiers();
				else return getFreeClockInstanceIdentifiers().map();
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
			case GtautomatonPackage.OBJECT_IDENTIFIER__IDENTIFIER_TO_EOBJECT:
				((EStructuralFeature.Setting)getIdentifierToEObject()).set(newValue);
				return;
			case GtautomatonPackage.OBJECT_IDENTIFIER__EOBJECT_TO_IDENTIFIER:
				((EStructuralFeature.Setting)getEObjectToIdentifier()).set(newValue);
				return;
			case GtautomatonPackage.OBJECT_IDENTIFIER__FREE_CLOCK_INSTANCE_IDENTIFIERS:
				((EStructuralFeature.Setting)getFreeClockInstanceIdentifiers()).set(newValue);
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
			case GtautomatonPackage.OBJECT_IDENTIFIER__IDENTIFIER_TO_EOBJECT:
				getIdentifierToEObject().clear();
				return;
			case GtautomatonPackage.OBJECT_IDENTIFIER__EOBJECT_TO_IDENTIFIER:
				getEObjectToIdentifier().clear();
				return;
			case GtautomatonPackage.OBJECT_IDENTIFIER__FREE_CLOCK_INSTANCE_IDENTIFIERS:
				getFreeClockInstanceIdentifiers().clear();
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
			case GtautomatonPackage.OBJECT_IDENTIFIER__IDENTIFIER_TO_EOBJECT:
				return identifierToEObject != null && !identifierToEObject.isEmpty();
			case GtautomatonPackage.OBJECT_IDENTIFIER__EOBJECT_TO_IDENTIFIER:
				return eObjectToIdentifier != null && !eObjectToIdentifier.isEmpty();
			case GtautomatonPackage.OBJECT_IDENTIFIER__FREE_CLOCK_INSTANCE_IDENTIFIERS:
				return freeClockInstanceIdentifiers != null && !freeClockInstanceIdentifiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectIdentifierImpl
