package org.muml.core.common.descriptor;

/**
 * An interface for Property Descriptors that change properties, which belong to
 * a different object than the object they are given.
 * 
 * For example some IChainedPropertyDescriptor's can be chained multiple times.
 * Then to figure out the object that such a Descriptor actually modifies, we can ask
 * this interface.
 * 
 * @author bingo
 * 
 */
public interface IDifferentObjectItemPropertyDescriptor {
	Object getActualObject(Object object);
}
