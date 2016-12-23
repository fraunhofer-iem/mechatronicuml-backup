package org.muml.pim.actionlanguage.xtext.naming;

import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.naming.SimpleNameProvider;
import org.eclipse.xtext.util.PolymorphicDispatcher;

public class DeclarativeSimpleNameProvider extends SimpleNameProvider {
	
	private static final String methodName = "qualifiedName";
	
	private PolymorphicDispatcher<QualifiedName> qualifiedName = new PolymorphicDispatcher<QualifiedName>(
			methodName, 1, 1, Collections.singletonList(this),
			PolymorphicDispatcher.NullErrorHandler.<QualifiedName>get()) {
				protected QualifiedName handleNoSuchMethod(Object... params) {
					return null;
				}
			};
	
	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		QualifiedName qName = qualifiedName.invoke(obj);
		if (qName == null)  {
			return super.getFullyQualifiedName(obj);
		}
		return qName;
	}

}
