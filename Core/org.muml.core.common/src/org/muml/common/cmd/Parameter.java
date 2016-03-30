package org.muml.common.cmd;

import java.util.List;

public abstract class Parameter<C extends Command> {
	
	public abstract List<String> getSegments();
	
}
