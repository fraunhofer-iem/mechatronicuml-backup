package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers;

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
	public void init_DiscretePort_3002(
			de.uni_paderborn.fujaba.muml.model.component.DiscretePort instance) {
		try {
			de.uni_paderborn.fujaba.muml.model.core.Cardinality newInstance_0_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			de.uni_paderborn.fujaba.muml.model.core.NaturalNumber newInstance_0_0_0_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_0_0);

			value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.model.core.NaturalNumber newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ContinuousPort_3003(
			de.uni_paderborn.fujaba.muml.model.component.ContinuousPort instance) {
		try {
			de.uni_paderborn.fujaba.muml.model.core.Cardinality newInstance_0_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			de.uni_paderborn.fujaba.muml.model.core.NaturalNumber newInstance_0_0_0_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							2,
							de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_0_0);

			value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.model.core.NaturalNumber newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							3,
							de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_HybridPort_3004(
			de.uni_paderborn.fujaba.muml.model.component.HybridPort instance) {
		try {
			de.uni_paderborn.fujaba.muml.model.core.Cardinality newInstance_0_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			de.uni_paderborn.fujaba.muml.model.core.NaturalNumber newInstance_0_0_0_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							4,
							de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_0_0);

			value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.model.core.NaturalNumber newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.expressions.MumlOCLFactory
					.getExpression(
							5,
							de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
