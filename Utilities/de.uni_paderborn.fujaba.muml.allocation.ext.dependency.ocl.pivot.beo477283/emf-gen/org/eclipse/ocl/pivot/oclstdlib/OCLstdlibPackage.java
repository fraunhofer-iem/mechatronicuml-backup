/*******************************************************************************
 * Copyright (c) 2014, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.ocl.pivot.oclstdlib;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.values.Bag;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSet;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.UnlimitedNaturalValue;

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
 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibFactory
 * @model kind="package"
 * @generated
 */
public class OCLstdlibPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "oclstdlib"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipse.org/ocl/2015/Library"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "oclstdlib"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("null")
	public static final @NonNull OCLstdlibPackage eINSTANCE = org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage.init();

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Comparable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclComparable()
	 * @generated
	 */
	public static final int OCL_COMPARABLE = 3;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclElement()
	 * @generated
	 */
	public static final int OCL_ELEMENT = 4;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclAny()
	 * @generated
	 */
	public static final int OCL_ANY = 2;

	/**
	 * The number of structural features of the '<em>Ocl Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OCL_ANY_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclAnyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclComparableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclElementEClass = null;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Invalid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclInvalid()
	 * @generated
	 */
	public static final int OCL_INVALID = 5;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Lambda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclLambda()
	 * @generated
	 */
	public static final int OCL_LAMBDA = 6;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclMessage()
	 * @generated
	 */
	public static final int OCL_MESSAGE = 7;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclState()
	 * @generated
	 */
	public static final int OCL_STATE = 8;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Summable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclSummable()
	 * @generated
	 */
	public static final int OCL_SUMMABLE = 9;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclTuple()
	 * @generated
	 */
	public static final int OCL_TUPLE = 10;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclType()
	 * @generated
	 */
	public static final int OCL_TYPE = 11;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Void</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclVoid()
	 * @generated
	 */
	public static final int OCL_VOID = 12;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclInvalidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclLambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclSummableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclTupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclVoidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueCollectionEClass = null;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getBoolean()
	 * @generated
	 */
	public static final int BOOLEAN = 18;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.pivot.values.IntegerValue
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getInteger()
	 * @generated
	 */
	public static final int INTEGER = 19;

	/**
	 * The meta object id for the '<em>Real</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.pivot.values.RealValue
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getReal()
	 * @generated
	 */
	public static final int REAL = 20;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getString()
	 * @generated
	 */
	public static final int STRING = 21;

	/**
	 * The meta object id for the '<em>Unlimited Natural</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.pivot.values.UnlimitedNaturalValue
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getUnlimitedNatural()
	 * @generated
	 */
	public static final int UNLIMITED_NATURAL = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.pivot.values.Bag <em>Bag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.pivot.values.Bag
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getBag()
	 * @generated
	 */
	public static final int BAG = 0;

	/**
	 * The meta object id for the '{@link java.util.Collection <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getCollection()
	 * @generated
	 */
	public static final int COLLECTION = 1;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION__ELEMENT_TYPE = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION__LOWER = OCL_ANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION__UPPER = OCL_ANY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAG__ELEMENT_TYPE = COLLECTION__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAG__LOWER = COLLECTION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAG__UPPER = COLLECTION__UPPER;

	/**
	 * The number of structural features of the '<em>Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAG_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OCL_COMPARABLE_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OCL_ELEMENT_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.util.Collection <em>Ordered Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOrderedCollection()
	 * @generated
	 */
	public static final int ORDERED_COLLECTION = 13;

	/**
	 * The number of structural features of the '<em>Ocl Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OCL_VOID_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl Invalid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OCL_INVALID_FEATURE_COUNT = OCL_VOID_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl Lambda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OCL_LAMBDA_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OCL_MESSAGE_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OCL_STATE_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl Summable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OCL_SUMMABLE_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OCL_TUPLE_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OCL_TYPE_FEATURE_COUNT = OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_COLLECTION__ELEMENT_TYPE = COLLECTION__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_COLLECTION__LOWER = COLLECTION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_COLLECTION__UPPER = COLLECTION__UPPER;

	/**
	 * The number of structural features of the '<em>Ordered Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_COLLECTION_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.pivot.values.OrderedSet <em>Ordered Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.pivot.values.OrderedSet
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOrderedSet()
	 * @generated
	 */
	public static final int ORDERED_SET = 14;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_SET__ELEMENT_TYPE = ORDERED_COLLECTION__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_SET__LOWER = ORDERED_COLLECTION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_SET__UPPER = ORDERED_COLLECTION__UPPER;

	/**
	 * The number of structural features of the '<em>Ordered Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_SET_FEATURE_COUNT = ORDERED_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.util.List <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getSequence()
	 * @generated
	 */
	public static final int SEQUENCE = 15;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE__ELEMENT_TYPE = ORDERED_COLLECTION__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE__LOWER = ORDERED_COLLECTION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE__UPPER = ORDERED_COLLECTION__UPPER;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_FEATURE_COUNT = ORDERED_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.util.Set <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Set
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getSet()
	 * @generated
	 */
	public static final int SET = 16;

	/**
	 * The meta object id for the '{@link java.util.Collection <em>Unique Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getUniqueCollection()
	 * @generated
	 */
	public static final int UNIQUE_COLLECTION = 17;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNIQUE_COLLECTION__ELEMENT_TYPE = COLLECTION__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNIQUE_COLLECTION__LOWER = COLLECTION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNIQUE_COLLECTION__UPPER = COLLECTION__UPPER;

	/**
	 * The number of structural features of the '<em>Unique Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNIQUE_COLLECTION_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET__ELEMENT_TYPE = UNIQUE_COLLECTION__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET__LOWER = UNIQUE_COLLECTION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET__UPPER = UNIQUE_COLLECTION__UPPER;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_FEATURE_COUNT = UNIQUE_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType realEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unlimitedNaturalEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OCLstdlibPackage() {
		super(eNS_URI, OCLstdlibFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OCLstdlibPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OCLstdlibPackage init() {
		if (isInited) return (OCLstdlibPackage)EPackage.Registry.INSTANCE.getEPackage(OCLstdlibPackage.eNS_URI);

		// Obtain or create and register package
		OCLstdlibPackage theOCLstdlibPackage = (OCLstdlibPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OCLstdlibPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OCLstdlibPackage());

		isInited = true;

		// Create package meta-data objects
		theOCLstdlibPackage.createPackageContents();

		// Initialize created meta-data
		theOCLstdlibPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOCLstdlibPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OCLstdlibPackage.eNS_URI, theOCLstdlibPackage);
		return theOCLstdlibPackage;
	}


	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Comparable</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="org.eclipse.ocl.pivot.oclstdlib.OclAny"
	 * @generated
	 */
	public EClass getOclComparable() {
		return oclComparableEClass;
	}


	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Element</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="org.eclipse.ocl.pivot.oclstdlib.OclAny"
	 * @generated
	 */
	public EClass getOclElement() {
		return oclElementEClass;
	}


	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Any</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	public EClass getOclAny() {
		return oclAnyEClass;
	}


	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Invalid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Invalid</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="org.eclipse.ocl.pivot.oclstdlib.OclVoid"
	 * @generated
	 */
	public EClass getOclInvalid() {
		return oclInvalidEClass;
	}


	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Lambda</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="org.eclipse.ocl.pivot.oclstdlib.OclAny"
	 * @generated
	 */
	public EClass getOclLambda() {
		return oclLambdaEClass;
	}


	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Message</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="org.eclipse.ocl.pivot.oclstdlib.OclAny"
	 * @generated
	 */
	public EClass getOclMessage() {
		return oclMessageEClass;
	}


	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl State</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="org.eclipse.ocl.pivot.oclstdlib.OclAny"
	 * @generated
	 */
	public EClass getOclState() {
		return oclStateEClass;
	}


	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Summable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Summable</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="org.eclipse.ocl.pivot.oclstdlib.OclAny"
	 * @generated
	 */
	public EClass getOclSummable() {
		return oclSummableEClass;
	}


	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Tuple</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="org.eclipse.ocl.pivot.oclstdlib.OclAny"
	 * @generated
	 */
	public EClass getOclTuple() {
		return oclTupleEClass;
	}


	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="org.eclipse.ocl.pivot.oclstdlib.OclElement"
	 * @generated
	 */
	public EClass getOclType() {
		return oclTypeEClass;
	}


	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Void</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="org.eclipse.ocl.pivot.oclstdlib.OclAny"
	 * @generated
	 */
	public EClass getOclVoid() {
		return oclVoidEClass;
	}


	/**
	 * Returns the meta object for class '{@link java.util.Collection <em>Ordered Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T" superTypes="org.eclipse.ocl.pivot.oclstdlib.Collection<T>"
	 * @generated
	 */
	public EClass getOrderedCollection() {
		return orderedCollectionEClass;
	}


	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ocl.pivot.values.IntegerValue <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see org.eclipse.ocl.pivot.values.IntegerValue
	 * @model instanceClass="org.eclipse.ocl.pivot.values.IntegerValue"
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ocl.pivot.values.RealValue <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Real</em>'.
	 * @see org.eclipse.ocl.pivot.values.RealValue
	 * @model instanceClass="org.eclipse.ocl.pivot.values.RealValue"
	 * @generated
	 */
	public EDataType getReal() {
		return realEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ocl.pivot.values.UnlimitedNaturalValue <em>Unlimited Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unlimited Natural</em>'.
	 * @see org.eclipse.ocl.pivot.values.UnlimitedNaturalValue
	 * @model instanceClass="org.eclipse.ocl.pivot.values.UnlimitedNaturalValue"
	 * @generated
	 */
	public EDataType getUnlimitedNatural() {
		return unlimitedNaturalEDataType;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.pivot.values.Bag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag</em>'.
	 * @see org.eclipse.ocl.pivot.values.Bag
	 * @model instanceClass="org.eclipse.ocl.pivot.values.Bag" typeParameters="T" superTypes="org.eclipse.ocl.pivot.oclstdlib.Collection<T>"
	 * @generated
	 */
	public EClass getBag() {
		return bagEClass;
	}

	/**
	 * Returns the meta object for class '{@link java.util.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T" superTypes="org.eclipse.ocl.pivot.oclstdlib.OclAny"
	 * @generated
	 */
	public EClass getCollection() {
		return collectionEClass;
	}

	/**
	 * Returns the meta object for the reference '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see #getCollection()
	 * @generated
	 */
	public EReference getCollection_ElementType() {
		return (EReference)collectionEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '<em>Lower</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see #getCollection()
	 * @generated
	 */
	public EAttribute getCollection_Lower() {
		return (EAttribute)collectionEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '<em>Upper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see #getCollection()
	 * @generated
	 */
	public EAttribute getCollection_Upper() {
		return (EAttribute)collectionEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.pivot.values.OrderedSet <em>Ordered Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Set</em>'.
	 * @see org.eclipse.ocl.pivot.values.OrderedSet
	 * @model instanceClass="org.eclipse.ocl.pivot.values.OrderedSet" typeParameters="T" superTypes="org.eclipse.ocl.pivot.oclstdlib.OrderedCollection<T> org.eclipse.ocl.pivot.oclstdlib.UniqueCollection<T>"
	 * @generated
	 */
	public EClass getOrderedSet() {
		return orderedSetEClass;
	}

	/**
	 * Returns the meta object for class '{@link java.util.List <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T" superTypes="org.eclipse.ocl.pivot.oclstdlib.OrderedCollection<T>"
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * Returns the meta object for class '{@link java.util.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see java.util.Set
	 * @model instanceClass="java.util.Set" typeParameters="T" superTypes="org.eclipse.ocl.pivot.oclstdlib.UniqueCollection<T>"
	 * @generated
	 */
	public EClass getSet() {
		return setEClass;
	}

	/**
	 * Returns the meta object for class '{@link java.util.Collection <em>Unique Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T" superTypes="org.eclipse.ocl.pivot.oclstdlib.Collection<T>"
	 * @generated
	 */
	public EClass getUniqueCollection() {
		return uniqueCollectionEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public OCLstdlibFactory getOCLstdlibFactory() {
		return (OCLstdlibFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bagEClass = createEClass(BAG);

		collectionEClass = createEClass(COLLECTION);
		createEReference(collectionEClass, COLLECTION__ELEMENT_TYPE);
		createEAttribute(collectionEClass, COLLECTION__LOWER);
		createEAttribute(collectionEClass, COLLECTION__UPPER);

		oclAnyEClass = createEClass(OCL_ANY);

		oclComparableEClass = createEClass(OCL_COMPARABLE);

		oclElementEClass = createEClass(OCL_ELEMENT);

		oclInvalidEClass = createEClass(OCL_INVALID);

		oclLambdaEClass = createEClass(OCL_LAMBDA);

		oclMessageEClass = createEClass(OCL_MESSAGE);

		oclStateEClass = createEClass(OCL_STATE);

		oclSummableEClass = createEClass(OCL_SUMMABLE);

		oclTupleEClass = createEClass(OCL_TUPLE);

		oclTypeEClass = createEClass(OCL_TYPE);

		oclVoidEClass = createEClass(OCL_VOID);

		orderedCollectionEClass = createEClass(ORDERED_COLLECTION);

		orderedSetEClass = createEClass(ORDERED_SET);

		sequenceEClass = createEClass(SEQUENCE);

		setEClass = createEClass(SET);

		uniqueCollectionEClass = createEClass(UNIQUE_COLLECTION);

		// Create data types
		booleanEDataType = createEDataType(BOOLEAN);
		integerEDataType = createEDataType(INTEGER);
		realEDataType = createEDataType(REAL);
		stringEDataType = createEDataType(STRING);
		unlimitedNaturalEDataType = createEDataType(UNLIMITED_NATURAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter bagEClass_T = addETypeParameter(bagEClass, "T"); //$NON-NLS-1$
		ETypeParameter collectionEClass_T = addETypeParameter(collectionEClass, "T"); //$NON-NLS-1$
		ETypeParameter orderedCollectionEClass_T = addETypeParameter(orderedCollectionEClass, "T"); //$NON-NLS-1$
		ETypeParameter orderedSetEClass_T = addETypeParameter(orderedSetEClass, "T"); //$NON-NLS-1$
		ETypeParameter sequenceEClass_T = addETypeParameter(sequenceEClass, "T"); //$NON-NLS-1$
		ETypeParameter setEClass_T = addETypeParameter(setEClass, "T"); //$NON-NLS-1$
		ETypeParameter uniqueCollectionEClass_T = addETypeParameter(uniqueCollectionEClass, "T"); //$NON-NLS-1$

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getCollection());
		EGenericType g2 = createEGenericType(bagEClass_T);
		g1.getETypeArguments().add(g2);
		bagEClass.getEGenericSuperTypes().add(g1);
		collectionEClass.getESuperTypes().add(this.getOclAny());
		oclComparableEClass.getESuperTypes().add(this.getOclAny());
		oclElementEClass.getESuperTypes().add(this.getOclAny());
		oclInvalidEClass.getESuperTypes().add(this.getOclVoid());
		oclLambdaEClass.getESuperTypes().add(this.getOclAny());
		oclMessageEClass.getESuperTypes().add(this.getOclAny());
		oclStateEClass.getESuperTypes().add(this.getOclAny());
		oclSummableEClass.getESuperTypes().add(this.getOclAny());
		oclTupleEClass.getESuperTypes().add(this.getOclAny());
		oclTypeEClass.getESuperTypes().add(this.getOclElement());
		oclVoidEClass.getESuperTypes().add(this.getOclAny());
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(orderedCollectionEClass_T);
		g1.getETypeArguments().add(g2);
		orderedCollectionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getOrderedCollection());
		g2 = createEGenericType(orderedSetEClass_T);
		g1.getETypeArguments().add(g2);
		orderedSetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUniqueCollection());
		g2 = createEGenericType(orderedSetEClass_T);
		g1.getETypeArguments().add(g2);
		orderedSetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getOrderedCollection());
		g2 = createEGenericType(sequenceEClass_T);
		g1.getETypeArguments().add(g2);
		sequenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUniqueCollection());
		g2 = createEGenericType(setEClass_T);
		g1.getETypeArguments().add(g2);
		setEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(uniqueCollectionEClass_T);
		g1.getETypeArguments().add(g2);
		uniqueCollectionEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(bagEClass, Bag.class, "Bag", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(collectionEClass, Collection.class, "Collection", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		g1 = createEGenericType(collectionEClass_T);
		initEReference(getCollection_ElementType(), g1, null, "elementType", null, 1, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCollection_Lower(), this.getInteger(), "lower", null, 1, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCollection_Upper(), this.getInteger(), "upper", null, 1, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclAnyEClass, Object.class, "OclAny", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclComparableEClass, Object.class, "OclComparable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclElementEClass, Object.class, "OclElement", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclInvalidEClass, Object.class, "OclInvalid", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclLambdaEClass, Object.class, "OclLambda", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclMessageEClass, Object.class, "OclMessage", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclStateEClass, Object.class, "OclState", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclSummableEClass, Object.class, "OclSummable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclTupleEClass, Object.class, "OclTuple", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclTypeEClass, Object.class, "OclType", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclVoidEClass, Object.class, "OclVoid", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(orderedCollectionEClass, Collection.class, "OrderedCollection", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(orderedSetEClass, OrderedSet.class, "OrderedSet", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(sequenceEClass, List.class, "Sequence", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(setEClass, Set.class, "Set", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(uniqueCollectionEClass, Collection.class, "UniqueCollection", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize data types
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(integerEDataType, IntegerValue.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(realEDataType, RealValue.class, "Real", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(unlimitedNaturalEDataType, UnlimitedNaturalValue.class, "UnlimitedNatural", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/ASLibrary
		createASLibraryAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/ASLibrary</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createASLibraryAnnotations() {
		String source = "http://www.eclipse.org/OCL/ASLibrary"; //$NON-NLS-1$	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

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
	public interface Literals {
		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Comparable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclComparable()
		 * @generated
		 */
		public static final EClass OCL_COMPARABLE = eINSTANCE.getOclComparable();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclElement()
		 * @generated
		 */
		public static final EClass OCL_ELEMENT = eINSTANCE.getOclElement();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclAny()
		 * @generated
		 */
		public static final EClass OCL_ANY = eINSTANCE.getOclAny();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Invalid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclInvalid()
		 * @generated
		 */
		public static final EClass OCL_INVALID = eINSTANCE.getOclInvalid();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Lambda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclLambda()
		 * @generated
		 */
		public static final EClass OCL_LAMBDA = eINSTANCE.getOclLambda();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclMessage()
		 * @generated
		 */
		public static final EClass OCL_MESSAGE = eINSTANCE.getOclMessage();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclState()
		 * @generated
		 */
		public static final EClass OCL_STATE = eINSTANCE.getOclState();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Summable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclSummable()
		 * @generated
		 */
		public static final EClass OCL_SUMMABLE = eINSTANCE.getOclSummable();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclTuple()
		 * @generated
		 */
		public static final EClass OCL_TUPLE = eINSTANCE.getOclTuple();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclType()
		 * @generated
		 */
		public static final EClass OCL_TYPE = eINSTANCE.getOclType();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Void</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOclVoid()
		 * @generated
		 */
		public static final EClass OCL_VOID = eINSTANCE.getOclVoid();

		/**
		 * The meta object literal for the '{@link java.util.Collection <em>Ordered Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOrderedCollection()
		 * @generated
		 */
		public static final EClass ORDERED_COLLECTION = eINSTANCE.getOrderedCollection();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getBoolean()
		 * @generated
		 */
		public static final EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.pivot.values.IntegerValue
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getInteger()
		 * @generated
		 */
		public static final EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Real</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.pivot.values.RealValue
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getReal()
		 * @generated
		 */
		public static final EDataType REAL = eINSTANCE.getReal();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getString()
		 * @generated
		 */
		public static final EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Unlimited Natural</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.pivot.values.UnlimitedNaturalValue
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getUnlimitedNatural()
		 * @generated
		 */
		public static final EDataType UNLIMITED_NATURAL = eINSTANCE.getUnlimitedNatural();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.pivot.values.Bag <em>Bag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.pivot.values.Bag
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getBag()
		 * @generated
		 */
		public static final EClass BAG = eINSTANCE.getBag();

		/**
		 * The meta object literal for the '{@link java.util.Collection <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getCollection()
		 * @generated
		 */
		public static final EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COLLECTION__ELEMENT_TYPE = eINSTANCE.getCollection_ElementType();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COLLECTION__LOWER = eINSTANCE.getCollection_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COLLECTION__UPPER = eINSTANCE.getCollection_Upper();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.pivot.values.OrderedSet <em>Ordered Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.pivot.values.OrderedSet
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getOrderedSet()
		 * @generated
		 */
		public static final EClass ORDERED_SET = eINSTANCE.getOrderedSet();

		/**
		 * The meta object literal for the '{@link java.util.List <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getSequence()
		 * @generated
		 */
		public static final EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '{@link java.util.Set <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Set
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getSet()
		 * @generated
		 */
		public static final EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '{@link java.util.Collection <em>Unique Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage#getUniqueCollection()
		 * @generated
		 */
		public static final EClass UNIQUE_COLLECTION = eINSTANCE.getUniqueCollection();

	}

} //OCLstdlibPackage
