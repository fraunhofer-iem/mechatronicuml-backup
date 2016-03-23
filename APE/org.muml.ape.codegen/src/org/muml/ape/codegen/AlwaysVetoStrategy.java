package org.muml.ape.codegen;
import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.VetoStrategy;


public class AlwaysVetoStrategy implements VetoStrategy {

	//@Override This override causes problems when deploying as plugin.
	public boolean hasVeto(FileHandle handle) {
		return true;
	}

	
}

