package de.uni_paderborn.fujaba.muml.codegen.export.ui;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

public interface ITargetPlatformGenerator {

	
	public void generateSourceCode(EObject element, IContainer targetFolder, IProgressMonitor monitor);
	
	public String getName();
	
	public String getDescription();
}
