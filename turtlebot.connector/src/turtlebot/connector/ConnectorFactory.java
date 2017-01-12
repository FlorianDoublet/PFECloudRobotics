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

/**
 * Connector EFactory for the OCCI extension:
 * - name: turtlebot
 * - scheme: http://occiware.org/turtlebot#
 */
public class ConnectorFactory extends turtlebot.impl.TurtlebotFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/turtlebot#
	 * - term: turtlebot
	 * - title: 
	 */
	@Override
	public turtlebot.Turtlebot createTurtlebot() {
		return new TurtlebotConnector();
	}

}
