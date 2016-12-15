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
 * Generated at Thu Dec 15 10:35:46 CET 2016 from platform:/resource/lego_mindstorm/model/lego_mindstorm.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package lego_mindstorm.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import control.MindstormControl;
import lego_mindstorm.utils.LegoMindstormBasic;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/lego_mindstorm#
 * - term: robotgator
 * - title: 
 */
public class RobotgatorConnector extends lego_mindstorm.impl.RobotgatorImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(RobotgatorConnector.class);
	private LegoMindstormBasic mindstormBasic = new LegoMindstormBasic();

	/**
	 * Constructs a robotgator connector.
	 */
	RobotgatorConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Robotgator instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

		mindstormBasic.occiCreate("Robogator", "00:16:53:13:1B:B0");
		//default duration
		this.setDuration(1000);
		//default angle
		this.setAngle(45);
	}

	/**
	 * Called when this Robotgator instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Robotgator instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Robotgator instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
		mindstormBasic.occiDelete();
	}

	//
	// Robotgator actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/lego_mindstorm/robotgator/action#
     * - term: open_mouth
     * - title: 
	 */
	@Override
	public void open_mouth()
	{
		LOGGER.debug("Action open_mouth() called on " + this);

		// TODO: Implement how to open_mouth this robotgator.
		mindstormBasic.mindstormControl.openMouth(angle);	
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/lego_mindstorm/robotgator/action#
     * - term: close_mouth
     * - title: 
	 */
	@Override
	public void close_mouth()
	{
		LOGGER.debug("Action close_mouth() called on " + this);

		// TODO: Implement how to close_mouth this robotgator.
		mindstormBasic.mindstormControl.closeMouth(angle);
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/lego_mindstorm/robotgator/action#
     * - term: read_ultra_sound
     * - title: 
	 */
	@Override
	public void read_ultra_sound()
	{
		LOGGER.debug("Action read_ultra_sound() called on " + this);

		// TODO: Implement how to read_ultra_sound this robotgator.
		this.setUltra_sound_value( mindstormBasic.mindstormControl.getUltraSonic());
	}
	
	@Override
	public void move_forward()
	{
		LOGGER.debug("Action move_forward() called on " + this);

		mindstormBasic.move_forward(this.duration);
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

		mindstormBasic.move_backward(this.duration);
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
		mindstormBasic.rotate_right(this.duration);
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

		mindstormBasic.rotate_left(this.duration);
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

		mindstormBasic.stop_move();
	}
	

}	
