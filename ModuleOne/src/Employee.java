
public class Employee {
	private String firstName;
	private String lastName;
	private int employeeID;
	private double salary;
	
	public Employee (String firstName, String lastName, int employeeID) {
		this.firstName= firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.salary = 0;
	}
	
	//getters
	public String getFirstName () {
		return firstName;}
	public String getLastName () {
		return lastName;}
	public int getEmployeeID () {
		return employeeID;}
	public double getSalary () {
		return salary;}
	
	//setters
	public void setFirstName (String firstName) {
		this.firstName = firstName;}
	public void setLastName (String lastName) {
		this.lastName = lastName;}
	public void setEmployeeID (int employeeID) {
		this.employeeID = employeeID;}
	public void setSalary (double salary) {
		this.salary = salary;}
	
	public String toString () {
		String myString = "Last Name, First Name: " + this.lastName + ", " + this.firstName + "\n" + "Employee ID: " + this.employeeID + "\n" + "Salary: " + this.salary + "\n";
		return myString;
		
	}
	
	
	

}
