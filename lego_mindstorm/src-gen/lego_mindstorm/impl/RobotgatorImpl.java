/**
 * Copyright (c) 2015-2016 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package lego_mindstorm.impl;

import java.lang.reflect.InvocationTargetException;

import lego_mindstorm.Lego_mindstormPackage;
import lego_mindstorm.Robotgator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robotgator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lego_mindstorm.impl.RobotgatorImpl#getUltra_sound_value <em>Ultra sound value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotgatorImpl extends Lego_mindstom_ntx2Impl implements Robotgator {
	/**
	 * The default value of the '{@link #getUltra_sound_value() <em>Ultra sound value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltra_sound_value()
	 * @generated
	 * @ordered
	 */
	protected static final int ULTRA_SOUND_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUltra_sound_value() <em>Ultra sound value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltra_sound_value()
	 * @generated
	 * @ordered
	 */
	protected int ultra_sound_value = ULTRA_SOUND_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotgatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lego_mindstormPackage.Literals.ROBOTGATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUltra_sound_value() {
		return ultra_sound_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUltra_sound_value(int newUltra_sound_value) {
		int oldUltra_sound_value = ultra_sound_value;
		ultra_sound_value = newUltra_sound_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lego_mindstormPackage.ROBOTGATOR__ULTRA_SOUND_VALUE, oldUltra_sound_value, ultra_sound_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void open_mouth() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void close_mouth() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void read_ultra_sound() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Lego_mindstormPackage.ROBOTGATOR__ULTRA_SOUND_VALUE:
				return getUltra_sound_value();
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
			case Lego_mindstormPackage.ROBOTGATOR__ULTRA_SOUND_VALUE:
				setUltra_sound_value((Integer)newValue);
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
			case Lego_mindstormPackage.ROBOTGATOR__ULTRA_SOUND_VALUE:
				setUltra_sound_value(ULTRA_SOUND_VALUE_EDEFAULT);
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
			case Lego_mindstormPackage.ROBOTGATOR__ULTRA_SOUND_VALUE:
				return ultra_sound_value != ULTRA_SOUND_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Lego_mindstormPackage.ROBOTGATOR___OPEN_MOUTH:
				open_mouth();
				return null;
			case Lego_mindstormPackage.ROBOTGATOR___CLOSE_MOUTH:
				close_mouth();
				return null;
			case Lego_mindstormPackage.ROBOTGATOR___READ_ULTRA_SOUND:
				read_ultra_sound();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (ultra_sound_value: ");
		result.append(ultra_sound_value);
		result.append(')');
		return result.toString();
	}

} //RobotgatorImpl
