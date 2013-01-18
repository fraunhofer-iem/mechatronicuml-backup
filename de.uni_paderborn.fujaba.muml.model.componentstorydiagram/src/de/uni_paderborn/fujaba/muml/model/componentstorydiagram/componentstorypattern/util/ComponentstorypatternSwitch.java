/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.util;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.Call;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPattern;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.FadingFunction;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage
 * @generated
 */
public class ComponentstorypatternSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentstorypatternPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentstorypatternSwitch() {
		if (modelPackage == null) {
			modelPackage = ComponentstorypatternPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN: {
				ComponentStoryPattern componentStoryPattern = (ComponentStoryPattern)theEObject;
				T result = caseComponentStoryPattern(componentStoryPattern);
				if (result == null) result = caseNamedElement(componentStoryPattern);
				if (result == null) result = caseCommentableElement(componentStoryPattern);
				if (result == null) result = caseExtendableElement(componentStoryPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE: {
				ComponentStoryPatternVariable componentStoryPatternVariable = (ComponentStoryPatternVariable)theEObject;
				T result = caseComponentStoryPatternVariable(componentStoryPatternVariable);
				if (result == null) result = caseNamedElement(componentStoryPatternVariable);
				if (result == null) result = caseCommentableElement(componentStoryPatternVariable);
				if (result == null) result = caseExtendableElement(componentStoryPatternVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentstorypatternPackage.COMPONENT_VARIABLE: {
				ComponentVariable componentVariable = (ComponentVariable)theEObject;
				T result = caseComponentVariable(componentVariable);
				if (result == null) result = caseComponentStoryPatternVariable(componentVariable);
				if (result == null) result = caseNamedElement(componentVariable);
				if (result == null) result = caseCommentableElement(componentVariable);
				if (result == null) result = caseExtendableElement(componentVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentstorypatternPackage.PORT_VARIABLE: {
				PortVariable portVariable = (PortVariable)theEObject;
				T result = casePortVariable(portVariable);
				if (result == null) result = caseComponentStoryPatternVariable(portVariable);
				if (result == null) result = caseNamedElement(portVariable);
				if (result == null) result = caseCommentableElement(portVariable);
				if (result == null) result = caseExtendableElement(portVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentstorypatternPackage.PART_VARIABLE: {
				PartVariable partVariable = (PartVariable)theEObject;
				T result = casePartVariable(partVariable);
				if (result == null) result = caseComponentStoryPatternVariable(partVariable);
				if (result == null) result = caseNamedElement(partVariable);
				if (result == null) result = caseCommentableElement(partVariable);
				if (result == null) result = caseExtendableElement(partVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentstorypatternPackage.CONNECTOR_VARIABLE: {
				ConnectorVariable connectorVariable = (ConnectorVariable)theEObject;
				T result = caseConnectorVariable(connectorVariable);
				if (result == null) result = caseComponentStoryPatternVariable(connectorVariable);
				if (result == null) result = caseNamedElement(connectorVariable);
				if (result == null) result = caseCommentableElement(connectorVariable);
				if (result == null) result = caseExtendableElement(connectorVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentstorypatternPackage.ASSEMBLY_VARIABLE: {
				AssemblyVariable assemblyVariable = (AssemblyVariable)theEObject;
				T result = caseAssemblyVariable(assemblyVariable);
				if (result == null) result = caseConnectorVariable(assemblyVariable);
				if (result == null) result = caseComponentStoryPatternVariable(assemblyVariable);
				if (result == null) result = caseNamedElement(assemblyVariable);
				if (result == null) result = caseCommentableElement(assemblyVariable);
				if (result == null) result = caseExtendableElement(assemblyVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentstorypatternPackage.DELEGATION_VARIABLE: {
				DelegationVariable delegationVariable = (DelegationVariable)theEObject;
				T result = caseDelegationVariable(delegationVariable);
				if (result == null) result = caseConnectorVariable(delegationVariable);
				if (result == null) result = caseComponentStoryPatternVariable(delegationVariable);
				if (result == null) result = caseNamedElement(delegationVariable);
				if (result == null) result = caseCommentableElement(delegationVariable);
				if (result == null) result = caseExtendableElement(delegationVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentstorypatternPackage.CALL: {
				Call call = (Call)theEObject;
				T result = caseCall(call);
				if (result == null) result = caseExtendableElement(call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentstorypatternPackage.FADING_FUNCTION: {
				FadingFunction fadingFunction = (FadingFunction)theEObject;
				T result = caseFadingFunction(fadingFunction);
				if (result == null) result = caseNamedElement(fadingFunction);
				if (result == null) result = caseCommentableElement(fadingFunction);
				if (result == null) result = caseExtendableElement(fadingFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Story Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Story Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentStoryPattern(ComponentStoryPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Story Pattern Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Story Pattern Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentStoryPatternVariable(ComponentStoryPatternVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentVariable(ComponentVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortVariable(PortVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartVariable(PartVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorVariable(ConnectorVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyVariable(AssemblyVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegation Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegationVariable(DelegationVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCall(Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fading Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fading Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFadingFunction(FadingFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendableElement(ExtendableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentableElement(CommentableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ComponentstorypatternSwitch
