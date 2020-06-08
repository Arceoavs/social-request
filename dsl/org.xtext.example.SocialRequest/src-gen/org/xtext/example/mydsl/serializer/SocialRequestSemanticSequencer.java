/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.SocialRequestGrammarAccess;
import org.xtext.example.mydsl.socialRequest.Attribute;
import org.xtext.example.mydsl.socialRequest.DataTypeReference;
import org.xtext.example.mydsl.socialRequest.Entity;
import org.xtext.example.mydsl.socialRequest.EntityTypeReference;
import org.xtext.example.mydsl.socialRequest.From;
import org.xtext.example.mydsl.socialRequest.Join;
import org.xtext.example.mydsl.socialRequest.Model;
import org.xtext.example.mydsl.socialRequest.Modifier;
import org.xtext.example.mydsl.socialRequest.Order;
import org.xtext.example.mydsl.socialRequest.Param;
import org.xtext.example.mydsl.socialRequest.Query;
import org.xtext.example.mydsl.socialRequest.Repository;
import org.xtext.example.mydsl.socialRequest.SQLQuery;
import org.xtext.example.mydsl.socialRequest.Select;
import org.xtext.example.mydsl.socialRequest.SocialRequestPackage;
import org.xtext.example.mydsl.socialRequest.Validation;
import org.xtext.example.mydsl.socialRequest.Where;

