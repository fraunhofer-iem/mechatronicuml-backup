/**
 */
package es.unican.mast.xmlmast.model;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sporadic Server Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getBackgroundPriority <em>Background Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getInitialCapacity <em>Initial Capacity</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getMaxPendingReplenishments <em>Max Pending Replenishments</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getNormalPriority <em>Normal Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getPreassigned <em>Preassigned</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getReplenishmentPeriod <em>Replenishment Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getSporadicServerPolicy()
 * @model extendedMetaData="name='Sporadic_Server_Policy' kind='empty'"
 * @generated
 */
public interface SporadicServerPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Background Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Priority</em>' attribute.
	 * @see #setBackgroundPriority(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSporadicServerPolicy_BackgroundPriority()
	 * @model dataType="es.unican.mast.xmlmast.model.Priority"
	 *        extendedMetaData="kind='attribute' name='Background_Priority'"
	 * @generated
	 */
	BigInteger getBackgroundPriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getBackgroundPriority <em>Background Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Priority</em>' attribute.
	 * @see #getBackgroundPriority()
	 * @generated
	 */
	void setBackgroundPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Initial Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Capacity</em>' attribute.
	 * @see #isSetInitialCapacity()
	 * @see #unsetInitialCapacity()
	 * @see #setInitialCapacity(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSporadicServerPolicy_InitialCapacity()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Time"
	 *        extendedMetaData="kind='attribute' name='Initial_Capacity'"
	 * @generated
	 */
	float getInitialCapacity();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getInitialCapacity <em>Initial Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Capacity</em>' attribute.
	 * @see #isSetInitialCapacity()
	 * @see #unsetInitialCapacity()
	 * @see #getInitialCapacity()
	 * @generated
	 */
	void setInitialCapacity(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getInitialCapacity <em>Initial Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialCapacity()
	 * @see #getInitialCapacity()
	 * @see #setInitialCapacity(float)
	 * @generated
	 */
	void unsetInitialCapacity();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getInitialCapacity <em>Initial Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial Capacity</em>' attribute is set.
	 * @see #unsetInitialCapacity()
	 * @see #getInitialCapacity()
	 * @see #setInitialCapacity(float)
	 * @generated
	 */
	boolean isSetInitialCapacity();

	/**
	 * Returns the value of the '<em><b>Max Pending Replenishments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Pending Replenishments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Pending Replenishments</em>' attribute.
	 * @see #setMaxPendingReplenishments(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSporadicServerPolicy_MaxPendingReplenishments()
	 * @model dataType="es.unican.mast.xmlmast.model.Positive"
	 *        extendedMetaData="kind='attribute' name='Max_Pending_Replenishments'"
	 * @generated
	 */
	BigInteger getMaxPendingReplenishments();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getMaxPendingReplenishments <em>Max Pending Replenishments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pending Replenishments</em>' attribute.
	 * @see #getMaxPendingReplenishments()
	 * @generated
	 */
	void setMaxPendingReplenishments(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Normal Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Priority</em>' attribute.
	 * @see #setNormalPriority(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSporadicServerPolicy_NormalPriority()
	 * @model dataType="es.unican.mast.xmlmast.model.Priority"
	 *        extendedMetaData="kind='attribute' name='Normal_Priority'"
	 * @generated
	 */
	BigInteger getNormalPriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getNormalPriority <em>Normal Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Priority</em>' attribute.
	 * @see #getNormalPriority()
	 * @generated
	 */
	void setNormalPriority(BigInteger value);

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSporadicServerPolicy_Preassigned()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Preassigned'"
	 * @generated
	 */
	Assertion getPreassigned();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getPreassigned <em>Preassigned</em>}' attribute.
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
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getPreassigned <em>Preassigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreassigned()
	 * @see #getPreassigned()
	 * @see #setPreassigned(Assertion)
	 * @generated
	 */
	void unsetPreassigned();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getPreassigned <em>Preassigned</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Replenishment Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replenishment Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replenishment Period</em>' attribute.
	 * @see #isSetReplenishmentPeriod()
	 * @see #unsetReplenishmentPeriod()
	 * @see #setReplenishmentPeriod(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSporadicServerPolicy_ReplenishmentPeriod()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Time"
	 *        extendedMetaData="kind='attribute' name='Replenishment_Period'"
	 * @generated
	 */
	float getReplenishmentPeriod();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getReplenishmentPeriod <em>Replenishment Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replenishment Period</em>' attribute.
	 * @see #isSetReplenishmentPeriod()
	 * @see #unsetReplenishmentPeriod()
	 * @see #getReplenishmentPeriod()
	 * @generated
	 */
	void setReplenishmentPeriod(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getReplenishmentPeriod <em>Replenishment Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReplenishmentPeriod()
	 * @see #getReplenishmentPeriod()
	 * @see #setReplenishmentPeriod(float)
	 * @generated
	 */
	void unsetReplenishmentPeriod();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getReplenishmentPeriod <em>Replenishment Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Replenishment Period</em>' attribute is set.
	 * @see #unsetReplenishmentPeriod()
	 * @see #getReplenishmentPeriod()
	 * @see #setReplenishmentPeriod(float)
	 * @generated
	 */
	boolean isSetReplenishmentPeriod();

} // SporadicServerPolicy
