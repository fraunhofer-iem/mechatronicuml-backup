/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.calls;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;
import org.muml.storydiagram.StorydiagramPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package contains all classes for modeling calls to activities and EOperations
 * from within an activity.
 * <!-- end-model-doc -->
 * @see org.muml.storydiagram.calls.CallsFactory
 * @model kind="package"
 * @generated
 */
public interface CallsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "calls";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/storydiagram/calls/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sdc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CallsPackage eINSTANCE = org.muml.storydiagram.calls.impl.CallsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.calls.impl.InvocationImpl <em>Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.calls.impl.InvocationImpl
	 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getInvocation()
	 * @generated
	 */
	int INVOCATION = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__ANNOTATIONS = CorePackage.COMMENTABLE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__OWNED_PARAMETER_BINDINGS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__CALLEE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___ECLASS = CorePackage.COMMENTABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___EIS_PROXY = CorePackage.COMMENTABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___ERESOURCE = CorePackage.COMMENTABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___ECONTAINER = CorePackage.COMMENTABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___ECONTAINING_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___ECONTAINMENT_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___ECONTENTS = CorePackage.COMMENTABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___EALL_CONTENTS = CorePackage.COMMENTABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___ECROSS_REFERENCES = CorePackage.COMMENTABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___EGET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.COMMENTABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___EIS_SET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___EUNSET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___EINVOKE__EOPERATION_ELIST = CorePackage.COMMENTABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___PROVIDE_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___GET_ANNOTATION__STRING = CorePackage.COMMENTABLE_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___PROVIDE_ANNOTATION__STRING = CorePackage.COMMENTABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.calls.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.calls.impl.ParameterBindingImpl
	 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getParameterBinding()
	 * @generated
	 */
	int PARAMETER_BINDING = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__ANNOTATIONS = CorePackage.COMMENTABLE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__VALUE_EXPRESSION = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__PARAMETER = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invocation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__INVOCATION = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___ECLASS = CorePackage.COMMENTABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___EIS_PROXY = CorePackage.COMMENTABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___ERESOURCE = CorePackage.COMMENTABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___ECONTAINER = CorePackage.COMMENTABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___ECONTAINING_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___ECONTAINMENT_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___ECONTENTS = CorePackage.COMMENTABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___EALL_CONTENTS = CorePackage.COMMENTABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___ECROSS_REFERENCES = CorePackage.COMMENTABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___EGET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.COMMENTABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___EIS_SET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___EUNSET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___EINVOKE__EOPERATION_ELIST = CorePackage.COMMENTABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___PROVIDE_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___GET_ANNOTATION__STRING = CorePackage.COMMENTABLE_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___PROVIDE_ANNOTATION__STRING = CorePackage.COMMENTABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.calls.impl.CallableImpl <em>Callable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.calls.impl.CallableImpl
	 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getCallable()
	 * @generated
	 */
	int CALLABLE = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__ANNOTATIONS = CorePackage.COMMENTABLE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>In Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__IN_PARAMETER = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__OUT_PARAMETER = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contained Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__CONTAINED_PARAMETERS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___ECLASS = CorePackage.COMMENTABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___EIS_PROXY = CorePackage.COMMENTABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___ERESOURCE = CorePackage.COMMENTABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___ECONTAINER = CorePackage.COMMENTABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___ECONTAINING_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___ECONTAINMENT_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___ECONTENTS = CorePackage.COMMENTABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___EALL_CONTENTS = CorePackage.COMMENTABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___ECROSS_REFERENCES = CorePackage.COMMENTABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___EGET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.COMMENTABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___EIS_SET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___EUNSET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___EINVOKE__EOPERATION_ELIST = CorePackage.COMMENTABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___PROVIDE_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___GET_ANNOTATION__STRING = CorePackage.COMMENTABLE_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___PROVIDE_ANNOTATION__STRING = CorePackage.COMMENTABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.calls.impl.OpaqueCallableImpl <em>Opaque Callable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.calls.impl.OpaqueCallableImpl
	 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getOpaqueCallable()
	 * @generated
	 */
	int OPAQUE_CALLABLE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__ANNOTATIONS = CALLABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__EXTENSIONS = CALLABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__COMMENT = CALLABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>In Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__IN_PARAMETER = CALLABLE__IN_PARAMETER;

	/**
	 * The feature id for the '<em><b>Out Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__OUT_PARAMETER = CALLABLE__OUT_PARAMETER;

	/**
	 * The feature id for the '<em><b>Contained Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__CONTAINED_PARAMETERS = CALLABLE__CONTAINED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__NAME = CALLABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Call Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__CALL_EXPRESSION = CALLABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE_FEATURE_COUNT = CALLABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___ECLASS = CALLABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___EIS_PROXY = CALLABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___ERESOURCE = CALLABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___ECONTAINER = CALLABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___ECONTAINING_FEATURE = CALLABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___ECONTAINMENT_FEATURE = CALLABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___ECONTENTS = CALLABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___EALL_CONTENTS = CALLABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___ECROSS_REFERENCES = CALLABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___EGET__ESTRUCTURALFEATURE = CALLABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CALLABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___ESET__ESTRUCTURALFEATURE_OBJECT = CALLABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___EIS_SET__ESTRUCTURALFEATURE = CALLABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___EUNSET__ESTRUCTURALFEATURE = CALLABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___EINVOKE__EOPERATION_ELIST = CALLABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___GET_EXTENSION__ECLASS = CALLABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___PROVIDE_EXTENSION__ECLASS = CALLABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___GET_ANNOTATION__STRING = CALLABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___PROVIDE_ANNOTATION__STRING = CALLABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Number Of Out Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP = CALLABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Opaque Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE_OPERATION_COUNT = CALLABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.calls.impl.ParameterExtensionImpl <em>Parameter Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.calls.impl.ParameterExtensionImpl
	 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getParameterExtension()
	 * @generated
	 */
	int PARAMETER_EXTENSION = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__ANNOTATIONS = StorydiagramPackage.VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__EXTENSIONS = StorydiagramPackage.VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__TYPE = StorydiagramPackage.VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__GENERIC_TYPE = StorydiagramPackage.VARIABLE__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__VARIABLE_NAME = StorydiagramPackage.VARIABLE__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__BASE = StorydiagramPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__MODEL_BASE = StorydiagramPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__OWNING_ANNOTATION = StorydiagramPackage.VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__EXTENDABLE_BASE = StorydiagramPackage.VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__PARAMETER = StorydiagramPackage.VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Parameter Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION_FEATURE_COUNT = StorydiagramPackage.VARIABLE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___ECLASS = StorydiagramPackage.VARIABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___EIS_PROXY = StorydiagramPackage.VARIABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___ERESOURCE = StorydiagramPackage.VARIABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___ECONTAINER = StorydiagramPackage.VARIABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___ECONTAINING_FEATURE = StorydiagramPackage.VARIABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___ECONTAINMENT_FEATURE = StorydiagramPackage.VARIABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___ECONTENTS = StorydiagramPackage.VARIABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___EALL_CONTENTS = StorydiagramPackage.VARIABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___ECROSS_REFERENCES = StorydiagramPackage.VARIABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___EGET__ESTRUCTURALFEATURE = StorydiagramPackage.VARIABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = StorydiagramPackage.VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___ESET__ESTRUCTURALFEATURE_OBJECT = StorydiagramPackage.VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___EIS_SET__ESTRUCTURALFEATURE = StorydiagramPackage.VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___EUNSET__ESTRUCTURALFEATURE = StorydiagramPackage.VARIABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___EINVOKE__EOPERATION_ELIST = StorydiagramPackage.VARIABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___GET_EXTENSION__ECLASS = StorydiagramPackage.VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___PROVIDE_EXTENSION__ECLASS = StorydiagramPackage.VARIABLE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___GET_ANNOTATION__STRING = StorydiagramPackage.VARIABLE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___PROVIDE_ANNOTATION__STRING = StorydiagramPackage.VARIABLE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Parameter Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION_OPERATION_COUNT = StorydiagramPackage.VARIABLE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.calls.Invocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation</em>'.
	 * @see org.muml.storydiagram.calls.Invocation
	 * @generated
	 */
	EClass getInvocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.storydiagram.calls.Invocation#getOwnedParameterBindings <em>Owned Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter Bindings</em>'.
	 * @see org.muml.storydiagram.calls.Invocation#getOwnedParameterBindings()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_OwnedParameterBindings();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.calls.Invocation#getCallee <em>Callee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callee</em>'.
	 * @see org.muml.storydiagram.calls.Invocation#getCallee()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_Callee();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.calls.ParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Binding</em>'.
	 * @see org.muml.storydiagram.calls.ParameterBinding
	 * @generated
	 */
	EClass getParameterBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.storydiagram.calls.ParameterBinding#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.muml.storydiagram.calls.ParameterBinding#getValueExpression()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_ValueExpression();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.calls.ParameterBinding#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.muml.storydiagram.calls.ParameterBinding#getParameter()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_Parameter();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.storydiagram.calls.ParameterBinding#getInvocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Invocation</em>'.
	 * @see org.muml.storydiagram.calls.ParameterBinding#getInvocation()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_Invocation();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.calls.OpaqueCallable <em>Opaque Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Callable</em>'.
	 * @see org.muml.storydiagram.calls.OpaqueCallable
	 * @generated
	 */
	EClass getOpaqueCallable();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.calls.OpaqueCallable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.storydiagram.calls.OpaqueCallable#getName()
	 * @see #getOpaqueCallable()
	 * @generated
	 */
	EAttribute getOpaqueCallable_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.storydiagram.calls.OpaqueCallable#getCallExpression <em>Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Call Expression</em>'.
	 * @see org.muml.storydiagram.calls.OpaqueCallable#getCallExpression()
	 * @see #getOpaqueCallable()
	 * @generated
	 */
	EReference getOpaqueCallable_CallExpression();

	/**
	 * Returns the meta object for the '{@link org.muml.storydiagram.calls.OpaqueCallable#NumberOfOutParams(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Out Params</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Of Out Params</em>' operation.
	 * @see org.muml.storydiagram.calls.OpaqueCallable#NumberOfOutParams(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOpaqueCallable__NumberOfOutParams__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.calls.ParameterExtension <em>Parameter Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Extension</em>'.
	 * @see org.muml.storydiagram.calls.ParameterExtension
	 * @generated
	 */
	EClass getParameterExtension();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.calls.ParameterExtension#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.muml.storydiagram.calls.ParameterExtension#getParameter()
	 * @see #getParameterExtension()
	 * @generated
	 */
	EReference getParameterExtension_Parameter();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.calls.Callable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable</em>'.
	 * @see org.muml.storydiagram.calls.Callable
	 * @generated
	 */
	EClass getCallable();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.storydiagram.calls.Callable#getInParameter <em>In Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Parameter</em>'.
	 * @see org.muml.storydiagram.calls.Callable#getInParameter()
	 * @see #getCallable()
	 * @generated
	 */
	EReference getCallable_InParameter();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.storydiagram.calls.Callable#getOutParameter <em>Out Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Parameter</em>'.
	 * @see org.muml.storydiagram.calls.Callable#getOutParameter()
	 * @see #getCallable()
	 * @generated
	 */
	EReference getCallable_OutParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.storydiagram.calls.Callable#getContainedParameters <em>Contained Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Parameters</em>'.
	 * @see org.muml.storydiagram.calls.Callable#getContainedParameters()
	 * @see #getCallable()
	 * @generated
	 */
	EReference getCallable_ContainedParameters();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CallsFactory getCallsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.calls.impl.InvocationImpl <em>Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.calls.impl.InvocationImpl
		 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getInvocation()
		 * @generated
		 */
		EClass INVOCATION = eINSTANCE.getInvocation();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__OWNED_PARAMETER_BINDINGS = eINSTANCE.getInvocation_OwnedParameterBindings();

		/**
		 * The meta object literal for the '<em><b>Callee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__CALLEE = eINSTANCE.getInvocation_Callee();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.calls.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.calls.impl.ParameterBindingImpl
		 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getParameterBinding()
		 * @generated
		 */
		EClass PARAMETER_BINDING = eINSTANCE.getParameterBinding();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__VALUE_EXPRESSION = eINSTANCE.getParameterBinding_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__PARAMETER = eINSTANCE.getParameterBinding_Parameter();

		/**
		 * The meta object literal for the '<em><b>Invocation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__INVOCATION = eINSTANCE.getParameterBinding_Invocation();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.calls.impl.OpaqueCallableImpl <em>Opaque Callable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.calls.impl.OpaqueCallableImpl
		 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getOpaqueCallable()
		 * @generated
		 */
		EClass OPAQUE_CALLABLE = eINSTANCE.getOpaqueCallable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_CALLABLE__NAME = eINSTANCE.getOpaqueCallable_Name();

		/**
		 * The meta object literal for the '<em><b>Call Expression</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_CALLABLE__CALL_EXPRESSION = eINSTANCE.getOpaqueCallable_CallExpression();

		/**
		 * The meta object literal for the '<em><b>Number Of Out Params</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPAQUE_CALLABLE___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOpaqueCallable__NumberOfOutParams__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.calls.impl.ParameterExtensionImpl <em>Parameter Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.calls.impl.ParameterExtensionImpl
		 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getParameterExtension()
		 * @generated
		 */
		EClass PARAMETER_EXTENSION = eINSTANCE.getParameterExtension();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_EXTENSION__PARAMETER = eINSTANCE.getParameterExtension_Parameter();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.calls.impl.CallableImpl <em>Callable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.calls.impl.CallableImpl
		 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getCallable()
		 * @generated
		 */
		EClass CALLABLE = eINSTANCE.getCallable();

		/**
		 * The meta object literal for the '<em><b>In Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE__IN_PARAMETER = eINSTANCE.getCallable_InParameter();

		/**
		 * The meta object literal for the '<em><b>Out Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE__OUT_PARAMETER = eINSTANCE.getCallable_OutParameter();

		/**
		 * The meta object literal for the '<em><b>Contained Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE__CONTAINED_PARAMETERS = eINSTANCE.getCallable_ContainedParameters();

	}

} //CallsPackage
