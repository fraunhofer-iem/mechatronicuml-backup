/*******************************************************************************
 * Copyright (c) 2014 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.complete;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.CompletePackage;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.PivotFactory;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.internal.CompleteModelImpl;
import org.eclipse.ocl.pivot.internal.manager.Orphanage;

public class RootCompletePackages extends AbstractCompletePackages
{
	private static final Logger logger = Logger.getLogger(RootCompletePackages.class);

	private static final long serialVersionUID = 1L;

	public RootCompletePackages(@NonNull CompleteModelImpl owner) {
		super(CompletePackage.class, owner, PivotPackage.COMPLETE_MODEL__OWNED_COMPLETE_PACKAGES, PivotPackage.COMPLETE_PACKAGE__OWNING_COMPLETE_MODEL);
	}

	@Override
	public @NonNull CompletePackageInternal createCompletePackage(@NonNull org.eclipse.ocl.pivot.Package partialPackage) {
		CompletePackageInternal completePackage = (CompletePackageInternal) PivotFactory.eINSTANCE.createCompletePackage();
		completePackage.init(partialPackage.getName(), partialPackage.getNsPrefix(), partialPackage.getURI());
		return completePackage;
	}
	
	protected @NonNull CompletePackageInternal createRootCompletePackage(@NonNull org.eclipse.ocl.pivot.Package pivotPackage) {
		if (Orphanage.isTypeOrphanage(pivotPackage)) {
			return getCompleteModel().getOrphanCompletePackage();
		}
		else {
			String name = pivotPackage.getName();
			String nonNullName = name;
			if (nonNullName == null) {
				nonNullName = "$anon_" + Integer.toHexString(System.identityHashCode(pivotPackage));
			}
			String nsPrefix = pivotPackage.getNsPrefix();
			String completeURI = getCompleteModel().getCompleteURIs().getCompleteURI(pivotPackage.getURI());
			CompletePackageInternal rootCompletePackage = (CompletePackageInternal) PivotFactory.eINSTANCE.createCompletePackage();
			rootCompletePackage.init(nonNullName, nsPrefix, completeURI);
			add(rootCompletePackage);
			return rootCompletePackage;
		}
	}

	@Override
	protected void didAdd(@NonNull CompletePackage rootCompletePackage) {
		super.didAdd(rootCompletePackage);
//		String nsURI = rootCompletePackage.getURI();			// FIXME complete/package/URI/name
//		String sharedNsURI = getCompleteURI(nsURI);
//		if ((sharedNsURI != null) && (sharedNsURI == nsURI)) {
//			name2completePackage.put(nsURI, rootCompletePackage);
//		}
	}

	@Override
	protected void didRemove(int index, CompletePackage rootCompletePackage) {
		assert rootCompletePackage != null;
		super.didRemove(index, rootCompletePackage);
//		getCompleteModel().didRemoveCompletePackage(rootCompletePackage);
	}

	@Override
	@SuppressWarnings("null")
	public @NonNull CompleteModelInternal getCompleteModel() {
		return (CompleteModelInternal)owner;
	}

	@Override
	public @NonNull CompletePackageInternal getOwnedCompletePackage(@NonNull org.eclipse.ocl.pivot.Package pivotPackage) {
		//
		//	Try to find package by packageURI
		//
		CompletePackageInternal completePackage = getCompleteModel().getCompleteURIs().getCompletePackage(pivotPackage);
		if (completePackage != null) {
			return completePackage;
		}
		//
		//	Else generate an error for a name-less Package, fatally if also packageURI-less.
		//
		String packageURI = pivotPackage.getURI();
		String name = pivotPackage.getName();
		if (name == null) {
			String message = null;
			for (EObject eObject = pivotPackage; eObject != null; eObject = eObject.eContainer()) {
				if (eObject instanceof Model) {
					message = "Unnamed package for '" + packageURI + "' in '" + ((Model)eObject).getExternalURI() + "'";
					break;
				}
			}
			if (message == null) {
				message = "Unnamed package for '" + packageURI + "'";
			}
			logger.error(message);
			name = packageURI;
			if (name == null) {
				throw new IllegalStateException(message);
			}
		}
		//
		//	Try to find package by name, provided there is no packageURI conflict
		//
		CompletePackageInternal rootCompletePackage = getOwnedCompletePackage(name);
		if (rootCompletePackage != null) {
			String completeURI2 = rootCompletePackage.getURI();
			if ((packageURI == null) || (completeURI2 == null) || packageURI.equals(completeURI2)) {
				return rootCompletePackage;
			}
		}
		rootCompletePackage = createRootCompletePackage(pivotPackage);
		return rootCompletePackage;
	}

	@Override
	protected @NonNull Iterable<org.eclipse.ocl.pivot.Package> getPartialPackages() {
		return getCompleteModel().getPartialModels().getNestedPartialPackages();
	}
}