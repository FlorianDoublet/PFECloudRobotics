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

/**
 * Connector EFactory for the OCCI extension:
 * - name: lego_mindstorm
 * - scheme: http://occiware.org/lego_mindstorm#
 */
public class ConnectorFactory extends lego_mindstorm.impl.Lego_mindstormFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/lego_mindstorm#
	 * - term: lego_mindstom_ntx2
	 * - title: 
	 */
	@Override
	public lego_mindstorm.Lego_mindstom_ntx2 createLego_mindstom_ntx2() {
		return new Lego_mindstom_ntx2Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/lego_mindstorm#
	 * - term: robotgator
	 * - title: 
	 */
	@Override
	public lego_mindstorm.Robotgator createRobotgator() {
		return new RobotgatorConnector();
	}

}
