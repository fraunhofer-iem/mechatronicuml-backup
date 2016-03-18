/*******************************************************************************
 * Copyright (c) 2010, 2014 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;
import org.eclipse.ocl.pivot.internal.utilities.AS2XMIid;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.NameUtil;

/**
 * PivotSaveImpl ensures that all references to specialized types are terminated
 * by local copies of the specialization.
 */
public final class PivotSaveImpl extends XMISaveImpl
{
	/**
	 * The Lookup override enforces alphabetical order on saved features.
	 */
	public static class Lookup extends XMISaveImpl.Lookup
	{
		public Lookup() {
			super(null, null, null);
		}

		@Override
		protected EStructuralFeature[] listFeatures(EClass cls) {
			EStructuralFeature[] listFeatures = super.listFeatures(cls);
			Arrays.sort(listFeatures, NameUtil.ENamedElementComparator.INSTANCE);
			return listFeatures;
		}
	}
	
	public PivotSaveImpl(XMLHelper helper) {
		super(helper);
	}

	/**
	 * Prepare a pivot resource for save by redirecting all type references to
	 * specializations to local copies of the specializations.
	 */
	@Override
	protected void init(XMLResource resource, Map<?, ?> options) {
		XMLResource asResource = ClassUtil.nonNullState(resource);
		ASSaver asSaver = new ASSaver(asResource);
		AS2XMIid as2xmIid = new AS2XMIid();
		asSaver.localizeSpecializations();
		Map<String, Object> saveOptions = new HashMap<String, Object>();
		if (options != null) {
			for (Object key : options.keySet()) {
				saveOptions.put(String.valueOf(key), options.get(key));
			}
		}
		Object optionNormalizeContents = saveOptions.get(ASResource.OPTION_NORMALIZE_CONTENTS);
		if ((optionNormalizeContents != null) && Boolean.valueOf(optionNormalizeContents.toString())) {
			asSaver.normalizeContents();
			int capacity = INDEX_LOOKUP+1;
			List<Object> lookupTable = new ArrayList<Object>(capacity);
			for (int i = 0; i < capacity; i++) {
				if (i == INDEX_LOOKUP) {
					lookupTable.add(new Lookup());
				}
				else {
					lookupTable.add(null);
				}
			}
			saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, lookupTable);
		}
    	ResourceSet asResourceSet = asResource.getResourceSet();
		if (asResourceSet != null) {
			as2xmIid.assignIds(asResourceSet, saveOptions);
		}
		else if (asResource instanceof ASResource){
			as2xmIid.assignIds((ASResource) asResource, saveOptions);
		}
		super.init(asResource, saveOptions);
	}
}