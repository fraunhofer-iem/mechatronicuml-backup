/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier#getIdentifierToEObject <em>Identifier To EObject</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier#getEObjectToIdentifier <em>EObject To Identifier</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier#getFreeClockInstanceIdentifiers <em>Free Clock Instance Identifiers</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getObjectIdentifier()
 * @model
 * @generated
 */
public interface ObjectIdentifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier To EObject</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipse.emf.ecore.EObject},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier To EObject</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier To EObject</em>' map.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getObjectIdentifier_IdentifierToEObject()
	 * @model mapType="org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.IdentifierToEObject<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EObject>"
	 * @generated
	 */
	EMap<String, EObject> getIdentifierToEObject();

	/**
	 * Returns the value of the '<em><b>EObject To Identifier</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.ecore.EObject},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EObject To Identifier</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EObject To Identifier</em>' map.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getObjectIdentifier_EObjectToIdentifier()
	 * @model mapType="org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.EObjectToIdentifier<org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<EObject, String> getEObjectToIdentifier();

	/**
	 * Returns the value of the '<em><b>Free Clock Instance Identifiers</b></em>' map.
	 * The key is of type {@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram},
	 * and the value is of type list of {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free Clock Instance Identifiers</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Clock Instance Identifiers</em>' map.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getObjectIdentifier_FreeClockInstanceIdentifiers()
	 * @model mapType="org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ClockInstanceStoryDiagramToIdentifier<org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram, org.eclipse.emf.ecore.EString>" transient="true"
	 * @generated
	 */
	EMap<ClockInstanceStoryDiagram, EList<String>> getFreeClockInstanceIdentifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds a new object to identifier mapping to the object identifier store.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.getEObjectToIdentifier().put(currentObject, identifier);'"
	 * @generated
	 */
	void putEObjectToIdentifier(EObject currentObject, String identifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds a new identifier to object mapping to the object identifier store.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.getIdentifierToEObject().put(identifier,currentObject);'"
	 * @generated
	 */
	void putIdentifierToEObject(String identifier, EObject currentObject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the identifier of the object given as a parameter.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getEObjectToIdentifier().get(currentObject);'"
	 * @generated
	 */
	String getIdentifier(EObject currentObject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the object which has the identifier given as a parameter.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getIdentifierToEObject().get(currentIdentifier);'"
	 * @generated
	 */
	EObject getEObject(String currentIdentifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a free clock instance identifier that exists for clock created by the
	 * ClockInstanceStoryDiagram given as a parameter. If no such clock instance
	 * identifier exists, the operation returns null.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='EList<String> identifiers = this.getFreeClockInstanceIdentifiers().get(clockInstanceStoryDiagram);\r\nif(identifiers == null || identifiers.size() == 0){\r\n\treturn null;\r\n} else {\r\n\tString result = identifiers.get(0);\r\n\tidentifiers.remove(0);\r\n\treturn result;\r\n}'"
	 * @generated
	 */
	String getFreeClockInstanceIdentifier(ClockInstanceStoryDiagram clockInstanceStoryDiagram);

} // ObjectIdentifier
