/**
 */
package org.muml.pm.hardware.hwresource;

import org.muml.pim.valuetype.NaturalNumber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class Processor is a ComputingResource. It represents different kind of a processor specified by its family and architecture.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.Processor#getOwnedCache <em>Owned Cache</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.Processor#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.Processor#getNbCores <em>Nb Cores</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.Processor#getFamily <em>Family</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.Processor#getNbPipelineStages <em>Nb Pipeline Stages</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getProcessor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ownedCacheInSameStructuredResource='-- The used Cache must be containted in the same parent Resource\nif not self.ownedCache.oclIsUndefined() then\n\tself.parentStructuredResource=self.ownedCache.parentStructuredResource\nelse\n\t true\nendif\n'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ownedCacheInSameStructuredResource'"
 * @generated
 */
public interface Processor extends ComputingResource {
	/**
	 * Returns the value of the '<em><b>Owned Cache</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.hardware.hwresource.Cache#getUsedByProcessor <em>Used By Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Cache which belongs to this Processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Cache</em>' reference.
	 * @see #setOwnedCache(Cache)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getProcessor_OwnedCache()
	 * @see org.muml.pm.hardware.hwresource.Cache#getUsedByProcessor
	 * @model opposite="usedByProcessor"
	 * @generated
	 */
	Cache getOwnedCache();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.Processor#getOwnedCache <em>Owned Cache</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Cache</em>' reference.
	 * @see #getOwnedCache()
	 * @generated
	 */
	void setOwnedCache(Cache value);

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pm.hardware.hwresource.ProcessorArchitecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The architecture of this Processor (i.e. RISC,CISC,..).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see org.muml.pm.hardware.hwresource.ProcessorArchitecture
	 * @see #setArchitecture(ProcessorArchitecture)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getProcessor_Architecture()
	 * @model
	 * @generated
	 */
	ProcessorArchitecture getArchitecture();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.Processor#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see org.muml.pm.hardware.hwresource.ProcessorArchitecture
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(ProcessorArchitecture value);

	/**
	 * Returns the value of the '<em><b>Nb Cores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of cores of this Processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nb Cores</em>' containment reference.
	 * @see #setNbCores(NaturalNumber)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getProcessor_NbCores()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NaturalNumber getNbCores();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.Processor#getNbCores <em>Nb Cores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Cores</em>' containment reference.
	 * @see #getNbCores()
	 * @generated
	 */
	void setNbCores(NaturalNumber value);

	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The family of this Processor (i.e. x86, ARM, MIPS,..).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getProcessor_Family()
	 * @model
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.Processor#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(String value);

	/**
	 * Returns the value of the '<em><b>Nb Pipeline Stages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of pipelines for this processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nb Pipeline Stages</em>' containment reference.
	 * @see #setNbPipelineStages(NaturalNumber)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getProcessor_NbPipelineStages()
	 * @model containment="true"
	 * @generated
	 */
	NaturalNumber getNbPipelineStages();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.Processor#getNbPipelineStages <em>Nb Pipeline Stages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Pipeline Stages</em>' containment reference.
	 * @see #getNbPipelineStages()
	 * @generated
	 */
	void setNbPipelineStages(NaturalNumber value);

} // Processor
