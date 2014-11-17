package de.uni_paderborn.fujaba.muml.reconfiguration.common.xtext;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;

import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.behavior.TypedNamedElement;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentStoryNode;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentStoryRule;
import de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable;
import de.uni_paderborn.fujaba.muml.scoping.ActionLanguageScopeProvider;

public class CSDLanguageScopeProvider extends ActionLanguageScopeProvider {
	
	public void setScopeForEObject(ComponentStoryRule storyRule) {
		//initLists();
		//typedNamedElementList = new ArrayList<TypedNamedElement>();
		System.out.println("RULE drin");
		for (Parameter parameter : storyRule.getSignature().getParameters()) {
			typedNamedElementList.add(parameter);
		}
	}
	
	public void setScopeForEObject(ComponentStoryNode componentStoryNode) {
		System.out.println("DRIN");
		List<ActivityNode> todo = new ArrayList<ActivityNode>();
		todo.add(componentStoryNode);
		ActivityNode node;
		typedNamedElementList = new ArrayList<TypedNamedElement>();
		while (!todo.isEmpty()) {
			node = todo.remove(0);
			for (ActivityEdge edge : node.getIncomings()) {
				todo.add(edge.getSource());
			}
			if (node == componentStoryNode) {
				continue;
			}
			if (node instanceof ComponentStoryNode) {
				TreeIterator<EObject> tit = node.eAllContents();
				while (tit.hasNext()) {
					EObject object = tit.next();
					if (object instanceof PortVariable) {
						typedNamedElementList.add((PortVariable) object);
					} else if (object instanceof PartVariable) {
						typedNamedElementList.add((PartVariable) object);
					}
				}
			}
		}
		setScopeSwitch(componentStoryNode.eContainer().eContainer());
	}
	
	@Override
	protected boolean setScopeSwitch(EObject object) {
		boolean res = true;
		if (object instanceof ComponentStoryRule) {
			setScopeForEObject((ComponentStoryRule) object);
		}  else if (object instanceof ComponentStoryNode) {
			setScopeForEObject((ComponentStoryNode) object);
		} else {
			res = super.setScopeSwitch(object);
		}
		return res;
	}

}
