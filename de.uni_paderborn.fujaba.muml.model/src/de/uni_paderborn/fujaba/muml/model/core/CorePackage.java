/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.SDMPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package contains several core classes that are used by classes from several other packages.
 * It provides abstract base classes for Statecharts, meta-model elements that use a statechart to
 * define their behavior and meta-model elements that may carry a constraint.
 * Additionally, the package provides classes for modeling cardinalites as natural numbers including
 * infinity.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.core.CoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
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
	String eNS_URI = "http:///de/uni_paderborn/fujaba/muml/model/core";

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
	CorePackage eINSTANCE = de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.core.impl.NaturalNumberImpl <em>Natural Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.core.impl.NaturalNumberImpl
	 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl#getNaturalNumber()
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.core.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CardinalityImpl
	 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl#getCardinality()
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.core.impl.InfinityImpl <em>Infinity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.core.impl.InfinityImpl
	 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl#getInfinity()
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.core.impl.BehavioralElementImpl <em>Behavioral Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.core.impl.BehavioralElementImpl
	 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl#getBehavioralElement()
	 * @generated
	 */
	int BEHAVIORAL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ELEMENT__BEHAVIOR = 0;

	/**
	 * The number of structural features of the '<em>Behavioral Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.core.impl.ConstrainableElementImpl <em>Constrainable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.core.impl.ConstrainableElementImpl
	 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl#getConstrainableElement()
	 * @generated
	 */
	int CONSTRAINABLE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.core.impl.AbstractRealtimeStatechartImpl <em>Abstract Realtime Statechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.core.impl.AbstractRealtimeStatechartImpl
	 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl#getAbstractRealtimeStatechart()
	 * @generated
	 */
	int ABSTRACT_REALTIME_STATECHART = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REALTIME_STATECHART__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REALTIME_STATECHART__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REALTIME_STATECHART__NAME = SDMPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REALTIME_STATECHART__COMMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REALTIME_STATECHART__SECURITY_LEVEL = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REALTIME_STATECHART__UTILISATION = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Schedule Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REALTIME_STATECHART__SCHEDULE_DOCUMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REALTIME_STATECHART__EMBEDDED = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Realtime Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REALTIME_STATECHART_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.core.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.core.impl.BehaviorImpl
	 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 6;

	/**
	 * The feature id for the '<em><b>Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__BEHAVIORAL_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.core.NaturalNumber <em>Natural Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Number</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.NaturalNumber
	 * @generated
	 */
	EClass getNaturalNumber();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.core.NaturalNumber#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.NaturalNumber#getValue()
	 * @see #getNaturalNumber()
	 * @generated
	 */
	EAttribute getNaturalNumber_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.core.NaturalNumber#isInfinity <em>Infinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infinity</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.NaturalNumber#isInfinity()
	 * @see #getNaturalNumber()
	 * @generated
	 */
	EAttribute getNaturalNumber_Infinity();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.core.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.core.Cardinality#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.Cardinality#getLowerBound()
	 * @see #getCardinality()
	 * @generated
	 */
	EReference getCardinality_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.core.Cardinality#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.Cardinality#getUpperBound()
	 * @see #getCardinality()
	 * @generated
	 */
	EReference getCardinality_UpperBound();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.core.Infinity <em>Infinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infinity</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.Infinity
	 * @generated
	 */
	EClass getInfinity();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.core.BehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Element</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.BehavioralElement
	 * @generated
	 */
	EClass getBehavioralElement();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.core.BehavioralElement#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behavior</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.BehavioralElement#getBehavior()
	 * @see #getBehavioralElement()
	 * @generated
	 */
	EReference getBehavioralElement_Behavior();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement <em>Constrainable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrainable Element</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement
	 * @generated
	 */
	EClass getConstrainableElement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement#getConstraint()
	 * @see #getConstrainableElement()
	 * @generated
	 */
	EReference getConstrainableElement_Constraint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart <em>Abstract Realtime Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Realtime Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart
	 * @generated
	 */
	EClass getAbstractRealtimeStatechart();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getSecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Level</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getSecurityLevel()
	 * @see #getAbstractRealtimeStatechart()
	 * @generated
	 */
	EAttribute getAbstractRealtimeStatechart_SecurityLevel();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getUtilisation <em>Utilisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilisation</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getUtilisation()
	 * @see #getAbstractRealtimeStatechart()
	 * @generated
	 */
	EAttribute getAbstractRealtimeStatechart_Utilisation();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getScheduleDocument <em>Schedule Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Document</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getScheduleDocument()
	 * @see #getAbstractRealtimeStatechart()
	 * @generated
	 */
	EAttribute getAbstractRealtimeStatechart_ScheduleDocument();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#isEmbedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embedded</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#isEmbedded()
	 * @see #getAbstractRealtimeStatechart()
	 * @generated
	 */
	EAttribute getAbstractRealtimeStatechart_Embedded();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.core.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.core.Behavior#getBehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavioral Element</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.core.Behavior#getBehavioralElement()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_BehavioralElement();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.core.impl.NaturalNumberImpl <em>Natural Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.core.impl.NaturalNumberImpl
		 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl#getNaturalNumber()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.core.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CardinalityImpl
		 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl#getCardinality()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.core.impl.InfinityImpl <em>Infinity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.core.impl.InfinityImpl
		 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl#getInfinity()
		 * @generated
		 */
		EClass INFINITY = eINSTANCE.getInfinity();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.core.impl.BehavioralElementImpl <em>Behavioral Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.core.impl.BehavioralElementImpl
		 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl#getBehavioralElement()
		 * @generated
		 */
		EClass BEHAVIORAL_ELEMENT = eINSTANCE.getBehavioralElement();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_ELEMENT__BEHAVIOR = eINSTANCE.getBehavioralElement_Behavior();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.core.impl.ConstrainableElementImpl <em>Constrainable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.core.impl.ConstrainableElementImpl
		 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl#getConstrainableElement()
		 * @generated
		 */
		EClass CONSTRAINABLE_ELEMENT = eINSTANCE.getConstrainableElement();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINABLE_ELEMENT__CONSTRAINT = eINSTANCE.getConstrainableElement_Constraint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.core.impl.AbstractRealtimeStatechartImpl <em>Abstract Realtime Statechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.core.impl.AbstractRealtimeStatechartImpl
		 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl#getAbstractRealtimeStatechart()
		 * @generated
		 */
		EClass ABSTRACT_REALTIME_STATECHART = eINSTANCE.getAbstractRealtimeStatechart();

		/**
		 * The meta object literal for the '<em><b>Security Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REALTIME_STATECHART__SECURITY_LEVEL = eINSTANCE.getAbstractRealtimeStatechart_SecurityLevel();

		/**
		 * The meta object literal for the '<em><b>Utilisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REALTIME_STATECHART__UTILISATION = eINSTANCE.getAbstractRealtimeStatechart_Utilisation();

		/**
		 * The meta object literal for the '<em><b>Schedule Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REALTIME_STATECHART__SCHEDULE_DOCUMENT = eINSTANCE.getAbstractRealtimeStatechart_ScheduleDocument();

		/**
		 * The meta object literal for the '<em><b>Embedded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REALTIME_STATECHART__EMBEDDED = eINSTANCE.getAbstractRealtimeStatechart_Embedded();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.core.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.core.impl.BehaviorImpl
		 * @see de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Behavioral Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__BEHAVIORAL_ELEMENT = eINSTANCE.getBehavior_BehavioralElement();

	}

} //CorePackage
