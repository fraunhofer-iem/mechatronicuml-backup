/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package structuredcomponenteditor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import structuredcomponenteditor.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponenteditorFactoryImpl extends EFactoryImpl implements ComponenteditorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponenteditorFactory init() {
		try {
			ComponenteditorFactory theComponenteditorFactory = (ComponenteditorFactory)EPackage.Registry.INSTANCE.getEFactory("http://structuredcomponenteditor"); 
			if (theComponenteditorFactory != null) {
				return theComponenteditorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponenteditorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponenteditorFactoryImpl() {
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
			case ComponenteditorPackage.STRUCTURED_COMPONENT_DIAGRAM: return createStructuredComponentDiagram();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredComponentDiagram createStructuredComponentDiagram() {
		StructuredComponentDiagramImpl structuredComponentDiagram = new StructuredComponentDiagramImpl();
		return structuredComponentDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponenteditorPackage getComponenteditorPackage() {
		return (ComponenteditorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponenteditorPackage getPackage() {
		return ComponenteditorPackage.eINSTANCE;
	}

} //ComponenteditorFactoryImpl
