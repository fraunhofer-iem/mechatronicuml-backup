/*******************************************************************************
 * Copyright (c) 2012, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.context;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.PivotFactory;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
import org.eclipse.ocl.pivot.internal.messages.PivotMessagesInternal;
import org.eclipse.ocl.pivot.internal.resource.EnvironmentFactoryAdapter;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.resource.CSResource;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.EnvironmentFactory;
import org.eclipse.ocl.pivot.utilities.Nameable;
import org.eclipse.ocl.pivot.utilities.ParserContext;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.Pivotable;
import org.eclipse.ocl.pivot.utilities.StringUtil;

public abstract class AbstractParserContext /*extends AdapterImpl*/ implements ParserContext
{
	protected final @NonNull EnvironmentFactoryInternal environmentFactory;
	protected final @NonNull URI uri;
	protected @Nullable Element rootElement = null;

	protected AbstractParserContext(@NonNull EnvironmentFactory environmentFactory, @Nullable URI uri) {
		this.environmentFactory = (EnvironmentFactoryInternal) environmentFactory;
		if (uri != null) {
			this.uri = uri;
		}
		else {
			this.uri = ClassUtil.nonNullEMF(URI.createURI(EcoreUtil.generateUUID() + ".essentialocl"));
		}
	}

	@Override
	public @NonNull CSResource createBaseResource(@NonNull String expression) throws IOException, ParserException {
		InputStream inputStream = new URIConverter.ReadableInputStream(expression, "UTF-8");
		try {
			ResourceSetImpl resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.createResource(uri);
			if (resource == null) {
				throw new ParserException("Failed to load '" + uri + "'" + getDoSetupMessage());
			}
			if (!(resource instanceof CSResource)) {
				throw new ParserException("Failed to create Xtext resource for '" + uri + "'" + getDoSetupMessage());
			}
			CSResource baseResource = (CSResource)resource;
			getEnvironmentFactory().adapt(resource);
			baseResource.setParserContext(this);
			baseResource.load(inputStream, null);
			return baseResource;
		}
		finally {
			inputStream.close();
		}
	}

	@Override
	public @Nullable Type getClassContext() {
		return null;
	}

	protected @NonNull String getDoSetupMessage() {
		if (EcorePlugin.IS_ECLIPSE_RUNNING) {
			return "";
		}
		String doSetup = environmentFactory.getDoSetupName(uri);
		if (doSetup == null) {
			return "";
		}
		return "\n\tMake sure " + doSetup + " has been called.";
	}

	public @NonNull EnvironmentFactoryInternal getEnvironmentFactory() {
		return environmentFactory;
	}

	public @Nullable Type getInstanceContext() {
		return null;
	}

	@Override
	public @NonNull ExpressionInOCL getExpression(@NonNull CSResource resource) throws ParserException {
		List<EObject> contents = resource.getContents();
		int size = contents.size();
		if (size < 1) {
			throw new ParserException("Missing parse returns");
		}
		if (size > 1) {
			throw new ParserException("Extra parse returns");
		}
		EObject csObject = contents.get(0);
		if (csObject instanceof Pivotable) {
			Element pivotElement = ((Pivotable)csObject).getPivot();
			if (pivotElement instanceof ExpressionInOCL) {
				return (ExpressionInOCL) pivotElement;
			}
		}
		throw new ParserException("Non-expression ignored");
	}

	@Override
	public @NonNull PivotMetamodelManager getMetamodelManager() {
		return environmentFactory.getMetamodelManager();
	}

	@Override
	public @Nullable Element getRootElement() {
		return rootElement;
	}

	@Override
	public void initialize(@NonNull Base2ASConversion conversion, @NonNull ExpressionInOCL expression) {
//		List<String> language = expression.getLanguage();
//		language.clear();
//		language.add(PivotConstants.OCL_LANGUAGE);
	}

	@Override
	public @NonNull ExpressionInOCL parse(@Nullable EObject owner, @NonNull String expression) throws ParserException {
		CSResource resource = null;
		try {
			resource = createBaseResource(expression);
			String childName = owner instanceof Nameable ? ((Nameable)owner).getName() : "<unknown>";
			EObject eContainer = owner != null ? owner.eContainer() : null;
			String parentName = eContainer instanceof Nameable ? ((Nameable)eContainer).getName() : "<unknown>";
			PivotUtil.checkResourceErrors(StringUtil.bind(PivotMessagesInternal.ValidationConstraintIsInvalid_ERROR_, parentName, childName, expression.trim()), resource);
			ExpressionInOCL expressionInOCL = getExpression(resource);
			expressionInOCL.setBody(expression);
			return expressionInOCL;
		} catch (IOException e) {
//				throw new ParserException("Failed to load expression", e);
			@SuppressWarnings("null")@NonNull ExpressionInOCL specification = PivotFactory.eINSTANCE.createExpressionInOCL();
			OCLExpression invalidValueBody = getMetamodelManager().createInvalidExpression();
			PivotUtil.setBody(specification, invalidValueBody, null);
			return specification;
		} finally {
			if (resource != null) {
				resource.unload();
				ResourceSet resourceSet = resource.getResourceSet();
				if (resourceSet != null) {
					resourceSet.getResources().remove(resource);
				}
				EnvironmentFactoryAdapter.disposeAll(resource);
			}
		}
	}
	
	@Override
	public void setRootElement(@Nullable Element rootElement) {
		this.rootElement = rootElement;
	}
}
