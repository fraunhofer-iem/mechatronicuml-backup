/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.realtimestatechart.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MumlNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7040;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorItem) {
			org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorItem item = (org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorItem) element;
			return org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
