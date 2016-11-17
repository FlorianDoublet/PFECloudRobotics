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
package ar_drone.impl;

import ar_drone.Ar_drone;
import ar_drone.Ar_dronePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.impl.ResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ar drone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ar_drone.impl.Ar_droneImpl#getName <em>Name</em>}</li>
 *   <li>{@link ar_drone.impl.Ar_droneImpl#getLeft_right_tilt <em>Left right tilt</em>}</li>
 *   <li>{@link ar_drone.impl.Ar_droneImpl#getFront_back_tilt <em>Front back tilt</em>}</li>
 *   <li>{@link ar_drone.impl.Ar_droneImpl#getVertical_speed <em>Vertical speed</em>}</li>
 *   <li>{@link ar_drone.impl.Ar_droneImpl#getAngular_speed <em>Angular speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Ar_droneImpl extends ResourceImpl implements Ar_drone {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeft_right_tilt() <em>Left right tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft_right_tilt()
	 * @generated
	 * @ordered
	 */
	protected static final int LEFT_RIGHT_TILT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLeft_right_tilt() <em>Left right tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft_right_tilt()
	 * @generated
	 * @ordered
	 */
	protected int left_right_tilt = LEFT_RIGHT_TILT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFront_back_tilt() <em>Front back tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFront_back_tilt()
	 * @generated
	 * @ordered
	 */
	protected static final int FRONT_BACK_TILT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFront_back_tilt() <em>Front back tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFront_back_tilt()
	 * @generated
	 * @ordered
	 */
	protected int front_back_tilt = FRONT_BACK_TILT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVertical_speed() <em>Vertical speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertical_speed()
	 * @generated
	 * @ordered
	 */
	protected static final int VERTICAL_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVertical_speed() <em>Vertical speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertical_speed()
	 * @generated
	 * @ordered
	 */
	protected int vertical_speed = VERTICAL_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAngular_speed() <em>Angular speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngular_speed()
	 * @generated
	 * @ordered
	 */
	protected static final int ANGULAR_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAngular_speed() <em>Angular speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngular_speed()
	 * @generated
	 * @ordered
	 */
	protected int angular_speed = ANGULAR_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ar_droneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ar_dronePackage.Literals.AR_DRONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ar_dronePackage.AR_DRONE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLeft_right_tilt() {
		return left_right_tilt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft_right_tilt(int newLeft_right_tilt) {
		int oldLeft_right_tilt = left_right_tilt;
		left_right_tilt = newLeft_right_tilt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ar_dronePackage.AR_DRONE__LEFT_RIGHT_TILT, oldLeft_right_tilt, left_right_tilt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFront_back_tilt() {
		return front_back_tilt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFront_back_tilt(int newFront_back_tilt) {
		int oldFront_back_tilt = front_back_tilt;
		front_back_tilt = newFront_back_tilt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ar_dronePackage.AR_DRONE__FRONT_BACK_TILT, oldFront_back_tilt, front_back_tilt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVertical_speed() {
		return vertical_speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertical_speed(int newVertical_speed) {
		int oldVertical_speed = vertical_speed;
		vertical_speed = newVertical_speed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ar_dronePackage.AR_DRONE__VERTICAL_SPEED, oldVertical_speed, vertical_speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAngular_speed() {
		return angular_speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngular_speed(int newAngular_speed) {
		int oldAngular_speed = angular_speed;
		angular_speed = newAngular_speed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ar_dronePackage.AR_DRONE__ANGULAR_SPEED, oldAngular_speed, angular_speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void move() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void land() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void take_off() {
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
			case Ar_dronePackage.AR_DRONE__NAME:
				return getName();
			case Ar_dronePackage.AR_DRONE__LEFT_RIGHT_TILT:
				return getLeft_right_tilt();
			case Ar_dronePackage.AR_DRONE__FRONT_BACK_TILT:
				return getFront_back_tilt();
			case Ar_dronePackage.AR_DRONE__VERTICAL_SPEED:
				return getVertical_speed();
			case Ar_dronePackage.AR_DRONE__ANGULAR_SPEED:
				return getAngular_speed();
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
			case Ar_dronePackage.AR_DRONE__NAME:
				setName((String)newValue);
				return;
			case Ar_dronePackage.AR_DRONE__LEFT_RIGHT_TILT:
				setLeft_right_tilt((Integer)newValue);
				return;
			case Ar_dronePackage.AR_DRONE__FRONT_BACK_TILT:
				setFront_back_tilt((Integer)newValue);
				return;
			case Ar_dronePackage.AR_DRONE__VERTICAL_SPEED:
				setVertical_speed((Integer)newValue);
				return;
			case Ar_dronePackage.AR_DRONE__ANGULAR_SPEED:
				setAngular_speed((Integer)newValue);
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
			case Ar_dronePackage.AR_DRONE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ar_dronePackage.AR_DRONE__LEFT_RIGHT_TILT:
				setLeft_right_tilt(LEFT_RIGHT_TILT_EDEFAULT);
				return;
			case Ar_dronePackage.AR_DRONE__FRONT_BACK_TILT:
				setFront_back_tilt(FRONT_BACK_TILT_EDEFAULT);
				return;
			case Ar_dronePackage.AR_DRONE__VERTICAL_SPEED:
				setVertical_speed(VERTICAL_SPEED_EDEFAULT);
				return;
			case Ar_dronePackage.AR_DRONE__ANGULAR_SPEED:
				setAngular_speed(ANGULAR_SPEED_EDEFAULT);
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
			case Ar_dronePackage.AR_DRONE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ar_dronePackage.AR_DRONE__LEFT_RIGHT_TILT:
				return left_right_tilt != LEFT_RIGHT_TILT_EDEFAULT;
			case Ar_dronePackage.AR_DRONE__FRONT_BACK_TILT:
				return front_back_tilt != FRONT_BACK_TILT_EDEFAULT;
			case Ar_dronePackage.AR_DRONE__VERTICAL_SPEED:
				return vertical_speed != VERTICAL_SPEED_EDEFAULT;
			case Ar_dronePackage.AR_DRONE__ANGULAR_SPEED:
				return angular_speed != ANGULAR_SPEED_EDEFAULT;
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
			case Ar_dronePackage.AR_DRONE___MOVE:
				move();
				return null;
			case Ar_dronePackage.AR_DRONE___LAND:
				land();
				return null;
			case Ar_dronePackage.AR_DRONE___TAKE_OFF:
				take_off();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", left_right_tilt: ");
		result.append(left_right_tilt);
		result.append(", front_back_tilt: ");
		result.append(front_back_tilt);
		result.append(", vertical_speed: ");
		result.append(vertical_speed);
		result.append(", angular_speed: ");
		result.append(angular_speed);
		result.append(')');
		return result.toString();
	}

} //Ar_droneImpl
