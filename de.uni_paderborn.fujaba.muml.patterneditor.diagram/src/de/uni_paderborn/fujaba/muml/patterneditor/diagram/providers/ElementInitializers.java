package de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers;

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
	public void init_CoordinationPattern_2005(
			de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage.eINSTANCE
									.getCoordinationPattern(), null).evaluate(
							instance);
			instance.setName((String) value_0);
			de.uni_paderborn.fujaba.muml.model.pattern.Role newInstance_1_0 = de.uni_paderborn.fujaba.muml.model.pattern.PatternFactory.eINSTANCE
					.createRole();
			instance.getRoles().add(newInstance_1_0);
			Object value_1_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage.eINSTANCE
									.getRole(), null).evaluate(newInstance_1_0);
			newInstance_1_0.setName((String) value_1_0_0);
			de.uni_paderborn.fujaba.muml.model.core.Cardinality newInstance_1_0_1_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createCardinality();
			newInstance_1_0.setCardinality(newInstance_1_0_1_0);
			de.uni_paderborn.fujaba.muml.model.core.NaturalNumber newInstance_1_0_1_0_0_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_0_1_0.setLowerBound(newInstance_1_0_1_0_0_0);
			Object value_1_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							2,
							de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_1_0_1_0_0_0);

			value_1_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_1_0_1_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_1_0_1_0_0_0.setValue(((Long) value_1_0_1_0_0_0_0)
					.longValue());

			de.uni_paderborn.fujaba.muml.model.core.NaturalNumber newInstance_1_0_1_0_1_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_0_1_0.setUpperBound(newInstance_1_0_1_0_1_0);
			Object value_1_0_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							3,
							de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_1_0_1_0_1_0);

			value_1_0_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_1_0_1_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_1_0_1_0_1_0.setValue(((Long) value_1_0_1_0_1_0_0)
					.longValue());

			Object value_1_0_2 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							4,
							de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage.eINSTANCE
									.getRole(), null).evaluate(newInstance_1_0);
			newInstance_1_0
					.setOutgoingRoleConnector((de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector) value_1_0_2);

			de.uni_paderborn.fujaba.muml.model.pattern.Role newInstance_1_1 = de.uni_paderborn.fujaba.muml.model.pattern.PatternFactory.eINSTANCE
					.createRole();
			instance.getRoles().add(newInstance_1_1);
			Object value_1_1_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							5,
							de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage.eINSTANCE
									.getRole(), null).evaluate(newInstance_1_1);
			newInstance_1_1.setName((String) value_1_1_0);
			de.uni_paderborn.fujaba.muml.model.core.Cardinality newInstance_1_1_1_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createCardinality();
			newInstance_1_1.setCardinality(newInstance_1_1_1_0);
			de.uni_paderborn.fujaba.muml.model.core.NaturalNumber newInstance_1_1_1_0_0_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_1_1_0.setLowerBound(newInstance_1_1_1_0_0_0);
			Object value_1_1_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							6,
							de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_1_1_1_0_0_0);

			value_1_1_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_1_1_1_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_1_1_1_0_0_0.setValue(((Long) value_1_1_1_0_0_0_0)
					.longValue());

			de.uni_paderborn.fujaba.muml.model.core.NaturalNumber newInstance_1_1_1_0_1_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_1_1_0.setUpperBound(newInstance_1_1_1_0_1_0);
			Object value_1_1_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							7,
							de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_1_1_1_0_1_0);

			value_1_1_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_1_1_1_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_1_1_1_0_1_0.setValue(((Long) value_1_1_1_0_1_0_0)
					.longValue());

			Object value_1_1_2 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							8,
							de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage.eINSTANCE
									.getRole(), null).evaluate(newInstance_1_1);
			newInstance_1_1
					.setIncomingRoleConnector((de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector) value_1_1_2);

			de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector newInstance_2_0 = de.uni_paderborn.fujaba.muml.model.pattern.PatternFactory.eINSTANCE
					.createRoleConnector();
			instance.setConnector(newInstance_2_0);
			Object value_2_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							9,
							de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage.eINSTANCE
									.getRoleConnector(), null).evaluate(
							newInstance_2_0);
			newInstance_2_0
					.setSource((de.uni_paderborn.fujaba.muml.model.pattern.Role) value_2_0_0);
			Object value_2_0_1 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							10,
							de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage.eINSTANCE
									.getRoleConnector(), null).evaluate(
							newInstance_2_0);
			newInstance_2_0
					.setTarget((de.uni_paderborn.fujaba.muml.model.pattern.Role) value_2_0_1);
			de.uni_paderborn.fujaba.muml.model.pattern.ConnectorQualityOfServiceAssumptions newInstance_2_0_2_0 = de.uni_paderborn.fujaba.muml.model.pattern.PatternFactory.eINSTANCE
					.createConnectorQualityOfServiceAssumptions();
			newInstance_2_0
					.setConnectorQualityOfServiceAssumptions(newInstance_2_0_2_0);
			Object value_2_0_2_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							11,
							de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage.eINSTANCE
									.getConnectorQualityOfServiceAssumptions(),
							null).evaluate(newInstance_2_0_2_0);
			newInstance_2_0_2_0.setName((String) value_2_0_2_0_0);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Role_3006(
			de.uni_paderborn.fujaba.muml.model.pattern.Role instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							12,
							de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage.eINSTANCE
									.getRole(), null).evaluate(instance);
			instance.setName((String) value_0);
			de.uni_paderborn.fujaba.muml.model.core.Cardinality newInstance_1_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_1_0);
			de.uni_paderborn.fujaba.muml.model.core.NaturalNumber newInstance_1_0_0_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_0.setLowerBound(newInstance_1_0_0_0);
			Object value_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							13,
							de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_1_0_0_0);

			value_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_1_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_1_0_0_0.setValue(((Long) value_1_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.model.core.NaturalNumber newInstance_1_0_1_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_1_0.setUpperBound(newInstance_1_0_1_0);
			Object value_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							14,
							de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
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
	public void init_RoleConnector_4006(
			de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector instance) {
		try {
			de.uni_paderborn.fujaba.muml.model.pattern.ConnectorQualityOfServiceAssumptions newInstance_0_0 = de.uni_paderborn.fujaba.muml.model.pattern.PatternFactory.eINSTANCE
					.createConnectorQualityOfServiceAssumptions();
			instance.setConnectorQualityOfServiceAssumptions(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.patterneditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							15,
							de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage.eINSTANCE
									.getConnectorQualityOfServiceAssumptions(),
							null).evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

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
