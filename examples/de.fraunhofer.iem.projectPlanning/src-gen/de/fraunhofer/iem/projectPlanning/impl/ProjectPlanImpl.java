/**
 * generated by Xtext 2.11.0
 */
package de.fraunhofer.iem.projectPlanning.impl;

import de.fraunhofer.iem.projectPlanning.Assignment;
import de.fraunhofer.iem.projectPlanning.Capability;
import de.fraunhofer.iem.projectPlanning.Employee;
import de.fraunhofer.iem.projectPlanning.Project;
import de.fraunhofer.iem.projectPlanning.ProjectPlan;
import de.fraunhofer.iem.projectPlanning.ProjectPlanningPackage;
import de.fraunhofer.iem.projectPlanning.Rating;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.iem.projectPlanning.impl.ProjectPlanImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link de.fraunhofer.iem.projectPlanning.impl.ProjectPlanImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link de.fraunhofer.iem.projectPlanning.impl.ProjectPlanImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link de.fraunhofer.iem.projectPlanning.impl.ProjectPlanImpl#getRatings <em>Ratings</em>}</li>
 *   <li>{@link de.fraunhofer.iem.projectPlanning.impl.ProjectPlanImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectPlanImpl extends MinimalEObjectImpl.Container implements ProjectPlan
{
  /**
   * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapabilities()
   * @generated
   * @ordered
   */
  protected EList<Capability> capabilities;

  /**
   * The cached value of the '{@link #getEmployees() <em>Employees</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmployees()
   * @generated
   * @ordered
   */
  protected EList<Employee> employees;

  /**
   * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjects()
   * @generated
   * @ordered
   */
  protected EList<Project> projects;

  /**
   * The cached value of the '{@link #getRatings() <em>Ratings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRatings()
   * @generated
   * @ordered
   */
  protected EList<Rating> ratings;

  /**
   * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignments()
   * @generated
   * @ordered
   */
  protected EList<Assignment> assignments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectPlanImpl()
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
    return ProjectPlanningPackage.Literals.PROJECT_PLAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Capability> getCapabilities()
  {
    if (capabilities == null)
    {
      capabilities = new EObjectContainmentEList<Capability>(Capability.class, this, ProjectPlanningPackage.PROJECT_PLAN__CAPABILITIES);
    }
    return capabilities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Employee> getEmployees()
  {
    if (employees == null)
    {
      employees = new EObjectContainmentEList<Employee>(Employee.class, this, ProjectPlanningPackage.PROJECT_PLAN__EMPLOYEES);
    }
    return employees;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Project> getProjects()
  {
    if (projects == null)
    {
      projects = new EObjectContainmentEList<Project>(Project.class, this, ProjectPlanningPackage.PROJECT_PLAN__PROJECTS);
    }
    return projects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rating> getRatings()
  {
    if (ratings == null)
    {
      ratings = new EObjectContainmentEList<Rating>(Rating.class, this, ProjectPlanningPackage.PROJECT_PLAN__RATINGS);
    }
    return ratings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Assignment> getAssignments()
  {
    if (assignments == null)
    {
      assignments = new EObjectContainmentEList<Assignment>(Assignment.class, this, ProjectPlanningPackage.PROJECT_PLAN__ASSIGNMENTS);
    }
    return assignments;
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
      case ProjectPlanningPackage.PROJECT_PLAN__CAPABILITIES:
        return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
      case ProjectPlanningPackage.PROJECT_PLAN__EMPLOYEES:
        return ((InternalEList<?>)getEmployees()).basicRemove(otherEnd, msgs);
      case ProjectPlanningPackage.PROJECT_PLAN__PROJECTS:
        return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
      case ProjectPlanningPackage.PROJECT_PLAN__RATINGS:
        return ((InternalEList<?>)getRatings()).basicRemove(otherEnd, msgs);
      case ProjectPlanningPackage.PROJECT_PLAN__ASSIGNMENTS:
        return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
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
      case ProjectPlanningPackage.PROJECT_PLAN__CAPABILITIES:
        return getCapabilities();
      case ProjectPlanningPackage.PROJECT_PLAN__EMPLOYEES:
        return getEmployees();
      case ProjectPlanningPackage.PROJECT_PLAN__PROJECTS:
        return getProjects();
      case ProjectPlanningPackage.PROJECT_PLAN__RATINGS:
        return getRatings();
      case ProjectPlanningPackage.PROJECT_PLAN__ASSIGNMENTS:
        return getAssignments();
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
      case ProjectPlanningPackage.PROJECT_PLAN__CAPABILITIES:
        getCapabilities().clear();
        getCapabilities().addAll((Collection<? extends Capability>)newValue);
        return;
      case ProjectPlanningPackage.PROJECT_PLAN__EMPLOYEES:
        getEmployees().clear();
        getEmployees().addAll((Collection<? extends Employee>)newValue);
        return;
      case ProjectPlanningPackage.PROJECT_PLAN__PROJECTS:
        getProjects().clear();
        getProjects().addAll((Collection<? extends Project>)newValue);
        return;
      case ProjectPlanningPackage.PROJECT_PLAN__RATINGS:
        getRatings().clear();
        getRatings().addAll((Collection<? extends Rating>)newValue);
        return;
      case ProjectPlanningPackage.PROJECT_PLAN__ASSIGNMENTS:
        getAssignments().clear();
        getAssignments().addAll((Collection<? extends Assignment>)newValue);
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
      case ProjectPlanningPackage.PROJECT_PLAN__CAPABILITIES:
        getCapabilities().clear();
        return;
      case ProjectPlanningPackage.PROJECT_PLAN__EMPLOYEES:
        getEmployees().clear();
        return;
      case ProjectPlanningPackage.PROJECT_PLAN__PROJECTS:
        getProjects().clear();
        return;
      case ProjectPlanningPackage.PROJECT_PLAN__RATINGS:
        getRatings().clear();
        return;
      case ProjectPlanningPackage.PROJECT_PLAN__ASSIGNMENTS:
        getAssignments().clear();
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
      case ProjectPlanningPackage.PROJECT_PLAN__CAPABILITIES:
        return capabilities != null && !capabilities.isEmpty();
      case ProjectPlanningPackage.PROJECT_PLAN__EMPLOYEES:
        return employees != null && !employees.isEmpty();
      case ProjectPlanningPackage.PROJECT_PLAN__PROJECTS:
        return projects != null && !projects.isEmpty();
      case ProjectPlanningPackage.PROJECT_PLAN__RATINGS:
        return ratings != null && !ratings.isEmpty();
      case ProjectPlanningPackage.PROJECT_PLAN__ASSIGNMENTS:
        return assignments != null && !assignments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProjectPlanImpl
