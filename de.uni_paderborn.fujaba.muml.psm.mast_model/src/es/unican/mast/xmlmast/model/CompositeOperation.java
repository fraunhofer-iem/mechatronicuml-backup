/**
 */
package es.unican.mast.xmlmast.model;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.CompositeOperation#getOverriddenFixedPriority <em>Overridden Fixed Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.CompositeOperation#getOverriddenPermanentFP <em>Overridden Permanent FP</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.CompositeOperation#getOperationList <em>Operation List</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.CompositeOperation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getCompositeOperation()
 * @model extendedMetaData="name='Composite_Operation' kind='elementOnly'"
 * @generated
 */
public interface CompositeOperation extends EObject {
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getCompositeOperation_OverriddenFixedPriority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Overridden_Fixed_Priority' namespace='##targetNamespace'"
	 * @generated
	 */
	OverriddenFixedPriority getOverriddenFixedPriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.CompositeOperation#getOverriddenFixedPriority <em>Overridden Fixed Priority</em>}' containment reference.
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getCompositeOperation_OverriddenPermanentFP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Overridden_Permanent_FP' namespace='##targetNamespace'"
	 * @generated
	 */
	OverriddenPermanentFP getOverriddenPermanentFP();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.CompositeOperation#getOverriddenPermanentFP <em>Overridden Permanent FP</em>}' containment reference.
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getCompositeOperation_OperationList()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRefList" required="true" many="false"
	 *        extendedMetaData="kind='element' name='Operation_List' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getOperationList();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.CompositeOperation#getOperationList <em>Operation List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation List</em>' attribute.
	 * @see #getOperationList()
	 * @generated
	 */
	void setOperationList(List<String> value);

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getCompositeOperation_Name()
	 * @model dataType="es.unican.mast.xmlmast.model.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.CompositeOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CompositeOperation
