package conditionalStatements;

public class ifStatement {

	public static void main(String[] args) {
		//Conditional Statements
		
		//if
		//if..else
		//nested if..else
		//switch..case
		
		/*
		 if(condition){
		 	//code
		 }
		 */
		System.out.println("conditional statements - 'if' statement");
		
		int age = 15;
		System.out.println("person age is " + age);
		
		System.out.println("Let's see if person is eligible for vote");
		
		if(age <= 18) {
			System.out.println("Person can vote");
		}
		System.out.println("program exited");
	}

}
