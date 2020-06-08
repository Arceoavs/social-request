/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.socialRequest;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Validation#getMin <em>Min</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Validation#getMax <em>Max</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Validation#getRegex <em>Regex</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Validation#getValidator <em>Validator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Validation#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getValidation()
 * @model
 * @generated
 */
public interface Validation extends EObject
{
  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(BigDecimal)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getValidation_Min()
   * @model
   * @generated
   */
  BigDecimal getMin();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Validation#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(BigDecimal)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getValidation_Max()
   * @model
   * @generated
   */
  BigDecimal getMax();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Validation#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Regex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regex</em>' attribute.
   * @see #setRegex(String)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getValidation_Regex()
   * @model
   * @generated
   */
  String getRegex();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Validation#getRegex <em>Regex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regex</em>' attribute.
   * @see #getRegex()
   * @generated
   */
  void setRegex(String value);

  /**
   * Returns the value of the '<em><b>Validator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validator</em>' attribute.
   * @see #setValidator(String)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getValidation_Validator()
   * @model
   * @generated
   */
  String getValidator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Validation#getValidator <em>Validator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validator</em>' attribute.
   * @see #getValidator()
   * @generated
   */
  void setValidator(String value);

  /**
   * Returns the value of the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique</em>' attribute.
   * @see #setUnique(boolean)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getValidation_Unique()
   * @model
   * @generated
   */
  boolean isUnique();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Validation#isUnique <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique</em>' attribute.
   * @see #isUnique()
   * @generated
   */
  void setUnique(boolean value);

} // Validation
