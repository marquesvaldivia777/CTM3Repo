
public class Manager  extends Employee {
	private String department;
	
	public Manager (String department, String firstName, String lastName, int employeeID) {
		super(firstName, lastName, employeeID);
		this.department = department; 
	}
	
	public void setDepartment (String department) {this.department = department;}
	public String getDepartment () {return department;}
	
	public String toString() {
		String totalString = "Manager of Department: " + this.department + "\n" + super.toString();
		return totalString;
	}

}
