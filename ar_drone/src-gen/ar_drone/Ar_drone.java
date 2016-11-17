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
package ar_drone;

import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ar drone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ar_drone.Ar_drone#getName <em>Name</em>}</li>
 *   <li>{@link ar_drone.Ar_drone#getLeft_right_tilt <em>Left right tilt</em>}</li>
 *   <li>{@link ar_drone.Ar_drone#getFront_back_tilt <em>Front back tilt</em>}</li>
 *   <li>{@link ar_drone.Ar_drone#getVertical_speed <em>Vertical speed</em>}</li>
 *   <li>{@link ar_drone.Ar_drone#getAngular_speed <em>Angular speed</em>}</li>
 * </ul>
 *
 * @see ar_drone.Ar_dronePackage#getAr_drone()
 * @model annotation="OCCIE2Ecore title='null'"
 * @generated
 */
public interface Ar_drone extends Resource {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ar_drone.Ar_dronePackage#getAr_drone_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ar_drone.Ar_drone#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Left right tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left right tilt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left right tilt</em>' attribute.
	 * @see #setLeft_right_tilt(int)
	 * @see ar_drone.Ar_dronePackage#getAr_drone_Left_right_tilt()
	 * @model dataType="org.occiware.clouddesigner.occi.Number" required="true"
	 *        annotation="OCCIE2Ecore description='The left-right tilt (aka. \"drone roll\" or phi\r\n     *            angle) argument is a percentage of the maximum inclination as\r\n     *            configured here. A negative value makes the drone tilt to its\r\n     *            left, thus flying leftward. A positive value makes the drone\r\n     *            tilt to its right, thus flying rightward.'"
	 * @generated
	 */
	int getLeft_right_tilt();

	/**
	 * Sets the value of the '{@link ar_drone.Ar_drone#getLeft_right_tilt <em>Left right tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left right tilt</em>' attribute.
	 * @see #getLeft_right_tilt()
	 * @generated
	 */
	void setLeft_right_tilt(int value);

	/**
	 * Returns the value of the '<em><b>Front back tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Front back tilt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front back tilt</em>' attribute.
	 * @see #setFront_back_tilt(int)
	 * @see ar_drone.Ar_dronePackage#getAr_drone_Front_back_tilt()
	 * @model dataType="org.occiware.clouddesigner.occi.Number" required="true"
	 *        annotation="OCCIE2Ecore description='The front-back tilt (aka. \"drone pitch\" or theta\r\n     *            angle) argument is a percentage of the maximum inclination as\r\n     *            configured here. A negative value makes the drone lower its\r\n     *            nose, thus flying frontward. A positive value makes the drone\r\n     *            raise its nose, thus flying backward. The drone translation\r\n     *            speed in the horizontal plane depends on the environment and\r\n     *            cannot be determined. With roll or pitch values set to 0, the\r\n     *            drone will stay horizontal but continue sliding in the air\r\n     *            because of its inertia. Only the air resistance will then make\r\n     *            it stop.'"
	 * @generated
	 */
	int getFront_back_tilt();

	/**
	 * Sets the value of the '{@link ar_drone.Ar_drone#getFront_back_tilt <em>Front back tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front back tilt</em>' attribute.
	 * @see #getFront_back_tilt()
	 * @generated
	 */
	void setFront_back_tilt(int value);

	/**
	 * Returns the value of the '<em><b>Vertical speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical speed</em>' attribute.
	 * @see #setVertical_speed(int)
	 * @see ar_drone.Ar_dronePackage#getAr_drone_Vertical_speed()
	 * @model dataType="org.occiware.clouddesigner.occi.Number" required="true"
	 *        annotation="OCCIE2Ecore description='The vertical speed (aka. \"gaz\") argument is a\r\n     *            percentage of the maximum vertical speed as defined here. A\r\n     *            positive value makes the drone rise in the air. A negative\r\n     *            value makes it go down.'"
	 * @generated
	 */
	int getVertical_speed();

	/**
	 * Sets the value of the '{@link ar_drone.Ar_drone#getVertical_speed <em>Vertical speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical speed</em>' attribute.
	 * @see #getVertical_speed()
	 * @generated
	 */
	void setVertical_speed(int value);

	/**
	 * Returns the value of the '<em><b>Angular speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angular speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angular speed</em>' attribute.
	 * @see #setAngular_speed(int)
	 * @see ar_drone.Ar_dronePackage#getAr_drone_Angular_speed()
	 * @model dataType="org.occiware.clouddesigner.occi.Number" required="true"
	 *        annotation="OCCIE2Ecore description='The angular speed argument is a percentage of the\r\n     *            maximum angular speed as defined here. A positive value makes\r\n     *            the drone spin right; a negative value makes it spin left.'"
	 * @generated
	 */
	int getAngular_speed();

	/**
	 * Sets the value of the '{@link ar_drone.Ar_drone#getAngular_speed <em>Angular speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular speed</em>' attribute.
	 * @see #getAngular_speed()
	 * @generated
	 */
	void setAngular_speed(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Move the drone'"
	 * @generated
	 */
	void move();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Land the drone'"
	 * @generated
	 */
	void land();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Take off the drone'"
	 * @generated
	 */
	void take_off();

} // Ar_drone
