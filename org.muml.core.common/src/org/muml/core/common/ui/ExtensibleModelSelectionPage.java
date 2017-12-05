/*
 * Copyright (c) 2006, 2007 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package org.muml.core.common.ui;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.swt.widgets.Composite;

/**
 * @author dstadnik
 */
public class ExtensibleModelSelectionPage extends ModelSelectionPage {
	boolean initialized = false; 

	private Map<String, ModelSelectionPageExtension> extensions; // id -> extension

	public ExtensibleModelSelectionPage(String pageId, ResourceLocationProvider rloc, ResourceSet resourceSet) {
		this(pageId, rloc, resourceSet, null);
	}

	public ExtensibleModelSelectionPage(String pageId, ResourceLocationProvider rloc, ResourceSet resourceSet, String modelFileExtension) {
		super(pageId, rloc, resourceSet, modelFileExtension);
		extensions = new LinkedHashMap<String, ModelSelectionPageExtension>();
	}
	
	public void initialize() {
		if (!initialized) {
			initialized = true;
			addExtensions();
		}
	}

	protected void addExtensions() {
	}

	public void addExtension(String id, ModelSelectionPageExtension extension) {
		assert id != null;
		assert extension != null;
		assert getControl() == null;
		extensions.put(id, extension);
	}

	public ModelSelectionPageExtension getExtension(String id) {
		initialize();
		return extensions.get(id);
	}

	@Override
	public void createAdditionalControls(Composite parent) {
		initialize();
		for (ModelSelectionPageExtension extension : extensions.values()) {
			extension.createControl(parent);
		}
	}

	@Override
	protected void resourceChanged() {
		initialize();
		for (ModelSelectionPageExtension extension : extensions.values()) {
			extension.setResource(getResource());
		}
	}
}
