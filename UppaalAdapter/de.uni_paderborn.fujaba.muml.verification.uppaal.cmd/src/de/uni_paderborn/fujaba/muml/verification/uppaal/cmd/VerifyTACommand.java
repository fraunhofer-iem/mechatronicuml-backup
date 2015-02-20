package de.uni_paderborn.fujaba.muml.verification.uppaal.cmd;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.IPreferenceStore;

import de.uni_paderborn.cmd.PathCommand;
import de.uni_paderborn.fujaba.muml.verification.preferences.VerificationPreferencesPlugin;

public class VerifyTACommand extends PathCommand {
	
	public VerifyTACommand() {
		super(getVerifyTAPath());
		
	}
	
	private static IPath getVerifyTAPath() {
	    IPreferenceStore preferenceStore = VerificationPreferencesPlugin.getDefault().getPreferenceStore();
	    
	    String value = preferenceStore.getString(VerificationPreferencesPlugin.VERIFYTA_KEY);
	    
	    if (value == null || value.isEmpty()) {
	    	throw new IllegalStateException("No path to the UPPAAL verifyta executable has been set in the preferences yet.");
	    }
	    
        return Path.fromOSString(value);
	}
				
}
