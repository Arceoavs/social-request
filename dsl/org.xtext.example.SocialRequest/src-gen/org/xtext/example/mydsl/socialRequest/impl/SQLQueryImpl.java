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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.socialRequest.From;
import org.xtext.example.mydsl.socialRequest.Join;
import org.xtext.example.mydsl.socialRequest.Order;
import org.xtext.example.mydsl.socialRequest.SQLQuery;
import org.xtext.example.mydsl.socialRequest.Select;
import org.xtext.example.mydsl.socialRequest.SocialRequestPackage;
import org.xtext.example.mydsl.socialRequest.Where;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.SQLQueryImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.SQLQueryImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.SQLQueryImpl#getJoins <em>Joins</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.SQLQueryImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.SQLQueryImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SQLQueryImpl extends MinimalEObjectImpl.Container implements SQLQuery
{
  /**
   * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelect()
   * @generated
   * @ordered
   */
  protected Select select;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected From from;

  /**
   * The cached value of the '{@link #getJoins() <em>Joins</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoins()
   * @generated
   * @ordered
   */
  protected EList<Join> joins;

  /**
   * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhere()
   * @generated
   * @ordered
   */
  protected Where where;

  /**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected Order order;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SQLQueryImpl()
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
    return SocialRequestPackage.Literals.SQL_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Select getSelect()
  {
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelect(Select newSelect, NotificationChain msgs)
  {
    Select oldSelect = select;
    select = newSelect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SocialRequestPackage.SQL_QUERY__SELECT, oldSelect, newSelect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSelect(Select newSelect)
  {
    if (newSelect != select)
    {
      NotificationChain msgs = null;
      if (select != null)
        msgs = ((InternalEObject)select).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SocialRequestPackage.SQL_QUERY__SELECT, null, msgs);
      if (newSelect != null)
        msgs = ((InternalEObject)newSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SocialRequestPackage.SQL_QUERY__SELECT, null, msgs);
      msgs = basicSetSelect(newSelect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.SQL_QUERY__SELECT, newSelect, newSelect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public From getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFrom(From newFrom, NotificationChain msgs)
  {
    From oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SocialRequestPackage.SQL_QUERY__FROM, oldFrom, newFrom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFrom(From newFrom)
  {
    if (newFrom != from)
    {
      NotificationChain msgs = null;
      if (from != null)
        msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SocialRequestPackage.SQL_QUERY__FROM, null, msgs);
      if (newFrom != null)
        msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SocialRequestPackage.SQL_QUERY__FROM, null, msgs);
      msgs = basicSetFrom(newFrom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.SQL_QUERY__FROM, newFrom, newFrom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Join> getJoins()
  {
    if (joins == null)
    {
      joins = new EObjectContainmentEList<Join>(Join.class, this, SocialRequestPackage.SQL_QUERY__JOINS);
    }
    return joins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Where getWhere()
  {
    return where;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhere(Where newWhere, NotificationChain msgs)
  {
    Where oldWhere = where;
    where = newWhere;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SocialRequestPackage.SQL_QUERY__WHERE, oldWhere, newWhere);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWhere(Where newWhere)
  {
    if (newWhere != where)
    {
      NotificationChain msgs = null;
      if (where != null)
        msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SocialRequestPackage.SQL_QUERY__WHERE, null, msgs);
      if (newWhere != null)
        msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SocialRequestPackage.SQL_QUERY__WHERE, null, msgs);
      msgs = basicSetWhere(newWhere, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.SQL_QUERY__WHERE, newWhere, newWhere));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Order getOrder()
  {
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrder(Order newOrder, NotificationChain msgs)
  {
    Order oldOrder = order;
    order = newOrder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SocialRequestPackage.SQL_QUERY__ORDER, oldOrder, newOrder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOrder(Order newOrder)
  {
    if (newOrder != order)
    {
      NotificationChain msgs = null;
      if (order != null)
        msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SocialRequestPackage.SQL_QUERY__ORDER, null, msgs);
      if (newOrder != null)
        msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SocialRequestPackage.SQL_QUERY__ORDER, null, msgs);
      msgs = basicSetOrder(newOrder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.SQL_QUERY__ORDER, newOrder, newOrder));
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
      case SocialRequestPackage.SQL_QUERY__SELECT:
        return basicSetSelect(null, msgs);
      case SocialRequestPackage.SQL_QUERY__FROM:
        return basicSetFrom(null, msgs);
      case SocialRequestPackage.SQL_QUERY__JOINS:
        return ((InternalEList<?>)getJoins()).basicRemove(otherEnd, msgs);
      case SocialRequestPackage.SQL_QUERY__WHERE:
        return basicSetWhere(null, msgs);
      case SocialRequestPackage.SQL_QUERY__ORDER:
        return basicSetOrder(null, msgs);
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
      case SocialRequestPackage.SQL_QUERY__SELECT:
        return getSelect();
      case SocialRequestPackage.SQL_QUERY__FROM:
        return getFrom();
      case SocialRequestPackage.SQL_QUERY__JOINS:
        return getJoins();
      case SocialRequestPackage.SQL_QUERY__WHERE:
        return getWhere();
      case SocialRequestPackage.SQL_QUERY__ORDER:
        return getOrder();
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
      case SocialRequestPackage.SQL_QUERY__SELECT:
        setSelect((Select)newValue);
        return;
      case SocialRequestPackage.SQL_QUERY__FROM:
        setFrom((From)newValue);
        return;
      case SocialRequestPackage.SQL_QUERY__JOINS:
        getJoins().clear();
        getJoins().addAll((Collection<? extends Join>)newValue);
        return;
      case SocialRequestPackage.SQL_QUERY__WHERE:
        setWhere((Where)newValue);
        return;
      case SocialRequestPackage.SQL_QUERY__ORDER:
        setOrder((Order)newValue);
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
      case SocialRequestPackage.SQL_QUERY__SELECT:
        setSelect((Select)null);
        return;
      case SocialRequestPackage.SQL_QUERY__FROM:
        setFrom((From)null);
        return;
      case SocialRequestPackage.SQL_QUERY__JOINS:
        getJoins().clear();
        return;
      case SocialRequestPackage.SQL_QUERY__WHERE:
        setWhere((Where)null);
        return;
      case SocialRequestPackage.SQL_QUERY__ORDER:
        setOrder((Order)null);
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
      case SocialRequestPackage.SQL_QUERY__SELECT:
        return select != null;
      case SocialRequestPackage.SQL_QUERY__FROM:
        return from != null;
      case SocialRequestPackage.SQL_QUERY__JOINS:
        return joins != null && !joins.isEmpty();
      case SocialRequestPackage.SQL_QUERY__WHERE:
        return where != null;
      case SocialRequestPackage.SQL_QUERY__ORDER:
        return order != null;
    }
    return super.eIsSet(featureID);
  }

} //SQLQueryImpl