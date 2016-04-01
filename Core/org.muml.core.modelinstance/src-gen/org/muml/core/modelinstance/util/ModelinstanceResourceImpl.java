/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.core.modelinstance.util;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;
import org.muml.core.modelinstance.ModelInstancePlugin;
import org.w3c.dom.Comment;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.muml.core.modelinstance.util.ModelinstanceResourceFactoryImpl
 * @generated
 */
public class ModelinstanceResourceImpl extends XMIResourceImpl {
	public static String versionInformation = null;

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated NOT
	 */
	public ModelinstanceResourceImpl(URI uri) {
		super(uri);
		
		// Fix for #1378
	    getDefaultSaveOptions().put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl.PlatformSchemeAware());
	}

	/**
	 * @generated NOT
	 */
	protected boolean useUUIDs() {
		return true;
	}

	@Override
	protected XMLSave createXMLSave() {
		return new VersionedXMISaveImpl(createXMLHelper());
	}

	protected class VersionedXMISaveImpl extends XMISaveImpl {

		public VersionedXMISaveImpl(XMLHelper helper) {
			super(helper);
		}

		protected Object writeTopObject(EObject top) {
			addVersionComment();
			return super.writeTopObject(top);
		}

		@Override
		public Object writeTopObjects(List<? extends EObject> contents) {
			addVersionComment();
			return super.writeTopObjects(contents);
		}

		private void addVersionComment() {
			String versionInformation = ModelInstancePlugin
					.getVersionInformation();
			if (!toDOM) {
				doc.addComment(versionInformation);
			} else {
				Comment comment = document.createComment(versionInformation);
				if (currentNode == null) {
					currentNode = comment;
					document.appendChild(currentNode);
				} else {
					currentNode = currentNode.appendChild(comment);
				}
			}
		}

	}

} // ModelinstanceResourceImpl