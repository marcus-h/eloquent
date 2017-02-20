/**
 * generated by Xtext 2.11.0
 */
package de.fraunhofer.iem.seminar.util;

import de.fraunhofer.iem.seminar.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.seminar.SeminarPackage
 * @generated
 */
public class SeminarAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static SeminarPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SeminarAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = SeminarPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SeminarSwitch<Adapter> modelSwitch =
    new SeminarSwitch<Adapter>() {
			@Override
			public Adapter caseSeminar(Seminar object) {
				return createSeminarAdapter();
			}
			@Override
			public Adapter caseSupervisor(Supervisor object) {
				return createSupervisorAdapter();
			}
			@Override
			public Adapter caseStudent(Student object) {
				return createStudentAdapter();
			}
			@Override
			public Adapter caseTopic(Topic object) {
				return createTopicAdapter();
			}
			@Override
			public Adapter casePreference(Preference object) {
				return createPreferenceAdapter();
			}
			@Override
			public Adapter caseRating(Rating object) {
				return createRatingAdapter();
			}
			@Override
			public Adapter caseSupervise(Supervise object) {
				return createSuperviseAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.seminar.Seminar <em>Seminar</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.seminar.Seminar
	 * @generated
	 */
  public Adapter createSeminarAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.seminar.Supervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.seminar.Supervisor
	 * @generated
	 */
  public Adapter createSupervisorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.seminar.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.seminar.Student
	 * @generated
	 */
  public Adapter createStudentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.seminar.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.seminar.Topic
	 * @generated
	 */
  public Adapter createTopicAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.seminar.Preference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.seminar.Preference
	 * @generated
	 */
  public Adapter createPreferenceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.seminar.Rating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.seminar.Rating
	 * @generated
	 */
  public Adapter createRatingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.seminar.Supervise <em>Supervise</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.seminar.Supervise
	 * @generated
	 */
  public Adapter createSuperviseAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.seminar.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.seminar.Assignment
	 * @generated
	 */
  public Adapter createAssignmentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //SeminarAdapterFactory
