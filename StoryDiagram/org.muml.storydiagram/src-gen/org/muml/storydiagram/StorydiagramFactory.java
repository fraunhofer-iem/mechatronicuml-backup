/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.storydiagram.StorydiagramPackage
 * @generated
 */
public interface StorydiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StorydiagramFactory eINSTANCE = org.muml.storydiagram.impl.StorydiagramFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StorydiagramPackage getStorydiagramPackage();

} //StorydiagramsFactory
