/*******************************************************************************
 * Copyright (c) 2011, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D. Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.prettyprint;

import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.AnyType;
import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.CollectionType;
import org.eclipse.ocl.pivot.Iteration;
import org.eclipse.ocl.pivot.LambdaType;
import org.eclipse.ocl.pivot.MapType;
import org.eclipse.ocl.pivot.NamedElement;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.Parameter;
import org.eclipse.ocl.pivot.PrimitiveType;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.TemplateParameter;
import org.eclipse.ocl.pivot.TupleType;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.util.AbstractExtendingVisitor;
import org.eclipse.ocl.pivot.util.Visitable;

/**
 * The PivotPrettyPrintVisitor supports pretty printing of a Pivot model elements.
 * PrettyPrintOptions may be used to configure the printing.
 */
public class PrettyPrintVisitor extends AbstractExtendingVisitor<Object,PrettyPrinter>
{
	public PrettyPrintVisitor(@NonNull PrettyPrinter context) {
		super(context);
	}
	
	@Override
	public Object safeVisit(@Nullable Visitable element) {
		if (element == null) {
			return null;
		}
		else {
			try {
				return element.accept(this);
			}
			catch (Exception e) {
				context.append("<<" + e.getClass().getSimpleName() + ">>");
				return null;
			}
		}
	}
	
	@Override
	public String toString() {
		return context.toString();
	}

	@Override
	public @Nullable Object visitAnyType(@NonNull AnyType object) {
		context.appendName(object);
		return null;
	}

	@Override
	public Object visitClass(@NonNull Class object) {
		if (context.showNames()) {
			context.appendParent(context.getScope(), object, "::");
		}
		context.appendName(object);
		context.appendTemplateParameters(object);
		context.appendTemplateBindings(object);
		return null;
	}

	@Override
	public Object visitCollectionType(@NonNull CollectionType object) {
		context.appendName(object);
		context.appendTemplateParameters(object);
		context.appendTemplateBindings(object);
		return null;
	}

	@Override
	public Object visitExpressionInOCL(@NonNull org.eclipse.ocl.pivot.ExpressionInOCL object) {
		if (object.getBody() != null) {
			return super.visitExpressionInOCL(object);
		}
		else {
			context.appendElement(object.getOwnedBody());
			return null;
		}
	}

	@Override
	public Object visitLambdaType(@NonNull LambdaType object) {
//		appendParent(object.eContainer(), object, "::");
		context.appendName(object, context.getRestrictedNames());
		context.append(" ");
		context.appendElement(object.getContextType());
		context.append("(");
		String prefix = ""; //$NON-NLS-1$
		for (Type parameterType : object.getParameterType()) {
			context.append(prefix);
			context.appendElement(parameterType);
//			appendMultiplicity(parameter);
			prefix = ",";
		}
		context.append(") : ");
		context.appendElement(object.getResultType());
		return null;
	}

	@Override
	public Object visitMapType(@NonNull MapType object) {
		context.appendName(object);
		context.appendTemplateParameters(object);
		context.appendTemplateBindings(object);
		return null;
	}

	@Override
	public Object visitNamedElement(@NonNull NamedElement object) {
		if (context.showNames()) {
			context.appendParent(context.getScope(), object, "::");
		}
		context.appendName(object, context.getReservedNames());
		return null;
	}

	@Override
	public Object visitOperation(@NonNull Operation object) {
		if (context.showNames()) {
			context.appendParent(context.getScope(), object, "::");
			context.appendName(object);
		}
		else {
			context.appendName(object, context.getReservedNames());
		}
		context.appendTemplateParameters(object);
		context.appendTemplateBindings(object);
		if (context.showNames()) {
			context.appendParameters(object, true);
			Type type = object.getType();
			if (type != null) {
				context.append(" : ");
				context.appendTypedMultiplicity(object);
			}
		}
		else {
			context.append("(");
			String prefix = ""; //$NON-NLS-1$
			if (object instanceof Iteration) {
				Iteration iteration = (Iteration)object;
				for (Parameter parameter : iteration.getOwnedIterators()) {
					context.append(prefix);
					context.appendTypedMultiplicity(parameter);
					prefix = ",";
				}
				if (iteration.getOwnedAccumulators().size() > 0) {
					prefix = ";";
					for (Parameter parameter : iteration.getOwnedAccumulators()) {
						context.append(prefix);
						context.appendTypedMultiplicity(parameter);
						prefix = ",";
					}
				}
				prefix = "|";
			}
			for (Parameter parameter : object.getOwnedParameters()) {
				context.append(prefix);
				context.appendTypedMultiplicity(parameter);
				prefix = ",";
			}
			context.append(")");
		}
		return null;
	}

	@Override
	public Object visitPrimitiveType(@NonNull PrimitiveType object) {
		context.appendName(object);
		return null;
	}

	@Override
	public Object visitTemplateParameter(@NonNull TemplateParameter object) {
		if (context.showNames()) {
//			context.appendParent(context.getScope(), object.getSignature(), "::");
			context.appendName(object);
		}
		else {
			context.appendName(object, context.getRestrictedNames());
		}
		return null;
	}

	@Override
	public Object visitTupleType(@NonNull TupleType object) {
		if (context.showNames()) {
			context.appendParent(context.getScope(), object, "::");
		}
		context.appendName(object);
		List<Property> tupleParts = object.getOwnedProperties();
		if (!tupleParts.isEmpty()) {
			context.append("(");
			String prefix = ""; //$NON-NLS-1$
			for (Property tuplePart : tupleParts) {
				context.append(prefix);
				if (context.showNames()) {
					context.appendName(tuplePart);
					context.append(":");
					context.appendTypedMultiplicity(tuplePart);
				}
				else {
					context.appendName(tuplePart, context.getRestrictedNames());
					context.append(":");
					context.appendElement(tuplePart.getType());
				}
				prefix = ", ";
			}
			context.append(")");
		}
		return null;
	}

	@Override
	public Object visitTypedElement(@NonNull TypedElement object) {
		if (context.showNames()) {
			context.appendParent(context.getScope(), object, "::");
			context.appendName(object);
			context.append(" : ");
		}
		context.appendTypedMultiplicity(object);
		return null;
	}

	@Override
	public String visiting(@NonNull Visitable visitable) {
		return visitable.getClass().getName();
	}
}
