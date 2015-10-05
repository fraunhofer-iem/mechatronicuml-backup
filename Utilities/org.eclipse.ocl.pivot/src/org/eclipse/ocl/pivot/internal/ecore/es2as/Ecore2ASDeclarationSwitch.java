/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - initial API and implementation
 *   E.D.Willink (Obeo) - Bug 416287 - tuple-valued constraints
 *   E.D.Willink (CEA List) - Bug 424057 - UML 2.5 CG
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.ecore.es2as;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.common.OCLCommon;
import org.eclipse.ocl.pivot.Annotation;
import org.eclipse.ocl.pivot.Comment;
import org.eclipse.ocl.pivot.Constraint;
import org.eclipse.ocl.pivot.DataType;
import org.eclipse.ocl.pivot.Detail;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.Enumeration;
import org.eclipse.ocl.pivot.EnumerationLiteral;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.LanguageExpression;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.NamedElement;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.Parameter;
import org.eclipse.ocl.pivot.PivotFactory;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.PrimitiveType;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.Stereotype;
import org.eclipse.ocl.pivot.TemplateParameter;
import org.eclipse.ocl.pivot.TemplateSignature;
import org.eclipse.ocl.pivot.TemplateableElement;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.internal.PackageImpl;
import org.eclipse.ocl.pivot.internal.complete.StandardLibraryInternal;
import org.eclipse.ocl.pivot.internal.delegate.SettingBehavior;
import org.eclipse.ocl.pivot.internal.ecore.EObjectOperation;
import org.eclipse.ocl.pivot.internal.ecore.EObjectProperty;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
import org.eclipse.ocl.pivot.internal.utilities.AS2Moniker;
import org.eclipse.ocl.pivot.internal.utilities.AliasAdapter;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.internal.utilities.PivotConstantsInternal;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.internal.utilities.Technology;
import org.eclipse.ocl.pivot.util.DerivedConstants;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotConstants;
import org.eclipse.ocl.pivot.utilities.PivotUtil;

public class Ecore2ASDeclarationSwitch extends EcoreSwitch<Object>
{
	public static boolean hasDocumentationKey(@Nullable String source, @NonNull EMap<String, String> details) {
		return (details.size() == 1) && PivotConstantsInternal.DOCUMENTATION_ANNOTATION_SOURCE.equals(source)
			&& details.containsKey(PivotConstantsInternal.DOCUMENTATION_ANNOTATION_KEY);
	}
	
	public static boolean hasImportKey(@Nullable String source, @NonNull EMap<String, String> details) {
		return PivotConstants.IMPORT_ANNOTATION_SOURCE.equals(source);
	}
	
	public static boolean isDocumentationKey(@Nullable String source, @Nullable String key) {
		return PivotConstantsInternal.DOCUMENTATION_ANNOTATION_SOURCE.equals(source)
			&& PivotConstantsInternal.DOCUMENTATION_ANNOTATION_KEY.equals(key);
	}

	protected final @NonNull AbstractExternal2AS converter;
	protected final @NonNull EnvironmentFactoryInternal environmentFactory;
	protected final @NonNull Technology technology;
	
	public Ecore2ASDeclarationSwitch(@NonNull AbstractExternal2AS converter) {
		this.converter = converter;
		this.environmentFactory = converter.getEnvironmentFactory();
		this.technology = environmentFactory.getTechnology();
	}
	
	@Override
	public Object caseEAnnotation(EAnnotation eObject) {
		String source = eObject.getSource();
		EMap<String, String> details = eObject.getDetails();
		Annotation pivotElement = PivotFactory.eINSTANCE.createAnnotation();
		pivotElement.setName(source);
		converter.addMapping(eObject, pivotElement);
		copyAnnotatedElement(pivotElement, eObject, null);
		doSwitchAll(pivotElement.getOwnedContents(), eObject.getContents());
		for (Map.Entry<String, String> entry : details) {
			String key = entry.getKey();
			if ((details.size() != 1) || !isDocumentationKey(source, key)) {
				Detail pivotDetail = PivotFactory.eINSTANCE.createDetail();
				pivotDetail.setName(key);
				pivotDetail.getValues().add(entry.getValue());
				pivotElement.getOwnedDetails().add(pivotDetail);	// FIXME refreshList
			}
		}
		if (!eObject.getReferences().isEmpty()) {
			converter.queueReference(eObject);
		}
		return pivotElement;
	}

	@Override
	public Object caseEAttribute(EAttribute eObject) {
		@SuppressWarnings("null") @NonNull EAttribute eObject2 = eObject;
		Property pivotElement = converter.refreshNamedElement(Property.class, PivotPackage.Literals.PROPERTY, eObject2);
		copyStructuralFeature(pivotElement, eObject2, null);
		pivotElement.setIsID(eObject2.isID());
		return pivotElement;
	}

