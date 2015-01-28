package de.uni_paderborn.fujaba.muml.pattern.diagram.providers;

import java.util.Collection;

import org.eclipse.emf.ecore.EcorePackage;

import pattern.CoordinationPattern;

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
	public void init_CoordinationPattern_2001(CoordinationPattern instance) {
		try {
			de.uni_paderborn.fujaba.muml.protocol.Role newInstance_0_0 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createRole();
			instance.getRoles().add(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternOCLFactory
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
			Object value_0_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_1_0_0_0);

			value_0_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternAbstractExpression
					.performCast(value_0_0_1_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0_0_0.setValue(((Long) value_0_0_1_0_0_0_0)
					.longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0_1_0.setUpperBound(newInstance_0_0_1_0_1_0);
			Object value_0_0_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternOCLFactory
					.getExpression(
							2,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_1_0_1_0);

			value_0_0_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternAbstractExpression
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
			Object value_0_1_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternOCLFactory
					.getExpression(
							3,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_1_0_0_0_0);

			value_0_1_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternAbstractExpression
					.performCast(value_0_1_0_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_1_0_0_0_0.setValue(((Long) value_0_1_0_0_0_0_0)
					.longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_1_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_1_0_0.setUpperBound(newInstance_0_1_0_0_1_0);
			Object value_0_1_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternOCLFactory
					.getExpression(
							4,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_1_0_0_1_0);

			value_0_1_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternAbstractExpression
					.performCast(value_0_1_0_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_1_0_0_1_0.setValue(((Long) value_0_1_0_0_1_0_0)
					.longValue());

			de.uni_paderborn.fujaba.muml.protocol.RoleConnector newInstance_1_0 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createRoleConnector();
			instance.setRoleConnector(newInstance_1_0);
			Object value_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternOCLFactory
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
			Object value_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternOCLFactory
					.getExpression(
							6,
							de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
									.getConnectorQualityOfServiceAssumptions(),
							null).evaluate(newInstance_1_0_1_0);
			newInstance_1_0_1_0.setComment((String) value_1_0_1_0_0);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Role_3002(
			de.uni_paderborn.fujaba.muml.protocol.Role instance) {
		try {
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternOCLFactory
					.getExpression(
							7,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_0_0);

			value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternAbstractExpression
					.performCast(value_0_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternOCLFactory
					.getExpression(
							8,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternAbstractExpression
					.performCast(value_0_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_RoleConnector_4001(
			de.uni_paderborn.fujaba.muml.protocol.RoleConnector instance) {
		try {
			de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions newInstance_0_0 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createConnectorQualityOfServiceAssumptions();
			instance.setConnectorQualityOfServiceAssumptions(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.PatternOCLFactory
					.getExpression(
							15,
							de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
									.getConnectorQualityOfServiceAssumptions(),
							null).evaluate(newInstance_0_0);
			newInstance_0_0.setComment((String) value_0_0_0);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.PatternDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
