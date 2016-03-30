package org.muml.core.common.cmd;

import org.eclipse.core.runtime.IPath;

public abstract class PathCommand extends Command {
	
	private IPath path;
	
	public PathCommand() {
	}

	public PathCommand(IPath path) {
		this.path = path;
	}

	public void setPath(IPath path) {
		this.path = path;
	}
	
	public IPath getPath() {
		return path;
	}
	
	public String getName() {
		return path.toOSString();
	}
	
}
