package conditionalStatements;

public class SwitchCase {

	public static void main(String[] args) {
		//Switch case statement - reduce the code, use when u have a lot of data
		
		/*
		 switch(variable) {
		 case 1: //code; break;
		 case 2: //code; break;
		 }
		 
		 */
		
		int day = 7;
		
		switch(day) {
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		case 7: System.out.println("Sunday"); break;
		
		default: System.out.println("Wrong day entered");
		}
		System.out.println("Program exited");
	}

}
