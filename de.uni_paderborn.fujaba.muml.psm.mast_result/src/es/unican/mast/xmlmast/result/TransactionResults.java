/**
 */
package es.unican.mast.xmlmast.result;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.TransactionResults#getGroup <em>Group</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.TransactionResults#getSlack <em>Slack</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.TransactionResults#getTimingResult <em>Timing Result</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.TransactionResults#getSimulationTimingResult <em>Simulation Timing Result</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.TransactionResults#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getTransactionResults()
 * @model extendedMetaData="name='Transaction_Results' kind='elementOnly'"
 * @generated
 */
public interface TransactionResults extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getTransactionResults_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Slack</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.result.Slack}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slack</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slack</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getTransactionResults_Slack()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Slack' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Slack> getSlack();

	/**
	 * Returns the value of the '<em><b>Timing Result</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.result.TimingResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Result</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getTransactionResults_TimingResult()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Timing_Result' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TimingResult> getTimingResult();

	/**
	 * Returns the value of the '<em><b>Simulation Timing Result</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.result.SimulationTimingResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Timing Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Timing Result</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getTransactionResults_SimulationTimingResult()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Simulation_Timing_Result' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SimulationTimingResult> getSimulationTimingResult();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getTransactionResults_Name()
	 * @model dataType="es.unican.mast.xmlmast.result.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.TransactionResults#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TransactionResults
