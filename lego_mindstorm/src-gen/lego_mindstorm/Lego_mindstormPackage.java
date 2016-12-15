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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.occiware.clouddesigner.occi.OCCIPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see lego_mindstorm.Lego_mindstormFactory
 * @model kind="package"
 * @generated
 */
public interface Lego_mindstormPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lego_mindstorm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/lego_mindstorm/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lego_mindstorm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lego_mindstormPackage eINSTANCE = lego_mindstorm.impl.Lego_mindstormPackageImpl.init();

	/**
	 * The meta object id for the '{@link lego_mindstorm.impl.Lego_mindstom_ntx2Impl <em>Lego mindstom ntx2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lego_mindstorm.impl.Lego_mindstom_ntx2Impl
	 * @see lego_mindstorm.impl.Lego_mindstormPackageImpl#getLego_mindstom_ntx2()
	 * @generated
	 */
	int LEGO_MINDSTOM_NTX2 = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2__ANGLE = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Move speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2__MOVE_SPEED = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mac address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2__MAC_ADDRESS = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2__DURATION = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Lego mindstom ntx2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Move forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2___MOVE_FORWARD = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Move backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2___MOVE_BACKWARD = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Rotate right</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2___ROTATE_RIGHT = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Rotate left</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2___ROTATE_LEFT = OCCIPackage.RESOURCE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Stop move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2___STOP_MOVE = OCCIPackage.RESOURCE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Lego mindstom ntx2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_MINDSTOM_NTX2_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 5;


	/**
	 * The meta object id for the '{@link lego_mindstorm.impl.RobotgatorImpl <em>Robotgator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lego_mindstorm.impl.RobotgatorImpl
	 * @see lego_mindstorm.impl.Lego_mindstormPackageImpl#getRobotgator()
	 * @generated
	 */
	int ROBOTGATOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR__ID = LEGO_MINDSTOM_NTX2__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR__TITLE = LEGO_MINDSTOM_NTX2__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR__KIND = LEGO_MINDSTOM_NTX2__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR__MIXINS = LEGO_MINDSTOM_NTX2__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR__ATTRIBUTES = LEGO_MINDSTOM_NTX2__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR__SUMMARY = LEGO_MINDSTOM_NTX2__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR__LINKS = LEGO_MINDSTOM_NTX2__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR__NAME = LEGO_MINDSTOM_NTX2__NAME;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR__ANGLE = LEGO_MINDSTOM_NTX2__ANGLE;

	/**
	 * The feature id for the '<em><b>Move speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR__MOVE_SPEED = LEGO_MINDSTOM_NTX2__MOVE_SPEED;

	/**
	 * The feature id for the '<em><b>Mac address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR__MAC_ADDRESS = LEGO_MINDSTOM_NTX2__MAC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR__DURATION = LEGO_MINDSTOM_NTX2__DURATION;

	/**
	 * The feature id for the '<em><b>Ultra sound value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR__ULTRA_SOUND_VALUE = LEGO_MINDSTOM_NTX2_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Robotgator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR_FEATURE_COUNT = LEGO_MINDSTOM_NTX2_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR___OCCI_CREATE = LEGO_MINDSTOM_NTX2___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR___OCCI_RETRIEVE = LEGO_MINDSTOM_NTX2___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR___OCCI_UPDATE = LEGO_MINDSTOM_NTX2___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR___OCCI_DELETE = LEGO_MINDSTOM_NTX2___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Move forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR___MOVE_FORWARD = LEGO_MINDSTOM_NTX2___MOVE_FORWARD;

	/**
	 * The operation id for the '<em>Move backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR___MOVE_BACKWARD = LEGO_MINDSTOM_NTX2___MOVE_BACKWARD;

	/**
	 * The operation id for the '<em>Rotate right</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR___ROTATE_RIGHT = LEGO_MINDSTOM_NTX2___ROTATE_RIGHT;

	/**
	 * The operation id for the '<em>Rotate left</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR___ROTATE_LEFT = LEGO_MINDSTOM_NTX2___ROTATE_LEFT;

	/**
	 * The operation id for the '<em>Stop move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR___STOP_MOVE = LEGO_MINDSTOM_NTX2___STOP_MOVE;

	/**
	 * The operation id for the '<em>Open mouth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR___OPEN_MOUTH = LEGO_MINDSTOM_NTX2_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Close mouth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR___CLOSE_MOUTH = LEGO_MINDSTOM_NTX2_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Read ultra sound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR___READ_ULTRA_SOUND = LEGO_MINDSTOM_NTX2_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Robotgator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTGATOR_OPERATION_COUNT = LEGO_MINDSTOM_NTX2_OPERATION_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link lego_mindstorm.Lego_mindstom_ntx2 <em>Lego mindstom ntx2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lego mindstom ntx2</em>'.
	 * @see lego_mindstorm.Lego_mindstom_ntx2
	 * @generated
	 */
	EClass getLego_mindstom_ntx2();

	/**
	 * Returns the meta object for the attribute '{@link lego_mindstorm.Lego_mindstom_ntx2#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lego_mindstorm.Lego_mindstom_ntx2#getName()
	 * @see #getLego_mindstom_ntx2()
	 * @generated
	 */
	EAttribute getLego_mindstom_ntx2_Name();

	/**
	 * Returns the meta object for the attribute '{@link lego_mindstorm.Lego_mindstom_ntx2#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see lego_mindstorm.Lego_mindstom_ntx2#getAngle()
	 * @see #getLego_mindstom_ntx2()
	 * @generated
	 */
	EAttribute getLego_mindstom_ntx2_Angle();

	/**
	 * Returns the meta object for the attribute '{@link lego_mindstorm.Lego_mindstom_ntx2#getMove_speed <em>Move speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move speed</em>'.
	 * @see lego_mindstorm.Lego_mindstom_ntx2#getMove_speed()
	 * @see #getLego_mindstom_ntx2()
	 * @generated
	 */
	EAttribute getLego_mindstom_ntx2_Move_speed();

	/**
	 * Returns the meta object for the attribute '{@link lego_mindstorm.Lego_mindstom_ntx2#getMac_address <em>Mac address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac address</em>'.
	 * @see lego_mindstorm.Lego_mindstom_ntx2#getMac_address()
	 * @see #getLego_mindstom_ntx2()
	 * @generated
	 */
	EAttribute getLego_mindstom_ntx2_Mac_address();

	/**
	 * Returns the meta object for the attribute '{@link lego_mindstorm.Lego_mindstom_ntx2#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see lego_mindstorm.Lego_mindstom_ntx2#getDuration()
	 * @see #getLego_mindstom_ntx2()
	 * @generated
	 */
	EAttribute getLego_mindstom_ntx2_Duration();

	/**
	 * Returns the meta object for the '{@link lego_mindstorm.Lego_mindstom_ntx2#move_forward() <em>Move forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move forward</em>' operation.
	 * @see lego_mindstorm.Lego_mindstom_ntx2#move_forward()
	 * @generated
	 */
	EOperation getLego_mindstom_ntx2__Move_forward();

	/**
	 * Returns the meta object for the '{@link lego_mindstorm.Lego_mindstom_ntx2#move_backward() <em>Move backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move backward</em>' operation.
	 * @see lego_mindstorm.Lego_mindstom_ntx2#move_backward()
	 * @generated
	 */
	EOperation getLego_mindstom_ntx2__Move_backward();

	/**
	 * Returns the meta object for the '{@link lego_mindstorm.Lego_mindstom_ntx2#rotate_right() <em>Rotate right</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rotate right</em>' operation.
	 * @see lego_mindstorm.Lego_mindstom_ntx2#rotate_right()
	 * @generated
	 */
	EOperation getLego_mindstom_ntx2__Rotate_right();

	/**
	 * Returns the meta object for the '{@link lego_mindstorm.Lego_mindstom_ntx2#rotate_left() <em>Rotate left</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rotate left</em>' operation.
	 * @see lego_mindstorm.Lego_mindstom_ntx2#rotate_left()
	 * @generated
	 */
	EOperation getLego_mindstom_ntx2__Rotate_left();

	/**
	 * Returns the meta object for the '{@link lego_mindstorm.Lego_mindstom_ntx2#stop_move() <em>Stop move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop move</em>' operation.
	 * @see lego_mindstorm.Lego_mindstom_ntx2#stop_move()
	 * @generated
	 */
	EOperation getLego_mindstom_ntx2__Stop_move();

	/**
	 * Returns the meta object for class '{@link lego_mindstorm.Robotgator <em>Robotgator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robotgator</em>'.
	 * @see lego_mindstorm.Robotgator
	 * @generated
	 */
	EClass getRobotgator();

	/**
	 * Returns the meta object for the attribute '{@link lego_mindstorm.Robotgator#getUltra_sound_value <em>Ultra sound value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ultra sound value</em>'.
	 * @see lego_mindstorm.Robotgator#getUltra_sound_value()
	 * @see #getRobotgator()
	 * @generated
	 */
	EAttribute getRobotgator_Ultra_sound_value();

	/**
	 * Returns the meta object for the '{@link lego_mindstorm.Robotgator#open_mouth() <em>Open mouth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open mouth</em>' operation.
	 * @see lego_mindstorm.Robotgator#open_mouth()
	 * @generated
	 */
	EOperation getRobotgator__Open_mouth();

	/**
	 * Returns the meta object for the '{@link lego_mindstorm.Robotgator#close_mouth() <em>Close mouth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close mouth</em>' operation.
	 * @see lego_mindstorm.Robotgator#close_mouth()
	 * @generated
	 */
	EOperation getRobotgator__Close_mouth();

	/**
	 * Returns the meta object for the '{@link lego_mindstorm.Robotgator#read_ultra_sound() <em>Read ultra sound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read ultra sound</em>' operation.
	 * @see lego_mindstorm.Robotgator#read_ultra_sound()
	 * @generated
	 */
	EOperation getRobotgator__Read_ultra_sound();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Lego_mindstormFactory getLego_mindstormFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link lego_mindstorm.impl.Lego_mindstom_ntx2Impl <em>Lego mindstom ntx2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lego_mindstorm.impl.Lego_mindstom_ntx2Impl
		 * @see lego_mindstorm.impl.Lego_mindstormPackageImpl#getLego_mindstom_ntx2()
		 * @generated
		 */
		EClass LEGO_MINDSTOM_NTX2 = eINSTANCE.getLego_mindstom_ntx2();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGO_MINDSTOM_NTX2__NAME = eINSTANCE.getLego_mindstom_ntx2_Name();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGO_MINDSTOM_NTX2__ANGLE = eINSTANCE.getLego_mindstom_ntx2_Angle();

		/**
		 * The meta object literal for the '<em><b>Move speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGO_MINDSTOM_NTX2__MOVE_SPEED = eINSTANCE.getLego_mindstom_ntx2_Move_speed();

		/**
		 * The meta object literal for the '<em><b>Mac address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGO_MINDSTOM_NTX2__MAC_ADDRESS = eINSTANCE.getLego_mindstom_ntx2_Mac_address();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGO_MINDSTOM_NTX2__DURATION = eINSTANCE.getLego_mindstom_ntx2_Duration();

		/**
		 * The meta object literal for the '<em><b>Move forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGO_MINDSTOM_NTX2___MOVE_FORWARD = eINSTANCE.getLego_mindstom_ntx2__Move_forward();

		/**
		 * The meta object literal for the '<em><b>Move backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGO_MINDSTOM_NTX2___MOVE_BACKWARD = eINSTANCE.getLego_mindstom_ntx2__Move_backward();

		/**
		 * The meta object literal for the '<em><b>Rotate right</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGO_MINDSTOM_NTX2___ROTATE_RIGHT = eINSTANCE.getLego_mindstom_ntx2__Rotate_right();

		/**
		 * The meta object literal for the '<em><b>Rotate left</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGO_MINDSTOM_NTX2___ROTATE_LEFT = eINSTANCE.getLego_mindstom_ntx2__Rotate_left();

		/**
		 * The meta object literal for the '<em><b>Stop move</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGO_MINDSTOM_NTX2___STOP_MOVE = eINSTANCE.getLego_mindstom_ntx2__Stop_move();

		/**
		 * The meta object literal for the '{@link lego_mindstorm.impl.RobotgatorImpl <em>Robotgator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lego_mindstorm.impl.RobotgatorImpl
		 * @see lego_mindstorm.impl.Lego_mindstormPackageImpl#getRobotgator()
		 * @generated
		 */
		EClass ROBOTGATOR = eINSTANCE.getRobotgator();

		/**
		 * The meta object literal for the '<em><b>Ultra sound value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTGATOR__ULTRA_SOUND_VALUE = eINSTANCE.getRobotgator_Ultra_sound_value();

		/**
		 * The meta object literal for the '<em><b>Open mouth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROBOTGATOR___OPEN_MOUTH = eINSTANCE.getRobotgator__Open_mouth();

		/**
		 * The meta object literal for the '<em><b>Close mouth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROBOTGATOR___CLOSE_MOUTH = eINSTANCE.getRobotgator__Close_mouth();

		/**
		 * The meta object literal for the '<em><b>Read ultra sound</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROBOTGATOR___READ_ULTRA_SOUND = eINSTANCE.getRobotgator__Read_ultra_sound();

	}

} //Lego_mindstormPackage
