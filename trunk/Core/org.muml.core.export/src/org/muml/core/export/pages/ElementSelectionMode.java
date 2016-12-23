package org.muml.core.export.pages;

public enum ElementSelectionMode {
	ELEMENT_SELECTION_MODE_NONE,
	ELEMENT_SELECTION_MODE_SINGLE,
	ELEMENT_SELECTION_MODE_MULTI;
	
	public boolean supportsElementSelection() {
		return this.equals(ELEMENT_SELECTION_MODE_SINGLE) || this.equals(ELEMENT_SELECTION_MODE_MULTI);
	}
}
