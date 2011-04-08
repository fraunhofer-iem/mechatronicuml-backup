/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.component.Port;

import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fading Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getFunction <em>Function</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getUMLRealtimeTransitions <em>UML Realtime Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getMinDuration <em>Min Duration</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getMaxDuration <em>Max Duration</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getSpline1 <em>Spline1</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getSpline2 <em>Spline2</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getPolynomDegree <em>Polynom Degree</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getPortsByComponentInstance <em>Ports By Component Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getPortInstToPortInstMapEntry <em>Port Inst To Port Inst Map Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFadingFunction()
 * @model
 * @generated
 */
public interface FadingFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFadingFunction_Function()
	 * @model
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);

	/**
	 * Returns the value of the '<em><b>UML Realtime Transitions</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getUMLRealtimeFadingFunction <em>UML Realtime Fading Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UML Realtime Transitions</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UML Realtime Transitions</em>' container reference.
	 * @see #setUMLRealtimeTransitions(Transition)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFadingFunction_UMLRealtimeTransitions()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getUMLRealtimeFadingFunction
	 * @model opposite="uMLRealtimeFadingFunction" transient="false"
	 * @generated
	 */
	Transition getUMLRealtimeTransitions();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getUMLRealtimeTransitions <em>UML Realtime Transitions</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Transitions</em>' container reference.
	 * @see #getUMLRealtimeTransitions()
	 * @generated
	 */
	void setUMLRealtimeTransitions(Transition value);

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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFadingFunction_MinDuration()
	 * @model
	 * @generated
	 */
	float getMinDuration();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getMinDuration <em>Min Duration</em>}' attribute.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFadingFunction_MaxDuration()
	 * @model
	 * @generated
	 */
	float getMaxDuration();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getMaxDuration <em>Max Duration</em>}' attribute.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFadingFunction_Spline1()
	 * @model
	 * @generated
	 */
	String getSpline1();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getSpline1 <em>Spline1</em>}' attribute.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFadingFunction_Spline2()
	 * @model
	 * @generated
	 */
	String getSpline2();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getSpline2 <em>Spline2</em>}' attribute.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFadingFunction_PolynomDegree()
	 * @model
	 * @generated
	 */
	int getPolynomDegree();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getPolynomDegree <em>Polynom Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polynom Degree</em>' attribute.
	 * @see #getPolynomDegree()
	 * @generated
	 */
	void setPolynomDegree(int value);

	/**
	 * Returns the value of the '<em><b>Ports By Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports By Component Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports By Component Instance</em>' reference.
	 * @see #setPortsByComponentInstance(Map.Entry)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFadingFunction_PortsByComponentInstance()
	 * @model mapType="de.uni_paderborn.fujaba.umlrt.model.instance.CI2PsMapEntry<de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance, de.uni_paderborn.fujaba.umlrt.model.component.Port>"
	 * @generated
	 */
	Map.Entry<ComponentInstance, EList<Port>> getPortsByComponentInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getPortsByComponentInstance <em>Ports By Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports By Component Instance</em>' reference.
	 * @see #getPortsByComponentInstance()
	 * @generated
	 */
	void setPortsByComponentInstance(Map.Entry<ComponentInstance, EList<Port>> value);

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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFadingFunction_PortInstToPortInstMapEntry()
	 * @model dataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.MyMap<?, ?>"
	 * @generated
	 */
	HashMap<?, ?> getPortInstToPortInstMapEntry();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getPortInstToPortInstMapEntry <em>Port Inst To Port Inst Map Entry</em>}' attribute.
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

} // FadingFunction
