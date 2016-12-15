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

import lego_mindstorm.Lego_mindstom_ntx2;
import lego_mindstorm.Lego_mindstormFactory;
import lego_mindstorm.Lego_mindstormPackage;

import lego_mindstorm.Robotgator;
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
public class Lego_mindstormPackageImpl extends EPackageImpl implements Lego_mindstormPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lego_mindstom_ntx2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotgatorEClass = null;

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
	 * @see lego_mindstorm.Lego_mindstormPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Lego_mindstormPackageImpl() {
		super(eNS_URI, Lego_mindstormFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Lego_mindstormPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Lego_mindstormPackage init() {
		if (isInited) return (Lego_mindstormPackage)EPackage.Registry.INSTANCE.getEPackage(Lego_mindstormPackage.eNS_URI);

		// Obtain or create and register package
		Lego_mindstormPackageImpl theLego_mindstormPackage = (Lego_mindstormPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Lego_mindstormPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Lego_mindstormPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLego_mindstormPackage.createPackageContents();

		// Initialize created meta-data
		theLego_mindstormPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLego_mindstormPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Lego_mindstormPackage.eNS_URI, theLego_mindstormPackage);
		return theLego_mindstormPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLego_mindstom_ntx2() {
		return lego_mindstom_ntx2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLego_mindstom_ntx2_Name() {
		return (EAttribute)lego_mindstom_ntx2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLego_mindstom_ntx2_Angle() {
		return (EAttribute)lego_mindstom_ntx2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLego_mindstom_ntx2_Move_speed() {
		return (EAttribute)lego_mindstom_ntx2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLego_mindstom_ntx2_Mac_address() {
		return (EAttribute)lego_mindstom_ntx2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLego_mindstom_ntx2_Duration() {
		return (EAttribute)lego_mindstom_ntx2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLego_mindstom_ntx2__Move_forward() {
		return lego_mindstom_ntx2EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLego_mindstom_ntx2__Move_backward() {
		return lego_mindstom_ntx2EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLego_mindstom_ntx2__Rotate_right() {
		return lego_mindstom_ntx2EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLego_mindstom_ntx2__Rotate_left() {
		return lego_mindstom_ntx2EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLego_mindstom_ntx2__Stop_move() {
		return lego_mindstom_ntx2EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobotgator() {
		return robotgatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotgator_Ultra_sound_value() {
		return (EAttribute)robotgatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRobotgator__Open_mouth() {
		return robotgatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRobotgator__Close_mouth() {
		return robotgatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRobotgator__Read_ultra_sound() {
		return robotgatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lego_mindstormFactory getLego_mindstormFactory() {
		return (Lego_mindstormFactory)getEFactoryInstance();
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
		lego_mindstom_ntx2EClass = createEClass(LEGO_MINDSTOM_NTX2);
		createEAttribute(lego_mindstom_ntx2EClass, LEGO_MINDSTOM_NTX2__NAME);
		createEAttribute(lego_mindstom_ntx2EClass, LEGO_MINDSTOM_NTX2__ANGLE);
		createEAttribute(lego_mindstom_ntx2EClass, LEGO_MINDSTOM_NTX2__MOVE_SPEED);
		createEAttribute(lego_mindstom_ntx2EClass, LEGO_MINDSTOM_NTX2__MAC_ADDRESS);
		createEAttribute(lego_mindstom_ntx2EClass, LEGO_MINDSTOM_NTX2__DURATION);
		createEOperation(lego_mindstom_ntx2EClass, LEGO_MINDSTOM_NTX2___MOVE_FORWARD);
		createEOperation(lego_mindstom_ntx2EClass, LEGO_MINDSTOM_NTX2___MOVE_BACKWARD);
		createEOperation(lego_mindstom_ntx2EClass, LEGO_MINDSTOM_NTX2___ROTATE_RIGHT);
		createEOperation(lego_mindstom_ntx2EClass, LEGO_MINDSTOM_NTX2___ROTATE_LEFT);
		createEOperation(lego_mindstom_ntx2EClass, LEGO_MINDSTOM_NTX2___STOP_MOVE);

		robotgatorEClass = createEClass(ROBOTGATOR);
		createEAttribute(robotgatorEClass, ROBOTGATOR__ULTRA_SOUND_VALUE);
		createEOperation(robotgatorEClass, ROBOTGATOR___OPEN_MOUTH);
		createEOperation(robotgatorEClass, ROBOTGATOR___CLOSE_MOUTH);
		createEOperation(robotgatorEClass, ROBOTGATOR___READ_ULTRA_SOUND);
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
		lego_mindstom_ntx2EClass.getESuperTypes().add(theOCCIPackage.getResource());
		robotgatorEClass.getESuperTypes().add(this.getLego_mindstom_ntx2());

		// Initialize classes, features, and operations; add parameters
		initEClass(lego_mindstom_ntx2EClass, Lego_mindstom_ntx2.class, "Lego_mindstom_ntx2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLego_mindstom_ntx2_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Lego_mindstom_ntx2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLego_mindstom_ntx2_Angle(), theOCCIPackage.getNumber(), "angle", null, 0, 1, Lego_mindstom_ntx2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLego_mindstom_ntx2_Move_speed(), theOCCIPackage.getNumber(), "move_speed", null, 0, 1, Lego_mindstom_ntx2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLego_mindstom_ntx2_Mac_address(), theOCCIPackage.getString(), "mac_address", null, 1, 1, Lego_mindstom_ntx2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLego_mindstom_ntx2_Duration(), theOCCIPackage.getNumber(), "duration", null, 0, 1, Lego_mindstom_ntx2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLego_mindstom_ntx2__Move_forward(), null, "move_forward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLego_mindstom_ntx2__Move_backward(), null, "move_backward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLego_mindstom_ntx2__Rotate_right(), null, "rotate_right", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLego_mindstom_ntx2__Rotate_left(), null, "rotate_left", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLego_mindstom_ntx2__Stop_move(), null, "stop_move", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(robotgatorEClass, Robotgator.class, "Robotgator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRobotgator_Ultra_sound_value(), theOCCIPackage.getNumber(), "ultra_sound_value", null, 0, 1, Robotgator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRobotgator__Open_mouth(), null, "open_mouth", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRobotgator__Close_mouth(), null, "close_mouth", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRobotgator__Read_ultra_sound(), null, "read_ultra_sound", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		  (lego_mindstom_ntx2EClass, 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getLego_mindstom_ntx2__Move_forward(), 
		   source, 
		   new String[] {
			 "title", "Move forward"
		   });	
		addAnnotation
		  (getLego_mindstom_ntx2__Move_backward(), 
		   source, 
		   new String[] {
			 "title", "Move backward"
		   });	
		addAnnotation
		  (getLego_mindstom_ntx2__Rotate_right(), 
		   source, 
		   new String[] {
			 "title", "Rotate right"
		   });	
		addAnnotation
		  (getLego_mindstom_ntx2__Rotate_left(), 
		   source, 
		   new String[] {
			 "title", "Rotate left"
		   });	
		addAnnotation
		  (getLego_mindstom_ntx2__Stop_move(), 
		   source, 
		   new String[] {
			 "title", "Stop move"
		   });	
		addAnnotation
		  (getLego_mindstom_ntx2_Name(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getLego_mindstom_ntx2_Angle(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getLego_mindstom_ntx2_Move_speed(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getLego_mindstom_ntx2_Mac_address(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getLego_mindstom_ntx2_Duration(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (robotgatorEClass, 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getRobotgator__Open_mouth(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getRobotgator__Close_mouth(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getRobotgator__Read_ultra_sound(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getRobotgator_Ultra_sound_value(), 
		   source, 
		   new String[] {
			 "description", null
		   });
	}

} //Lego_mindstormPackageImpl
