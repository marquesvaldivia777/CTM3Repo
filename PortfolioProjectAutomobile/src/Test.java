import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Scanner scnr = new Scanner (System.in);
	
	
		autoMobile bmw = new autoMobile();
		//autoMobile lexus = new autoMobile ();
		
		
		inventory Vehicles = new inventory();
		
		
		Vehicles.addVehicle(bmw);
		//Vehicles.updateVehicle(bmw);
		
		//Vehicles.addVehicle(lexus);
		
		//Vehicles.removeVehicle(bmw);		
		
		
		
		
		
			System.out.println("Do you want to print information to file: y/n ");
			Scanner s = new Scanner (System.in);
			String x = s.next();
			
			if (x == "y") {
			try {
				FileWriter writer = new FileWriter("Home.txt");
				writer.write(Vehicles.toString());
				writer.close();
				
			}
			
			catch (IOException e) {
				System.out.println("File did not print");
			}
			}
		
			else {System.out.println("Okay");}
			
			System.out.println(Vehicles);
		
		
		
		
	
	
	
	}
		
}
