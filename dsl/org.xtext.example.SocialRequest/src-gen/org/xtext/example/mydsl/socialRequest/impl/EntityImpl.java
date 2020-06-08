/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.socialRequest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.socialRequest.Attribute;
import org.xtext.example.mydsl.socialRequest.Entity;
import org.xtext.example.mydsl.socialRequest.SocialRequestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.EntityImpl#getHasUserDetails <em>Has User Details</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends AbstractElementImpl implements Entity
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getHasUserDetails() <em>Has User Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasUserDetails()
   * @generated
   * @ordered
   */
  protected static final String HAS_USER_DETAILS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHasUserDetails() <em>Has User Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasUserDetails()
   * @generated
   * @ordered
   */
  protected String hasUserDetails = HAS_USER_DETAILS_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SocialRequestPackage.Literals.ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getHasUserDetails()
  {
    return hasUserDetails;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHasUserDetails(String newHasUserDetails)
  {
    String oldHasUserDetails = hasUserDetails;
    hasUserDetails = newHasUserDetails;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.ENTITY__HAS_USER_DETAILS, oldHasUserDetails, hasUserDetails));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, SocialRequestPackage.ENTITY__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SocialRequestPackage.ENTITY__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SocialRequestPackage.ENTITY__NAME:
        return getName();
      case SocialRequestPackage.ENTITY__HAS_USER_DETAILS:
        return getHasUserDetails();
      case SocialRequestPackage.ENTITY__ATTRIBUTES:
        return getAttributes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SocialRequestPackage.ENTITY__NAME:
        setName((String)newValue);
        return;
      case SocialRequestPackage.ENTITY__HAS_USER_DETAILS:
        setHasUserDetails((String)newValue);
        return;
      case SocialRequestPackage.ENTITY__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SocialRequestPackage.ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SocialRequestPackage.ENTITY__HAS_USER_DETAILS:
        setHasUserDetails(HAS_USER_DETAILS_EDEFAULT);
        return;
      case SocialRequestPackage.ENTITY__ATTRIBUTES:
        getAttributes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SocialRequestPackage.ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SocialRequestPackage.ENTITY__HAS_USER_DETAILS:
        return HAS_USER_DETAILS_EDEFAULT == null ? hasUserDetails != null : !HAS_USER_DETAILS_EDEFAULT.equals(hasUserDetails);
      case SocialRequestPackage.ENTITY__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", hasUserDetails: ");
    result.append(hasUserDetails);
    result.append(')');
    return result.toString();
  }

} //EntityImpl
