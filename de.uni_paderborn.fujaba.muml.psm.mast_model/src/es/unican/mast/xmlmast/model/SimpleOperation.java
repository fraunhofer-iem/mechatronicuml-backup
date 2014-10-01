/**
 */
package es.unican.mast.xmlmast.model;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.SimpleOperation#getOverriddenFixedPriority <em>Overridden Fixed Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SimpleOperation#getOverriddenPermanentFP <em>Overridden Permanent FP</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SimpleOperation#getSharedResourcesList <em>Shared Resources List</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SimpleOperation#getSharedResourcesToLock <em>Shared Resources To Lock</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SimpleOperation#getSharedResourcesToUnlock <em>Shared Resources To Unlock</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SimpleOperation#getAverageCaseExecutionTime <em>Average Case Execution Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SimpleOperation#getBestCaseExecutionTime <em>Best Case Execution Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SimpleOperation#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SimpleOperation#getWorstCaseExecutionTime <em>Worst Case Execution Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getSimpleOperation()
 * @model extendedMetaData="name='Simple_Operation' kind='elementOnly'"
 * @generated
 */
public interface SimpleOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Overridden Fixed Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overridden Fixed Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overridden Fixed Priority</em>' containment reference.
	 * @see #setOverriddenFixedPriority(OverriddenFixedPriority)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSimpleOperation_OverriddenFixedPriority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Overridden_Fixed_Priority' namespace='##targetNamespace'"
	 * @generated
	 */
	OverriddenFixedPriority getOverriddenFixedPriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SimpleOperation#getOverriddenFixedPriority <em>Overridden Fixed Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overridden Fixed Priority</em>' containment reference.
	 * @see #getOverriddenFixedPriority()
	 * @generated
	 */
	void setOverriddenFixedPriority(OverriddenFixedPriority value);

	/**
	 * Returns the value of the '<em><b>Overridden Permanent FP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overridden Permanent FP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overridden Permanent FP</em>' containment reference.
	 * @see #setOverriddenPermanentFP(OverriddenPermanentFP)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSimpleOperation_OverriddenPermanentFP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Overridden_Permanent_FP' namespace='##targetNamespace'"
	 * @generated
	 */
	OverriddenPermanentFP getOverriddenPermanentFP();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SimpleOperation#getOverriddenPermanentFP <em>Overridden Permanent FP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overridden Permanent FP</em>' containment reference.
	 * @see #getOverriddenPermanentFP()
	 * @generated
	 */
	void setOverriddenPermanentFP(OverriddenPermanentFP value);

	/**
	 * Returns the value of the '<em><b>Shared Resources List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Resources List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Resources List</em>' attribute.
	 * @see #setSharedResourcesList(List)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSimpleOperation_SharedResourcesList()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRefList" many="false"
	 *        extendedMetaData="kind='element' name='Shared_Resources_List' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getSharedResourcesList();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SimpleOperation#getSharedResourcesList <em>Shared Resources List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Resources List</em>' attribute.
	 * @see #getSharedResourcesList()
	 * @generated
	 */
	void setSharedResourcesList(List<String> value);

	/**
	 * Returns the value of the '<em><b>Shared Resources To Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Resources To Lock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Resources To Lock</em>' attribute.
	 * @see #setSharedResourcesToLock(List)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSimpleOperation_SharedResourcesToLock()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRefList" many="false"
	 *        extendedMetaData="kind='element' name='Shared_Resources_To_Lock' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getSharedResourcesToLock();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SimpleOperation#getSharedResourcesToLock <em>Shared Resources To Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Resources To Lock</em>' attribute.
	 * @see #getSharedResourcesToLock()
	 * @generated
	 */
	void setSharedResourcesToLock(List<String> value);

	/**
	 * Returns the value of the '<em><b>Shared Resources To Unlock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Resources To Unlock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Resources To Unlock</em>' attribute.
	 * @see #setSharedResourcesToUnlock(List)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSimpleOperation_SharedResourcesToUnlock()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRefList" many="false"
	 *        extendedMetaData="kind='element' name='Shared_Resources_To_Unlock' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getSharedResourcesToUnlock();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SimpleOperation#getSharedResourcesToUnlock <em>Shared Resources To Unlock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Resources To Unlock</em>' attribute.
	 * @see #getSharedResourcesToUnlock()
	 * @generated
	 */
	void setSharedResourcesToUnlock(List<String> value);

	/**
	 * Returns the value of the '<em><b>Average Case Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Case Execution Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Case Execution Time</em>' attribute.
	 * @see #isSetAverageCaseExecutionTime()
	 * @see #unsetAverageCaseExecutionTime()
	 * @see #setAverageCaseExecutionTime(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSimpleOperation_AverageCaseExecutionTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Average_Case_Execution_Time'"
	 * @generated
	 */
	float getAverageCaseExecutionTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SimpleOperation#getAverageCaseExecutionTime <em>Average Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Case Execution Time</em>' attribute.
	 * @see #isSetAverageCaseExecutionTime()
	 * @see #unsetAverageCaseExecutionTime()
	 * @see #getAverageCaseExecutionTime()
	 * @generated
	 */
	void setAverageCaseExecutionTime(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.SimpleOperation#getAverageCaseExecutionTime <em>Average Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAverageCaseExecutionTime()
	 * @see #getAverageCaseExecutionTime()
	 * @see #setAverageCaseExecutionTime(float)
	 * @generated
	 */
	void unsetAverageCaseExecutionTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.SimpleOperation#getAverageCaseExecutionTime <em>Average Case Execution Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Average Case Execution Time</em>' attribute is set.
	 * @see #unsetAverageCaseExecutionTime()
	 * @see #getAverageCaseExecutionTime()
	 * @see #setAverageCaseExecutionTime(float)
	 * @generated
	 */
	boolean isSetAverageCaseExecutionTime();

	/**
	 * Returns the value of the '<em><b>Best Case Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Best Case Execution Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best Case Execution Time</em>' attribute.
	 * @see #isSetBestCaseExecutionTime()
	 * @see #unsetBestCaseExecutionTime()
	 * @see #setBestCaseExecutionTime(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSimpleOperation_BestCaseExecutionTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Best_Case_Execution_Time'"
	 * @generated
	 */
	float getBestCaseExecutionTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SimpleOperation#getBestCaseExecutionTime <em>Best Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best Case Execution Time</em>' attribute.
	 * @see #isSetBestCaseExecutionTime()
	 * @see #unsetBestCaseExecutionTime()
	 * @see #getBestCaseExecutionTime()
	 * @generated
	 */
	void setBestCaseExecutionTime(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.SimpleOperation#getBestCaseExecutionTime <em>Best Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBestCaseExecutionTime()
	 * @see #getBestCaseExecutionTime()
	 * @see #setBestCaseExecutionTime(float)
	 * @generated
	 */
	void unsetBestCaseExecutionTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.SimpleOperation#getBestCaseExecutionTime <em>Best Case Execution Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Best Case Execution Time</em>' attribute is set.
	 * @see #unsetBestCaseExecutionTime()
	 * @see #getBestCaseExecutionTime()
	 * @see #setBestCaseExecutionTime(float)
	 * @generated
	 */
	boolean isSetBestCaseExecutionTime();

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSimpleOperation_Name()
	 * @model dataType="es.unican.mast.xmlmast.model.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SimpleOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Worst Case Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worst Case Execution Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worst Case Execution Time</em>' attribute.
	 * @see #isSetWorstCaseExecutionTime()
	 * @see #unsetWorstCaseExecutionTime()
	 * @see #setWorstCaseExecutionTime(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSimpleOperation_WorstCaseExecutionTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Worst_Case_Execution_Time'"
	 * @generated
	 */
	float getWorstCaseExecutionTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SimpleOperation#getWorstCaseExecutionTime <em>Worst Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst Case Execution Time</em>' attribute.
	 * @see #isSetWorstCaseExecutionTime()
	 * @see #unsetWorstCaseExecutionTime()
	 * @see #getWorstCaseExecutionTime()
	 * @generated
	 */
	void setWorstCaseExecutionTime(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.SimpleOperation#getWorstCaseExecutionTime <em>Worst Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorstCaseExecutionTime()
	 * @see #getWorstCaseExecutionTime()
	 * @see #setWorstCaseExecutionTime(float)
	 * @generated
	 */
	void unsetWorstCaseExecutionTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.SimpleOperation#getWorstCaseExecutionTime <em>Worst Case Execution Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Worst Case Execution Time</em>' attribute is set.
	 * @see #unsetWorstCaseExecutionTime()
	 * @see #getWorstCaseExecutionTime()
	 * @see #setWorstCaseExecutionTime(float)
	 * @generated
	 */
	boolean isSetWorstCaseExecutionTime();

} // SimpleOperation
