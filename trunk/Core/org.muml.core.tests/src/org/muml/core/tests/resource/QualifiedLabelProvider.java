package org.muml.core.tests.resource;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EObject;

public class QualifiedLabelProvider implements ILabelProvider {
	private ILabelProvider defaultLabelProvider;
	
	public QualifiedLabelProvider(ILabelProvider defaultLabelProvider) {
		this.defaultLabelProvider = defaultLabelProvider;
	}
	
	/**
	 * Gets a qualified label for the given element (e.g.
	 * package.package.element).
	 * 
	 * @param element
	 *            The element to get a label for
	 * @return The label
	 */
	@Override
	public String getLabel(EObject element) {
		StringBuffer buffer = null;

		
		while (element != null  && false == element instanceof GenModel) {
			String label = defaultLabelProvider.getLabel(element);
			if (label != null) {
				if (buffer == null) {
					buffer = new StringBuffer();
				} else {
					buffer.insert(0, '.');
				}
				buffer.insert(0, label);
			}
			element = element.eContainer();
		}
		return buffer.toString();
	}
}