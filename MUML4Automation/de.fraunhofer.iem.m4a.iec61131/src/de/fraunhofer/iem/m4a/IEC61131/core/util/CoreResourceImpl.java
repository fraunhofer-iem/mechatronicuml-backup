/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.util.CoreResourceFactoryImpl
 * @generated
 */
public class CoreResourceImpl extends XMIResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public CoreResourceImpl(URI uri) {
		super(uri);
	}
	
	@Override
    public void doSave(Writer writer, Map<?, ?> options) throws IOException {
        Map<Object, Object> options1 = (Map<Object, Object>) options;
        options1.put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl.PlatformSchemeAware());
        super.doSave(writer, options1);
}

    @Override
    public void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
        Map<Object, Object> options1 = (Map<Object, Object>) options;
        options1.put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl.PlatformSchemeAware());
        super.doSave(outputStream, options1);
    }

} //CoreResourceImpl
