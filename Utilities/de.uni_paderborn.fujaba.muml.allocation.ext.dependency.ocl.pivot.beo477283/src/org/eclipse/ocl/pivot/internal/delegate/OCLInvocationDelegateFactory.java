/*******************************************************************************
 * Copyright (c) 2010, 2014 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   C.Damus, K.Hussey, E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.delegate;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.common.delegate.DelegateResourceSetAdapter;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotConstants;

/**
 * Factory for OCL operation-invocation delegates.
 */
public class OCLInvocationDelegateFactory extends AbstractOCLDelegateFactory
		implements EOperation.Internal.InvocationDelegate.Factory
{
	public OCLInvocationDelegateFactory(@NonNull String delegateURI) {
		super(delegateURI);
	}

	@Override
	public @Nullable EOperation.Internal.InvocationDelegate createInvocationDelegate(EOperation operation) {
		if (operation == null) {
			return null;
		}
		EPackage ePackage = ClassUtil.nonNullEMF(operation.getEContainingClass().getEPackage());
		OCLDelegateDomain delegateDomain = getDelegateDomain(ePackage);
		return delegateDomain != null ? new OCLInvocationDelegate(delegateDomain, operation) : null;
	}
	
	/**
	 * The Global variant of the Factory delegates to a local ResourceSet factory if one
	 * can be located at the EOperation.Internal.InvocationDelegate.Factory.Registry
	 * by the DelegateResourceSetAdapter.
	 */
	public static class Global extends OCLInvocationDelegateFactory
	{
		public Global() {
			super(PivotConstants.OCL_DELEGATE_URI_PIVOT);
		}

		@Override
		public @Nullable EOperation.Internal.InvocationDelegate createInvocationDelegate(EOperation operation) {
			if (operation == null) {
				return null;
			}
			EOperation.Internal.InvocationDelegate.Factory.Registry localRegistry = DelegateResourceSetAdapter.getRegistry(
				operation, EOperation.Internal.InvocationDelegate.Factory.Registry.class, null);
			if (localRegistry != null) {
				EOperation.Internal.InvocationDelegate.Factory factory = localRegistry.getFactory(delegateURI);
				if (factory != null) {
					return factory.createInvocationDelegate(operation);
				}
			}
			return super.createInvocationDelegate(operation);
		}	
	}
}
