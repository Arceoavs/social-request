/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.socialRequest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Join#getJoinType <em>Join Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Join#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Join#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Join#getJoinCondition <em>Join Condition</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends EObject
{
  /**
   * Returns the value of the '<em><b>Join Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.socialRequest.JoinType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Type</em>' attribute.
   * @see org.xtext.example.mydsl.socialRequest.JoinType
   * @see #setJoinType(JoinType)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getJoin_JoinType()
   * @model
   * @generated
   */
  JoinType getJoinType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Join#getJoinType <em>Join Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Type</em>' attribute.
   * @see org.xtext.example.mydsl.socialRequest.JoinType
   * @see #getJoinType()
   * @generated
   */
  void setJoinType(JoinType value);

  /**
   * Returns the value of the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' reference.
   * @see #setEntity(Entity)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getJoin_Entity()
   * @model
   * @generated
   */
  Entity getEntity();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Join#getEntity <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Entity value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' attribute.
   * @see #setAlias(String)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getJoin_Alias()
   * @model
   * @generated
   */
  String getAlias();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Join#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' attribute.
   * @see #getAlias()
   * @generated
   */
  void setAlias(String value);

  /**
   * Returns the value of the '<em><b>Join Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Condition</em>' attribute.
   * @see #setJoinCondition(String)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getJoin_JoinCondition()
   * @model
   * @generated
   */
  String getJoinCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Join#getJoinCondition <em>Join Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Condition</em>' attribute.
   * @see #getJoinCondition()
   * @generated
   */
  void setJoinCondition(String value);

} // Join
