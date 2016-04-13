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
package org.muml.pim.pattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.pim.pattern.*;
import org.muml.pim.pattern.CoordinationPattern;
import org.muml.pim.pattern.CoordinationPatternVariant;
import org.muml.pim.pattern.DescriptionAspects;
import org.muml.pim.pattern.PatternFactory;
import org.muml.pim.pattern.PatternPackage;
import org.muml.pim.pattern.VerifiedConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternFactoryImpl extends EFactoryImpl implements PatternFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatternFactory init() {
		try {
			PatternFactory thePatternFactory = (PatternFactory)EPackage.Registry.INSTANCE.getEFactory(PatternPackage.eNS_URI);
			if (thePatternFactory != null) {
				return thePatternFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatternFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternFactoryImpl() {
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
			case PatternPackage.DESCRIPTION_ASPECTS: return createDescriptionAspects();
			case PatternPackage.VERIFIED_CONFIGURATION: return createVerifiedConfiguration();
			case PatternPackage.COORDINATION_PATTERN_VARIANT: return createCoordinationPatternVariant();
			case PatternPackage.COORDINATION_PATTERN: return createCoordinationPattern();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPattern createCoordinationPattern() {
		CoordinationPatternImpl coordinationPattern = new CoordinationPatternImpl();
		return coordinationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionAspects createDescriptionAspects() {
		DescriptionAspectsImpl descriptionAspects = new DescriptionAspectsImpl();
		return descriptionAspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifiedConfiguration createVerifiedConfiguration() {
		VerifiedConfigurationImpl verifiedConfiguration = new VerifiedConfigurationImpl();
		return verifiedConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPatternVariant createCoordinationPatternVariant() {
		CoordinationPatternVariantImpl coordinationPatternVariant = new CoordinationPatternVariantImpl();
		return coordinationPatternVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternPackage getPatternPackage() {
		return (PatternPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatternPackage getPackage() {
		return PatternPackage.eINSTANCE;
	}

} //PatternFactoryImpl
