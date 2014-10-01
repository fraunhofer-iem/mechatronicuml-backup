/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unbounded External Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.UnboundedExternalEvent#getAvgInterarrival <em>Avg Interarrival</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.UnboundedExternalEvent#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.UnboundedExternalEvent#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getUnboundedExternalEvent()
 * @model extendedMetaData="name='Unbounded_External_Event' kind='empty'"
 * @generated
 */
public interface UnboundedExternalEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Avg Interarrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Interarrival</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Interarrival</em>' attribute.
	 * @see #isSetAvgInterarrival()
	 * @see #unsetAvgInterarrival()
	 * @see #setAvgInterarrival(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getUnboundedExternalEvent_AvgInterarrival()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Time"
	 *        extendedMetaData="kind='attribute' name='Avg_Interarrival'"
	 * @generated
	 */
	float getAvgInterarrival();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.UnboundedExternalEvent#getAvgInterarrival <em>Avg Interarrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Interarrival</em>' attribute.
	 * @see #isSetAvgInterarrival()
	 * @see #unsetAvgInterarrival()
	 * @see #getAvgInterarrival()
	 * @generated
	 */
	void setAvgInterarrival(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.UnboundedExternalEvent#getAvgInterarrival <em>Avg Interarrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAvgInterarrival()
	 * @see #getAvgInterarrival()
	 * @see #setAvgInterarrival(float)
	 * @generated
	 */
	void unsetAvgInterarrival();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.UnboundedExternalEvent#getAvgInterarrival <em>Avg Interarrival</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Avg Interarrival</em>' attribute is set.
	 * @see #unsetAvgInterarrival()
	 * @see #getAvgInterarrival()
	 * @see #setAvgInterarrival(float)
	 * @generated
	 */
	boolean isSetAvgInterarrival();

	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.mast.xmlmast.model.DistributionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.DistributionType
	 * @see #isSetDistribution()
	 * @see #unsetDistribution()
	 * @see #setDistribution(DistributionType)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getUnboundedExternalEvent_Distribution()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Distribution'"
	 * @generated
	 */
	DistributionType getDistribution();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.UnboundedExternalEvent#getDistribution <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.DistributionType
	 * @see #isSetDistribution()
	 * @see #unsetDistribution()
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(DistributionType value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.UnboundedExternalEvent#getDistribution <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistribution()
	 * @see #getDistribution()
	 * @see #setDistribution(DistributionType)
	 * @generated
	 */
	void unsetDistribution();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.UnboundedExternalEvent#getDistribution <em>Distribution</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distribution</em>' attribute is set.
	 * @see #unsetDistribution()
	 * @see #getDistribution()
	 * @see #setDistribution(DistributionType)
	 * @generated
	 */
	boolean isSetDistribution();

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getUnboundedExternalEvent_Name()
	 * @model dataType="es.unican.mast.xmlmast.model.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.UnboundedExternalEvent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // UnboundedExternalEvent
