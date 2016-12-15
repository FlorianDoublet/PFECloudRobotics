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

import lego_mindstorm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Lego_mindstormFactoryImpl extends EFactoryImpl implements Lego_mindstormFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Lego_mindstormFactory init() {
		try {
			Lego_mindstormFactory theLego_mindstormFactory = (Lego_mindstormFactory)EPackage.Registry.INSTANCE.getEFactory(Lego_mindstormPackage.eNS_URI);
			if (theLego_mindstormFactory != null) {
				return theLego_mindstormFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Lego_mindstormFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lego_mindstormFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Lego_mindstormPackage.LEGO_MINDSTOM_NTX2: return createLego_mindstom_ntx2();
			case Lego_mindstormPackage.ROBOTGATOR: return createRobotgator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lego_mindstom_ntx2 createLego_mindstom_ntx2() {
		Lego_mindstom_ntx2Impl lego_mindstom_ntx2 = new Lego_mindstom_ntx2Impl();
		return lego_mindstom_ntx2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robotgator createRobotgator() {
		RobotgatorImpl robotgator = new RobotgatorImpl();
		return robotgator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lego_mindstormPackage getLego_mindstormPackage() {
		return (Lego_mindstormPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Lego_mindstormPackage getPackage() {
		return Lego_mindstormPackage.eINSTANCE;
	}

} //Lego_mindstormFactoryImpl
