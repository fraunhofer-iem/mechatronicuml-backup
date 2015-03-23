/**
 */
package de.uni_paderborn.uppaal.trace.diagnosticTrace.util;

import de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage;

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
public class DiagnosticTraceXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiagnosticTraceXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    DiagnosticTracePackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the DiagnosticTraceResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Map<String, Resource.Factory> getRegistrations()
  {
    if (registrations == null)
    {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new DiagnosticTraceResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new DiagnosticTraceResourceFactoryImpl());
    }
    return registrations;
  }

} //DiagnosticTraceXMLProcessor
