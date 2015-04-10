/**
 * @author Richard Shepard
 * @version Apr 10, 2015
 */
package com.rshepard.classes;

import com.rshepard.interfaces.CarbonFootPrint;

public class Bicycle extends Vehicle implements CarbonFootPrint {
	
	private boolean isMoving;
	private boolean isLocked;

	/**
	 * @param numWheels
	 * @param hasEngine
	 * @param type
	 */
	public Bicycle(int numWheels, boolean hasEngine, String type) {
		super(numWheels, hasEngine, type);
		isMoving = false;
		isLocked = true;
	}

	/* (non-Javadoc)
	 * @see com.rshepard.classes.Vehicle#getCarbonFootPrint()
	 */
	@Override
	public double getCarbonFootPrint() {
		return 0;
	}
	
	public String toString() {
		return super.toString();
	}
	
	public void pedal() {
		isLocked = false;
		isMoving = true;
		System.out.println("You are pedaling the bike.");
	}

	public void stop() {
		isMoving = false;
		System.out.println("Bike is Stopped");
	}
	
	public void lock() {
		if(!isMoving) {
			isLocked = true;
			System.out.println("Bike is locked.");
		} else {
			System.out.println("Must park bike first.");
		}
	}
	
	public void unlock() {
		isLocked = false;
	}
}
