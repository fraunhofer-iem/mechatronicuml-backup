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
package org.eclipse.ocl.pivot.utilities;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.internal.context.Base2ASConversion;
import org.eclipse.ocl.pivot.resource.CSResource;

/**
 * A ParserContext captures the context in which source text is parsed.
 * 
 * A derived context is constructed with the relevant context, then createBaseResource
 * creates a Concrete Syntax resource for a Concrete Syntax expression string. Then parse creates
 * a corresponding Abstract Syntax ExpressionInOCL. initialize is invoked during the parse to
 * install the derived context into the ExpressionInOCL.
 */
public interface ParserContext // extends Adapter
{
	/**
	 * Create a Concrete Syntax resource containing the parsed expression.
	 * 
	 * Semantic errors may be found at the Resource.errors
	 * and may be converted to ParseExceptions by invoking
	 * PivitUtil.checkResourceErrors.
	 * 
	 * @throws IOException if resource loading fails
	 * @throws ParserException 
	 */
	@NonNull CSResource createBaseResource(@NonNull String expression) throws IOException, ParserException;
	
	/**
	 * Return the type of the self variable.
	 */
	@Nullable Type getClassContext();

	/**
	 * Extract an Abstract Syntax ExpressionInOCL fronm a Concrete Syntax resource.
	 * 
	 * @throws ParserException if parsing fails
	 */
	@Nullable ExpressionInOCL getExpression(@NonNull CSResource resource) throws ParserException;

	/**
	 * Return the MetamodelManager in use.
	 */
	@NonNull MetamodelManager getMetamodelManager();

	/**
	 * Optional pre-existing AS root element to be updated by the parse.
	 */
	@Nullable Element getRootElement();

	/**
	 * Callback to initialize the ExpressionInOCL with the derived context such as
	 * a contextvariable for the self type, parameter and result variables.
	 */
	void initialize(@NonNull Base2ASConversion conversion, @NonNull ExpressionInOCL expression);
	
	/**
	 * Create an Abstract Syntax ExpressionInOCL containing the parsed expression on behalf of a potential owner.
	 * <p>
	 * This an invariant/precondition may specify its constraint as the owner
	 * <br>
	 * an operation body may specify the operation as the owner
	 * <p>
	 * The owner should be non-null but a null value is tolerated for deprecated compatibility.
	 * 
	 * @throws ParserException if parsing fails
	 */
	@NonNull ExpressionInOCL parse(@Nullable EObject owner, @NonNull String expression) throws ParserException;
	
	void setRootElement(@Nullable Element rootElement);
}
