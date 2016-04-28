/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.uppaal.adapter.extension.verificationextension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.mumlcore.CorePackage;

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
 * @see org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface VerificationExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "verificationextension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/uppaal/adapter/extension/verificationextension/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "verificationextension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VerificationExtensionPackage eINSTANCE = org.muml.uppaal.adapter.extension.verificationextension.impl.VerificationExtensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.uppaal.adapter.extension.verificationextension.impl.CommittedExtensionImpl <em>Committed Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.CommittedExtensionImpl
	 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.VerificationExtensionPackageImpl#getCommittedExtension()
	 * @generated
	 */
	int COMMITTED_EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITTED_EXTENSION__EXTENSIONS = CorePackage.EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITTED_EXTENSION__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The number of structural features of the '<em>Committed Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITTED_EXTENSION_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITTED_EXTENSION___GET_EXTENSION__ECLASS = CorePackage.EXTENSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Committed Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITTED_EXTENSION_OPERATION_COUNT = CorePackage.EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.adapter.extension.verificationextension.impl.ClockBindingsExtensionImpl <em>Clock Bindings Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.ClockBindingsExtensionImpl
	 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.VerificationExtensionPackageImpl#getClockBindingsExtension()
	 * @generated
	 */
	int CLOCK_BINDINGS_EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_BINDINGS_EXTENSION__EXTENSIONS = CorePackage.EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_BINDINGS_EXTENSION__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The feature id for the '<em><b>Clock Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_BINDINGS_EXTENSION__CLOCK_BINDINGS = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock Bindings Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_BINDINGS_EXTENSION_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_BINDINGS_EXTENSION___GET_EXTENSION__ECLASS = CorePackage.EXTENSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Clock Bindings Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_BINDINGS_EXTENSION_OPERATION_COUNT = CorePackage.EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.adapter.extension.verificationextension.impl.ClockBindingImpl <em>Clock Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.ClockBindingImpl
	 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.VerificationExtensionPackageImpl#getClockBinding()
	 * @generated
	 */
	int CLOCK_BINDING = 2;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_BINDING__CLOCK = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_BINDING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Clock Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Clock Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_BINDING_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.muml.uppaal.adapter.extension.verificationextension.impl.ElementToVerifyExtensionImpl <em>Element To Verify Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.ElementToVerifyExtensionImpl
	 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.VerificationExtensionPackageImpl#getElementToVerifyExtension()
	 * @generated
	 */
	int ELEMENT_TO_VERIFY_EXTENSION = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TO_VERIFY_EXTENSION__EXTENSIONS = CorePackage.EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TO_VERIFY_EXTENSION__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The number of structural features of the '<em>Element To Verify Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TO_VERIFY_EXTENSION_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TO_VERIFY_EXTENSION___GET_EXTENSION__ECLASS = CorePackage.EXTENSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Element To Verify Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TO_VERIFY_EXTENSION_OPERATION_COUNT = CorePackage.EXTENSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.adapter.extension.verificationextension.CommittedExtension <em>Committed Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Committed Extension</em>'.
	 * @see org.muml.uppaal.adapter.extension.verificationextension.CommittedExtension
	 * @generated
	 */
	EClass getCommittedExtension();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.adapter.extension.verificationextension.ClockBindingsExtension <em>Clock Bindings Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Bindings Extension</em>'.
	 * @see org.muml.uppaal.adapter.extension.verificationextension.ClockBindingsExtension
	 * @generated
	 */
	EClass getClockBindingsExtension();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.uppaal.adapter.extension.verificationextension.ClockBindingsExtension#getClockBindings <em>Clock Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clock Bindings</em>'.
	 * @see org.muml.uppaal.adapter.extension.verificationextension.ClockBindingsExtension#getClockBindings()
	 * @see #getClockBindingsExtension()
	 * @generated
	 */
	EReference getClockBindingsExtension_ClockBindings();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.adapter.extension.verificationextension.ClockBinding <em>Clock Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Binding</em>'.
	 * @see org.muml.uppaal.adapter.extension.verificationextension.ClockBinding
	 * @generated
	 */
	EClass getClockBinding();

	/**
	 * Returns the meta object for the reference '{@link org.muml.uppaal.adapter.extension.verificationextension.ClockBinding#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see org.muml.uppaal.adapter.extension.verificationextension.ClockBinding#getClock()
	 * @see #getClockBinding()
	 * @generated
	 */
	EReference getClockBinding_Clock();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.adapter.extension.verificationextension.ClockBinding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.muml.uppaal.adapter.extension.verificationextension.ClockBinding#getValue()
	 * @see #getClockBinding()
	 * @generated
	 */
	EAttribute getClockBinding_Value();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.adapter.extension.verificationextension.ElementToVerifyExtension <em>Element To Verify Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element To Verify Extension</em>'.
	 * @see org.muml.uppaal.adapter.extension.verificationextension.ElementToVerifyExtension
	 * @generated
	 */
	EClass getElementToVerifyExtension();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VerificationExtensionFactory getVerificationExtensionFactory();

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
		 * The meta object literal for the '{@link org.muml.uppaal.adapter.extension.verificationextension.impl.CommittedExtensionImpl <em>Committed Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.CommittedExtensionImpl
		 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.VerificationExtensionPackageImpl#getCommittedExtension()
		 * @generated
		 */
		EClass COMMITTED_EXTENSION = eINSTANCE.getCommittedExtension();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.adapter.extension.verificationextension.impl.ClockBindingsExtensionImpl <em>Clock Bindings Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.ClockBindingsExtensionImpl
		 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.VerificationExtensionPackageImpl#getClockBindingsExtension()
		 * @generated
		 */
		EClass CLOCK_BINDINGS_EXTENSION = eINSTANCE.getClockBindingsExtension();

		/**
		 * The meta object literal for the '<em><b>Clock Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_BINDINGS_EXTENSION__CLOCK_BINDINGS = eINSTANCE.getClockBindingsExtension_ClockBindings();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.adapter.extension.verificationextension.impl.ClockBindingImpl <em>Clock Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.ClockBindingImpl
		 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.VerificationExtensionPackageImpl#getClockBinding()
		 * @generated
		 */
		EClass CLOCK_BINDING = eINSTANCE.getClockBinding();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_BINDING__CLOCK = eINSTANCE.getClockBinding_Clock();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK_BINDING__VALUE = eINSTANCE.getClockBinding_Value();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.adapter.extension.verificationextension.impl.ElementToVerifyExtensionImpl <em>Element To Verify Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.ElementToVerifyExtensionImpl
		 * @see org.muml.uppaal.adapter.extension.verificationextension.impl.VerificationExtensionPackageImpl#getElementToVerifyExtension()
		 * @generated
		 */
		EClass ELEMENT_TO_VERIFY_EXTENSION = eINSTANCE.getElementToVerifyExtension();

	}

} //VerificationExtensionPackage
