package de.uni_paderborn.fujaba.muml.verification.uppaal.ui.contentassist;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;

import com.google.inject.Inject;

import de.uni_paderborn.fujaba.muml.verification.uppaal.scoping.MtctlTypes;

public class MtctlTemplateProposalProvider extends DefaultTemplateProposalProvider {
	public static final String[][] types = new String[][] {};
	
	/**
	 * Contains a mapping of template names to 
	 */
	public static final HashMap<String, MtctlTypes> typeMap = new HashMap<String, MtctlTypes>();
	
	@Inject
	public MtctlTemplateProposalProvider(TemplateStore templateStore, ContextTypeRegistry registry, ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
	}
	
	@Override
	protected TemplateProposal createProposal(Template template, TemplateContext templateContext, ContentAssistContext context, Image image, int relevance) {
		//Check whether the type of the proposal fits.
		EObject model = context.getCurrentModel();
		System.out.println(template.getContextTypeId());
		//TODO create MtctlTypeProvider for the EObject -> Type mapping
		//TODO return null if the type of the template doesn't fit into the current context

		
		return super.createProposal(template, templateContext, context, image, relevance);
	}
}