	@Override
	public Object caseEClass(EClass eObject) {
		@SuppressWarnings("null") @NonNull EClass eObject2 = eObject;
		org.eclipse.ocl.pivot.Class pivotElement;
		if (technology.isStereotype(environmentFactory, eObject2)) {
			pivotElement = converter.refreshElement(Stereotype.class, PivotPackage.Literals.STEREOTYPE, eObject2);
		}
		else {
			pivotElement = converter.refreshElement(org.eclipse.ocl.pivot.Class.class, PivotPackage.Literals.CLASS, eObject2);
		}
		String oldName = pivotElement.getName();
		String newName = technology.getOriginalName(eObject2);
		boolean nameChange = (oldName != newName) || ((oldName != null) && !oldName.equals(newName));
		if (nameChange) {
			org.eclipse.ocl.pivot.Package parentPackage = pivotElement.getOwningPackage();
			if (parentPackage != null) {
				parentPackage.getOwnedClasses().remove(pivotElement);
			}
		}
		pivotElement.setName(newName);
		List<EAnnotation> excludedAnnotations = null;
		EAnnotation duplicatesAnnotation = eObject2.getEAnnotation(PivotConstantsInternal.DUPLICATES_ANNOTATION_SOURCE);
		if (duplicatesAnnotation != null) {
			excludedAnnotations = new ArrayList<EAnnotation>();
			excludedAnnotations.add(duplicatesAnnotation);
		}
		EAnnotation redefinesAnnotation = eObject2.getEAnnotation(PivotConstantsInternal.REDEFINES_ANNOTATION_SOURCE);
		if (redefinesAnnotation != null) {
			excludedAnnotations = new ArrayList<EAnnotation>();
			excludedAnnotations.add(redefinesAnnotation);
		}
		copyClassifier(pivotElement, eObject2, excludedAnnotations);
		pivotElement.setIsAbstract(eObject2.isAbstract());			
		pivotElement.setIsInterface(eObject2.isInterface());			
		doSwitchAll(eObject2.getEGenericSuperTypes());
		List<Operation> pivotOperations = pivotElement.getOwnedOperations();
		List<Constraint> pivotInvariants = pivotElement.getOwnedInvariants();
		for (@SuppressWarnings("null")@NonNull EOperation eOperation : eObject2.getEOperations()) {
			if (converter.isInvariant(eOperation)) {
				Object pivotObject = doSwitch(eOperation);
				pivotInvariants.add((Constraint) pivotObject);
			}
			else {
				Object pivotObject = doSwitch(eOperation);
				pivotOperations.add((Operation) pivotObject);
			}
		}
		List<Property> pivotProperties = pivotElement.getOwnedProperties();
		doSwitchAll(pivotProperties, eObject2.getEStructuralFeatures());
		if (duplicatesAnnotation != null) {
			for (EObject eContent : duplicatesAnnotation.getContents()) {
				if (eContent instanceof EOperation) {
					if (converter.isInvariant((EOperation) eContent)) {
						Constraint pivotInvariant = (Constraint) doSwitch(eContent);
						pivotInvariants.add(pivotInvariant);
					}
					else {
						Operation pivotOperation = (Operation) doSwitch(eContent);
						pivotOperations.add(pivotOperation);
					}
					converter.queueReference(eContent);				// For redefinition
				}
				else if (eContent instanceof EStructuralFeature) {
					Property pivotProperty = (Property) doSwitch(eContent);
					pivotProperties.add(pivotProperty);
					converter.queueReference(eContent);				// For redefinition
				}
				else if (eContent instanceof EAnnotation) {
				}
				else {
					converter.error("Unsupported duplicate " + eContent.eClass().getName());
				}
			}
		}
		converter.queueReference(eObject2);				// For superclasses
		return pivotElement;
	}

