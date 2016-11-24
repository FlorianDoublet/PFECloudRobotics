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
 * Generated at Thu Nov 24 14:21:03 CET 2016 from platform:/resource/lego_mindstorm/model/lego_mindstorm.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package lego_mindstorm.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import control.MindstormControl;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/lego_mindstorm#
 * - term: lego_mindstom_ntx2
 * - title: 
 */
public class Lego_mindstom_ntx2Connector extends lego_mindstorm.impl.Lego_mindstom_ntx2Impl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(Lego_mindstom_ntx2Connector.class);
	private MindstormControl mindstormControl;

	/**
	 * Constructs a lego_mindstom_ntx2 connector.
	 */
	Lego_mindstom_ntx2Connector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Lego_mindstom_ntx2 instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

		// TODO: Implement this callback or remove this method.
		mindstormControl = new MindstormControl("ClapTrap", "00:16:53:10:10:C3");
		//default duration
		this.setDuration(1000);
		//default angle
		this.setAngle(45);
		this.connection();
	}

	/**
	 * Called when this Lego_mindstom_ntx2 instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Lego_mindstom_ntx2 instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Lego_mindstom_ntx2 instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
		this.disconnect();
	}

	//
	// Lego_mindstom_ntx2 actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#
     * - term: move_forward
     * - title: Move forward
	 */
	@Override
	public void move_forward()
	{
		LOGGER.debug("Action move_forward() called on " + this);

		// TODO: Implement how to move_forward this lego_mindstom_ntx2.
		mindstormControl.move_forward(this.duration);
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#
     * - term: move_backward
     * - title: Move backward
	 */
	@Override
	public void move_backward()
	{
		LOGGER.debug("Action move_backward() called on " + this);

		// TODO: Implement how to move_backward this lego_mindstom_ntx2.
		mindstormControl.move_backward(this.duration);
		
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#
     * - term: rotate_right
     * - title: Rotate right
	 */
	@Override
	public void rotate_right()
	{
		LOGGER.debug("Action rotate_right() called on " + this);

		// TODO: Implement how to rotate_right this lego_mindstom_ntx2.
		mindstormControl.turnRight(this.angle);
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#
     * - term: rotate_left
     * - title: Rotate left
	 */
	@Override
	public void rotate_left()
	{
		LOGGER.debug("Action rotate_left() called on " + this);

		// TODO: Implement how to rotate_left this lego_mindstom_ntx2.
		mindstormControl.turnLeft(this.angle);
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#
     * - term: stop_move
     * - title: Stop move
	 */
	@Override
	public void stop_move()
	{
		LOGGER.debug("Action stop_move() called on " + this);

		// TODO: Implement how to stop_move this lego_mindstom_ntx2.
	}
	
	/**
	 * Connection to the device
	 */
	private void connection()
	{
		LOGGER.debug("Action connection() called on " + this);

		// TODO: Implement how to connection this lego_mindstom_ntx2.
		mindstormControl.BTconnect();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void disconnect()
	{
		LOGGER.debug("Action exit() called on " + this);

		// TODO: Implement how to exit this lego_mindstom_ntx2.
		mindstormControl.BTdisconnect();
	}

}	
