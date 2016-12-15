package lego_mindstorm.utils;

import java.util.ArrayList;
import java.util.List;

import control.MindstormControl;

public class LegoMindstormBasic {
	
	public MindstormControl mindstormControl;
	
	public String name;
	public String mac_address;
	
	
	public void occiCreate(String name, String mac_address)
	{
		this.name = name;
		this.mac_address = mac_address;
		mindstormControl = new MindstormControl(name, mac_address);
		this.connection();
	}
	
	public void occiDelete()
	{
		this.disconnect();
	}
	
	
	public void move_forward(int duration)
	{
		mindstormControl.move_forward(duration);
	}


	public void move_backward(int duration)
	{
		mindstormControl.move_backward(duration);
	}


	public void rotate_right(int value)
	{
		mindstormControl.turnRight(value);
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#
     * - term: rotate_left
     * - title: Rotate left
	 */
	public void rotate_left(int value)
	{
		mindstormControl.turnLeft(value);
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/lego_mindstorm/lego_mindstom_ntx2/action#
     * - term: stop_move
     * - title: Stop move
	 */
	public void stop_move()
	{
		mindstormControl.stop();
	}
	
	/**
	 * Connection to the device
	 */
	private void connection()
	{
		
		mindstormControl.BTconnect();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Disconnection to the device
	 */
	private void disconnect()
	{
		mindstormControl.BTdisconnect();
	}

}
