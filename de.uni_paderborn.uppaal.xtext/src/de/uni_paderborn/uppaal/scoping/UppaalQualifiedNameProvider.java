package de.uni_paderborn.uppaal.scoping;

import org.eclipse.xtext.naming.QualifiedName;

import de.uni_paderborn.uppaal.core.NamedElement;
import de.uni_paderborn.uppaal.parsable.IdentifiableLocation;
import de.uni_paderborn.uppaal.templates.Location;
import de.uni_paderborn.uppaal.types.Type;

public class UppaalQualifiedNameProvider extends org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider {

	QualifiedName qualifiedName(IdentifiableLocation l) {
        return QualifiedName.create(l.getId());
    }
	
	QualifiedName qualifiedName(Type t) {
        return QualifiedName.create(t.getName());
    }
	
	QualifiedName qualifiedName(NamedElement n)
	{
		return QualifiedName.create(n.getName());
	}
	
}
