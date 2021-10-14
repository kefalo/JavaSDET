package DataTypes;

public class Operators {

	public static void main(String[] args) {
		//Operators in Java
		
		//a=10; b = 20; c=a+b; - a,b,c --> variables
		
		//a & b --> operands
		
		//= & + --> operators
		
		/*
		 Arithmetic Operators: + - * / %
		 
		 
		 Relational Operators: < > <= => != == (Returns boolean)
		 
		 Logical Operators: && || !
		 
		 Assignment: = += *= /=
		 
		 Increment: ++ and Decrement: --
		 */
		
		//Arithmetic Operators
		System.out.println("Arithmetic Operators");
		System.out.println();
		
		int a = 10;
		int b = 20;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("---------------------------");
		
		//Relational Operators
		//Relational Operators: < > <= => != == (Returns boolean)
		
		System.out.println("Relational Operators");
		System.out.println();
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println("---------------------------");
		
		//Logical Operators
		//Logical Operators: && || !
		
		System.out.println("Relational Operators");
		System.out.println();
		
		boolean t = true;
		boolean f = false;
		
		System.out.println(t&&f);
		System.out.println(t||f);
		System.out.println(!t);
		System.out.println(!f);
		
		
		System.out.println("---------------------------");
		
		//Assignment
		//Assignment: = += *= /=
		
		System.out.println("Assignment");
		System.out.println();
		
		int d = 1;
		System.out.println("The value of d is "+ d);
		System.out.println();
		
		d=a;
		System.out.println("The value of d is "+ d);
		System.out.println("to the variable d new value has been assigned "+ d);
		System.out.println();
		
		d=b;
		System.out.println("The value of d is "+ d);
		System.out.println("to the variable d new value has been assigned "+ d);
		System.out.println();
		
		d=100;
		System.out.println("The value of d is "+ d);
		System.out.println("to the variable d new value has been assigned "+ d);
		System.out.println();
		
		d++;
		System.out.println("The value of d is "+ d);
		System.out.println("incrementation of value variable d consists by =1 "+ d);
		System.out.println();
		
		d+=5;
		System.out.println("The value of d is "+ d);
		System.out.println("incrementation of value variable d consists by 5 ="+ d);
		System.out.println();
		
		d--;
		System.out.println("The value of d is "+ d);
		System.out.println("decrementation of value variable d consists by 1 ="+ d);
		System.out.println();
		
		d-=5;
		System.out.println("The value of d is "+ d);
		System.out.println("decrementation of value variable d consists by 5 ="+ d);
		System.out.println();
		
		d*=3;
		System.out.println("The value of d is "+ d);
		System.out.println("incrementation of d value by multiplying value of d with 3 ="+ d);
		System.out.println();
		
		d/=3;
		System.out.println("The value of d is "+ d);
		System.out.println("decrementation of d value by diversing value of d with 3 ="+ d);
		System.out.println();
		
		
		

	}

}
