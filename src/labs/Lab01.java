package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Choose 2 positive integers"); // asks for input
		int input1 =  inKey.nextInt();
		int input2 =  inKey.nextInt();
		double total = Math.pow(input1, input2); //uses exponents to combine the numbers
		System.out.println(input1+"^"+ input2 + " = " + total + "\n"); //prints
		
		
		
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Choose a positive integer"); //asks for input
		int input =  inKey.nextInt();
		double num1 = Math.sqrt(input); //uses square root on the input
		System.out.println(num1 + "\n"); //prints
		
	}

	
	

	public static void problem03() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Choose 2 positive integers"); //gets inputs
		double input1 =  inKey.nextDouble();
		double input2 =  inKey.nextDouble();
		double input1bac =  input1;
		double input2bac =  input2;
		input1 = input1 * input1; // multiplies the number by itself
		input2 = input2 * input2; // multiplies the number by itself
		double total = input1 + input2; // adds the numbers
		
		total =	Math.sqrt(total); // square roots the numbers 
		System.out.println("Length of side A: " + input1bac); //prints
		System.out.println("Length of side B: " + input2bac); //prints
		System.out.println("Hypotenuse: " + total); //prints

	}


	
	
	public static void problem04() {
		 
		Scanner inKey = new Scanner(System.in); 
		System.out.println("Enter a Integer (Enter 0 to End.)"); //asks for input
		int loop = 1; 
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while (loop > 0) { // Makes sure that  the loop is still running
			
			int input = inKey.nextInt();
			System.out.println("You entered: " + input);
			
			max = Math.max(max, input); //compares both numbers and gets a max
			min = Math.min(min, input); //compares both numbers and gets a min
				
			if (input == 0) {
				loop = 0; //keeps  running until hits 0
			}

		}
	
		 System.out.println("Max = " + max); //prints
		 System.out.println("Min = " + min);
		
	}
	
	
	
	
	
	
}
