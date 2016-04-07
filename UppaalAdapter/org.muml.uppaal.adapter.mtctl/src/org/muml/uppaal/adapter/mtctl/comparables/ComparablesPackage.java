/**
 */
package org.muml.uppaal.adapter.mtctl.comparables;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.uppaal.adapter.mtctl.MtctlPackage;

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
 * Contains expressions that can be used in a ComparisonExpr
 * <!-- end-model-doc -->
 * @see org.muml.uppaal.adapter.mtctl.comparables.ComparablesFactory
 * @model kind="package"
 * @generated
 */
public interface ComparablesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "comparables";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/uppaal/adapter/mtctl/comparables/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Comparables";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComparablesPackage eINSTANCE = org.muml.uppaal.adapter.mtctl.comparables.impl.ComparablesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.uppaal.adapter.mtctl.comparables.impl.MapExprImpl <em>Map Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.MapExprImpl
	 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ComparablesPackageImpl#getMapExpr()
	 * @generated
	 */
	int MAP_EXPR = 2;

	/**
	 * The number of structural features of the '<em>Map Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR_FEATURE_COUNT = MtctlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___ECLASS = MtctlPackage.EXPRESSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___EIS_PROXY = MtctlPackage.EXPRESSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___ERESOURCE = MtctlPackage.EXPRESSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___ECONTAINER = MtctlPackage.EXPRESSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___ECONTAINING_FEATURE = MtctlPackage.EXPRESSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___ECONTAINMENT_FEATURE = MtctlPackage.EXPRESSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___ECONTENTS = MtctlPackage.EXPRESSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___EALL_CONTENTS = MtctlPackage.EXPRESSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___ECROSS_REFERENCES = MtctlPackage.EXPRESSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___EGET__ESTRUCTURALFEATURE = MtctlPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = MtctlPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = MtctlPackage.EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___EIS_SET__ESTRUCTURALFEATURE = MtctlPackage.EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___EUNSET__ESTRUCTURALFEATURE = MtctlPackage.EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___EINVOKE__EOPERATION_ELIST = MtctlPackage.EXPRESSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Map Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.adapter.mtctl.comparables.impl.BufferMsgCountExprImpl <em>Buffer Msg Count Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.BufferMsgCountExprImpl
	 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ComparablesPackageImpl#getBufferMsgCountExpr()
	 * @generated
	 */
	int BUFFER_MSG_COUNT_EXPR = 0;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR__BUFFER = MAP_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Buffer Msg Count Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR_FEATURE_COUNT = MAP_EXPR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___ECLASS = MAP_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___EIS_PROXY = MAP_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___ERESOURCE = MAP_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___ECONTAINER = MAP_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___ECONTAINING_FEATURE = MAP_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___ECONTAINMENT_FEATURE = MAP_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___ECONTENTS = MAP_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___EALL_CONTENTS = MAP_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___ECROSS_REFERENCES = MAP_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___EGET__ESTRUCTURALFEATURE = MAP_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = MAP_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = MAP_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___EIS_SET__ESTRUCTURALFEATURE = MAP_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___EUNSET__ESTRUCTURALFEATURE = MAP_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___EINVOKE__EOPERATION_ELIST = MAP_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Buffer Msg Count Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR_OPERATION_COUNT = MAP_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.adapter.mtctl.comparables.impl.ConstExprImpl <em>Const Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ConstExprImpl
	 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ComparablesPackageImpl#getConstExpr()
	 * @generated
	 */
	int CONST_EXPR = 1;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR__VAL = MAP_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR__TIME_UNIT = MAP_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Const Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR_FEATURE_COUNT = MAP_EXPR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___ECLASS = MAP_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___EIS_PROXY = MAP_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___ERESOURCE = MAP_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___ECONTAINER = MAP_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___ECONTAINING_FEATURE = MAP_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___ECONTAINMENT_FEATURE = MAP_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___ECONTENTS = MAP_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___EALL_CONTENTS = MAP_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___ECROSS_REFERENCES = MAP_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___EGET__ESTRUCTURALFEATURE = MAP_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = MAP_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = MAP_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___EIS_SET__ESTRUCTURALFEATURE = MAP_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___EUNSET__ESTRUCTURALFEATURE = MAP_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___EINVOKE__EOPERATION_ELIST = MAP_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Const Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR_OPERATION_COUNT = MAP_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.adapter.mtctl.comparables.impl.MumlElemExprImpl <em>Muml Elem Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.MumlElemExprImpl
	 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ComparablesPackageImpl#getMumlElemExpr()
	 * @generated
	 */
	int MUML_ELEM_EXPR = 3;

	/**
	 * The feature id for the '<em><b>Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR__ELEM = MAP_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR__INSTANCE = MAP_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Muml Elem Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR_FEATURE_COUNT = MAP_EXPR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___ECLASS = MAP_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___EIS_PROXY = MAP_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___ERESOURCE = MAP_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___ECONTAINER = MAP_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___ECONTAINING_FEATURE = MAP_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___ECONTAINMENT_FEATURE = MAP_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___ECONTENTS = MAP_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___EALL_CONTENTS = MAP_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___ECROSS_REFERENCES = MAP_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___EGET__ESTRUCTURALFEATURE = MAP_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = MAP_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = MAP_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___EIS_SET__ESTRUCTURALFEATURE = MAP_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___EUNSET__ESTRUCTURALFEATURE = MAP_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___EINVOKE__EOPERATION_ELIST = MAP_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Muml Elem Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR_OPERATION_COUNT = MAP_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.adapter.mtctl.comparables.impl.TransitionMapImpl <em>Transition Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.TransitionMapImpl
	 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ComparablesPackageImpl#getTransitionMap()
	 * @generated
	 */
	int TRANSITION_MAP = 4;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP__TRANSITION = MAP_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP_FEATURE_COUNT = MAP_EXPR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___ECLASS = MAP_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___EIS_PROXY = MAP_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___ERESOURCE = MAP_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___ECONTAINER = MAP_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___ECONTAINING_FEATURE = MAP_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___ECONTAINMENT_FEATURE = MAP_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___ECONTENTS = MAP_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___EALL_CONTENTS = MAP_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___ECROSS_REFERENCES = MAP_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___EGET__ESTRUCTURALFEATURE = MAP_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___EGET__ESTRUCTURALFEATURE_BOOLEAN = MAP_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___ESET__ESTRUCTURALFEATURE_OBJECT = MAP_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___EIS_SET__ESTRUCTURALFEATURE = MAP_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___EUNSET__ESTRUCTURALFEATURE = MAP_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___EINVOKE__EOPERATION_ELIST = MAP_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Transition Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP_OPERATION_COUNT = MAP_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.adapter.mtctl.comparables.impl.SourceStateExprImpl <em>Source State Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.SourceStateExprImpl
	 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ComparablesPackageImpl#getSourceStateExpr()
	 * @generated
	 */
	int SOURCE_STATE_EXPR = 5;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR__TRANSITION = TRANSITION_MAP__TRANSITION;

	/**
	 * The number of structural features of the '<em>Source State Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR_FEATURE_COUNT = TRANSITION_MAP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___ECLASS = TRANSITION_MAP___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___EIS_PROXY = TRANSITION_MAP___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___ERESOURCE = TRANSITION_MAP___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___ECONTAINER = TRANSITION_MAP___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___ECONTAINING_FEATURE = TRANSITION_MAP___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___ECONTAINMENT_FEATURE = TRANSITION_MAP___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___ECONTENTS = TRANSITION_MAP___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___EALL_CONTENTS = TRANSITION_MAP___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___ECROSS_REFERENCES = TRANSITION_MAP___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___EGET__ESTRUCTURALFEATURE = TRANSITION_MAP___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = TRANSITION_MAP___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = TRANSITION_MAP___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___EIS_SET__ESTRUCTURALFEATURE = TRANSITION_MAP___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___EUNSET__ESTRUCTURALFEATURE = TRANSITION_MAP___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___EINVOKE__EOPERATION_ELIST = TRANSITION_MAP___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Source State Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR_OPERATION_COUNT = TRANSITION_MAP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.adapter.mtctl.comparables.impl.TargetStateExprImpl <em>Target State Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.TargetStateExprImpl
	 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ComparablesPackageImpl#getTargetStateExpr()
	 * @generated
	 */
	int TARGET_STATE_EXPR = 6;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR__TRANSITION = TRANSITION_MAP__TRANSITION;

	/**
	 * The number of structural features of the '<em>Target State Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR_FEATURE_COUNT = TRANSITION_MAP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___ECLASS = TRANSITION_MAP___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___EIS_PROXY = TRANSITION_MAP___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___ERESOURCE = TRANSITION_MAP___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___ECONTAINER = TRANSITION_MAP___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___ECONTAINING_FEATURE = TRANSITION_MAP___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___ECONTAINMENT_FEATURE = TRANSITION_MAP___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___ECONTENTS = TRANSITION_MAP___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___EALL_CONTENTS = TRANSITION_MAP___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___ECROSS_REFERENCES = TRANSITION_MAP___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___EGET__ESTRUCTURALFEATURE = TRANSITION_MAP___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = TRANSITION_MAP___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = TRANSITION_MAP___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___EIS_SET__ESTRUCTURALFEATURE = TRANSITION_MAP___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___EUNSET__ESTRUCTURALFEATURE = TRANSITION_MAP___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___EINVOKE__EOPERATION_ELIST = TRANSITION_MAP___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Target State Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR_OPERATION_COUNT = TRANSITION_MAP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.adapter.mtctl.comparables.BufferMsgCountExpr <em>Buffer Msg Count Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer Msg Count Expr</em>'.
	 * @see org.muml.uppaal.adapter.mtctl.comparables.BufferMsgCountExpr
	 * @generated
	 */
	EClass getBufferMsgCountExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.adapter.mtctl.comparables.BufferMsgCountExpr#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buffer</em>'.
	 * @see org.muml.uppaal.adapter.mtctl.comparables.BufferMsgCountExpr#getBuffer()
	 * @see #getBufferMsgCountExpr()
	 * @generated
	 */
	EReference getBufferMsgCountExpr_Buffer();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.adapter.mtctl.comparables.ConstExpr <em>Const Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const Expr</em>'.
	 * @see org.muml.uppaal.adapter.mtctl.comparables.ConstExpr
	 * @generated
	 */
	EClass getConstExpr();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.adapter.mtctl.comparables.ConstExpr#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see org.muml.uppaal.adapter.mtctl.comparables.ConstExpr#getVal()
	 * @see #getConstExpr()
	 * @generated
	 */
	EAttribute getConstExpr_Val();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.adapter.mtctl.comparables.ConstExpr#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see org.muml.uppaal.adapter.mtctl.comparables.ConstExpr#getTimeUnit()
	 * @see #getConstExpr()
	 * @generated
	 */
	EAttribute getConstExpr_TimeUnit();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.adapter.mtctl.comparables.MapExpr <em>Map Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Expr</em>'.
	 * @see org.muml.uppaal.adapter.mtctl.comparables.MapExpr
	 * @generated
	 */
	EClass getMapExpr();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.adapter.mtctl.comparables.MumlElemExpr <em>Muml Elem Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Muml Elem Expr</em>'.
	 * @see org.muml.uppaal.adapter.mtctl.comparables.MumlElemExpr
	 * @generated
	 */
	EClass getMumlElemExpr();

	/**
	 * Returns the meta object for the reference '{@link org.muml.uppaal.adapter.mtctl.comparables.MumlElemExpr#getElem <em>Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elem</em>'.
	 * @see org.muml.uppaal.adapter.mtctl.comparables.MumlElemExpr#getElem()
	 * @see #getMumlElemExpr()
	 * @generated
	 */
	EReference getMumlElemExpr_Elem();

	/**
	 * Returns the meta object for the reference '{@link org.muml.uppaal.adapter.mtctl.comparables.MumlElemExpr#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see org.muml.uppaal.adapter.mtctl.comparables.MumlElemExpr#getInstance()
	 * @see #getMumlElemExpr()
	 * @generated
	 */
	EReference getMumlElemExpr_Instance();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.adapter.mtctl.comparables.TransitionMap <em>Transition Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Map</em>'.
	 * @see org.muml.uppaal.adapter.mtctl.comparables.TransitionMap
	 * @generated
	 */
	EClass getTransitionMap();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.adapter.mtctl.comparables.TransitionMap#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition</em>'.
	 * @see org.muml.uppaal.adapter.mtctl.comparables.TransitionMap#getTransition()
	 * @see #getTransitionMap()
	 * @generated
	 */
	EReference getTransitionMap_Transition();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.adapter.mtctl.comparables.SourceStateExpr <em>Source State Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source State Expr</em>'.
	 * @see org.muml.uppaal.adapter.mtctl.comparables.SourceStateExpr
	 * @generated
	 */
	EClass getSourceStateExpr();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.adapter.mtctl.comparables.TargetStateExpr <em>Target State Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target State Expr</em>'.
	 * @see org.muml.uppaal.adapter.mtctl.comparables.TargetStateExpr
	 * @generated
	 */
	EClass getTargetStateExpr();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComparablesFactory getComparablesFactory();

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
		 * The meta object literal for the '{@link org.muml.uppaal.adapter.mtctl.comparables.impl.BufferMsgCountExprImpl <em>Buffer Msg Count Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.BufferMsgCountExprImpl
		 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ComparablesPackageImpl#getBufferMsgCountExpr()
		 * @generated
		 */
		EClass BUFFER_MSG_COUNT_EXPR = eINSTANCE.getBufferMsgCountExpr();

		/**
		 * The meta object literal for the '<em><b>Buffer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUFFER_MSG_COUNT_EXPR__BUFFER = eINSTANCE.getBufferMsgCountExpr_Buffer();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.adapter.mtctl.comparables.impl.ConstExprImpl <em>Const Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ConstExprImpl
		 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ComparablesPackageImpl#getConstExpr()
		 * @generated
		 */
		EClass CONST_EXPR = eINSTANCE.getConstExpr();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONST_EXPR__VAL = eINSTANCE.getConstExpr_Val();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONST_EXPR__TIME_UNIT = eINSTANCE.getConstExpr_TimeUnit();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.adapter.mtctl.comparables.impl.MapExprImpl <em>Map Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.MapExprImpl
		 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ComparablesPackageImpl#getMapExpr()
		 * @generated
		 */
		EClass MAP_EXPR = eINSTANCE.getMapExpr();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.adapter.mtctl.comparables.impl.MumlElemExprImpl <em>Muml Elem Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.MumlElemExprImpl
		 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ComparablesPackageImpl#getMumlElemExpr()
		 * @generated
		 */
		EClass MUML_ELEM_EXPR = eINSTANCE.getMumlElemExpr();

		/**
		 * The meta object literal for the '<em><b>Elem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUML_ELEM_EXPR__ELEM = eINSTANCE.getMumlElemExpr_Elem();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUML_ELEM_EXPR__INSTANCE = eINSTANCE.getMumlElemExpr_Instance();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.adapter.mtctl.comparables.impl.TransitionMapImpl <em>Transition Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.TransitionMapImpl
		 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ComparablesPackageImpl#getTransitionMap()
		 * @generated
		 */
		EClass TRANSITION_MAP = eINSTANCE.getTransitionMap();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_MAP__TRANSITION = eINSTANCE.getTransitionMap_Transition();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.adapter.mtctl.comparables.impl.SourceStateExprImpl <em>Source State Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.SourceStateExprImpl
		 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ComparablesPackageImpl#getSourceStateExpr()
		 * @generated
		 */
		EClass SOURCE_STATE_EXPR = eINSTANCE.getSourceStateExpr();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.adapter.mtctl.comparables.impl.TargetStateExprImpl <em>Target State Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.TargetStateExprImpl
		 * @see org.muml.uppaal.adapter.mtctl.comparables.impl.ComparablesPackageImpl#getTargetStateExpr()
		 * @generated
		 */
		EClass TARGET_STATE_EXPR = eINSTANCE.getTargetStateExpr();

	}

} //ComparablesPackage
