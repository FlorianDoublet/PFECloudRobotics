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

import lego_mindstorm.Lego_mindstom_ntx2;
import lego_mindstorm.Lego_mindstormPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.impl.ResourceImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lego mindstom ntx2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lego_mindstorm.impl.Lego_mindstom_ntx2Impl#getName <em>Name</em>}</li>
 *   <li>{@link lego_mindstorm.impl.Lego_mindstom_ntx2Impl#getAngle <em>Angle</em>}</li>
 *   <li>{@link lego_mindstorm.impl.Lego_mindstom_ntx2Impl#getMove_speed <em>Move speed</em>}</li>
 *   <li>{@link lego_mindstorm.impl.Lego_mindstom_ntx2Impl#getMac_address <em>Mac address</em>}</li>
 *   <li>{@link lego_mindstorm.impl.Lego_mindstom_ntx2Impl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Lego_mindstom_ntx2Impl extends ResourceImpl implements Lego_mindstom_ntx2 {
	
	
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
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final int ANGLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected int angle = ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMove_speed() <em>Move speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMove_speed()
	 * @generated
	 * @ordered
	 */
	protected static final int MOVE_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMove_speed() <em>Move speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMove_speed()
	 * @generated
	 * @ordered
	 */
	protected int move_speed = MOVE_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMac_address() <em>Mac address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac_address()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMac_address() <em>Mac address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac_address()
	 * @generated
	 * @ordered
	 */
	protected String mac_address = MAC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lego_mindstom_ntx2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lego_mindstormPackage.Literals.LEGO_MINDSTOM_NTX2;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(int newAngle) {
		int oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMove_speed() {
		return move_speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMove_speed(int newMove_speed) {
		int oldMove_speed = move_speed;
		move_speed = newMove_speed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__MOVE_SPEED, oldMove_speed, move_speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMac_address() {
		return mac_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMac_address(String newMac_address) {
		String oldMac_address = mac_address;
		mac_address = newMac_address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__MAC_ADDRESS, oldMac_address, mac_address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void move_forward() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void move_backward() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void rotate_right() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void rotate_left() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop_move() {
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
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__NAME:
				return getName();
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__ANGLE:
				return getAngle();
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__MOVE_SPEED:
				return getMove_speed();
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__MAC_ADDRESS:
				return getMac_address();
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__DURATION:
				return getDuration();
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
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__NAME:
				setName((String)newValue);
				return;
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__ANGLE:
				setAngle((Integer)newValue);
				return;
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__MOVE_SPEED:
				setMove_speed((Integer)newValue);
				return;
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__MAC_ADDRESS:
				setMac_address((String)newValue);
				return;
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__DURATION:
				setDuration((Integer)newValue);
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
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__ANGLE:
				setAngle(ANGLE_EDEFAULT);
				return;
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__MOVE_SPEED:
				setMove_speed(MOVE_SPEED_EDEFAULT);
				return;
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__MAC_ADDRESS:
				setMac_address(MAC_ADDRESS_EDEFAULT);
				return;
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__DURATION:
				setDuration(DURATION_EDEFAULT);
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
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__ANGLE:
				return angle != ANGLE_EDEFAULT;
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__MOVE_SPEED:
				return move_speed != MOVE_SPEED_EDEFAULT;
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__MAC_ADDRESS:
				return MAC_ADDRESS_EDEFAULT == null ? mac_address != null : !MAC_ADDRESS_EDEFAULT.equals(mac_address);
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2__DURATION:
				return duration != DURATION_EDEFAULT;
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
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2___MOVE_FORWARD:
				move_forward();
				return null;
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2___MOVE_BACKWARD:
				move_backward();
				return null;
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2___ROTATE_RIGHT:
				rotate_right();
				return null;
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2___ROTATE_LEFT:
				rotate_left();
				return null;
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2___STOP_MOVE:
				stop_move();
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
		result.append(", angle: ");
		result.append(angle);
		result.append(", move_speed: ");
		result.append(move_speed);
		result.append(", mac_address: ");
		result.append(mac_address);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //Lego_mindstom_ntx2Impl
