import java.util.ArrayList;
import java.util.Scanner;

public class criticalThinkingModule5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		final int INT_NUMBERS = 7;
		String wkDay;
		int i;
		double sum = 0;
		
		ArrayList<Integer> dayTemps = new ArrayList<>(); 
        ArrayList<String> dayNames = new ArrayList<>(); 
        
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        dayNames.add("Sunday"); 
        
        for (i=0; i < INT_NUMBERS; i++) {
        	System.out.println("Please enter the temperature for " + dayNames.get(i) + ": ");
        	dayTemps.add(scnr.nextInt());  
        	
        }
        
      
        System.out.println("Please enter the day of the week: ");
        scnr.nextLine();
        
        String weekDay;
        
        weekDay = scnr.nextLine();
        wkDay = weekDay.substring(0,1).toUpperCase() + weekDay.substring(1);
        
      
        int indexDayWeek = dayNames.indexOf(wkDay);
        
        if (indexDayWeek != -1) {
        	
        	System.out.println("The temperature for " + dayNames.get(indexDayWeek) + " is " + dayTemps.get(indexDayWeek));
        	
        } else if (wkDay.equals("Week") || wkDay.equals("week")) {
        	
        	for (int dayTemp : dayTemps) {
        		sum += dayTemp;
        		
        	}
        
        	for (i = 0; i < INT_NUMBERS; i++)	 {
        		System.out.print(dayNames.get(i) + " " + dayTemps.get(i) + " ");
        		
        	}
        	System.out.println("");
        	System.out.println("Weekly average: " + sum/INT_NUMBERS);
        	
                	
        }
        
        
	}


}
