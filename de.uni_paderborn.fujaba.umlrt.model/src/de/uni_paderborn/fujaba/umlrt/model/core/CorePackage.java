/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.model.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/uni_paderborn/fujaba/umlrt/model/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.NaturalNumberImpl <em>Natural Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.NaturalNumberImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getNaturalNumber()
	 * @generated
	 */
	int NATURAL_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Infinity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER__INFINITY = 1;

	/**
	 * The number of structural features of the '<em>Natural Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Value As Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER___GET_VALUE_AS_OBJECT = 0;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER___SET_VALUE__INFINITY = 1;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER___SET_VALUE__STRING = 2;

	/**
	 * The operation id for the '<em>Long Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER___LONG_VALUE = 3;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER___TO_STRING = 4;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER___EQUALS__EOBJECT = 5;

	/**
	 * The number of operations of the '<em>Natural Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NUMBER_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CardinalityImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__UPPER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.InfinityImpl <em>Infinity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.InfinityImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getInfinity()
	 * @generated
	 */
	int INFINITY = 2;

	/**
	 * The number of structural features of the '<em>Infinity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Byte Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___BYTE_VALUE = 0;

	/**
	 * The operation id for the '<em>Double Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___DOUBLE_VALUE = 1;

	/**
	 * The operation id for the '<em>Float Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___FLOAT_VALUE = 2;

	/**
	 * The operation id for the '<em>Int Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___INT_VALUE = 3;

	/**
	 * The operation id for the '<em>Long Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___LONG_VALUE = 4;

	/**
	 * The operation id for the '<em>Short Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___SHORT_VALUE = 5;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___TO_STRING = 6;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY___EQUALS__EOBJECT = 7;

	/**
	 * The number of operations of the '<em>Infinity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.BehavioralElementImpl <em>Behavioral Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.BehavioralElementImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getBehavioralElement()
	 * @generated
	 */
	int BEHAVIORAL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ELEMENT__UML_REALTIME_STATECHART = 0;

	/**
	 * The number of structural features of the '<em>Behavioral Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behavioral Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.ConstrainableElementImpl <em>Constrainable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.ConstrainableElementImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getConstrainableElement()
	 * @generated
	 */
	int CONSTRAINABLE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Constrainable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constrainable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber <em>Natural Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Number</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber
	 * @generated
	 */
	EClass getNaturalNumber();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#getValue()
	 * @see #getNaturalNumber()
	 * @generated
	 */
	EAttribute getNaturalNumber_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#isInfinity <em>Infinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infinity</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#isInfinity()
	 * @see #getNaturalNumber()
	 * @generated
	 */
	EAttribute getNaturalNumber_Infinity();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#getValueAsObject() <em>Get Value As Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value As Object</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#getValueAsObject()
	 * @generated
	 */
	EOperation getNaturalNumber__GetValueAsObject();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#setValue(de.uni_paderborn.fujaba.umlrt.model.core.Infinity) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#setValue(de.uni_paderborn.fujaba.umlrt.model.core.Infinity)
	 * @generated
	 */
	EOperation getNaturalNumber__SetValue__Infinity();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getNaturalNumber__SetValue__String();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#longValue() <em>Long Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Long Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#longValue()
	 * @generated
	 */
	EOperation getNaturalNumber__LongValue();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#toString()
	 * @generated
	 */
	EOperation getNaturalNumber__ToString();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#equals(org.eclipse.emf.ecore.EObject) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#equals(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getNaturalNumber__Equals__EObject();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.core.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.core.Cardinality#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Cardinality#getLowerBound()
	 * @see #getCardinality()
	 * @generated
	 */
	EReference getCardinality_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.core.Cardinality#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Cardinality#getUpperBound()
	 * @see #getCardinality()
	 * @generated
	 */
	EReference getCardinality_UpperBound();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity <em>Infinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infinity</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity
	 * @generated
	 */
	EClass getInfinity();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#byteValue() <em>Byte Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Byte Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#byteValue()
	 * @generated
	 */
	EOperation getInfinity__ByteValue();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#doubleValue() <em>Double Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Double Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#doubleValue()
	 * @generated
	 */
	EOperation getInfinity__DoubleValue();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#floatValue() <em>Float Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Float Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#floatValue()
	 * @generated
	 */
	EOperation getInfinity__FloatValue();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#intValue() <em>Int Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Int Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#intValue()
	 * @generated
	 */
	EOperation getInfinity__IntValue();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#longValue() <em>Long Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Long Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#longValue()
	 * @generated
	 */
	EOperation getInfinity__LongValue();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#shortValue() <em>Short Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Short Value</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#shortValue()
	 * @generated
	 */
	EOperation getInfinity__ShortValue();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#toString()
	 * @generated
	 */
	EOperation getInfinity__ToString();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.Infinity#equals(org.eclipse.emf.ecore.EObject) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.Infinity#equals(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getInfinity__Equals__EObject();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Element</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement
	 * @generated
	 */
	EClass getBehavioralElement();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>UML Realtime Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement#getUMLRealtimeStatechart()
	 * @see #getBehavioralElement()
	 * @generated
	 */
	EReference getBehavioralElement_UMLRealtimeStatechart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement <em>Constrainable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrainable Element</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement
	 * @generated
	 */
	EClass getConstrainableElement();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement#getConstraint()
	 * @see #getConstrainableElement()
	 * @generated
	 */
	EReference getConstrainableElement_Constraint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.NaturalNumberImpl <em>Natural Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.NaturalNumberImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getNaturalNumber()
		 * @generated
		 */
		EClass NATURAL_NUMBER = eINSTANCE.getNaturalNumber();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURAL_NUMBER__VALUE = eINSTANCE.getNaturalNumber_Value();

		/**
		 * The meta object literal for the '<em><b>Infinity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURAL_NUMBER__INFINITY = eINSTANCE.getNaturalNumber_Infinity();

		/**
		 * The meta object literal for the '<em><b>Get Value As Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NATURAL_NUMBER___GET_VALUE_AS_OBJECT = eINSTANCE.getNaturalNumber__GetValueAsObject();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NATURAL_NUMBER___SET_VALUE__INFINITY = eINSTANCE.getNaturalNumber__SetValue__Infinity();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NATURAL_NUMBER___SET_VALUE__STRING = eINSTANCE.getNaturalNumber__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Long Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NATURAL_NUMBER___LONG_VALUE = eINSTANCE.getNaturalNumber__LongValue();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NATURAL_NUMBER___TO_STRING = eINSTANCE.getNaturalNumber__ToString();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NATURAL_NUMBER___EQUALS__EOBJECT = eINSTANCE.getNaturalNumber__Equals__EObject();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CardinalityImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALITY__LOWER_BOUND = eINSTANCE.getCardinality_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALITY__UPPER_BOUND = eINSTANCE.getCardinality_UpperBound();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.InfinityImpl <em>Infinity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.InfinityImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getInfinity()
		 * @generated
		 */
		EClass INFINITY = eINSTANCE.getInfinity();

		/**
		 * The meta object literal for the '<em><b>Byte Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___BYTE_VALUE = eINSTANCE.getInfinity__ByteValue();

		/**
		 * The meta object literal for the '<em><b>Double Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___DOUBLE_VALUE = eINSTANCE.getInfinity__DoubleValue();

		/**
		 * The meta object literal for the '<em><b>Float Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___FLOAT_VALUE = eINSTANCE.getInfinity__FloatValue();

		/**
		 * The meta object literal for the '<em><b>Int Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___INT_VALUE = eINSTANCE.getInfinity__IntValue();

		/**
		 * The meta object literal for the '<em><b>Long Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___LONG_VALUE = eINSTANCE.getInfinity__LongValue();

		/**
		 * The meta object literal for the '<em><b>Short Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___SHORT_VALUE = eINSTANCE.getInfinity__ShortValue();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___TO_STRING = eINSTANCE.getInfinity__ToString();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFINITY___EQUALS__EOBJECT = eINSTANCE.getInfinity__Equals__EObject();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.BehavioralElementImpl <em>Behavioral Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.BehavioralElementImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getBehavioralElement()
		 * @generated
		 */
		EClass BEHAVIORAL_ELEMENT = eINSTANCE.getBehavioralElement();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Statechart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_ELEMENT__UML_REALTIME_STATECHART = eINSTANCE.getBehavioralElement_UMLRealtimeStatechart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.ConstrainableElementImpl <em>Constrainable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.ConstrainableElementImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl#getConstrainableElement()
		 * @generated
		 */
		EClass CONSTRAINABLE_ELEMENT = eINSTANCE.getConstrainableElement();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINABLE_ELEMENT__CONSTRAINT = eINSTANCE.getConstrainableElement_Constraint();

	}

} //CorePackage
