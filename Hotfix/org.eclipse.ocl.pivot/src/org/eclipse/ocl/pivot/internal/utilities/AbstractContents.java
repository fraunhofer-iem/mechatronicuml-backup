/*******************************************************************************
 * Copyright (c) 2012, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package	org.eclipse.ocl.pivot.internal.utilities;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.AnyType;
import org.eclipse.ocl.pivot.BagType;
import org.eclipse.ocl.pivot.CollectionType;
import org.eclipse.ocl.pivot.Comment;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.Import;
import org.eclipse.ocl.pivot.InvalidType;
import org.eclipse.ocl.pivot.Iteration;
import org.eclipse.ocl.pivot.Library;
import org.eclipse.ocl.pivot.MapType;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.Namespace;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.OrderedSetType;
import org.eclipse.ocl.pivot.PivotFactory;
import org.eclipse.ocl.pivot.PrimitiveType;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.SequenceType;
import org.eclipse.ocl.pivot.SetType;
import org.eclipse.ocl.pivot.TemplateParameter;
import org.eclipse.ocl.pivot.TemplateSignature;
import org.eclipse.ocl.pivot.TemplateableElement;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.VoidType;
import org.eclipse.ocl.pivot.ids.PackageId;
import org.eclipse.ocl.pivot.internal.LibraryImpl;
import org.eclipse.ocl.pivot.internal.library.StandardLibraryContribution;
import org.eclipse.ocl.pivot.library.LibraryFeature;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.NameUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.StringUtil;
import org.eclipse.ocl.pivot.values.Unlimited;

public abstract class AbstractContents extends PivotUtil
{
	protected @NonNull BagType createBagType(@NonNull String name, @Nullable String lower, @Nullable String upper, @NonNull TemplateParameter templateParameter) {
		return createCollectionType(PivotFactory.eINSTANCE.createBagType(), name, lower, upper, templateParameter);
	}

	protected @NonNull <T extends CollectionType> T createCollectionType(/*@NonNull*/ T pivotType, @NonNull String name, @Nullable  String lower, @Nullable String upper, @NonNull TemplateParameter templateParameter) {
		pivotType.setName(name);
		pivotType.setLower(lower != null ? StringUtil.createNumberFromString(lower) : Integer.valueOf(0));
		pivotType.setUpper(upper != null ? StringUtil.createNumberFromString(upper) : Unlimited.INSTANCE);
		initTemplateParameter(pivotType, templateParameter);
		pivotType.setElementType(templateParameter);
		return pivotType;
	}

	protected @NonNull CollectionType createCollectionType(@NonNull String name, @Nullable String lower, @Nullable String upper, @NonNull TemplateParameter templateParameter) {
		return createCollectionType(PivotFactory.eINSTANCE.createCollectionType(), name, lower, upper, templateParameter);
	}
	
	protected @NonNull ExpressionInOCL createExpressionInOCL(@NonNull Type type, @NonNull String exprString) {
		ExpressionInOCL pivotExpression = PivotFactory.eINSTANCE.createExpressionInOCL();
		pivotExpression.setType(type);
		pivotExpression.setBody(exprString);
		return pivotExpression;
	}

	protected @NonNull Import createImport(@Nullable String name, @NonNull Namespace namespace) {
		Import asImport = PivotFactory.eINSTANCE.createImport();
		asImport.setName(name);
		asImport.setImportedNamespace(namespace);
		return asImport;
	}
	
	protected @NonNull Iteration createIteration(@NonNull String name, @NonNull Type type, @Nullable String implementationClass, @NonNull LibraryFeature implementation, TemplateParameter... templateParameters) {
		Iteration pivotIteration = createIteration(name, type, implementationClass, implementation);
		initTemplateParameters(pivotIteration, templateParameters);
		return pivotIteration;
	}

	protected @NonNull Library createLibrary(@NonNull String name, @NonNull String nsPrefix, @NonNull String nsURI, @Nullable PackageId packageId) {
		Library pivotLibrary = PivotFactory.eINSTANCE.createLibrary();
		pivotLibrary.setName(name);
		pivotLibrary.setNsPrefix(nsPrefix);
		if (packageId != null) {
			((LibraryImpl)pivotLibrary).setPackageId(packageId);  // FIXME Add to API
		}
		pivotLibrary.setURI(nsURI);
		return pivotLibrary;
	}

	protected @NonNull MapType createMapType(/*@NonNull*/ MapType pivotType, @NonNull String name, @NonNull TemplateParameter keyParameter, @NonNull TemplateParameter valueParameter) {
		pivotType.setName(name);
		initTemplateParameters(pivotType, keyParameter, valueParameter);
		pivotType.setKeyType(keyParameter);
		pivotType.setValueType(valueParameter);
		return pivotType;
	}

	protected @NonNull MapType createMapType(@NonNull String name, @NonNull TemplateParameter keyParameter, @NonNull TemplateParameter valueParameter) {
		return createMapType(PivotFactory.eINSTANCE.createMapType(), name, keyParameter, valueParameter);
	}

	protected @NonNull Operation createOperation(@NonNull String name, @NonNull Type type, @Nullable String implementationClass, @Nullable LibraryFeature implementation, TemplateParameter... templateParameters) {
		Operation pivotOperation = createOperation(name, type, implementationClass, implementation);
		initTemplateParameters(pivotOperation, templateParameters);
		return pivotOperation;
	}

	protected @NonNull OrderedSetType createOrderedSetType(@NonNull String name, @Nullable String lower, @Nullable String upper, @NonNull TemplateParameter templateParameter) {
		return createCollectionType(PivotFactory.eINSTANCE.createOrderedSetType(), name, lower, upper, templateParameter);
	}

	protected @NonNull SequenceType createSequenceType(@NonNull String name, @Nullable String lower, @Nullable String upper, @NonNull TemplateParameter templateParameter) {
		return createCollectionType(PivotFactory.eINSTANCE.createSequenceType(), name, lower, upper, templateParameter);
	}

	protected @NonNull SetType createSetType(@NonNull String name, @Nullable String lower, @Nullable String upper, @NonNull TemplateParameter templateParameter) {
		return createCollectionType(PivotFactory.eINSTANCE.createSetType(), name, lower, upper, templateParameter);
	}

	protected @NonNull AnyType getAnyType(@NonNull org.eclipse.ocl.pivot.Package asPackage, @NonNull String name) {
		return (AnyType) ClassUtil.nonNullState(asPackage.getOwnedClass(name));
	}

	protected @NonNull BagType getBagType(@NonNull org.eclipse.ocl.pivot.Package asPackage, @NonNull String name) {
		return (BagType) ClassUtil.nonNullState(asPackage.getOwnedClass(name));
	}

	protected @NonNull org.eclipse.ocl.pivot.Class getClass(@NonNull org.eclipse.ocl.pivot.Package asPackage, @NonNull String name) {
		return ClassUtil.nonNullState(asPackage.getOwnedClass(name));
	}

	protected @NonNull CollectionType getCollectionType(@NonNull org.eclipse.ocl.pivot.Package asPackage, @NonNull String name) {
		return (CollectionType) ClassUtil.nonNullState(asPackage.getOwnedClass(name));
	}

	protected @NonNull InvalidType getInvalidType(@NonNull org.eclipse.ocl.pivot.Package asPackage, @NonNull String name) {
		return (InvalidType) ClassUtil.nonNullState(asPackage.getOwnedClass(name));
	}

	protected @NonNull Library getLibrary(@NonNull Model asModel, @NonNull String name) {
		return (Library) ClassUtil.nonNullState(NameUtil.getNameable(asModel.getOwnedPackages(), name));
	}

	protected @NonNull Model getModel(@NonNull String modelURI) {
		StandardLibraryContribution standardLibraryContribution = ClassUtil.nonNullState(StandardLibraryContribution.REGISTRY.get(modelURI));
		Resource resource = standardLibraryContribution.getResource();
		return ClassUtil.nonNullState((Model) resource.getContents().get(0));
	}

	protected @NonNull OrderedSetType getOrderedSetType(@NonNull org.eclipse.ocl.pivot.Package asPackage, @NonNull String name) {
		return (OrderedSetType) ClassUtil.nonNullState(asPackage.getOwnedClass(name));
	}

	protected @NonNull org.eclipse.ocl.pivot.Package getPackage(@NonNull Model asModel, @NonNull String name) {
		return ClassUtil.nonNullState(NameUtil.getNameable(asModel.getOwnedPackages(), name));
	}

	protected @NonNull PrimitiveType getPrimitiveType(@NonNull org.eclipse.ocl.pivot.Package asPackage, @NonNull String name) {
		return (PrimitiveType) ClassUtil.nonNullState(asPackage.getOwnedClass(name));
	}

	protected @NonNull Property getProperty(@NonNull org.eclipse.ocl.pivot.Class asClass, @NonNull String name) {
		return ClassUtil.nonNullState(NameUtil.getNameable(asClass.getOwnedProperties(), name));
	}

	protected @NonNull SequenceType getSequenceType(@NonNull org.eclipse.ocl.pivot.Package asPackage, @NonNull String name) {
		return (SequenceType) ClassUtil.nonNullState(asPackage.getOwnedClass(name));
	}

	protected @NonNull SetType getSetType(@NonNull org.eclipse.ocl.pivot.Package asPackage, @NonNull String name) {
		return (SetType) ClassUtil.nonNullState(asPackage.getOwnedClass(name));
	}

	protected @NonNull TemplateParameter getTemplateParameter(@NonNull TemplateableElement templateableElement, int index) {
		return ClassUtil.nonNullState(templateableElement.getOwnedSignature().getOwnedParameters().get(index));
	}

	protected @NonNull VoidType getVoidType(@NonNull org.eclipse.ocl.pivot.Package asPackage, @NonNull String name) {
		return (VoidType) ClassUtil.nonNullState(asPackage.getOwnedClass(name));
	}

	protected <T extends CollectionType> void initTemplateParameter(@NonNull TemplateableElement pivotType, @NonNull TemplateParameter templateParameter) {
		TemplateSignature templateSignature = PivotFactory.eINSTANCE.createTemplateSignature();
		templateSignature.getOwnedParameters().add(templateParameter);
		pivotType.setOwnedSignature(templateSignature);
	}

	protected <T extends CollectionType> void initTemplateParameters(@NonNull TemplateableElement pivotType, TemplateParameter... templateParameters) {
		if ((templateParameters != null) && (templateParameters.length > 0)) {
			TemplateSignature templateSignature = PivotFactory.eINSTANCE.createTemplateSignature();
			for (TemplateParameter templateParameter : templateParameters) {
				templateSignature.getOwnedParameters().add(templateParameter);
			}
			pivotType.setOwnedSignature(templateSignature);
		}
	}

	protected void installComment(Element element, @NonNull String body) {
		Comment pivotComment = PivotFactory.eINSTANCE.createComment();
		pivotComment.setBody(body);
		element.getOwnedComments().add(pivotComment);
	}
}
