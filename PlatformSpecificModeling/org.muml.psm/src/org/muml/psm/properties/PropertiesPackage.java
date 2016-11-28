/**
 */
package org.muml.psm.properties;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package provides classes to annotate component with non-functional requirements.
 * <!-- end-model-doc -->
 * @see org.muml.psm.properties.PropertiesFactory
 * @model kind="package"
 * @generated
 */
public interface PropertiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "properties";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/psm/properties/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "properties";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertiesPackage eINSTANCE = org.muml.psm.properties.impl.PropertiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.psm.properties.impl.WCETImpl <em>WCET</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.properties.impl.WCETImpl
	 * @see org.muml.psm.properties.impl.PropertiesPackageImpl#getWCET()
	 * @generated
	 */
	int WCET = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET__EXTENSIONS = CorePackage.EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The feature id for the '<em><b>Wcet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET__WCET = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET__RESOURCE_INSTANCE = CorePackage.EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>WCET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___ECLASS = CorePackage.EXTENSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___EIS_PROXY = CorePackage.EXTENSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___ERESOURCE = CorePackage.EXTENSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___ECONTAINER = CorePackage.EXTENSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___ECONTAINING_FEATURE = CorePackage.EXTENSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___ECONTAINMENT_FEATURE = CorePackage.EXTENSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___ECONTENTS = CorePackage.EXTENSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___EALL_CONTENTS = CorePackage.EXTENSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___ECROSS_REFERENCES = CorePackage.EXTENSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET___GET_EXTENSION__ECLASS = CorePackage.EXTENSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>WCET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET_OPERATION_COUNT = CorePackage.EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.properties.impl.RequiredMemoryImpl <em>Required Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.properties.impl.RequiredMemoryImpl
	 * @see org.muml.psm.properties.impl.PropertiesPackageImpl#getRequiredMemory()
	 * @generated
	 */
	int REQUIRED_MEMORY = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY__EXTENSIONS = CorePackage.EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The feature id for the '<em><b>Required Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY__REQUIRED_MEMORY = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY__RESOURCE_INSTANCE = CorePackage.EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Required Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___ECLASS = CorePackage.EXTENSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___EIS_PROXY = CorePackage.EXTENSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___ERESOURCE = CorePackage.EXTENSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___ECONTAINER = CorePackage.EXTENSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___ECONTAINING_FEATURE = CorePackage.EXTENSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___ECONTAINMENT_FEATURE = CorePackage.EXTENSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___ECONTENTS = CorePackage.EXTENSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___EALL_CONTENTS = CorePackage.EXTENSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___ECROSS_REFERENCES = CorePackage.EXTENSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY___GET_EXTENSION__ECLASS = CorePackage.EXTENSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Required Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_MEMORY_OPERATION_COUNT = CorePackage.EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.properties.impl.SchedulingImpl <em>Scheduling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.properties.impl.SchedulingImpl
	 * @see org.muml.psm.properties.impl.PropertiesPackageImpl#getScheduling()
	 * @generated
	 */
	int SCHEDULING = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING__EXTENSIONS = CorePackage.EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING__DEADLINE = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING__PERIOD = CorePackage.EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING__PRIORITY = CorePackage.EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scheduling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___ECLASS = CorePackage.EXTENSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___EIS_PROXY = CorePackage.EXTENSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___ERESOURCE = CorePackage.EXTENSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___ECONTAINER = CorePackage.EXTENSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___ECONTAINING_FEATURE = CorePackage.EXTENSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___ECONTAINMENT_FEATURE = CorePackage.EXTENSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___ECONTENTS = CorePackage.EXTENSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___EALL_CONTENTS = CorePackage.EXTENSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___ECROSS_REFERENCES = CorePackage.EXTENSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING___GET_EXTENSION__ECLASS = CorePackage.EXTENSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Scheduling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_OPERATION_COUNT = CorePackage.EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.properties.impl.MessageFrameImpl <em>Message Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.properties.impl.MessageFrameImpl
	 * @see org.muml.psm.properties.impl.PropertiesPackageImpl#getMessageFrame()
	 * @generated
	 */
	int MESSAGE_FRAME = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME__EXTENSIONS = CorePackage.EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME__SIZE = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME__PERIOD = CorePackage.EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___ECLASS = CorePackage.EXTENSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___EIS_PROXY = CorePackage.EXTENSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___ERESOURCE = CorePackage.EXTENSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___ECONTAINER = CorePackage.EXTENSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___ECONTAINING_FEATURE = CorePackage.EXTENSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___ECONTAINMENT_FEATURE = CorePackage.EXTENSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___ECONTENTS = CorePackage.EXTENSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___EALL_CONTENTS = CorePackage.EXTENSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___ECROSS_REFERENCES = CorePackage.EXTENSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME___GET_EXTENSION__ECLASS = CorePackage.EXTENSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Message Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FRAME_OPERATION_COUNT = CorePackage.EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.properties.impl.CANMessageFrameImpl <em>CAN Message Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.properties.impl.CANMessageFrameImpl
	 * @see org.muml.psm.properties.impl.PropertiesPackageImpl#getCANMessageFrame()
	 * @generated
	 */
	int CAN_MESSAGE_FRAME = 4;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME__EXTENSIONS = MESSAGE_FRAME__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME__EXTENDABLE_BASE = MESSAGE_FRAME__EXTENDABLE_BASE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME__SIZE = MESSAGE_FRAME__SIZE;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME__PERIOD = MESSAGE_FRAME__PERIOD;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME__PRIORITY = MESSAGE_FRAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME__DEADLINE = MESSAGE_FRAME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CAN Message Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME_FEATURE_COUNT = MESSAGE_FRAME_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___ECLASS = MESSAGE_FRAME___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___EIS_PROXY = MESSAGE_FRAME___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___ERESOURCE = MESSAGE_FRAME___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___ECONTAINER = MESSAGE_FRAME___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___ECONTAINING_FEATURE = MESSAGE_FRAME___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___ECONTAINMENT_FEATURE = MESSAGE_FRAME___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___ECONTENTS = MESSAGE_FRAME___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___EALL_CONTENTS = MESSAGE_FRAME___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___ECROSS_REFERENCES = MESSAGE_FRAME___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___EGET__ESTRUCTURALFEATURE = MESSAGE_FRAME___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___EGET__ESTRUCTURALFEATURE_BOOLEAN = MESSAGE_FRAME___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___ESET__ESTRUCTURALFEATURE_OBJECT = MESSAGE_FRAME___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___EIS_SET__ESTRUCTURALFEATURE = MESSAGE_FRAME___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___EUNSET__ESTRUCTURALFEATURE = MESSAGE_FRAME___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___EINVOKE__EOPERATION_ELIST = MESSAGE_FRAME___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME___GET_EXTENSION__ECLASS = MESSAGE_FRAME___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>CAN Message Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MESSAGE_FRAME_OPERATION_COUNT = MESSAGE_FRAME_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.muml.psm.properties.WCET <em>WCET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WCET</em>'.
	 * @see org.muml.psm.properties.WCET
	 * @generated
	 */
	EClass getWCET();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.properties.WCET#getWcet <em>Wcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wcet</em>'.
	 * @see org.muml.psm.properties.WCET#getWcet()
	 * @see #getWCET()
	 * @generated
	 */
	EReference getWCET_Wcet();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.properties.WCET#getResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Instance</em>'.
	 * @see org.muml.psm.properties.WCET#getResourceInstance()
	 * @see #getWCET()
	 * @generated
	 */
	EReference getWCET_ResourceInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.properties.RequiredMemory <em>Required Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Memory</em>'.
	 * @see org.muml.psm.properties.RequiredMemory
	 * @generated
	 */
	EClass getRequiredMemory();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.properties.RequiredMemory#getRequiredMemory <em>Required Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Memory</em>'.
	 * @see org.muml.psm.properties.RequiredMemory#getRequiredMemory()
	 * @see #getRequiredMemory()
	 * @generated
	 */
	EReference getRequiredMemory_RequiredMemory();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.properties.RequiredMemory#getResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Instance</em>'.
	 * @see org.muml.psm.properties.RequiredMemory#getResourceInstance()
	 * @see #getRequiredMemory()
	 * @generated
	 */
	EReference getRequiredMemory_ResourceInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.properties.Scheduling <em>Scheduling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling</em>'.
	 * @see org.muml.psm.properties.Scheduling
	 * @generated
	 */
	EClass getScheduling();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.properties.Scheduling#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deadline</em>'.
	 * @see org.muml.psm.properties.Scheduling#getDeadline()
	 * @see #getScheduling()
	 * @generated
	 */
	EReference getScheduling_Deadline();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.properties.Scheduling#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.muml.psm.properties.Scheduling#getPeriod()
	 * @see #getScheduling()
	 * @generated
	 */
	EReference getScheduling_Period();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.properties.Scheduling#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority</em>'.
	 * @see org.muml.psm.properties.Scheduling#getPriority()
	 * @see #getScheduling()
	 * @generated
	 */
	EReference getScheduling_Priority();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.properties.MessageFrame <em>Message Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Frame</em>'.
	 * @see org.muml.psm.properties.MessageFrame
	 * @generated
	 */
	EClass getMessageFrame();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.properties.MessageFrame#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.muml.psm.properties.MessageFrame#getSize()
	 * @see #getMessageFrame()
	 * @generated
	 */
	EReference getMessageFrame_Size();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.properties.MessageFrame#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.muml.psm.properties.MessageFrame#getPeriod()
	 * @see #getMessageFrame()
	 * @generated
	 */
	EReference getMessageFrame_Period();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.properties.CANMessageFrame <em>CAN Message Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAN Message Frame</em>'.
	 * @see org.muml.psm.properties.CANMessageFrame
	 * @generated
	 */
	EClass getCANMessageFrame();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.properties.CANMessageFrame#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority</em>'.
	 * @see org.muml.psm.properties.CANMessageFrame#getPriority()
	 * @see #getCANMessageFrame()
	 * @generated
	 */
	EReference getCANMessageFrame_Priority();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.properties.CANMessageFrame#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deadline</em>'.
	 * @see org.muml.psm.properties.CANMessageFrame#getDeadline()
	 * @see #getCANMessageFrame()
	 * @generated
	 */
	EReference getCANMessageFrame_Deadline();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PropertiesFactory getPropertiesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.psm.properties.impl.WCETImpl <em>WCET</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.properties.impl.WCETImpl
		 * @see org.muml.psm.properties.impl.PropertiesPackageImpl#getWCET()
		 * @generated
		 */
		EClass WCET = eINSTANCE.getWCET();

		/**
		 * The meta object literal for the '<em><b>Wcet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCET__WCET = eINSTANCE.getWCET_Wcet();

		/**
		 * The meta object literal for the '<em><b>Resource Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCET__RESOURCE_INSTANCE = eINSTANCE.getWCET_ResourceInstance();

		/**
		 * The meta object literal for the '{@link org.muml.psm.properties.impl.RequiredMemoryImpl <em>Required Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.properties.impl.RequiredMemoryImpl
		 * @see org.muml.psm.properties.impl.PropertiesPackageImpl#getRequiredMemory()
		 * @generated
		 */
		EClass REQUIRED_MEMORY = eINSTANCE.getRequiredMemory();

		/**
		 * The meta object literal for the '<em><b>Required Memory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_MEMORY__REQUIRED_MEMORY = eINSTANCE.getRequiredMemory_RequiredMemory();

		/**
		 * The meta object literal for the '<em><b>Resource Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_MEMORY__RESOURCE_INSTANCE = eINSTANCE.getRequiredMemory_ResourceInstance();

		/**
		 * The meta object literal for the '{@link org.muml.psm.properties.impl.SchedulingImpl <em>Scheduling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.properties.impl.SchedulingImpl
		 * @see org.muml.psm.properties.impl.PropertiesPackageImpl#getScheduling()
		 * @generated
		 */
		EClass SCHEDULING = eINSTANCE.getScheduling();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING__DEADLINE = eINSTANCE.getScheduling_Deadline();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING__PERIOD = eINSTANCE.getScheduling_Period();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING__PRIORITY = eINSTANCE.getScheduling_Priority();

		/**
		 * The meta object literal for the '{@link org.muml.psm.properties.impl.MessageFrameImpl <em>Message Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.properties.impl.MessageFrameImpl
		 * @see org.muml.psm.properties.impl.PropertiesPackageImpl#getMessageFrame()
		 * @generated
		 */
		EClass MESSAGE_FRAME = eINSTANCE.getMessageFrame();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_FRAME__SIZE = eINSTANCE.getMessageFrame_Size();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_FRAME__PERIOD = eINSTANCE.getMessageFrame_Period();

		/**
		 * The meta object literal for the '{@link org.muml.psm.properties.impl.CANMessageFrameImpl <em>CAN Message Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.properties.impl.CANMessageFrameImpl
		 * @see org.muml.psm.properties.impl.PropertiesPackageImpl#getCANMessageFrame()
		 * @generated
		 */
		EClass CAN_MESSAGE_FRAME = eINSTANCE.getCANMessageFrame();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAN_MESSAGE_FRAME__PRIORITY = eINSTANCE.getCANMessageFrame_Priority();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAN_MESSAGE_FRAME__DEADLINE = eINSTANCE.getCANMessageFrame_Deadline();

	}

} //PropertiesPackage
