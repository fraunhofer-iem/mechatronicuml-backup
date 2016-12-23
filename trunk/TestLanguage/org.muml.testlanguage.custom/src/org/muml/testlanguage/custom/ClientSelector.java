package org.muml.testlanguage.custom;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.model.IClientSelector;
import org.muml.testlanguage.Node;
import org.muml.testlanguage.Port;
import org.muml.testlanguage.TestCase;

public class ClientSelector implements IClientSelector {

	@Override
	public boolean selects(Object object) {
		// Only show interest in the contents of a TestCase.
		return (object instanceof TestCase || object instanceof Node || object instanceof Port);
	}

}
