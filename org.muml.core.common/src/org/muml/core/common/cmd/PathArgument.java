package org.muml.core.common.cmd;

import org.eclipse.core.runtime.IPath;

public class PathArgument<C extends Command> extends Argument<C> {

	public PathArgument(IPath path) {
		this.path = path;
	}
	
	@Override
	public String getArgument() {
		return path.toOSString();
	}
	
	private IPath path;

}
