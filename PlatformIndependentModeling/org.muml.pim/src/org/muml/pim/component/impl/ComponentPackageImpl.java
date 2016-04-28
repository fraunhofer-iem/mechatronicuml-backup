/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.core.expressions.ExpressionsPackage;
import org.muml.core.modelinstance.ModelinstancePackage;
import org.muml.pim.PimPackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.impl.BehaviorPackageImpl;
import org.muml.pim.component.AssemblyConnector;
import org.muml.pim.component.AtomicComponent;
import org.muml.pim.component.Component;
import org.muml.pim.component.ComponentFactory;
import org.muml.pim.component.ComponentKind;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.component.ContinuousPort;
import org.muml.pim.component.CoordinationProtocolPart;
import org.muml.pim.component.DelegationConnector;
import org.muml.pim.component.DirectedTypedPort;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.component.HybridPort;
import org.muml.pim.component.Port;
import org.muml.pim.component.PortConnector;
import org.muml.pim.component.PortDirectionKind;
import org.muml.pim.component.PortPart;
import org.muml.pim.component.StaticAtomicComponent;
import org.muml.pim.component.StaticComponent;
import org.muml.pim.component.StaticStructuredComponent;
import org.muml.pim.component.StructuredComponent;
import org.muml.pim.component.util.ComponentValidator;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.impl.ConnectorPackageImpl;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.constraint.impl.ConstraintPackageImpl;
import org.muml.pim.impl.PimPackageImpl;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.impl.InstancePackageImpl;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.msgtype.impl.MsgtypePackageImpl;
import org.muml.pim.pattern.PatternPackage;
import org.muml.pim.pattern.impl.PatternPackageImpl;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.protocol.impl.ProtocolPackageImpl;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl;
import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;
import org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl;
import org.muml.pim.types.TypesPackage;
import org.muml.pim.types.impl.TypesPackageImpl;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.pim.valuetype.impl.ValuetypePackageImpl;

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
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discretePortEClass = null;

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
	private EClass staticStructuredComponentEClass = null;

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
	private EClass directedTypedPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticAtomicComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticComponentEClass = null;

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
	private EClass portConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationProtocolPartEClass = null;

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
	private EEnum portDirectionKindEEnum = null;

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
	 * @see org.muml.pim.component.ComponentPackage#eNS_URI
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
		CorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PimPackageImpl thePimPackage = (PimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PimPackage.eNS_URI) instanceof PimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PimPackage.eNS_URI) : PimPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) : ProtocolPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		One_to_n_schemataPackageImpl theOne_to_n_schemataPackage = (One_to_n_schemataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI) instanceof One_to_n_schemataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI) : One_to_n_schemataPackage.eINSTANCE);
		MsgtypePackageImpl theMsgtypePackage = (MsgtypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) instanceof MsgtypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) : MsgtypePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) instanceof ConnectorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) : ConnectorPackage.eINSTANCE);
		ValuetypePackageImpl theValuetypePackage = (ValuetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) instanceof ValuetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) : ValuetypePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);

		// Create package meta-data objects
		theComponentPackage.createPackageContents();
		thePimPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theProtocolPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theOne_to_n_schemataPackage.createPackageContents();
		theMsgtypePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theConnectorPackage.createPackageContents();
		theValuetypePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		thePatternPackage.createPackageContents();

		// Initialize created meta-data
		theComponentPackage.initializePackageContents();
		thePimPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theProtocolPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theOne_to_n_schemataPackage.initializePackageContents();
		theMsgtypePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theConnectorPackage.initializePackageContents();
		theValuetypePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		thePatternPackage.initializePackageContents();

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
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_ComponentKind() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
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
	public EReference getPort_Component() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_PortConnectors() {
		return (EReference)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuousPort() {
		return continuousPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscretePort() {
		return discretePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePort_RefinedRole() {
		return (EReference)discretePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscretePort_IsDiscreteInPort() {
		return (EAttribute)discretePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscretePort_IsDiscreteOutPort() {
		return (EAttribute)discretePortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscretePort_IsDiscreteInOutPort() {
		return (EAttribute)discretePortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscretePort_MultiPort() {
		return (EAttribute)discretePortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePort_CoordinationProtocol() {
		return (EReference)discretePortEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getComponentPart_MultiPart() {
		return (EAttribute)componentPartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticStructuredComponent() {
		return staticStructuredComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_Cardinality() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_PortParts() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(3);
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
	public EReference getStructuredComponent_EmbeddedComponentParts() {
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
	public EReference getStructuredComponent_AllStructuredComponents() {
		return (EReference)structuredComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredComponent_AllAtomicComponents() {
		return (EReference)structuredComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredComponent_CoordinationProtocolParts() {
		return (EReference)structuredComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuredComponent__ToString() {
		return structuredComponentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedTypedPort() {
		return directedTypedPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTypedPort_Kind() {
		return (EAttribute)directedTypedPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTypedPort_Optional() {
		return (EAttribute)directedTypedPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTypedPort_InPort() {
		return (EAttribute)directedTypedPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedTypedPort_InitializeExpression() {
		return (EReference)directedTypedPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortPart() {
		return portPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortPart_PortType() {
		return (EReference)portPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortPart_ComponentPart() {
		return (EReference)portPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortPart_CoordinationProtocolPart() {
		return (EReference)portPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortPart_RefinedRole() {
		return (EReference)portPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortPart_Name() {
		return (EAttribute)portPartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticAtomicComponent() {
		return staticAtomicComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticComponent() {
		return staticComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTypedPort_OutPort() {
		return (EAttribute)directedTypedPortEClass.getEStructuralFeatures().get(2);
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
	public EOperation getAtomicComponent__ToString() {
		return atomicComponentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortConnector() {
		return portConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortConnector_ParentComponent() {
		return (EReference)portConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyConnector() {
		return assemblyConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyConnector_CoordinationProtocolPart() {
		return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyConnector_PortParts() {
		return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationConnector() {
		return delegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationConnector_PortPart() {
		return (EReference)delegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationConnector_Port() {
		return (EReference)delegationConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHybridPort() {
		return hybridPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridPort_SamplingInterval() {
		return (EReference)hybridPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinationProtocolPart() {
		return coordinationProtocolPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationProtocolPart_CoordinationProtocol() {
		return (EReference)coordinationProtocolPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationProtocolPart_PortParts() {
		return (EReference)coordinationProtocolPartEClass.getEStructuralFeatures().get(1);
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
	public EEnum getPortDirectionKind() {
		return portDirectionKindEEnum;
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
		createEAttribute(componentEClass, COMPONENT__COMPONENT_KIND);
		createEReference(componentEClass, COMPONENT__PORTS);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__COMPONENT);
		createEReference(portEClass, PORT__PORT_CONNECTORS);

		continuousPortEClass = createEClass(CONTINUOUS_PORT);

		discretePortEClass = createEClass(DISCRETE_PORT);
		createEReference(discretePortEClass, DISCRETE_PORT__REFINED_ROLE);
		createEAttribute(discretePortEClass, DISCRETE_PORT__IS_DISCRETE_IN_PORT);
		createEAttribute(discretePortEClass, DISCRETE_PORT__IS_DISCRETE_OUT_PORT);
		createEAttribute(discretePortEClass, DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT);
		createEAttribute(discretePortEClass, DISCRETE_PORT__MULTI_PORT);
		createEReference(discretePortEClass, DISCRETE_PORT__COORDINATION_PROTOCOL);

		componentPartEClass = createEClass(COMPONENT_PART);
		createEReference(componentPartEClass, COMPONENT_PART__COMPONENT_TYPE);
		createEReference(componentPartEClass, COMPONENT_PART__PARENT_COMPONENT);
		createEReference(componentPartEClass, COMPONENT_PART__CARDINALITY);
		createEReference(componentPartEClass, COMPONENT_PART__PORT_PARTS);
		createEAttribute(componentPartEClass, COMPONENT_PART__MULTI_PART);

		staticStructuredComponentEClass = createEClass(STATIC_STRUCTURED_COMPONENT);

		atomicComponentEClass = createEClass(ATOMIC_COMPONENT);
		createEOperation(atomicComponentEClass, ATOMIC_COMPONENT___TO_STRING);

		assemblyConnectorEClass = createEClass(ASSEMBLY_CONNECTOR);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL_PART);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__PORT_PARTS);

		delegationConnectorEClass = createEClass(DELEGATION_CONNECTOR);
		createEReference(delegationConnectorEClass, DELEGATION_CONNECTOR__PORT_PART);
		createEReference(delegationConnectorEClass, DELEGATION_CONNECTOR__PORT);

		portConnectorEClass = createEClass(PORT_CONNECTOR);
		createEReference(portConnectorEClass, PORT_CONNECTOR__PARENT_COMPONENT);

		hybridPortEClass = createEClass(HYBRID_PORT);
		createEReference(hybridPortEClass, HYBRID_PORT__SAMPLING_INTERVAL);

		structuredComponentEClass = createEClass(STRUCTURED_COMPONENT);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__EMBEDDED_COMPONENT_PARTS);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__CONNECTORS);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_PARTS);
		createEOperation(structuredComponentEClass, STRUCTURED_COMPONENT___TO_STRING);

		coordinationProtocolPartEClass = createEClass(COORDINATION_PROTOCOL_PART);
		createEReference(coordinationProtocolPartEClass, COORDINATION_PROTOCOL_PART__COORDINATION_PROTOCOL);
		createEReference(coordinationProtocolPartEClass, COORDINATION_PROTOCOL_PART__PORT_PARTS);

		directedTypedPortEClass = createEClass(DIRECTED_TYPED_PORT);
		createEAttribute(directedTypedPortEClass, DIRECTED_TYPED_PORT__KIND);
		createEAttribute(directedTypedPortEClass, DIRECTED_TYPED_PORT__OPTIONAL);
		createEAttribute(directedTypedPortEClass, DIRECTED_TYPED_PORT__OUT_PORT);
		createEAttribute(directedTypedPortEClass, DIRECTED_TYPED_PORT__IN_PORT);
		createEReference(directedTypedPortEClass, DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION);

		portPartEClass = createEClass(PORT_PART);
		createEReference(portPartEClass, PORT_PART__PORT_TYPE);
		createEReference(portPartEClass, PORT_PART__COMPONENT_PART);
		createEReference(portPartEClass, PORT_PART__COORDINATION_PROTOCOL_PART);
		createEReference(portPartEClass, PORT_PART__REFINED_ROLE);
		createEAttribute(portPartEClass, PORT_PART__NAME);

		staticAtomicComponentEClass = createEClass(STATIC_ATOMIC_COMPONENT);

		staticComponentEClass = createEClass(STATIC_COMPONENT);

		// Create enums
		componentKindEEnum = createEEnum(COMPONENT_KIND);
		portDirectionKindEEnum = createEEnum(PORT_DIRECTION_KIND);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);
		ProtocolPackage theProtocolPackage = (ProtocolPackage)EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		ConstraintPackage theConstraintPackage = (ConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		componentEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		componentEClass.getESuperTypes().add(theTypesPackage.getDataType());
		portEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpoint());
		portEClass.getESuperTypes().add(theTypesPackage.getDataType());
		continuousPortEClass.getESuperTypes().add(this.getDirectedTypedPort());
		discretePortEClass.getESuperTypes().add(this.getPort());
		discretePortEClass.getESuperTypes().add(theConnectorPackage.getDiscreteInteractionEndpoint());
		componentPartEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		componentPartEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		componentPartEClass.getESuperTypes().add(theTypesPackage.getDataType());
		staticStructuredComponentEClass.getESuperTypes().add(this.getStructuredComponent());
		staticStructuredComponentEClass.getESuperTypes().add(this.getStaticComponent());
		atomicComponentEClass.getESuperTypes().add(this.getComponent());
		atomicComponentEClass.getESuperTypes().add(theBehaviorPackage.getBehavioralElement());
		atomicComponentEClass.getESuperTypes().add(theConstraintPackage.getVerifiableElement());
		assemblyConnectorEClass.getESuperTypes().add(this.getPortConnector());
		delegationConnectorEClass.getESuperTypes().add(this.getPortConnector());
		portConnectorEClass.getESuperTypes().add(theConnectorPackage.getConnector());
		hybridPortEClass.getESuperTypes().add(this.getDirectedTypedPort());
		structuredComponentEClass.getESuperTypes().add(this.getComponent());
		coordinationProtocolPartEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		directedTypedPortEClass.getESuperTypes().add(this.getPort());
		directedTypedPortEClass.getESuperTypes().add(theBehaviorPackage.getTypedNamedElement());
		portPartEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpoint());
		staticAtomicComponentEClass.getESuperTypes().add(this.getAtomicComponent());
		staticAtomicComponentEClass.getESuperTypes().add(this.getStaticComponent());
		staticComponentEClass.getESuperTypes().add(this.getComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_ComponentKind(), this.getComponentKind(), "componentKind", "software component", 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Ports(), this.getPort(), this.getPort_Component(), "ports", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Component(), this.getComponent(), this.getComponent_Ports(), "component", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_PortConnectors(), this.getPortConnector(), null, "portConnectors", null, 0, -1, Port.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(continuousPortEClass, ContinuousPort.class, "ContinuousPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discretePortEClass, DiscretePort.class, "DiscretePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscretePort_RefinedRole(), theProtocolPackage.getRole(), null, "refinedRole", null, 0, 1, DiscretePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscretePort_IsDiscreteInPort(), ecorePackage.getEBoolean(), "isDiscreteInPort", "false", 0, 1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscretePort_IsDiscreteOutPort(), ecorePackage.getEBoolean(), "isDiscreteOutPort", "false", 0, 1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscretePort_IsDiscreteInOutPort(), ecorePackage.getEBoolean(), "isDiscreteInOutPort", "false", 0, 1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscretePort_MultiPort(), ecorePackage.getEBoolean(), "multiPort", "false", 1, 1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretePort_CoordinationProtocol(), theProtocolPackage.getCoordinationProtocol(), null, "coordinationProtocol", null, 0, 1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentPartEClass, ComponentPart.class, "ComponentPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPart_ComponentType(), this.getComponent(), null, "componentType", null, 1, 1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_ParentComponent(), this.getStructuredComponent(), this.getStructuredComponent_EmbeddedComponentParts(), "parentComponent", null, 1, 1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_Cardinality(), theValuetypePackage.getCardinality(), null, "cardinality", null, 1, 1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_PortParts(), this.getPortPart(), this.getPortPart_ComponentPart(), "portParts", null, 0, -1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentPart_MultiPart(), ecorePackage.getEBoolean(), "multiPart", "false", 0, 1, ComponentPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(staticStructuredComponentEClass, StaticStructuredComponent.class, "StaticStructuredComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomicComponentEClass, AtomicComponent.class, "AtomicComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAtomicComponent__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assemblyConnectorEClass, AssemblyConnector.class, "AssemblyConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyConnector_CoordinationProtocolPart(), this.getCoordinationProtocolPart(), null, "coordinationProtocolPart", null, 0, 1, AssemblyConnector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyConnector_PortParts(), this.getPortPart(), null, "portParts", null, 1, 2, AssemblyConnector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(delegationConnectorEClass, DelegationConnector.class, "DelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationConnector_PortPart(), this.getPortPart(), null, "portPart", null, 1, 1, DelegationConnector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDelegationConnector_Port(), this.getPort(), null, "port", null, 1, 1, DelegationConnector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(portConnectorEClass, PortConnector.class, "PortConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortConnector_ParentComponent(), this.getStructuredComponent(), this.getStructuredComponent_Connectors(), "parentComponent", null, 1, 1, PortConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hybridPortEClass, HybridPort.class, "HybridPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHybridPort_SamplingInterval(), theValuetypePackage.getTimeValue(), null, "samplingInterval", null, 1, 1, HybridPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredComponentEClass, StructuredComponent.class, "StructuredComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredComponent_EmbeddedComponentParts(), this.getComponentPart(), this.getComponentPart_ParentComponent(), "embeddedComponentParts", null, 1, -1, StructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredComponent_Connectors(), this.getPortConnector(), this.getPortConnector_ParentComponent(), "connectors", null, 0, -1, StructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredComponent_AllStructuredComponents(), this.getStructuredComponent(), null, "allStructuredComponents", null, 0, -1, StructuredComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredComponent_AllAtomicComponents(), this.getAtomicComponent(), null, "allAtomicComponents", null, 0, -1, StructuredComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredComponent_CoordinationProtocolParts(), this.getCoordinationProtocolPart(), null, "coordinationProtocolParts", null, 0, -1, StructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStructuredComponent__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(coordinationProtocolPartEClass, CoordinationProtocolPart.class, "CoordinationProtocolPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationProtocolPart_CoordinationProtocol(), theProtocolPackage.getCoordinationProtocol(), null, "coordinationProtocol", null, 1, 1, CoordinationProtocolPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationProtocolPart_PortParts(), this.getPortPart(), this.getPortPart_CoordinationProtocolPart(), "portParts", null, 2, -1, CoordinationProtocolPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directedTypedPortEClass, DirectedTypedPort.class, "DirectedTypedPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirectedTypedPort_Kind(), this.getPortDirectionKind(), "kind", null, 1, 1, DirectedTypedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectedTypedPort_Optional(), ecorePackage.getEBoolean(), "optional", "false", 0, 1, DirectedTypedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectedTypedPort_OutPort(), ecorePackage.getEBoolean(), "outPort", "false", 0, 1, DirectedTypedPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectedTypedPort_InPort(), ecorePackage.getEBoolean(), "inPort", "false", 0, 1, DirectedTypedPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDirectedTypedPort_InitializeExpression(), theExpressionsPackage.getExpression(), null, "initializeExpression", null, 0, 1, DirectedTypedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portPartEClass, PortPart.class, "PortPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortPart_PortType(), this.getPort(), null, "portType", null, 1, 1, PortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortPart_ComponentPart(), this.getComponentPart(), this.getComponentPart_PortParts(), "componentPart", null, 1, 1, PortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortPart_CoordinationProtocolPart(), this.getCoordinationProtocolPart(), this.getCoordinationProtocolPart_PortParts(), "coordinationProtocolPart", null, 0, 1, PortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortPart_RefinedRole(), theProtocolPackage.getRole(), null, "refinedRole", null, 0, 1, PortPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortPart_Name(), ecorePackage.getEString(), "name", null, 0, 1, PortPart.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(staticAtomicComponentEClass, StaticAtomicComponent.class, "StaticAtomicComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staticComponentEClass, StaticComponent.class, "StaticComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(componentKindEEnum, ComponentKind.class, "ComponentKind");
		addEEnumLiteral(componentKindEEnum, ComponentKind.SOFTWARE_COMPONENT);
		addEEnumLiteral(componentKindEEnum, ComponentKind.CONTINUOUS_COMPONENT);
		addEEnumLiteral(componentKindEEnum, ComponentKind.HYBRID_COMPONENT);

		initEEnum(portDirectionKindEEnum, PortDirectionKind.class, "PortDirectionKind");
		addEEnumLiteral(portDirectionKindEEnum, PortDirectionKind.IN);
		addEEnumLiteral(portDirectionKindEEnum, PortDirectionKind.OUT);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http://www.muml.org/emf/OCLFilter
		createOCLFilterAnnotations();
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
		  (componentEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniquePortNames UniqueComponentNames"
		   });	
		addAnnotation
		  (discretePortEClass, 
		   source, 
		   new String[] {
			 "constraints", "DiscretePortRequiresMessageTypes DiscretePortAndRoleSameMessageTypes DiscretePortRequiresBehavior DiscretePortAtStructuredComponentHasNoBehavior DiscretePortShouldRefineRole DiscretePortCardinalityMustComplyWithRefinedRoleCardinality MultiPortOfAtomicComponentRequiresSubroleBehaviorAndCoordinatorBehavior"
		   });	
		addAnnotation
		  (componentPartEClass, 
		   source, 
		   new String[] {
			 "constraints", "CardinalityLowerBoundSet TypeNotEqualToParent CardinalityUpperBoundSet"
		   });	
		addAnnotation
		  (staticStructuredComponentEClass, 
		   source, 
		   new String[] {
			 "constraints", "StaticStructuredComponentMustNotHaveWrongDiscreteInteractionEndpoints"
		   });	
		addAnnotation
		  (atomicComponentEClass, 
		   source, 
		   new String[] {
			 "constraints", "SoftwareComponentRequiresBehavior ValidComponentType SoftwareComponentValidPorts ContinuousComponentValidPorts"
		   });	
		addAnnotation
		  (assemblyConnectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "AssemblySameStructuredComponent SelfAssemblyOnlyForMultiPortsOrMultiParts AssemblyBetweenDirectedTypedPortsRequiresSameDataType AssemblyBetweenDiscretePortsOrDirectedTypedPorts ValidPortDirections AssemblyBetweenDiscretePortsRequiresSameCoordinationProtocol AssemblyBetweenDiscretePortsRequiresDifferentRoles AssemblyBetweenDiscretePortsCompatibleMessageTypes"
		   });	
		addAnnotation
		  (delegationConnectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "DelegationOnlyBetweenSameDiscreteInteractionEndpoints DelegateToEmbeddedPort DelegationBetweenDirectedTypedPortsRequiresSameDataType DelegationBetweenDiscretePortsOrDirectedTypedPorts DelegationBetweenDiscretePortsEqualMessageTypes ValidPortDirections DelegationBetweenDiscretePortsRequiresSameRoles DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart"
		   });	
		addAnnotation
		  (structuredComponentEClass, 
		   source, 
		   new String[] {
			 "constraints", "StructuredComponentAllowsNoHybridPorts ValidComponentType NoCyclicComponentPartHierarchy DiscreteStructuredComponentValidParts HybridStructuredComponentValidPorts ComponentPartsHaveUniqueName SoftwareComponentNoContinuousPorts"
		   });	
		addAnnotation
		  (coordinationProtocolPartEClass, 
		   source, 
		   new String[] {
			 "constraints", "OnlyDiscretePortParts"
		   });	
		addAnnotation
		  (directedTypedPortEClass, 
		   source, 
		   new String[] {
			 "constraints", "InitializeExpressionOnlyForOutPorts"
		   });	
		addAnnotation
		  (staticComponentEClass, 
		   source, 
		   new String[] {
			 "constraints", "SoftwareComponentOnlyDiscreteOrHybridPorts"
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
		  (componentEClass, 
		   source, 
		   new String[] {
			 "UniquePortNames", "-- Port names must be unique\nself.ports->isUnique(name)",
			 "UniqueComponentNames", "-- The component\'s name must be unique.\nComponent.allInstances()->select(c|c<>self)->collect(name)->excludes(self.name)\n-- author: adann"
		   });	
		addAnnotation
		  (getPort_PortConnectors(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectors->select(c | c.oclIsKindOf(PortConnector)).oclAsType(PortConnector)->asOrderedSet()"
		   });	
		addAnnotation
		  (discretePortEClass, 
		   source, 
		   new String[] {
			 "DiscretePortRequiresMessageTypes", "-- Discrete Port must define sender or receiver message types\nself.senderMessageTypes->notEmpty() or self.receiverMessageTypes->notEmpty()",
			 "DiscretePortRequiresBehavior", "-- A discrete port of an atomic component must have a Behavior Specification\r\n(not self.component.oclIsUndefined() and self.component.oclIsKindOf(component::AtomicComponent))\r\n\timplies not self.behavior.oclIsUndefined()",
			 "DiscretePortAtStructuredComponentHasNoBehavior", "-- Discrete Port at Structured Component must not have behavior\n(not self.component.oclIsUndefined() and self.component.oclIsKindOf(component::StructuredComponent))\n\timplies self.behavior.oclIsUndefined()",
			 "DiscretePortShouldRefineRole", "-- @warning\n-- Discrete Port should refine a role\nself.oclIsKindOf(component::DiscretePort) implies not self.refinedRole.oclIsUndefined()",
			 "DiscretePortAndRoleSameMessageTypes", "-- Discrete Port must have the same message types as its refined role\r\nnot self.refinedRole.oclIsUndefined() implies\r\n\t(self.senderMessageTypes->asSet() = self.refinedRole.senderMessageTypes->asSet() \r\n\t and\r\n\t self.receiverMessageTypes->asSet() = self.refinedRole.receiverMessageTypes->asSet() \r\n\t)",
			 "DiscretePortCardinalityMustComplyWithRefinedRoleCardinality", "-- Cardinality of discrete port and its refined role must match\r\n((not self.cardinality.oclIsUndefined()) and (not self.refinedRole.oclIsUndefined())) \r\nimplies \r\n((not self.multi) or self.cardinality.lowerBound.greaterOrEqual(self.refinedRole.cardinality.lowerBound) and self.cardinality.upperBound.lessOrEqual(self.refinedRole.cardinality.upperBound))",
			 "MultiPortOfAtomicComponentRequiresSubroleBehaviorAndCoordinatorBehavior", "-- A multiport requires that either all messages in the RTSCs use one-to-many communication schemata or that the references coordinatorBehavior and subroleBehavior are set.\r\n(self.behavior.oclAsType(realtimestatechart::RealtimeStatechart).usesOneToManyCommunicationSchemata implies (self.multiPort and self.component.oclIsKindOf(AtomicComponent)) = not self.coordinatorBehavior.oclIsUndefined())\r\nand self.coordinatorBehavior.oclIsUndefined() = self.subroleBehavior.oclIsUndefined()"
		   });	
		addAnnotation
		  (getDiscretePort_IsDiscreteInPort(), 
		   source, 
		   new String[] {
			 "derivation", "self.receiverMessageTypes ->size() >= 1 and self.senderMessageTypes ->size() = 0"
		   });	
		addAnnotation
		  (getDiscretePort_IsDiscreteOutPort(), 
		   source, 
		   new String[] {
			 "derivation", "self.receiverMessageTypes ->size() = 0 and self.senderMessageTypes ->size() >= 1"
		   });	
		addAnnotation
		  (getDiscretePort_IsDiscreteInOutPort(), 
		   source, 
		   new String[] {
			 "derivation", "self.receiverMessageTypes ->size() >= 1 and self.senderMessageTypes ->size() >= 1"
		   });	
		addAnnotation
		  (getDiscretePort_MultiPort(), 
		   source, 
		   new String[] {
			 "derivation", "self.multi"
		   });	
		addAnnotation
		  (getDiscretePort_CoordinationProtocol(), 
		   source, 
		   new String[] {
			 "derivation", "if refinedRole.oclIsUndefined() or not refinedRole.coordinationProtocol.oclIsKindOf(protocol::CoordinationProtocol) then\r\n\tnull\r\nelse\r\n\trefinedRole.coordinationProtocol.oclAsType(protocol::CoordinationProtocol)\r\nendif\r\n\r\n\r\n"
		   });	
		addAnnotation
		  (componentPartEClass, 
		   source, 
		   new String[] {
			 "CardinalityLowerBoundSet", "-- Lower bound of cardinality must be set\r\nif self.cardinality.lowerBound.oclIsUndefined() then\r\nfalse\r\nelse\r\nself.cardinality.lowerBound->notEmpty()\r\nendif",
			 "TypeNotEqualToParent", "-- Component Part must have the same type as its parent structured component\nself.componentType <> self.parentComponent",
			 "CardinalityUpperBoundSet", "-- Upper bound of cardinality must be set\r\nif self.cardinality.upperBound.oclIsUndefined() then\r\nfalse\r\nelse\r\nself.cardinality.upperBound->notEmpty()\r\nendif"
		   });	
		addAnnotation
		  (getComponentPart_MultiPart(), 
		   source, 
		   new String[] {
			 "derivation", "if (not self.cardinality.oclIsUndefined() and not self.cardinality.upperBound.oclIsUndefined()) then\nself.cardinality.upperBound.value > 1 or self.cardinality.upperBound.infinity\nelse false\nendif"
		   });	
		addAnnotation
		  (staticStructuredComponentEClass, 
		   source, 
		   new String[] {
			 "StaticStructuredComponentMustNotHaveWrongDiscreteInteractionEndpoints", "-- Static Structured Component must not have Discrete Interaction Endpoints other than Discrete Ports\nports->forAll(p | p.oclIsKindOf(connector::DiscreteInteractionEndpoint) implies p.oclIsKindOf(DiscretePort))"
		   });	
		addAnnotation
		  (atomicComponentEClass, 
		   source, 
		   new String[] {
			 "SoftwareComponentRequiresBehavior", "-- Software component must have a behavior\nself.componentKind = component::ComponentKind::SOFTWARE_COMPONENT implies (not self.behavior.oclIsUndefined())",
			 "ValidComponentType", "-- Atomic component must be of type SOFTWARE or CONTINUOUS.\nself.componentKind = component::ComponentKind::SOFTWARE_COMPONENT\nor self.componentKind = component::ComponentKind::CONTINUOUS_COMPONENT",
			 "SoftwareComponentValidPorts", "-- Software component must only have hybrid ports or discrete ports\nself.componentKind = component::ComponentKind::SOFTWARE_COMPONENT\n\timplies (\n\t\tself.ports->forAll(p | p.oclIsKindOf(connector::DiscreteInteractionEndpoint) or p.oclIsKindOf(component::HybridPort))\n\t)",
			 "ContinuousComponentValidPorts", "-- Continuous Component must only have continuous ports.\nself.componentKind = component::ComponentKind::CONTINUOUS_COMPONENT\n\timplies (\n\t\tself.ports->forAll(p | p.oclIsKindOf(component::ContinuousPort))\n\t)"
		   });	
		addAnnotation
		  (assemblyConnectorEClass, 
		   source, 
		   new String[] {
			 "SelfAssemblyOnlyForMultiPortsOrMultiParts", "--  Self assembly only allowed for multi ports and multi component-parts\nselfConnector implies\nlet portPart : PortPart = portParts->first() in\nportPart.portType.oclIsKindOf(component::DiscretePort) and (portPart.portType.oclAsType(component::DiscretePort).multi or portPart.componentPart.multiPart)\n-- author: bingo, cgerking, see MUML #872",
			 "AssemblySameStructuredComponent", "-- Assembly must connect port parts within same structured component.\r\nportParts.componentPart.parentComponent->forAll(a, b | a = b)\r\n",
			 "AssemblyBetweenDirectedTypedPortsRequiresSameDataType", "-- Assembly between DirectedTypedPorts requires same Data Type\nlet directedTypedPorts : Sequence(component::DirectedTypedPort) = portParts.portType->select(oclIsKindOf(component::DirectedTypedPort)).oclAsType(component::DirectedTypedPort) in\ndirectedTypedPorts->forAll(p1,p2 | p1.dataType = p2.dataType)\n-- author: bingo, cgerking, see MUML #873",
			 "AssemblyBetweenDiscretePortsOrDirectedTypedPorts", "-- Assembly may only connect exclusively Discrete Ports or exclusively Directed Typed Ports\n(portParts.portType->forAll(oclIsKindOf(component::DiscretePort)) or portParts.portType->forAll(oclIsKindOf(component::DirectedTypedPort)))\n-- author: bingo, cgerking, see MUML #874",
			 "ValidPortDirections", "-- Assembly may only connect Directed Typed Ports with different Port Direction Kinds\nportParts.portType->select(oclIsKindOf(component::DirectedTypedPort)).oclAsType(component::DirectedTypedPort)->isUnique(kind)\n-- author: bingo, cgerking, see MUML #875",
			 "AssemblyBetweenDiscretePortsRequiresSameCoordinationProtocol", "-- Assembly may only connect ports refining roles of the same coordination protocol\nportParts.refinedRole->reject(oclIsUndefined())->forAll(r1,r2 | r1.coordinationProtocol = r2.coordinationProtocol)\n-- author: bingo, cgerking, see MUML #876",
			 "AssemblyBetweenDiscretePortsRequiresDifferentRoles", "-- Assembly may only connect ports refining different roles\r\nportParts.refinedRole->reject(oclIsUndefined())->isUnique(r | r)\r\n-- author: bingo, cgerking, see MUML #877",
			 "AssemblyBetweenDiscretePortsCompatibleMessageTypes", "-- Assembly may only connect discrete ports with compatible message types (a.senderMessageTypes = b.receiverMessageTypes)\nportParts.portType->select(oclIsKindOf(component::DiscretePort)).oclAsType(component::DiscretePort)->\nforAll(p1, p2 | p1 <> p2 implies p1.senderMessageTypes->asSet() = p2.receiverMessageTypes->asSet())\n-- author: bingo, cgerking, see MUML #878"
		   });	
		addAnnotation
		  (getAssemblyConnector_CoordinationProtocolPart(), 
		   source, 
		   new String[] {
			 "derivation", "self.portParts->first().coordinationProtocolPart"
		   });	
		addAnnotation
		  (getAssemblyConnector_PortParts(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpoints->select(c | c.oclIsKindOf(PortPart)).oclAsType(PortPart)->asOrderedSet()"
		   });	
		addAnnotation
		  (delegationConnectorEClass, 
		   source, 
		   new String[] {
			 "DelegationBetweenDirectedTypedPortsRequiresSameDataType", "-- Delegation between DirectedTypedPorts requires same Data Type\r\n(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined() and portPart.portType.oclIsKindOf(component::DirectedTypedPort) and port.oclIsKindOf(component::DirectedTypedPort))\r\nimplies \r\nportPart.portType.oclAsType(component::DirectedTypedPort).dataType = port.oclAsType(component::DirectedTypedPort).dataType\r\n-- author: bingo, cgerking, see MUML #879",
			 "DelegationBetweenDiscretePortsOrDirectedTypedPorts", "-- Delegation may only connect exclusively Discrete Ports or exclusively Directed Typed Ports\r\n(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined())\r\nimplies \r\nlet ports : OrderedSet(Port) = OrderedSet { portPart.portType, port } in\r\n(ports->forAll(oclIsKindOf(connector::DiscreteInteractionEndpoint)) or ports->forAll(oclIsKindOf(component::DirectedTypedPort)))\r\n-- author: bingo, cgerking, see MUML #880",
			 "DelegationBetweenDiscretePortsEqualMessageTypes", "-- Delegation may only connect discrete ports with equal message types\r\n(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined())\r\nimplies \r\nlet ports : OrderedSet(Port) = OrderedSet { portPart.portType, port } in\r\nports->select(oclIsKindOf(component::DiscretePort)).oclAsType(component::DiscretePort)->forAll(p1, p2 | p1.senderMessageTypes->asSet() = p2.senderMessageTypes->asSet() and p1.receiverMessageTypes->asSet() = p2.receiverMessageTypes->asSet())\r\n-- author: bingo, cgerking, see MUML #81",
			 "ValidPortDirections", "-- Delegation may only connect Directed Typed Ports with different Port Direction Kinds\r\n(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined())\r\nimplies \r\nlet ports : OrderedSet (Port) = OrderedSet { portPart.portType, port } in ports->select(oclIsKindOf(component::DirectedTypedPort)).oclAsType(component::DirectedTypedPort)->forAll(p1, p2 | p1.kind = p2.kind)\r\n-- author: bingo, cgerking, see MUML #882",
			 "DelegationBetweenDiscretePortsRequiresSameRoles", "-- Delegation may only connect ports refining same roles\r\n(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined() and self.port.oclIsKindOf(DiscretePort)) \r\nimplies \r\nself.port.oclAsType(DiscretePort).refinedRole = self.portPart.refinedRole\r\n-- author: bingo, cgerking, see MUML #883",
			 "DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart", "-- Delegation starting at Multi Port must connect to a multi port or single port at multi part\r\n(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined() and self.port.oclIsKindOf(DiscretePort) and self.port.oclAsType(DiscretePort).multi)\r\nimplies\r\n((self.portPart.portType.oclIsKindOf(DiscretePort) and self.portPart.portType.oclAsType(DiscretePort).multi) or self.portPart.componentPart.multiPart)\r\n-- author: bingo, cgerking, see MUML #884",
			 "DelegateToEmbeddedPort", "-- Delegation must delegate to a Port at an embedded Component Part.\r\nif portPart.oclIsUndefined() or portPart.componentPart.oclIsUndefined() or port.oclIsUndefined() then\r\n\ttrue\r\nelse\r\n\tportPart.componentPart.parentComponent = port.component\r\nendif\r\n",
			 "DelegationOnlyBetweenSameDiscreteInteractionEndpoints", "-- Delegations may only connect Ports of the same kind\r\n(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined())\r\nimplies (\r\n\t(port.oclIsKindOf(connector::DiscreteInteractionEndpoint))\r\n\timplies\r\n\t(port.oclAsType(ecore::EObject).eClass() = portPart.portType.oclAsType(ecore::EObject).eClass())\r\n)\r\n-- author: chris227, see MUML #1043"
		   });	
		addAnnotation
		  (getDelegationConnector_PortPart(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpoints->select(c | c.oclIsKindOf(PortPart)).oclAsType(PortPart) -> any(true)"
		   });	
		addAnnotation
		  (getDelegationConnector_Port(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpoints->select(c | c.oclIsKindOf(Port)).oclAsType(Port) -> any(true)"
		   });	
		addAnnotation
		  (structuredComponentEClass, 
		   source, 
		   new String[] {
			 "StructuredComponentAllowsNoHybridPorts", "-- A structured component allows no hybrid ports.\r\nself.ports->forAll(port | not port.oclIsKindOf(component::HybridPort))",
			 "ValidComponentType", "-- Structured components must be either software or hybrid components\nself.componentKind = component::ComponentKind::SOFTWARE_COMPONENT\nor self.componentKind = component::ComponentKind::HYBRID_COMPONENT",
			 "NoCyclicComponentPartHierarchy", "-- Hierarchy of embedded component parts must not include myself\r\nif self.allStructuredComponents->oclIsUndefined() then\r\nfalse\r\nelse\r\nnot self.allStructuredComponents->includes(self)\r\nendif",
			 "DiscreteStructuredComponentValidParts", "-- Structured software component must only have software component parts \r\nif (not self.allAtomicComponents->oclIsUndefined()) then\r\nself.componentKind = component::ComponentKind::SOFTWARE_COMPONENT\r\nimplies\r\n\t-- collect all atomic components from parent parts and union them\r\n\t-- with own atomic components\r\n\tself.allAtomicComponents->union(\r\n\t\tself.embeddedComponentParts->select(\r\n\t\t\tcomponentType.oclIsKindOf(component::AtomicComponent)\r\n\t\t)->collect(componentType.oclAsType(component::AtomicComponent))->asOrderedSet()\r\n\t)->forAll(componentKind = component::ComponentKind::SOFTWARE_COMPONENT)\r\nelse\r\ntrue\r\nendif",
			 "HybridStructuredComponentValidPorts", "-- Structured hybrid component must only have discrete or continuous ports\r\nself.componentKind = component::ComponentKind::HYBRID_COMPONENT\r\n\timplies (\r\n\t\tself.ports->forAll(p | p.oclIsKindOf(connector::DiscreteInteractionEndpoint) or p.oclIsKindOf(component::ContinuousPort))\r\n\t)",
			 "ComponentPartsHaveUniqueName", "-- Names of embedded component parts must be unique\nself.embeddedComponentParts -> isUnique(name)",
			 "SoftwareComponentNoContinuousPorts", "-- Software component must not have continuous ports\r\nself.componentKind = ComponentKind::SOFTWARE_COMPONENT implies self.ports->forAll(p | not p.oclIsKindOf(ContinuousPort))"
		   });	
		addAnnotation
		  (getStructuredComponent_AllStructuredComponents(), 
		   source, 
		   new String[] {
			 "derivation", "self->closure(\r\n\tembeddedComponentParts->select(\r\n\t\tcomponentType.oclIsKindOf(StructuredComponent)\r\n\t).componentType.oclAsType(StructuredComponent)\r\n)"
		   });	
		addAnnotation
		  (getStructuredComponent_AllAtomicComponents(), 
		   source, 
		   new String[] {
			 "derivation", "self.allStructuredComponents->collect(\r\n\tembeddedComponentParts->select(\r\n\t\tcomponentType.oclIsKindOf(component::AtomicComponent)\r\n\t)->collect(componentType.oclAsType(component::AtomicComponent))\r\n)->asOrderedSet()"
		   });	
		addAnnotation
		  (coordinationProtocolPartEClass, 
		   source, 
		   new String[] {
			 "OnlyDiscretePortParts", "-- Coordination Protocol Part must only have discrete Port Parts\r\nnot self.portParts->oclIsUndefined()\r\nimplies\r\nself.portParts->forAll(p : PortPart | p.portType.oclIsKindOf(DiscretePort))"
		   });	
		addAnnotation
		  (directedTypedPortEClass, 
		   source, 
		   new String[] {
			 "InitializeExpressionOnlyForOutPorts", "-- Only out ports may have an initialize expression.\nself.kind <> component::PortDirectionKind::OUT implies self.initializeExpression.oclIsUndefined()"
		   });	
		addAnnotation
		  (getDirectedTypedPort_OutPort(), 
		   source, 
		   new String[] {
			 "derivation", "self.kind = component::PortDirectionKind::OUT"
		   });	
		addAnnotation
		  (getDirectedTypedPort_InPort(), 
		   source, 
		   new String[] {
			 "derivation", "self.kind = component::PortDirectionKind::IN"
		   });	
		addAnnotation
		  (getPortPart_RefinedRole(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.portType.oclIsKindOf(DiscretePort)) then\r\nself.portType.oclAsType(DiscretePort).refinedRole\r\nelse\r\nnull\r\nendif"
		   });	
		addAnnotation
		  (getPortPart_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if portType.name.oclIsUndefined() then\n\tnull\nelse\n\tportType.name\nendif"
		   });	
		addAnnotation
		  (staticComponentEClass, 
		   source, 
		   new String[] {
			 "SoftwareComponentOnlyDiscreteOrHybridPorts", "-- Static software components must only have discrete ports and hybrid ports.\r\nself.componentKind = ComponentKind::SOFTWARE_COMPONENT implies self.ports->reject(p | p.oclIsKindOf(DiscretePort) or p.oclIsKindOf(HybridPort))->isEmpty()"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.muml.org/emf/OCLFilter</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLFilterAnnotations() {
		String source = "http://www.muml.org/emf/OCLFilter";	
		addAnnotation
		  (getComponent_ComponentKind(), 
		   source, 
		   new String[] {
			 "filter", "if(self.oclIsKindOf(component::AtomicComponent)) \r\n\t then OrderedSet {ComponentKind::CONTINUOUS_COMPONENT, ComponentKind::SOFTWARE_COMPONENT } \r\nelse \r\n\tOrderedSet {ComponentKind::CONTINUOUS_COMPONENT, ComponentKind::HYBRID_COMPONENT, ComponentKind::SOFTWARE_COMPONENT} endif\r\n\r\n\r\n"
		   });
	}

} //ComponentPackageImpl
