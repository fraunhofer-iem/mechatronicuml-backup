/*******************************************************************************
 * Copyright (c) 2012, 2014 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.ids;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.ids.BindingsId;
import org.eclipse.ocl.pivot.ids.IdVisitor;
import org.eclipse.ocl.pivot.ids.LambdaTypeId;
import org.eclipse.ocl.pivot.ids.ParametersId;
import org.eclipse.ocl.pivot.ids.TypeId;

public class GeneralizedLambdaTypeIdImpl extends AbstractGeneralizedIdImpl<LambdaTypeId> implements LambdaTypeId, WeakHashMapOfListOfWeakReference3.MatchableId<String, ParametersId>
{
	protected final @NonNull ParametersId parametersId;
	
	public GeneralizedLambdaTypeIdImpl(@NonNull Integer hashCode, @NonNull String name, @NonNull ParametersId parametersId) {
		super(hashCode, 0, name);
		this.parametersId = parametersId;
	}

	@Override
	public @Nullable <R> R accept(@NonNull IdVisitor<R> visitor) {
		return visitor.visitLambdaTypeId(this);
	}

	@Override
	protected @NonNull LambdaTypeId createSpecializedId(@NonNull BindingsId templateBindings) {
		return new SpecializedLambdaTypeIdImpl(this, templateBindings);
	}

	@Override
	public @NonNull String getDisplayName() {
		StringBuilder s = new StringBuilder();
		if (templateParameters > 0) {
			s.append("<");
			s.append(templateParameters);
			s.append(">");
		}
		s.append(name);
		for (int i = 0; i < parametersId.size(); i++) {
			TypeId parameterId = parametersId.get(i);
			if (i == 0) {
				s.append(' ');
				s.append(parameterId.toString());
				s.append('(');
			}
			else if (i == 1) {
			}
			else if (i == 2) {
				s.append(parameterId.toString());
			}
			else {
				s.append(',');
				s.append(parameterId.toString());
			}
		}
		s.append(") : ");
		if (parametersId.size() > 1) {
			s.append(parametersId.get(1).toString());
		}
		else {
			s.append("?");
		}
		String string2 = s.toString();
		assert string2 != null;
		return string2;
	}

	@Override
	public @NonNull LambdaTypeId getGeneralizedId() {
		return this;
	}

	@Override
	public @NonNull String getMetaTypeName() {
		return TypeId.LAMBDA_TYPE_NAME;
	}

	@Override
	public @NonNull ParametersId getParametersId() {
		return parametersId;
	}

	@Override
	public boolean matches(@NonNull String thatName, @NonNull ParametersId thatParametersId) {
		if (parametersId != thatParametersId) {
			return false;
		}
		if (!this.name.equals(thatName)) {
			return false;
		}
		return true;
	}

    @Override
	public @NonNull LambdaTypeId specialize(@NonNull BindingsId templateBindings) {
    	return createSpecializedId(templateBindings);
	}
}