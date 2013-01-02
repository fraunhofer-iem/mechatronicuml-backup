package de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers;

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
			de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage.eINSTANCE
									.getCoordinationProtocol(), null).evaluate(
							instance);
			instance.setName((String) value_0);
			de.uni_paderborn.fujaba.muml.model.protocol.Role newInstance_1_0 = de.uni_paderborn.fujaba.muml.model.protocol.ProtocolFactory.eINSTANCE
					.createRole();
			instance.getRoles().add(newInstance_1_0);
			Object value_1_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage.eINSTANCE
									.getRole(), null).evaluate(newInstance_1_0);
			newInstance_1_0.setName((String) value_1_0_0);
			de.uni_paderborn.fujaba.muml.model.valuetype.Range newInstance_1_0_1_0 = de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypeFactory.eINSTANCE
					.createRange();
			newInstance_1_0.setCardinality(newInstance_1_0_1_0);
			de.uni_paderborn.fujaba.muml.model.valuetype.NaturalNumber newInstance_1_0_1_0_0_0 = de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_0_1_0.setLowerBound(newInstance_1_0_1_0_0_0);
			Object value_1_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							2,
							de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_1_0_1_0_0_0);

			value_1_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_1_0_1_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_1_0_1_0_0_0.setValue(((Long) value_1_0_1_0_0_0_0)
					.longValue());

			de.uni_paderborn.fujaba.muml.model.valuetype.NaturalNumber newInstance_1_0_1_0_1_0 = de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_0_1_0.setUpperBound(newInstance_1_0_1_0_1_0);
			Object value_1_0_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							3,
							de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_1_0_1_0_1_0);

			value_1_0_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_1_0_1_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_1_0_1_0_1_0.setValue(((Long) value_1_0_1_0_1_0_0)
					.longValue());

			de.uni_paderborn.fujaba.muml.model.protocol.Role newInstance_1_1 = de.uni_paderborn.fujaba.muml.model.protocol.ProtocolFactory.eINSTANCE
					.createRole();
			instance.getRoles().add(newInstance_1_1);
			Object value_1_1_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							4,
							de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage.eINSTANCE
									.getRole(), null).evaluate(newInstance_1_1);
			newInstance_1_1.setName((String) value_1_1_0);
			de.uni_paderborn.fujaba.muml.model.valuetype.Range newInstance_1_1_1_0 = de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypeFactory.eINSTANCE
					.createRange();
			newInstance_1_1.setCardinality(newInstance_1_1_1_0);
			de.uni_paderborn.fujaba.muml.model.valuetype.NaturalNumber newInstance_1_1_1_0_0_0 = de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_1_1_0.setLowerBound(newInstance_1_1_1_0_0_0);
			Object value_1_1_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							5,
							de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_1_1_1_0_0_0);

			value_1_1_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_1_1_1_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_1_1_1_0_0_0.setValue(((Long) value_1_1_1_0_0_0_0)
					.longValue());

			de.uni_paderborn.fujaba.muml.model.valuetype.NaturalNumber newInstance_1_1_1_0_1_0 = de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_1_1_0.setUpperBound(newInstance_1_1_1_0_1_0);
			Object value_1_1_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							6,
							de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_1_1_1_0_1_0);

			value_1_1_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_1_1_1_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_1_1_1_0_1_0.setValue(((Long) value_1_1_1_0_1_0_0)
					.longValue());

			de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector newInstance_2_0 = de.uni_paderborn.fujaba.muml.model.protocol.ProtocolFactory.eINSTANCE
					.createRoleConnector();
			instance.setRoleConnector(newInstance_2_0);
			Object value_2_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							7,
							de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage.eINSTANCE
									.getRoleConnector(), null).evaluate(
							newInstance_2_0);
			if (value_2_0_0 instanceof Collection) {
				newInstance_2_0.getConnectorEndpoints().clear();
				newInstance_2_0.getConnectorEndpoints().addAll(
						((Collection) value_2_0_0));
			} else {
				newInstance_2_0
						.getConnectorEndpoints()
						.add((de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint) value_2_0_0);
			}
			de.uni_paderborn.fujaba.muml.model.protocol.ConnectorQualityOfServiceAssumptions newInstance_2_0_1_0 = de.uni_paderborn.fujaba.muml.model.protocol.ProtocolFactory.eINSTANCE
					.createConnectorQualityOfServiceAssumptions();
			newInstance_2_0
					.setConnectorQualityOfServiceAssumptions(newInstance_2_0_1_0);
			Object value_2_0_1_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							8,
							de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage.eINSTANCE
									.getConnectorQualityOfServiceAssumptions(),
							null).evaluate(newInstance_2_0_1_0);
			newInstance_2_0_1_0.setComment((String) value_2_0_1_0_0);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Role_3005(
			de.uni_paderborn.fujaba.muml.model.protocol.Role instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							9,
							de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage.eINSTANCE
									.getRole(), null).evaluate(instance);
			instance.setName((String) value_0);
			de.uni_paderborn.fujaba.muml.model.valuetype.Range newInstance_1_0 = de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypeFactory.eINSTANCE
					.createRange();
			instance.setCardinality(newInstance_1_0);
			de.uni_paderborn.fujaba.muml.model.valuetype.NaturalNumber newInstance_1_0_0_0 = de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_0.setLowerBound(newInstance_1_0_0_0);
			Object value_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							10,
							de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_1_0_0_0);

			value_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_1_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_1_0_0_0.setValue(((Long) value_1_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.model.valuetype.NaturalNumber newInstance_1_0_1_0 = de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_0.setUpperBound(newInstance_1_0_1_0);
			Object value_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							11,
							de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_1_0_1_0);

			value_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_1_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_1_0_1_0.setValue(((Long) value_1_0_1_0_0).longValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_RoleConnector_4005(
			de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector instance) {
		try {
			de.uni_paderborn.fujaba.muml.model.protocol.ConnectorQualityOfServiceAssumptions newInstance_0_0 = de.uni_paderborn.fujaba.muml.model.protocol.ProtocolFactory.eINSTANCE
					.createConnectorQualityOfServiceAssumptions();
			instance.setConnectorQualityOfServiceAssumptions(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							12,
							de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage.eINSTANCE
									.getConnectorQualityOfServiceAssumptions(),
							null).evaluate(newInstance_0_0);
			newInstance_0_0.setComment((String) value_0_0_0);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
