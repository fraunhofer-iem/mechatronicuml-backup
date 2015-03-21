package de.uni_paderborn.uppaal.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uni_paderborn.uppaal.NTA;
import de.uni_paderborn.uppaal.UppaalPackage;
import de.uni_paderborn.uppaal.declarations.ArrayInitializer;
import de.uni_paderborn.uppaal.declarations.DeclarationsPackage;
import de.uni_paderborn.uppaal.declarations.ExpressionInitializer;
import de.uni_paderborn.uppaal.declarations.Function;
import de.uni_paderborn.uppaal.declarations.GlobalDeclarations;
import de.uni_paderborn.uppaal.declarations.LocalDeclarations;
import de.uni_paderborn.uppaal.declarations.Parameter;
import de.uni_paderborn.uppaal.declarations.ParameterContainer;
import de.uni_paderborn.uppaal.declarations.SystemDeclarations;
import de.uni_paderborn.uppaal.declarations.TypeDeclaration;
import de.uni_paderborn.uppaal.declarations.TypedDeclaration;
import de.uni_paderborn.uppaal.declarations.Variable;
import de.uni_paderborn.uppaal.declarations.global.ChannelItem;
import de.uni_paderborn.uppaal.declarations.global.ChannelPriorityDeclaration;
import de.uni_paderborn.uppaal.declarations.global.ChannelPriorityGroup;
import de.uni_paderborn.uppaal.declarations.global.DefaultItem;
import de.uni_paderborn.uppaal.declarations.global.GlobalPackage;
import de.uni_paderborn.uppaal.declarations.system.InstantiationList;
import de.uni_paderborn.uppaal.declarations.system.ProgressMeasure;
import de.uni_paderborn.uppaal.declarations.system.SystemPackage;
import de.uni_paderborn.uppaal.declarations.system.TemplateDeclaration;
import de.uni_paderborn.uppaal.expressions.ArithmeticExpression;
import de.uni_paderborn.uppaal.expressions.AssignmentExpression;
import de.uni_paderborn.uppaal.expressions.BitShiftExpression;
import de.uni_paderborn.uppaal.expressions.BitwiseExpression;
import de.uni_paderborn.uppaal.expressions.ChannelPrefixExpression;
import de.uni_paderborn.uppaal.expressions.CompareExpression;
import de.uni_paderborn.uppaal.expressions.ConditionExpression;
import de.uni_paderborn.uppaal.expressions.DataPrefixExpression;
import de.uni_paderborn.uppaal.expressions.ExpressionsPackage;
import de.uni_paderborn.uppaal.expressions.FunctionCallExpression;
import de.uni_paderborn.uppaal.expressions.IdentifierExpression;
import de.uni_paderborn.uppaal.expressions.LiteralExpression;
import de.uni_paderborn.uppaal.expressions.LogicalExpression;
import de.uni_paderborn.uppaal.expressions.MinMaxExpression;
import de.uni_paderborn.uppaal.expressions.MinusExpression;
import de.uni_paderborn.uppaal.expressions.NegationExpression;
import de.uni_paderborn.uppaal.expressions.PlusExpression;
import de.uni_paderborn.uppaal.expressions.PostIncrementDecrementExpression;
import de.uni_paderborn.uppaal.expressions.PreIncrementDecrementExpression;
import de.uni_paderborn.uppaal.expressions.QuantificationExpression;
import de.uni_paderborn.uppaal.expressions.ScopedIdentifierExpression;
import de.uni_paderborn.uppaal.parsable.IdentifiableLocation;
import de.uni_paderborn.uppaal.parsable.ParsablePackage;
import de.uni_paderborn.uppaal.services.UppaalXMLGrammarAccess;
import de.uni_paderborn.uppaal.statements.Block;
import de.uni_paderborn.uppaal.statements.DoWhileLoop;
import de.uni_paderborn.uppaal.statements.EmptyStatement;
import de.uni_paderborn.uppaal.statements.ExpressionStatement;
import de.uni_paderborn.uppaal.statements.ForLoop;
import de.uni_paderborn.uppaal.statements.IfStatement;
import de.uni_paderborn.uppaal.statements.Iteration;
import de.uni_paderborn.uppaal.statements.ReturnStatement;
import de.uni_paderborn.uppaal.statements.StatementsPackage;
import de.uni_paderborn.uppaal.statements.WhileLoop;
import de.uni_paderborn.uppaal.templates.Edge;
import de.uni_paderborn.uppaal.templates.RedefinedTemplate;
import de.uni_paderborn.uppaal.templates.Selection;
import de.uni_paderborn.uppaal.templates.Synchronization;
import de.uni_paderborn.uppaal.templates.Template;
import de.uni_paderborn.uppaal.templates.TemplatesPackage;
import de.uni_paderborn.uppaal.types.DeclaredType;
import de.uni_paderborn.uppaal.types.IntegerBounds;
import de.uni_paderborn.uppaal.types.RangeTypeSpecification;
import de.uni_paderborn.uppaal.types.ScalarTypeSpecification;
import de.uni_paderborn.uppaal.types.StructTypeSpecification;
import de.uni_paderborn.uppaal.types.TypesPackage;
import de.uni_paderborn.uppaal.visuals.Point;
import de.uni_paderborn.uppaal.visuals.VisualsPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractUppaalXMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UppaalXMLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DeclarationsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DeclarationsPackage.ARRAY_INITIALIZER:
				if(context == grammarAccess.getArrayInitializerRule() ||
				   context == grammarAccess.getInitializerRule()) {
					sequence_ArrayInitializer(context, (ArrayInitializer) semanticObject); 
					return; 
				}
				else break;
			case DeclarationsPackage.EXPRESSION_INITIALIZER:
				if(context == grammarAccess.getExpressionInitializerRule() ||
				   context == grammarAccess.getInitializerRule()) {
					sequence_ExpressionInitializer(context, (ExpressionInitializer) semanticObject); 
					return; 
				}
				else break;
			case DeclarationsPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case DeclarationsPackage.GLOBAL_DECLARATIONS:
				if(context == grammarAccess.getGlobalDeclarationsRule()) {
					sequence_GlobalDeclarations(context, (GlobalDeclarations) semanticObject); 
					return; 
				}
				else break;
			case DeclarationsPackage.LOCAL_DECLARATIONS:
				if(context == grammarAccess.getBlockDeclarationsRule()) {
					sequence_BlockDeclarations(context, (LocalDeclarations) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getLocalDeclarationsRule()) {
					sequence_LocalDeclarations(context, (LocalDeclarations) semanticObject); 
					return; 
				}
				else break;
			case DeclarationsPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case DeclarationsPackage.PARAMETER_CONTAINER:
				if(context == grammarAccess.getParameterContainerRule()) {
					sequence_ParameterContainer(context, (ParameterContainer) semanticObject); 
					return; 
				}
				else break;
			case DeclarationsPackage.SYSTEM_DECLARATIONS:
				if(context == grammarAccess.getSystemDeclarationsRule()) {
					sequence_SystemDeclarations(context, (SystemDeclarations) semanticObject); 
					return; 
				}
				else break;
			case DeclarationsPackage.TYPE_DECLARATION:
				if(context == grammarAccess.getTypeDeclarationRule()) {
					sequence_TypeDeclaration(context, (TypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationsPackage.TYPED_DECLARATION:
				if(context == grammarAccess.getBlockTypedDeclarationRule()) {
					sequence_BlockTypedDeclaration(context, (TypedDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypedDeclarationRule()) {
					sequence_TypedDeclaration(context, (TypedDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypedElementRule()) {
					sequence_TypedElement(context, (TypedDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationsPackage.VARIABLE:
				if(context == grammarAccess.getVariableNameOnlyRule()) {
					sequence_VariableNameOnly(context, (Variable) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ExpressionsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExpressionsPackage.ARITHMETIC_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_ArithmeticExpression_Other_ArithmeticExpression_PlusMinus(context, (ArithmeticExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_AssignmentExpression(context, (AssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.BIT_SHIFT_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_BitShiftExpression(context, (BitShiftExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.BITWISE_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_BitwiseExpression_And_BitwiseExpression_Or_BitwiseExpression_Xor(context, (BitwiseExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.CHANNEL_PREFIX_EXPRESSION:
				if(context == grammarAccess.getChannelPrefixExpressionRule() ||
				   context == grammarAccess.getTypeExpressionRule()) {
					sequence_ChannelPrefixExpression(context, (ChannelPrefixExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.COMPARE_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_CompareExpression_EqualUnequal_CompareExpression_Other(context, (CompareExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.CONDITION_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_ConditionExpression(context, (ConditionExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.DATA_PREFIX_EXPRESSION:
				if(context == grammarAccess.getDataPrefixExpressionRule() ||
				   context == grammarAccess.getTypeExpressionRule()) {
					sequence_DataPrefixExpression(context, (DataPrefixExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.FUNCTION_CALL_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunctionCallExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_FunctionCallExpression(context, (FunctionCallExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.IDENTIFIER_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIdentifierExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_IdentifierExpression(context, (IdentifierExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimpleIdentifierExpressionRule() ||
				   context == grammarAccess.getTypeExpressionRule()) {
					sequence_SimpleIdentifierExpression(context, (IdentifierExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.LITERAL_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_LiteralExpression(context, (LiteralExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.LOGICAL_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_LogicalExpression_And_LogicalExpression_AndAlternative_LogicalExpression_OrAlternative_LogicalExpression_OrImply(context, (LogicalExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.MIN_MAX_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_MinMaxExpression(context, (MinMaxExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.MINUS_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_MinusExpression(context, (MinusExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.NEGATION_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_NegationExpression_NegationExpression_Alternative(context, (NegationExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.PLUS_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_PlusExpression(context, (PlusExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.POST_INCREMENT_DECREMENT_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_PostIncrementDecrementExpression(context, (PostIncrementDecrementExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.PRE_INCREMENT_DECREMENT_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_PreIncrementDecrementExpression(context, (PreIncrementDecrementExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.QUANTIFICATION_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_QuantificationExpression(context, (QuantificationExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.SCOPED_IDENTIFIER_EXPRESSION:
				if(context == grammarAccess.getArithmeticExpression_OtherRule() ||
				   context == grammarAccess.getArithmeticExpression_OtherAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusRule() ||
				   context == grammarAccess.getArithmeticExpression_PlusMinusAccess().getArithmeticExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitShiftExpressionRule() ||
				   context == grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_AndRule() ||
				   context == grammarAccess.getBitwiseExpression_AndAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_OrRule() ||
				   context == grammarAccess.getBitwiseExpression_OrAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getBitwiseExpression_XorRule() ||
				   context == grammarAccess.getBitwiseExpression_XorAccess().getBitwiseExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalRule() ||
				   context == grammarAccess.getCompareExpression_EqualUnequalAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getCompareExpression_OtherRule() ||
				   context == grammarAccess.getCompareExpression_OtherAccess().getCompareExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalExpression_AndRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_AndAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_AndAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeRule() ||
				   context == grammarAccess.getLogicalExpression_OrAlternativeAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getLogicalExpression_OrImplyRule() ||
				   context == grammarAccess.getLogicalExpression_OrImplyAccess().getLogicalExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinMaxExpressionRule() ||
				   context == grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0() ||
				   context == grammarAccess.getMinusExpressionRule() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getNegationExpression_AlternativeRule() ||
				   context == grammarAccess.getPlusExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getPreIncrementDecrementExpressionRule() ||
				   context == grammarAccess.getQuantificationExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionRule() ||
				   context == grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0() ||
				   context == grammarAccess.getTerminatingExpressionsRule()) {
					sequence_ScopedIdentifierExpression(context, (ScopedIdentifierExpression) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == GlobalPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GlobalPackage.CHANNEL_ITEM:
				if(context == grammarAccess.getChannelItemRule() ||
				   context == grammarAccess.getPriorityItemRule()) {
					sequence_ChannelItem(context, (ChannelItem) semanticObject); 
					return; 
				}
				else break;
			case GlobalPackage.CHANNEL_PRIORITY_DECLARATION:
				if(context == grammarAccess.getChannelPriorityDeclarationRule()) {
					sequence_ChannelPriorityDeclaration(context, (ChannelPriorityDeclaration) semanticObject); 
					return; 
				}
				else break;
			case GlobalPackage.CHANNEL_PRIORITY_GROUP:
				if(context == grammarAccess.getChannelPriorityGroupRule()) {
					sequence_ChannelPriorityGroup(context, (ChannelPriorityGroup) semanticObject); 
					return; 
				}
				else break;
			case GlobalPackage.DEFAULT_ITEM:
				if(context == grammarAccess.getDefaultItemRule() ||
				   context == grammarAccess.getPriorityItemRule()) {
					sequence_DefaultItem(context, (DefaultItem) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ParsablePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ParsablePackage.IDENTIFIABLE_LOCATION:
				if(context == grammarAccess.getLocationRule()) {
					sequence_Location(context, (IdentifiableLocation) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == StatementsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StatementsPackage.BLOCK:
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case StatementsPackage.DO_WHILE_LOOP:
				if(context == grammarAccess.getDoWhileLoopRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_DoWhileLoop(context, (DoWhileLoop) semanticObject); 
					return; 
				}
				else break;
			case StatementsPackage.EMPTY_STATEMENT:
				if(context == grammarAccess.getEmptyStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_EmptyStatement(context, (EmptyStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementsPackage.EXPRESSION_STATEMENT:
				if(context == grammarAccess.getExpressionStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ExpressionStatement(context, (ExpressionStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementsPackage.FOR_LOOP:
				if(context == grammarAccess.getForLoopRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ForLoop(context, (ForLoop) semanticObject); 
					return; 
				}
				else break;
			case StatementsPackage.IF_STATEMENT:
				if(context == grammarAccess.getIfStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_IfStatement(context, (IfStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementsPackage.ITERATION:
				if(context == grammarAccess.getIterationRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Iteration(context, (Iteration) semanticObject); 
					return; 
				}
				else break;
			case StatementsPackage.RETURN_STATEMENT:
				if(context == grammarAccess.getReturnStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ReturnStatement(context, (ReturnStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementsPackage.WHILE_LOOP:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getWhileLoopRule()) {
					sequence_WhileLoop(context, (WhileLoop) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SystemPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SystemPackage.INSTANTIATION_LIST:
				if(context == grammarAccess.getInstantiationListRule()) {
					sequence_InstantiationList(context, (InstantiationList) semanticObject); 
					return; 
				}
				else break;
			case SystemPackage.PROGRESS_MEASURE:
				if(context == grammarAccess.getProgressMeasureRule()) {
					sequence_ProgressMeasure(context, (ProgressMeasure) semanticObject); 
					return; 
				}
				else break;
			case SystemPackage.SYSTEM:
				if(context == grammarAccess.getSystemRule()) {
					sequence_System(context, (de.uni_paderborn.uppaal.declarations.system.System) semanticObject); 
					return; 
				}
				else break;
			case SystemPackage.TEMPLATE_DECLARATION:
				if(context == grammarAccess.getTemplateDeclarationRule()) {
					sequence_TemplateDeclaration(context, (TemplateDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TemplatesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TemplatesPackage.EDGE:
				if(context == grammarAccess.getEdgeRule()) {
					sequence_Edge(context, (Edge) semanticObject); 
					return; 
				}
				else break;
			case TemplatesPackage.REDEFINED_TEMPLATE:
				if(context == grammarAccess.getRedefinedTemplateRule()) {
					sequence_RedefinedTemplate(context, (RedefinedTemplate) semanticObject); 
					return; 
				}
				else break;
			case TemplatesPackage.SELECTION:
				if(context == grammarAccess.getSelectionRule()) {
					sequence_Selection(context, (Selection) semanticObject); 
					return; 
				}
				else break;
			case TemplatesPackage.SYNCHRONIZATION:
				if(context == grammarAccess.getSynchronizationLabelRule()) {
					sequence_SynchronizationLabel(context, (Synchronization) semanticObject); 
					return; 
				}
				else break;
			case TemplatesPackage.TEMPLATE:
				if(context == grammarAccess.getTemplateRule()) {
					sequence_Template(context, (Template) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypesPackage.DECLARED_TYPE:
				if(context == grammarAccess.getDeclaredTypeRule()) {
					sequence_DeclaredType(context, (DeclaredType) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.INTEGER_BOUNDS:
				if(context == grammarAccess.getIntegerBoundsRule()) {
					sequence_IntegerBounds(context, (IntegerBounds) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.RANGE_TYPE_SPECIFICATION:
				if(context == grammarAccess.getRangeTypeSpecificationRule() ||
				   context == grammarAccess.getTypeExpressionRule()) {
					sequence_RangeTypeSpecification(context, (RangeTypeSpecification) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.SCALAR_TYPE_SPECIFICATION:
				if(context == grammarAccess.getScalarTypeSpecificationRule() ||
				   context == grammarAccess.getTypeExpressionRule()) {
					sequence_ScalarTypeSpecification(context, (ScalarTypeSpecification) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.STRUCT_TYPE_SPECIFICATION:
				if(context == grammarAccess.getStructTypeSpecificationRule() ||
				   context == grammarAccess.getTypeExpressionRule()) {
					sequence_StructTypeSpecification(context, (StructTypeSpecification) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == UppaalPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UppaalPackage.NTA:
				if(context == grammarAccess.getNTARule()) {
					sequence_NTA(context, (NTA) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == VisualsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VisualsPackage.POINT:
				if(context == grammarAccess.getPointRule()) {
					sequence_Point(context, (Point) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (firstExpr=ArithmeticExpression_PlusMinus_ArithmeticExpression_1_0 operator=ArithmeticOperator_PlusMinus secondExpr=ArithmeticExpression_Other) | 
	 *         (firstExpr=ArithmeticExpression_Other_ArithmeticExpression_1_0 operator=ArithmeticOperator_Other secondExpr=NegationExpression_Alternative)
	 *     )
	 */
	protected void sequence_ArithmeticExpression_Other_ArithmeticExpression_PlusMinus(EObject context, ArithmeticExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (initializer+=Initializer initializer+=Initializer*)
	 */
	protected void sequence_ArrayInitializer(EObject context, ArrayInitializer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (firstExpr=AssignmentExpression_AssignmentExpression_1_0 operator=AssignmentOperator secondExpr=ConditionExpression)
	 */
	protected void sequence_AssignmentExpression(EObject context, AssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.BINARY_EXPRESSION__FIRST_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.BINARY_EXPRESSION__FIRST_EXPR));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.BINARY_EXPRESSION__SECOND_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.BINARY_EXPRESSION__SECOND_EXPR));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION__OPERATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionFirstExprAction_1_0(), semanticObject.getFirstExpr());
		feeder.accept(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getAssignmentExpressionAccess().getSecondExprConditionExpressionParserRuleCall_1_2_0(), semanticObject.getSecondExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (firstExpr=BitShiftExpression_BitShiftExpression_1_0 operator=BitShiftOperator secondExpr=ArithmeticExpression_PlusMinus)
	 */
	protected void sequence_BitShiftExpression(EObject context, BitShiftExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.BINARY_EXPRESSION__FIRST_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.BINARY_EXPRESSION__FIRST_EXPR));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.BINARY_EXPRESSION__SECOND_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.BINARY_EXPRESSION__SECOND_EXPR));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.BIT_SHIFT_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.BIT_SHIFT_EXPRESSION__OPERATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBitShiftExpressionAccess().getBitShiftExpressionFirstExprAction_1_0(), semanticObject.getFirstExpr());
		feeder.accept(grammarAccess.getBitShiftExpressionAccess().getOperatorBitShiftOperatorEnumRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getBitShiftExpressionAccess().getSecondExprArithmeticExpression_PlusMinusParserRuleCall_1_2_0(), semanticObject.getSecondExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (firstExpr=BitwiseExpression_Xor_BitwiseExpression_1_0 operator=BitwiseOperator_Xor secondExpr=BitwiseExpression_And) | 
	 *         (firstExpr=BitwiseExpression_And_BitwiseExpression_1_0 operator=BitwiseOperator_And secondExpr=CompareExpression_EqualUnequal) | 
	 *         (firstExpr=BitwiseExpression_Or_BitwiseExpression_1_0 operator=BitwiseOperator_Or secondExpr=BitwiseExpression_Xor)
	 *     )
	 */
	protected void sequence_BitwiseExpression_And_BitwiseExpression_Or_BitwiseExpression_Xor(EObject context, BitwiseExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declaration+=BlockTypedDeclaration | declaration+=TypeDeclaration)+
	 */
	protected void sequence_BlockDeclarations(EObject context, LocalDeclarations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeDefinition=TypeExpression elements+=Variable elements+=Variable*)
	 */
	protected void sequence_BlockTypedDeclaration(EObject context, TypedDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declarations=BlockDeclarations? statement+=Statement*)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     channelExpression=IdentifierExpression
	 */
	protected void sequence_ChannelItem(EObject context, ChannelItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlobalPackage.Literals.CHANNEL_ITEM__CHANNEL_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlobalPackage.Literals.CHANNEL_ITEM__CHANNEL_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChannelItemAccess().getChannelExpressionIdentifierExpressionParserRuleCall_0(), semanticObject.getChannelExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (urgent=ChannelPrefixExpression_Urgent broadcast=ChannelPrefixExpression_Broadcast?) | 
	 *             (broadcast=ChannelPrefixExpression_Broadcast urgent=ChannelPrefixExpression_Urgent?)
	 *         ) 
	 *         channelType=[Type|CHAN_KEYWORD]
	 *     )
	 */
	protected void sequence_ChannelPrefixExpression(EObject context, ChannelPrefixExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (groups+=ChannelPriorityGroup groups+=ChannelPriorityGroup*)
	 */
	protected void sequence_ChannelPriorityDeclaration(EObject context, ChannelPriorityDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (items+=PriorityItem items+=PriorityItem*)
	 */
	protected void sequence_ChannelPriorityGroup(EObject context, ChannelPriorityGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (firstExpr=CompareExpression_EqualUnequal_CompareExpression_1_0 operator=CompareOperator_EqualUnequal secondExpr=CompareExpression_Other) | 
	 *         (firstExpr=CompareExpression_Other_CompareExpression_1_0 operator=CompareOperator_Other secondExpr=MinMaxExpression)
	 *     )
	 */
	protected void sequence_CompareExpression_EqualUnequal_CompareExpression_Other(EObject context, CompareExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifExpression=ConditionExpression_ConditionExpression_1_0 thenExpression=Expression elseExpression=LogicalExpression_OrAlternative)
	 */
	protected void sequence_ConditionExpression(EObject context, ConditionExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.CONDITION_EXPRESSION__IF_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.CONDITION_EXPRESSION__IF_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.CONDITION_EXPRESSION__THEN_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.CONDITION_EXPRESSION__THEN_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.CONDITION_EXPRESSION__ELSE_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.CONDITION_EXPRESSION__ELSE_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionExpressionAccess().getConditionExpressionIfExpressionAction_1_0(), semanticObject.getIfExpression());
		feeder.accept(grammarAccess.getConditionExpressionAccess().getThenExpressionExpressionParserRuleCall_1_2_0(), semanticObject.getThenExpression());
		feeder.accept(grammarAccess.getConditionExpressionAccess().getElseExpressionLogicalExpression_OrAlternativeParserRuleCall_1_4_0(), semanticObject.getElseExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         prefix=DataVariablePrefix 
	 *         (
	 *             dataTypeExpression=RangeTypeSpecification | 
	 *             dataTypeExpression=ScalarTypeSpecification | 
	 *             dataTypeExpression=StructTypeSpecification | 
	 *             dataTypeExpression=SimpleIdentifierExpression
	 *         )
	 *     )
	 */
	protected void sequence_DataPrefixExpression(EObject context, DataPrefixExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=UPPAAL_IDENTIFIER
	 */
	protected void sequence_DeclaredType(EObject context, DeclaredType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DefaultItem}
	 */
	protected void sequence_DefaultItem(EObject context, DefaultItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statement=Statement expression=Expression)
	 */
	protected void sequence_DoWhileLoop(EObject context, DoWhileLoop semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatementsPackage.Literals.DO_WHILE_LOOP__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatementsPackage.Literals.DO_WHILE_LOOP__STATEMENT));
			if(transientValues.isValueTransient(semanticObject, StatementsPackage.Literals.DO_WHILE_LOOP__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatementsPackage.Literals.DO_WHILE_LOOP__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoWhileLoopAccess().getStatementStatementParserRuleCall_1_0(), semanticObject.getStatement());
		feeder.accept(grammarAccess.getDoWhileLoopAccess().getExpressionExpressionParserRuleCall_4_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         colorCode=STRING? 
	 *         source=[Location|STRING] 
	 *         target=[Location|STRING] 
	 *         comment=CommentLabel? 
	 *         synchronization=SynchronizationLabel? 
	 *         guard=Expression? 
	 *         (update+=Expression update+=Expression*)? 
	 *         (selection+=Selection selection+=Selection*)? 
	 *         bendPoint+=Point*
	 *     )
	 */
	protected void sequence_Edge(EObject context, Edge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EmptyStatement}
	 */
	protected void sequence_EmptyStatement(EObject context, EmptyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_ExpressionInitializer(EObject context, ExpressionInitializer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionInitializerAccess().getExpressionExpressionParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_ExpressionStatement(EObject context, ExpressionStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatementsPackage.Literals.EXPRESSION_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatementsPackage.Literals.EXPRESSION_STATEMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionStatementAccess().getExpressionExpressionParserRuleCall_0_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (initialization=Expression condition=Expression iteration=Expression statement=Statement)
	 */
	protected void sequence_ForLoop(EObject context, ForLoop semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatementsPackage.Literals.FOR_LOOP__INITIALIZATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatementsPackage.Literals.FOR_LOOP__INITIALIZATION));
			if(transientValues.isValueTransient(semanticObject, StatementsPackage.Literals.FOR_LOOP__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatementsPackage.Literals.FOR_LOOP__CONDITION));
			if(transientValues.isValueTransient(semanticObject, StatementsPackage.Literals.FOR_LOOP__ITERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatementsPackage.Literals.FOR_LOOP__ITERATION));
			if(transientValues.isValueTransient(semanticObject, StatementsPackage.Literals.FOR_LOOP__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatementsPackage.Literals.FOR_LOOP__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForLoopAccess().getInitializationExpressionParserRuleCall_2_0(), semanticObject.getInitialization());
		feeder.accept(grammarAccess.getForLoopAccess().getConditionExpressionParserRuleCall_4_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getForLoopAccess().getIterationExpressionParserRuleCall_6_0(), semanticObject.getIteration());
		feeder.accept(grammarAccess.getForLoopAccess().getStatementStatementParserRuleCall_8_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (function=[Function|UPPAAL_IDENTIFIER] (argument+=Expression argument+=Expression*)?)
	 */
	protected void sequence_FunctionCallExpression(EObject context, FunctionCallExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UPPAAL_IDENTIFIER (parameter+=ParameterContainer parameter+=ParameterContainer*)? block=Block)
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((declaration+=TypedDeclaration | declaration+=TypeDeclaration | channelPriority=ChannelPriorityDeclaration)*)
	 */
	protected void sequence_GlobalDeclarations(EObject context, GlobalDeclarations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (identifier=[NamedElement|UPPAAL_TYPE_OR_IDENTIFIER] index+=Expression*)
	 */
	protected void sequence_IdentifierExpression(EObject context, IdentifierExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifExpression=Expression thenStatement=Statement elseStatement=Statement?)
	 */
	protected void sequence_IfStatement(EObject context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (template+=[AbstractTemplate|UPPAAL_IDENTIFIER] template+=[AbstractTemplate|UPPAAL_IDENTIFIER]*)
	 */
	protected void sequence_InstantiationList(EObject context, InstantiationList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lowerBound=Expression upperBound=Expression)
	 */
	protected void sequence_IntegerBounds(EObject context, IntegerBounds semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND));
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerBoundsAccess().getLowerBoundExpressionParserRuleCall_1_0(), semanticObject.getLowerBound());
		feeder.accept(grammarAccess.getIntegerBoundsAccess().getUpperBoundExpressionParserRuleCall_3_0(), semanticObject.getUpperBound());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=VariableNameOnly typeDefinition=TypeExpression statement=Statement)
	 */
	protected void sequence_Iteration(EObject context, Iteration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     text=LiteralExpressionText
	 */
	protected void sequence_LiteralExpression(EObject context, LiteralExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.LITERAL_EXPRESSION__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.LITERAL_EXPRESSION__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralExpressionAccess().getTextLiteralExpressionTextParserRuleCall_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((declaration+=TypedDeclaration | declaration+=TypeDeclaration)*)
	 */
	protected void sequence_LocalDeclarations(EObject context, LocalDeclarations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=STRING position=Point? colorCode=STRING? (name=ID? comment=CommentLabel? invariant=Expression? locationTimeKind=LocationKind?)?)
	 */
	protected void sequence_Location(EObject context, IdentifiableLocation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             firstExpr=LogicalExpression_OrAlternative_LogicalExpression_1_0 
	 *             operator=LogicalOperator_OrAlternative 
	 *             secondExpr=LogicalExpression_AndAlternative
	 *         ) | 
	 *         (firstExpr=LogicalExpression_AndAlternative_LogicalExpression_1_0 operator=LogicalOperator_AndAlternative secondExpr=BitwiseExpression_Or) | 
	 *         (firstExpr=LogicalExpression_And_LogicalExpression_1_0 operator=LogicalOperator_And secondExpr=NegationExpression) | 
	 *         (firstExpr=LogicalExpression_OrImply_LogicalExpression_1_0 operator=LogicalOperator_OrImply secondExpr=LogicalExpression_And)
	 *     )
	 */
	protected void sequence_LogicalExpression_And_LogicalExpression_AndAlternative_LogicalExpression_OrAlternative_LogicalExpression_OrImply(EObject context, LogicalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (firstExpr=MinMaxExpression_MinMaxExpression_1_0 operator=MinMaxOperator secondExpr=BitShiftExpression)
	 */
	protected void sequence_MinMaxExpression(EObject context, MinMaxExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.BINARY_EXPRESSION__FIRST_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.BINARY_EXPRESSION__FIRST_EXPR));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.BINARY_EXPRESSION__SECOND_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.BINARY_EXPRESSION__SECOND_EXPR));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.MIN_MAX_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.MIN_MAX_EXPRESSION__OPERATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMinMaxExpressionAccess().getMinMaxExpressionFirstExprAction_1_0(), semanticObject.getFirstExpr());
		feeder.accept(grammarAccess.getMinMaxExpressionAccess().getOperatorMinMaxOperatorEnumRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getMinMaxExpressionAccess().getSecondExprBitShiftExpressionParserRuleCall_1_2_0(), semanticObject.getSecondExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     invertedExpression=NegationExpression_Alternative
	 */
	protected void sequence_MinusExpression(EObject context, MinusExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.MINUS_EXPRESSION__INVERTED_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.MINUS_EXPRESSION__INVERTED_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMinusExpressionAccess().getInvertedExpressionNegationExpression_AlternativeParserRuleCall_0_2_0(), semanticObject.getInvertedExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (globalDeclarations=GlobalDeclarations? template+=Template+ systemDeclarations=SystemDeclarations)
	 */
	protected void sequence_NTA(EObject context, NTA semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (negatedExpression=AssignmentExpression | negatedExpression=NegationExpression_Alternative)
	 */
	protected void sequence_NegationExpression_NegationExpression_Alternative(EObject context, NegationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeDefinition=TypeExpression elements+=Parameter)
	 */
	protected void sequence_ParameterContainer(EObject context, ParameterContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (callType=CallType? name=UPPAAL_IDENTIFIER)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     confirmedExpression=NegationExpression_Alternative
	 */
	protected void sequence_PlusExpression(EObject context, PlusExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.PLUS_EXPRESSION__CONFIRMED_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.PLUS_EXPRESSION__CONFIRMED_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPlusExpressionAccess().getConfirmedExpressionNegationExpression_AlternativeParserRuleCall_0_2_0(), semanticObject.getConfirmedExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (x=QUOTED_INT? y=QUOTED_INT?)
	 */
	protected void sequence_Point(EObject context, Point semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=PostIncrementDecrementExpression_PostIncrementDecrementExpression_1_0_0 operator=IncrementDecrementOperator)
	 */
	protected void sequence_PostIncrementDecrementExpression(EObject context, PostIncrementDecrementExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.INCREMENT_DECREMENT_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.INCREMENT_DECREMENT_EXPRESSION__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.INCREMENT_DECREMENT_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.INCREMENT_DECREMENT_EXPRESSION__OPERATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPostIncrementDecrementExpressionAccess().getPostIncrementDecrementExpressionExpressionAction_1_0_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getPostIncrementDecrementExpressionAccess().getOperatorIncrementDecrementOperatorEnumRuleCall_1_0_1_0(), semanticObject.getOperator());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operator=IncrementDecrementOperator expression=PreIncrementDecrementExpression)
	 */
	protected void sequence_PreIncrementDecrementExpression(EObject context, PreIncrementDecrementExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.INCREMENT_DECREMENT_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.INCREMENT_DECREMENT_EXPRESSION__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.INCREMENT_DECREMENT_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.INCREMENT_DECREMENT_EXPRESSION__OPERATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPreIncrementDecrementExpressionAccess().getOperatorIncrementDecrementOperatorEnumRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getPreIncrementDecrementExpressionAccess().getExpressionPreIncrementDecrementExpressionParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression+=Expression+
	 */
	protected void sequence_ProgressMeasure(EObject context, ProgressMeasure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (quantifier=Quantifier elements+=VariableNameOnly typeDefinition=TypeExpression expression=LogicalExpression_OrImply)
	 */
	protected void sequence_QuantificationExpression(EObject context, QuantificationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     bounds=IntegerBounds
	 */
	protected void sequence_RangeTypeSpecification(EObject context, RangeTypeSpecification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.RANGE_TYPE_SPECIFICATION__BOUNDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.RANGE_TYPE_SPECIFICATION__BOUNDS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRangeTypeSpecificationAccess().getBoundsIntegerBoundsParserRuleCall_1_0(), semanticObject.getBounds());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=UPPAAL_IDENTIFIER referredTemplate=[AbstractTemplate|UPPAAL_IDENTIFIER])
	 */
	protected void sequence_RedefinedTemplate(EObject context, RedefinedTemplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (returnExpression=Expression?)
	 */
	protected void sequence_ReturnStatement(EObject context, ReturnStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sizeExpression=Expression
	 */
	protected void sequence_ScalarTypeSpecification(EObject context, ScalarTypeSpecification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.SCALAR_TYPE_SPECIFICATION__SIZE_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.SCALAR_TYPE_SPECIFICATION__SIZE_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScalarTypeSpecificationAccess().getSizeExpressionExpressionParserRuleCall_2_0(), semanticObject.getSizeExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (scope=ScopedIdentifierExpression_ScopedIdentifierExpression_1_0 identifier=IdentifierExpression)
	 */
	protected void sequence_ScopedIdentifierExpression(EObject context, ScopedIdentifierExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.SCOPED_IDENTIFIER_EXPRESSION__SCOPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.SCOPED_IDENTIFIER_EXPRESSION__SCOPE));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.SCOPED_IDENTIFIER_EXPRESSION__IDENTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.SCOPED_IDENTIFIER_EXPRESSION__IDENTIFIER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScopedIdentifierExpressionAccess().getScopedIdentifierExpressionScopeAction_1_0(), semanticObject.getScope());
		feeder.accept(grammarAccess.getScopedIdentifierExpressionAccess().getIdentifierIdentifierExpressionParserRuleCall_1_2_0(), semanticObject.getIdentifier());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         elements+=VariableNameOnly 
	 *         (typeDefinition=RangeTypeSpecification | typeDefinition=ScalarTypeSpecification | typeDefinition=SimpleIdentifierExpression)
	 *     )
	 */
	protected void sequence_Selection(EObject context, Selection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     identifier=[NamedElement|UPPAAL_TYPE_OR_IDENTIFIER]
	 */
	protected void sequence_SimpleIdentifierExpression(EObject context, IdentifierExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     declaration+=TypedElement+
	 */
	protected void sequence_StructTypeSpecification(EObject context, StructTypeSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (channelExpression=IdentifierExpression kind=SynchronizationKind)
	 */
	protected void sequence_SynchronizationLabel(EObject context, Synchronization semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TemplatesPackage.Literals.SYNCHRONIZATION__CHANNEL_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TemplatesPackage.Literals.SYNCHRONIZATION__CHANNEL_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, TemplatesPackage.Literals.SYNCHRONIZATION__KIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TemplatesPackage.Literals.SYNCHRONIZATION__KIND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSynchronizationLabelAccess().getChannelExpressionIdentifierExpressionParserRuleCall_0_0(), semanticObject.getChannelExpression());
		feeder.accept(grammarAccess.getSynchronizationLabelAccess().getKindSynchronizationKindEnumRuleCall_1_0(), semanticObject.getKind());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (declaration+=TypedDeclaration | declaration+=TypeDeclaration | declaration+=TemplateDeclaration | system=System | progressMeasure=ProgressMeasure)*
	 *     )
	 */
	protected void sequence_SystemDeclarations(EObject context, SystemDeclarations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (instantiationList+=InstantiationList instantiationList+=InstantiationList*)
	 */
	protected void sequence_System(EObject context, de.uni_paderborn.uppaal.declarations.system.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declaredTemplate=RedefinedTemplate (argument+=Expression argument+=Expression*)?)
	 */
	protected void sequence_TemplateDeclaration(EObject context, TemplateDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (parameter+=ParameterContainer parameter+=ParameterContainer*)? 
	 *         declarations=LocalDeclarations? 
	 *         location+=Location+ 
	 *         init=[Location|STRING] 
	 *         edge+=Edge*
	 *     )
	 */
	protected void sequence_Template(EObject context, Template semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeDefinition=TypeExpression type+=DeclaredType type+=DeclaredType*)
	 */
	protected void sequence_TypeDeclaration(EObject context, TypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeDefinition=TypeExpression (elements+=Function | (elements+=Variable elements+=Variable*)))
	 */
	protected void sequence_TypedDeclaration(EObject context, TypedDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeDefinition=TypeExpression elements+=Variable elements+=Variable*)
	 */
	protected void sequence_TypedElement(EObject context, TypedDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=UPPAAL_IDENTIFIER
	 */
	protected void sequence_VariableNameOnly(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UPPAAL_IDENTIFIER (index+=Expression | index+=ScalarTypeSpecification)* initializer=Initializer?)
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression statement=Statement)
	 */
	protected void sequence_WhileLoop(EObject context, WhileLoop semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatementsPackage.Literals.WHILE_LOOP__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatementsPackage.Literals.WHILE_LOOP__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, StatementsPackage.Literals.WHILE_LOOP__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatementsPackage.Literals.WHILE_LOOP__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhileLoopAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getWhileLoopAccess().getStatementStatementParserRuleCall_4_0(), semanticObject.getStatement());
		feeder.finish();
	}
}
