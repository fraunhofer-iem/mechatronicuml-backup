/*******************************************************************************
 * Copyright (c) 2014, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.elements;

import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.Enumeration;
import org.eclipse.ocl.pivot.EnumerationLiteral;
import org.eclipse.ocl.pivot.LanguageExpression;
import org.eclipse.ocl.pivot.Package;
import org.eclipse.ocl.pivot.Slot;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;

public class AbstractExecutorEnumerationLiteral extends AbstractExecutorNamedElement implements EnumerationLiteral
{
	public AbstractExecutorEnumerationLiteral(@NonNull String name) {
		super(name);
	}

	@Override
	public List<Class> getClasses() {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Slot> getOwnedSlots() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Package getOwningPackage() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setOwningPackage(Package value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public LanguageExpression getOwnedSpecification() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setOwnedSpecification(LanguageExpression value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Enumeration getOwningEnumeration() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setOwningEnumeration(Enumeration value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Number getValue() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setValue(Number value) {
		throw new UnsupportedOperationException();
	}

	@Override
	@NonNull
	public EnumerationLiteralId getEnumerationLiteralId() {
		throw new UnsupportedOperationException();
	}

	@Override
	@NonNull
	public Enumerator getEnumerator() {
		throw new UnsupportedOperationException();
	}
}