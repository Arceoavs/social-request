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
	protected AbstractElementAlias match_Attribute___RightCurlyBracketKeyword_5_1_2_3_ValidationsKeyword_5_1_2_0_LeftCurlyBracketKeyword_5_1_2_1__q;
	protected AbstractElementAlias match_Query___LeftCurlyBracketKeyword_3_0___ParamsKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__q_RightCurlyBracketKeyword_3_3__q;
	protected AbstractElementAlias match_Query___ParamsKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SocialRequestGrammarAccess) access;
		match_Attribute___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2()));
		match_Attribute___RightCurlyBracketKeyword_5_1_2_3_ValidationsKeyword_5_1_2_0_LeftCurlyBracketKeyword_5_1_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_1_2_3()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getValidationsKeyword_5_1_2_0()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_1_2_1()));
		match_Query___LeftCurlyBracketKeyword_3_0___ParamsKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__q_RightCurlyBracketKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getQueryAccess().getParamsKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_1_1()), new TokenAlias(false, false, grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_1_3())), new TokenAlias(false, false, grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_3()));
		match_Query___ParamsKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getQueryAccess().getParamsKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_1_1()), new TokenAlias(false, false, grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_1_3()));
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
			else if (match_Attribute___RightCurlyBracketKeyword_5_1_2_3_ValidationsKeyword_5_1_2_0_LeftCurlyBracketKeyword_5_1_2_1__q.equals(syntax))
				emit_Attribute___RightCurlyBracketKeyword_5_1_2_3_ValidationsKeyword_5_1_2_0_LeftCurlyBracketKeyword_5_1_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Query___LeftCurlyBracketKeyword_3_0___ParamsKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__q_RightCurlyBracketKeyword_3_3__q.equals(syntax))
				emit_Query___LeftCurlyBracketKeyword_3_0___ParamsKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__q_RightCurlyBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Query___ParamsKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__q.equals(syntax))
				emit_Query___ParamsKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     modifier=Modifier (ambiguity) (rule end)
	 *     typeRef=TypeReference (ambiguity) (rule end)
	 */
	protected void emit_Attribute___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('}' 'validations' '{')?
	 *
	 * This ambiguous syntax occurs at:
	 *     validations+=Validation (ambiguity) validations+=Validation
	 */
	protected void emit_Attribute___RightCurlyBracketKeyword_5_1_2_3_ValidationsKeyword_5_1_2_0_LeftCurlyBracketKeyword_5_1_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' ('params' '{' '}')? '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 *     returnsBoolean?=':' 'boolean' (ambiguity) (rule end)
	 *     returnsList?=':' 'list' (ambiguity) (rule end)
	 */
	protected void emit_Query___LeftCurlyBracketKeyword_3_0___ParamsKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__q_RightCurlyBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('params' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID '{' (ambiguity) sqlQuery=SQLQuery
	 *     returnsBoolean?=':' 'boolean' '{' (ambiguity) sqlQuery=SQLQuery
	 *     returnsList?=':' 'list' '{' (ambiguity) sqlQuery=SQLQuery
	 */
	protected void emit_Query___ParamsKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_RightCurlyBracketKeyword_3_1_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
