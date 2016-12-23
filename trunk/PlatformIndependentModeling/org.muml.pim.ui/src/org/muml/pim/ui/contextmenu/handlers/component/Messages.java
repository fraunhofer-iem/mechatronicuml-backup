package org.muml.pim.ui.contextmenu.handlers.component;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.muml.pim.ui.contextmenu.handlers.component.messages"; //$NON-NLS-1$
	public static String CopyRolePropertiesToPortHandler_PathCopyRolePropertiesToPortTransformation;
	public static String EmbedAllPortBehaviorsToACHandler_PathEmbedAllPortBehaviorInACTransformation;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