	@Override
	public Object caseEDataType(EDataType eObject) {
		@SuppressWarnings("null") @NonNull EDataType eObject2 = eObject;
		Class<?> instanceClass = eObject2.getInstanceClass();
		String newName = technology.getOriginalName(eObject2);
		boolean isPrimitive = false;
		if ("Boolean".equals(newName) && ((instanceClass == Boolean.class) || (instanceClass == boolean.class))) {
			isPrimitive = true;
		}
		else if ("Integer".equals(newName) && ((instanceClass == Number.class) || (instanceClass == BigInteger.class)
				|| (instanceClass == Long.class) || (instanceClass == long.class)
				|| (instanceClass == Integer.class) || (instanceClass == int.class)
				|| (instanceClass == Short.class) || (instanceClass == short.class)
				|| (instanceClass == Byte.class) || (instanceClass == byte.class))) {
			isPrimitive = true;
		}
		else if ("Real".equals(newName) && ((instanceClass == Number.class) || (instanceClass == BigDecimal.class)
				|| (instanceClass == Double.class) || (instanceClass == double.class)
				|| (instanceClass == Float.class) || (instanceClass == float.class))) {
			isPrimitive = true;
		}
		else if ("String".equals(newName) && (instanceClass == String.class)) {
			isPrimitive = true;
		} 
		else if ("UnlimitedNatural".equals(newName) && ((instanceClass == Number.class) || (instanceClass == BigInteger.class)
				|| (instanceClass == Long.class) || (instanceClass == long.class)
				|| (instanceClass == Integer.class) || (instanceClass == int.class)
				|| (instanceClass == Short.class) || (instanceClass == short.class)
				|| (instanceClass == Byte.class) || (instanceClass == byte.class))) {
			isPrimitive = true;
		}
		DataType pivotElement;
		if (isPrimitive) {
			pivotElement = converter.refreshElement(PrimitiveType.class, PivotPackage.Literals.PRIMITIVE_TYPE, eObject2);
		}
		else {
			pivotElement = converter.refreshElement(DataType.class, PivotPackage.Literals.DATA_TYPE, eObject2);
		}
		String oldName = pivotElement.getName();
		boolean nameChange = (oldName != newName) || ((oldName != null) && !oldName.equals(newName));
		if (nameChange) {
			org.eclipse.ocl.pivot.Package parentPackage = pivotElement.getOwningPackage();
			if (parentPackage != null) {
				parentPackage.getOwnedClasses().remove(pivotElement);
			}
		}
		pivotElement.setName(newName);
		copyDataTypeOrEnum(pivotElement, eObject2);
		if (!isPrimitive && (instanceClass != null)) {
			try {
				PivotMetamodelManager metamodelManager = converter.getMetamodelManager();
		    	StandardLibraryInternal standardLibrary = metamodelManager.getStandardLibrary();
				PrimitiveType behavioralClass = standardLibrary.getBehavioralClass(instanceClass);
				if (behavioralClass != null) {
					pivotElement.setBehavioralClass(behavioralClass);
				}
				else {
					instanceClass.getDeclaredMethod("compareTo", instanceClass);
					converter.queueReference(eObject2);			// Defer synthesis till supertypes resolved
				}
			} catch (Exception e) {
			}
		}
		pivotElement.getSuperClasses().add(environmentFactory.getStandardLibrary().getOclAnyType());
		return pivotElement;
	}

	@Override
	public Object caseEEnum(EEnum eObject) {
		@SuppressWarnings("null") @NonNull EEnum eObject2 = eObject;
		Enumeration pivotElement = converter.refreshElement(Enumeration.class, PivotPackage.Literals.ENUMERATION, eObject2);
		String oldName = pivotElement.getName();
		String newName = technology.getOriginalName(eObject2);
		boolean nameChange = (oldName != newName) || ((oldName != null) && !oldName.equals(newName));
		if (nameChange) {
			org.eclipse.ocl.pivot.Package parentPackage = pivotElement.getOwningPackage();
			if (parentPackage != null) {
				parentPackage.getOwnedClasses().remove(pivotElement);
			}
		}
		pivotElement.setName(newName);
		copyDataTypeOrEnum(pivotElement, eObject2);
		doSwitchAll(pivotElement.getOwnedLiterals(), eObject2.getELiterals());
//		pivotElement.getSuperClass().add(metamodelManager.getOclAnyType());
		pivotElement.getSuperClasses().add(environmentFactory.getStandardLibrary().getEnumerationType());
		return pivotElement;
	}

	@Override
	public Object caseEEnumLiteral(EEnumLiteral eEnumLiteral) {
		@SuppressWarnings("null") @NonNull EEnumLiteral eEnumLiteral2 = eEnumLiteral;
		EnumerationLiteral pivotElement = converter.refreshNamedElement(EnumerationLiteral.class,
			PivotPackage.Literals.ENUMERATION_LITERAL, eEnumLiteral2);
		copyNamedElement(pivotElement, eEnumLiteral2);
		copyAnnotatedElement(pivotElement, eEnumLiteral2, null);
		if (eEnumLiteral2.eIsSet(EcorePackage.Literals.EENUM_LITERAL__VALUE)) {
			pivotElement.setValue(BigInteger.valueOf(eEnumLiteral2.getValue()));
		}
		else {
			pivotElement.eUnset(PivotPackage.Literals.ENUMERATION_LITERAL__VALUE);
		}
//			String literal = basicGet(eObject, EcorePackage.Literals.EENUM_LITERAL__LITERAL, String.class);
//			Enumerator instance = eEnumLiteral.getInstance();
//			if (literal != null) {
/*				AnnotationCS csAnnotation = PivotFactory.eINSTANCE.createAnnotationCS();
				csAnnotation.setIdSource(EcorePackage.eNS_URI);
				DetailCS csDetail = PivotFactory.eINSTANCE.createDetailCS();
				csDetail.setIdName("literal");
				copyDetailLines(csDetail.getValue(), literal);
				csAnnotation.getDetails().add(csDetail);
				pivotElement.getAnnotations().add(csAnnotation); */
//			}
		return pivotElement;
	}

	@Override
	public Object caseEGenericType(EGenericType eObject) {
		doSwitchAll(eObject.getETypeArguments());
		converter.addGenericType(eObject);		// Wait till all unspecialized types converted
		return true;
	}

	@Override
	public Object caseEOperation(EOperation eObject) {
		@SuppressWarnings("null") @NonNull EOperation eOperation = eObject;
		if (converter.isInvariant(eOperation)) {
			return convertEOperation2Constraint(eOperation);
		}
		else {
			return convertEOperation2Operation(eOperation);
		}
	}

