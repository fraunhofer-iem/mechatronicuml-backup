/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.MumlFactory;
import de.uni_paderborn.fujaba.muml.MumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MumlFactoryImpl extends EFactoryImpl implements MumlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MumlFactory init() {
		try {
			MumlFactory theMumlFactory = (MumlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/muml/0.2.2"); 
			if (theMumlFactory != null) {
				return theMumlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MumlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MumlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EObject create(EClass eClass) {
		throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MumlPackage getMumlPackage() {
		return (MumlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MumlPackage getPackage() {
		return MumlPackage.eINSTANCE;
	}

} //MumlFactoryImpl
