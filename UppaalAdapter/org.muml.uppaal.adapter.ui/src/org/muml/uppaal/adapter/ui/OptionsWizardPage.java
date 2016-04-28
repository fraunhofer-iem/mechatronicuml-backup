package org.muml.uppaal.adapter.ui;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.muml.ape.runtime.editors.ObjectPropertyEditor;
import org.muml.ape.runtime.wizard.PropertyEditorWizardPage;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.uppaal.options.HideOptionExtension;
import org.muml.uppaal.options.Options;
import org.muml.uppaal.options.OptionsFactory;

public class OptionsWizardPage extends PropertyEditorWizardPage {	
	Options options = null;
	
	public OptionsWizardPage(VerifiableElement verifiableElement, Collection<String> hiddenOptions) {
		super(new ObjectPropertyEditor("options", null, "Options", true));

		//Create settings model
		if (verifiableElement instanceof CoordinationProtocol)
			options = OptionsFactory.eINSTANCE.createCoordinationProtocolOptions();
		else
			options = OptionsFactory.eINSTANCE.createOptions();
		
		//Hide options
		if (!hiddenOptions.isEmpty()) {
			for (String hiddenOption : hiddenOptions) {
				HideOptionExtension extension = OptionsFactory.eINSTANCE.createHideOptionExtension();
				extension.setOption(hiddenOption);
				options.getExtensions().add(extension);
			}
		}
		
		//Create resource set, etc. for APE
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI("fakepath://VerificationOptions.options"));
		resource.getContents().add(options);
		
		TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
	}
	
	public OptionsWizardPage(VerifiableElement verifiableElement) {
		this(verifiableElement, Collections.<String>emptyList());
	}
	
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		setTitle("Verification Options");
		setDescription("Choose your verification options.");
		getControl().addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				options = (Options) getInput();
			}
		});
		setInput(options);
	}
	
	public Options getOptions() {
		if (isDisposed())
			return options;
		else
			return (Options) getInput();
	}
}
