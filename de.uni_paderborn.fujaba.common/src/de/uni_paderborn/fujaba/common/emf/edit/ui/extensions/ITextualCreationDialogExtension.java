package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import org.eclipse.emf.ecore.EObject;

public interface ITextualCreationDialogExtension {
	void rebuildTextualParameterLine();

	void setTextRange(EObject selectedElement);
}
