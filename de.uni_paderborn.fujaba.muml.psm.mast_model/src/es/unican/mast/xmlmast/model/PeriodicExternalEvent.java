/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic External Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getMaxJitter <em>Max Jitter</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getPeriod <em>Period</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getPhase <em>Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getPeriodicExternalEvent()
 * @model extendedMetaData="name='Periodic_External_Event' kind='empty'"
 * @generated
 */
public interface PeriodicExternalEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Jitter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Jitter</em>' attribute.
	 * @see #isSetMaxJitter()
	 * @see #unsetMaxJitter()
	 * @see #setMaxJitter(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPeriodicExternalEvent_MaxJitter()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Time"
	 *        extendedMetaData="kind='attribute' name='Max_Jitter'"
	 * @generated
	 */
	float getMaxJitter();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getMaxJitter <em>Max Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Jitter</em>' attribute.
	 * @see #isSetMaxJitter()
	 * @see #unsetMaxJitter()
	 * @see #getMaxJitter()
	 * @generated
	 */
	void setMaxJitter(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getMaxJitter <em>Max Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxJitter()
	 * @see #getMaxJitter()
	 * @see #setMaxJitter(float)
	 * @generated
	 */
	void unsetMaxJitter();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getMaxJitter <em>Max Jitter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Jitter</em>' attribute is set.
	 * @see #unsetMaxJitter()
	 * @see #getMaxJitter()
	 * @see #setMaxJitter(float)
	 * @generated
	 */
	boolean isSetMaxJitter();

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPeriodicExternalEvent_Name()
	 * @model dataType="es.unican.mast.xmlmast.model.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #setPeriod(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPeriodicExternalEvent_Period()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Time"
	 *        extendedMetaData="kind='attribute' name='Period'"
	 * @generated
	 */
	float getPeriod();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(float)
	 * @generated
	 */
	void unsetPeriod();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getPeriod <em>Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Period</em>' attribute is set.
	 * @see #unsetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(float)
	 * @generated
	 */
	boolean isSetPeriod();

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #setPhase(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPeriodicExternalEvent_Phase()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.AbsoluteTime"
	 *        extendedMetaData="kind='attribute' name='Phase'"
	 * @generated
	 */
	float getPhase();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhase()
	 * @see #getPhase()
	 * @see #setPhase(float)
	 * @generated
	 */
	void unsetPhase();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getPhase <em>Phase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase</em>' attribute is set.
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @see #setPhase(float)
	 * @generated
	 */
	boolean isSetPhase();

} // PeriodicExternalEvent
