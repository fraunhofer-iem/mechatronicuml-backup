/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.impl;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.StructuredComponentDiagram;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.StructuredcomponenteditorFactory;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.StructuredcomponenteditorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredcomponenteditorFactoryImpl extends EFactoryImpl implements StructuredcomponenteditorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructuredcomponenteditorFactory init() {
		try {
			StructuredcomponenteditorFactory theStructuredcomponenteditorFactory = (StructuredcomponenteditorFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/uni_paderborn/fujaba/umlrt/structuredcomponenteditor"); 
			if (theStructuredcomponenteditorFactory != null) {
				return theStructuredcomponenteditorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructuredcomponenteditorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredcomponenteditorFactoryImpl() {
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
			case StructuredcomponenteditorPackage.STRUCTURED_COMPONENT_DIAGRAM: return createStructuredComponentDiagram();
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
	public StructuredcomponenteditorPackage getStructuredcomponenteditorPackage() {
		return (StructuredcomponenteditorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructuredcomponenteditorPackage getPackage() {
		return StructuredcomponenteditorPackage.eINSTANCE;
	}

} //StructuredcomponenteditorFactoryImpl
