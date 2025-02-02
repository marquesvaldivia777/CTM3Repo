import java.util.Scanner;

public class mainCT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int weeklyIncome;
		double taxRate;
		double taxWithHolding; 
		
		System.out.println("Enter weekly income: ");
		weeklyIncome = scnr.nextInt();
		
		if (weeklyIncome < 500) {
			taxRate = 0.1;
		}
		else if ((weeklyIncome >=500) && (weeklyIncome < 1500)) {
			taxRate = 0.15;
		}
		else if ((weeklyIncome >= 1500) && (weeklyIncome < 2500)) {
			taxRate = 0.20;
		}
		else {
			taxRate = 0.30;
		}
		
		taxWithHolding = weeklyIncome * taxRate;
		System.out.println("Tax With Holding: " + taxWithHolding);
		
	
			
		
		

	}

}
