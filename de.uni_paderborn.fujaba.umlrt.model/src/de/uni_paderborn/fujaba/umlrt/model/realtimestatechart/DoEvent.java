/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getUMLRealtimeAction <em>UML Realtime Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getDoActionRev <em>Do Action Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getPeriodLower <em>Period Lower</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getPeriodUpper <em>Period Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getDoEvent()
 * @model
 * @generated
 */
public interface DoEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>UML Realtime Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UML Realtime Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UML Realtime Action</em>' reference.
	 * @see #setUMLRealtimeAction(UMLRealtimeAction)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getDoEvent_UMLRealtimeAction()
	 * @model
	 * @generated
	 */
	UMLRealtimeAction getUMLRealtimeAction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getUMLRealtimeAction <em>UML Realtime Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Action</em>' reference.
	 * @see #getUMLRealtimeAction()
	 * @generated
	 */
	void setUMLRealtimeAction(UMLRealtimeAction value);

	/**
	 * Returns the value of the '<em><b>Do Action Rev</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeCompositeState#getDoAction <em>Do Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Action Rev</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Action Rev</em>' container reference.
	 * @see #setDoActionRev(UMLRealtimeCompositeState)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getDoEvent_DoActionRev()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeCompositeState#getDoAction
	 * @model opposite="doAction" transient="false"
	 * @generated
	 */
	UMLRealtimeCompositeState getDoActionRev();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getDoActionRev <em>Do Action Rev</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Action Rev</em>' container reference.
	 * @see #getDoActionRev()
	 * @generated
	 */
	void setDoActionRev(UMLRealtimeCompositeState value);

	/**
	 * Returns the value of the '<em><b>Period Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Lower</em>' attribute.
	 * @see #setPeriodLower(int)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getDoEvent_PeriodLower()
	 * @model
	 * @generated
	 */
	int getPeriodLower();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getPeriodLower <em>Period Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Lower</em>' attribute.
	 * @see #getPeriodLower()
	 * @generated
	 */
	void setPeriodLower(int value);

	/**
	 * Returns the value of the '<em><b>Period Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Upper</em>' attribute.
	 * @see #setPeriodUpper(int)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getDoEvent_PeriodUpper()
	 * @model
	 * @generated
	 */
	int getPeriodUpper();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getPeriodUpper <em>Period Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Upper</em>' attribute.
	 * @see #getPeriodUpper()
	 * @generated
	 */
	void setPeriodUpper(int value);

} // DoEvent
