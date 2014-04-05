/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesFactory
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
	String eNAME = "Comparables";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uni_paderborn.de/fujaba/muml/verification/uppaal/Mtctl/Comparables";

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
	ComparablesPackage eINSTANCE = de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MapExprImpl <em>Map Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MapExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getMapExpr()
	 * @generated
	 */
	int MAP_EXPR = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR__ANNOTATION = MtctlPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR__EXTENSION = MtctlPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR__COMMENT = MtctlPackage.EXPRESSION__COMMENT;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___GET_EXTENSION__ECLASS = MtctlPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___PROVIDE_EXTENSION__ECLASS = MtctlPackage.EXPRESSION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___GET_ANNOTATION__STRING = MtctlPackage.EXPRESSION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR___PROVIDE_ANNOTATION__STRING = MtctlPackage.EXPRESSION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Map Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.BufferMsgCountExprImpl <em>Buffer Msg Count Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.BufferMsgCountExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getBufferMsgCountExpr()
	 * @generated
	 */
	int BUFFER_MSG_COUNT_EXPR = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR__ANNOTATION = MAP_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR__EXTENSION = MAP_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR__COMMENT = MAP_EXPR__COMMENT;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___GET_EXTENSION__ECLASS = MAP_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___PROVIDE_EXTENSION__ECLASS = MAP_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___GET_ANNOTATION__STRING = MAP_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR___PROVIDE_ANNOTATION__STRING = MAP_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Buffer Msg Count Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR_OPERATION_COUNT = MAP_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ConstExprImpl <em>Const Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ConstExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getConstExpr()
	 * @generated
	 */
	int CONST_EXPR = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR__ANNOTATION = MAP_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR__EXTENSION = MAP_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR__COMMENT = MAP_EXPR__COMMENT;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR__VAL = MAP_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Const Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR_FEATURE_COUNT = MAP_EXPR_FEATURE_COUNT + 1;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___GET_EXTENSION__ECLASS = MAP_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___PROVIDE_EXTENSION__ECLASS = MAP_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___GET_ANNOTATION__STRING = MAP_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR___PROVIDE_ANNOTATION__STRING = MAP_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Const Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR_OPERATION_COUNT = MAP_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MumlElemExprImpl <em>Muml Elem Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MumlElemExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getMumlElemExpr()
	 * @generated
	 */
	int MUML_ELEM_EXPR = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR__ANNOTATION = MAP_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR__EXTENSION = MAP_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR__COMMENT = MAP_EXPR__COMMENT;

	/**
	 * The feature id for the '<em><b>Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR__ELEM = MAP_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Muml Elem Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR_FEATURE_COUNT = MAP_EXPR_FEATURE_COUNT + 1;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___GET_EXTENSION__ECLASS = MAP_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___PROVIDE_EXTENSION__ECLASS = MAP_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___GET_ANNOTATION__STRING = MAP_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR___PROVIDE_ANNOTATION__STRING = MAP_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Muml Elem Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR_OPERATION_COUNT = MAP_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TransitionMapImpl <em>Transition Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TransitionMapImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getTransitionMap()
	 * @generated
	 */
	int TRANSITION_MAP = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP__ANNOTATION = MAP_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP__EXTENSION = MAP_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP__COMMENT = MAP_EXPR__COMMENT;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___GET_EXTENSION__ECLASS = MAP_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___PROVIDE_EXTENSION__ECLASS = MAP_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___GET_ANNOTATION__STRING = MAP_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP___PROVIDE_ANNOTATION__STRING = MAP_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Transition Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP_OPERATION_COUNT = MAP_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.SourceStateExprImpl <em>Source State Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.SourceStateExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getSourceStateExpr()
	 * @generated
	 */
	int SOURCE_STATE_EXPR = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR__ANNOTATION = TRANSITION_MAP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR__EXTENSION = TRANSITION_MAP__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR__COMMENT = TRANSITION_MAP__COMMENT;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___GET_EXTENSION__ECLASS = TRANSITION_MAP___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___PROVIDE_EXTENSION__ECLASS = TRANSITION_MAP___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___GET_ANNOTATION__STRING = TRANSITION_MAP___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR___PROVIDE_ANNOTATION__STRING = TRANSITION_MAP___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Source State Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR_OPERATION_COUNT = TRANSITION_MAP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TargetStateExprImpl <em>Target State Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TargetStateExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getTargetStateExpr()
	 * @generated
	 */
	int TARGET_STATE_EXPR = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR__ANNOTATION = TRANSITION_MAP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR__EXTENSION = TRANSITION_MAP__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR__COMMENT = TRANSITION_MAP__COMMENT;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___GET_EXTENSION__ECLASS = TRANSITION_MAP___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___PROVIDE_EXTENSION__ECLASS = TRANSITION_MAP___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___GET_ANNOTATION__STRING = TRANSITION_MAP___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR___PROVIDE_ANNOTATION__STRING = TRANSITION_MAP___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Target State Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR_OPERATION_COUNT = TRANSITION_MAP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.BufferMsgCountExpr <em>Buffer Msg Count Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer Msg Count Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.BufferMsgCountExpr
	 * @generated
	 */
	EClass getBufferMsgCountExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.BufferMsgCountExpr#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buffer</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.BufferMsgCountExpr#getBuffer()
	 * @see #getBufferMsgCountExpr()
	 * @generated
	 */
	EReference getBufferMsgCountExpr_Buffer();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ConstExpr <em>Const Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ConstExpr
	 * @generated
	 */
	EClass getConstExpr();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ConstExpr#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ConstExpr#getVal()
	 * @see #getConstExpr()
	 * @generated
	 */
	EAttribute getConstExpr_Val();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MapExpr <em>Map Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MapExpr
	 * @generated
	 */
	EClass getMapExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr <em>Muml Elem Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Muml Elem Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr
	 * @generated
	 */
	EClass getMumlElemExpr();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr#getElem <em>Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elem</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr#getElem()
	 * @see #getMumlElemExpr()
	 * @generated
	 */
	EReference getMumlElemExpr_Elem();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TransitionMap <em>Transition Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Map</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TransitionMap
	 * @generated
	 */
	EClass getTransitionMap();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TransitionMap#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TransitionMap#getTransition()
	 * @see #getTransitionMap()
	 * @generated
	 */
	EReference getTransitionMap_Transition();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.SourceStateExpr <em>Source State Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source State Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.SourceStateExpr
	 * @generated
	 */
	EClass getSourceStateExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TargetStateExpr <em>Target State Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target State Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TargetStateExpr
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.BufferMsgCountExprImpl <em>Buffer Msg Count Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.BufferMsgCountExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getBufferMsgCountExpr()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ConstExprImpl <em>Const Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ConstExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getConstExpr()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MapExprImpl <em>Map Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MapExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getMapExpr()
		 * @generated
		 */
		EClass MAP_EXPR = eINSTANCE.getMapExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MumlElemExprImpl <em>Muml Elem Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MumlElemExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getMumlElemExpr()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TransitionMapImpl <em>Transition Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TransitionMapImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getTransitionMap()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.SourceStateExprImpl <em>Source State Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.SourceStateExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getSourceStateExpr()
		 * @generated
		 */
		EClass SOURCE_STATE_EXPR = eINSTANCE.getSourceStateExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TargetStateExprImpl <em>Target State Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TargetStateExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getTargetStateExpr()
		 * @generated
		 */
		EClass TARGET_STATE_EXPR = eINSTANCE.getTargetStateExpr();

	}

} //ComparablesPackage
