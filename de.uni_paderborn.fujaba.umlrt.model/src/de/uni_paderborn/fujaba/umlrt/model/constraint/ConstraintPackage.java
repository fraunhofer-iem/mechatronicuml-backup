/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.constraint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.SDMPackage;

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
 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintFactory
 * @model kind="package"
 * @generated
 */
public interface ConstraintPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "constraint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/uni_paderborn/fujaba/umlrt/model/constraint";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "constraint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintPackage eINSTANCE = de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ANNOTATION = SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXTENSION = SDMPackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Correctness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CORRECTNESS = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__BACKGROUND = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constrainable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINABLE_ELEMENT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___ECLASS = SDMPackage.EXTENDABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___EIS_PROXY = SDMPackage.EXTENDABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___ERESOURCE = SDMPackage.EXTENDABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___ECONTAINER = SDMPackage.EXTENDABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___ECONTAINING_FEATURE = SDMPackage.EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___ECONTAINMENT_FEATURE = SDMPackage.EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___ECONTENTS = SDMPackage.EXTENDABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___EALL_CONTENTS = SDMPackage.EXTENDABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___ECROSS_REFERENCES = SDMPackage.EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___EGET__ESTRUCTURALFEATURE = SDMPackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___EUNSET__ESTRUCTURALFEATURE = SDMPackage.EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___EINVOKE__EOPERATION_ELIST = SDMPackage.EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___GET_EXTENSION__ECLASS = SDMPackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___PROVIDE_EXTENSION__ECLASS = SDMPackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___GET_ANNOTATION__STRING = SDMPackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___PROVIDE_ANNOTATION__STRING = SDMPackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Correct</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___IS_CORRECT = SDMPackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = SDMPackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ModelingConstraintImpl <em>Modeling Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ModelingConstraintImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getModelingConstraint()
	 * @generated
	 */
	int MODELING_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT__ANNOTATION = CONSTRAINT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT__EXTENSION = CONSTRAINT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Correctness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT__CORRECTNESS = CONSTRAINT__CORRECTNESS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT__BACKGROUND = CONSTRAINT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Constrainable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT__CONSTRAINABLE_ELEMENT = CONSTRAINT__CONSTRAINABLE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Modeling Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___ECLASS = CONSTRAINT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___EIS_PROXY = CONSTRAINT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___ERESOURCE = CONSTRAINT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___ECONTAINER = CONSTRAINT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___ECONTAINING_FEATURE = CONSTRAINT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___ECONTAINMENT_FEATURE = CONSTRAINT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___ECONTENTS = CONSTRAINT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___EALL_CONTENTS = CONSTRAINT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___ECROSS_REFERENCES = CONSTRAINT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___EGET__ESTRUCTURALFEATURE = CONSTRAINT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT = CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE = CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE = CONSTRAINT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___EINVOKE__EOPERATION_ELIST = CONSTRAINT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___GET_EXTENSION__ECLASS = CONSTRAINT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___PROVIDE_EXTENSION__ECLASS = CONSTRAINT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___GET_ANNOTATION__STRING = CONSTRAINT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___PROVIDE_ANNOTATION__STRING = CONSTRAINT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Correct</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___IS_CORRECT = CONSTRAINT___IS_CORRECT;

	/**
	 * The number of operations of the '<em>Modeling Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.VerifiableConstraintImpl <em>Verifiable Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.VerifiableConstraintImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getVerifiableConstraint()
	 * @generated
	 */
	int VERIFIABLE_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT__ANNOTATION = CONSTRAINT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT__EXTENSION = CONSTRAINT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Correctness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT__CORRECTNESS = CONSTRAINT__CORRECTNESS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT__BACKGROUND = CONSTRAINT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Constrainable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT__CONSTRAINABLE_ELEMENT = CONSTRAINT__CONSTRAINABLE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Verifiable Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___ECLASS = CONSTRAINT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___EIS_PROXY = CONSTRAINT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___ERESOURCE = CONSTRAINT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___ECONTAINER = CONSTRAINT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___ECONTAINING_FEATURE = CONSTRAINT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___ECONTAINMENT_FEATURE = CONSTRAINT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___ECONTENTS = CONSTRAINT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___EALL_CONTENTS = CONSTRAINT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___ECROSS_REFERENCES = CONSTRAINT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___EGET__ESTRUCTURALFEATURE = CONSTRAINT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT = CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE = CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE = CONSTRAINT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___EINVOKE__EOPERATION_ELIST = CONSTRAINT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___GET_EXTENSION__ECLASS = CONSTRAINT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___PROVIDE_EXTENSION__ECLASS = CONSTRAINT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___GET_ANNOTATION__STRING = CONSTRAINT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___PROVIDE_ANNOTATION__STRING = CONSTRAINT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Correct</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___IS_CORRECT = CONSTRAINT___IS_CORRECT;

	/**
	 * The number of operations of the '<em>Verifiable Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.TextualConstraintImpl <em>Textual Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.TextualConstraintImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getTextualConstraint()
	 * @generated
	 */
	int TEXTUAL_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__ANNOTATION = VERIFIABLE_CONSTRAINT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__EXTENSION = VERIFIABLE_CONSTRAINT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Correctness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__CORRECTNESS = VERIFIABLE_CONSTRAINT__CORRECTNESS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__BACKGROUND = VERIFIABLE_CONSTRAINT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Constrainable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__CONSTRAINABLE_ELEMENT = VERIFIABLE_CONSTRAINT__CONSTRAINABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Textual Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION = VERIFIABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Textual Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT_FEATURE_COUNT = VERIFIABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___ECLASS = VERIFIABLE_CONSTRAINT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___EIS_PROXY = VERIFIABLE_CONSTRAINT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___ERESOURCE = VERIFIABLE_CONSTRAINT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___ECONTAINER = VERIFIABLE_CONSTRAINT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___ECONTAINING_FEATURE = VERIFIABLE_CONSTRAINT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___ECONTAINMENT_FEATURE = VERIFIABLE_CONSTRAINT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___ECONTENTS = VERIFIABLE_CONSTRAINT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___EALL_CONTENTS = VERIFIABLE_CONSTRAINT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___ECROSS_REFERENCES = VERIFIABLE_CONSTRAINT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___EGET__ESTRUCTURALFEATURE = VERIFIABLE_CONSTRAINT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = VERIFIABLE_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT = VERIFIABLE_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE = VERIFIABLE_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE = VERIFIABLE_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___EINVOKE__EOPERATION_ELIST = VERIFIABLE_CONSTRAINT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___GET_EXTENSION__ECLASS = VERIFIABLE_CONSTRAINT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___PROVIDE_EXTENSION__ECLASS = VERIFIABLE_CONSTRAINT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___GET_ANNOTATION__STRING = VERIFIABLE_CONSTRAINT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___PROVIDE_ANNOTATION__STRING = VERIFIABLE_CONSTRAINT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Correct</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___IS_CORRECT = VERIFIABLE_CONSTRAINT___IS_CORRECT;

	/**
	 * The number of operations of the '<em>Textual Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT_OPERATION_COUNT = VERIFIABLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness <em>Correctness</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getCorrectness()
	 * @generated
	 */
	int CORRECTNESS = 4;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getCorrectness <em>Correctness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correctness</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getCorrectness()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Correctness();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isBackground()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Background();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getConstrainableElement <em>Constrainable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrainable Element</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getConstrainableElement()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ConstrainableElement();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isCorrect() <em>Is Correct</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Correct</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isCorrect()
	 * @generated
	 */
	EOperation getConstraint__IsCorrect();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.ModelingConstraint <em>Modeling Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modeling Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.ModelingConstraint
	 * @generated
	 */
	EClass getModelingConstraint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.VerifiableConstraint <em>Verifiable Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verifiable Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.VerifiableConstraint
	 * @generated
	 */
	EClass getVerifiableConstraint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint <em>Textual Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint
	 * @generated
	 */
	EClass getTextualConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint#getTextualExpression <em>Textual Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textual Expression</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint#getTextualExpression()
	 * @see #getTextualConstraint()
	 * @generated
	 */
	EReference getTextualConstraint_TextualExpression();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness <em>Correctness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Correctness</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness
	 * @generated
	 */
	EEnum getCorrectness();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstraintFactory getConstraintFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Correctness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__CORRECTNESS = eINSTANCE.getConstraint_Correctness();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__BACKGROUND = eINSTANCE.getConstraint_Background();

		/**
		 * The meta object literal for the '<em><b>Constrainable Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINABLE_ELEMENT = eINSTANCE.getConstraint_ConstrainableElement();

		/**
		 * The meta object literal for the '<em><b>Is Correct</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINT___IS_CORRECT = eINSTANCE.getConstraint__IsCorrect();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ModelingConstraintImpl <em>Modeling Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ModelingConstraintImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getModelingConstraint()
		 * @generated
		 */
		EClass MODELING_CONSTRAINT = eINSTANCE.getModelingConstraint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.VerifiableConstraintImpl <em>Verifiable Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.VerifiableConstraintImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getVerifiableConstraint()
		 * @generated
		 */
		EClass VERIFIABLE_CONSTRAINT = eINSTANCE.getVerifiableConstraint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.TextualConstraintImpl <em>Textual Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.TextualConstraintImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getTextualConstraint()
		 * @generated
		 */
		EClass TEXTUAL_CONSTRAINT = eINSTANCE.getTextualConstraint();

		/**
		 * The meta object literal for the '<em><b>Textual Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION = eINSTANCE.getTextualConstraint_TextualExpression();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness <em>Correctness</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getCorrectness()
		 * @generated
		 */
		EEnum CORRECTNESS = eINSTANCE.getCorrectness();

	}

} //ConstraintPackage
