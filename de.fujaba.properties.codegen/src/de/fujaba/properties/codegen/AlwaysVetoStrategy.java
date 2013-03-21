package de.fujaba.properties.codegen;
import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.VetoStrategy;


public class AlwaysVetoStrategy implements VetoStrategy {

	@Override
	public boolean hasVeto(FileHandle handle) {
		return true;
	}

}
