package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.refactor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;

import de.uni_paderborn.fujaba.muml.hardware.common.refactor.AbstractExtractSubdiagramRefactoring;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartment2EditPart;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartment2EditPart;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditor;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin;


public class HWPICExtractSubdiagram extends AbstractExtractSubdiagramRefactoring<HWPlatformInstance> {

	@Override
	protected boolean elementIsHierachical(HWPlatformInstance element) {
		// TODO Auto-generated method stub
		return element.getEmbeddedHPIC()!=null;
	}

	@Override
	protected String getEditorID() {
		// TODO Auto-generated method stub
		return PlatformInstanceDiagramEditor.ID;
	}

	@Override
	protected PreferencesHint getEditorPreferenceHINT() {
		// TODO Auto-generated method stub
		return PlatformInstanceDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	@Override
	protected List<Integer> getCompartmentViewIDs() {
		// TODO Auto-generated method stub
		List<Integer> list =new ArrayList<Integer>();
		list.add(HWPlatformInstanceHWPlatformCompartment2EditPart.VISUAL_ID);
		return list;
		
	}

	@Override
	protected EObject getElementToExtract(HWPlatformInstance element) {
		// TODO Auto-generated method stub
		return element.getEmbeddedHPIC();
	}

}
