/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern.impl;

import de.uni_paderborn.fujaba.muml.componentstorypattern.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentPartVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternFactory;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentPartVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentstorypatternFactoryImpl extends EFactoryImpl implements ComponentstorypatternFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentstorypatternFactory init() {
		try {
			ComponentstorypatternFactory theComponentstorypatternFactory = (ComponentstorypatternFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentstorypatternPackage.eNS_URI);
			if (theComponentstorypatternFactory != null) {
				return theComponentstorypatternFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentstorypatternFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentstorypatternFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN: return createComponentStoryPattern();
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE: return createComponentStoryPatternVariable();
			case ComponentstorypatternPackage.COMPONENT_VARIABLE: return createComponentVariable();
			case ComponentstorypatternPackage.ASSEMBLY_VARIABLE: return createAssemblyVariable();
			case ComponentstorypatternPackage.DELEGATION_VARIABLE: return createDelegationVariable();
			case ComponentstorypatternPackage.SINGLE_PORT_VARIABLE: return createSinglePortVariable();
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE: return createMultiPortVariable();
			case ComponentstorypatternPackage.FADING_COMPONENT_PART_VARIABLE: return createFadingComponentPartVariable();
			case ComponentstorypatternPackage.COMPONENT_PART_VARIABLE: return createComponentPartVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStoryPattern createComponentStoryPattern() {
		ComponentStoryPatternImpl componentStoryPattern = new ComponentStoryPatternImpl();
		return componentStoryPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStoryPatternVariable createComponentStoryPatternVariable() {
		ComponentStoryPatternVariableImpl componentStoryPatternVariable = new ComponentStoryPatternVariableImpl();
		return componentStoryPatternVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentVariable createComponentVariable() {
		ComponentVariableImpl componentVariable = new ComponentVariableImpl();
		return componentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyVariable createAssemblyVariable() {
		AssemblyVariableImpl assemblyVariable = new AssemblyVariableImpl();
		return assemblyVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationVariable createDelegationVariable() {
		DelegationVariableImpl delegationVariable = new DelegationVariableImpl();
		return delegationVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinglePortVariable createSinglePortVariable() {
		SinglePortVariableImpl singlePortVariable = new SinglePortVariableImpl();
		return singlePortVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPortVariable createMultiPortVariable() {
		MultiPortVariableImpl multiPortVariable = new MultiPortVariableImpl();
		return multiPortVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadingComponentPartVariable createFadingComponentPartVariable() {
		FadingComponentPartVariableImpl fadingComponentPartVariable = new FadingComponentPartVariableImpl();
		return fadingComponentPartVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPartVariable createComponentPartVariable() {
		ComponentPartVariableImpl componentPartVariable = new ComponentPartVariableImpl();
		return componentPartVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentstorypatternPackage getComponentstorypatternPackage() {
		return (ComponentstorypatternPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentstorypatternPackage getPackage() {
		return ComponentstorypatternPackage.eINSTANCE;
	}

} //ComponentstorypatternFactoryImpl
