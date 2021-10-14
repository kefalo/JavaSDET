package loops;

public class WhileLoop {

	public static void main(String[] args) {
		//Loops and jumping statements
		
		//while loop - in order not to become infinite loop, increment a value in order to pass
		
		/*
		 while(condition){
		 	//code
		 }
		 */
		
		int i = 1;
		
		while(i <= 10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("Program exited");
		
		int m = 2;
		while(m <= 100) {
			System.out.println(m);
			m+=2;
		}
		System.out.println("Program exited");
	}

}