	@Override
	public Object caseEPackage(EPackage eObject) {
		@SuppressWarnings("null") @NonNull EPackage eObject2 = eObject;
		org.eclipse.ocl.pivot.Package pivotElement = converter.refreshElement(org.eclipse.ocl.pivot.Package.class, PivotPackage.Literals.PACKAGE, eObject2);
		String oldName = pivotElement.getName();
		String newName = technology.getOriginalName(eObject2);
//		if (newName == null) {
//			newName = "anon_" + Integer.toHexString(System.identityHashCode(eObject2));
//			logger.error("Anonymous package named as '" + newName + "'");
//		}
		String oldNsURI = pivotElement.getURI();
		String newNsURI = eObject2.getNsURI();
		boolean nameChange = (oldName != newName) || ((oldName != null) && !oldName.equals(newName));
		boolean nsURIChange = (oldNsURI != newNsURI) || ((oldNsURI != null) && !oldNsURI.equals(newNsURI));
		if (nameChange || nsURIChange) {
			EObject eContainer = pivotElement.eContainer();
			if (eContainer instanceof Model) {
				((Model)eContainer).getOwnedPackages().remove(pivotElement);
			}
			else if (eContainer instanceof org.eclipse.ocl.pivot.Package) {
				((org.eclipse.ocl.pivot.Package)eContainer).getOwnedPackages().remove(pivotElement);
			}
		}
		pivotElement.setName(newName);
		if (eObject2.eIsSet(EcorePackage.Literals.EPACKAGE__NS_URI)) {
			RootPackageId metamodel = technology.getMetamodelId(environmentFactory, eObject2);
			if (metamodel != null) {
				((PackageImpl)pivotElement).setPackageId(metamodel);
			}
			pivotElement.setURI(eObject2.getNsURI());
		}
		else {
			pivotElement.setURI(null);
		}
		if (eObject2.eIsSet(EcorePackage.Literals.EPACKAGE__NS_PREFIX)) {
			pivotElement.setNsPrefix(eObject2.getNsPrefix());
		}
		else {
			pivotElement.setNsPrefix(null);
		}
		if (!(eObject2.eContainer() instanceof EAnnotation)) {
			String moniker = AS2Moniker.toString(pivotElement);
			AliasAdapter adapter = AliasAdapter.getAdapter(eObject2.eResource());
			if (adapter != null) {
				adapter.getAliasMap().put(eObject2, moniker);
			}
		}
		List<EAnnotation> exclusions = new ArrayList<EAnnotation>();
		EAnnotation eAnnotation = eObject2.getEAnnotation(EcorePackage.eNS_URI);
		if (eAnnotation != null) {
			exclusions.add(eAnnotation);		
		}
		if (ClassUtil.basicGetMetamodelAnnotation(eObject2) != null) {
			exclusions.add(ClassUtil.getMetamodelAnnotation(eObject2));		
		}
		converter.addMapping(eObject2, pivotElement);
//		copyNamedElement(pivotElement, eObject2);
		copyAnnotatedElement(pivotElement, eObject2, exclusions);
		doSwitchAll(pivotElement.getOwnedPackages(), eObject2.getESubpackages());
		doSwitchAll(pivotElement.getOwnedClasses(), eObject2.getEClassifiers());
		return pivotElement;
	}

	@Override
	public Object caseEParameter(EParameter eObject) {
		@SuppressWarnings("null") @NonNull EParameter eObject2 = eObject;
		Parameter pivotElement = converter.refreshNamedElement(Parameter.class, PivotPackage.Literals.PARAMETER, eObject2);
		copyTypedElement(pivotElement, eObject2, null);
		return pivotElement;
	}

	@Override
	public Object caseEReference(EReference eObject) {
		@SuppressWarnings("null") @NonNull EReference eObject2 = eObject;
		Property pivotElement = converter.refreshNamedElement(Property.class, PivotPackage.Literals.PROPERTY, eObject2);	
		List<EAnnotation> excludedAnnotations = null;
		EAnnotation oppositeRole = eObject2.getEAnnotation(EMOFExtendedMetaData.EMOF_PACKAGE_NS_URI_2_0);
		if (oppositeRole != null) {
			excludedAnnotations = new ArrayList<EAnnotation>();
			excludedAnnotations.add(oppositeRole);
		}
		oppositeRole = eObject2.getEAnnotation(EMOFExtendedMetaData.EMOF_PROPERTY_OPPOSITE_ROLE_NAME_ANNOTATION_SOURCE);
		if (oppositeRole != null) {
			if (excludedAnnotations == null) {
				excludedAnnotations = new ArrayList<EAnnotation>();
			}
			excludedAnnotations.add(oppositeRole);
		}
		copyStructuralFeature(pivotElement, eObject2, excludedAnnotations);
		pivotElement.setIsComposite(eObject2.isContainment());			
		pivotElement.setIsResolveProxies(eObject2.isResolveProxies());			
		if ((eObject2.getEOpposite() != null)
		 || (excludedAnnotations != null)
		 || !eObject2.getEKeys().isEmpty()) {
			converter.queueReference(eObject2);	// Defer
		}
		return pivotElement;
	}

