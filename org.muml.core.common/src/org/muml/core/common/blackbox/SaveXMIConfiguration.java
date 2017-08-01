package org.muml.core.common.blackbox;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * The options for SaveXMIBlackbox can only be set in java code (the caller of
 * the transformation), as there is no way to access or set the ResourceSet from
 * QVTo.
 * 
 * Also, as a qvto blackbox, this code can be used in different contextes
 * (several transformations might use it). To support this consequently, the
 * options can be set by pushing them on a stack, and the highest options entry
 * on the stack is active.
 * 
 * This way we guarantee that older options are not overwritten, if new options
 * are set (also considering reentrant/recursive calls etc). And is this is the
 * only way that this blackbox can be used savely in multiple transformations
 * that call each other.
 * 
 * @author ingo
 *
 */
public class SaveXMIConfiguration {

	/**
	 * Options for use of this blackbox.
	 * 
	 * @author ingo
	 *
	 */
	public static class Options {
		/**
		 * The resource set to add new resources into.
		 */
		public ResourceSet resourceSet = null;
		
		/**
		 * We can either save directly, or save later.
		 * 
		 * If we want to save later, we must specify a resource set above.
		 * We then add our resource (that has not been saved yet) to that resource set.
		 * 
		 * Later all resources in that resourceSet can be saved manually.
		 */
		public boolean saveDirectly = true;
	}
	
	/**
	 * Stack of options that have been set, only the highest entry is active.
	 * 
	 * By pushing a new options entry to the stack, we activate it.
	 */
	private static List<Options> optionsStack = new ArrayList<Options>();
	
	
	/**
	 * Set options for the current transformation.
	 * 
	 * @param options The options to use.
	 */
	public static void pushOptions(Options options) {
		optionsStack.add(options);
	}

	/**
	 * Remove options so that earlier options are active again. 
	 */
	public static void popOptions() {
		assert(!optionsStack.isEmpty());
		optionsStack.remove(optionsStack.size() - 1);
	}

	public static Options getCurrentOptions() {
		if (!optionsStack.isEmpty()) {
			return optionsStack.get(optionsStack.size() - 1);
		}
		return null;
	}

}
