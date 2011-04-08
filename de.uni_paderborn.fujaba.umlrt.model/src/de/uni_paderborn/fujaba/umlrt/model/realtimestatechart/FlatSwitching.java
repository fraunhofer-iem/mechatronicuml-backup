/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flat Switching</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getUMLRealtimeTransitions <em>UML Realtime Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getMinDuration <em>Min Duration</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getMaxDuration <em>Max Duration</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getSpline1 <em>Spline1</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getSpline2 <em>Spline2</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getPolynomDegree <em>Polynom Degree</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getPortInstToPortInstMapEntry <em>Port Inst To Port Inst Map Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFlatSwitching()
 * @model
 * @generated
 */
public interface FlatSwitching extends EObject {
	/**
	 * Returns the value of the '<em><b>UML Realtime Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UML Realtime Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UML Realtime Transitions</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFlatSwitching_UMLRealtimeTransitions()
	 * @model
	 * @generated
	 */
	EList<Transition> getUMLRealtimeTransitions();

	/**
	 * Returns the value of the '<em><b>Min Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Duration</em>' attribute.
	 * @see #setMinDuration(float)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFlatSwitching_MinDuration()
	 * @model
	 * @generated
	 */
	float getMinDuration();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getMinDuration <em>Min Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Duration</em>' attribute.
	 * @see #getMinDuration()
	 * @generated
	 */
	void setMinDuration(float value);

	/**
	 * Returns the value of the '<em><b>Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Duration</em>' attribute.
	 * @see #setMaxDuration(float)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFlatSwitching_MaxDuration()
	 * @model
	 * @generated
	 */
	float getMaxDuration();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getMaxDuration <em>Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Duration</em>' attribute.
	 * @see #getMaxDuration()
	 * @generated
	 */
	void setMaxDuration(float value);

	/**
	 * Returns the value of the '<em><b>Spline1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spline1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spline1</em>' attribute.
	 * @see #setSpline1(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFlatSwitching_Spline1()
	 * @model
	 * @generated
	 */
	String getSpline1();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getSpline1 <em>Spline1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spline1</em>' attribute.
	 * @see #getSpline1()
	 * @generated
	 */
	void setSpline1(String value);

	/**
	 * Returns the value of the '<em><b>Spline2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spline2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spline2</em>' attribute.
	 * @see #setSpline2(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFlatSwitching_Spline2()
	 * @model
	 * @generated
	 */
	String getSpline2();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getSpline2 <em>Spline2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spline2</em>' attribute.
	 * @see #getSpline2()
	 * @generated
	 */
	void setSpline2(String value);

	/**
	 * Returns the value of the '<em><b>Polynom Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polynom Degree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polynom Degree</em>' attribute.
	 * @see #setPolynomDegree(int)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFlatSwitching_PolynomDegree()
	 * @model
	 * @generated
	 */
	int getPolynomDegree();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getPolynomDegree <em>Polynom Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polynom Degree</em>' attribute.
	 * @see #getPolynomDegree()
	 * @generated
	 */
	void setPolynomDegree(int value);

	/**
	 * Returns the value of the '<em><b>Port Inst To Port Inst Map Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Inst To Port Inst Map Entry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Inst To Port Inst Map Entry</em>' attribute.
	 * @see #setPortInstToPortInstMapEntry(HashMap)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFlatSwitching_PortInstToPortInstMapEntry()
	 * @model dataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.MyMap<?, ?>"
	 * @generated
	 */
	HashMap<?, ?> getPortInstToPortInstMapEntry();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getPortInstToPortInstMapEntry <em>Port Inst To Port Inst Map Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Inst To Port Inst Map Entry</em>' attribute.
	 * @see #getPortInstToPortInstMapEntry()
	 * @generated
	 */
	void setPortInstToPortInstMapEntry(HashMap<?, ?> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean getBreakpoint();

} // FlatSwitching
