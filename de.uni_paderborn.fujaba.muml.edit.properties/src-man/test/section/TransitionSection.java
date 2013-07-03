package test.section;

import test.editor.TransitionCategoryEditor;
import de.fujaba.properties.runtime.sections.MultiPropertySection;

public class TransitionSection extends MultiPropertySection {
	public TransitionSection() {
		addPropertyEditor(new TransitionCategoryEditor());
		//addPropertyEditor(new SuperClassXXX)
	}
}
