package loops;

public class ContinueStatement {

	public static void main(String[] args) {
		//continue statement used in loops to proceed with execution but exclude value specified into the if
		
		for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				continue;
			}
		
		System.out.println(i);
			
		}

	}

}
