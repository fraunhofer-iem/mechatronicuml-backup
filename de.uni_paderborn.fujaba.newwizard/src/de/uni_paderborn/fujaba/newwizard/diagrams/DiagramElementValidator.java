package de.uni_paderborn.fujaba.newwizard.diagrams;

import org.eclipse.emf.ecore.EObject;

public interface DiagramElementValidator {
	boolean isValidDiagramElement(EObject object);
}
