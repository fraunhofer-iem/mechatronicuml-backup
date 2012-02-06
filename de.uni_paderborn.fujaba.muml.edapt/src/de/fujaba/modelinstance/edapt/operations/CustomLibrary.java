package de.fujaba.modelinstance.edapt.operations;

import org.eclipse.emf.edapt.declaration.EdaptLibrary;
import org.eclipse.emf.edapt.declaration.LibraryImplementation;

@EdaptLibrary(label = "Custom Library", description = "Library of custom operations")
public class CustomLibrary extends LibraryImplementation {

	/** Constructor. */
	public CustomLibrary() {
		addOperation(MakeContainmentAndCopy.class);
		addOperation(MakeContainmentAndMove.class);
	}
}
