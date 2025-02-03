import java.util.Scanner;

public class mainCT5 {
	

	public static void main (String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double maxSoFar = 0;
		double minSoFar = 0;
		double currValue;
		int i;
		double valueSum = 0;
		double nextValue; 
		
		System.out.println("Please provide 10 grades from the class: ");
		
		for (i=0; i < 10; i++) {
			currValue = scnr.nextDouble();
					
			if (i==0) {
				maxSoFar = currValue;				
			}
				else if (currValue > maxSoFar) {
				maxSoFar = currValue;
			}
			
			if (i==0) {
				minSoFar = currValue;
			}
			else if (currValue < minSoFar) {
				minSoFar = currValue;
			}
			
			if (i==0) {
				valueSum = currValue; 
			}
			else {valueSum = valueSum + currValue;}
			
			}
		
			double averageSum = valueSum/10;
		
		
		System.out.println("Average: " + averageSum + "\n" + "Maximum: "
		+ maxSoFar + "\n" + "Minimum: " + minSoFar);
			
		}
		

}