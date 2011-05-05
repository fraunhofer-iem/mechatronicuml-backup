/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component.impl;

import de.uni_paderborn.fujaba.umlrt.model.behavior.BehaviorPackage;

import de.uni_paderborn.fujaba.umlrt.model.behavior.impl.BehaviorPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.component.Assembly;
import de.uni_paderborn.fujaba.umlrt.model.component.AtomicComponent;
import de.uni_paderborn.fujaba.umlrt.model.component.BehavioralConnector;
import de.uni_paderborn.fujaba.umlrt.model.component.Component;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentFactory;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentKind;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType;
import de.uni_paderborn.fujaba.umlrt.model.component.ContinuousComponent;
import de.uni_paderborn.fujaba.umlrt.model.component.ContinuousPortSpecification;
import de.uni_paderborn.fujaba.umlrt.model.component.Delegation;
import de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification;
import de.uni_paderborn.fujaba.umlrt.model.component.HardwarePortSpecification;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.component.PortKind;
import de.uni_paderborn.fujaba.umlrt.model.component.PortSpecification;
import de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent;

import de.uni_paderborn.fujaba.umlrt.model.component.util.ComponentValidator;
import de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl;

import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;

import de.uni_paderborn.fujaba.umlrt.model.core.impl.CorePackageImpl;

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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.modeling.SDMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentPackageImpl extends EPackageImpl implements ComponentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousPortSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discretePortSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwarePortSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portKindEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentPackageImpl() {
		super(eNS_URI, ComponentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentPackage init() {
		if (isInited) return (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);

		// Obtain or create and register package
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SDMPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		HelperPackageImpl theHelperPackage = (HelperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) instanceof HelperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) : HelperPackage.eINSTANCE);
		MsgifacePackageImpl theMsgifacePackage = (MsgifacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) instanceof MsgifacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) : MsgifacePackage.eINSTANCE);

		// Create package meta-data objects
		theComponentPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theInstancePackage.createPackageContents();
		thePatternPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theHelperPackage.createPackageContents();
		theMsgifacePackage.createPackageContents();

		// Initialize created meta-data
		theComponentPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		thePatternPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theHelperPackage.initializePackageContents();
		theMsgifacePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theComponentPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ComponentValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theComponentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentPackage.eNS_URI, theComponentPackage);
		return theComponentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Ports() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_EClass() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ReferencingComponentParts() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_MustImplementProvidedInterfaces() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_MustImplementRequiredInterfaces() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Kind() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ComponentInstances() {
		return (EReference)componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuousComponent() {
		return continuousComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuousComponent_XMLFileName() {
		return (EAttribute)continuousComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_InvisibleInterfaces() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Component() {
		return (EReference)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_PortKind() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Specification() {
		return (EReference)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Cardinality() {
		return (EReference)portEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_FromPortToConnectorRev() {
		return (EReference)portEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_ToPortToConnectorRev() {
		return (EReference)portEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_RequiredMessageInterface() {
		return (EReference)portEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_ProvidedMessageInterface() {
		return (EReference)portEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortSpecification() {
		return portSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuousPortSpecification() {
		return continuousPortSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscretePortSpecification() {
		return discretePortSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePortSpecification_Refines() {
		return (EReference)discretePortSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePortSpecification_AdaptationRealtimeStatechart() {
		return (EReference)discretePortSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePortSpecification_RequiredMessageInterface() {
		return (EReference)discretePortSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePortSpecification_ProvidedMessageInterface() {
		return (EReference)discretePortSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwarePortSpecification() {
		return hardwarePortSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentPart() {
		return componentPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_ComponentType() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_ParentComponent() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_FromRev() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_ToRev() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_Delegation() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_PortsDerived() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentPart_ComponentNameDerived() {
		return (EAttribute)componentPartEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_Cardinality() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredComponent() {
		return structuredComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredComponent_EmbeddedParts() {
		return (EReference)structuredComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredComponent_Connectors() {
		return (EReference)structuredComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicComponent() {
		return atomicComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorType() {
		return connectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_FromPort() {
		return (EReference)connectorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_ToPort() {
		return (EReference)connectorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_ParentComponent() {
		return (EReference)connectorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssembly() {
		return assemblyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssembly_To() {
		return (EReference)assemblyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssembly_From() {
		return (EReference)assemblyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegation() {
		return delegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_ComponentPart() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioralConnector() {
		return behavioralConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralConnector_ConnectorClass() {
		return (EReference)behavioralConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentKind() {
		return componentKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortKind() {
		return portKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentFactory getComponentFactory() {
		return (ComponentFactory)getEFactoryInstance();
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
		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__PORTS);
		createEReference(componentEClass, COMPONENT__ECLASS);
		createEReference(componentEClass, COMPONENT__REFERENCING_COMPONENT_PARTS);
		createEReference(componentEClass, COMPONENT__MUST_IMPLEMENT_PROVIDED_INTERFACES);
		createEReference(componentEClass, COMPONENT__MUST_IMPLEMENT_REQUIRED_INTERFACES);
		createEAttribute(componentEClass, COMPONENT__KIND);
		createEReference(componentEClass, COMPONENT__COMPONENT_INSTANCES);

		continuousComponentEClass = createEClass(CONTINUOUS_COMPONENT);
		createEAttribute(continuousComponentEClass, CONTINUOUS_COMPONENT__XML_FILE_NAME);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__INVISIBLE_INTERFACES);
		createEReference(portEClass, PORT__COMPONENT);
		createEAttribute(portEClass, PORT__PORT_KIND);
		createEReference(portEClass, PORT__SPECIFICATION);
		createEReference(portEClass, PORT__CARDINALITY);
		createEReference(portEClass, PORT__FROM_PORT_TO_CONNECTOR_REV);
		createEReference(portEClass, PORT__TO_PORT_TO_CONNECTOR_REV);
		createEReference(portEClass, PORT__REQUIRED_MESSAGE_INTERFACE);
		createEReference(portEClass, PORT__PROVIDED_MESSAGE_INTERFACE);

		portSpecificationEClass = createEClass(PORT_SPECIFICATION);

		continuousPortSpecificationEClass = createEClass(CONTINUOUS_PORT_SPECIFICATION);

		discretePortSpecificationEClass = createEClass(DISCRETE_PORT_SPECIFICATION);
		createEReference(discretePortSpecificationEClass, DISCRETE_PORT_SPECIFICATION__REFINES);
		createEReference(discretePortSpecificationEClass, DISCRETE_PORT_SPECIFICATION__ADAPTATION_REALTIME_STATECHART);
		createEReference(discretePortSpecificationEClass, DISCRETE_PORT_SPECIFICATION__REQUIRED_MESSAGE_INTERFACE);
		createEReference(discretePortSpecificationEClass, DISCRETE_PORT_SPECIFICATION__PROVIDED_MESSAGE_INTERFACE);

		hardwarePortSpecificationEClass = createEClass(HARDWARE_PORT_SPECIFICATION);

		componentPartEClass = createEClass(COMPONENT_PART);
		createEReference(componentPartEClass, COMPONENT_PART__COMPONENT_TYPE);
		createEReference(componentPartEClass, COMPONENT_PART__PARENT_COMPONENT);
		createEReference(componentPartEClass, COMPONENT_PART__FROM_REV);
		createEReference(componentPartEClass, COMPONENT_PART__TO_REV);
		createEReference(componentPartEClass, COMPONENT_PART__DELEGATION);
		createEReference(componentPartEClass, COMPONENT_PART__PORTS_DERIVED);
		createEAttribute(componentPartEClass, COMPONENT_PART__COMPONENT_NAME_DERIVED);
		createEReference(componentPartEClass, COMPONENT_PART__CARDINALITY);

		structuredComponentEClass = createEClass(STRUCTURED_COMPONENT);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__EMBEDDED_PARTS);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__CONNECTORS);

		atomicComponentEClass = createEClass(ATOMIC_COMPONENT);

		connectorTypeEClass = createEClass(CONNECTOR_TYPE);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__FROM_PORT);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__TO_PORT);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__PARENT_COMPONENT);

		assemblyEClass = createEClass(ASSEMBLY);
		createEReference(assemblyEClass, ASSEMBLY__TO);
		createEReference(assemblyEClass, ASSEMBLY__FROM);

		delegationEClass = createEClass(DELEGATION);
		createEReference(delegationEClass, DELEGATION__COMPONENT_PART);

		behavioralConnectorEClass = createEClass(BEHAVIORAL_CONNECTOR);
		createEReference(behavioralConnectorEClass, BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS);

		// Create enums
		componentKindEEnum = createEEnum(COMPONENT_KIND);
		portKindEEnum = createEEnum(PORT_KIND);
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
		SDMPackage theSDMPackage = (SDMPackage)EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		MsgifacePackage theMsgifacePackage = (MsgifacePackage)EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI);
		PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		componentEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
		componentEClass.getESuperTypes().add(theCorePackage.getConstrainableElement());
		continuousComponentEClass.getESuperTypes().add(this.getComponent());
		portEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		portEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
		continuousPortSpecificationEClass.getESuperTypes().add(this.getPortSpecification());
		discretePortSpecificationEClass.getESuperTypes().add(this.getPortSpecification());
		discretePortSpecificationEClass.getESuperTypes().add(theCorePackage.getBehavioralElement());
		hardwarePortSpecificationEClass.getESuperTypes().add(this.getPortSpecification());
		componentPartEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		componentPartEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
		structuredComponentEClass.getESuperTypes().add(this.getComponent());
		atomicComponentEClass.getESuperTypes().add(this.getComponent());
		atomicComponentEClass.getESuperTypes().add(theCorePackage.getBehavioralElement());
		connectorTypeEClass.getESuperTypes().add(this.getBehavioralConnector());
		assemblyEClass.getESuperTypes().add(this.getConnectorType());
		delegationEClass.getESuperTypes().add(this.getConnectorType());
		behavioralConnectorEClass.getESuperTypes().add(theCorePackage.getBehavioralElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Ports(), this.getPort(), this.getPort_Component(), "ports", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_EClass(), theEcorePackage.getEClass(), null, "eClass", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ReferencingComponentParts(), this.getComponentPart(), this.getComponentPart_ComponentType(), "referencingComponentParts", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_MustImplementProvidedInterfaces(), theEcorePackage.getEClass(), null, "mustImplementProvidedInterfaces", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_MustImplementRequiredInterfaces(), theEcorePackage.getEClass(), null, "mustImplementRequiredInterfaces", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Kind(), this.getComponentKind(), "kind", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ComponentInstances(), theInstancePackage.getComponentInstance(), theInstancePackage.getComponentInstance_ComponentType(), "componentInstances", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continuousComponentEClass, ContinuousComponent.class, "ContinuousComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousComponent_XMLFileName(), ecorePackage.getEString(), "xMLFileName", null, 0, 1, ContinuousComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_InvisibleInterfaces(), theEcorePackage.getEClass(), null, "invisibleInterfaces", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Component(), this.getComponent(), this.getComponent_Ports(), "component", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_PortKind(), this.getPortKind(), "portKind", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Specification(), this.getPortSpecification(), null, "specification", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Cardinality(), theCorePackage.getCardinality(), null, "cardinality", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_FromPortToConnectorRev(), this.getConnectorType(), this.getConnectorType_FromPort(), "fromPortToConnectorRev", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_ToPortToConnectorRev(), this.getConnectorType(), this.getConnectorType_ToPort(), "toPortToConnectorRev", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_RequiredMessageInterface(), theMsgifacePackage.getMessageInterface(), null, "requiredMessageInterface", null, 0, 1, Port.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPort_ProvidedMessageInterface(), theMsgifacePackage.getMessageInterface(), null, "providedMessageInterface", null, 0, 1, Port.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(portSpecificationEClass, PortSpecification.class, "PortSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousPortSpecificationEClass, ContinuousPortSpecification.class, "ContinuousPortSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discretePortSpecificationEClass, DiscretePortSpecification.class, "DiscretePortSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscretePortSpecification_Refines(), thePatternPackage.getRole(), thePatternPackage.getRole_Port(), "refines", null, 0, 1, DiscretePortSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretePortSpecification_AdaptationRealtimeStatechart(), theCorePackage.getAbstractRealtimeStatechart(), null, "adaptationRealtimeStatechart", null, 0, 1, DiscretePortSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretePortSpecification_RequiredMessageInterface(), theMsgifacePackage.getMessageInterface(), null, "requiredMessageInterface", null, 0, 1, DiscretePortSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretePortSpecification_ProvidedMessageInterface(), theMsgifacePackage.getMessageInterface(), null, "providedMessageInterface", null, 0, 1, DiscretePortSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwarePortSpecificationEClass, HardwarePortSpecification.class, "HardwarePortSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentPartEClass, ComponentPart.class, "ComponentPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPart_ComponentType(), this.getComponent(), this.getComponent_ReferencingComponentParts(), "componentType", null, 1, 1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_ParentComponent(), this.getStructuredComponent(), this.getStructuredComponent_EmbeddedParts(), "parentComponent", null, 0, 1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_FromRev(), this.getAssembly(), this.getAssembly_From(), "fromRev", null, 0, -1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_ToRev(), this.getAssembly(), this.getAssembly_To(), "toRev", null, 0, -1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_Delegation(), this.getDelegation(), this.getDelegation_ComponentPart(), "delegation", null, 0, -1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_PortsDerived(), this.getPort(), null, "portsDerived", null, 0, -1, ComponentPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentPart_ComponentNameDerived(), ecorePackage.getEString(), "componentNameDerived", "", 0, 1, ComponentPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_Cardinality(), theCorePackage.getCardinality(), null, "cardinality", null, 1, 1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredComponentEClass, StructuredComponent.class, "StructuredComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredComponent_EmbeddedParts(), this.getComponentPart(), this.getComponentPart_ParentComponent(), "embeddedParts", null, 0, -1, StructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredComponent_Connectors(), this.getConnectorType(), this.getConnectorType_ParentComponent(), "connectors", null, 0, -1, StructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicComponentEClass, AtomicComponent.class, "AtomicComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectorTypeEClass, ConnectorType.class, "ConnectorType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorType_FromPort(), this.getPort(), this.getPort_FromPortToConnectorRev(), "fromPort", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorType_ToPort(), this.getPort(), this.getPort_ToPortToConnectorRev(), "toPort", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorType_ParentComponent(), this.getStructuredComponent(), this.getStructuredComponent_Connectors(), "parentComponent", null, 0, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyEClass, Assembly.class, "Assembly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssembly_To(), this.getComponentPart(), this.getComponentPart_ToRev(), "to", null, 0, 1, Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssembly_From(), this.getComponentPart(), this.getComponentPart_FromRev(), "from", null, 0, 1, Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationEClass, Delegation.class, "Delegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegation_ComponentPart(), this.getComponentPart(), this.getComponentPart_Delegation(), "componentPart", null, 1, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behavioralConnectorEClass, BehavioralConnector.class, "BehavioralConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavioralConnector_ConnectorClass(), theEcorePackage.getEClass(), null, "connectorClass", null, 0, 1, BehavioralConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(componentKindEEnum, ComponentKind.class, "ComponentKind");
		addEEnumLiteral(componentKindEEnum, ComponentKind.SOFTWARE_COMPONENT);
		addEEnumLiteral(componentKindEEnum, ComponentKind.CONTINUOUS_COMPONENT);
		addEEnumLiteral(componentKindEEnum, ComponentKind.HARDWARE_COMPONENT);

		initEEnum(portKindEEnum, PortKind.class, "PortKind");
		addEEnumLiteral(portKindEEnum, PortKind.DISCRETE);
		addEEnumLiteral(portKindEEnum, PortKind.CONTINUOUS);
		addEEnumLiteral(portKindEEnum, PortKind.HYBRID);
		addEEnumLiteral(portKindEEnum, PortKind.HARDWARE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });											
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "constraints", "body"
		   });																				
		addAnnotation
		  (componentPartEClass, 
		   source, 
		   new String[] {
			 "constraints", "CardinalityLowerBoundSet TypeNotEqualToParent CardinalityUpperBoundSet"
		   });																							
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";														
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "body", "self.cardinality.lowerBound->notEmpty()"
		   });									
		addAnnotation
		  (getPort_RequiredMessageInterface(), 
		   source, 
		   new String[] {
			 "derivation", "if specification->select(s|s.oclIsKindOf(DiscretePortSpecification))->first().oclIsUndefined() then\n\tnull\nelse\n\tspecification->select(s|s.oclIsKindOf(DiscretePortSpecification))->first().oclAsType(DiscretePortSpecification).requiredMessageInterface\nendif"
		   });		
		addAnnotation
		  (getPort_ProvidedMessageInterface(), 
		   source, 
		   new String[] {
			 "derivation", "if specification->select(s|s.oclIsKindOf(DiscretePortSpecification))->first().oclIsUndefined() then\n\tnull\nelse\n\tspecification->select(s|s.oclIsKindOf(DiscretePortSpecification))->first().oclAsType(DiscretePortSpecification).providedMessageInterface\nendif"
		   });											
		addAnnotation
		  (componentPartEClass, 
		   source, 
		   new String[] {
			 "CardinalityLowerBoundSet", "self.cardinality.lowerBound->notEmpty()",
			 "TypeNotEqualToParent", "self.componentType <> self.parentComponent",
			 "CardinalityUpperBoundSet", "self.cardinality.upperBound->notEmpty()"
		   });							
		addAnnotation
		  (getComponentPart_PortsDerived(), 
		   source, 
		   new String[] {
			 "derivation", "if componentType.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\tcomponentType.ports\r\nendif"
		   });		
		addAnnotation
		  (getComponentPart_ComponentNameDerived(), 
		   source, 
		   new String[] {
			 "derivation", "if componentType.oclIsUndefined() then\n\tnull\nelse\n\tcomponentType.name\nendif"
		   });														
	}

} //ComponentPackageImpl
