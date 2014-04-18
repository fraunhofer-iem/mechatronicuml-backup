package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.wizard;



import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.eclipse.m2m.qvt.oml.util.Utils;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;

public class WizardModel {
	
	private HWPlatformInstanceConfiguration selectedHWPlatformInstanceConfiguration;
	
	private HWPlatform selectedHWPlatform;
	
	private Dictionary<String, Integer> configuration;
	
	private boolean isHWPlatformSet;
	
	public WizardModel(){
		selectedHWPlatform=null;
		selectedHWPlatformInstanceConfiguration=null;
		isHWPlatformSet=false;
		configuration= Utils.createDictionary(); 
	}

	public HWPlatformInstanceConfiguration getSelectedHWPlatformInstanceConfiguration() {
		return selectedHWPlatformInstanceConfiguration;
	}

	public void setSelectedHWPlatformInstanceConfiguration(
			HWPlatformInstanceConfiguration selectedHWPlatformInstanceConfiguration) {
		this.selectedHWPlatformInstanceConfiguration = selectedHWPlatformInstanceConfiguration;
	}

	public HWPlatform getSelectedHWPlatform() {
		return selectedHWPlatform;
	}

	public void setSelectedHWPlatform(HWPlatform selectedHWPlatform) {
		this.selectedHWPlatform = selectedHWPlatform;
		this.isHWPlatformSet=true;
	}

	public Dictionary<String, Integer> getConfiguration() {
		return configuration;
	}


	public boolean isHWPlatformSet() {
		return isHWPlatformSet;
	}

	
}
