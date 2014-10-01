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
							12,
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
							13,
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
							14,
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
							15,
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
							16,
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
			de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration newInstance_0_0 = de.uni_paderborn.fujaba.muml.instance.InstanceFactory.eINSTANCE
					.createComponentInstanceConfiguration();
			instance.setEmbeddedCIC(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							7,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getComponentInstanceConfiguration(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

			Object value_1 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							17,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getStructuredComponentInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CoordinationProtocolInstance_2025(
			de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							18,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getCoordinationProtocolInstance(), null)
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
	public void init_DiscreteSinglePortInstance_3026(
			de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							3,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setComponentInstance((de.uni_paderborn.fujaba.muml.instance.ComponentInstance) value_0);
			Object value_1 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							19,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
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
							20,
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
							21,
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
							22,
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
							23,
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
	public void init_ComponentInstanceConfiguration_3023(
			de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							24,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getComponentInstanceConfiguration(), null)
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
							25,
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
			de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration newInstance_0_0 = de.uni_paderborn.fujaba.muml.instance.InstanceFactory.eINSTANCE
					.createComponentInstanceConfiguration();
			instance.setEmbeddedCIC(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							7,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getComponentInstanceConfiguration(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

			Object value_1 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							26,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getStructuredComponentInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CoordinationProtocolInstance_3035(
			de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(
							27,
							de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
									.getCoordinationProtocolInstance(), null)
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
