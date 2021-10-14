package conditionalStatements;

public class LargestOfThreeNumbersAssignment {

	public static void main(String[] args) {
		//largest of three numbers assignment
		
		int a = 22;
		int b = 121;
		int c = 11;
		
		if((a > b) && (a > c)) {
			System.out.println("A is greater then B and C");
		} else if ((b > a) && (b > c)) {
			System.out.println("B is greater then A and C");
		} else if ((c > a) && (c > b)) {
			System.out.println("C is greater then A and B");
		} else {
			System.out.println("Program exited with exception - all numbers are equal");
		}

	}

}
