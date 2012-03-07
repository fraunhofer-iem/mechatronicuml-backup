package de.uni_paderborn.fujaba.common.emf.edit.ui;

import org.eclipse.ui.views.properties.tabbed.ISection;

public interface IRefreshProhibitedPropertySection extends ISection {
	void pushRefreshProhibition();
	void popRefreshProhibition();
}
