
public class autoMobile {

		//Automobile Variables
	private String make; 
	private String model;
	private String color;
	private int year;
	private int mileage;
	private int vinNumber;
	
	//Automobile Constructor
	public autoMobile (int vinNumber, String make, String model, String color, int year, int mileage) {
			this.vinNumber = vinNumber;
			this.make = make;
			this.model = model;
			this.color = color;
			this.year = year;
			this.mileage = mileage;	
		}
	
	//getters 
	
	public String getMake() {return make; }
	public String getModel () {return model; }
	public String getColor () {return color; }
	public int getYear () {return year; }
	public int getMileage () {return mileage; }
	public int getVinNumber () {return vinNumber; }
	
	// setters 
	
	public void setMake (String make) { this.make = make;}
	public void setModel (String model) { this.model = model;}
	public void setColor (String color) { this.color = color;}
	public void setYear (int year) { this.year = year;}
	public void setMileage (int mileage) { this.mileage = mileage;}
	public void setVinNumber (int vinNumber) { this.vinNumber = vinNumber;}
	
	//override toString
	
	public String toString () {
		return "VIN number: " + vinNumber + "\n" + "Make: " + make + "\n" + "Model: " + model + "\n" + "Color: " + color + "\n" + 
				"Year: " + year + "\n" + "Mileage: " + mileage; 
	}	
	
	
	
	
	
}
