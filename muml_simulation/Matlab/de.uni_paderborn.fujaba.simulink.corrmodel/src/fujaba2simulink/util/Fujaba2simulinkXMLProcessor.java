/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.util;

import fujaba2simulink.Fujaba2simulinkPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Fujaba2simulinkXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fujaba2simulinkXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Fujaba2simulinkPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Fujaba2simulinkResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Fujaba2simulinkResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Fujaba2simulinkResourceFactoryImpl());
		}
		return registrations;
	}

} //Fujaba2simulinkXMLProcessor
