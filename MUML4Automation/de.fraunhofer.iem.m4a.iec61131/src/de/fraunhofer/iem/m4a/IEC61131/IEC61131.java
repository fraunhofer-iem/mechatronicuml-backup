/**
 */
package de.fraunhofer.iem.m4a.IEC61131;

import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement;
import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElementReference;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC61131</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * toplevel class for an iec 61131 model instance containing library elements and configuration elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.IEC61131#getLibraryDeclarations <em>Library Declarations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.IEC61131#getLibraryReferences <em>Library References</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.IEC61131Package#getIEC61131()
 * @model
 * @generated
 */
public interface IEC61131 extends EObject {
	/**
	 * Returns the value of the '<em><b>Library Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Declarations</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.IEC61131Package#getIEC61131_LibraryDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<LibraryElement> getLibraryDeclarations();

	/**
	 * Returns the value of the '<em><b>Library References</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.LibraryElementReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library References</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.IEC61131Package#getIEC61131_LibraryReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<LibraryElementReference> getLibraryReferences();

} // IEC61131
