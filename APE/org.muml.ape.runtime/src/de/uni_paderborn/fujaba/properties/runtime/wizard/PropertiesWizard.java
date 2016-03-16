package de.uni_paderborn.fujaba.properties.runtime.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.wizard.Wizard;

public class PropertiesWizard extends Wizard {
	
	public interface Listener {
		public void wizardFinished();
		public void wizardCanceled();
	}
	
	private List<Listener> listeners = new ArrayList<Listener>();

	public PropertiesWizard() {
		setWindowTitle("Properties");
	}
	
	public void addListener(Listener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(Listener listener) {
		listeners.remove(listener);
	}

	@Override
	public boolean performFinish() {
		for (Listener listener : listeners) {
			listener.wizardFinished();
		}
		return true;
	}

	@Override
	public boolean performCancel() {
		for (Listener listener : listeners) {
			listener.wizardCanceled();
		}
		return true;
	}
	
	
}
