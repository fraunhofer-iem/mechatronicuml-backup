/**
 */
package org.muml.modelica.transform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.modelica.transform.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformFactoryImpl extends EFactoryImpl implements TransformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransformFactory init() {
		try {
			TransformFactory theTransformFactory = (TransformFactory)EPackage.Registry.INSTANCE.getEFactory(TransformPackage.eNS_URI);
			if (theTransformFactory != null) {
				return theTransformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TransformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformFactoryImpl() {
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
			case TransformPackage.MAP: return createMap();
			case TransformPackage.ROOT: return createRoot();
			case TransformPackage.ENTRY: return createEntry();
			case TransformPackage.REGION_INSTANCE: return createRegionInstance();
			case TransformPackage.TRANSFORMATION_ROOT_OBJECT: return createTransformationRootObject();
			case TransformPackage.REALTIME_STATECHART_TRANSFORMATION_ROOT_OBJECT: return createRealtimeStatechartTransformationRootObject();
			case TransformPackage.POSITION_EXTENSION: return createPositionExtension();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionInstance createRegionInstance() {
		RegionInstanceImpl regionInstance = new RegionInstanceImpl();
		return regionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> TransformationRootObject<T> createTransformationRootObject() {
		TransformationRootObjectImpl<T> transformationRootObject = new TransformationRootObjectImpl<T>();
		return transformationRootObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechartTransformationRootObject createRealtimeStatechartTransformationRootObject() {
		RealtimeStatechartTransformationRootObjectImpl realtimeStatechartTransformationRootObject = new RealtimeStatechartTransformationRootObjectImpl();
		return realtimeStatechartTransformationRootObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionExtension createPositionExtension() {
		PositionExtensionImpl positionExtension = new PositionExtensionImpl();
		return positionExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformPackage getTransformPackage() {
		return (TransformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TransformPackage getPackage() {
		return TransformPackage.eINSTANCE;
	}

} //TransformFactoryImpl
