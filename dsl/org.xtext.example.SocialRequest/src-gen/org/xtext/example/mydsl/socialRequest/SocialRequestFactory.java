/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.socialRequest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage
 * @generated
 */
public interface SocialRequestFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SocialRequestFactory eINSTANCE = org.xtext.example.mydsl.socialRequest.impl.SocialRequestFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Element</em>'.
   * @generated
   */
  AbstractElement createAbstractElement();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Reference</em>'.
   * @generated
   */
  TypeReference createTypeReference();

  /**
   * Returns a new object of class '<em>Entity Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Type Reference</em>'.
   * @generated
   */
  EntityTypeReference createEntityTypeReference();

  /**
   * Returns a new object of class '<em>Data Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Reference</em>'.
   * @generated
   */
  DataTypeReference createDataTypeReference();

  /**
   * Returns a new object of class '<em>Modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modifier</em>'.
   * @generated
   */
  Modifier createModifier();

  /**
   * Returns a new object of class '<em>Validation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Validation</em>'.
   * @generated
   */
  Validation createValidation();

  /**
   * Returns a new object of class '<em>Repository</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repository</em>'.
   * @generated
   */
  Repository createRepository();

  /**
   * Returns a new object of class '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query</em>'.
   * @generated
   */
  Query createQuery();

  /**
   * Returns a new object of class '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param</em>'.
   * @generated
   */
  Param createParam();

  /**
   * Returns a new object of class '<em>SQL Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SQL Query</em>'.
   * @generated
   */
  SQLQuery createSQLQuery();

  /**
   * Returns a new object of class '<em>Select</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select</em>'.
   * @generated
   */
  Select createSelect();

  /**
   * Returns a new object of class '<em>From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From</em>'.
   * @generated
   */
  From createFrom();

  /**
   * Returns a new object of class '<em>Join</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join</em>'.
   * @generated
   */
  Join createJoin();

  /**
   * Returns a new object of class '<em>Where</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Where</em>'.
   * @generated
   */
  Where createWhere();

  /**
   * Returns a new object of class '<em>Order</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Order</em>'.
   * @generated
   */
  Order createOrder();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SocialRequestPackage getSocialRequestPackage();

} //SocialRequestFactory
