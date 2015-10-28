package de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TestLanguageNavigatorItem
		extends
		de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageAbstractNavigatorItem {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(
				new IAdapterFactory() {

					public Object getAdapter(Object adaptableObject,
							Class adapterType) {
						if (adaptableObject instanceof de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem
								&& (adapterType == View.class || adapterType == EObject.class)) {
							return ((de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem) adaptableObject)
									.getView();
						}
						return null;
					}

					public Class[] getAdapterList() {
						return supportedTypes;
					}
				},
				de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem.class);
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
	public TestLanguageNavigatorItem(View view, Object parent, boolean isLeaf) {
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
		if (obj instanceof de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem) {
			return EcoreUtil
					.getURI(getView())
					.equals(EcoreUtil
							.getURI(((de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem) obj)
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
