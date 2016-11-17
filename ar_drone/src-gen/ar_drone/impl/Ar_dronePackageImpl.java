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
import ar_drone.Ar_droneFactory;
import ar_drone.Ar_dronePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.occiware.clouddesigner.occi.OCCIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ar_dronePackageImpl extends EPackageImpl implements Ar_dronePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ar_droneEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ar_drone.Ar_dronePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ar_dronePackageImpl() {
		super(eNS_URI, Ar_droneFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Ar_dronePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ar_dronePackage init() {
		if (isInited) return (Ar_dronePackage)EPackage.Registry.INSTANCE.getEPackage(Ar_dronePackage.eNS_URI);

		// Obtain or create and register package
		Ar_dronePackageImpl theAr_dronePackage = (Ar_dronePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Ar_dronePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Ar_dronePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAr_dronePackage.createPackageContents();

		// Initialize created meta-data
		theAr_dronePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAr_dronePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ar_dronePackage.eNS_URI, theAr_dronePackage);
		return theAr_dronePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAr_drone() {
		return ar_droneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAr_drone_Name() {
		return (EAttribute)ar_droneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAr_drone_Left_right_tilt() {
		return (EAttribute)ar_droneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAr_drone_Front_back_tilt() {
		return (EAttribute)ar_droneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAr_drone_Vertical_speed() {
		return (EAttribute)ar_droneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAr_drone_Angular_speed() {
		return (EAttribute)ar_droneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAr_drone__Move() {
		return ar_droneEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAr_drone__Land() {
		return ar_droneEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAr_drone__Take_off() {
		return ar_droneEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ar_droneFactory getAr_droneFactory() {
		return (Ar_droneFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ar_droneEClass = createEClass(AR_DRONE);
		createEAttribute(ar_droneEClass, AR_DRONE__NAME);
		createEAttribute(ar_droneEClass, AR_DRONE__LEFT_RIGHT_TILT);
		createEAttribute(ar_droneEClass, AR_DRONE__FRONT_BACK_TILT);
		createEAttribute(ar_droneEClass, AR_DRONE__VERTICAL_SPEED);
		createEAttribute(ar_droneEClass, AR_DRONE__ANGULAR_SPEED);
		createEOperation(ar_droneEClass, AR_DRONE___MOVE);
		createEOperation(ar_droneEClass, AR_DRONE___LAND);
		createEOperation(ar_droneEClass, AR_DRONE___TAKE_OFF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ar_droneEClass.getESuperTypes().add(theOCCIPackage.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(ar_droneEClass, Ar_drone.class, "Ar_drone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAr_drone_Name(), theOCCIPackage.getString(), "name", null, 0, 1, Ar_drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAr_drone_Left_right_tilt(), theOCCIPackage.getNumber(), "left_right_tilt", null, 1, 1, Ar_drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAr_drone_Front_back_tilt(), theOCCIPackage.getNumber(), "front_back_tilt", null, 1, 1, Ar_drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAr_drone_Vertical_speed(), theOCCIPackage.getNumber(), "vertical_speed", null, 1, 1, Ar_drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAr_drone_Angular_speed(), theOCCIPackage.getNumber(), "angular_speed", null, 1, 1, Ar_drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAr_drone__Move(), null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAr_drone__Land(), null, "land", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAr_drone__Take_off(), null, "take_off", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// OCCIE2Ecore
		createOCCIE2EcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>OCCIE2Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCCIE2EcoreAnnotations() {
		String source = "OCCIE2Ecore";	
		addAnnotation
		  (ar_droneEClass, 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getAr_drone__Move(), 
		   source, 
		   new String[] {
			 "title", "Move the drone"
		   });	
		addAnnotation
		  (getAr_drone__Land(), 
		   source, 
		   new String[] {
			 "title", "Land the drone"
		   });	
		addAnnotation
		  (getAr_drone__Take_off(), 
		   source, 
		   new String[] {
			 "title", "Take off the drone"
		   });	
		addAnnotation
		  (getAr_drone_Name(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getAr_drone_Left_right_tilt(), 
		   source, 
		   new String[] {
			 "description", "The left-right tilt (aka. \"drone roll\" or phi\r\n     *            angle) argument is a percentage of the maximum inclination as\r\n     *            configured here. A negative value makes the drone tilt to its\r\n     *            left, thus flying leftward. A positive value makes the drone\r\n     *            tilt to its right, thus flying rightward."
		   });	
		addAnnotation
		  (getAr_drone_Front_back_tilt(), 
		   source, 
		   new String[] {
			 "description", "The front-back tilt (aka. \"drone pitch\" or theta\r\n     *            angle) argument is a percentage of the maximum inclination as\r\n     *            configured here. A negative value makes the drone lower its\r\n     *            nose, thus flying frontward. A positive value makes the drone\r\n     *            raise its nose, thus flying backward. The drone translation\r\n     *            speed in the horizontal plane depends on the environment and\r\n     *            cannot be determined. With roll or pitch values set to 0, the\r\n     *            drone will stay horizontal but continue sliding in the air\r\n     *            because of its inertia. Only the air resistance will then make\r\n     *            it stop."
		   });	
		addAnnotation
		  (getAr_drone_Vertical_speed(), 
		   source, 
		   new String[] {
			 "description", "The vertical speed (aka. \"gaz\") argument is a\r\n     *            percentage of the maximum vertical speed as defined here. A\r\n     *            positive value makes the drone rise in the air. A negative\r\n     *            value makes it go down."
		   });	
		addAnnotation
		  (getAr_drone_Angular_speed(), 
		   source, 
		   new String[] {
			 "description", "The angular speed argument is a percentage of the\r\n     *            maximum angular speed as defined here. A positive value makes\r\n     *            the drone spin right; a negative value makes it spin left."
		   });
	}

} //Ar_dronePackageImpl
