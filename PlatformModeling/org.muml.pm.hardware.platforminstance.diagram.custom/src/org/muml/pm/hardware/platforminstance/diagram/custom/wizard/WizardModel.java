package org.muml.pm.hardware.platforminstance.diagram.custom.wizard;



import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.eclipse.m2m.qvt.oml.util.Utils;
import org.muml.pm.hardware.hwplatform.HWPlatform;
import org.muml.pm.hardware.hwplatform.PlatformPart;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;

public class WizardModel {
	
	private HWPlatformInstanceConfiguration selectedHWPlatformInstanceConfiguration;
	
	private HWPlatform selectedHWPlatform;
	private HWPlatformInstance platformInstanceToConfigure;
	public HWPlatformInstance getPlatformInstanceToConfigure() {
		return platformInstanceToConfigure;
	}

	public void setPlatformInstanceToConfigure(HWPlatformInstance platformInstanceToConfigure) {
		this.platformInstanceToConfigure = platformInstanceToConfigure;
	}


	private Dictionary<PlatformPart, Integer> configuration;
	
	private boolean isHWPlatformSet;
	
	public WizardModel(){
		selectedHWPlatform=null;
		selectedHWPlatformInstanceConfiguration=null;
		platformInstanceToConfigure=null;
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

	public Dictionary<PlatformPart, Integer> getConfiguration() {
		return configuration;
	}


	public boolean isHWPlatformSet() {
		return isHWPlatformSet;
	}

	
}