	@Override
	public Object caseETypeParameter(ETypeParameter eObject) {
		@SuppressWarnings("null") @NonNull ETypeParameter eObject2 = eObject;
		TemplateParameter pivotElement = converter.refreshNamedElement(TemplateParameter.class, PivotPackage.Literals.TEMPLATE_PARAMETER, eObject2);
		converter.addMapping(eObject2, pivotElement);
		String name = technology.getOriginalName(eObject2);
		pivotElement.setName(name);
//		TemplateParameter templateParameter = pivotElement.isTemplateParameter();
//		if (templateParameter == null) {
//			templateParameter = PivotFactory.eINSTANCE.createTemplateParameter();
//			templateParameter.setOwnedParameteredElement(pivotElement);
//		}
		List<EGenericType> eBounds = eObject2.getEBounds();
		if (!eBounds.isEmpty()) {
			doSwitchAll(eBounds);
			converter.queueReference(eObject2);
		}
		return pivotElement;
	}

	protected @NonNull Constraint convertEOperation2Constraint(@NonNull EOperation eOperation) {
		Constraint constraint = PivotFactory.eINSTANCE.createConstraint();
		constraint.setName(technology.getOriginalName(eOperation));
		constraint.setIsCallable(true);
		String value = null;
		EAnnotation eAnnotation = OCLCommon.getDelegateAnnotation(eOperation);
		if (eAnnotation == null) {
			eAnnotation = eOperation.getEAnnotation(DerivedConstants.UML2_GEN_MODEL_PACKAGE_2_0_NS_URI);
		}
		if (eAnnotation == null) {
			eAnnotation = eOperation.getEAnnotation(DerivedConstants.UML2_GEN_MODEL_PACKAGE_1_1_NS_URI);
		}
		if (eAnnotation != null) {
			value = eAnnotation.getDetails().get("body");
		}
		ExpressionInOCL specification = PivotFactory.eINSTANCE.createExpressionInOCL();
		if (value != null) {
			specification.setBody(value);
		}
		constraint.setOwnedSpecification(specification);
		String commentBody = EcoreUtil.getAnnotation(eOperation, PivotConstantsInternal.DOCUMENTATION_ANNOTATION_SOURCE, PivotConstantsInternal.DOCUMENTATION_ANNOTATION_KEY);
		if (commentBody != null) {
			Comment pivotComment = PivotFactory.eINSTANCE.createComment();
			pivotComment.setBody(commentBody.replaceAll("\\r", ""));
			constraint.getOwnedComments().add(pivotComment);
		}				
		converter.addMapping(eOperation, constraint);
		return constraint;
	}

	protected @NonNull Operation convertEOperation2Operation(@NonNull EOperation eOperation) {
		Operation pivotElement = converter.refreshNamedElement(Operation.class, PivotPackage.Literals.OPERATION, eOperation);
		List<EAnnotation> excludedAnnotations = convertEOperationEAnnotations(pivotElement, eOperation);
		copyTypedElement(pivotElement, eOperation, excludedAnnotations);
		doSwitchAll(pivotElement.getOwnedParameters(), eOperation.getEParameters());
		@SuppressWarnings("null") @NonNull List<ETypeParameter> eTypeParameters = eOperation.getETypeParameters();
		copyTemplateSignature(pivotElement,eTypeParameters);
		doSwitchAll(eOperation.getEGenericExceptions());
		converter.queueReference(eOperation);				// For superclasses
		return pivotElement;
	}

	protected @Nullable List<EAnnotation> convertEOperationEAnnotations(@NonNull Operation pivotElement, @NonNull EOperation eOperation) {
		List<EAnnotation> excludedAnnotations = null;
		EAnnotation redefinesAnnotation = eOperation.getEAnnotation(PivotConstantsInternal.REDEFINES_ANNOTATION_SOURCE);
		if (redefinesAnnotation != null) {
//			if (excludedAnnotations == null) {
				excludedAnnotations = new ArrayList<EAnnotation>();
//			}
			excludedAnnotations.add(redefinesAnnotation);
		}
		EAnnotation oclAnnotation = OCLCommon.getDelegateAnnotation(eOperation);
		if (oclAnnotation == null) {
			oclAnnotation = eOperation.getEAnnotation(DerivedConstants.UML2_GEN_MODEL_PACKAGE_2_0_NS_URI);
		}
		if (oclAnnotation == null) {
			oclAnnotation = eOperation.getEAnnotation(DerivedConstants.UML2_GEN_MODEL_PACKAGE_1_1_NS_URI);
		}
		if (oclAnnotation != null) {
			if (excludedAnnotations == null) {
				excludedAnnotations = new ArrayList<EAnnotation>();
			}
			excludedAnnotations.add(oclAnnotation);
			for (Iterator<Map.Entry<String,String>> it = oclAnnotation.getDetails().listIterator(); it.hasNext(); ) {
				Map.Entry<String,String> entry = it.next();
				String bodyName = null;
				String preName = null;
				String postName = null;
				String key = entry.getKey();
				String value = entry.getValue();
				if (key.equals("body")) {
					bodyName = "";
					if (value != null) {
						value = PivotUtilInternal.getBodyExpression(value);	// Workaround Bug 419324
					}
				}
				else if (key.startsWith("body_")) {
					bodyName = key.substring(5);
				}
				else if (key.equals("pre")) {
					preName = "";
				}
				else if (key.startsWith("pre_")) {
					preName = key.substring(4);
				}
				else if (key.equals("post")) {
					postName = "";
				}
				else if (key.startsWith("post_")) {
					postName = key.substring(5);
				}
				else
				{
					converter.error("Unsupported operation constraint " + key);
					continue;
				}
				ExpressionInOCL specification = PivotFactory.eINSTANCE.createExpressionInOCL();
				specification.setBody(value);
//				constraint.setExprString(entry.getValue());
//				constraint.setExprString(entry.getValue());
				if (bodyName != null) {
					pivotElement.setBodyExpression(specification);
					pivotElement.setImplementation(new EObjectOperation(pivotElement, eOperation, specification));
				}
				else {
					Constraint constraint = PivotFactory.eINSTANCE.createConstraint();
					constraint.setOwnedSpecification(specification);
					if (preName != null) {
						pivotElement.getOwnedPreconditions().add(constraint);
						constraint.setName(preName);
					}
					else {
						pivotElement.getOwnedPostconditions().add(constraint);
						constraint.setName(postName);
					}
					copyAnnotationComment(constraint, oclAnnotation, key);
				}
			}				
		}
		return excludedAnnotations;
	}

