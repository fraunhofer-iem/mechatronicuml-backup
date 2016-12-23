package org.muml.storydiagram.diagram.custom.properties.filters;

import org.eclipse.emf.ecore.EObject;
import org.muml.storydiagram.patterns.CollectionVariable;

import de.upb.swt.core.ui.properties.filters.AbstractFilter;

public class CollectionVariableFilter extends AbstractFilter {
	@Override
	protected boolean select(EObject element) {
		return element instanceof CollectionVariable;
	}
}
