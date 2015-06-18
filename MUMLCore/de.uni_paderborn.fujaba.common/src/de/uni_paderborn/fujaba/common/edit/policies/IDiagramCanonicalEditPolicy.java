package de.uni_paderborn.fujaba.common.edit.policies;

import org.eclipse.gef.EditPolicy;

public interface IDiagramCanonicalEditPolicy extends EditPolicy {
	public void addNoConnectionView(String type);
	public void removeNoConnectionView(String type);
}