	protected void copyClassifier(@NonNull org.eclipse.ocl.pivot.Class pivotElement, @NonNull EClassifier eClassifier, @Nullable List<EAnnotation> excludedAnnotations) {
		excludedAnnotations = refreshTypeConstraints(pivotElement, eClassifier, excludedAnnotations);
		copyNamedElement(pivotElement, eClassifier);
		copyAnnotatedElement(pivotElement, eClassifier, excludedAnnotations);
		if (eClassifier.eIsSet(EcorePackage.Literals.ECLASSIFIER__INSTANCE_CLASS_NAME)) {
			pivotElement.setInstanceClassName(eClassifier.getInstanceClassName());
		}
		else {
			pivotElement.eUnset(PivotPackage.Literals.CLASS__INSTANCE_CLASS_NAME);
		}
		@SuppressWarnings("null") @NonNull List<ETypeParameter> eTypeParameters = eClassifier.getETypeParameters();
		copyTemplateSignature(pivotElement, eTypeParameters);
	}

	protected void copyDataTypeOrEnum(@NonNull DataType pivotElement, @NonNull EDataType eDataType) {
		copyClassifier(pivotElement, eDataType, null);
		pivotElement.setIsSerializable(eDataType.isSerializable());
	}

	protected void copyTemplateSignature(@NonNull TemplateableElement pivotElement, @NonNull List<ETypeParameter> eTypeParameters) {
		if (!eTypeParameters.isEmpty()) {
			TemplateSignature pivotTemplateSignature = PivotFactory.eINSTANCE.createTemplateSignature();
			pivotElement.setOwnedSignature(pivotTemplateSignature);
			doSwitchAll(pivotTemplateSignature.getOwnedParameters(), eTypeParameters);
		}
	}

	/**
	 * Convert all eModelElement EAnnotations to pivotElement Annotations except specifically excludedAnnotations.
	 * Documentation EAnnotations are converted to Comments rather than Annotations.
	 * Import EAnnotations are excluded here and processed at the root.
	 */
	protected void copyAnnotatedElement(@NonNull NamedElement pivotElement,
			@NonNull EModelElement eModelElement, List<EAnnotation> excludedAnnotations) {
		List<Element> pivotAnnotations = pivotElement.getOwnedAnnotations();
		for (EAnnotation eAnnotation : eModelElement.getEAnnotations()) {
			if ((excludedAnnotations == null) || !excludedAnnotations.contains(eAnnotation)) {
				String source = eAnnotation.getSource();
				@SuppressWarnings("null")@NonNull EMap<String, String> details = eAnnotation.getDetails();
				if (hasDocumentationKey(source, details)) {
					Comment pivotComment = PivotFactory.eINSTANCE.createComment();
					pivotComment.setBody(details.get(PivotConstantsInternal.DOCUMENTATION_ANNOTATION_KEY));
					pivotElement.getOwnedComments().add(pivotComment);
				}				
				else if (hasImportKey(source, details)) {
				}				
				else /*if (!eAnnotation.getContents().isEmpty()
				 || !eAnnotation.getReferences().isEmpty()
				 || (details.size() > 1)
				 || ((details.size() == 1) && !hasDocumentationKey(source, details)))*/ {
					Annotation pivotAnnotation = (Annotation) doSwitch(eAnnotation);
					pivotAnnotations.add(pivotAnnotation);
				}
			}
		}
	}

