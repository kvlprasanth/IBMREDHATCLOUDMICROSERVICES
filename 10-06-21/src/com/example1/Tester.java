package com.example1;

import java.util.Scanner;

public class Tester {
	private static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		
		Tester tester = new Tester();
		
		
		
		/*Vehicle myVehicle=new Truck();
		/*System.out.println(myVehicle.calcTripDistance(100.9, 900.8));
		System.out.println(myVehicle.calcFuelEfficiency(45));
		System.out.println(myVehicle.getDetails());
		myVehicle=new RiverBarge();
		System.out.println(myVehicle.calcTripDistance(90, 890.89));
		System.out.println(myVehicle.calcFuelEfficiency(1000));
		System.out.println(myVehicle.getDetails());
		myVehicle.setMessage("I Am On Riverbarge");
		System.out.println(myVehicle.getMessage());*/
		
		SeaPlane seaPlane = null;
		RiverBarge riverBarge = new RiverBarge();
		
		tester.check(seaPlane);
		
		private void check(SeaPlane o) {
		try {
		if (o instanceof SeaPlane) {
			SeaPlane seaPlane = (SeaPlane) o;
			System.out.println("Seaplane");
		}
			
			
			
		}
		catch (NullPointerException e) {
	     System.err.println("null pointer exception");
		 }
		
	}	
		


}
