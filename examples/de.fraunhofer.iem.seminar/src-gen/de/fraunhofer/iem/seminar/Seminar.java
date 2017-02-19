/**
 * generated by Xtext 2.11.0
 */
package de.fraunhofer.iem.seminar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seminar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.iem.seminar.Seminar#getSupervisors <em>Supervisors</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminar.Seminar#getStudents <em>Students</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminar.Seminar#getTopics <em>Topics</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminar.Seminar#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminar.Seminar#getSupervises <em>Supervises</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminar.Seminar#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.iem.seminar.SeminarPackage#getSeminar()
 * @model
 * @generated
 */
public interface Seminar extends EObject
{
  /**
	 * Returns the value of the '<em><b>Supervisors</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.seminar.Supervisor}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supervisors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisors</em>' containment reference list.
	 * @see de.fraunhofer.iem.seminar.SeminarPackage#getSeminar_Supervisors()
	 * @model containment="true"
	 * @generated
	 */
  EList<Supervisor> getSupervisors();

  /**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.seminar.Student}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Students</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see de.fraunhofer.iem.seminar.SeminarPackage#getSeminar_Students()
	 * @model containment="true"
	 * @generated
	 */
  EList<Student> getStudents();

  /**
	 * Returns the value of the '<em><b>Topics</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.seminar.Topic}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Topics</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' containment reference list.
	 * @see de.fraunhofer.iem.seminar.SeminarPackage#getSeminar_Topics()
	 * @model containment="true"
	 * @generated
	 */
  EList<Topic> getTopics();

  /**
	 * Returns the value of the '<em><b>Preferences</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.seminar.Preference}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preferences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferences</em>' containment reference list.
	 * @see de.fraunhofer.iem.seminar.SeminarPackage#getSeminar_Preferences()
	 * @model containment="true"
	 * @generated
	 */
  EList<Preference> getPreferences();

  /**
	 * Returns the value of the '<em><b>Supervises</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.seminar.Supervise}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supervises</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervises</em>' containment reference list.
	 * @see de.fraunhofer.iem.seminar.SeminarPackage#getSeminar_Supervises()
	 * @model containment="true"
	 * @generated
	 */
  EList<Supervise> getSupervises();

  /**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.seminar.Assignment}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference list.
	 * @see de.fraunhofer.iem.seminar.SeminarPackage#getSeminar_Assignments()
	 * @model containment="true"
	 * @generated
	 */
  EList<Assignment> getAssignments();

} // Seminar
