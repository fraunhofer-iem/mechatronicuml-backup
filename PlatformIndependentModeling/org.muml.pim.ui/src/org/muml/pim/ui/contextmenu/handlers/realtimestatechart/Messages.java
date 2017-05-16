package org.muml.pim.ui.contextmenu.handlers.realtimestatechart;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.muml.pim.ui.contextmenu.handlers.realtimestatechart.messages"; //$NON-NLS-1$
	public static String disassembleComponentTransformation;
	public static String disassemblePortOrRoleTransformation;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
