/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Tuple Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Can be subclassed by tuple descriptor classes where one named part
 * describes a component instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.InstanceTupleDescriptor#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage#getInstanceTupleDescriptor()
 * @model abstract="true"
 * @generated
 */
public interface InstanceTupleDescriptor extends TupleDescriptor {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the named part which represents the component instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see #setInstance(String)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage#getInstanceTupleDescriptor_Instance()
	 * @model required="true"
	 * @generated
	 */
	String getInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.InstanceTupleDescriptor#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' attribute.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(String value);

} // InstanceTupleDescriptor
