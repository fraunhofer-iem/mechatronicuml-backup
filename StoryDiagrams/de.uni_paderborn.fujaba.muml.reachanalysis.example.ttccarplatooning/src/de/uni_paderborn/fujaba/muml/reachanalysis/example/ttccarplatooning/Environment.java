/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Environment#getMaxNumOfCars <em>Max Num Of Cars</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Environment#getCars <em>Cars</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.TtccarplatooningPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Num Of Cars</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Num Of Cars</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Num Of Cars</em>' attribute.
	 * @see #setMaxNumOfCars(int)
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.TtccarplatooningPackage#getEnvironment_MaxNumOfCars()
	 * @model default="0"
	 * @generated
	 */
	int getMaxNumOfCars();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Environment#getMaxNumOfCars <em>Max Num Of Cars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Num Of Cars</em>' attribute.
	 * @see #getMaxNumOfCars()
	 * @generated
	 */
	void setMaxNumOfCars(int value);

	/**
	 * Returns the value of the '<em><b>Cars</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cars</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.TtccarplatooningPackage#getEnvironment_Cars()
	 * @model containment="true"
	 * @generated
	 */
	EList<Carprocess> getCars();

} // Environment
