/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.CorePackage;
import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.NamedElementImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class LibraryElementImpl extends NamedElementImpl implements LibraryElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.LIBRARY_ELEMENT;
	}

} //LibraryElementImpl
