package loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		// do..while loop - will go inside the loop, execute the code and then checks if the condition is fine, then it continues
		
		/*
		 do{
		 	//code
		 } while (condition)
		 */
		
		
		int a = 1;
		
		do {
			System.out.println(a);
			a+=2;
		} while(a <= 50);
		System.out.println("Program exited");
		
		
		boolean t = true;
		
		do {
			System.out.println("Uspesan");
			t = false;
		} while(t == true);
		System.out.println("exited");

	}

}
