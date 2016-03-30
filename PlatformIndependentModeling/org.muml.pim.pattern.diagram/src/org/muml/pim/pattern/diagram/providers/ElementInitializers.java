package org.muml.pim.pattern.diagram.providers;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EcorePackage;
import org.muml.core.expressions.common.CommonExpressionsFactory;
import org.muml.core.expressions.common.CommonExpressionsPackage;
import org.muml.core.expressions.common.LiteralExpression;

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
	public void init_CoordinationPattern_2001(org.muml.pim.pattern.CoordinationPattern instance) {
		try {
			org.muml.pim.protocol.Role newInstance_0_0 = org.muml.pim.protocol.ProtocolFactory.eINSTANCE
					.createRole();
			instance.getRoles().add(newInstance_0_0);
			Object value_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(0, org.muml.pim.protocol.ProtocolPackage.eINSTANCE.getRole(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			org.muml.pim.valuetype.Cardinality newInstance_0_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			newInstance_0_0.setCardinality(newInstance_0_0_1_0);
			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_1_0_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0_1_0.setLowerBound(newInstance_0_0_1_0_0_0);
			Object value_0_0_1_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(1,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0_0_0);

			value_0_0_1_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0_0_0.setValue(((Long) value_0_0_1_0_0_0_0).longValue());

			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_1_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0_1_0.setUpperBound(newInstance_0_0_1_0_1_0);
			Object value_0_0_1_0_1_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(2,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0_1_0);

			value_0_0_1_0_1_0_0 = org.muml.pim.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0_1_0.setValue(((Long) value_0_0_1_0_1_0_0).longValue());

			org.muml.pim.protocol.Role newInstance_0_1 = org.muml.pim.protocol.ProtocolFactory.eINSTANCE
					.createRole();
			instance.getRoles().add(newInstance_0_1);
			Object value_0_1_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(3, org.muml.pim.protocol.ProtocolPackage.eINSTANCE.getRole(), null)
					.evaluate(newInstance_0_1);
			newInstance_0_1.setName((String) value_0_1_0);
			org.muml.pim.valuetype.Cardinality newInstance_0_1_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			newInstance_0_1.setCardinality(newInstance_0_1_1_0);
			org.muml.pim.valuetype.NaturalNumber newInstance_0_1_1_0_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_1_1_0.setLowerBound(newInstance_0_1_1_0_0_0);
			Object value_0_1_1_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(4,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_1_1_0_0_0);

			value_0_1_1_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_1_1_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_1_1_0_0_0.setValue(((Long) value_0_1_1_0_0_0_0).longValue());

			org.muml.pim.valuetype.NaturalNumber newInstance_0_1_1_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_1_1_0.setUpperBound(newInstance_0_1_1_0_1_0);
			Object value_0_1_1_0_1_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(5,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_1_1_0_1_0);

			value_0_1_1_0_1_0_0 = org.muml.pim.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_1_1_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_1_1_0_1_0.setValue(((Long) value_0_1_1_0_1_0_0).longValue());

			org.muml.pim.protocol.RoleConnector newInstance_1_0 = org.muml.pim.protocol.ProtocolFactory.eINSTANCE
					.createRoleConnector();
			instance.setRoleConnector(newInstance_1_0);
			Object value_1_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(6,
							org.muml.pim.protocol.ProtocolPackage.eINSTANCE.getRoleConnector(), null)
					.evaluate(newInstance_1_0);
			if (value_1_0_0 instanceof Collection) {
				newInstance_1_0.getConnectorEndpoints().clear();
				newInstance_1_0.getConnectorEndpoints().addAll(((Collection) value_1_0_0));
			} else {
				newInstance_1_0.getConnectorEndpoints()
						.add((org.muml.pim.connector.ConnectorEndpoint) value_1_0_0);
			}
			org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions newInstance_1_0_1_0 = org.muml.pim.protocol.ProtocolFactory.eINSTANCE
					.createConnectorQualityOfServiceAssumptions();
			newInstance_1_0.setConnectorQualityOfServiceAssumptions(newInstance_1_0_1_0);
			Object value_1_0_1_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(7, org.muml.pim.protocol.ProtocolPackage.eINSTANCE
							.getConnectorQualityOfServiceAssumptions(), null)
					.evaluate(newInstance_1_0_1_0);
			newInstance_1_0_1_0.setComment((String) value_1_0_1_0_0);
			org.muml.pim.valuetype.TimeValue newInstance_1_0_1_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createTimeValue();
			newInstance_1_0_1_0.setMaxMessageDelay(newInstance_1_0_1_0_1_0);
			LiteralExpression newInstance_1_0_1_0_1_0_0_0 = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			newInstance_1_0_1_0_1_0.setValue(newInstance_1_0_1_0_1_0_0_0);
			Object value_1_0_1_0_1_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(8, CommonExpressionsPackage.eINSTANCE.getLiteralExpression(), null)
					.evaluate(newInstance_1_0_1_0_1_0_0_0);
			newInstance_1_0_1_0_1_0_0_0.setValue((String) value_1_0_1_0_1_0_0_0_0);

			newInstance_1_0_1_0_1_0.setUnit(TimeUnit.MILLISECONDS);

			org.muml.pim.valuetype.TimeValue newInstance_1_0_1_0_2_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createTimeValue();
			newInstance_1_0_1_0.setMinMessageDelay(newInstance_1_0_1_0_2_0);
			LiteralExpression newInstance_1_0_1_0_2_0_0_0 = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			newInstance_1_0_1_0_2_0.setValue(newInstance_1_0_1_0_2_0_0_0);
			Object value_1_0_1_0_2_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(9, CommonExpressionsPackage.eINSTANCE.getLiteralExpression(), null)
					.evaluate(newInstance_1_0_1_0_2_0_0_0);
			newInstance_1_0_1_0_2_0_0_0.setValue((String) value_1_0_1_0_2_0_0_0_0);

			newInstance_1_0_1_0_2_0.setUnit(TimeUnit.MILLISECONDS);

		} catch (RuntimeException e) {
			org.muml.pim.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_CoordinationPatternVariant_2002(
			org.muml.pim.pattern.CoordinationPatternVariant instance) {
		try {
			org.muml.pim.protocol.Role newInstance_0_0 = org.muml.pim.protocol.ProtocolFactory.eINSTANCE
					.createRole();
			instance.getRoles().add(newInstance_0_0);
			Object value_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(19, org.muml.pim.protocol.ProtocolPackage.eINSTANCE.getRole(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			org.muml.pim.valuetype.Cardinality newInstance_0_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			newInstance_0_0.setCardinality(newInstance_0_0_1_0);
			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_1_0_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0_1_0.setLowerBound(newInstance_0_0_1_0_0_0);
			Object value_0_0_1_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(20,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0_0_0);

			value_0_0_1_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0_0_0.setValue(((Long) value_0_0_1_0_0_0_0).longValue());

			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_1_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0_1_0.setUpperBound(newInstance_0_0_1_0_1_0);
			Object value_0_0_1_0_1_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(21,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0_1_0);

			value_0_0_1_0_1_0_0 = org.muml.pim.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0_1_0.setValue(((Long) value_0_0_1_0_1_0_0).longValue());

			org.muml.pim.protocol.Role newInstance_0_1 = org.muml.pim.protocol.ProtocolFactory.eINSTANCE
					.createRole();
			instance.getRoles().add(newInstance_0_1);
			Object value_0_1_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(22, org.muml.pim.protocol.ProtocolPackage.eINSTANCE.getRole(), null)
					.evaluate(newInstance_0_1);
			newInstance_0_1.setName((String) value_0_1_0);
			org.muml.pim.valuetype.Cardinality newInstance_0_1_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			newInstance_0_1.setCardinality(newInstance_0_1_1_0);
			org.muml.pim.valuetype.NaturalNumber newInstance_0_1_1_0_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_1_1_0.setLowerBound(newInstance_0_1_1_0_0_0);
			Object value_0_1_1_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(23,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_1_1_0_0_0);

			value_0_1_1_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_1_1_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_1_1_0_0_0.setValue(((Long) value_0_1_1_0_0_0_0).longValue());

			org.muml.pim.valuetype.NaturalNumber newInstance_0_1_1_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_1_1_0.setUpperBound(newInstance_0_1_1_0_1_0);
			Object value_0_1_1_0_1_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(24,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_1_1_0_1_0);

			value_0_1_1_0_1_0_0 = org.muml.pim.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_1_1_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_1_1_0_1_0.setValue(((Long) value_0_1_1_0_1_0_0).longValue());

			org.muml.pim.protocol.RoleConnector newInstance_1_0 = org.muml.pim.protocol.ProtocolFactory.eINSTANCE
					.createRoleConnector();
			instance.setRoleConnector(newInstance_1_0);
			Object value_1_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(25,
							org.muml.pim.protocol.ProtocolPackage.eINSTANCE.getRoleConnector(), null)
					.evaluate(newInstance_1_0);
			if (value_1_0_0 instanceof Collection) {
				newInstance_1_0.getConnectorEndpoints().clear();
				newInstance_1_0.getConnectorEndpoints().addAll(((Collection) value_1_0_0));
			} else {
				newInstance_1_0.getConnectorEndpoints()
						.add((org.muml.pim.connector.ConnectorEndpoint) value_1_0_0);
			}
			org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions newInstance_1_0_1_0 = org.muml.pim.protocol.ProtocolFactory.eINSTANCE
					.createConnectorQualityOfServiceAssumptions();
			newInstance_1_0.setConnectorQualityOfServiceAssumptions(newInstance_1_0_1_0);
			Object value_1_0_1_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(26, org.muml.pim.protocol.ProtocolPackage.eINSTANCE
							.getConnectorQualityOfServiceAssumptions(), null)
					.evaluate(newInstance_1_0_1_0);
			newInstance_1_0_1_0.setComment((String) value_1_0_1_0_0);
			org.muml.pim.valuetype.TimeValue newInstance_1_0_1_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createTimeValue();
			newInstance_1_0_1_0.setMaxMessageDelay(newInstance_1_0_1_0_1_0);
			LiteralExpression newInstance_1_0_1_0_1_0_0_0 = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			newInstance_1_0_1_0_1_0.setValue(newInstance_1_0_1_0_1_0_0_0);
			Object value_1_0_1_0_1_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(27, CommonExpressionsPackage.eINSTANCE.getLiteralExpression(), null)
					.evaluate(newInstance_1_0_1_0_1_0_0_0);
			newInstance_1_0_1_0_1_0_0_0.setValue((String) value_1_0_1_0_1_0_0_0_0);

			newInstance_1_0_1_0_1_0.setUnit(TimeUnit.MILLISECONDS);

			org.muml.pim.valuetype.TimeValue newInstance_1_0_1_0_2_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createTimeValue();
			newInstance_1_0_1_0.setMinMessageDelay(newInstance_1_0_1_0_2_0);
			LiteralExpression newInstance_1_0_1_0_2_0_0_0 = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			newInstance_1_0_1_0_2_0.setValue(newInstance_1_0_1_0_2_0_0_0);
			Object value_1_0_1_0_2_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(28, CommonExpressionsPackage.eINSTANCE.getLiteralExpression(), null)
					.evaluate(newInstance_1_0_1_0_2_0_0_0);
			newInstance_1_0_1_0_2_0_0_0.setValue((String) value_1_0_1_0_2_0_0_0_0);

			newInstance_1_0_1_0_2_0.setUnit(TimeUnit.MILLISECONDS);

		} catch (RuntimeException e) {
			org.muml.pim.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Role_3002(org.muml.pim.protocol.Role instance) {
		try {
			org.muml.pim.valuetype.Cardinality newInstance_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(10,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_0_0);

			value_0_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(11,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_0 = org.muml.pim.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

		} catch (RuntimeException e) {
			org.muml.pim.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_RoleConnector_4001(org.muml.pim.protocol.RoleConnector instance) {
		try {
			org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions newInstance_0_0 = org.muml.pim.protocol.ProtocolFactory.eINSTANCE
					.createConnectorQualityOfServiceAssumptions();
			instance.setConnectorQualityOfServiceAssumptions(newInstance_0_0);
			Object value_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(29, org.muml.pim.protocol.ProtocolPackage.eINSTANCE
							.getConnectorQualityOfServiceAssumptions(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setComment((String) value_0_0_0);
			org.muml.pim.valuetype.TimeValue newInstance_0_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createTimeValue();
			newInstance_0_0.setMaxMessageDelay(newInstance_0_0_1_0);
			LiteralExpression newInstance_0_0_1_0_0_0 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
			newInstance_0_0_1_0.setValue(newInstance_0_0_1_0_0_0);
			Object value_0_0_1_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(30, CommonExpressionsPackage.eINSTANCE.getLiteralExpression(), null)
					.evaluate(newInstance_0_0_1_0_0_0);
			newInstance_0_0_1_0_0_0.setValue((String) value_0_0_1_0_0_0_0);

			newInstance_0_0_1_0.setUnit(TimeUnit.MILLISECONDS);

			org.muml.pim.valuetype.TimeValue newInstance_0_0_2_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createTimeValue();
			newInstance_0_0.setMinMessageDelay(newInstance_0_0_2_0);
			LiteralExpression newInstance_0_0_2_0_0_0 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
			newInstance_0_0_2_0.setValue(newInstance_0_0_2_0_0_0);
			Object value_0_0_2_0_0_0_0 = org.muml.pim.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(31, CommonExpressionsPackage.eINSTANCE.getLiteralExpression(), null)
					.evaluate(newInstance_0_0_2_0_0_0);
			newInstance_0_0_2_0_0_0.setValue((String) value_0_0_2_0_0_0_0);

			newInstance_0_0_2_0.setUnit(TimeUnit.MILLISECONDS);

		} catch (RuntimeException e) {
			org.muml.pim.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = org.muml.pim.pattern.diagram.part.MumlDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			org.muml.pim.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
