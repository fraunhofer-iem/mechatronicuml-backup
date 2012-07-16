package de.uni_paderborn.fujaba.muml.model.core.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import de.uni_paderborn.fujaba.common.descriptor.DefaultChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.common.descriptor.IChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.core.CoreFactory;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

public class NaturalNumberPropertyDescriptor extends
		DefaultChainedPropertyDescriptor {

	public NaturalNumberPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags,
			IChainedPropertyDescriptor parent) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags, parent);
		setInstanceClass(CorePackage.Literals.NATURAL_NUMBER);
	}

	public NaturalNumberPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	@Override
	public Object createObject() {
		throw new UnsupportedOperationException(
				"Tried to use NaturalNumberPropretyDescriptor as parent for another PropertyDescriptor.\n"
						+ "This is not possible, as NaturalNumberPropretyDescriptor creates Strings, which cannot be used as input object for another ItemPropertyDescriptor.");
	}

	@Override
	public Object doGetValue(EObject object, EStructuralFeature feature) {
		Object value = super.doGetValue(object, feature);
		if (value != null) {
			return value.toString();
		}
		return null;
	}

	@Override
	public void doSetValue(Object object, Object newValue) {
		NaturalNumber naturalNumber = CoreFactory.eINSTANCE
				.createNaturalNumber();
		try {
			if (newValue.equals("-1")) {
				naturalNumber.setInfinity(true);
			} else {
				naturalNumber.setValue((String) newValue);
			}
		} catch (NumberFormatException nfe) {
			Shell shell = PlatformUI.getWorkbench().
	                getActiveWorkbenchWindow().getShell();
			MessageBox messageBox = new MessageBox(shell, SWT.ICON_INFORMATION);
			messageBox.setText("Change NaturalNumber");
			messageBox.setMessage(nfe.getLocalizedMessage());
			messageBox.open();
		}
		super.doSetValue(object, naturalNumber);
	}
}