/**
 */
package mtctl.Quantifiers;

import mtctl.MtctlPackage;

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
 * @see mtctl.Quantifiers.QuantifiersFactory
 * @model kind="package"
 * @generated
 */
public interface QuantifiersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Quantifiers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uni_paderborn.de/fujaba/muml/verification/uppaal/Mtctl/Quantifiers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Quantifiers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuantifiersPackage eINSTANCE = mtctl.Quantifiers.impl.QuantifiersPackageImpl.init();

	/**
	 * The meta object id for the '{@link mtctl.Quantifiers.impl.TemporalQuantifierExprImpl <em>Temporal Quantifier Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Quantifiers.impl.TemporalQuantifierExprImpl
	 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getTemporalQuantifierExpr()
	 * @generated
	 */
	int TEMPORAL_QUANTIFIER_EXPR = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR__ANNOTATION = MtctlPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR__EXTENSION = MtctlPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR__COMMENT = MtctlPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR__EXPR = MtctlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temporal Quantifier Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT = MtctlPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___ECLASS = MtctlPackage.EXPRESSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___EIS_PROXY = MtctlPackage.EXPRESSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___ERESOURCE = MtctlPackage.EXPRESSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___ECONTAINER = MtctlPackage.EXPRESSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___ECONTAINING_FEATURE = MtctlPackage.EXPRESSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___ECONTAINMENT_FEATURE = MtctlPackage.EXPRESSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___ECONTENTS = MtctlPackage.EXPRESSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___EALL_CONTENTS = MtctlPackage.EXPRESSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___ECROSS_REFERENCES = MtctlPackage.EXPRESSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE = MtctlPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = MtctlPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = MtctlPackage.EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___EIS_SET__ESTRUCTURALFEATURE = MtctlPackage.EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___EUNSET__ESTRUCTURALFEATURE = MtctlPackage.EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___EINVOKE__EOPERATION_ELIST = MtctlPackage.EXPRESSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___GET_EXTENSION__ECLASS = MtctlPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___PROVIDE_EXTENSION__ECLASS = MtctlPackage.EXPRESSION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___GET_ANNOTATION__STRING = MtctlPackage.EXPRESSION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR___PROVIDE_ANNOTATION__STRING = MtctlPackage.EXPRESSION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Temporal Quantifier Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Quantifiers.impl.AFExprImpl <em>AF Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Quantifiers.impl.AFExprImpl
	 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getAFExpr()
	 * @generated
	 */
	int AF_EXPR = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR__ANNOTATION = TEMPORAL_QUANTIFIER_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR__EXTENSION = TEMPORAL_QUANTIFIER_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR__COMMENT = TEMPORAL_QUANTIFIER_EXPR__COMMENT;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR__EXPR = TEMPORAL_QUANTIFIER_EXPR__EXPR;

	/**
	 * The number of structural features of the '<em>AF Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR_FEATURE_COUNT = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___ECLASS = TEMPORAL_QUANTIFIER_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___EIS_PROXY = TEMPORAL_QUANTIFIER_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___ERESOURCE = TEMPORAL_QUANTIFIER_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___ECONTAINER = TEMPORAL_QUANTIFIER_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___ECONTAINING_FEATURE = TEMPORAL_QUANTIFIER_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___ECONTAINMENT_FEATURE = TEMPORAL_QUANTIFIER_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___ECONTENTS = TEMPORAL_QUANTIFIER_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___EALL_CONTENTS = TEMPORAL_QUANTIFIER_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___ECROSS_REFERENCES = TEMPORAL_QUANTIFIER_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___EGET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = TEMPORAL_QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = TEMPORAL_QUANTIFIER_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___EIS_SET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___EUNSET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___EINVOKE__EOPERATION_ELIST = TEMPORAL_QUANTIFIER_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___GET_EXTENSION__ECLASS = TEMPORAL_QUANTIFIER_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___PROVIDE_EXTENSION__ECLASS = TEMPORAL_QUANTIFIER_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___GET_ANNOTATION__STRING = TEMPORAL_QUANTIFIER_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR___PROVIDE_ANNOTATION__STRING = TEMPORAL_QUANTIFIER_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>AF Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR_OPERATION_COUNT = TEMPORAL_QUANTIFIER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Quantifiers.impl.AGExprImpl <em>AG Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Quantifiers.impl.AGExprImpl
	 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getAGExpr()
	 * @generated
	 */
	int AG_EXPR = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR__ANNOTATION = TEMPORAL_QUANTIFIER_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR__EXTENSION = TEMPORAL_QUANTIFIER_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR__COMMENT = TEMPORAL_QUANTIFIER_EXPR__COMMENT;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR__EXPR = TEMPORAL_QUANTIFIER_EXPR__EXPR;

	/**
	 * The number of structural features of the '<em>AG Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR_FEATURE_COUNT = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___ECLASS = TEMPORAL_QUANTIFIER_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___EIS_PROXY = TEMPORAL_QUANTIFIER_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___ERESOURCE = TEMPORAL_QUANTIFIER_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___ECONTAINER = TEMPORAL_QUANTIFIER_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___ECONTAINING_FEATURE = TEMPORAL_QUANTIFIER_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___ECONTAINMENT_FEATURE = TEMPORAL_QUANTIFIER_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___ECONTENTS = TEMPORAL_QUANTIFIER_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___EALL_CONTENTS = TEMPORAL_QUANTIFIER_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___ECROSS_REFERENCES = TEMPORAL_QUANTIFIER_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___EGET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = TEMPORAL_QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = TEMPORAL_QUANTIFIER_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___EIS_SET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___EUNSET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___EINVOKE__EOPERATION_ELIST = TEMPORAL_QUANTIFIER_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___GET_EXTENSION__ECLASS = TEMPORAL_QUANTIFIER_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___PROVIDE_EXTENSION__ECLASS = TEMPORAL_QUANTIFIER_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___GET_ANNOTATION__STRING = TEMPORAL_QUANTIFIER_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR___PROVIDE_ANNOTATION__STRING = TEMPORAL_QUANTIFIER_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>AG Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR_OPERATION_COUNT = TEMPORAL_QUANTIFIER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Quantifiers.impl.EFExprImpl <em>EF Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Quantifiers.impl.EFExprImpl
	 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getEFExpr()
	 * @generated
	 */
	int EF_EXPR = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR__ANNOTATION = TEMPORAL_QUANTIFIER_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR__EXTENSION = TEMPORAL_QUANTIFIER_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR__COMMENT = TEMPORAL_QUANTIFIER_EXPR__COMMENT;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR__EXPR = TEMPORAL_QUANTIFIER_EXPR__EXPR;

	/**
	 * The number of structural features of the '<em>EF Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR_FEATURE_COUNT = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___ECLASS = TEMPORAL_QUANTIFIER_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___EIS_PROXY = TEMPORAL_QUANTIFIER_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___ERESOURCE = TEMPORAL_QUANTIFIER_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___ECONTAINER = TEMPORAL_QUANTIFIER_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___ECONTAINING_FEATURE = TEMPORAL_QUANTIFIER_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___ECONTAINMENT_FEATURE = TEMPORAL_QUANTIFIER_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___ECONTENTS = TEMPORAL_QUANTIFIER_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___EALL_CONTENTS = TEMPORAL_QUANTIFIER_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___ECROSS_REFERENCES = TEMPORAL_QUANTIFIER_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___EGET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = TEMPORAL_QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = TEMPORAL_QUANTIFIER_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___EIS_SET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___EUNSET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___EINVOKE__EOPERATION_ELIST = TEMPORAL_QUANTIFIER_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___GET_EXTENSION__ECLASS = TEMPORAL_QUANTIFIER_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___PROVIDE_EXTENSION__ECLASS = TEMPORAL_QUANTIFIER_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___GET_ANNOTATION__STRING = TEMPORAL_QUANTIFIER_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR___PROVIDE_ANNOTATION__STRING = TEMPORAL_QUANTIFIER_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>EF Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR_OPERATION_COUNT = TEMPORAL_QUANTIFIER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Quantifiers.impl.EGExprImpl <em>EG Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Quantifiers.impl.EGExprImpl
	 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getEGExpr()
	 * @generated
	 */
	int EG_EXPR = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR__ANNOTATION = TEMPORAL_QUANTIFIER_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR__EXTENSION = TEMPORAL_QUANTIFIER_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR__COMMENT = TEMPORAL_QUANTIFIER_EXPR__COMMENT;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR__EXPR = TEMPORAL_QUANTIFIER_EXPR__EXPR;

	/**
	 * The number of structural features of the '<em>EG Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR_FEATURE_COUNT = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___ECLASS = TEMPORAL_QUANTIFIER_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___EIS_PROXY = TEMPORAL_QUANTIFIER_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___ERESOURCE = TEMPORAL_QUANTIFIER_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___ECONTAINER = TEMPORAL_QUANTIFIER_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___ECONTAINING_FEATURE = TEMPORAL_QUANTIFIER_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___ECONTAINMENT_FEATURE = TEMPORAL_QUANTIFIER_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___ECONTENTS = TEMPORAL_QUANTIFIER_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___EALL_CONTENTS = TEMPORAL_QUANTIFIER_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___ECROSS_REFERENCES = TEMPORAL_QUANTIFIER_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___EGET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = TEMPORAL_QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = TEMPORAL_QUANTIFIER_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___EIS_SET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___EUNSET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___EINVOKE__EOPERATION_ELIST = TEMPORAL_QUANTIFIER_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___GET_EXTENSION__ECLASS = TEMPORAL_QUANTIFIER_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___PROVIDE_EXTENSION__ECLASS = TEMPORAL_QUANTIFIER_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___GET_ANNOTATION__STRING = TEMPORAL_QUANTIFIER_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR___PROVIDE_ANNOTATION__STRING = TEMPORAL_QUANTIFIER_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>EG Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR_OPERATION_COUNT = TEMPORAL_QUANTIFIER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Quantifiers.impl.QuantifierExprImpl <em>Quantifier Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Quantifiers.impl.QuantifierExprImpl
	 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getQuantifierExpr()
	 * @generated
	 */
	int QUANTIFIER_EXPR = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR__ANNOTATION = MtctlPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR__EXTENSION = MtctlPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR__COMMENT = MtctlPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR__FORMULA = MtctlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR__VAR = MtctlPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quantifier Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR_FEATURE_COUNT = MtctlPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___ECLASS = MtctlPackage.EXPRESSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___EIS_PROXY = MtctlPackage.EXPRESSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___ERESOURCE = MtctlPackage.EXPRESSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___ECONTAINER = MtctlPackage.EXPRESSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___ECONTAINING_FEATURE = MtctlPackage.EXPRESSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___ECONTAINMENT_FEATURE = MtctlPackage.EXPRESSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___ECONTENTS = MtctlPackage.EXPRESSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___EALL_CONTENTS = MtctlPackage.EXPRESSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___ECROSS_REFERENCES = MtctlPackage.EXPRESSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE = MtctlPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = MtctlPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = MtctlPackage.EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___EIS_SET__ESTRUCTURALFEATURE = MtctlPackage.EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___EUNSET__ESTRUCTURALFEATURE = MtctlPackage.EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___EINVOKE__EOPERATION_ELIST = MtctlPackage.EXPRESSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___GET_EXTENSION__ECLASS = MtctlPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___PROVIDE_EXTENSION__ECLASS = MtctlPackage.EXPRESSION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___GET_ANNOTATION__STRING = MtctlPackage.EXPRESSION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR___PROVIDE_ANNOTATION__STRING = MtctlPackage.EXPRESSION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Quantifier Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Quantifiers.impl.ExistenceQuantExprImpl <em>Existence Quant Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Quantifiers.impl.ExistenceQuantExprImpl
	 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getExistenceQuantExpr()
	 * @generated
	 */
	int EXISTENCE_QUANT_EXPR = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR__ANNOTATION = QUANTIFIER_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR__EXTENSION = QUANTIFIER_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR__COMMENT = QUANTIFIER_EXPR__COMMENT;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR__FORMULA = QUANTIFIER_EXPR__FORMULA;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR__VAR = QUANTIFIER_EXPR__VAR;

	/**
	 * The number of structural features of the '<em>Existence Quant Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR_FEATURE_COUNT = QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___ECLASS = QUANTIFIER_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___EIS_PROXY = QUANTIFIER_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___ERESOURCE = QUANTIFIER_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___ECONTAINER = QUANTIFIER_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___ECONTAINING_FEATURE = QUANTIFIER_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___ECONTAINMENT_FEATURE = QUANTIFIER_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___ECONTENTS = QUANTIFIER_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___EALL_CONTENTS = QUANTIFIER_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___ECROSS_REFERENCES = QUANTIFIER_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___EGET__ESTRUCTURALFEATURE = QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = QUANTIFIER_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___EIS_SET__ESTRUCTURALFEATURE = QUANTIFIER_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___EUNSET__ESTRUCTURALFEATURE = QUANTIFIER_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___EINVOKE__EOPERATION_ELIST = QUANTIFIER_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___GET_EXTENSION__ECLASS = QUANTIFIER_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___PROVIDE_EXTENSION__ECLASS = QUANTIFIER_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___GET_ANNOTATION__STRING = QUANTIFIER_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR___PROVIDE_ANNOTATION__STRING = QUANTIFIER_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Existence Quant Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR_OPERATION_COUNT = QUANTIFIER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Quantifiers.impl.BoundVariableImpl <em>Bound Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Quantifiers.impl.BoundVariableImpl
	 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getBoundVariable()
	 * @generated
	 */
	int BOUND_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE__ANNOTATION = MtctlPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE__EXTENSION = MtctlPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE__COMMENT = MtctlPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE__SET = MtctlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE__NAME = MtctlPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bound Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE_FEATURE_COUNT = MtctlPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___ECLASS = MtctlPackage.EXPRESSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___EIS_PROXY = MtctlPackage.EXPRESSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___ERESOURCE = MtctlPackage.EXPRESSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___ECONTAINER = MtctlPackage.EXPRESSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___ECONTAINING_FEATURE = MtctlPackage.EXPRESSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___ECONTAINMENT_FEATURE = MtctlPackage.EXPRESSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___ECONTENTS = MtctlPackage.EXPRESSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___EALL_CONTENTS = MtctlPackage.EXPRESSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___ECROSS_REFERENCES = MtctlPackage.EXPRESSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___EGET__ESTRUCTURALFEATURE = MtctlPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = MtctlPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = MtctlPackage.EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = MtctlPackage.EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___EUNSET__ESTRUCTURALFEATURE = MtctlPackage.EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___EINVOKE__EOPERATION_ELIST = MtctlPackage.EXPRESSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___GET_EXTENSION__ECLASS = MtctlPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___PROVIDE_EXTENSION__ECLASS = MtctlPackage.EXPRESSION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___GET_ANNOTATION__STRING = MtctlPackage.EXPRESSION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE___PROVIDE_ANNOTATION__STRING = MtctlPackage.EXPRESSION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Bound Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Quantifiers.impl.UniversalQuantExprImpl <em>Universal Quant Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Quantifiers.impl.UniversalQuantExprImpl
	 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getUniversalQuantExpr()
	 * @generated
	 */
	int UNIVERSAL_QUANT_EXPR = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR__ANNOTATION = QUANTIFIER_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR__EXTENSION = QUANTIFIER_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR__COMMENT = QUANTIFIER_EXPR__COMMENT;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR__FORMULA = QUANTIFIER_EXPR__FORMULA;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR__VAR = QUANTIFIER_EXPR__VAR;

	/**
	 * The number of structural features of the '<em>Universal Quant Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR_FEATURE_COUNT = QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___ECLASS = QUANTIFIER_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___EIS_PROXY = QUANTIFIER_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___ERESOURCE = QUANTIFIER_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___ECONTAINER = QUANTIFIER_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___ECONTAINING_FEATURE = QUANTIFIER_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___ECONTAINMENT_FEATURE = QUANTIFIER_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___ECONTENTS = QUANTIFIER_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___EALL_CONTENTS = QUANTIFIER_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___ECROSS_REFERENCES = QUANTIFIER_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___EGET__ESTRUCTURALFEATURE = QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = QUANTIFIER_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___EIS_SET__ESTRUCTURALFEATURE = QUANTIFIER_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___EUNSET__ESTRUCTURALFEATURE = QUANTIFIER_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___EINVOKE__EOPERATION_ELIST = QUANTIFIER_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___GET_EXTENSION__ECLASS = QUANTIFIER_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___PROVIDE_EXTENSION__ECLASS = QUANTIFIER_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___GET_ANNOTATION__STRING = QUANTIFIER_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR___PROVIDE_ANNOTATION__STRING = QUANTIFIER_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Universal Quant Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR_OPERATION_COUNT = QUANTIFIER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Quantifiers.impl.LeadsToExprImpl <em>Leads To Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Quantifiers.impl.LeadsToExprImpl
	 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getLeadsToExpr()
	 * @generated
	 */
	int LEADS_TO_EXPR = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR__ANNOTATION = TEMPORAL_QUANTIFIER_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR__EXTENSION = TEMPORAL_QUANTIFIER_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR__COMMENT = TEMPORAL_QUANTIFIER_EXPR__COMMENT;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR__EXPR = TEMPORAL_QUANTIFIER_EXPR__EXPR;

	/**
	 * The feature id for the '<em><b>Left Opd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR__LEFT_OPD = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Opd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR__RIGHT_OPD = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Leads To Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR_FEATURE_COUNT = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___ECLASS = TEMPORAL_QUANTIFIER_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___EIS_PROXY = TEMPORAL_QUANTIFIER_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___ERESOURCE = TEMPORAL_QUANTIFIER_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___ECONTAINER = TEMPORAL_QUANTIFIER_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___ECONTAINING_FEATURE = TEMPORAL_QUANTIFIER_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___ECONTAINMENT_FEATURE = TEMPORAL_QUANTIFIER_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___ECONTENTS = TEMPORAL_QUANTIFIER_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___EALL_CONTENTS = TEMPORAL_QUANTIFIER_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___ECROSS_REFERENCES = TEMPORAL_QUANTIFIER_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___EGET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = TEMPORAL_QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = TEMPORAL_QUANTIFIER_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___EIS_SET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___EUNSET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___EINVOKE__EOPERATION_ELIST = TEMPORAL_QUANTIFIER_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___GET_EXTENSION__ECLASS = TEMPORAL_QUANTIFIER_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___PROVIDE_EXTENSION__ECLASS = TEMPORAL_QUANTIFIER_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___GET_ANNOTATION__STRING = TEMPORAL_QUANTIFIER_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR___PROVIDE_ANNOTATION__STRING = TEMPORAL_QUANTIFIER_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Leads To Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR_OPERATION_COUNT = TEMPORAL_QUANTIFIER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mtctl.Quantifiers.impl.TimeIntervalExprImpl <em>Time Interval Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mtctl.Quantifiers.impl.TimeIntervalExprImpl
	 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getTimeIntervalExpr()
	 * @generated
	 */
	int TIME_INTERVAL_EXPR = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR__ANNOTATION = TEMPORAL_QUANTIFIER_EXPR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR__EXTENSION = TEMPORAL_QUANTIFIER_EXPR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR__COMMENT = TEMPORAL_QUANTIFIER_EXPR__COMMENT;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR__EXPR = TEMPORAL_QUANTIFIER_EXPR__EXPR;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR__LHS = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR__LOWER = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR__UPPER = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR__RHS = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Time Interval Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR_FEATURE_COUNT = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___ECLASS = TEMPORAL_QUANTIFIER_EXPR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___EIS_PROXY = TEMPORAL_QUANTIFIER_EXPR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___ERESOURCE = TEMPORAL_QUANTIFIER_EXPR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___ECONTAINER = TEMPORAL_QUANTIFIER_EXPR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___ECONTAINING_FEATURE = TEMPORAL_QUANTIFIER_EXPR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___ECONTAINMENT_FEATURE = TEMPORAL_QUANTIFIER_EXPR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___ECONTENTS = TEMPORAL_QUANTIFIER_EXPR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___EALL_CONTENTS = TEMPORAL_QUANTIFIER_EXPR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___ECROSS_REFERENCES = TEMPORAL_QUANTIFIER_EXPR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___EGET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN = TEMPORAL_QUANTIFIER_EXPR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT = TEMPORAL_QUANTIFIER_EXPR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___EIS_SET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___EUNSET__ESTRUCTURALFEATURE = TEMPORAL_QUANTIFIER_EXPR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___EINVOKE__EOPERATION_ELIST = TEMPORAL_QUANTIFIER_EXPR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___GET_EXTENSION__ECLASS = TEMPORAL_QUANTIFIER_EXPR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___PROVIDE_EXTENSION__ECLASS = TEMPORAL_QUANTIFIER_EXPR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___GET_ANNOTATION__STRING = TEMPORAL_QUANTIFIER_EXPR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR___PROVIDE_ANNOTATION__STRING = TEMPORAL_QUANTIFIER_EXPR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Time Interval Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR_OPERATION_COUNT = TEMPORAL_QUANTIFIER_EXPR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link mtctl.Quantifiers.AFExpr <em>AF Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AF Expr</em>'.
	 * @see mtctl.Quantifiers.AFExpr
	 * @generated
	 */
	EClass getAFExpr();

	/**
	 * Returns the meta object for class '{@link mtctl.Quantifiers.AGExpr <em>AG Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AG Expr</em>'.
	 * @see mtctl.Quantifiers.AGExpr
	 * @generated
	 */
	EClass getAGExpr();

	/**
	 * Returns the meta object for class '{@link mtctl.Quantifiers.EFExpr <em>EF Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EF Expr</em>'.
	 * @see mtctl.Quantifiers.EFExpr
	 * @generated
	 */
	EClass getEFExpr();

	/**
	 * Returns the meta object for class '{@link mtctl.Quantifiers.EGExpr <em>EG Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EG Expr</em>'.
	 * @see mtctl.Quantifiers.EGExpr
	 * @generated
	 */
	EClass getEGExpr();

	/**
	 * Returns the meta object for class '{@link mtctl.Quantifiers.ExistenceQuantExpr <em>Existence Quant Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existence Quant Expr</em>'.
	 * @see mtctl.Quantifiers.ExistenceQuantExpr
	 * @generated
	 */
	EClass getExistenceQuantExpr();

	/**
	 * Returns the meta object for class '{@link mtctl.Quantifiers.QuantifierExpr <em>Quantifier Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantifier Expr</em>'.
	 * @see mtctl.Quantifiers.QuantifierExpr
	 * @generated
	 */
	EClass getQuantifierExpr();

	/**
	 * Returns the meta object for the containment reference '{@link mtctl.Quantifiers.QuantifierExpr#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula</em>'.
	 * @see mtctl.Quantifiers.QuantifierExpr#getFormula()
	 * @see #getQuantifierExpr()
	 * @generated
	 */
	EReference getQuantifierExpr_Formula();

	/**
	 * Returns the meta object for the containment reference '{@link mtctl.Quantifiers.QuantifierExpr#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var</em>'.
	 * @see mtctl.Quantifiers.QuantifierExpr#getVar()
	 * @see #getQuantifierExpr()
	 * @generated
	 */
	EReference getQuantifierExpr_Var();

	/**
	 * Returns the meta object for class '{@link mtctl.Quantifiers.BoundVariable <em>Bound Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound Variable</em>'.
	 * @see mtctl.Quantifiers.BoundVariable
	 * @generated
	 */
	EClass getBoundVariable();

	/**
	 * Returns the meta object for the containment reference '{@link mtctl.Quantifiers.BoundVariable#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set</em>'.
	 * @see mtctl.Quantifiers.BoundVariable#getSet()
	 * @see #getBoundVariable()
	 * @generated
	 */
	EReference getBoundVariable_Set();

	/**
	 * Returns the meta object for the attribute '{@link mtctl.Quantifiers.BoundVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mtctl.Quantifiers.BoundVariable#getName()
	 * @see #getBoundVariable()
	 * @generated
	 */
	EAttribute getBoundVariable_Name();

	/**
	 * Returns the meta object for class '{@link mtctl.Quantifiers.TemporalQuantifierExpr <em>Temporal Quantifier Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Quantifier Expr</em>'.
	 * @see mtctl.Quantifiers.TemporalQuantifierExpr
	 * @generated
	 */
	EClass getTemporalQuantifierExpr();

	/**
	 * Returns the meta object for the containment reference '{@link mtctl.Quantifiers.TemporalQuantifierExpr#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see mtctl.Quantifiers.TemporalQuantifierExpr#getExpr()
	 * @see #getTemporalQuantifierExpr()
	 * @generated
	 */
	EReference getTemporalQuantifierExpr_Expr();

	/**
	 * Returns the meta object for class '{@link mtctl.Quantifiers.UniversalQuantExpr <em>Universal Quant Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universal Quant Expr</em>'.
	 * @see mtctl.Quantifiers.UniversalQuantExpr
	 * @generated
	 */
	EClass getUniversalQuantExpr();

	/**
	 * Returns the meta object for class '{@link mtctl.Quantifiers.LeadsToExpr <em>Leads To Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leads To Expr</em>'.
	 * @see mtctl.Quantifiers.LeadsToExpr
	 * @generated
	 */
	EClass getLeadsToExpr();

	/**
	 * Returns the meta object for the containment reference '{@link mtctl.Quantifiers.LeadsToExpr#getLeftOpd <em>Left Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Opd</em>'.
	 * @see mtctl.Quantifiers.LeadsToExpr#getLeftOpd()
	 * @see #getLeadsToExpr()
	 * @generated
	 */
	EReference getLeadsToExpr_LeftOpd();

	/**
	 * Returns the meta object for the containment reference '{@link mtctl.Quantifiers.LeadsToExpr#getRightOpd <em>Right Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Opd</em>'.
	 * @see mtctl.Quantifiers.LeadsToExpr#getRightOpd()
	 * @see #getLeadsToExpr()
	 * @generated
	 */
	EReference getLeadsToExpr_RightOpd();

	/**
	 * Returns the meta object for class '{@link mtctl.Quantifiers.TimeIntervalExpr <em>Time Interval Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval Expr</em>'.
	 * @see mtctl.Quantifiers.TimeIntervalExpr
	 * @generated
	 */
	EClass getTimeIntervalExpr();

	/**
	 * Returns the meta object for the containment reference '{@link mtctl.Quantifiers.TimeIntervalExpr#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see mtctl.Quantifiers.TimeIntervalExpr#getLhs()
	 * @see #getTimeIntervalExpr()
	 * @generated
	 */
	EReference getTimeIntervalExpr_Lhs();

	/**
	 * Returns the meta object for the attribute '{@link mtctl.Quantifiers.TimeIntervalExpr#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see mtctl.Quantifiers.TimeIntervalExpr#getLower()
	 * @see #getTimeIntervalExpr()
	 * @generated
	 */
	EAttribute getTimeIntervalExpr_Lower();

	/**
	 * Returns the meta object for the attribute '{@link mtctl.Quantifiers.TimeIntervalExpr#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see mtctl.Quantifiers.TimeIntervalExpr#getUpper()
	 * @see #getTimeIntervalExpr()
	 * @generated
	 */
	EAttribute getTimeIntervalExpr_Upper();

	/**
	 * Returns the meta object for the containment reference '{@link mtctl.Quantifiers.TimeIntervalExpr#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see mtctl.Quantifiers.TimeIntervalExpr#getRhs()
	 * @see #getTimeIntervalExpr()
	 * @generated
	 */
	EReference getTimeIntervalExpr_Rhs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuantifiersFactory getQuantifiersFactory();

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
		 * The meta object literal for the '{@link mtctl.Quantifiers.impl.AFExprImpl <em>AF Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Quantifiers.impl.AFExprImpl
		 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getAFExpr()
		 * @generated
		 */
		EClass AF_EXPR = eINSTANCE.getAFExpr();

		/**
		 * The meta object literal for the '{@link mtctl.Quantifiers.impl.AGExprImpl <em>AG Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Quantifiers.impl.AGExprImpl
		 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getAGExpr()
		 * @generated
		 */
		EClass AG_EXPR = eINSTANCE.getAGExpr();

		/**
		 * The meta object literal for the '{@link mtctl.Quantifiers.impl.EFExprImpl <em>EF Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Quantifiers.impl.EFExprImpl
		 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getEFExpr()
		 * @generated
		 */
		EClass EF_EXPR = eINSTANCE.getEFExpr();

		/**
		 * The meta object literal for the '{@link mtctl.Quantifiers.impl.EGExprImpl <em>EG Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Quantifiers.impl.EGExprImpl
		 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getEGExpr()
		 * @generated
		 */
		EClass EG_EXPR = eINSTANCE.getEGExpr();

		/**
		 * The meta object literal for the '{@link mtctl.Quantifiers.impl.ExistenceQuantExprImpl <em>Existence Quant Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Quantifiers.impl.ExistenceQuantExprImpl
		 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getExistenceQuantExpr()
		 * @generated
		 */
		EClass EXISTENCE_QUANT_EXPR = eINSTANCE.getExistenceQuantExpr();

		/**
		 * The meta object literal for the '{@link mtctl.Quantifiers.impl.QuantifierExprImpl <em>Quantifier Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Quantifiers.impl.QuantifierExprImpl
		 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getQuantifierExpr()
		 * @generated
		 */
		EClass QUANTIFIER_EXPR = eINSTANCE.getQuantifierExpr();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIER_EXPR__FORMULA = eINSTANCE.getQuantifierExpr_Formula();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIER_EXPR__VAR = eINSTANCE.getQuantifierExpr_Var();

		/**
		 * The meta object literal for the '{@link mtctl.Quantifiers.impl.BoundVariableImpl <em>Bound Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Quantifiers.impl.BoundVariableImpl
		 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getBoundVariable()
		 * @generated
		 */
		EClass BOUND_VARIABLE = eINSTANCE.getBoundVariable();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUND_VARIABLE__SET = eINSTANCE.getBoundVariable_Set();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUND_VARIABLE__NAME = eINSTANCE.getBoundVariable_Name();

		/**
		 * The meta object literal for the '{@link mtctl.Quantifiers.impl.TemporalQuantifierExprImpl <em>Temporal Quantifier Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Quantifiers.impl.TemporalQuantifierExprImpl
		 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getTemporalQuantifierExpr()
		 * @generated
		 */
		EClass TEMPORAL_QUANTIFIER_EXPR = eINSTANCE.getTemporalQuantifierExpr();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_QUANTIFIER_EXPR__EXPR = eINSTANCE.getTemporalQuantifierExpr_Expr();

		/**
		 * The meta object literal for the '{@link mtctl.Quantifiers.impl.UniversalQuantExprImpl <em>Universal Quant Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Quantifiers.impl.UniversalQuantExprImpl
		 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getUniversalQuantExpr()
		 * @generated
		 */
		EClass UNIVERSAL_QUANT_EXPR = eINSTANCE.getUniversalQuantExpr();

		/**
		 * The meta object literal for the '{@link mtctl.Quantifiers.impl.LeadsToExprImpl <em>Leads To Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Quantifiers.impl.LeadsToExprImpl
		 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getLeadsToExpr()
		 * @generated
		 */
		EClass LEADS_TO_EXPR = eINSTANCE.getLeadsToExpr();

		/**
		 * The meta object literal for the '<em><b>Left Opd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADS_TO_EXPR__LEFT_OPD = eINSTANCE.getLeadsToExpr_LeftOpd();

		/**
		 * The meta object literal for the '<em><b>Right Opd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADS_TO_EXPR__RIGHT_OPD = eINSTANCE.getLeadsToExpr_RightOpd();

		/**
		 * The meta object literal for the '{@link mtctl.Quantifiers.impl.TimeIntervalExprImpl <em>Time Interval Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mtctl.Quantifiers.impl.TimeIntervalExprImpl
		 * @see mtctl.Quantifiers.impl.QuantifiersPackageImpl#getTimeIntervalExpr()
		 * @generated
		 */
		EClass TIME_INTERVAL_EXPR = eINSTANCE.getTimeIntervalExpr();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_INTERVAL_EXPR__LHS = eINSTANCE.getTimeIntervalExpr_Lhs();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL_EXPR__LOWER = eINSTANCE.getTimeIntervalExpr_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL_EXPR__UPPER = eINSTANCE.getTimeIntervalExpr_Upper();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_INTERVAL_EXPR__RHS = eINSTANCE.getTimeIntervalExpr_Rhs();

	}

} //QuantifiersPackage
