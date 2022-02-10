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
		System.out.println("Choose 2 positive integers");
		int input1 =  inKey.nextInt();
		int input2 =  inKey.nextInt();
		double total = Math.pow(input1, input2);
		System.out.println(input1+"^"+ input2 + " = " + total + "\n");
		
		
		
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Choose a positive integer");
		int input =  inKey.nextInt();
		double num1 = Math.sqrt(input);
		System.out.println(num1 + "\n");
		
	}

	
	

	public static void problem03() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Choose 2 positive integers");
		double input1 =  inKey.nextDouble();
		double input2 =  inKey.nextDouble();
		double input1bac =  input1;
		double input2bac =  input2;
		input1 = input1 * input1;
		input2 = input2 * input2;
		double total = input1 + input2;
		
		total =	Math.sqrt(total);
		System.out.println("Length of side A: " + input1bac);
		System.out.println("Length of side B: " + input2bac);
		System.out.println("Hypotenuse: " + total);

	}


	
	
	public static void problem04() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a Integer (Enter 0 to End.)");
		int loop = 1; 
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while (loop > 0) { // Makes sure that  the loop is still running
			
			int input = inKey.nextInt();
			System.out.println("You entered: " + input);
			
			max = Math.max(max, input);
			min = Math.min(min, input);
				
			if (input == 0) {
				loop = 0;
			}

		}
	
		 System.out.println("Max = " + max);
		 System.out.println("Min = " + min);
		
	}
	
	
	
	
	
	
}
