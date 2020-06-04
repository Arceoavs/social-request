/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.socialRequest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.AssociationSpecification#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.AssociationSpecification#getFetchType <em>Fetch Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getAssociationSpecification()
 * @model
 * @generated
 */
public interface AssociationSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped By</em>' attribute.
   * @see #setMappedBy(String)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getAssociationSpecification_MappedBy()
   * @model
   * @generated
   */
  String getMappedBy();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.AssociationSpecification#getMappedBy <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped By</em>' attribute.
   * @see #getMappedBy()
   * @generated
   */
  void setMappedBy(String value);

  /**
   * Returns the value of the '<em><b>Fetch Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fetch Type</em>' attribute.
   * @see #setFetchType(String)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getAssociationSpecification_FetchType()
   * @model
   * @generated
   */
  String getFetchType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.AssociationSpecification#getFetchType <em>Fetch Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fetch Type</em>' attribute.
   * @see #getFetchType()
   * @generated
   */
  void setFetchType(String value);

} // AssociationSpecification