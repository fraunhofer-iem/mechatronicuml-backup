package de.uni_paderborn.fujaba.qvtogenerator;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class QVTOGeneratorSupport extends AbstractGenericResourceSupport{

	@Override
	protected Module createGuiceModule() {
		return new QVTOGeneratorModule();
	}

}
