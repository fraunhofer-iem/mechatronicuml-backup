package de.uni_paderborn.fujaba.muml.component.diagram.providers;

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
	public void init_StaticAtomicComponent_2006(
			de.uni_paderborn.fujaba.muml.component.StaticAtomicComponent instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlOCLFactory
					.getExpression(
							11,
							de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
									.getStaticAtomicComponent(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StaticStructuredComponent_2005(
			de.uni_paderborn.fujaba.muml.component.StaticStructuredComponent instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlOCLFactory
					.getExpression(
							12,
							de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
									.getStaticStructuredComponent(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DiscretePort_3010(
			de.uni_paderborn.fujaba.muml.component.DiscretePort instance) {
		try {
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_0_0);

			value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

			Object value_1 = de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlOCLFactory
					.getExpression(
							13,
							de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
									.getDiscretePort(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ContinuousPort_3011(
			de.uni_paderborn.fujaba.muml.component.ContinuousPort instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlOCLFactory
					.getExpression(
							14,
							de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
									.getContinuousPort(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_HybridPort_3013(
			de.uni_paderborn.fujaba.muml.component.HybridPort instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlOCLFactory
					.getExpression(
							15,
							de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
									.getHybridPort(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ComponentPart_3012(
			de.uni_paderborn.fujaba.muml.component.ComponentPart instance) {
		try {
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlOCLFactory
					.getExpression(
							3,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_0_0);

			value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlOCLFactory
					.getExpression(
							4,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

			Object value_1 = de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlOCLFactory
					.getExpression(
							16,
							de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
									.getComponentPart(), null).evaluate(
							instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
