package de.uni_paderborn.fujaba.muml.verification.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.verification.fotctl.FoTCTLFormula;
import de.uni_paderborn.fujaba.muml.verification.fotctl.QuantifiedFormula;
import de.uni_paderborn.fujaba.muml.verification.fotctl.Variable;

public class VariableDeclarationScope implements IScope {

	private Variable variable;

	public VariableDeclarationScope(EObject context) {
		this.variable = (Variable) context;
	}


	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		EObject currentContainer = variable.eContainer();
		while(!(currentContainer instanceof FoTCTLFormula))
		{
			if (currentContainer instanceof QuantifiedFormula
					&& ((NamedElement) currentContainer).getName().equals(name.toString()))
			{
				return EObjectDescription.create(name, currentContainer);
			}
			currentContainer = currentContainer.eContainer();
		}	
		return null;
	}


	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEObjectDescription getSingleElement(EObject object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<IEObjectDescription> getElements(EObject object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<IEObjectDescription> getAllElements() {
		// TODO Auto-generated method stub
		return null;
	}

}
