/*
 * generated by Xtext
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.ui.contentassist;

import java.util.Arrays;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.common.base.Function;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TemporalQuantifierExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.scoping.MtctlScopeProvider;

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
public class MtctlProposalProvider extends de.uni_paderborn.fujaba.muml.verification.uppaal.ui.contentassist.AbstractMtctlProposalProvider {
	public static final String[] keywordExclude = new String[] {">","<",">=","<=","==","!=","(",")","A[]","A<>","E<>","E[]"}; // list of keywords to exclude from auto-complete
	public static final HashSet<String> hashKeywordExclude = new HashSet<String>(Arrays.asList(keywordExclude));
	public static final HashSet<String> temporalQuantifiers = new HashSet<String>(Arrays.asList(new String[] {"AG", "AF", "EG", "EF"}));
	
	@Override
	public void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {

		if (hashKeywordExclude.contains(keyword.getValue()) || MtctlTemplateProposalProvider.templateNames.contains(keyword.getValue()))
			return; // suppress <ignored keyword> and <keywords overruled by templates>
		
		//suppress nested temporal quantifiers suggestions
		EObject context = contentAssistContext.getCurrentModel();
		if (temporalQuantifiers.contains((keyword.getValue()))) {
			while (context != null) {
				if (context instanceof TemporalQuantifierExpr)
					return;
				context = context.eContainer();
			}
		}

		super.completeKeyword(keyword, contentAssistContext, acceptor);
	}
	
	/**
	 * Calls getScope(modelContext, reference) and adds the returned elements to the proposals. 
	 */
	protected void completeAssignmentUsingScope(EObject modelContext, EReference reference, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		Function<IEObjectDescription, ICompletionProposal> factory = new DefaultProposalCreator(context, null, getQualifiedNameConverter());
		IScope scope = getScopeProvider().getScope(modelContext, reference);
		for (IEObjectDescription e : scope.getAllElements())
			acceptor.accept(factory.apply(e));
	}
	
	/*
	 * We override this method to correct the issue that the default proposal provider is not very smart at calling the ScopeProvider
	 * In particular, it calls getScope(context, reference) with references that do not exist in the supplied context:
	 * !context.eClass.getEAllReferences().contains(reference).
	 * That behavior makes it difficult to find the correct scope (most prominently, getScope(messageInBufferExpr, MumlElemExpr.elem) cannot
	 * distinguish whether the message (1st argument) or the buffer (2nd argument) is searched for, because both calls are the same.
	 * This implementation fixes that, then lets the default provider do its thing.
	 */
	@Override
	public void completeAssignment(Assignment assignment, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {
		EObject currentModel = contentAssistContext.getCurrentModel();
		if (currentModel == null) //normalize empty models
			currentModel = MtctlFactory.eINSTANCE.createPropertyRepository();
		
		for (EReference reference : currentModel.eClass().getEAllReferences()) //find correct reference (O(1) for fixed metamodel)
			if (reference.getName().equals(assignment.getFeature())) //compare reference with current feature to set
				completeAssignmentUsingScope(currentModel, reference, contentAssistContext, acceptor); //add appropriate items from scoping
	
		super.completeAssignment(assignment, contentAssistContext, acceptor);
	}
	
	/*
	 * Overriding to supply helpful proposals wherever comparisons may be expected.
	 * Without overriding, comparable references to the muml model are not included where appropriate
	 */
	@Override
	public void completeComparisonExpr_Lhs(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeComparisonExpr_Lhs(model, assignment, context, acceptor);
		
		completeAssignmentUsingScope(PredicatesFactory.eINSTANCE.createComparisonExpr(), PredicatesPackage.eINSTANCE.getComparisonExpr_Lhs(), context, acceptor);
	}
}
