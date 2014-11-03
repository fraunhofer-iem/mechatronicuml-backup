package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers;

import java.util.Collection;

import org.eclipse.emf.ecore.EcorePackage;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_CoordinationProtocol_2005(
			de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol instance) {
		try {
			de.uni_paderborn.fujaba.muml.protocol.Role newInstance_0_0 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createRole();
			instance.getRoles().add(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
									.getRole(), null).evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			newInstance_0_0.setCardinality(newInstance_0_0_1_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0_1_0.setLowerBound(newInstance_0_0_1_0_0_0);
			Object value_0_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_1_0_0_0);

			value_0_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0_0_0.setValue(((Long) value_0_0_1_0_0_0_0)
					.longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0_1_0.setUpperBound(newInstance_0_0_1_0_1_0);
			Object value_0_0_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlOCLFactory
					.getExpression(
							2,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_1_0_1_0);

			value_0_0_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0_1_0.setValue(((Long) value_0_0_1_0_1_0_0)
					.longValue());

			de.uni_paderborn.fujaba.muml.protocol.Role newInstance_0_1 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createRole();
			instance.getRoles().add(newInstance_0_1);
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_1_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			newInstance_0_1.setCardinality(newInstance_0_1_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_1_0_0.setLowerBound(newInstance_0_1_0_0_0_0);
			Object value_0_1_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlOCLFactory
					.getExpression(
							3,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_1_0_0_0_0);

			value_0_1_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_1_0_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_1_0_0_0_0.setValue(((Long) value_0_1_0_0_0_0_0)
					.longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_1_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_1_0_0.setUpperBound(newInstance_0_1_0_0_1_0);
			Object value_0_1_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlOCLFactory
					.getExpression(
							4,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_1_0_0_1_0);

			value_0_1_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_1_0_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_1_0_0_1_0.setValue(((Long) value_0_1_0_0_1_0_0)
					.longValue());

			de.uni_paderborn.fujaba.muml.protocol.RoleConnector newInstance_1_0 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createRoleConnector();
			instance.setRoleConnector(newInstance_1_0);
			Object value_1_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlOCLFactory
					.getExpression(
							5,
							de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
									.getRoleConnector(), null).evaluate(
							newInstance_1_0);
			if (value_1_0_0 instanceof Collection) {
				newInstance_1_0.getConnectorEndpoints().clear();
				newInstance_1_0.getConnectorEndpoints().addAll(
						((Collection) value_1_0_0));
			} else {
				newInstance_1_0
						.getConnectorEndpoints()
						.add((de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) value_1_0_0);
			}
			de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions newInstance_1_0_1_0 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createConnectorQualityOfServiceAssumptions();
			newInstance_1_0
					.setConnectorQualityOfServiceAssumptions(newInstance_1_0_1_0);
			Object value_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlOCLFactory
					.getExpression(
							6,
							de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
									.getConnectorQualityOfServiceAssumptions(),
							null).evaluate(newInstance_1_0_1_0);
			newInstance_1_0_1_0.setComment((String) value_1_0_1_0_0);

			Object value_2 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlOCLFactory
					.getExpression(
							11,
							de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
									.getCoordinationProtocol(), null).evaluate(
							instance);
			instance.setName((String) value_2);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part.MumlDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CoordinationProtocol_3005(
			de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlOCLFactory
					.getExpression(
							12,
							de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
									.getCoordinationProtocol(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part.MumlDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Role_3006(
			de.uni_paderborn.fujaba.muml.protocol.Role instance) {
		try {
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlOCLFactory
					.getExpression(
							7,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_0_0);

			value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlOCLFactory
					.getExpression(
							8,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

			Object value_1 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlOCLFactory
					.getExpression(
							13,
							de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
									.getRole(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part.MumlDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_RoleConnector_4006(
			de.uni_paderborn.fujaba.muml.protocol.RoleConnector instance) {
		try {
			de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions newInstance_0_0 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createConnectorQualityOfServiceAssumptions();
			instance.setConnectorQualityOfServiceAssumptions(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.expressions.MumlOCLFactory
					.getExpression(
							9,
							de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
									.getConnectorQualityOfServiceAssumptions(),
							null).evaluate(newInstance_0_0);
			newInstance_0_0.setComment((String) value_0_0_0);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part.MumlDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part.MumlDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part.MumlDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
