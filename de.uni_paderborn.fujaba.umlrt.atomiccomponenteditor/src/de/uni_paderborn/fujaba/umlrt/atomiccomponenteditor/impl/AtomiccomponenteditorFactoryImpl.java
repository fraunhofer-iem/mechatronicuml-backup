/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.impl;

import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomiccomponenteditorFactoryImpl extends EFactoryImpl implements AtomiccomponenteditorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AtomiccomponenteditorFactory init() {
		try {
			AtomiccomponenteditorFactory theAtomiccomponenteditorFactory = (AtomiccomponenteditorFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/uni_paderborn/fujaba/umlrt/atomiccomponenteditor"); 
			if (theAtomiccomponenteditorFactory != null) {
				return theAtomiccomponenteditorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AtomiccomponenteditorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomiccomponenteditorFactoryImpl() {
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
			case AtomiccomponenteditorPackage.ATOMIC_COMPONENT_DIAGRAM: return createAtomicComponentDiagram();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicComponentDiagram createAtomicComponentDiagram() {
		AtomicComponentDiagramImpl atomicComponentDiagram = new AtomicComponentDiagramImpl();
		return atomicComponentDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomiccomponenteditorPackage getAtomiccomponenteditorPackage() {
		return (AtomiccomponenteditorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AtomiccomponenteditorPackage getPackage() {
		return AtomiccomponenteditorPackage.eINSTANCE;
	}

} //AtomiccomponenteditorFactoryImpl
