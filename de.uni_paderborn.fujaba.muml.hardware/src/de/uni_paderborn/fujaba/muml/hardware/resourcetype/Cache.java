/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class Cache represents a Cache used by a Processor.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getWritePolicy <em>Write Policy</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getReplacementPolicy <em>Replacement Policy</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getNbSets <em>Nb Sets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getAssociativity <em>Associativity</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getUsedByProcessor <em>Used By Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getCache()
 * @model
 * @generated
 */
public interface Cache extends MemoryResource {
	/**
	 * Returns the value of the '<em><b>Write Policy</b></em>' attribute.
	 * The default value is <code>"WRITE_THROUGH"</code>.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.WritePolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the write policy of the Cache.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Policy</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.WritePolicy
	 * @see #setWritePolicy(WritePolicy)
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getCache_WritePolicy()
	 * @model default="WRITE_THROUGH"
	 * @generated
	 */
	WritePolicy getWritePolicy();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getWritePolicy <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Policy</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.WritePolicy
	 * @see #getWritePolicy()
	 * @generated
	 */
	void setWritePolicy(WritePolicy value);

	/**
	 * Returns the value of the '<em><b>Replacement Policy</b></em>' attribute.
	 * The default value is <code>"FIFO"</code>.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ReplacementPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the replacement policy for this Cache.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replacement Policy</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ReplacementPolicy
	 * @see #setReplacementPolicy(ReplacementPolicy)
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getCache_ReplacementPolicy()
	 * @model default="FIFO"
	 * @generated
	 */
	ReplacementPolicy getReplacementPolicy();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getReplacementPolicy <em>Replacement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Policy</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ReplacementPolicy
	 * @see #getReplacementPolicy()
	 * @generated
	 */
	void setReplacementPolicy(ReplacementPolicy value);

	/**
	 * Returns the value of the '<em><b>Nb Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the number of sets.
	 *  If the nbSets are one, the cache is full-associative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nb Sets</em>' attribute.
	 * @see #setNbSets(int)
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getCache_NbSets()
	 * @model
	 * @generated
	 */
	int getNbSets();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getNbSets <em>Nb Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Sets</em>' attribute.
	 * @see #getNbSets()
	 * @generated
	 */
	void setNbSets(int value);

	/**
	 * Returns the value of the '<em><b>Associativity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The associativity of this cache. It represents the number of blocks in one set. An associativity of 1 represents a direct mapped cache.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Associativity</em>' attribute.
	 * @see #setAssociativity(int)
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getCache_Associativity()
	 * @model
	 * @generated
	 */
	int getAssociativity();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getAssociativity <em>Associativity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associativity</em>' attribute.
	 * @see #getAssociativity()
	 * @generated
	 */
	void setAssociativity(int value);

	/**
	 * Returns the value of the '<em><b>Used By Processor</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor#getOwnedCache <em>Owned Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used By Processor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The processors which use this cache.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used By Processor</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getCache_UsedByProcessor()
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor#getOwnedCache
	 * @model opposite="ownedCache"
	 * @generated
	 */
	EList<Processor> getUsedByProcessor();

} // Cache
