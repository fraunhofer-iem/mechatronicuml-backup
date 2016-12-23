/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.muml.ape.runtime.xtfo;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.text.ITextOperationTarget;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.ui.texteditor.IUpdate;

//taken from: http://svn.codespot.com/a/eclipselabs.org/xtext-forms-integration/trunk/plugins/org.eclipselabs.xtfo.demo.rcp/src/org/eclipselabs/xtfo/demo/rcp/partialEditing (rev 39)

class TextViewerAction extends Action implements IUpdate {

	private int fOperationCode= -1;
	private ITextOperationTarget fOperationTarget;

	/**
	 * Creates a new action.
	 *
	 * @param viewer the viewer
	 * @param operationCode the opcode
	 */
	public TextViewerAction(ITextViewer viewer, int operationCode) {
		fOperationCode = operationCode;
		fOperationTarget = viewer.getTextOperationTarget();
		update();
	}

	/**
	 * Updates the enabled state of the action.
	 * Fires a property change if the enabled state changes.
	 *
	 * @see Action#firePropertyChange(String, Object, Object)
	 */
	public void update() {
		boolean wasEnabled = isEnabled();
		boolean isEnabled = (fOperationTarget != null && fOperationTarget.canDoOperation(fOperationCode));
		setEnabled(isEnabled);

		if (wasEnabled != isEnabled) {
			firePropertyChange(ENABLED, wasEnabled ? Boolean.TRUE : Boolean.FALSE, isEnabled ? Boolean.TRUE : Boolean.FALSE);
		}
	}

	/**
	 * @see Action#run()
	 */
	@Override
	public void run() {
		if (fOperationCode != -1 && fOperationTarget != null) {
			fOperationTarget.doOperation(fOperationCode);
		}
	}
}