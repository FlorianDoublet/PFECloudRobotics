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
package lego_mindstorm;

import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lego mindstom ntx2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lego_mindstorm.Lego_mindstom_ntx2#getName <em>Name</em>}</li>
 *   <li>{@link lego_mindstorm.Lego_mindstom_ntx2#getAngle <em>Angle</em>}</li>
 *   <li>{@link lego_mindstorm.Lego_mindstom_ntx2#getMove_speed <em>Move speed</em>}</li>
 *   <li>{@link lego_mindstorm.Lego_mindstom_ntx2#getMac_address <em>Mac address</em>}</li>
 *   <li>{@link lego_mindstorm.Lego_mindstom_ntx2#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see lego_mindstorm.Lego_mindstormPackage#getLego_mindstom_ntx2()
 * @model annotation="OCCIE2Ecore title='null'"
 * @generated
 */
public interface Lego_mindstom_ntx2 extends Resource {
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
	 * @see lego_mindstorm.Lego_mindstormPackage#getLego_mindstom_ntx2_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lego_mindstorm.Lego_mindstom_ntx2#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(int)
	 * @see lego_mindstorm.Lego_mindstormPackage#getLego_mindstom_ntx2_Angle()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	int getAngle();

	/**
	 * Sets the value of the '{@link lego_mindstorm.Lego_mindstom_ntx2#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(int value);

	/**
	 * Returns the value of the '<em><b>Move speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move speed</em>' attribute.
	 * @see #setMove_speed(int)
	 * @see lego_mindstorm.Lego_mindstormPackage#getLego_mindstom_ntx2_Move_speed()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	int getMove_speed();

	/**
	 * Sets the value of the '{@link lego_mindstorm.Lego_mindstom_ntx2#getMove_speed <em>Move speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move speed</em>' attribute.
	 * @see #getMove_speed()
	 * @generated
	 */
	void setMove_speed(int value);

	/**
	 * Returns the value of the '<em><b>Mac address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac address</em>' attribute.
	 * @see #setMac_address(String)
	 * @see lego_mindstorm.Lego_mindstormPackage#getLego_mindstom_ntx2_Mac_address()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getMac_address();

	/**
	 * Sets the value of the '{@link lego_mindstorm.Lego_mindstom_ntx2#getMac_address <em>Mac address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac address</em>' attribute.
	 * @see #getMac_address()
	 * @generated
	 */
	void setMac_address(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see lego_mindstorm.Lego_mindstormPackage#getLego_mindstom_ntx2_Duration()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link lego_mindstorm.Lego_mindstom_ntx2#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Move forward'"
	 * @generated
	 */
	void move_forward();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Move backward'"
	 * @generated
	 */
	void move_backward();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Rotate right'"
	 * @generated
	 */
	void rotate_right();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Rotate left'"
	 * @generated
	 */
	void rotate_left();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Stop move'"
	 * @generated
	 */
	void stop_move();

} // Lego_mindstom_ntx2
