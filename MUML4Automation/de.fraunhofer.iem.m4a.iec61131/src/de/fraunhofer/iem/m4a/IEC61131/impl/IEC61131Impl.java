/**
 */
package de.fraunhofer.iem.m4a.IEC61131.impl;

import de.fraunhofer.iem.m4a.IEC61131.IEC61131;
import de.fraunhofer.iem.m4a.IEC61131.IEC61131Package;
import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement;
import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElementReference;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC61131</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.impl.IEC61131Impl#getLibraryDeclarations <em>Library Declarations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.impl.IEC61131Impl#getLibraryReferences <em>Library References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IEC61131Impl extends MinimalEObjectImpl.Container implements IEC61131 {
	/**
	 * The cached value of the '{@link #getLibraryDeclarations() <em>Library Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<LibraryElement> libraryDeclarations;
	/**
	 * The cached value of the '{@link #getLibraryReferences() <em>Library References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<LibraryElementReference> libraryReferences;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IEC61131Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IEC61131Package.Literals.IEC61131;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LibraryElement> getLibraryDeclarations() {
		if (libraryDeclarations == null) {
			libraryDeclarations = new EObjectContainmentEList<LibraryElement>(LibraryElement.class, this, IEC61131Package.IEC61131__LIBRARY_DECLARATIONS);
		}
		return libraryDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LibraryElementReference> getLibraryReferences() {
		if (libraryReferences == null) {
			libraryReferences = new EObjectContainmentEList<LibraryElementReference>(LibraryElementReference.class, this, IEC61131Package.IEC61131__LIBRARY_REFERENCES);
		}
		return libraryReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IEC61131Package.IEC61131__LIBRARY_DECLARATIONS:
				return ((InternalEList<?>)getLibraryDeclarations()).basicRemove(otherEnd, msgs);
			case IEC61131Package.IEC61131__LIBRARY_REFERENCES:
				return ((InternalEList<?>)getLibraryReferences()).basicRemove(otherEnd, msgs);
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
			case IEC61131Package.IEC61131__LIBRARY_DECLARATIONS:
				return getLibraryDeclarations();
			case IEC61131Package.IEC61131__LIBRARY_REFERENCES:
				return getLibraryReferences();
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
			case IEC61131Package.IEC61131__LIBRARY_DECLARATIONS:
				getLibraryDeclarations().clear();
				getLibraryDeclarations().addAll((Collection<? extends LibraryElement>)newValue);
				return;
			case IEC61131Package.IEC61131__LIBRARY_REFERENCES:
				getLibraryReferences().clear();
				getLibraryReferences().addAll((Collection<? extends LibraryElementReference>)newValue);
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
			case IEC61131Package.IEC61131__LIBRARY_DECLARATIONS:
				getLibraryDeclarations().clear();
				return;
			case IEC61131Package.IEC61131__LIBRARY_REFERENCES:
				getLibraryReferences().clear();
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
			case IEC61131Package.IEC61131__LIBRARY_DECLARATIONS:
				return libraryDeclarations != null && !libraryDeclarations.isEmpty();
			case IEC61131Package.IEC61131__LIBRARY_REFERENCES:
				return libraryReferences != null && !libraryReferences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IEC61131Impl
