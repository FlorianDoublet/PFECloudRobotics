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
 * Generated at Thu Jan 12 14:54:08 CET 2017 from platform:/resource/turtlebot/model/turtlebot.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package turtlebot.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tb.TurtlebotControl;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/turtlebot#
 * - term: turtlebot
 * - title: 
 */
public class TurtlebotConnector extends turtlebot.impl.TurtlebotImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(TurtlebotConnector.class);
	private TurtlebotControl turtlebotControl;

	/**
	 * Constructs a turtlebot connector.
	 */
	TurtlebotConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Turtlebot instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this + " for the user " + this.getUser() + " at ip " + this.getIp_address());
		turtlebotControl = new TurtlebotControl(this.getUser(), this.getPassword(), this.getIp_address());
		turtlebotControl.connect();

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Turtlebot instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Turtlebot instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Turtlebot instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		turtlebotControl.disconnect();
		// TODO: Implement this callback or remove this method.
	}

	//
	// Turtlebot actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/turtlebot/turtlebot/action#
     * - term: move_forward
     * - title: The turtlebot move forward
	 */
	@Override
	public void move_forward()
	{
		LOGGER.debug("Action move_forward() called on " + this + " during " + this.getDuration());
		turtlebotControl.move_forward(this.getDuration());

		// TODO: Implement how to move_forward this turtlebot.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/turtlebot/turtlebot/action#
     * - term: move_backward
     * - title: The turtlebot move backward
	 */
	@Override
	public void move_backward()
	{
		LOGGER.debug("Action move_backward() called on " + this + " during " + this.getDuration());
		turtlebotControl.move_backward(this.getDuration());
		// TODO: Implement how to move_backward this turtlebot.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/turtlebot/turtlebot/action#
     * - term: turn_left
     * - title: The turtlebot turn left
	 */
	@Override
	public void turn_left()
	{
		LOGGER.debug("Action turn_left() called on " + this + " during " + this.getDuration());
		turtlebotControl.turnLeft(this.getDuration());
		// TODO: Implement how to turn_left this turtlebot.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/turtlebot/turtlebot/action#
     * - term: turn_right
     * - title: The turtlebot turn right
	 */
	@Override
	public void turn_right()
	{
		LOGGER.debug("Action turn_right() called on " + this + " during " + this.getDuration());
		turtlebotControl.turnRight(this.getDuration());
		// TODO: Implement how to turn_right this turtlebot.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/turtlebot/turtlebot/action#
     * - term: stop
     * - title: Force the turtlebot to stop
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);
		turtlebotControl.stop(this.getDuration());
		// TODO: Implement how to stop this turtlebot.
	}

}	