	/**
	 * Convert all eModelElement EAnnotations to pivotElement Annotations except specifically excludedAnnotations.
	 * Documentation EAnnotations are converted to Comments rather than Annotations.
	 * Import EAnnotations are excluded here and processed at the root.
	 */
	protected void copyAnnotationComment(@NonNull Constraint pivotElement, @NonNull EAnnotation eModelElement, @NonNull String key) {
		pivotElement.getOwnedComments().clear();
		String comment = EcoreUtil.getAnnotation(eModelElement, PivotConstantsInternal.DOCUMENTATION_ANNOTATION_SOURCE, key);
		if (comment != null) {
			Comment pivotComment = PivotFactory.eINSTANCE.createComment();
			pivotComment.setBody(comment);
			pivotElement.getOwnedComments().add(pivotComment);
		}
	}

	protected void copyNamedElement(@NonNull NamedElement pivotElement, @NonNull ENamedElement eNamedElement) {
		converter.addMapping(eNamedElement, pivotElement);
		String name = technology.getOriginalName(eNamedElement);
		pivotElement.setName(name);
	}

	protected void copyStructuralFeature(@NonNull Property pivotElement, @NonNull EStructuralFeature eObject, List<EAnnotation> excludedAnnotations) {
		EAnnotation redefinesAnnotation = eObject.getEAnnotation(PivotConstantsInternal.REDEFINES_ANNOTATION_SOURCE);
		if (redefinesAnnotation != null) {
			if (excludedAnnotations == null) {
				excludedAnnotations = new ArrayList<EAnnotation>();
			}
			excludedAnnotations.add(redefinesAnnotation);
		}
		EAnnotation oclAnnotation = OCLCommon.getDelegateAnnotation(eObject);
		if (oclAnnotation != null) {
			if (excludedAnnotations == null) {
				excludedAnnotations = new ArrayList<EAnnotation>();
			}
			excludedAnnotations.add(oclAnnotation);
			Map.Entry<String,String> bestEntry = null;
			for (Map.Entry<String,String> entry : oclAnnotation.getDetails().entrySet()) {
				String key = entry.getKey();
				if (key.equals(SettingBehavior.DERIVATION_CONSTRAINT_KEY)) {
					bestEntry = entry;
				}
				else if (key.equals(SettingBehavior.INITIAL_CONSTRAINT_KEY)) {
					if (bestEntry == null) {
						bestEntry = entry;
					}
				}
				else if (key.equals("get")) {
					if (bestEntry == null) {
						bestEntry = entry;
					}
				}
				else
				{
					converter.error("Unsupported feature constraint " + key);
				}
			}				
			if (bestEntry != null) {
				String value = bestEntry.getValue();
				ExpressionInOCL specification = PivotFactory.eINSTANCE.createExpressionInOCL();
				specification.setBody(value);
//					constraint.setExprString(entry.getValue());
				pivotElement.setOwnedExpression(specification);
				pivotElement.setImplementation(new EObjectProperty(eObject, specification));
			}
			else {
				pivotElement.setImplementation(new EObjectProperty(eObject, null));
			}
		}
		copyTypedElement(pivotElement, eObject, excludedAnnotations);
		pivotElement.setIsReadOnly(!eObject.isChangeable());			
		pivotElement.setIsDerived(eObject.isDerived());			
		pivotElement.setIsTransient(eObject.isTransient());			
		pivotElement.setIsUnsettable(eObject.isUnsettable());			
		pivotElement.setIsVolatile(eObject.isVolatile());			
	}

	protected void copyTypedElement(@NonNull TypedElement pivotElement, @NonNull ETypedElement eTypedElement, List<EAnnotation> excludedAnnotations) {
		copyNamedElement(pivotElement, eTypedElement);
		List<EAnnotation> excludedAnnotations2 = excludedAnnotations;
		EAnnotation eAnnotation = eTypedElement.getEAnnotation(PivotConstants.COLLECTION_ANNOTATION_SOURCE);
		if (eAnnotation != null) {
			excludedAnnotations2 = excludedAnnotations != null ? new ArrayList<EAnnotation>(excludedAnnotations) : new ArrayList<EAnnotation>();
			excludedAnnotations2.add(eAnnotation);
		}
		copyAnnotatedElement(pivotElement, eTypedElement, excludedAnnotations2);
		int lower = eTypedElement.getLowerBound();
		int upper = eTypedElement.getUpperBound();
		pivotElement.setIsRequired((upper == 1) && (lower == 1));
		EGenericType eGenericType = eTypedElement.getEGenericType();
		if (eGenericType != null) {
			doInPackageSwitch(eGenericType);
			converter.queueReference(eTypedElement);
		}
	}

	@Override
	public Element defaultCase(EObject object) {
		converter.error("Unsupported " + object.eClass().getName() + " for Ecore2ASDeclarationSwitch");
		return null;
	}

	public Object doInPackageSwitch(EObject eObject) {
		EClass eClass = eObject.eClass();
		if (eClass.getEPackage() != EcorePackage.eINSTANCE) {
			converter.error("Non Ecore " + eClass.getName() + " for Ecore2ASDeclarationSwitch");
			return null;
		}
		int classifierID = eClass.getClassifierID();
		return doSwitch(classifierID, eObject);
	}

	public <T extends Element> void doSwitchAll(List<T> pivotObjects, List<? extends EObject> eObjects) {
		List<T> newList = new ArrayList<T>();
		for (EObject eObject : eObjects) {
			@SuppressWarnings("unchecked")
			T pivotObject = (T) doSwitch(eObject);
			newList.add(pivotObject);
		}
		PivotUtilInternal.refreshList(pivotObjects, newList);
	}

