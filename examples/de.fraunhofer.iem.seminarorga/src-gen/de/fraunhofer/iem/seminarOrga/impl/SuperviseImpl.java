/**
 * generated by Xtext 2.11.0
 */
package de.fraunhofer.iem.seminarOrga.impl;

import de.fraunhofer.iem.seminarOrga.SeminarOrgaPackage;
import de.fraunhofer.iem.seminarOrga.Supervise;
import de.fraunhofer.iem.seminarOrga.Supervisor;
import de.fraunhofer.iem.seminarOrga.Topic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supervise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.iem.seminarOrga.impl.SuperviseImpl#getSupervisor <em>Supervisor</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminarOrga.impl.SuperviseImpl#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperviseImpl extends MinimalEObjectImpl.Container implements Supervise
{
  /**
   * The cached value of the '{@link #getSupervisor() <em>Supervisor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupervisor()
   * @generated
   * @ordered
   */
  protected Supervisor supervisor;

  /**
   * The cached value of the '{@link #getTopic() <em>Topic</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTopic()
   * @generated
   * @ordered
   */
  protected Topic topic;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SuperviseImpl()
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
    return SeminarOrgaPackage.Literals.SUPERVISE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Supervisor getSupervisor()
  {
    if (supervisor != null && supervisor.eIsProxy())
    {
      InternalEObject oldSupervisor = (InternalEObject)supervisor;
      supervisor = (Supervisor)eResolveProxy(oldSupervisor);
      if (supervisor != oldSupervisor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeminarOrgaPackage.SUPERVISE__SUPERVISOR, oldSupervisor, supervisor));
      }
    }
    return supervisor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Supervisor basicGetSupervisor()
  {
    return supervisor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupervisor(Supervisor newSupervisor)
  {
    Supervisor oldSupervisor = supervisor;
    supervisor = newSupervisor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeminarOrgaPackage.SUPERVISE__SUPERVISOR, oldSupervisor, supervisor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Topic getTopic()
  {
    if (topic != null && topic.eIsProxy())
    {
      InternalEObject oldTopic = (InternalEObject)topic;
      topic = (Topic)eResolveProxy(oldTopic);
      if (topic != oldTopic)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeminarOrgaPackage.SUPERVISE__TOPIC, oldTopic, topic));
      }
    }
    return topic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Topic basicGetTopic()
  {
    return topic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTopic(Topic newTopic)
  {
    Topic oldTopic = topic;
    topic = newTopic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeminarOrgaPackage.SUPERVISE__TOPIC, oldTopic, topic));
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
      case SeminarOrgaPackage.SUPERVISE__SUPERVISOR:
        if (resolve) return getSupervisor();
        return basicGetSupervisor();
      case SeminarOrgaPackage.SUPERVISE__TOPIC:
        if (resolve) return getTopic();
        return basicGetTopic();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SeminarOrgaPackage.SUPERVISE__SUPERVISOR:
        setSupervisor((Supervisor)newValue);
        return;
      case SeminarOrgaPackage.SUPERVISE__TOPIC:
        setTopic((Topic)newValue);
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
      case SeminarOrgaPackage.SUPERVISE__SUPERVISOR:
        setSupervisor((Supervisor)null);
        return;
      case SeminarOrgaPackage.SUPERVISE__TOPIC:
        setTopic((Topic)null);
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
      case SeminarOrgaPackage.SUPERVISE__SUPERVISOR:
        return supervisor != null;
      case SeminarOrgaPackage.SUPERVISE__TOPIC:
        return topic != null;
    }
    return super.eIsSet(featureID);
  }

} //SuperviseImpl
