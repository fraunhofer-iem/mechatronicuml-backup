package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers;

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
	public void init_Port_3004(
			de.uni_paderborn.fujaba.muml.model.component.Port instance) {
		try {
			de.uni_paderborn.fujaba.muml.model.core.Cardinality newInstance_0_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			de.uni_paderborn.fujaba.muml.model.core.NaturalNumber newInstance_0_0_0_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.expressions.MumlinstanceOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_0_0);

			value_0_0_0_0_0 = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.expressions.MumlinstanceAbstractExpression
					.performCast(value_0_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.model.core.NaturalNumber newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.expressions.MumlinstanceOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_0 = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.expressions.MumlinstanceAbstractExpression
					.performCast(value_0_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
