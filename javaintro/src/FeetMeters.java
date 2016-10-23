// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr. Haddad
// Assignment: 9.1

// Displays conversion table for feet and meters

public class FeetMeters {
	public static void main(String[] args) {
		System.out.printf("%-15s%-15s|   %-15s%-15s\n", "Feet", "Meters", "Meters", "Feet");
		
		System.out.println(String.format("%62s", " ").replace(' ', '-'));
		
		double m=20.0, ft=1.0;
		
		while(ft<=10){
			System.out.printf("%-15s%-15s|   %-15s%-15s\n", 
					String.format("%.1f",ft),
					String.format("%.3f", footToMeter(ft)),  
					String.format("%.1f",m),
					String.format("%.3f", meterToFoot(m)));	
			
			ft++; m+=5;
		
		}
		
		
		
	}

	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}

	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}
}