/**
 */
package org.muml.ape;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.ape.PropertyGenerator#getReconciler <em>Reconciler</em>}</li>
 *   <li>{@link org.muml.ape.PropertyGenerator#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link org.muml.ape.PropertyGenerator#getReferencedGenerators <em>Referenced Generators</em>}</li>
 *   <li>{@link org.muml.ape.PropertyGenerator#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link org.muml.ape.PropertyGenerator#getDefaultTab <em>Default Tab</em>}</li>
 *   <li>{@link org.muml.ape.PropertyGenerator#getTabs <em>Tabs</em>}</li>
 *   <li>{@link org.muml.ape.PropertyGenerator#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.muml.ape.PropertyGenerator#getContributorId <em>Contributor Id</em>}</li>
 *   <li>{@link org.muml.ape.PropertyGenerator#getSourceFolder <em>Source Folder</em>}</li>
 * </ul>
 *
 * @see org.muml.ape.PropertiesPackage#getPropertyGenerator()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniquePackages NoSelfReference'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniquePackages='packages->isUnique(genPackage)' NoSelfReference='not referencedGenerators->includes(self)'"
 * @generated
 */
public interface PropertyGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Reconciler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconciler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconciler</em>' containment reference.
	 * @see #setReconciler(Reconciler)
	 * @see org.muml.ape.PropertiesPackage#getPropertyGenerator_Reconciler()
	 * @model containment="true"
	 * @generated
	 */
	Reconciler getReconciler();

	/**
	 * Sets the value of the '{@link org.muml.ape.PropertyGenerator#getReconciler <em>Reconciler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconciler</em>' containment reference.
	 * @see #getReconciler()
	 * @generated
	 */
	void setReconciler(Reconciler value);

	/**
	 * Returns the value of the '<em><b>Gen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Model</em>' reference.
	 * @see #setGenModel(GenModel)
	 * @see org.muml.ape.PropertiesPackage#getPropertyGenerator_GenModel()
	 * @model required="true"
	 * @generated
	 */
	GenModel getGenModel();

	/**
	 * Sets the value of the '{@link org.muml.ape.PropertyGenerator#getGenModel <em>Gen Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Model</em>' reference.
	 * @see #getGenModel()
	 * @generated
	 */
	void setGenModel(GenModel value);

	/**
	 * Returns the value of the '<em><b>Referenced Generators</b></em>' reference list.
	 * The list contents are of type {@link org.muml.ape.PropertyGenerator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Generators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Generators</em>' reference list.
	 * @see org.muml.ape.PropertiesPackage#getPropertyGenerator_ReferencedGenerators()
	 * @model
	 * @generated
	 */
	EList<PropertyGenerator> getReferencedGenerators();

	/**
	 * Returns the value of the '<em><b>Plugin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin</em>' containment reference.
	 * @see #setPlugin(Plugin)
	 * @see org.muml.ape.PropertiesPackage#getPropertyGenerator_Plugin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Plugin getPlugin();

	/**
	 * Sets the value of the '{@link org.muml.ape.PropertyGenerator#getPlugin <em>Plugin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin</em>' containment reference.
	 * @see #getPlugin()
	 * @generated
	 */
	void setPlugin(Plugin value);

	/**
	 * Returns the value of the '<em><b>Default Tab</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Tab</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Tab</em>' reference.
	 * @see #setDefaultTab(PropertyTab)
	 * @see org.muml.ape.PropertiesPackage#getPropertyGenerator_DefaultTab()
	 * @model
	 * @generated
	 */
	PropertyTab getDefaultTab();

	/**
	 * Sets the value of the '{@link org.muml.ape.PropertyGenerator#getDefaultTab <em>Default Tab</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Tab</em>' reference.
	 * @see #getDefaultTab()
	 * @generated
	 */
	void setDefaultTab(PropertyTab value);

	/**
	 * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.ape.PropertyTab}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabs</em>' containment reference list.
	 * @see org.muml.ape.PropertiesPackage#getPropertyGenerator_Tabs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyTab> getTabs();

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.ape.Package}.
	 * It is bidirectional and its opposite is '{@link org.muml.ape.Package#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.muml.ape.PropertiesPackage#getPropertyGenerator_Packages()
	 * @see org.muml.ape.Package#getGenerator
	 * @model opposite="generator" containment="true"
	 * @generated
	 */
	EList<org.muml.ape.Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Contributor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributor Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributor Id</em>' attribute.
	 * @see #setContributorId(String)
	 * @see org.muml.ape.PropertiesPackage#getPropertyGenerator_ContributorId()
	 * @model required="true"
	 * @generated
	 */
	String getContributorId();

	/**
	 * Sets the value of the '{@link org.muml.ape.PropertyGenerator#getContributorId <em>Contributor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributor Id</em>' attribute.
	 * @see #getContributorId()
	 * @generated
	 */
	void setContributorId(String value);

	/**
	 * Returns the value of the '<em><b>Source Folder</b></em>' attribute.
	 * The default value is <code>"src-gen"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Folder</em>' attribute.
	 * @see #setSourceFolder(String)
	 * @see org.muml.ape.PropertiesPackage#getPropertyGenerator_SourceFolder()
	 * @model default="src-gen" required="true"
	 * @generated
	 */
	String getSourceFolder();

	/**
	 * Sets the value of the '{@link org.muml.ape.PropertyGenerator#getSourceFolder <em>Source Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Folder</em>' attribute.
	 * @see #getSourceFolder()
	 * @generated
	 */
	void setSourceFolder(String value);

} // PropertyGenerator
