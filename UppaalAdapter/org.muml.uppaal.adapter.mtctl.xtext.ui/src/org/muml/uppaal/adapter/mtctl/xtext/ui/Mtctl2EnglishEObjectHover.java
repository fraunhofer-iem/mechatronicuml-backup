package org.muml.uppaal.adapter.mtctl.xtext.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hover.DispatchingEObjectTextHover;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;

/**
 * An EObject text Hover that is ready for MTCTL2English tooltips
 */
public class Mtctl2EnglishEObjectHover extends DispatchingEObjectTextHover {
	@Override
	protected Pair<EObject, IRegion> getXtextElementAt(XtextResource resource, int offset) {
		Pair<EObject, IRegion> temp = null;
		ILeafNode node = NodeModelUtils.findLeafNodeAtOffset(resource
				.getParseResult().getRootNode(), offset);
		
		if (node.getGrammarElement() instanceof Keyword) { //overriding for this case, so that we get the actual EObject from the MTCTL ecore tree (obj), not something in the parse tree
			IRegion region = new Region(node.getOffset(), node.getLength());
			EObject obj = NodeModelUtils.findActualSemanticObjectFor(node);
			temp = Tuples.create(obj, region);
		} else {
			temp = super.getXtextElementAt(resource, offset);
		}
		return temp;
	}
}
