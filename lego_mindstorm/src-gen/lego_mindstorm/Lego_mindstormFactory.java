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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lego_mindstorm.Lego_mindstormPackage
 * @generated
 */
public interface Lego_mindstormFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lego_mindstormFactory eINSTANCE = lego_mindstorm.impl.Lego_mindstormFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Lego mindstom ntx2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lego mindstom ntx2</em>'.
	 * @generated
	 */
	Lego_mindstom_ntx2 createLego_mindstom_ntx2();

	/**
	 * Returns a new object of class '<em>Robotgator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robotgator</em>'.
	 * @generated
	 */
	Robotgator createRobotgator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Lego_mindstormPackage getLego_mindstormPackage();

} //Lego_mindstormFactory
