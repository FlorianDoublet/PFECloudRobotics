/**
 * Copyright (c) 2016 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 *
 * Generated at Thu Nov 17 14:44:39 CET 2016 from platform:/resource/ar_drone/model/ar_drone.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package ar_drone.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: ar_drone
 * - scheme: http://occiware.org/ar_drone#
 */
public class ConnectorFactory extends ar_drone.impl.Ar_droneFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/ar_drone#
	 * - term: ar_drone
	 * - title: 
	 */
	@Override
	public ar_drone.Ar_drone createAr_drone() {
		return new Ar_droneConnector();
	}

}
