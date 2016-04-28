/**
 */
package org.muml.cbs.dependencylanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.cbs.dependencylanguage.Dependency;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.mumlcore.impl.CommentableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
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
