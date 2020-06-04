/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.SocialRequestGrammarAccess;

@SuppressWarnings("all")
public class SocialRequestSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SocialRequestGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Attribute___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q;
	protected AbstractElementAlias match_Attribute___RightCurlyBracketKeyword_5_1_1_2_ValidationsKeyword_5_1_1_0__q;
	protected AbstractElementAlias match_Validation_NotBlankKeyword_4_1_or_NotNullKeyword_3_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SocialRequestGrammarAccess) access;
		match_Attribute___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2()));
		match_Attribute___RightCurlyBracketKeyword_5_1_1_2_ValidationsKeyword_5_1_1_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_1_1_2()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getValidationsKeyword_5_1_1_0()));
		match_Validation_NotBlankKeyword_4_1_or_NotNullKeyword_3_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getValidationAccess().getNotBlankKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getValidationAccess().getNotNullKeyword_3_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Attribute___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q.equals(syntax))
				emit_Attribute___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Attribute___RightCurlyBracketKeyword_5_1_1_2_ValidationsKeyword_5_1_1_0__q.equals(syntax))
				emit_Attribute___RightCurlyBracketKeyword_5_1_1_2_ValidationsKeyword_5_1_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Validation_NotBlankKeyword_4_1_or_NotNullKeyword_3_1.equals(syntax))
				emit_Validation_NotBlankKeyword_4_1_or_NotNullKeyword_3_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     modifier=Modifier (ambiguity) (rule end)
	 *     type=[Entity|DATA_TYPE] (ambiguity) (rule end)
	 */
	protected void emit_Attribute___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('}' 'validations {')?
	 *
	 * This ambiguous syntax occurs at:
	 *     validations+=Validation (ambiguity) validations+=Validation
	 */
	protected void emit_Attribute___RightCurlyBracketKeyword_5_1_1_2_ValidationsKeyword_5_1_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'not-null' | 'not-blank'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Validation_NotBlankKeyword_4_1_or_NotNullKeyword_3_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}