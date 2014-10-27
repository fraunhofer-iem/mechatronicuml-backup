/**
 */
package pattern;

import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.storydriven.core.CorePackage;

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
 * @see pattern.PatternFactory
 * @model kind="package"
 * @generated
 */
public interface PatternPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pattern";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/pattern/0.3.18";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pattern";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternPackage eINSTANCE = pattern.impl.PatternPackageImpl.init();

	/**
	 * The meta object id for the '{@link pattern.impl.AdaptedFromCoordinationPatternImpl <em>Adapted From Coordination Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.impl.AdaptedFromCoordinationPatternImpl
	 * @see pattern.impl.PatternPackageImpl#getAdaptedFromCoordinationPattern()
	 * @generated
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN__ANNOTATION = CorePackage.EXTENSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN__EXTENSION = CorePackage.EXTENSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN__BASE = CorePackage.EXTENSION__BASE;

	/**
	 * The feature id for the '<em><b>Model Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN__MODEL_BASE = CorePackage.EXTENSION__MODEL_BASE;

	/**
	 * The feature id for the '<em><b>Owning Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN__OWNING_ANNOTATION = CorePackage.EXTENSION__OWNING_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The feature id for the '<em><b>Adapted Pattern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN__ADAPTED_PATTERN = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adapted From Coordination Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___ECLASS = CorePackage.EXTENSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___EIS_PROXY = CorePackage.EXTENSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___ERESOURCE = CorePackage.EXTENSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___ECONTAINER = CorePackage.EXTENSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___ECONTAINING_FEATURE = CorePackage.EXTENSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___ECONTAINMENT_FEATURE = CorePackage.EXTENSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___ECONTENTS = CorePackage.EXTENSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___EALL_CONTENTS = CorePackage.EXTENSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___ECROSS_REFERENCES = CorePackage.EXTENSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___GET_EXTENSION__ECLASS = CorePackage.EXTENSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___PROVIDE_EXTENSION__ECLASS = CorePackage.EXTENSION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___GET_ANNOTATION__STRING = CorePackage.EXTENSION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN___PROVIDE_ANNOTATION__STRING = CorePackage.EXTENSION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Adapted From Coordination Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_FROM_COORDINATION_PATTERN_OPERATION_COUNT = CorePackage.EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pattern.impl.CoordinationPatternImpl <em>Coordination Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.impl.CoordinationPatternImpl
	 * @see pattern.impl.PatternPackageImpl#getCoordinationPattern()
	 * @generated
	 */
	int COORDINATION_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__ANNOTATION = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__EXTENSION = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__NAME = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__COMMENT = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Verification Constraint Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__VERIFICATION_CONSTRAINT_REPOSITORIES = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__VERIFICATION_CONSTRAINT_REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__ROLES = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES;

	/**
	 * The feature id for the '<em><b>Role Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__ROLE_CONNECTOR = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Description Aspects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__DESCRIPTION_ASPECTS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Legal Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__LEGAL_CONFIGURATIONS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pattern Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__PATTERN_PARAMETERS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Combineable Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__COMBINEABLE_PATTERNS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alternative Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__ALTERNATIVE_PATTERNS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gmf Coordination Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN__GMF_COORDINATION_PATTERN = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Coordination Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_FEATURE_COUNT = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ECLASS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___EIS_PROXY = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ERESOURCE = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ECONTAINER = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ECONTAINING_FEATURE = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ECONTAINMENT_FEATURE = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ECONTENTS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___EALL_CONTENTS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ECROSS_REFERENCES = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___EGET__ESTRUCTURALFEATURE = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___EGET__ESTRUCTURALFEATURE_BOOLEAN = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___ESET__ESTRUCTURALFEATURE_OBJECT = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___EIS_SET__ESTRUCTURALFEATURE = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___EUNSET__ESTRUCTURALFEATURE = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___EINVOKE__EOPERATION_ELIST = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___GET_EXTENSION__ECLASS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___PROVIDE_EXTENSION__ECLASS = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___GET_ANNOTATION__STRING = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN___PROVIDE_ANNOTATION__STRING = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Coordination Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PATTERN_OPERATION_COUNT = ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pattern.impl.PlainTextualDescriptionAspectsImpl <em>Plain Textual Description Aspects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.impl.PlainTextualDescriptionAspectsImpl
	 * @see pattern.impl.PatternPackageImpl#getPlainTextualDescriptionAspects()
	 * @generated
	 */
	int PLAIN_TEXTUAL_DESCRIPTION_ASPECTS = 2;

	/**
	 * The feature id for the '<em><b>Overview</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__OVERVIEW = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__PROBLEM = 2;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__SOLUTION = 3;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__STRUCTURE = 4;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__BEHAVIOR = 5;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__EXAMPLES = 6;

	/**
	 * The feature id for the '<em><b>Consequences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONSEQUENCES = 7;

	/**
	 * The feature id for the '<em><b>Combineability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__COMBINEABILITY = 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__VARIANTS = 9;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__ALTERNATIVES = 10;

	/**
	 * The number of structural features of the '<em>Plain Textual Description Aspects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXTUAL_DESCRIPTION_ASPECTS_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Plain Textual Description Aspects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXTUAL_DESCRIPTION_ASPECTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pattern.impl.LegalConfigurationImpl <em>Legal Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.impl.LegalConfigurationImpl
	 * @see pattern.impl.PatternPackageImpl#getLegalConfiguration()
	 * @generated
	 */
	int LEGAL_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION__PARAMETER_BINDINGS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coordination Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION__COORDINATION_PATTERN = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Legal Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Legal Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONFIGURATION_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pattern.AdaptedFromCoordinationPattern <em>Adapted From Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapted From Coordination Pattern</em>'.
	 * @see pattern.AdaptedFromCoordinationPattern
	 * @generated
	 */
	EClass getAdaptedFromCoordinationPattern();

	/**
	 * Returns the meta object for the reference list '{@link pattern.AdaptedFromCoordinationPattern#getAdaptedPattern <em>Adapted Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Adapted Pattern</em>'.
	 * @see pattern.AdaptedFromCoordinationPattern#getAdaptedPattern()
	 * @see #getAdaptedFromCoordinationPattern()
	 * @generated
	 */
	EReference getAdaptedFromCoordinationPattern_AdaptedPattern();

	/**
	 * Returns the meta object for class '{@link pattern.CoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Pattern</em>'.
	 * @see pattern.CoordinationPattern
	 * @generated
	 */
	EClass getCoordinationPattern();

	/**
	 * Returns the meta object for the containment reference '{@link pattern.CoordinationPattern#getDescriptionAspects <em>Description Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Aspects</em>'.
	 * @see pattern.CoordinationPattern#getDescriptionAspects()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_DescriptionAspects();

	/**
	 * Returns the meta object for the containment reference list '{@link pattern.CoordinationPattern#getLegalConfigurations <em>Legal Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legal Configurations</em>'.
	 * @see pattern.CoordinationPattern#getLegalConfigurations()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_LegalConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link pattern.CoordinationPattern#getPatternParameters <em>Pattern Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern Parameters</em>'.
	 * @see pattern.CoordinationPattern#getPatternParameters()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_PatternParameters();

	/**
	 * Returns the meta object for the reference list '{@link pattern.CoordinationPattern#getCombineablePatterns <em>Combineable Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Combineable Patterns</em>'.
	 * @see pattern.CoordinationPattern#getCombineablePatterns()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_CombineablePatterns();

	/**
	 * Returns the meta object for the reference list '{@link pattern.CoordinationPattern#getAlternativePatterns <em>Alternative Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alternative Patterns</em>'.
	 * @see pattern.CoordinationPattern#getAlternativePatterns()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_AlternativePatterns();

	/**
	 * Returns the meta object for the containment reference '{@link pattern.CoordinationPattern#getGmfCoordinationPattern <em>Gmf Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gmf Coordination Pattern</em>'.
	 * @see pattern.CoordinationPattern#getGmfCoordinationPattern()
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	EReference getCoordinationPattern_GmfCoordinationPattern();

	/**
	 * Returns the meta object for class '{@link pattern.PlainTextualDescriptionAspects <em>Plain Textual Description Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Textual Description Aspects</em>'.
	 * @see pattern.PlainTextualDescriptionAspects
	 * @generated
	 */
	EClass getPlainTextualDescriptionAspects();

	/**
	 * Returns the meta object for the attribute '{@link pattern.PlainTextualDescriptionAspects#getOverview <em>Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overview</em>'.
	 * @see pattern.PlainTextualDescriptionAspects#getOverview()
	 * @see #getPlainTextualDescriptionAspects()
	 * @generated
	 */
	EAttribute getPlainTextualDescriptionAspects_Overview();

	/**
	 * Returns the meta object for the attribute '{@link pattern.PlainTextualDescriptionAspects#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see pattern.PlainTextualDescriptionAspects#getContext()
	 * @see #getPlainTextualDescriptionAspects()
	 * @generated
	 */
	EAttribute getPlainTextualDescriptionAspects_Context();

	/**
	 * Returns the meta object for the attribute '{@link pattern.PlainTextualDescriptionAspects#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Problem</em>'.
	 * @see pattern.PlainTextualDescriptionAspects#getProblem()
	 * @see #getPlainTextualDescriptionAspects()
	 * @generated
	 */
	EAttribute getPlainTextualDescriptionAspects_Problem();

	/**
	 * Returns the meta object for the attribute '{@link pattern.PlainTextualDescriptionAspects#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solution</em>'.
	 * @see pattern.PlainTextualDescriptionAspects#getSolution()
	 * @see #getPlainTextualDescriptionAspects()
	 * @generated
	 */
	EAttribute getPlainTextualDescriptionAspects_Solution();

	/**
	 * Returns the meta object for the attribute '{@link pattern.PlainTextualDescriptionAspects#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure</em>'.
	 * @see pattern.PlainTextualDescriptionAspects#getStructure()
	 * @see #getPlainTextualDescriptionAspects()
	 * @generated
	 */
	EAttribute getPlainTextualDescriptionAspects_Structure();

	/**
	 * Returns the meta object for the attribute '{@link pattern.PlainTextualDescriptionAspects#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see pattern.PlainTextualDescriptionAspects#getBehavior()
	 * @see #getPlainTextualDescriptionAspects()
	 * @generated
	 */
	EAttribute getPlainTextualDescriptionAspects_Behavior();

	/**
	 * Returns the meta object for the attribute '{@link pattern.PlainTextualDescriptionAspects#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Examples</em>'.
	 * @see pattern.PlainTextualDescriptionAspects#getExamples()
	 * @see #getPlainTextualDescriptionAspects()
	 * @generated
	 */
	EAttribute getPlainTextualDescriptionAspects_Examples();

	/**
	 * Returns the meta object for the attribute '{@link pattern.PlainTextualDescriptionAspects#getConsequences <em>Consequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consequences</em>'.
	 * @see pattern.PlainTextualDescriptionAspects#getConsequences()
	 * @see #getPlainTextualDescriptionAspects()
	 * @generated
	 */
	EAttribute getPlainTextualDescriptionAspects_Consequences();

	/**
	 * Returns the meta object for the attribute '{@link pattern.PlainTextualDescriptionAspects#getCombineability <em>Combineability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Combineability</em>'.
	 * @see pattern.PlainTextualDescriptionAspects#getCombineability()
	 * @see #getPlainTextualDescriptionAspects()
	 * @generated
	 */
	EAttribute getPlainTextualDescriptionAspects_Combineability();

	/**
	 * Returns the meta object for the attribute '{@link pattern.PlainTextualDescriptionAspects#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variants</em>'.
	 * @see pattern.PlainTextualDescriptionAspects#getVariants()
	 * @see #getPlainTextualDescriptionAspects()
	 * @generated
	 */
	EAttribute getPlainTextualDescriptionAspects_Variants();

	/**
	 * Returns the meta object for the attribute '{@link pattern.PlainTextualDescriptionAspects#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternatives</em>'.
	 * @see pattern.PlainTextualDescriptionAspects#getAlternatives()
	 * @see #getPlainTextualDescriptionAspects()
	 * @generated
	 */
	EAttribute getPlainTextualDescriptionAspects_Alternatives();

	/**
	 * Returns the meta object for class '{@link pattern.LegalConfiguration <em>Legal Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Configuration</em>'.
	 * @see pattern.LegalConfiguration
	 * @generated
	 */
	EClass getLegalConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link pattern.LegalConfiguration#getParameterBindings <em>Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Bindings</em>'.
	 * @see pattern.LegalConfiguration#getParameterBindings()
	 * @see #getLegalConfiguration()
	 * @generated
	 */
	EReference getLegalConfiguration_ParameterBindings();

	/**
	 * Returns the meta object for the container reference '{@link pattern.LegalConfiguration#getCoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Coordination Pattern</em>'.
	 * @see pattern.LegalConfiguration#getCoordinationPattern()
	 * @see #getLegalConfiguration()
	 * @generated
	 */
	EReference getLegalConfiguration_CoordinationPattern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternFactory getPatternFactory();

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
		 * The meta object literal for the '{@link pattern.impl.AdaptedFromCoordinationPatternImpl <em>Adapted From Coordination Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.impl.AdaptedFromCoordinationPatternImpl
		 * @see pattern.impl.PatternPackageImpl#getAdaptedFromCoordinationPattern()
		 * @generated
		 */
		EClass ADAPTED_FROM_COORDINATION_PATTERN = eINSTANCE.getAdaptedFromCoordinationPattern();

		/**
		 * The meta object literal for the '<em><b>Adapted Pattern</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTED_FROM_COORDINATION_PATTERN__ADAPTED_PATTERN = eINSTANCE.getAdaptedFromCoordinationPattern_AdaptedPattern();

		/**
		 * The meta object literal for the '{@link pattern.impl.CoordinationPatternImpl <em>Coordination Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.impl.CoordinationPatternImpl
		 * @see pattern.impl.PatternPackageImpl#getCoordinationPattern()
		 * @generated
		 */
		EClass COORDINATION_PATTERN = eINSTANCE.getCoordinationPattern();

		/**
		 * The meta object literal for the '<em><b>Description Aspects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PATTERN__DESCRIPTION_ASPECTS = eINSTANCE.getCoordinationPattern_DescriptionAspects();

		/**
		 * The meta object literal for the '<em><b>Legal Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PATTERN__LEGAL_CONFIGURATIONS = eINSTANCE.getCoordinationPattern_LegalConfigurations();

		/**
		 * The meta object literal for the '<em><b>Pattern Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PATTERN__PATTERN_PARAMETERS = eINSTANCE.getCoordinationPattern_PatternParameters();

		/**
		 * The meta object literal for the '<em><b>Combineable Patterns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PATTERN__COMBINEABLE_PATTERNS = eINSTANCE.getCoordinationPattern_CombineablePatterns();

		/**
		 * The meta object literal for the '<em><b>Alternative Patterns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PATTERN__ALTERNATIVE_PATTERNS = eINSTANCE.getCoordinationPattern_AlternativePatterns();

		/**
		 * The meta object literal for the '<em><b>Gmf Coordination Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PATTERN__GMF_COORDINATION_PATTERN = eINSTANCE.getCoordinationPattern_GmfCoordinationPattern();

		/**
		 * The meta object literal for the '{@link pattern.impl.PlainTextualDescriptionAspectsImpl <em>Plain Textual Description Aspects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.impl.PlainTextualDescriptionAspectsImpl
		 * @see pattern.impl.PatternPackageImpl#getPlainTextualDescriptionAspects()
		 * @generated
		 */
		EClass PLAIN_TEXTUAL_DESCRIPTION_ASPECTS = eINSTANCE.getPlainTextualDescriptionAspects();

		/**
		 * The meta object literal for the '<em><b>Overview</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__OVERVIEW = eINSTANCE.getPlainTextualDescriptionAspects_Overview();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONTEXT = eINSTANCE.getPlainTextualDescriptionAspects_Context();

		/**
		 * The meta object literal for the '<em><b>Problem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__PROBLEM = eINSTANCE.getPlainTextualDescriptionAspects_Problem();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__SOLUTION = eINSTANCE.getPlainTextualDescriptionAspects_Solution();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__STRUCTURE = eINSTANCE.getPlainTextualDescriptionAspects_Structure();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__BEHAVIOR = eINSTANCE.getPlainTextualDescriptionAspects_Behavior();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__EXAMPLES = eINSTANCE.getPlainTextualDescriptionAspects_Examples();

		/**
		 * The meta object literal for the '<em><b>Consequences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONSEQUENCES = eINSTANCE.getPlainTextualDescriptionAspects_Consequences();

		/**
		 * The meta object literal for the '<em><b>Combineability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__COMBINEABILITY = eINSTANCE.getPlainTextualDescriptionAspects_Combineability();

		/**
		 * The meta object literal for the '<em><b>Variants</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__VARIANTS = eINSTANCE.getPlainTextualDescriptionAspects_Variants();

		/**
		 * The meta object literal for the '<em><b>Alternatives</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__ALTERNATIVES = eINSTANCE.getPlainTextualDescriptionAspects_Alternatives();

		/**
		 * The meta object literal for the '{@link pattern.impl.LegalConfigurationImpl <em>Legal Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.impl.LegalConfigurationImpl
		 * @see pattern.impl.PatternPackageImpl#getLegalConfiguration()
		 * @generated
		 */
		EClass LEGAL_CONFIGURATION = eINSTANCE.getLegalConfiguration();

		/**
		 * The meta object literal for the '<em><b>Parameter Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_CONFIGURATION__PARAMETER_BINDINGS = eINSTANCE.getLegalConfiguration_ParameterBindings();

		/**
		 * The meta object literal for the '<em><b>Coordination Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_CONFIGURATION__COORDINATION_PATTERN = eINSTANCE.getLegalConfiguration_CoordinationPattern();

	}

} //PatternPackage
