/**
 * @author Richard Shepard
 * @version Apr 10, 2015
 */
package com.rshepard.classes;

import com.rshepard.interfaces.CarbonFootPrint;

public class Building implements CarbonFootPrint {

	private int sqFeetPerFloor;
	private int numFloors;
	private boolean lightsOn;
	private boolean heatOn;
	private String type;
	
	private final int HOURS_PER_YEAR = 8736;
	

	public Building(int sqFeetPerFloor, int numFloors, String type) {
		this.sqFeetPerFloor = sqFeetPerFloor;
		this.numFloors = numFloors;
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see com.rshepard.interfaces.CarbonFootPrint#getCarbonFootPrint()
	 */
	@Override
	public double getCarbonFootPrint() {
		int totalSqFt = calculateTotalSqFeet();
		double tonsCO2 = calculateKilowatts(totalSqFt);
		tonsCO2 += calculateTherms(totalSqFt);
		return tonsCO2;
	}
	
	private double calculateTherms(int sqft) {
		final double THERMS_PER_SQFT = 0.27;
		final double TONS_CO2_PER_THERM = 0.005;
		return sqft * THERMS_PER_SQFT * HOURS_PER_YEAR * TONS_CO2_PER_THERM;
	}
	
	private double calculateKilowatts(int sqft) {
		final double KHW_PER_SQFT = 15.5;
		final double KW_TONS_CO2 = 0.0005925;
		return sqft * KHW_PER_SQFT * HOURS_PER_YEAR * KW_TONS_CO2;
	}

	private int calculateTotalSqFeet() {
		return numFloors * sqFeetPerFloor;
	}

	public void turnOnLights() {
		lightsOn = true;
		System.out.println("Lights on.");
	}
	
	public void turnOffLights() {
		lightsOn = false;
		System.out.println("Turning Lights off.");
	}
	
	public void turnHeatOn() {
		heatOn = true;
		System.out.println("Heat on.");
	}
	
	public void turnHeatOff() {
		heatOn = false;
		System.out.println("Turning heat off.");
	}
	
	public String toString() {
		String info = type + "\n";
		info += "---------------------------------\n";
		info += "Floors:                " + numFloors + "\n";
		info += "Square feet:           " + (numFloors * sqFeetPerFloor);		
		return info;
	}
	
	/**
	 * @return the sqFeetPerFloor
	 */
	public int getSqFeetPerFloor() {
		return sqFeetPerFloor;
	}

	/**
	 * @param sqFeetPerFloor the sqFeetPerFloor to set
	 */
	public void setSqFeetPerFloor(int sqFeetPerFloor) {
		this.sqFeetPerFloor = sqFeetPerFloor;
	}

	/**
	 * @return the numFloors
	 */
	public int getNumFloors() {
		return numFloors;
	}

	/**
	 * @param numFloors the numFloors to set
	 */
	public void setNumFloors(int numFloors) {
		this.numFloors = numFloors;
	}

	/**
	 * @return the lightsOn
	 */
	public boolean isLightsOn() {
		return lightsOn;
	}

	/**
	 * @return the heatOn
	 */
	public boolean isHeatOn() {
		return heatOn;
	}
}
