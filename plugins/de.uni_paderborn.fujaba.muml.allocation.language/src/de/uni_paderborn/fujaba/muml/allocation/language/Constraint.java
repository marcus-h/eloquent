/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for constraints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.Constraint#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends OptionalNamedElement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the OCL expression which is associated with this constraint.
	 * Instead of a plain EString a parsed OCL expression should be used
	 * in the future.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage#getConstraint_Expression()
	 * @model required="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.Constraint#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // Constraint
