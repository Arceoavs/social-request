/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.socialRequest.Entity
import org.xtext.example.mydsl.socialRequest.Repository
import org.xtext.example.mydsl.socialRequest.Attribute
import org.xtext.example.mydsl.socialRequest.AssociationSpecification

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SocialRequestGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
	
		for(entity : resource.allContents.toIterable.filter(Entity)) {
			fsa.generateFile(entity.name+".java", generateEntity(entity))
		}
		
		for(repo : resource.allContents.toIterable.filter(Repository)) {
			fsa.generateFile(repo.entity.name+".java", generateQuery(repo))
		}
	}
	
	private def generateEntity(Entity e){
		var CharSequence output = generateImports(e)
		for(attr : e.attributes){
			output = output + generateAttribute(attr).toString	
		}
		return output
	}
	
	private def generateImports(Entity e)'''
		package ????
		import javax.persistence.Entity;
		�FOR attr : e.attributes �
			�IF attr.modifier == "LOB"�
				import javax.persistence.Lob;
			�ENDIF�
			�IF attr.modifier == "LOB"�
				import javax.persistence.Id;
			�ENDIF�
			�IF attr.association != null�
				import import javax.persistence.�attr.association�;
			�ENDIF�
		�ENDFOR�
		TODO: does not work like that, how we check if already imported
	'''
	
	private def generateAttribute(Attribute a){
		if(a.association == null){
			
		}
		else{
			generateAssociationAttribute(a);
		}
	}
	
	private def generateAssociationAttribute(Attribute a)'''
		�IF a.mappedBy == null && a.fetchType == null�
			@�a.association�
		�ELSEIF a.mappedBy != null && a.fetchType != null�
			@�a.association�(mappedBy = �a.mappedBy�, fetch = �a.fetchType�)
		�ELSEIF a.mappedBy != null && a.fetchType == null�
			@�a.association�(mappedBy = �a.mappedBy�)
		�ELSEIF a.mappedBy == null && a.fetchType != null�
			@�a.association�(mappedBy = �a.fetchType�)
		�ENDIF�
		private �a.type�  �a.name�;
	'''
	
	private def generateQuery(Repository r)'''
	
	'''
}
