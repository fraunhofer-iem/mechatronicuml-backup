/**
 */
package de.uni_paderborn.fujaba.muml.dependencylanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.storydriven.core.impl.CommentableElementImpl;

import de.uni_paderborn.fujaba.muml.dependencylanguage.Dependency;
import de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DependencyImpl extends CommentableElementImpl implements Dependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependencylanguagePackage.Literals.DEPENDENCY;
	}

} //DependencyImpl
