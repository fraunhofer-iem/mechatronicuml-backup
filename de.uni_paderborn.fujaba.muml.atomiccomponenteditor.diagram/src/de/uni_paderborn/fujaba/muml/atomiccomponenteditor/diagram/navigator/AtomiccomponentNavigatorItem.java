package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AtomiccomponentNavigatorItem
		extends
		de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentAbstractNavigatorItem {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(
				new IAdapterFactory() {

					public Object getAdapter(Object adaptableObject,
							Class adapterType) {
						if (adaptableObject instanceof de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem
								&& (adapterType == View.class || adapterType == EObject.class)) {
							return ((de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem) adaptableObject)
									.getView();
						}
						return null;
					}

					public Class[] getAdapterList() {
						return supportedTypes;
					}
				},
				de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem.class);
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
	public AtomiccomponentNavigatorItem(View view, Object parent, boolean isLeaf) {
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
		if (obj instanceof de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem) {
			return EcoreUtil
					.getURI(getView())
					.equals(EcoreUtil
							.getURI(((de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem) obj)
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
