package conditionalStatements;

public class SwappingOfValuesAssignment {

	public static void main(String[] args) {
		//Swapping the values between the variables
		
		int a = 10;
		int b = 20;
		
		System.out.println("Value of a before swapping is "+a);
		System.out.println("Value of b before swapping is "+b);
		
		int c;
		c=a;
		a=b;
		b=c;
		
		System.out.println("Value of a before swapping is "+a);
		System.out.println("Value of a before swapping is "+c);
		System.out.println("Value of a before swapping is "+b);

	}

}
