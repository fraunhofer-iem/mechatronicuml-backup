/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.model.pattern.ConnectorQualityOfServiceAssumptions;
import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternFactory;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;
import de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternFactoryImpl extends EFactoryImpl implements PatternFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatternFactory init() {
		try {
			PatternFactory thePatternFactory = (PatternFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/muml/model/pattern/0.3.6"); 
			if (thePatternFactory != null) {
				return thePatternFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatternFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternFactoryImpl() {
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
			case PatternPackage.ROLE_CONNECTOR: return createRoleConnector();
			case PatternPackage.COORDINATION_PATTERN: return createCoordinationPattern();
			case PatternPackage.ROLE: return createRole();
			case PatternPackage.MESSAGE_BUFFER: return createMessageBuffer();
			case PatternPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS: return createConnectorQualityOfServiceAssumptions();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public CoordinationPattern createCoordinationPattern() {
		CoordinationPatternImpl coordinationPattern = new CoordinationPatternImpl();
		return coordinationPattern;
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
	public MessageBuffer createMessageBuffer() {
		MessageBufferImpl messageBuffer = new MessageBufferImpl();
		return messageBuffer;
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
	public PatternPackage getPatternPackage() {
		return (PatternPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatternPackage getPackage() {
		return PatternPackage.eINSTANCE;
	}

} //PatternFactoryImpl
