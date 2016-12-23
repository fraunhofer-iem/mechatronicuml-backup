package org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class BasicSDDNavigatorItem extends BasicSDDAbstractNavigatorItem {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem
						&& (adapterType == View.class || adapterType == EObject.class)) {
					return ((org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem) adaptableObject)
							.getView();
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	private boolean myLeaf = false;

	/**
	 * @generated
	 */
	public BasicSDDNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	 * @generated
	 */
	public View getView() {
		return myView;
	}

	/**
	 * @generated
	 */
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem) {
			return EcoreUtil.getURI(getView())
					.equals(EcoreUtil
							.getURI(((org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem) obj)
									.getView()));
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
