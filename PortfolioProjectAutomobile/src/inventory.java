import java.util.ArrayList;
import java.util.Scanner;



public class inventory {
	ArrayList<autoMobile> Vehicles;
	
	public inventory () {
		Vehicles = new ArrayList<>();		
	}
	
	public void addVehicle (autoMobile car) {
		Scanner scnr = new Scanner (System.in);
		
		try {
		System.out.println("------Add Vehicle-------");		
		System.out.print("Enter Vehicle Vin Number: ");
		int vinNumber = scnr.nextInt();
		car.setVinNumber(vinNumber);
		scnr.nextLine(); 	//consumer newLine
        System.out.print("Enter Vehicle make: ");
        String make = scnr.nextLine();
        car.setMake(make);
        System.out.print("Enter Vehicle model: ");
        String model = scnr.nextLine();
        car.setModel(model);
        System.out.print("Enter Vehicle color: ");               
        String color = scnr.nextLine();
        car.setColor(color);
        System.out.print("Enter Vehicle year: ");
        int year = scnr.nextInt();
        car.setYear(year);
        System.out.print("Enter Vehicle mileage: ");
        int mileage = scnr.nextInt();
        car.setMileage(mileage);
        Vehicles.add(car);
        System.out.println("Vehicle Added Successfully");
        System.out.println("------------------------\n");		
        System.out.println(car);
		}
		catch (Exception e) {System.out.println("Input was incorrect");}
        
	}
	
	public boolean removeVehicle (autoMobile car) {
		Scanner scnr = new Scanner (System.in);
		System.out.println("Please input Vin Number of vehicle you want to remove: ");
		int vinNumber = scnr.nextInt();
		
		for (autoMobile auto : Vehicles) {
			if(auto.getVinNumber() == vinNumber) {
				Vehicles.remove(auto);
				System.out.println("---Vehicle Removed Successfully---\n");
				return true;
				
			}
		}
		System.out.println("Vehicle with Vin Number not found: ");
		return false;
		
				
	}
	
	public boolean updateVehicle (autoMobile auto) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please provide Vin Number for vehicle you wish to update "
				+ "");
		int vinNumber = scnr.nextInt();
		scnr.nextLine();
	
		
		for(autoMobile car : Vehicles)
			if(car.getVinNumber() == vinNumber) {
				
		        System.out.print("Enter Updated Vehicle make: ");
		        String make = scnr.nextLine();
		        car.setMake(make);
		        System.out.print("Enter Updated Vehicle model: ");
		        String model = scnr.nextLine();
		        car.setModel(model);
		        System.out.print("Enter Updated Vehicle color: ");               
		        String color = scnr.nextLine();
		        car.setColor(color);
		        System.out.print("Enter Updated Vehicle year: ");
		        int year = scnr.nextInt();
		        car.setYear(year);
		        System.out.print("Enter Updated Vehicle mileage: ");
		        int mileage = scnr.nextInt();
		        car.setMileage(mileage);
		        Vehicles.add(car);
		        System.out.println("Vehicle Updated Successfully");
		        System.out.println("------------------------ \n");
				return true;	
				
			}
			System.out.println("Vehicle with Vin Number not found: ");
			return false;
				
		
	}
	
	
	
	
	public String toString () {
		String s = "Vehicles in Inventory: \n \n";
		
		for(autoMobile car : Vehicles)	
			 s += car.toString() + "\n";
		return s;
		
	}
	
	
	
}
	