@SuppressWarnings("all")
public class SocialRequestSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SocialRequestGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SocialRequestPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SocialRequestPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case SocialRequestPackage.DATA_TYPE_REFERENCE:
				sequence_DataTypeReference(context, (DataTypeReference) semanticObject); 
				return; 
			case SocialRequestPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case SocialRequestPackage.ENTITY_TYPE_REFERENCE:
				sequence_EntityTypeReference(context, (EntityTypeReference) semanticObject); 
				return; 
			case SocialRequestPackage.FROM:
				sequence_From(context, (From) semanticObject); 
				return; 
			case SocialRequestPackage.JOIN:
				sequence_Join(context, (Join) semanticObject); 
				return; 
			case SocialRequestPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case SocialRequestPackage.MODIFIER:
				sequence_Modifier(context, (Modifier) semanticObject); 
				return; 
			case SocialRequestPackage.ORDER:
				sequence_Order(context, (Order) semanticObject); 
				return; 
			case SocialRequestPackage.PARAM:
				sequence_Param(context, (Param) semanticObject); 
				return; 
			case SocialRequestPackage.QUERY:
				sequence_Query(context, (Query) semanticObject); 
				return; 
			case SocialRequestPackage.REPOSITORY:
				sequence_Repository(context, (Repository) semanticObject); 
				return; 
			case SocialRequestPackage.SQL_QUERY:
				sequence_SQLQuery(context, (SQLQuery) semanticObject); 
				return; 
			case SocialRequestPackage.SELECT:
				sequence_Select(context, (Select) semanticObject); 
				return; 
			case SocialRequestPackage.VALIDATION:
				sequence_Validation(context, (Validation) semanticObject); 
				return; 
			case SocialRequestPackage.WHERE:
				sequence_Where(context, (Where) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (association=ASSOCIATION? name=ID typeRef=TypeReference modifier=Modifier? (mappedBy=ID | fetchType=FETCHTYPE | validations+=Validation)*)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeReference returns DataTypeReference
	 *     DataTypeReference returns DataTypeReference
	 *
	 * Constraint:
	 *     type=DataType
	 */
	protected void sequence_DataTypeReference(ISerializationContext context, DataTypeReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SocialRequestPackage.Literals.DATA_TYPE_REFERENCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SocialRequestPackage.Literals.DATA_TYPE_REFERENCE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataTypeReferenceAccess().getTypeDataTypeEnumRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeReference returns EntityTypeReference
	 *     EntityTypeReference returns EntityTypeReference
	 *
	 * Constraint:
	 *     type=[Entity|ID]
	 */
	protected void sequence_EntityTypeReference(ISerializationContext context, EntityTypeReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SocialRequestPackage.Literals.ENTITY_TYPE_REFERENCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SocialRequestPackage.Literals.ENTITY_TYPE_REFERENCE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityTypeReferenceAccess().getTypeEntityIDTerminalRuleCall_0_1(), semanticObject.eGet(SocialRequestPackage.Literals.ENTITY_TYPE_REFERENCE__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID hasUserDetails='implements'? attributes+=Attribute+)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     From returns From
	 *
	 * Constraint:
	 *     (entity=[Entity|ID] alias=ID)
	 */
	protected void sequence_From(ISerializationContext context, From semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SocialRequestPackage.Literals.FROM__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SocialRequestPackage.Literals.FROM__ENTITY));
			if (transientValues.isValueTransient(semanticObject, SocialRequestPackage.Literals.FROM__ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SocialRequestPackage.Literals.FROM__ALIAS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFromAccess().getEntityEntityIDTerminalRuleCall_2_0_1(), semanticObject.eGet(SocialRequestPackage.Literals.FROM__ENTITY, false));
		feeder.accept(grammarAccess.getFromAccess().getAliasIDTerminalRuleCall_3_0(), semanticObject.getAlias());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Join returns Join
	 *
	 * Constraint:
	 *     (joinType=JoinType entity=[Entity|ID] alias=ID joinCondition=STRING?)
	 */
	protected void sequence_Join(ISerializationContext context, Join semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     ((entities+=Entity+ repositories+=Repository+) | repositories+=Repository+)?
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Modifier returns Modifier
	 *
	 * Constraint:
	 *     (isLOB?='LOB' | isTransient?='TRANSIENT' | (isID?='ID' IDGenerationType=GENERATIONTYPE?))
	 */
	protected void sequence_Modifier(ISerializationContext context, Modifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Order returns Order
	 *
	 * Constraint:
	 *     order=STRING
	 */
	protected void sequence_Order(ISerializationContext context, Order semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SocialRequestPackage.Literals.ORDER__ORDER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SocialRequestPackage.Literals.ORDER__ORDER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrderAccess().getOrderSTRINGTerminalRuleCall_2_0(), semanticObject.getOrder());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Param returns Param
	 *
	 * Constraint:
	 *     (name=ID type=TypeReference)
	 */
	protected void sequence_Param(ISerializationContext context, Param semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SocialRequestPackage.Literals.PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SocialRequestPackage.Literals.PARAM__NAME));
			if (transientValues.isValueTransient(semanticObject, SocialRequestPackage.Literals.PARAM__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SocialRequestPackage.Literals.PARAM__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParamAccess().getTypeTypeReferenceParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Query returns Query
	 *
	 * Constraint:
	 *     (name=ID isList?=':'? params+=Param* sqlQuery=SQLQuery?)
	 */
	protected void sequence_Query(ISerializationContext context, Query semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Repository returns Repository
	 *
	 * Constraint:
	 *     (entity=[Entity|ID] queries+=Query+)
	 */
	protected void sequence_Repository(ISerializationContext context, Repository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SQLQuery returns SQLQuery
	 *
	 * Constraint:
	 *     (select=Select from=From joins+=Join* where=Where? order=Order?)
	 */
	protected void sequence_SQLQuery(ISerializationContext context, SQLQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Select returns Select
	 *
	 * Constraint:
	 *     (isDistinct?='DISTINCT'? clause=STRING)
	 */
	protected void sequence_Select(ISerializationContext context, Select semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Validation returns Validation
	 *
	 * Constraint:
	 *     (min=POSSIBLY_SIGNED_INT | max=POSSIBLY_SIGNED_INT | regex=STRING | validator=BASICVALIDATION | unique?='unique')
	 */
	protected void sequence_Validation(ISerializationContext context, Validation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Where returns Where
	 *
	 * Constraint:
	 *     condition=STRING
	 */
	protected void sequence_Where(ISerializationContext context, Where semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SocialRequestPackage.Literals.WHERE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SocialRequestPackage.Literals.WHERE__CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhereAccess().getConditionSTRINGTerminalRuleCall_2_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
}
