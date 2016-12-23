/**
 * Copyright (c) 2010 ProxiAD
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Cedric Vidal (ProxiAD) - initial API and implementation
 */

package org.muml.ape.runtime.xtfo;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;

// taken from: http://svn.codespot.com/a/eclipselabs.org/xtext-forms-integration/trunk/plugins/org.eclipselabs.xtfo.demo.rcp/src/org/eclipselabs/xtfo/demo/rcp/partialEditing (rev 39)

public class EmbeddedXtextResource extends LazyLinkingResource {

	private Resource parentResource = null;

	public Resource getParentResource() {
		return parentResource;
	}

	public void setParentResource(Resource parentResource) {
		this.parentResource = parentResource;
	}

	public EmbeddedXtextResource() {
		super();
	}

}
