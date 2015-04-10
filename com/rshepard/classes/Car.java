/**
 * @author Richard Shepard
 * @version Apr 9, 2015
 */
package com.rshepard.classes;

import com.rshepard.interfaces.CarbonFootPrint;

public class Car extends Vehicle implements CarbonFootPrint{
	
	private int numPassengers;
	private int milesTraveled;
	private int mpg;
	private boolean isRunning;
	
	/**
	 * @param numWheels
	 * @param hasEngine
	 */
	public Car(int numWheels, boolean hasEngine, String type, int numPassengers, int milesTraveled, int mpg) {
		super(numWheels, hasEngine, type);
		this.numPassengers = numPassengers;
		this.milesTraveled = milesTraveled;
		this.mpg = mpg;
		isRunning = false;
	}
	
	public void startCar() {
		isRunning = true;
		System.out.println("Car is started,");
	}
	
	public void turnCarOff() {
		isRunning = false;
		System.out.println("Car is turned off.");
	}

	/* (non-Javadoc)
	 * @see com.rshepard.classes.Vehicle#getCarbonFootPrint()
	 */
	@Override
	public double getCarbonFootPrint() {
		final double TONS_CO2_PER_GALLON = 0.00891;
		double gallonsUsed = calculateGallonsPerYear();
		return gallonsUsed * TONS_CO2_PER_GALLON;
	}
	
	private double calculateGallonsPerYear() {
		return (milesTraveled / mpg);
	}
	
	public String toString() {
		String info = super.toString();
		info += "Miles Traveled:    " + milesTraveled;
		return info;
	}

	/**
	 * @return the milesTraveledPerYear
	 */
	public int getMilesTraveledPerYear() {
		return milesTraveled;
	}

	/**
	 * @param milesTraveledPerYear the milesTraveledPerYear to set
	 */
	public void setMilesTraveledPerYear(int milesTraveledPerYear) {
		this.milesTraveled = milesTraveledPerYear;
	}

	/**
	 * @return the numPassengers
	 */
	public int getNumPassengers() {
		return numPassengers;
	}

	/**
	 * @return the isRunning
	 */
	public boolean isRunning() {
		return isRunning;
	}

}
