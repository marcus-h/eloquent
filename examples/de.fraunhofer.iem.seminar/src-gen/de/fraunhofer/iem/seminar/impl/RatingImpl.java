/**
 * generated by Xtext 2.11.0
 */
package de.fraunhofer.iem.seminar.impl;

import de.fraunhofer.iem.seminar.Rating;
import de.fraunhofer.iem.seminar.SeminarPackage;
import de.fraunhofer.iem.seminar.Student;
import de.fraunhofer.iem.seminar.Topic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rating</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.iem.seminar.impl.RatingImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminar.impl.RatingImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminar.impl.RatingImpl#getRating <em>Rating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatingImpl extends MinimalEObjectImpl.Container implements Rating
{
  /**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
  protected Student student;

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
	 * The default value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
  protected static final double RATING_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
  protected double rating = RATING_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RatingImpl()
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
		return SeminarPackage.Literals.RATING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Student getStudent()
  {
		if (student != null && student.eIsProxy()) {
			InternalEObject oldStudent = (InternalEObject)student;
			student = (Student)eResolveProxy(oldStudent);
			if (student != oldStudent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeminarPackage.RATING__STUDENT, oldStudent, student));
			}
		}
		return student;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Student basicGetStudent()
  {
		return student;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setStudent(Student newStudent)
  {
		Student oldStudent = student;
		student = newStudent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeminarPackage.RATING__STUDENT, oldStudent, student));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Topic getTopic()
  {
		if (topic != null && topic.eIsProxy()) {
			InternalEObject oldTopic = (InternalEObject)topic;
			topic = (Topic)eResolveProxy(oldTopic);
			if (topic != oldTopic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeminarPackage.RATING__TOPIC, oldTopic, topic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SeminarPackage.RATING__TOPIC, oldTopic, topic));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getRating()
  {
		return rating;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRating(double newRating)
  {
		double oldRating = rating;
		rating = newRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeminarPackage.RATING__RATING, oldRating, rating));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case SeminarPackage.RATING__STUDENT:
				if (resolve) return getStudent();
				return basicGetStudent();
			case SeminarPackage.RATING__TOPIC:
				if (resolve) return getTopic();
				return basicGetTopic();
			case SeminarPackage.RATING__RATING:
				return getRating();
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
		switch (featureID) {
			case SeminarPackage.RATING__STUDENT:
				setStudent((Student)newValue);
				return;
			case SeminarPackage.RATING__TOPIC:
				setTopic((Topic)newValue);
				return;
			case SeminarPackage.RATING__RATING:
				setRating((Double)newValue);
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
		switch (featureID) {
			case SeminarPackage.RATING__STUDENT:
				setStudent((Student)null);
				return;
			case SeminarPackage.RATING__TOPIC:
				setTopic((Topic)null);
				return;
			case SeminarPackage.RATING__RATING:
				setRating(RATING_EDEFAULT);
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
		switch (featureID) {
			case SeminarPackage.RATING__STUDENT:
				return student != null;
			case SeminarPackage.RATING__TOPIC:
				return topic != null;
			case SeminarPackage.RATING__RATING:
				return rating != RATING_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (rating: ");
		result.append(rating);
		result.append(')');
		return result.toString();
	}

} //RatingImpl
