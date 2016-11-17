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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codeminders.ardrone.ARDrone;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/ar_drone#
 * - term: ar_drone
 * - title: 
 */
public class Ar_droneConnector extends ar_drone.impl.Ar_droneImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(Ar_droneConnector.class);
	private static int CONNECT_TIMEOUT = 3000; //3 sec
	private ARDrone drone;
	

	/**
	 * Constructs a ar_drone connector.
	 */
	Ar_droneConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Ar_drone instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

		// TODO: Implement this callback or remove this method.
		//create the object drone
		drone = new ARDrone(); 
		drone.connect();
		drone.clearEmergencySignal();
		drone.waitForReady(CONNECT_TIMEOUT);
		drone.trim();
	}

	/**
	 * Called when this Ar_drone instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Ar_drone instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Ar_drone instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// Ar_drone actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/ar_drone/ar_drone/action#
     * - term: move
     * - title: Move the drone
	 */
	@Override
	public void move()
	{
		LOGGER.debug("Action move() called on " + this);
		drone.move(this.name);

		// TODO: Implement how to move this ar_drone.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/ar_drone/ar_drone/action#
     * - term: land
     * - title: Land the drone
	 */
	@Override
	public void land()
	{
		LOGGER.debug("Action land() called on " + this);

		// TODO: Implement how to land this ar_drone.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/ar_drone/ar_drone/action#
     * - term: take_off
     * - title: Take off the drone
	 */
	@Override
	public void take_off()
	{
		LOGGER.debug("Action take_off() called on " + this);

		// TODO: Implement how to take_off this ar_drone.
	}

}	
