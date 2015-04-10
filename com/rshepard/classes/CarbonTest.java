/**
 * @author Richard Shepard
 * @version Apr 10, 2015
 */
package com.rshepard.classes;

import java.util.ArrayList;

import com.rshepard.interfaces.CarbonFootPrint;

public class CarbonTest {

	
	private ArrayList<CarbonFootPrint> carbonList;
	/**
	 * 
	 */
	public CarbonTest() {
		carbonList = new ArrayList<>();
		carbonList.add(new Bicycle(2, false, "Mountain Bike"));
		carbonList.add(new Building(2500, 3, "Office"));
		carbonList.add(new Car(4, true, "SVU", 8, 36000, 12));
		carbonList.add(new Bicycle(3, false, "Tricycle"));
		carbonList.add(new Building(5000, 38, "High Rise"));
		carbonList.add(new Car(4, true, "Sedan", 4, 52000, 35));
	}
	
	public void getCarbonOutput() {
		for(CarbonFootPrint cf : carbonList) {
			System.out.println(cf.toString());
			System.out.println("Tons CO2/year:          " + cf.getCarbonFootPrint() + "\n");
		}
	}

}
