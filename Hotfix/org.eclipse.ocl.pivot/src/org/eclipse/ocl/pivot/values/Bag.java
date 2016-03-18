/*******************************************************************************
 * Copyright (c) 2010, 2014 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.values;

import java.util.Collection;

/**
 * A bag is a collection that is non-unique and unordered.  It is, therefore,
 * like a set except that any element may occur multiple times.
 * 
 * @author Christian W. Damus (cdamus)
 */
public interface Bag<E> extends Collection<E> {
    /**
     * Queries how many times the specified object occurs in me.
     * If I do not contain the object, then the count is zero.
     * 
     * @param o an object
     * @return the number of times that it occurs in me
     */
    int count(Object o);
}
