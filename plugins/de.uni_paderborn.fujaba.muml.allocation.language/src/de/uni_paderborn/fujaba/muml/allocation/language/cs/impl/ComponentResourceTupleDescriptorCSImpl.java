/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.cs.impl;

import de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Resource Tuple Descriptor CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ComponentResourceTupleDescriptorCSImpl#getHwresinstance <em>Hwresinstance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentResourceTupleDescriptorCSImpl extends InstanceTupleDescriptorCSImpl implements ComponentResourceTupleDescriptorCS {
	/**
	 * The default value of the '{@link #getHwresinstance() <em>Hwresinstance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwresinstance()
	 * @generated
	 * @ordered
	 */
	protected static final String HWRESINSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHwresinstance() <em>Hwresinstance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwresinstance()
	 * @generated
	 * @ordered
	 */
	protected String hwresinstance = HWRESINSTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentResourceTupleDescriptorCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHwresinstance() {
		return hwresinstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwresinstance(String newHwresinstance) {
		String oldHwresinstance = hwresinstance;
		hwresinstance = newHwresinstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS__HWRESINSTANCE, oldHwresinstance, hwresinstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS__HWRESINSTANCE:
				return getHwresinstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CsPackage.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS__HWRESINSTANCE:
				setHwresinstance((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CsPackage.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS__HWRESINSTANCE:
				setHwresinstance(HWRESINSTANCE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CsPackage.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS__HWRESINSTANCE:
				return HWRESINSTANCE_EDEFAULT == null ? hwresinstance != null : !HWRESINSTANCE_EDEFAULT.equals(hwresinstance);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (hwresinstance: ");
		result.append(hwresinstance);
		result.append(')');
		return result.toString();
	}

} //ComponentResourceTupleDescriptorCSImpl
