package de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ComponentInstanceConfigurationNavigatorItem
		extends
		de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.navigator.ComponentInstanceConfigurationAbstractNavigatorItem {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(
				new IAdapterFactory() {

					public Object getAdapter(Object adaptableObject,
							Class adapterType) {
						if (adaptableObject instanceof de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.navigator.ComponentInstanceConfigurationNavigatorItem
								&& (adapterType == View.class || adapterType == EObject.class)) {
							return ((de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.navigator.ComponentInstanceConfigurationNavigatorItem) adaptableObject)
									.getView();
						}
						return null;
					}

					public Class[] getAdapterList() {
						return supportedTypes;
					}
				},
				de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.navigator.ComponentInstanceConfigurationNavigatorItem.class);
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
	public ComponentInstanceConfigurationNavigatorItem(View view,
			Object parent, boolean isLeaf) {
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
		if (obj instanceof de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.navigator.ComponentInstanceConfigurationNavigatorItem) {
			return EcoreUtil
					.getURI(getView())
					.equals(EcoreUtil
							.getURI(((de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.navigator.ComponentInstanceConfigurationNavigatorItem) obj)
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
