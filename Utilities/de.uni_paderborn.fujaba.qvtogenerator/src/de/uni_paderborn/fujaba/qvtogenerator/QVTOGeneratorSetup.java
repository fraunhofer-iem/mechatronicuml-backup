package de.uni_paderborn.fujaba.qvtogenerator;

import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class QVTOGeneratorSetup implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		return Guice.createInjector(new QVTOGeneratorModule());
	}

}
