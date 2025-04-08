import java.util.Scanner;

public class TaxWithHolding {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		double weeklyIncome;
		double taxRate;
		double withHolding;
		
		System.out.println("::: Please enter your weekly income :::");
		weeklyIncome = scnr.nextInt();
		
		if (weeklyIncome <500) {
			taxRate = 0.10;
		}
		else if (weeklyIncome <1500) {
			taxRate = 0.15;
		}
		else if (weeklyIncome < 2500) {
			taxRate = 0.20;
		}
		else {
			taxRate = 0.30;
		}
		
		withHolding = weeklyIncome * taxRate;
		System.out.println("Your weekly tax with holding: " + withHolding);
		System.out.println("Your tax rate: " + taxRate);

	}

}
