package de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers;

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
	public void init_Role_2002(
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role instance) {
		try {
			de.uni_paderborn.fujaba.umlrt.model.core.Cardinality newInstance_0_0 = de.uni_paderborn.fujaba.umlrt.model.core.CoreFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber newInstance_0_0_0_0 = de.uni_paderborn.fujaba.umlrt.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.expressions.PatternOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.umlrt.model.core.CorePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_0_0);

			value_0_0_0_0_0 = de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.expressions.PatternAbstractExpression
					.performCast(value_0_0_0_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber newInstance_0_0_1_0 = de.uni_paderborn.fujaba.umlrt.model.core.CoreFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.expressions.PatternOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.umlrt.model.core.CorePackage.eINSTANCE
									.getNaturalNumber(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_0 = de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.expressions.PatternAbstractExpression
					.performCast(value_0_0_1_0_0,
							EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
