package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		// Starting application
		display();
		boolean active = true;
		
		while(active) {
			Scanner scanner = new Scanner(System.in);
			if(scanner.hasNextDouble()) {
				
				// A switch statement can't use doubles
			    int menuSelection = scanner.nextInt();
			    
			    switch(menuSelection) {
			    	case 1:
			    	volume();
			    	menuSelection = scanner.nextInt();
			    	
			    	// Switch statement for volume menu
			    	switch(menuSelection) {
			    	case 1:
			    	System.out.println("Enter number of teaspoons to convert to tablespoons");
			    	double menuSelection2 = scanner.nextDouble();
			    	convertTeaToTab(menuSelection2);
			    	break;
			    	
			    	case 2:
			    	System.out.println("Enter number of miles to convert to kilometers");
			    	menuSelection2 = scanner.nextDouble();
			    	convertMilToKil(menuSelection2);
			    	break;
			    		
			    	case 3:
			    	System.out.println("Enter number of gallons to convert to pints");
			    	menuSelection2 = scanner.nextDouble();
			    	convertGalToPin(menuSelection2);
			    	break;
			    		
			    	case 4:
			    	display();
			    	break;
			    		
			    	case 5:
			    	active = false;
			    	quit();
			    	break;
			    	}
			    	break;
			    	
			    	case 2:
			    	distance();
			    	menuSelection = scanner.nextInt();
			    	
			    	// Switch statement for distance menu
			    	
			    	switch(menuSelection) {
			    	case 1:
			    	System.out.println("Enter number of feet to convert to meters");
			    	double menuSelection2 = scanner.nextDouble();
			    	convertFeetToMeters(menuSelection2);
			    	break;
			    	
			    	case 2:
			    	System.out.println("Enter number of yards to convert to inches");
			    	menuSelection2 = scanner.nextDouble();
			    	convertYardsToInches(menuSelection2);
			    	break;
			    		
			    	case 3:
			    	System.out.println("Enter number of feet to convert to inches");
			    	menuSelection2 = scanner.nextDouble();
			    	convertFeetToInches(menuSelection2);
			    	break;
			    		
			    	case 4:
			    	display();
			    	break;
			    		
			    	case 5:
			    	active = false;
			    	quit();
			    	break;
			    	}
			    	
			    	break;
			    	
			    	
			    	// Quit
			    	
			    	case 3:
			    	active = false;
			    	quit();
			    	break;
			    }
			    
			} else {
				System.out.println("Error! Please only enter numbers for this application!");
				display();
			}
		}

	}
	
	
	// Method to initially display menu options
	public static void display() {
		System.out.println("Enter a number to navigate the menu\r\n"
				+ "1. Volume conversions\r\n"
				+ "2. Distance conversions\r\n"
				+ "3. Quit");
	}
	
	// Method for printing out the volume conversions part of the menu
	public static void volume() {
		System.out.println("Volume conversions\r\n"
				+ "1. Teaspoons to Tablespoons\r\n"
				+ "2. Miles to Kilometers\r\n"
				+ "3. Gallons to Pints\r\n"
				+ "4. Back to Main Menu\r\n"
				+ "5. Quit");
	}
	
	// Method for printing out the distance conversions part of the menu
	public static void distance() {
		System.out.println("Distance conversions\r\n"
				+ "1. Feet to Meters\r\n"
				+ "2. Miles to Kilometers\r\n"
				+ "3. Yards to Inches\r\n"
				+ "3. Feet to Inches\r\n"
				+ "4. Back to Main Menu\r\n"
				+ "5. Quit\r\n");
	}
	
	// Quit
	public static void quit() {
		System.out.println("Thanks! Have a great day!");
	}
	
	// Conversion Methods for Volume
	public static void convertTeaToTab(double teaspoons) {
		double totalTeaspoons = teaspoons/3;
		System.out.println(teaspoons + " teaspoons is equal to " + totalTeaspoons + " tablespoons");
		display();
	}
	
	public static void convertMilToKil(double miles) {
		double totalMiles = miles * 1.609;
		System.out.println(miles + " miles is equal to " + totalMiles + " kilometers");
		display();
	}
	
	public static void convertGalToPin(double gallons) {
		double totalGallons = gallons * 8;
		System.out.println(gallons + " gallons is equal to " + totalGallons + " pints");
		display();
	}
	
	// Conversion Methods for Distance
	
	public static void convertFeetToMeters(double feet1) {
		double totalFeet1 = feet1 / 3.281;
		System.out.println(feet1 + " feet is equal to " + totalFeet1 + " Meters");
		display();
	}
	
	public static void convertYardsToInches(double yards) {
		double totalYards = yards * 36;
		System.out.println(yards + " yards is equal to " + totalYards + " Inches");
		display();
	}
	
	public static void convertFeetToInches(double feet2) {
		double totalFeet2 = feet2 * 12;
		System.out.println(feet2 + " feet is equal to " + totalFeet2 + " Inches");
		display();
	}
	

}
