package org.muml.uppaal.adapter.mtctl.xtext.ui.contentassist;

import java.util.HashSet;

import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;

import com.google.inject.Inject;

public class MtctlTemplateProposalProvider extends DefaultTemplateProposalProvider {
	public static HashSet<String> templateNames = new HashSet<String>();
	
	@Inject
	public MtctlTemplateProposalProvider(TemplateStore templateStore, ContextTypeRegistry registry, ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
		
		//Fill templateNames
		templateNames = new HashSet<String>();
		for (Template t : templateStore.getTemplates())
			templateNames.add(t.getName());
	}
	
}
