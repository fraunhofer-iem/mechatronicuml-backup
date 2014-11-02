/**
 */
package es.unican.mast.xmlmast.model;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polling Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingAvgOverhead <em>Polling Avg Overhead</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingBestOverhead <em>Polling Best Overhead</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingPeriod <em>Polling Period</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingWorstOverhead <em>Polling Worst Overhead</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PollingPolicy#getPreassigned <em>Preassigned</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PollingPolicy#getThePriority <em>The Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getPollingPolicy()
 * @model extendedMetaData="name='Polling_Policy' kind='empty'"
 * @generated
 */
public interface PollingPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Polling Avg Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polling Avg Overhead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polling Avg Overhead</em>' attribute.
	 * @see #isSetPollingAvgOverhead()
	 * @see #unsetPollingAvgOverhead()
	 * @see #setPollingAvgOverhead(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPollingPolicy_PollingAvgOverhead()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Polling_Avg_Overhead'"
	 * @generated
	 */
	float getPollingAvgOverhead();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingAvgOverhead <em>Polling Avg Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polling Avg Overhead</em>' attribute.
	 * @see #isSetPollingAvgOverhead()
	 * @see #unsetPollingAvgOverhead()
	 * @see #getPollingAvgOverhead()
	 * @generated
	 */
	void setPollingAvgOverhead(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingAvgOverhead <em>Polling Avg Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPollingAvgOverhead()
	 * @see #getPollingAvgOverhead()
	 * @see #setPollingAvgOverhead(float)
	 * @generated
	 */
	void unsetPollingAvgOverhead();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingAvgOverhead <em>Polling Avg Overhead</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Polling Avg Overhead</em>' attribute is set.
	 * @see #unsetPollingAvgOverhead()
	 * @see #getPollingAvgOverhead()
	 * @see #setPollingAvgOverhead(float)
	 * @generated
	 */
	boolean isSetPollingAvgOverhead();

	/**
	 * Returns the value of the '<em><b>Polling Best Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polling Best Overhead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polling Best Overhead</em>' attribute.
	 * @see #isSetPollingBestOverhead()
	 * @see #unsetPollingBestOverhead()
	 * @see #setPollingBestOverhead(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPollingPolicy_PollingBestOverhead()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Polling_Best_Overhead'"
	 * @generated
	 */
	float getPollingBestOverhead();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingBestOverhead <em>Polling Best Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polling Best Overhead</em>' attribute.
	 * @see #isSetPollingBestOverhead()
	 * @see #unsetPollingBestOverhead()
	 * @see #getPollingBestOverhead()
	 * @generated
	 */
	void setPollingBestOverhead(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingBestOverhead <em>Polling Best Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPollingBestOverhead()
	 * @see #getPollingBestOverhead()
	 * @see #setPollingBestOverhead(float)
	 * @generated
	 */
	void unsetPollingBestOverhead();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingBestOverhead <em>Polling Best Overhead</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Polling Best Overhead</em>' attribute is set.
	 * @see #unsetPollingBestOverhead()
	 * @see #getPollingBestOverhead()
	 * @see #setPollingBestOverhead(float)
	 * @generated
	 */
	boolean isSetPollingBestOverhead();

	/**
	 * Returns the value of the '<em><b>Polling Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polling Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polling Period</em>' attribute.
	 * @see #isSetPollingPeriod()
	 * @see #unsetPollingPeriod()
	 * @see #setPollingPeriod(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPollingPolicy_PollingPeriod()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Time"
	 *        extendedMetaData="kind='attribute' name='Polling_Period'"
	 * @generated
	 */
	float getPollingPeriod();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingPeriod <em>Polling Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polling Period</em>' attribute.
	 * @see #isSetPollingPeriod()
	 * @see #unsetPollingPeriod()
	 * @see #getPollingPeriod()
	 * @generated
	 */
	void setPollingPeriod(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingPeriod <em>Polling Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPollingPeriod()
	 * @see #getPollingPeriod()
	 * @see #setPollingPeriod(float)
	 * @generated
	 */
	void unsetPollingPeriod();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingPeriod <em>Polling Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Polling Period</em>' attribute is set.
	 * @see #unsetPollingPeriod()
	 * @see #getPollingPeriod()
	 * @see #setPollingPeriod(float)
	 * @generated
	 */
	boolean isSetPollingPeriod();

	/**
	 * Returns the value of the '<em><b>Polling Worst Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polling Worst Overhead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polling Worst Overhead</em>' attribute.
	 * @see #isSetPollingWorstOverhead()
	 * @see #unsetPollingWorstOverhead()
	 * @see #setPollingWorstOverhead(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPollingPolicy_PollingWorstOverhead()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Polling_Worst_Overhead'"
	 * @generated
	 */
	float getPollingWorstOverhead();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingWorstOverhead <em>Polling Worst Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polling Worst Overhead</em>' attribute.
	 * @see #isSetPollingWorstOverhead()
	 * @see #unsetPollingWorstOverhead()
	 * @see #getPollingWorstOverhead()
	 * @generated
	 */
	void setPollingWorstOverhead(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingWorstOverhead <em>Polling Worst Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPollingWorstOverhead()
	 * @see #getPollingWorstOverhead()
	 * @see #setPollingWorstOverhead(float)
	 * @generated
	 */
	void unsetPollingWorstOverhead();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingWorstOverhead <em>Polling Worst Overhead</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Polling Worst Overhead</em>' attribute is set.
	 * @see #unsetPollingWorstOverhead()
	 * @see #getPollingWorstOverhead()
	 * @see #setPollingWorstOverhead(float)
	 * @generated
	 */
	boolean isSetPollingWorstOverhead();

	/**
	 * Returns the value of the '<em><b>Preassigned</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.mast.xmlmast.model.Assertion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preassigned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preassigned</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.Assertion
	 * @see #isSetPreassigned()
	 * @see #unsetPreassigned()
	 * @see #setPreassigned(Assertion)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPollingPolicy_Preassigned()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Preassigned'"
	 * @generated
	 */
	Assertion getPreassigned();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPreassigned <em>Preassigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preassigned</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.Assertion
	 * @see #isSetPreassigned()
	 * @see #unsetPreassigned()
	 * @see #getPreassigned()
	 * @generated
	 */
	void setPreassigned(Assertion value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPreassigned <em>Preassigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreassigned()
	 * @see #getPreassigned()
	 * @see #setPreassigned(Assertion)
	 * @generated
	 */
	void unsetPreassigned();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPreassigned <em>Preassigned</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preassigned</em>' attribute is set.
	 * @see #unsetPreassigned()
	 * @see #getPreassigned()
	 * @see #setPreassigned(Assertion)
	 * @generated
	 */
	boolean isSetPreassigned();

	/**
	 * Returns the value of the '<em><b>The Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Priority</em>' attribute.
	 * @see #setThePriority(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPollingPolicy_ThePriority()
	 * @model dataType="es.unican.mast.xmlmast.model.Priority"
	 *        extendedMetaData="kind='attribute' name='The_Priority'"
	 * @generated
	 */
	BigInteger getThePriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PollingPolicy#getThePriority <em>The Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Priority</em>' attribute.
	 * @see #getThePriority()
	 * @generated
	 */
	void setThePriority(BigInteger value);

} // PollingPolicy
