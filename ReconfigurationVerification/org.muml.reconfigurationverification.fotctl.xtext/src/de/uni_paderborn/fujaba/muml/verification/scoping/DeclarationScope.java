package de.uni_paderborn.fujaba.muml.verification.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import de.uni_paderborn.fujaba.muml.verification.fotctl.Constant;
import de.uni_paderborn.fujaba.muml.verification.fotctl.ConstantSymbolDecl;
import de.uni_paderborn.fujaba.muml.verification.fotctl.EdgeLabelPredicate;
import de.uni_paderborn.fujaba.muml.verification.fotctl.EdgeLabelPredicateDecl;
import de.uni_paderborn.fujaba.muml.verification.fotctl.FoTCTLSpec;
import de.uni_paderborn.fujaba.muml.verification.fotctl.NodeLabelPredicate;
import de.uni_paderborn.fujaba.muml.verification.fotctl.NodeLabelPredicateDecl;

public class DeclarationScope implements IScope {

	private EObject context;

	public DeclarationScope(EObject context) {
		this.context = context;
	}

	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		// get the FotctlSpec
		FoTCTLSpec fotctlSpec = (FoTCTLSpec) context.eResource().getContents().get(0);

		if(context instanceof NodeLabelPredicate)
		{
			for(NodeLabelPredicateDecl declaration : fotctlSpec.getNodeLabelPredicates())
			{
				if(declaration.getName().equals(name.toString()))
					return EObjectDescription.create(name, declaration);
			}
		}
		else if(context instanceof EdgeLabelPredicate)
		{
			for(EdgeLabelPredicateDecl declaration : fotctlSpec.getEdgeLabelPredicates())
			{
				if(declaration.getName().equals(name.toString()))
					return EObjectDescription.create(name, declaration);
			}
		}
		else if (context instanceof Constant)
		{
			for(ConstantSymbolDecl declaration : fotctlSpec.getConstants())
			{
				if(declaration.getName().equals(name.toString()))
					return EObjectDescription.create(name, declaration);
			}
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
