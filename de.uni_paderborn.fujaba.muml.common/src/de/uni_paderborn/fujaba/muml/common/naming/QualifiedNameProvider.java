package de.uni_paderborn.fujaba.muml.common.naming;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;

public class QualifiedNameProvider {
	protected QualifiedNameProvider delegate = null;
	protected QualifiedNameProvider delegationRoot;
	
	public QualifiedNameProvider() {
		delegationRoot = this;
	}
	
	public QualifiedNameProvider(QualifiedNameProvider delegate) {
		this.delegate = delegate;
		delegationRoot = this;
		delegate.delegationRoot = this.delegationRoot;
	}
	
	public QualifiedName getQualifiedName(EObject object, EObject scope) {
		if (object == null || object.equals(scope) || object instanceof ModelElementCategory)
			return new QualifiedName();
		if (object instanceof NamedElement)
			return delegationRoot.getQualifiedName(object.eContainer(), scope).append(((NamedElement) object).getName());
		if (delegate != null)
			return delegate.getQualifiedName(object, scope);
		
		throw new RuntimeException("Don't know how to compute the qualified name for "+object);
	}
	
	public QualifiedName getQualifiedName(EObject object) {
		return getQualifiedName(object, null);
	}
}
