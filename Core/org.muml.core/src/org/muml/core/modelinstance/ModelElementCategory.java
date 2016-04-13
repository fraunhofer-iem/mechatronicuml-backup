/**
 */
package org.muml.core.modelinstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.muml.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ModelElementCategory contains all model elements of a FUJABA model that
 * have the same type and will be opened by the same editor. A ModelElementCategory
 * may only store subclasses of NamedElement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.modelinstance.ModelElementCategory#getModelElements <em>Model Elements</em>}</li>
 *   <li>{@link org.muml.core.modelinstance.ModelElementCategory#getKey <em>Key</em>}</li>
 *   <li>{@link org.muml.core.modelinstance.ModelElementCategory#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.muml.core.modelinstance.ModelinstancePackage#getModelElementCategory()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ExclusivelyContainsValidElements'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ExclusivelyContainsValidElements='self.modelElements->select (e | not isValidElement(e))->isEmpty()'"
 * @generated
 */
public interface ModelElementCategory extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.core.ExtendableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ModelElements which are contained in this category. All model elements
	 * must be of the same type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Elements</em>' containment reference list.
	 * @see org.muml.core.modelinstance.ModelinstancePackage#getModelElementCategory_ModelElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtendableElement> getModelElements();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The uniquely identifying key of this category. The key of the category may be
	 * used by editors to register for the model elements contained in this section.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.muml.core.modelinstance.ModelinstancePackage#getModelElementCategory_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.muml.core.modelinstance.ModelElementCategory#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable name for this category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.muml.core.modelinstance.ModelinstancePackage#getModelElementCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.muml.core.modelinstance.ModelElementCategory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evaluates for the passed object whether it is a valid model element for this 
	 * ModelElementCategory.
	 * @param object
	 *   The passed object that we check whether it is a valid model element for this 
	 *   ModelElementCategory.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='isValidEClass(object.oclAsType(ecore::EObject).eClass())'"
	 * @generated
	 */
	boolean isValidElement(EObject object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evaluates for the passed ecore class whether it is a valid type for model element for this ModelElementCategory.
	 * @param eClass The passed eClass that we check whether it is a valid type for model element for this ModelElementCategory.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ModelInstancePlugin plugin = ModelInstancePlugin.getInstance();\r\nif (plugin != null) {\r\n\tModelElementCategoryRegistry registry = plugin.getModelElementCategoryRegistry();\r\n\treturn registry.isValidEClass(key, eClass);\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isValidEClass(EClass eClass);

} // ModelElementCategory
