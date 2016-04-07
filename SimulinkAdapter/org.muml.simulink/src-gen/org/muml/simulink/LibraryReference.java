/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.LibraryReference#getSourceBlock <em>Source Block</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.SimulinkPackage#getLibraryReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noReferenceToAnEmptySubBlock referenceNeedsName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL noReferenceToAnEmptySubBlock='\n\t\t\tself.sourceBlock.oclIsTypeOf(SubSystem) implies self.sourceBlock.oclAsType(SubSystem).allBlocks->size() > 0' referenceNeedsName='self.sourceBlock.name <> null and self.sourceBlock.name.size() > 0'"
 * @generated
 */
public interface LibraryReference extends Block {
	/**
	 * Returns the value of the '<em><b>Source Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Block</em>' reference.
	 * @see #setSourceBlock(Block)
	 * @see org.muml.simulink.SimulinkPackage#getLibraryReference_SourceBlock()
	 * @model required="true"
	 * @generated
	 */
	Block getSourceBlock();

	/**
	 * Sets the value of the '{@link org.muml.simulink.LibraryReference#getSourceBlock <em>Source Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Block</em>' reference.
	 * @see #getSourceBlock()
	 * @generated
	 */
	void setSourceBlock(Block value);

} // LibraryReference
