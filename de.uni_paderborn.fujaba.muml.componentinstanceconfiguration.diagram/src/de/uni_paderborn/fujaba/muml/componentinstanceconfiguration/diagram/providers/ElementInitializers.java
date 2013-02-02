package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers;

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
	public void init_HybridPortInstance_2021(
			de.uni_paderborn.fujaba.muml.instance.HybridPortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getHybridPortInstance(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DiscreteSinglePortInstance_2022(
			de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							3,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DiscreteMultiPortInstance_2023(
			de.uni_paderborn.fujaba.muml.instance.DiscreteMultiPortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							5,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getDiscreteMultiPortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ContinuousPortInstance_2024(
			de.uni_paderborn.fujaba.muml.instance.ContinuousPortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							9,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getContinuousPortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AtomicComponentInstance_2016(
			de.uni_paderborn.fujaba.muml.instance.AtomicComponentInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							11,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getAtomicComponentInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StructuredComponentInstance_2015(
			de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							13,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getStructuredComponentInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
			de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration newInstance_1_0 = de.uni_paderborn.fujaba.muml.instance.InstanceFactory.eINSTANCE
					.createComponentInstanceConfiguration();
			instance.setEmbeddedCIC(newInstance_1_0);
			Object value_1_0_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							14,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getComponentInstanceConfiguration(), null)
					.evaluate(newInstance_1_0);
			newInstance_1_0.setName((String) value_1_0_0);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DiscreteSinglePortInstance_3026(
			de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							6,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
			Object value_1 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							7,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setComponentInstance((de.uni_paderborn.fujaba.muml.instance.ComponentInstance) value_1);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_HybridPortInstance_3031(
			de.uni_paderborn.fujaba.muml.instance.HybridPortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getHybridPortInstance(), null).evaluate(
							instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DiscreteSinglePortInstance_3032(
			de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							3,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DiscreteMultiPortInstance_3033(
			de.uni_paderborn.fujaba.muml.instance.DiscreteMultiPortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							5,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getDiscreteMultiPortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ContinuousPortInstance_3034(
			de.uni_paderborn.fujaba.muml.instance.ContinuousPortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							9,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getContinuousPortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AtomicComponentInstance_3024(
			de.uni_paderborn.fujaba.muml.instance.AtomicComponentInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							11,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getAtomicComponentInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StructuredComponentInstance_3025(
			de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							13,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getStructuredComponentInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
			de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration newInstance_1_0 = de.uni_paderborn.fujaba.muml.instance.InstanceFactory.eINSTANCE
					.createComponentInstanceConfiguration();
			instance.setEmbeddedCIC(newInstance_1_0);
			Object value_1_0_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							14,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getComponentInstanceConfiguration(), null)
					.evaluate(newInstance_1_0);
			newInstance_1_0.setName((String) value_1_0_0);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
