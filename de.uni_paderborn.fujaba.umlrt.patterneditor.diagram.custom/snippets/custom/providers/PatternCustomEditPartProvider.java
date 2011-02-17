package patterneditor.diagram.custom.providers;

import patterneditor.diagram.custom.edit.parts.CustomPatternEditPartFactory;
import patterneditor.diagram.providers.PatternEditPartProvider;

public class PatternCustomEditPartProvider extends PatternEditPartProvider {
	public PatternCustomEditPartProvider() {
		setFactory(new CustomPatternEditPartFactory());
		setAllowCaching(true);
	}
}
