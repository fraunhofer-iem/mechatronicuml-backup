/*
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package de.uni_paderborn.fujaba.newwizard.diagrams.pages;

import java.util.Observable;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.internal.common.ui.ModelSelectionPageExtension;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class AddElementPageExtension extends Observable implements ModelSelectionPageExtension {


	private boolean addElement;
	private Button btn;

	public final boolean shouldAddElement() {
		return addElement;
	}

	protected void onStatusChanged(boolean value) {
		if (addElement == value) {
			return;
		}
		this.addElement = value;
		setChanged();
		notifyObservers(Boolean.valueOf(addElement));
	}

	protected String getLabelText() {
		return "Add new Diagram Element to Root Node";
	}

	public void createControl(Composite parent) {
		btn = new Button(parent, SWT.CHECK);
		btn.setText(getLabelText());
		btn.setSelection(addElement);
		btn.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				onStatusChanged(btn.getSelection());
			}
		});
	}

	public void setResource(Resource resource) {
	}

	public void setAddElement(boolean status) {
		btn.setSelection(status);
		onStatusChanged(status);
	}
}
