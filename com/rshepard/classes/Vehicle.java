/**
 * @author Richard Shepard
 * @version Apr 9, 2015
 */
package com.rshepard.classes;

import com.rshepard.interfaces.*;

public abstract class Vehicle implements CarbonFootPrint{
	
	private int numWheels;
	private boolean hasEngine;
	private String type;

	/**
	 * 
	 */
	public Vehicle(int numWheels, boolean hasEngine, String type) {
		this.numWheels = numWheels;
		this.hasEngine = hasEngine;
		this.type = type;
	}
	
	public String toString() {
		String info = "\n" + type + "\n";
		info += "---------------------------------\n";
		info += "Number of Wheels:         " + numWheels + "\n";
		info += "Has Engine:               " + hasEngine;
		return info;
	}

	/**
	 * @return the numWheels
	 */
	public int getNumWheels() {
		return numWheels;
	}

	/**
	 * @param numWheels the numWheels to set
	 */
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	/**
	 * @return the hasEngine
	 */
	public boolean isHasEngine() {
		return hasEngine;
	}

	/**
	 * @param hasEngine the hasEngine to set
	 */
	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}

	/* (non-Javadoc)
	 * @see com.rshepard.interfaces.CarbonFootPrint#getCarbonFootPrint()
	 */
	@Override
	abstract public double getCarbonFootPrint();

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
