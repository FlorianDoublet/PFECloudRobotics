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
package turtlebot.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.occiware.clouddesigner.occi.OCCIPackage;

import turtlebot.Turtlebot;
import turtlebot.TurtlebotFactory;
import turtlebot.TurtlebotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurtlebotPackageImpl extends EPackageImpl implements TurtlebotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turtlebotEClass = null;

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
	 * @see turtlebot.TurtlebotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TurtlebotPackageImpl() {
		super(eNS_URI, TurtlebotFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TurtlebotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TurtlebotPackage init() {
		if (isInited) return (TurtlebotPackage)EPackage.Registry.INSTANCE.getEPackage(TurtlebotPackage.eNS_URI);

		// Obtain or create and register package
		TurtlebotPackageImpl theTurtlebotPackage = (TurtlebotPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TurtlebotPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TurtlebotPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTurtlebotPackage.createPackageContents();

		// Initialize created meta-data
		theTurtlebotPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTurtlebotPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TurtlebotPackage.eNS_URI, theTurtlebotPackage);
		return theTurtlebotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurtlebot() {
		return turtlebotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurtlebot_Duration() {
		return (EAttribute)turtlebotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurtlebot_User() {
		return (EAttribute)turtlebotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurtlebot_Ip_address() {
		return (EAttribute)turtlebotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurtlebot_Password() {
		return (EAttribute)turtlebotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTurtlebot__Move_forward() {
		return turtlebotEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTurtlebot__Move_backward() {
		return turtlebotEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTurtlebot__Turn_left() {
		return turtlebotEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTurtlebot__Turn_right() {
		return turtlebotEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTurtlebot__Stop() {
		return turtlebotEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtlebotFactory getTurtlebotFactory() {
		return (TurtlebotFactory)getEFactoryInstance();
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
		turtlebotEClass = createEClass(TURTLEBOT);
		createEAttribute(turtlebotEClass, TURTLEBOT__DURATION);
		createEAttribute(turtlebotEClass, TURTLEBOT__USER);
		createEAttribute(turtlebotEClass, TURTLEBOT__IP_ADDRESS);
		createEAttribute(turtlebotEClass, TURTLEBOT__PASSWORD);
		createEOperation(turtlebotEClass, TURTLEBOT___MOVE_FORWARD);
		createEOperation(turtlebotEClass, TURTLEBOT___MOVE_BACKWARD);
		createEOperation(turtlebotEClass, TURTLEBOT___TURN_LEFT);
		createEOperation(turtlebotEClass, TURTLEBOT___TURN_RIGHT);
		createEOperation(turtlebotEClass, TURTLEBOT___STOP);
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
		turtlebotEClass.getESuperTypes().add(theOCCIPackage.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(turtlebotEClass, Turtlebot.class, "Turtlebot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurtlebot_Duration(), theOCCIPackage.getNumber(), "duration", "1000", 0, 1, Turtlebot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurtlebot_User(), theOCCIPackage.getString(), "user", null, 0, 1, Turtlebot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurtlebot_Ip_address(), theOCCIPackage.getString(), "ip_address", null, 0, 1, Turtlebot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurtlebot_Password(), theOCCIPackage.getString(), "password", null, 0, 1, Turtlebot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTurtlebot__Move_forward(), null, "move_forward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTurtlebot__Move_backward(), null, "move_backward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTurtlebot__Turn_left(), null, "turn_left", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTurtlebot__Turn_right(), null, "turn_right", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTurtlebot__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		  (turtlebotEClass, 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getTurtlebot__Move_forward(), 
		   source, 
		   new String[] {
			 "title", "The turtlebot move forward"
		   });	
		addAnnotation
		  (getTurtlebot__Move_backward(), 
		   source, 
		   new String[] {
			 "title", "The turtlebot move backward"
		   });	
		addAnnotation
		  (getTurtlebot__Turn_left(), 
		   source, 
		   new String[] {
			 "title", "The turtlebot turn left"
		   });	
		addAnnotation
		  (getTurtlebot__Turn_right(), 
		   source, 
		   new String[] {
			 "title", "The turtlebot turn right"
		   });	
		addAnnotation
		  (getTurtlebot__Stop(), 
		   source, 
		   new String[] {
			 "title", "Force the turtlebot to stop"
		   });	
		addAnnotation
		  (getTurtlebot_Duration(), 
		   source, 
		   new String[] {
			 "description", "Duration of a moving commande (forward or backward)"
		   });	
		addAnnotation
		  (getTurtlebot_User(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getTurtlebot_Ip_address(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getTurtlebot_Password(), 
		   source, 
		   new String[] {
			 "description", null
		   });
	}

} //TurtlebotPackageImpl
