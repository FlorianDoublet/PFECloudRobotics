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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robotgator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lego_mindstorm.Robotgator#getUltra_sound_value <em>Ultra sound value</em>}</li>
 * </ul>
 *
 * @see lego_mindstorm.Lego_mindstormPackage#getRobotgator()
 * @model annotation="OCCIE2Ecore title='null'"
 * @generated
 */
public interface Robotgator extends Lego_mindstom_ntx2 {
	/**
	 * Returns the value of the '<em><b>Ultra sound value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ultra sound value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ultra sound value</em>' attribute.
	 * @see #setUltra_sound_value(int)
	 * @see lego_mindstorm.Lego_mindstormPackage#getRobotgator_Ultra_sound_value()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	int getUltra_sound_value();

	/**
	 * Sets the value of the '{@link lego_mindstorm.Robotgator#getUltra_sound_value <em>Ultra sound value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ultra sound value</em>' attribute.
	 * @see #getUltra_sound_value()
	 * @generated
	 */
	void setUltra_sound_value(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void open_mouth();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void close_mouth();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void read_ultra_sound();

} // Robotgator
