/**
 */
package es.unican.mast.xmlmast.model;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enclosing Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.EnclosingOperation#getOverriddenFixedPriority <em>Overridden Fixed Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.EnclosingOperation#getOverriddenPermanentFP <em>Overridden Permanent FP</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.EnclosingOperation#getOperationList <em>Operation List</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.EnclosingOperation#getAverageCaseExecutionTime <em>Average Case Execution Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.EnclosingOperation#getBestCaseExecutionTime <em>Best Case Execution Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.EnclosingOperation#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.EnclosingOperation#getWorstCaseExecutionTime <em>Worst Case Execution Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getEnclosingOperation()
 * @model extendedMetaData="name='Enclosing_Operation' kind='elementOnly'"
 * @generated
 */
public interface EnclosingOperation extends EObject {
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getEnclosingOperation_OverriddenFixedPriority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Overridden_Fixed_Priority' namespace='##targetNamespace'"
	 * @generated
	 */
	OverriddenFixedPriority getOverriddenFixedPriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getOverriddenFixedPriority <em>Overridden Fixed Priority</em>}' containment reference.
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getEnclosingOperation_OverriddenPermanentFP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Overridden_Permanent_FP' namespace='##targetNamespace'"
	 * @generated
	 */
	OverriddenPermanentFP getOverriddenPermanentFP();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getOverriddenPermanentFP <em>Overridden Permanent FP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overridden Permanent FP</em>' containment reference.
	 * @see #getOverriddenPermanentFP()
	 * @generated
	 */
	void setOverriddenPermanentFP(OverriddenPermanentFP value);

	/**
	 * Returns the value of the '<em><b>Operation List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation List</em>' attribute.
	 * @see #setOperationList(List)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getEnclosingOperation_OperationList()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRefList" required="true" many="false"
	 *        extendedMetaData="kind='element' name='Operation_List' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getOperationList();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getOperationList <em>Operation List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation List</em>' attribute.
	 * @see #getOperationList()
	 * @generated
	 */
	void setOperationList(List<String> value);

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getEnclosingOperation_AverageCaseExecutionTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Average_Case_Execution_Time'"
	 * @generated
	 */
	float getAverageCaseExecutionTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getAverageCaseExecutionTime <em>Average Case Execution Time</em>}' attribute.
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
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getAverageCaseExecutionTime <em>Average Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAverageCaseExecutionTime()
	 * @see #getAverageCaseExecutionTime()
	 * @see #setAverageCaseExecutionTime(float)
	 * @generated
	 */
	void unsetAverageCaseExecutionTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getAverageCaseExecutionTime <em>Average Case Execution Time</em>}' attribute is set.
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getEnclosingOperation_BestCaseExecutionTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Best_Case_Execution_Time'"
	 * @generated
	 */
	float getBestCaseExecutionTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getBestCaseExecutionTime <em>Best Case Execution Time</em>}' attribute.
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
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getBestCaseExecutionTime <em>Best Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBestCaseExecutionTime()
	 * @see #getBestCaseExecutionTime()
	 * @see #setBestCaseExecutionTime(float)
	 * @generated
	 */
	void unsetBestCaseExecutionTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getBestCaseExecutionTime <em>Best Case Execution Time</em>}' attribute is set.
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getEnclosingOperation_Name()
	 * @model dataType="es.unican.mast.xmlmast.model.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getName <em>Name</em>}' attribute.
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getEnclosingOperation_WorstCaseExecutionTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Worst_Case_Execution_Time'"
	 * @generated
	 */
	float getWorstCaseExecutionTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getWorstCaseExecutionTime <em>Worst Case Execution Time</em>}' attribute.
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
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getWorstCaseExecutionTime <em>Worst Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorstCaseExecutionTime()
	 * @see #getWorstCaseExecutionTime()
	 * @see #setWorstCaseExecutionTime(float)
	 * @generated
	 */
	void unsetWorstCaseExecutionTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getWorstCaseExecutionTime <em>Worst Case Execution Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Worst Case Execution Time</em>' attribute is set.
	 * @see #unsetWorstCaseExecutionTime()
	 * @see #getWorstCaseExecutionTime()
	 * @see #setWorstCaseExecutionTime(float)
	 * @generated
	 */
	boolean isSetWorstCaseExecutionTime();

} // EnclosingOperation
