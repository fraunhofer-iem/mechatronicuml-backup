package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.wizard;



import org.eclipse.m2m.internal.qvt.oml.stdlib.DictionaryImpl;

import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration;

public class WizardModel {
	
	private HWPlatformInstanceConfiguration selectedHWPlatformInstanceConfiguration;
	
	private HWPlatform selectedHWPlatform;
	
	private DictionaryImpl<String, Integer> configuration;
	
	private boolean isHWPlatformSet;
	
	public WizardModel(){
		selectedHWPlatform=null;
		selectedHWPlatformInstanceConfiguration=null;
		isHWPlatformSet=false;
		configuration= new DictionaryImpl<String, Integer>(); 
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

	public DictionaryImpl<String, Integer> getConfiguration() {
		return configuration;
	}


	public boolean isHWPlatformSet() {
		return isHWPlatformSet;
	}

	
}
