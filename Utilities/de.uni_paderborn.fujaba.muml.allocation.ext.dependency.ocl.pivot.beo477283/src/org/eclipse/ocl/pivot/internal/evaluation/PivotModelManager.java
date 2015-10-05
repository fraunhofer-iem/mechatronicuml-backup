/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *   E.D.Willink (CEA LIST) - Bug 392981
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.evaluation;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.internal.library.executor.LazyModelManager;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ParserException;

public class PivotModelManager extends LazyModelManager
{	
	private static final Logger logger = Logger.getLogger(PivotModelManager.class);

	protected final @NonNull EnvironmentFactoryInternal environmentFactory;
	private boolean generatedErrorMessage = false;
	
	public PivotModelManager(@NonNull EnvironmentFactoryInternal environmentFactory, EObject context) {
		super(context);
		this.environmentFactory = environmentFactory;
	}

	@Override
	protected boolean isInstance(@NonNull Type requiredType, @NonNull EObject eObject) {
		PivotMetamodelManager metamodelManager = environmentFactory.getMetamodelManager();
		EClass eClass = eObject.eClass();
		EPackage ePackage = eClass.getEPackage();
		Type objectType = null;
		if (ePackage == PivotPackage.eINSTANCE) {
			String name = ClassUtil.nonNullEMF(eClass.getName());
			objectType = metamodelManager.getASClass(name);
		}
		else {
			try {
				objectType = metamodelManager.getASOf(Type.class,  eClass);
			} catch (ParserException e) {
				if (!generatedErrorMessage) {
					generatedErrorMessage = true;
					logger.error("Failed to load an '" + eClass.getName() + "'", e);
				}
			}
		}
	    return (objectType != null) && objectType.conformsTo(environmentFactory.getStandardLibrary(), requiredType);
	}
}
