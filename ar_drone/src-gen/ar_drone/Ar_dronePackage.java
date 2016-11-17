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
 * @see ar_drone.Ar_droneFactory
 * @model kind="package"
 * @generated
 */
public interface Ar_dronePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ar_drone";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/ar_drone/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ar_drone";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ar_dronePackage eINSTANCE = ar_drone.impl.Ar_dronePackageImpl.init();

	/**
	 * The meta object id for the '{@link ar_drone.impl.Ar_droneImpl <em>Ar drone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ar_drone.impl.Ar_droneImpl
	 * @see ar_drone.impl.Ar_dronePackageImpl#getAr_drone()
	 * @generated
	 */
	int AR_DRONE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left right tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__LEFT_RIGHT_TILT = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Front back tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__FRONT_BACK_TILT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vertical speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__VERTICAL_SPEED = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Angular speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__ANGULAR_SPEED = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ar drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE___MOVE = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Land</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE___LAND = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Take off</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE___TAKE_OFF = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ar drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link ar_drone.Ar_drone <em>Ar drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ar drone</em>'.
	 * @see ar_drone.Ar_drone
	 * @generated
	 */
	EClass getAr_drone();

	/**
	 * Returns the meta object for the attribute '{@link ar_drone.Ar_drone#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ar_drone.Ar_drone#getName()
	 * @see #getAr_drone()
	 * @generated
	 */
	EAttribute getAr_drone_Name();

	/**
	 * Returns the meta object for the attribute '{@link ar_drone.Ar_drone#getLeft_right_tilt <em>Left right tilt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left right tilt</em>'.
	 * @see ar_drone.Ar_drone#getLeft_right_tilt()
	 * @see #getAr_drone()
	 * @generated
	 */
	EAttribute getAr_drone_Left_right_tilt();

	/**
	 * Returns the meta object for the attribute '{@link ar_drone.Ar_drone#getFront_back_tilt <em>Front back tilt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Front back tilt</em>'.
	 * @see ar_drone.Ar_drone#getFront_back_tilt()
	 * @see #getAr_drone()
	 * @generated
	 */
	EAttribute getAr_drone_Front_back_tilt();

	/**
	 * Returns the meta object for the attribute '{@link ar_drone.Ar_drone#getVertical_speed <em>Vertical speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical speed</em>'.
	 * @see ar_drone.Ar_drone#getVertical_speed()
	 * @see #getAr_drone()
	 * @generated
	 */
	EAttribute getAr_drone_Vertical_speed();

	/**
	 * Returns the meta object for the attribute '{@link ar_drone.Ar_drone#getAngular_speed <em>Angular speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angular speed</em>'.
	 * @see ar_drone.Ar_drone#getAngular_speed()
	 * @see #getAr_drone()
	 * @generated
	 */
	EAttribute getAr_drone_Angular_speed();

	/**
	 * Returns the meta object for the '{@link ar_drone.Ar_drone#move() <em>Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move</em>' operation.
	 * @see ar_drone.Ar_drone#move()
	 * @generated
	 */
	EOperation getAr_drone__Move();

	/**
	 * Returns the meta object for the '{@link ar_drone.Ar_drone#land() <em>Land</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Land</em>' operation.
	 * @see ar_drone.Ar_drone#land()
	 * @generated
	 */
	EOperation getAr_drone__Land();

	/**
	 * Returns the meta object for the '{@link ar_drone.Ar_drone#take_off() <em>Take off</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Take off</em>' operation.
	 * @see ar_drone.Ar_drone#take_off()
	 * @generated
	 */
	EOperation getAr_drone__Take_off();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ar_droneFactory getAr_droneFactory();

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
		 * The meta object literal for the '{@link ar_drone.impl.Ar_droneImpl <em>Ar drone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ar_drone.impl.Ar_droneImpl
		 * @see ar_drone.impl.Ar_dronePackageImpl#getAr_drone()
		 * @generated
		 */
		EClass AR_DRONE = eINSTANCE.getAr_drone();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AR_DRONE__NAME = eINSTANCE.getAr_drone_Name();

		/**
		 * The meta object literal for the '<em><b>Left right tilt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AR_DRONE__LEFT_RIGHT_TILT = eINSTANCE.getAr_drone_Left_right_tilt();

		/**
		 * The meta object literal for the '<em><b>Front back tilt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AR_DRONE__FRONT_BACK_TILT = eINSTANCE.getAr_drone_Front_back_tilt();

		/**
		 * The meta object literal for the '<em><b>Vertical speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AR_DRONE__VERTICAL_SPEED = eINSTANCE.getAr_drone_Vertical_speed();

		/**
		 * The meta object literal for the '<em><b>Angular speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AR_DRONE__ANGULAR_SPEED = eINSTANCE.getAr_drone_Angular_speed();

		/**
		 * The meta object literal for the '<em><b>Move</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AR_DRONE___MOVE = eINSTANCE.getAr_drone__Move();

		/**
		 * The meta object literal for the '<em><b>Land</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AR_DRONE___LAND = eINSTANCE.getAr_drone__Land();

		/**
		 * The meta object literal for the '<em><b>Take off</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AR_DRONE___TAKE_OFF = eINSTANCE.getAr_drone__Take_off();

	}

} //Ar_dronePackage
