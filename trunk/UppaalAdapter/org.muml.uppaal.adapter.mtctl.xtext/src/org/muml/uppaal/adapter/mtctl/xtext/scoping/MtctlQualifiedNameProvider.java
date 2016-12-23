package org.muml.uppaal.adapter.mtctl.xtext.scoping;

import org.eclipse.emf.ecore.EObject;
import org.muml.pim.common.naming.MumlQualifiedNameProvider;
import org.muml.pim.common.naming.QualifiedName;
import org.muml.pim.common.naming.QualifiedNameProvider;
import org.muml.uppaal.adapter.mtctl.quantifiers.BoundVariable;

/**
 * A {@link QualifiedNameProvider} for MTCTL.<br>
 * This is used to compute QualifiedNames for the {@link MtctlScopeProvider}.
 */
public class MtctlQualifiedNameProvider extends QualifiedNameProvider {
	/**
	 * Construct a MtctlQualifiedNameProvider that works.
	 */
	public MtctlQualifiedNameProvider() {
		super(new MumlQualifiedNameProvider());
	}
	
	/**
	 * Construct a MtctlQualifiedNameProvider specifying a delegate.
	 * (You probably want to ensure that MumlQualifiedNameProvider and 
	 * QualifiedNameProvider are somewhere in the delegation chain)
	 */
	public MtctlQualifiedNameProvider(QualifiedNameProvider delegate) {
		super(delegate);
	}
	
	@Override
	public QualifiedName getQualifiedName(EObject object, EObject scope) {
		if (object == null || object.equals(scope))
			return new QualifiedName();
		
		if (object instanceof BoundVariable)
			return new QualifiedName(((BoundVariable) object).getName());
		
		if (delegate != null)
			return delegate.getQualifiedName(object, scope);
		
		throw new RuntimeException("Cannot create a qualified name for " + object);
	}
}
