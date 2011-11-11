package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;


public interface IPropertiesListDialogExtension extends IDialogExtension {

	void updateModifyButtonEnablement();

	Collection<EClass> getInstanceClasses();

	EClass getInstanceClass();

	void setInstanceClass(EClass instanceClass);	
}
