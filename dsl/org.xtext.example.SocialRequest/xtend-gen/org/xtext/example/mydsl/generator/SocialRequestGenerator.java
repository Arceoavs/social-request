/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterables;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.example.mydsl.socialRequest.Attribute;
import org.xtext.example.mydsl.socialRequest.DataType;
import org.xtext.example.mydsl.socialRequest.Entity;
import org.xtext.example.mydsl.socialRequest.EntityTypeReference;
import org.xtext.example.mydsl.socialRequest.Modifier;
import org.xtext.example.mydsl.socialRequest.Param;
import org.xtext.example.mydsl.socialRequest.Query;
import org.xtext.example.mydsl.socialRequest.Repository;
import org.xtext.example.mydsl.socialRequest.SQLQuery;
import org.xtext.example.mydsl.socialRequest.TypeReference;
import org.xtext.example.mydsl.socialRequest.Validation;
import org.xtext.example.mydsl.util.AttributeUtil;
import org.xtext.example.mydsl.util.QueryUtil;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SocialRequestGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
    for (final Entity entity : _filter) {
      String _string = this._iQualifiedNameProvider.getFullyQualifiedName(((EObject) entity)).toString("/");
      String _plus = (_string + ".java");
      fsa.generateFile(_plus, 
        this.compile(entity));
    }
    Iterable<Repository> _filter_1 = Iterables.<Repository>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Repository.class);
    for (final Repository repository : _filter_1) {
      String _string_1 = this._iQualifiedNameProvider.getFullyQualifiedName(((EObject) repository)).toString("/");
      String _plus_1 = (_string_1 + ".java");
      fsa.generateFile(_plus_1, 
        this.compile(repository));
    }
  }
  
  /**
   * ENTITY GENERATION
   */
  private CharSequence compile(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(((EObject) entity).eContainer());
      boolean _tripleNotEquals = (_fullyQualifiedName != null);
      if (_tripleNotEquals) {
        _builder.append("package ");
        QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(((EObject) entity).eContainer());
        _builder.append(_fullyQualifiedName_1);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    CharSequence _generateImports = this.generateImports(entity);
    _builder.append(_generateImports);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _name = entity.getName();
    _builder.append(_name);
    _builder.append(" implements ");
    {
      boolean _isHasUserDetails = entity.isHasUserDetails();
      if (_isHasUserDetails) {
        _builder.append("UserDetails");
      } else {
        _builder.append("Serializable");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private static final long serialVersionUID = 1L;");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Attribute> _attributes = entity.getAttributes();
      for(final Attribute attribute : _attributes) {
        _builder.append("\t");
        CharSequence _generateAttributeDeclaration = this.generateAttributeDeclaration(attribute);
        _builder.append(_generateAttributeDeclaration, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Attribute> _attributes_1 = entity.getAttributes();
      for(final Attribute attribute_1 : _attributes_1) {
        _builder.append("\t");
        CharSequence _generateGettersSetters = this.generateGettersSetters(attribute_1);
        _builder.append(_generateGettersSetters, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isHasUserDetails_1 = entity.isHasUserDetails();
      if (_isHasUserDetails_1) {
        _builder.append("\t");
        CharSequence _generateUserDetailsMethods = this.generateUserDetailsMethods();
        _builder.append(_generateUserDetailsMethods, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    CharSequence _generateToStringMethod = this.generateToStringMethod(entity);
    _builder.append(_generateToStringMethod, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateImports(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isHasUserDetails = entity.isHasUserDetails();
      if (_isHasUserDetails) {
        _builder.append("import org.springframework.security.core.GrantedAuthority;");
        _builder.newLine();
        _builder.append("import org.springframework.security.core.authority.SimpleGrantedAuthority;");
        _builder.newLine();
        _builder.append("import org.springframework.security.core.userdetails.UserDetails;");
        _builder.newLine();
        _builder.newLine();
        _builder.append("import java.util.Collection;");
        _builder.newLine();
        _builder.append("import java.util.Collections;");
        _builder.newLine();
      } else {
        _builder.append("import java.io.Serializable;");
        _builder.newLine();
      }
    }
    {
      final Function1<Attribute, Boolean> _function = (Attribute it) -> {
        return Boolean.valueOf(((it.getAssociation() != null) && it.getAssociation().endsWith("Many")));
      };
      boolean _isEmpty = IterableExtensions.isEmpty(IterableExtensions.<Attribute>filter(entity.getAttributes(), _function));
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("import java.util.HashSet;");
        _builder.newLine();
        _builder.append("import java.util.Set;");
        _builder.newLine();
      }
    }
    {
      final Function1<Attribute, Boolean> _function_1 = (Attribute it) -> {
        String _rawAttributeType = AttributeUtil.rawAttributeType(it);
        String _literal = DataType.DATE.getLiteral();
        return Boolean.valueOf((_rawAttributeType == _literal));
      };
      boolean _isEmpty_1 = IterableExtensions.isEmpty(IterableExtensions.<Attribute>filter(entity.getAttributes(), _function_1));
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("import java.util.Date;");
        _builder.newLine();
      }
    }
    _builder.append("import javax.persistence.*;");
    _builder.newLine();
    _builder.append("import javax.validation.constraints.*;");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateAttributeDeclaration(final Attribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Modifier _modifier = attribute.getModifier();
      boolean _tripleNotEquals = (_modifier != null);
      if (_tripleNotEquals) {
        CharSequence _generateAttributeModifier = this.generateAttributeModifier(attribute.getModifier());
        _builder.append(_generateAttributeModifier);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Validation> _validations = attribute.getValidations();
      for(final Validation validation : _validations) {
        String _generateValidation = this.generateValidation(validation);
        _builder.append(_generateValidation);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _association = attribute.getAssociation();
      boolean _tripleNotEquals_1 = (_association != null);
      if (_tripleNotEquals_1) {
        CharSequence _generateAssociationAnnotation = this.generateAssociationAnnotation(attribute);
        _builder.append(_generateAssociationAnnotation);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("private ");
    String _attributeType = AttributeUtil.attributeType(attribute);
    _builder.append(_attributeType);
    _builder.append(" ");
    String _name = attribute.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateGettersSetters(final Attribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((((Entity) ((EObject) attribute).eContainer()).isHasUserDetails() && ((attribute.getName() == "username") || (attribute.getName() == "password")))) {
        _builder.append("@Override");
        _builder.newLine();
      }
    }
    _builder.append("public ");
    String _attributeType = AttributeUtil.attributeType(attribute);
    _builder.append(_attributeType);
    _builder.append(" get");
    String _firstUpper = StringExtensions.toFirstUpper(attribute.getName());
    _builder.append(_firstUpper);
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("return ");
    String _name = attribute.getName();
    _builder.append(_name, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void set");
    String _firstUpper_1 = StringExtensions.toFirstUpper(attribute.getName());
    _builder.append(_firstUpper_1);
    _builder.append("(");
    String _attributeType_1 = AttributeUtil.attributeType(attribute);
    _builder.append(_attributeType_1);
    _builder.append(" ");
    String _name_1 = attribute.getName();
    _builder.append(_name_1);
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("this.");
    String _name_2 = attribute.getName();
    _builder.append(_name_2, "    ");
    _builder.append(" = ");
    String _name_3 = attribute.getName();
    _builder.append(_name_3, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    {
      if (((attribute.getAssociation() != null) && attribute.getAssociation().endsWith("Many"))) {
        _builder.newLine();
        _builder.append("public void add");
        String _rawAttributeType = AttributeUtil.rawAttributeType(attribute);
        _builder.append(_rawAttributeType);
        _builder.append("(");
        String _rawAttributeType_1 = AttributeUtil.rawAttributeType(attribute);
        _builder.append(_rawAttributeType_1);
        _builder.append(" ");
        String _firstLower = StringExtensions.toFirstLower(AttributeUtil.rawAttributeType(attribute));
        _builder.append(_firstLower);
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("if (");
        String _name_4 = attribute.getName();
        _builder.append(_name_4, "    ");
        _builder.append(" == null) {");
        _builder.newLineIfNotEmpty();
        _builder.append("      ");
        String _name_5 = attribute.getName();
        _builder.append(_name_5, "      ");
        _builder.append(" = new HashSet<>();");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        String _name_6 = attribute.getName();
        _builder.append(_name_6, "    ");
        _builder.append(".add(");
        String _firstLower_1 = StringExtensions.toFirstLower(AttributeUtil.rawAttributeType(attribute));
        _builder.append(_firstLower_1, "    ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  private String generateValidation(final Validation validation) {
    String _xifexpression = null;
    String _validator = validation.getValidator();
    boolean _tripleNotEquals = (_validator != null);
    if (_tripleNotEquals) {
      String _string = validation.getValidator().toString();
      _xifexpression = ("@" + _string);
    } else {
      String _xifexpression_1 = null;
      BigDecimal _min = validation.getMin();
      boolean _tripleNotEquals_1 = (_min != null);
      if (_tripleNotEquals_1) {
        BigDecimal _min_1 = validation.getMin();
        String _plus = ("@Min(" + _min_1);
        _xifexpression_1 = (_plus + ")");
      } else {
        String _xifexpression_2 = null;
        BigDecimal _max = validation.getMax();
        boolean _tripleNotEquals_2 = (_max != null);
        if (_tripleNotEquals_2) {
          BigDecimal _max_1 = validation.getMax();
          String _plus_1 = ("@Max(" + _max_1);
          _xifexpression_2 = (_plus_1 + ")");
        } else {
          String _xifexpression_3 = null;
          String _regex = validation.getRegex();
          boolean _tripleNotEquals_3 = (_regex != null);
          if (_tripleNotEquals_3) {
            String _regex_1 = validation.getRegex();
            String _plus_2 = ("@Pattern(regexp = \"" + _regex_1);
            _xifexpression_3 = (_plus_2 + "\")");
          } else {
            String _xifexpression_4 = null;
            boolean _isUnique = validation.isUnique();
            if (_isUnique) {
              _xifexpression_4 = "@Column(unique = true)";
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private CharSequence generateAssociationAnnotation(final Attribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((attribute.getMappedBy() == null) && (attribute.getFetchType() == null))) {
        _builder.append("@");
        String _association = attribute.getAssociation();
        _builder.append(_association);
        _builder.newLineIfNotEmpty();
      } else {
        if (((attribute.getMappedBy() != null) && (attribute.getFetchType() != null))) {
          _builder.append("@");
          String _association_1 = attribute.getAssociation();
          _builder.append(_association_1);
          _builder.append("(mappedBy = \"");
          String _mappedBy = attribute.getMappedBy();
          _builder.append(_mappedBy);
          _builder.append("\", fetch = FetchType.");
          String _fetchType = attribute.getFetchType();
          _builder.append(_fetchType);
          _builder.append(")");
          _builder.newLineIfNotEmpty();
        } else {
          if (((attribute.getMappedBy() != null) && (attribute.getFetchType() == null))) {
            _builder.append("@");
            String _association_2 = attribute.getAssociation();
            _builder.append(_association_2);
            _builder.append("(mappedBy = \"");
            String _mappedBy_1 = attribute.getMappedBy();
            _builder.append(_mappedBy_1);
            _builder.append("\")");
            _builder.newLineIfNotEmpty();
          } else {
            if (((attribute.getMappedBy() == null) && (attribute.getFetchType() != null))) {
              _builder.append("@");
              String _association_3 = attribute.getAssociation();
              _builder.append(_association_3);
              _builder.append("(fetch = FetchType.");
              String _fetchType_1 = attribute.getFetchType();
              _builder.append(_fetchType_1);
              _builder.append(")");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence generateAttributeModifier(final Modifier modifier) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isIsID = modifier.isIsID();
      if (_isIsID) {
        _builder.append("@Id");
        _builder.newLine();
        {
          String _iDGenerationType = modifier.getIDGenerationType();
          boolean _tripleNotEquals = (_iDGenerationType != null);
          if (_tripleNotEquals) {
            _builder.append("@GeneratedValue(GenerationType.");
            String _iDGenerationType_1 = modifier.getIDGenerationType();
            _builder.append(_iDGenerationType_1);
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        boolean _isIsLOB = modifier.isIsLOB();
        if (_isIsLOB) {
          _builder.append("@Lob");
          _builder.newLine();
        } else {
          boolean _isIsTransient = modifier.isIsTransient();
          if (_isIsTransient) {
            _builder.append("@Transient");
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence generateUserDetailsMethods() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public Collection<? extends GrantedAuthority> getAuthorities() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return Collections.singletonList(new SimpleGrantedAuthority(\"ROLE_USER\"));");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public boolean isAccountNonExpired() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public boolean isAccountNonLocked() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public boolean isCredentialsNonExpired() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public boolean isEnabled() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateToStringMethod(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return (");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"");
    String _name = entity.getName();
    _builder.append(_name, "\t\t");
    _builder.append("{\" +");
    _builder.newLineIfNotEmpty();
    {
      final Function1<Attribute, Boolean> _function = (Attribute it) -> {
        return Boolean.valueOf(((it.getAssociation() == null) && ((it.getModifier() == null) || (!it.getModifier().isIsTransient()))));
      };
      Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(entity.getAttributes(), _function);
      for(final Attribute attribute : _filter) {
        _builder.append("\t\t");
        _builder.append("\"");
        String _name_1 = attribute.getName();
        _builder.append(_name_1, "\t\t");
        _builder.append("=\'\" + ");
        String _name_2 = attribute.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append(" + \'\\\'\' +");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("\'}\'");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(");");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * REPOSITORY GENERATION
   */
  private CharSequence compile(final Repository repository) {
    StringConcatenation _builder = new StringConcatenation();
    {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(((EObject) repository).eContainer());
      boolean _tripleNotEquals = (_fullyQualifiedName != null);
      if (_tripleNotEquals) {
        _builder.append("package ");
        QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(((EObject) repository).eContainer());
        _builder.append(_fullyQualifiedName_1);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    CharSequence _generateImports = this.generateImports(repository);
    _builder.append(_generateImports);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface RequestRepository extends JpaRepository<Request, Long> {");
    _builder.newLine();
    {
      EList<Query> _queries = repository.getQueries();
      for(final Query query : _queries) {
        _builder.append("\t");
        CharSequence _compile = this.compile(query);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateImports(final Repository repository) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import org.springframework.data.jpa.repository.JpaRepository;");
    _builder.newLine();
    {
      final Function1<Query, Boolean> _function = (Query it) -> {
        SQLQuery _sqlQuery = it.getSqlQuery();
        return Boolean.valueOf((_sqlQuery != null));
      };
      boolean _isEmpty = IterableExtensions.isEmpty(IterableExtensions.<Query>filter(repository.getQueries(), _function));
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("import org.springframework.data.jpa.repository.Query;");
        _builder.newLine();
      }
    }
    {
      final Function1<Query, Boolean> _function_1 = (Query it) -> {
        EList<Param> _params = it.getParams();
        return Boolean.valueOf((_params != null));
      };
      boolean _isEmpty_1 = IterableExtensions.isEmpty(IterableExtensions.<Query>filter(repository.getQueries(), _function_1));
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("import org.springframework.data.repository.query.Param;");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      final Function1<Query, Boolean> _function_2 = (Query it) -> {
        return Boolean.valueOf(it.isReturnsList());
      };
      boolean _isEmpty_2 = IterableExtensions.isEmpty(IterableExtensions.<Query>filter(repository.getQueries(), _function_2));
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("import java.util.List;");
        _builder.newLine();
      }
    }
    {
      final Function1<Param, Boolean> _function_3 = (Param it) -> {
        String _rawAttributeType = AttributeUtil.rawAttributeType(it);
        String _literal = DataType.DATE.getLiteral();
        return Boolean.valueOf((_rawAttributeType == _literal));
      };
      boolean _isEmpty_3 = IterableExtensions.isEmpty(IterableExtensions.<Param>filter(this.getQueryParams(repository), _function_3));
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.append("import java.util.Date;");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      Entity _entity = repository.getEntity();
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(((EObject) _entity).eContainer());
      boolean _tripleNotEquals = (_fullyQualifiedName != null);
      if (_tripleNotEquals) {
        _builder.append("import ");
        Entity _entity_1 = repository.getEntity();
        QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(((EObject) _entity_1).eContainer());
        _builder.append(_fullyQualifiedName_1);
        _builder.append(".");
        String _name = repository.getEntity().getName();
        _builder.append(_name);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      final Function1<Param, Boolean> _function_4 = (Param it) -> {
        TypeReference _type = it.getType();
        return Boolean.valueOf((_type instanceof EntityTypeReference));
      };
      boolean _isEmpty_4 = IterableExtensions.isEmpty(IterableExtensions.<Param>filter(this.getQueryParams(repository), _function_4));
      boolean _not_4 = (!_isEmpty_4);
      if (_not_4) {
        {
          HashSet<Entity> _uniqueEntityTypesFromParams = this.getUniqueEntityTypesFromParams(repository);
          for(final Entity entity : _uniqueEntityTypesFromParams) {
            {
              QualifiedName _fullyQualifiedName_2 = this._iQualifiedNameProvider.getFullyQualifiedName(((EObject) entity).eContainer());
              boolean _tripleNotEquals_1 = (_fullyQualifiedName_2 != null);
              if (_tripleNotEquals_1) {
                _builder.append("import ");
                QualifiedName _fullyQualifiedName_3 = this._iQualifiedNameProvider.getFullyQualifiedName(((EObject) entity).eContainer());
                _builder.append(_fullyQualifiedName_3);
                _builder.append(".");
                String _name_1 = entity.getName();
                _builder.append(_name_1);
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence compile(final Query query) {
    StringConcatenation _builder = new StringConcatenation();
    {
      SQLQuery _sqlQuery = query.getSqlQuery();
      boolean _tripleNotEquals = (_sqlQuery != null);
      if (_tripleNotEquals) {
        CharSequence _generateJpqlQuery = this.generateJpqlQuery(query.getSqlQuery());
        _builder.append(_generateJpqlQuery);
        _builder.newLineIfNotEmpty();
      }
    }
    String _returnType = this.getReturnType(query);
    _builder.append(_returnType);
    _builder.append(" ");
    String _name = query.getName();
    _builder.append(_name);
    _builder.append("(");
    String _generateParams = this.generateParams(query);
    _builder.append(_generateParams);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateJpqlQuery(final SQLQuery sqlQuery) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Query(");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateJPQL = QueryUtil.generateJPQL(sqlQuery);
    _builder.append(_generateJPQL, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }
  
  private Iterable<Param> getQueryParams(final Repository repository) {
    final Function1<Query, EList<Param>> _function = (Query it) -> {
      return it.getParams();
    };
    final Function1<EList<Param>, Boolean> _function_1 = (EList<Param> it) -> {
      return Boolean.valueOf((it != null));
    };
    return Iterables.<Param>concat(IterableExtensions.<EList<Param>>filter(ListExtensions.<Query, EList<Param>>map(repository.getQueries(), _function), _function_1));
  }
  
  private HashSet<Entity> getUniqueEntityTypesFromParams(final Repository repository) {
    HashSet<Entity> _xblockexpression = null;
    {
      final Function1<Param, Boolean> _function = (Param it) -> {
        TypeReference _type = it.getType();
        return Boolean.valueOf((_type instanceof EntityTypeReference));
      };
      final Function1<Param, Entity> _function_1 = (Param it) -> {
        TypeReference _type = it.getType();
        return ((EntityTypeReference) _type).getType();
      };
      Entity[] entitiesFromParams = ((Entity[])Conversions.unwrapArray(IterableExtensions.<Param, Entity>map(IterableExtensions.<Param>filter(this.getQueryParams(repository), _function), _function_1), Entity.class));
      final Entity[] _converted_entitiesFromParams = (Entity[])entitiesFromParams;
      _xblockexpression = new HashSet<Entity>((Collection<? extends Entity>)Conversions.doWrapArray(_converted_entitiesFromParams));
    }
    return _xblockexpression;
  }
  
  private String getReturnType(final Query query) {
    String _xifexpression = null;
    boolean _isReturnsList = query.isReturnsList();
    if (_isReturnsList) {
      EObject _eContainer = ((EObject) query).eContainer();
      String _name = ((Repository) _eContainer).getEntity().getName();
      String _plus = ("List<" + _name);
      _xifexpression = (_plus + ">");
    } else {
      String _xifexpression_1 = null;
      boolean _isReturnsBoolean = query.isReturnsBoolean();
      if (_isReturnsBoolean) {
        _xifexpression_1 = "boolean";
      } else {
        EObject _eContainer_1 = ((EObject) query).eContainer();
        _xifexpression_1 = ((Repository) _eContainer_1).getEntity().getName();
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private String generateParams(final Query query) {
    String _xblockexpression = null;
    {
      EList<Param> _params = query.getParams();
      boolean _tripleEquals = (_params == null);
      if (_tripleEquals) {
        return "";
      }
      final Function1<Param, String> _function = (Param param) -> {
        String _xblockexpression_1 = null;
        {
          StringConcatenation _builder = new StringConcatenation();
          String _rawAttributeType = AttributeUtil.rawAttributeType(param);
          _builder.append(_rawAttributeType);
          _builder.append(" ");
          String _name = param.getName();
          _builder.append(_name);
          String paramDeclaration = _builder.toString();
          String _xifexpression = null;
          SQLQuery _sqlQuery = query.getSqlQuery();
          boolean _tripleEquals_1 = (_sqlQuery == null);
          if (_tripleEquals_1) {
            _xifexpression = paramDeclaration;
          } else {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("@Param(\"");
            String _name_1 = param.getName();
            _builder_1.append(_name_1);
            _builder_1.append("\") ");
            _builder_1.append(paramDeclaration);
            _xifexpression = _builder_1.toString();
          }
          _xblockexpression_1 = _xifexpression;
        }
        return _xblockexpression_1;
      };
      _xblockexpression = IterableExtensions.join(ListExtensions.<Param, String>map(query.getParams(), _function), ", ");
    }
    return _xblockexpression;
  }
}
