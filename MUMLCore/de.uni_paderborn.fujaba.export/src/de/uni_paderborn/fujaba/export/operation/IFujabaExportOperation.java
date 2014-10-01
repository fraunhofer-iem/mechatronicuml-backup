package de.uni_paderborn.fujaba.export.operation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.operation.IRunnableWithProgress;

public interface IFujabaExportOperation extends IRunnableWithProgress {
	public IStatus getStatus();

}
