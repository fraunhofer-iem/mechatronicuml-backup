package de.uni_paderborn.fujaba.muml.verification.uppaal.ui.wizard;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportTargetPage;
import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.Options;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.OptionsFactory;
import de.uni_paderborn.fujaba.properties.runtime.editors.ObjectPropertyEditor;

public class UppaalExportTargetPage extends AbstractFujabaExportTargetPage {

	private Options uppaalOptions;
	private Button buttonExportAsXml;
	private ObjectPropertyEditor uppaalOptionsEditor;
	private VerifiableElement verifiableElement;
	private Resource uppaalOptionsResource;
	private ResourceSet resourceSet = new ResourceSetImpl();
	
	public UppaalExportTargetPage(String name, FormToolkit toolkit) {
		super(name, toolkit);
		uppaalOptionsEditor = new ObjectPropertyEditor("options", null, "options", true);
	}

	@Override
	public boolean wizardPageSupportsOverwriteOption() {
		return true;
	}

	@Override
	public boolean wizardPageDirectoryDestination() {
		return true;
	}

	@Override
	public void createOptions(Composite parent) {
		super.createOptions(parent);
		buttonExportAsXml = toolkit.createButton(parent, "Export as XML", SWT.CHECK);
		uppaalOptionsEditor.createControls(parent, toolkit);
	}
	
	public boolean isExportAsXml() {
		return buttonExportAsXml != null && !buttonExportAsXml.isDisposed() && buttonExportAsXml.getSelection();
	}
	
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			uppaalOptionsResource = resourceSet.createResource(URI.createURI("fakepath://VerificationOptions.options"));
			setVerifiableElement(((UppaalExportWizard)getWizard()).getVerifiableElement());
		} else if (uppaalOptionsResource != null) {
			uppaalOptionsResource.getContents().clear();
			resourceSet.getResources().remove(uppaalOptionsResource);
			uppaalOptionsResource = null;
		}
	}

	private void setVerifiableElement(VerifiableElement verifiableElement) {
		if (this.verifiableElement != verifiableElement) {
			this.verifiableElement = verifiableElement;
			
			//Create settings model and set it as editor's input
			if (verifiableElement instanceof CoordinationProtocol)
				uppaalOptions = OptionsFactory.eINSTANCE.createCoordinationProtocolOptions();
			else
				uppaalOptions = OptionsFactory.eINSTANCE.createOptions();
			
			if (uppaalOptionsResource != null) {
				uppaalOptionsResource.getContents().clear();
				uppaalOptionsResource.getContents().add(uppaalOptions);
				
				uppaalOptionsEditor.setInput(uppaalOptions);
				uppaalOptionsEditor.setTitle("Uppaal");		

				relayout();
			}
		}
	}

	private void relayout() {
		// bingo: dirty hack to relayout, I have not yet found a better way that actually works
		Point size = getControl().getShell().getSize();
		size.x++; size.y++;
		getControl().getShell().setSize(size);
		size.x--; size.y--;
		getControl().getShell().setSize(size);		
	}
	
	public Options getUppaalOptions() {
		return uppaalOptions;
	}
}