	public <T extends Element> void doSwitchAll(List<? extends EObject> eObjects) {
		for (EObject eObject : eObjects) {
			doSwitch(eObject);
		}
	}

	protected List<EAnnotation> refreshTypeConstraints(@NonNull org.eclipse.ocl.pivot.Class pivotElement, @NonNull EClassifier eClassifier, @Nullable List<EAnnotation> excludedAnnotations) {
		EMap<String, String> oclAnnotationDetails = null;
		Map<String, Constraint> newConstraintMap = null;
		Map<String, Constraint> oldInvariantMap = null;
		List<Constraint> newInvariants = null;
		List<Constraint> oldInvariants = pivotElement.getOwnedInvariants();
		if (oldInvariants.size() > 0) {
			oldInvariantMap = new HashMap<String, Constraint>();
			for (Constraint oldInvariant : oldInvariants) {
				oldInvariantMap.put(oldInvariant.getName(), oldInvariant);
			}
		}
		/*
		 * Create explicit constraints.
		 */
		EAnnotation oclAnnotation = OCLCommon.getDelegateAnnotation(eClassifier);
		if (oclAnnotation != null) {
			if (excludedAnnotations == null) {
				excludedAnnotations = new ArrayList<EAnnotation>();
			}
			excludedAnnotations.add(oclAnnotation);
			oclAnnotationDetails = oclAnnotation.getDetails();
			for (Iterator<Map.Entry<String,String>> it = oclAnnotationDetails.listIterator(); it.hasNext(); ) {
				Map.Entry<String,String> entry = it.next();
				String invariantName = entry.getKey();
				if (invariantName == null) {
					invariantName = "";
				}
				@SuppressWarnings("deprecation")
				String messageAnnotationDetailSuffix = PivotConstantsInternal.MESSAGE_ANNOTATION_DETAIL_SUFFIX;
				if (!invariantName.endsWith(messageAnnotationDetailSuffix)) {
					Constraint invariant = null;
					LanguageExpression specification = null;
					if (oldInvariantMap != null) {
						invariant = oldInvariantMap.get(invariantName);
					}
					if (invariant == null) {
						invariant = PivotFactory.eINSTANCE.createConstraint();
						invariant.setName(invariantName);
					}
					else {
						specification = invariant.getOwnedSpecification();
					}
					ExpressionInOCL expression;
					if (specification instanceof ExpressionInOCL) {
						expression = (ExpressionInOCL)specification;
					}
					else {
						expression = PivotFactory.eINSTANCE.createExpressionInOCL();
						invariant.setOwnedSpecification(expression);
					}
					String value = entry.getValue();
					// Rescue any deprecated format message expressions
					String message = oclAnnotationDetails.get(invariantName + messageAnnotationDetailSuffix);
					if ((value != null) && (message != null)) {
						value = PivotUtil.createTupleValuedConstraint(value, null, message);
					}
					expression.setBody(value);
					if (newInvariants == null) {
						newInvariants = new ArrayList<Constraint>();
					}
					newInvariants.add(invariant);
					if (newConstraintMap == null) {
						newConstraintMap = new HashMap<String, Constraint>();
					}
					newConstraintMap.put(invariantName, invariant);
					copyAnnotationComment(invariant, oclAnnotation, PivotConstantsInternal.DOCUMENTATION_ANNOTATION_KEY);
				}
			}
		}
		/*
		 * Create dummy invariants for name-only invariants.
		 */
		EAnnotation ecoreAnnotation = eClassifier.getEAnnotation(EcorePackage.eNS_URI);
		if (ecoreAnnotation != null) {
			if (excludedAnnotations == null) {
				excludedAnnotations = new ArrayList<EAnnotation>();
			}
			excludedAnnotations.add(ecoreAnnotation);
			String invariantNameList = ecoreAnnotation.getDetails().get("constraints");
			if (invariantNameList != null) {
				String[] invariantNames = invariantNameList.split(" ");
				for (String invariantName : invariantNames) {
					if ((oclAnnotationDetails == null) || !oclAnnotationDetails.containsKey(invariantName)) {
						Constraint invariant = null;
						if (newConstraintMap != null) {
							invariant = newConstraintMap.get(invariantName);
						}
						if (invariant == null) {
							invariant = PivotFactory.eINSTANCE.createConstraint();
							invariant.setName(invariantName);
						}
						ExpressionInOCL specification = PivotFactory.eINSTANCE.createExpressionInOCL();
						invariant.setOwnedSpecification(specification);
						if (newInvariants == null) {
							newInvariants = new ArrayList<Constraint>();
						}
						newInvariants.add(invariant);
						if (newConstraintMap == null) {
							newConstraintMap = new HashMap<String, Constraint>();
						}
						newConstraintMap.put(invariantName, invariant);
					}
				}
			}
		}
		if (newInvariants != null) {
			converter.refreshList(oldInvariants, newInvariants);
		}
		else {
			oldInvariants.clear();
		}
		return excludedAnnotations;
	}
}
