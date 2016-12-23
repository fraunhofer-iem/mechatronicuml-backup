package org.muml.testlanguage.specification.custom;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;

public final class URIConversion {

	public static boolean RUNNING_FROM_JUNIT = false;

	private static URIConverter URI_CONVERTER = null;

	/**
	 * Converts the given URI if the TestLanguage runs from JUnit. More
	 * specifically, platform:/resource links are converted to platform:/plugin
	 * links.
	 * 
	 * @param uri
	 *            The original URI.
	 * @return The converted URI.
	 */
	public static URI convert(URI uri) {
		
		System.out.println("CONVERT "+uri);
		
		// If we are not running from JUnit, no conversion is necessary.
		if (!URIConversion.RUNNING_FROM_JUNIT) {
			return uri;
		}

		// If the URI is already a plugin URI, no conversion is necessary.
		if (uri.isPlatformPlugin()) {
			return uri;
		}

		// Check if we already created a suitable converter, and create one if
		// needed.
		if (URIConversion.URI_CONVERTER == null) {
			URIConversion.URI_CONVERTER = new ExtensibleURIConverterImpl();
			URIConversion.URI_CONVERTER.getURIMap().put(
					URI.createURI("platform:/resource/"),
					URI.createURI("platform:/plugin/"));
		}

		// Return the converted URI.
		URI out = URIConversion.URI_CONVERTER.normalize(uri);
		System.out.println("YESSSAA "+out);
		return out;
	}
}
