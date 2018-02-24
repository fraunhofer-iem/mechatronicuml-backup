/**
 */
package coordination.impl;

import coordination.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinationFactoryImpl extends EFactoryImpl implements CoordinationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoordinationFactory init() {
		try {
			CoordinationFactory theCoordinationFactory = (CoordinationFactory)EPackage.Registry.INSTANCE.getEFactory(CoordinationPackage.eNS_URI);
			if (theCoordinationFactory != null) {
				return theCoordinationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoordinationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CoordinationPackage.NAMED_ELEMENT: return createNamedElement();
			case CoordinationPackage.COORDINATION_SPECIFICATION: return createCoordinationSpecification();
			case CoordinationPackage.ROLE: return createRole();
			case CoordinationPackage.ROLE_CONNECTOR: return createRoleConnector();
			case CoordinationPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS: return createConnectorQualityOfServiceAssumptions();
			case CoordinationPackage.COORDINATION_PATTERN: return createCoordinationPattern();
			case CoordinationPackage.COORDINATION_PROTOCOL: return createCoordinationProtocol();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationSpecification createCoordinationSpecification() {
		CoordinationSpecificationImpl coordinationSpecification = new CoordinationSpecificationImpl();
		return coordinationSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector createRoleConnector() {
		RoleConnectorImpl roleConnector = new RoleConnectorImpl();
		return roleConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorQualityOfServiceAssumptions createConnectorQualityOfServiceAssumptions() {
		ConnectorQualityOfServiceAssumptionsImpl connectorQualityOfServiceAssumptions = new ConnectorQualityOfServiceAssumptionsImpl();
		return connectorQualityOfServiceAssumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPattern createCoordinationPattern() {
		CoordinationPatternImpl coordinationPattern = new CoordinationPatternImpl();
		return coordinationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocol createCoordinationProtocol() {
		CoordinationProtocolImpl coordinationProtocol = new CoordinationProtocolImpl();
		return coordinationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPackage getCoordinationPackage() {
		return (CoordinationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CoordinationPackage getPackage() {
		return CoordinationPackage.eINSTANCE;
	}

} //CoordinationFactoryImpl
