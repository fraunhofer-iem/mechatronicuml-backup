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
import de.uni_paderborn.fujaba.muml.verification.sdd.Edge;
import de.uni_paderborn.fujaba.muml.verification.sdd.Node;
import de.uni_paderborn.fujaba.muml.verification.sdd.PatternNode;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram;

/**
 * Tmp Workaround class to support setting of ParameterBinding values in CSD and
 * CSDD diagrams
 */
public class CSDLanguageScopeProvider extends ActionLanguageScopeProvider {

	public void setScopeForEObject(ComponentStoryRule storyRule) {

		for (Parameter parameter : storyRule.getSignature().getParameters()) {
			typedNamedElementList.add(parameter);
		}
	}

	public void setScopeForEObject(ComponentStoryNode componentStoryNode) {

		List<ActivityNode> todo = new ArrayList<ActivityNode>();
		todo.add(componentStoryNode);
		ActivityNode node;
		typedNamedElementList = new ArrayList<TypedNamedElement>();
		while (!todo.isEmpty()) {
			node = todo.remove(0);
			// XXX this causes an infinite loop if the csd contains loops
			// however, this is only a preliminary solution, since the edge
			// expressions should be interpreted
			// if this is done there must not be infinite loops in the csd
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

	public void setScopeForEObject(PatternNode componentStoryNode) {

		List<Node> todo = new ArrayList<Node>();
		todo.add(componentStoryNode);
		Node node;
		typedNamedElementList = new ArrayList<TypedNamedElement>();
		while (!todo.isEmpty()) {
			node = todo.remove(0);
			for (Edge edge : node.getIncomingEdges()) {
				todo.add(edge.getSourceNode());
			}
			if (node == componentStoryNode) {
				continue;
			}
			if (node instanceof PatternNode) {
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
		setScopeSwitch(componentStoryNode.eContainer());
	}

	public void setScopeForEObject(ComponentStoryDecisionDiagram componentsdd) {
		for (Parameter parameter : componentsdd.getParameters()) {
			typedNamedElementList.add(parameter);
		}
	};

	@Override
	protected boolean setScopeSwitch(EObject object) {
		boolean res = true;
		if (object instanceof ComponentStoryRule) {
			setScopeForEObject((ComponentStoryRule) object);
		} else if (object instanceof ComponentStoryNode) {
			setScopeForEObject((ComponentStoryNode) object);
		} else if (object instanceof PatternNode) {
			setScopeForEObject((PatternNode) object);
		} else if (object instanceof ComponentStoryDecisionDiagram) {
			setScopeForEObject((ComponentStoryDecisionDiagram) object);
		} else {
			res = super.setScopeSwitch(object);
		}
		return res;
	}

}
