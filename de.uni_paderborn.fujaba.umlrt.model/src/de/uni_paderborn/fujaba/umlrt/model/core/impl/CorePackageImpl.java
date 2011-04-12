/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.core.impl;

import de.uni_paderborn.fujaba.umlrt.model.behavior.BehaviorPackage;

import de.uni_paderborn.fujaba.umlrt.model.behavior.impl.BehaviorPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;

import de.uni_paderborn.fujaba.umlrt.model.component.impl.ComponentPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.umlrt.model.core.Cardinality;
import de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement;
import de.uni_paderborn.fujaba.umlrt.model.core.CoreFactory;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;
import de.uni_paderborn.fujaba.umlrt.model.core.Infinity;
import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;

import de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage;

import de.uni_paderborn.fujaba.umlrt.model.instance.impl.InstancePackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MsgifacePackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage;

import de.uni_paderborn.fujaba.umlrt.model.pattern.impl.PatternPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.HelperPackage;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.modeling.SDMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infinityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constrainableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStatechartEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SDMPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		ReconfPackageImpl theReconfPackage = (ReconfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReconfPackage.eNS_URI) instanceof ReconfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReconfPackage.eNS_URI) : ReconfPackage.eINSTANCE);
		HelperPackageImpl theHelperPackage = (HelperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) instanceof HelperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) : HelperPackage.eINSTANCE);
		MsgifacePackageImpl theMsgifacePackage = (MsgifacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) instanceof MsgifacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) : MsgifacePackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		thePatternPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theReconfPackage.createPackageContents();
		theHelperPackage.createPackageContents();
		theMsgifacePackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		thePatternPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theReconfPackage.initializePackageContents();
		theHelperPackage.initializePackageContents();
		theMsgifacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNaturalNumber() {
		return naturalNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNaturalNumber_Value() {
		return (EAttribute)naturalNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNaturalNumber_Infinity() {
		return (EAttribute)naturalNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNaturalNumber__GetValueAsObject() {
		return naturalNumberEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNaturalNumber__SetValue__Infinity() {
		return naturalNumberEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNaturalNumber__SetValue__String() {
		return naturalNumberEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNaturalNumber__LongValue() {
		return naturalNumberEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNaturalNumber__ToString() {
		return naturalNumberEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNaturalNumber__Equals__EObject() {
		return naturalNumberEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinality() {
		return cardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinality_LowerBound() {
		return (EReference)cardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinality_UpperBound() {
		return (EReference)cardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfinity() {
		return infinityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInfinity__ByteValue() {
		return infinityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInfinity__DoubleValue() {
		return infinityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInfinity__FloatValue() {
		return infinityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInfinity__IntValue() {
		return infinityEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInfinity__LongValue() {
		return infinityEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInfinity__ShortValue() {
		return infinityEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInfinity__ToString() {
		return infinityEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInfinity__Equals__EObject() {
		return infinityEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioralElement() {
		return behavioralElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralElement_Statechart() {
		return (EReference)behavioralElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstrainableElement() {
		return constrainableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstrainableElement_Constraint() {
		return (EReference)constrainableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStatechart() {
		return abstractStatechartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractStatechart_EventQueueSize() {
		return (EAttribute)abstractStatechartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractStatechart_WcetDocument() {
		return (EAttribute)abstractStatechartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractStatechart_SecurityLevel() {
		return (EAttribute)abstractStatechartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractStatechart_SystemWcetMap() {
		return (EAttribute)abstractStatechartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractStatechart_Utilisation() {
		return (EAttribute)abstractStatechartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractStatechart_ScheduleDocument() {
		return (EAttribute)abstractStatechartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStatechart_UMLRealtimeStartState() {
		return (EReference)abstractStatechartEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStatechart_UMLComplexRealtimeState() {
		return (EReference)abstractStatechartEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStatechart_Transitions() {
		return (EReference)abstractStatechartEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStatechart_Vertices() {
		return (EReference)abstractStatechartEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStatechart_EClass() {
		return (EReference)abstractStatechartEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStatechart_UMLInterfaceStatechart() {
		return (EReference)abstractStatechartEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStatechart_BehavioralElement() {
		return (EReference)abstractStatechartEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStatechart_ProvidedMsgIFace() {
		return (EReference)abstractStatechartEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStatechart_RequiredMsgIFace() {
		return (EReference)abstractStatechartEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractStatechart_IsEmbedded() {
		return (EAttribute)abstractStatechartEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStatechart_Clocks() {
		return (EReference)abstractStatechartEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStatechart_EmbeddingRegion() {
		return (EReference)abstractStatechartEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractStatechart__GetHighestParentStatechart() {
		return abstractStatechartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractStatechart__AddAllUMLRealtimeStates__Set_boolean() {
		return abstractStatechartEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractStatechart__AddComplexUMLRealtimeStates__Set() {
		return abstractStatechartEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractStatechart__AddAllUMLRealtimeTransitions__Set() {
		return abstractStatechartEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractStatechart__IteratorOfAllUMLClocks__boolean() {
		return abstractStatechartEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractStatechart__AddAllUMLClocks__Set_boolean() {
		return abstractStatechartEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractStatechart__ToString() {
		return abstractStatechartEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractStatechart__Clone() {
		return abstractStatechartEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		naturalNumberEClass = createEClass(NATURAL_NUMBER);
		createEAttribute(naturalNumberEClass, NATURAL_NUMBER__VALUE);
		createEAttribute(naturalNumberEClass, NATURAL_NUMBER__INFINITY);
		createEOperation(naturalNumberEClass, NATURAL_NUMBER___GET_VALUE_AS_OBJECT);
		createEOperation(naturalNumberEClass, NATURAL_NUMBER___SET_VALUE__INFINITY);
		createEOperation(naturalNumberEClass, NATURAL_NUMBER___SET_VALUE__STRING);
		createEOperation(naturalNumberEClass, NATURAL_NUMBER___LONG_VALUE);
		createEOperation(naturalNumberEClass, NATURAL_NUMBER___TO_STRING);
		createEOperation(naturalNumberEClass, NATURAL_NUMBER___EQUALS__EOBJECT);

		cardinalityEClass = createEClass(CARDINALITY);
		createEReference(cardinalityEClass, CARDINALITY__LOWER_BOUND);
		createEReference(cardinalityEClass, CARDINALITY__UPPER_BOUND);

		infinityEClass = createEClass(INFINITY);
		createEOperation(infinityEClass, INFINITY___BYTE_VALUE);
		createEOperation(infinityEClass, INFINITY___DOUBLE_VALUE);
		createEOperation(infinityEClass, INFINITY___FLOAT_VALUE);
		createEOperation(infinityEClass, INFINITY___INT_VALUE);
		createEOperation(infinityEClass, INFINITY___LONG_VALUE);
		createEOperation(infinityEClass, INFINITY___SHORT_VALUE);
		createEOperation(infinityEClass, INFINITY___TO_STRING);
		createEOperation(infinityEClass, INFINITY___EQUALS__EOBJECT);

		behavioralElementEClass = createEClass(BEHAVIORAL_ELEMENT);
		createEReference(behavioralElementEClass, BEHAVIORAL_ELEMENT__STATECHART);

		constrainableElementEClass = createEClass(CONSTRAINABLE_ELEMENT);
		createEReference(constrainableElementEClass, CONSTRAINABLE_ELEMENT__CONSTRAINT);

		abstractStatechartEClass = createEClass(ABSTRACT_STATECHART);
		createEAttribute(abstractStatechartEClass, ABSTRACT_STATECHART__EVENT_QUEUE_SIZE);
		createEAttribute(abstractStatechartEClass, ABSTRACT_STATECHART__WCET_DOCUMENT);
		createEAttribute(abstractStatechartEClass, ABSTRACT_STATECHART__SECURITY_LEVEL);
		createEAttribute(abstractStatechartEClass, ABSTRACT_STATECHART__SYSTEM_WCET_MAP);
		createEAttribute(abstractStatechartEClass, ABSTRACT_STATECHART__UTILISATION);
		createEAttribute(abstractStatechartEClass, ABSTRACT_STATECHART__SCHEDULE_DOCUMENT);
		createEReference(abstractStatechartEClass, ABSTRACT_STATECHART__UML_REALTIME_START_STATE);
		createEReference(abstractStatechartEClass, ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE);
		createEReference(abstractStatechartEClass, ABSTRACT_STATECHART__TRANSITIONS);
		createEReference(abstractStatechartEClass, ABSTRACT_STATECHART__VERTICES);
		createEReference(abstractStatechartEClass, ABSTRACT_STATECHART__ECLASS);
		createEReference(abstractStatechartEClass, ABSTRACT_STATECHART__UML_INTERFACE_STATECHART);
		createEReference(abstractStatechartEClass, ABSTRACT_STATECHART__BEHAVIORAL_ELEMENT);
		createEReference(abstractStatechartEClass, ABSTRACT_STATECHART__PROVIDED_MSG_IFACE);
		createEReference(abstractStatechartEClass, ABSTRACT_STATECHART__REQUIRED_MSG_IFACE);
		createEAttribute(abstractStatechartEClass, ABSTRACT_STATECHART__IS_EMBEDDED);
		createEReference(abstractStatechartEClass, ABSTRACT_STATECHART__CLOCKS);
		createEReference(abstractStatechartEClass, ABSTRACT_STATECHART__EMBEDDING_REGION);
		createEOperation(abstractStatechartEClass, ABSTRACT_STATECHART___GET_HIGHEST_PARENT_STATECHART);
		createEOperation(abstractStatechartEClass, ABSTRACT_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN);
		createEOperation(abstractStatechartEClass, ABSTRACT_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET);
		createEOperation(abstractStatechartEClass, ABSTRACT_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET);
		createEOperation(abstractStatechartEClass, ABSTRACT_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN);
		createEOperation(abstractStatechartEClass, ABSTRACT_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN);
		createEOperation(abstractStatechartEClass, ABSTRACT_STATECHART___TO_STRING);
		createEOperation(abstractStatechartEClass, ABSTRACT_STATECHART___CLONE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ConstraintPackage theConstraintPackage = (ConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI);
		SDMPackage theSDMPackage = (SDMPackage)EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);
		HelperPackage theHelperPackage = (HelperPackage)EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI);
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractStatechartEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		abstractStatechartEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(naturalNumberEClass, NaturalNumber.class, "NaturalNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNaturalNumber_Value(), ecorePackage.getELong(), "value", null, 0, 1, NaturalNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNaturalNumber_Infinity(), theEcorePackage.getEBoolean(), "infinity", null, 0, 1, NaturalNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNaturalNumber__GetValueAsObject(), theEcorePackage.getEObject(), "getValueAsObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getNaturalNumber__SetValue__Infinity(), null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInfinity(), "o", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNaturalNumber__SetValue__String(), null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNaturalNumber__LongValue(), theEcorePackage.getELong(), "longValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNaturalNumber__ToString(), theEcorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNaturalNumber__Equals__EObject(), theEcorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "o", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardinality_LowerBound(), this.getNaturalNumber(), null, "lowerBound", null, 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardinality_UpperBound(), this.getNaturalNumber(), null, "upperBound", null, 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infinityEClass, Infinity.class, "Infinity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getInfinity__ByteValue(), theEcorePackage.getEByte(), "byteValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInfinity__DoubleValue(), theEcorePackage.getEDouble(), "doubleValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInfinity__FloatValue(), theEcorePackage.getEFloat(), "floatValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInfinity__IntValue(), theEcorePackage.getEInt(), "intValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInfinity__LongValue(), theEcorePackage.getELong(), "longValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInfinity__ShortValue(), theEcorePackage.getEShort(), "shortValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInfinity__ToString(), theEcorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInfinity__Equals__EObject(), theEcorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "o", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(behavioralElementEClass, BehavioralElement.class, "BehavioralElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavioralElement_Statechart(), this.getAbstractStatechart(), null, "statechart", null, 0, 1, BehavioralElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constrainableElementEClass, ConstrainableElement.class, "ConstrainableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstrainableElement_Constraint(), theConstraintPackage.getConstraint(), theConstraintPackage.getConstraint_ConstrainableElement(), "constraint", null, 0, -1, ConstrainableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractStatechartEClass, AbstractStatechart.class, "AbstractStatechart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractStatechart_EventQueueSize(), ecorePackage.getEInt(), "eventQueueSize", null, 0, 1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractStatechart_WcetDocument(), ecorePackage.getEString(), "wcetDocument", null, 0, 1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractStatechart_SecurityLevel(), ecorePackage.getEInt(), "securityLevel", "0", 0, 1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractStatechart_SystemWcetMap(), theHelperPackage.getMap(), "systemWcetMap", null, 0, 1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractStatechart_Utilisation(), ecorePackage.getEDouble(), "utilisation", null, 0, 1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractStatechart_ScheduleDocument(), ecorePackage.getEString(), "scheduleDocument", "\\\"schedule.xml\\\"", 0, 1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStatechart_UMLRealtimeStartState(), theRealtimestatechartPackage.getInitialState(), theRealtimestatechartPackage.getInitialState_UMLRealtimeStartStateRev(), "uMLRealtimeStartState", null, 0, 1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStatechart_UMLComplexRealtimeState(), theRealtimestatechartPackage.getState(), null, "uMLComplexRealtimeState", null, 0, 1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStatechart_Transitions(), theRealtimestatechartPackage.getTransition(), null, "transitions", null, 0, -1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStatechart_Vertices(), theRealtimestatechartPackage.getVertex(), null, "vertices", null, 0, -1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStatechart_EClass(), theEcorePackage.getEClass(), null, "eClass", null, 0, 1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStatechart_UMLInterfaceStatechart(), theRealtimestatechartPackage.getUMLInterfaceStatechart(), null, "uMLInterfaceStatechart", null, 0, 1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStatechart_BehavioralElement(), this.getBehavioralElement(), null, "behavioralElement", null, 0, 1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStatechart_ProvidedMsgIFace(), theHelperPackage.getStringToEClass(), null, "providedMsgIFace", null, 0, 1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStatechart_RequiredMsgIFace(), theHelperPackage.getStringToEClass(), null, "requiredMsgIFace", null, 0, 1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractStatechart_IsEmbedded(), theEcorePackage.getEBoolean(), "isEmbedded", null, 0, 1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStatechart_Clocks(), theRealtimestatechartPackage.getClock(), theRealtimestatechartPackage.getClock_Statechart(), "clocks", null, 0, -1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStatechart_EmbeddingRegion(), theRealtimestatechartPackage.getRegion(), theRealtimestatechartPackage.getRegion_Statechart(), "embeddingRegion", null, 0, 1, AbstractStatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractStatechart__GetHighestParentStatechart(), this.getAbstractStatechart(), "getHighestParentStatechart", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractStatechart__AddAllUMLRealtimeStates__Set_boolean(), null, "addAllUMLRealtimeStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theHelperPackage.getSet());
		EGenericType g2 = createEGenericType(theRealtimestatechartPackage.getVertex());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inclusiveStartStates", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractStatechart__AddComplexUMLRealtimeStates__Set(), null, "addComplexUMLRealtimeStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelperPackage.getSet());
		g2 = createEGenericType(theRealtimestatechartPackage.getState());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "set", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractStatechart__AddAllUMLRealtimeTransitions__Set(), null, "addAllUMLRealtimeTransitions", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelperPackage.getSet());
		g2 = createEGenericType(theRealtimestatechartPackage.getTransition());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "set", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractStatechart__IteratorOfAllUMLClocks__boolean(), theHelperPackage.getIterator(), "iteratorOfAllUMLClocks", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "excludeNoClock", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractStatechart__AddAllUMLClocks__Set_boolean(), null, "addAllUMLClocks", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelperPackage.getSet());
		g2 = createEGenericType(theRealtimestatechartPackage.getClock());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "excludeNoClock", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractStatechart__ToString(), theEcorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractStatechart__Clone(), theEcorePackage.getEObject(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CorePackageImpl
