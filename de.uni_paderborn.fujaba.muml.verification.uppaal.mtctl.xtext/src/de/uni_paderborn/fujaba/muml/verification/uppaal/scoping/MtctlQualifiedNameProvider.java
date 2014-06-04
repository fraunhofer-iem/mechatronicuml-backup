package de.uni_paderborn.fujaba.muml.verification.uppaal.scoping;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.common.naming.QualifiedName;
import de.uni_paderborn.fujaba.muml.common.naming.QualifiedNameProvider;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.BoundVariable;

public class MtctlQualifiedNameProvider extends QualifiedNameProvider {
	public MtctlQualifiedNameProvider() {
		super(new QualifiedNameProvider());
	}
	
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
