package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter an integer"); //asks for input
		int input1 = inKey.nextInt();
		System.out.println("Enter another integer"); //asks  for other input
		int input2 = inKey.nextInt();
		int loop = 10;
		int max = Math.max(input1, input2); //gets max
		int min = Math.min(input1, input2);// gets min
		for (int i = 10; i > 0;) { //runs it 10 times
			
			int total = (int)(Math.random()* (max - min+1)+ min); //gets a random between the numbers
			System.out.println(total);
			i--; //subtracts from the loop
		}
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("What is the Radius of the Cylinder?"); //gets input
		int rad = inKey.nextInt();
		System.out.println("What is the Height of the Cylinder?"); //gets input
		int hi = inKey.nextInt();
		double base = Math.PI * (rad * rad); //does math using PI
		
		double vol = base * hi; //multiplies base * height
		
		System.out.println("The Volume of the Cylinder is: " + vol); //print
	}

	
	

	public static void problem03() {
		
		double num1 = Math.sqrt(10); //square root of 10
		Scanner inKey = new Scanner(System.in); 
		System.out.println("Enter X1"); //gets input
		int x1 = inKey.nextInt();
		System.out.println("Enter Y1"); //gets input
		int y1 = inKey.nextInt();
		System.out.println("Enter X2"); //gets input
		int x2 = inKey.nextInt();
		System.out.println("Enter Y2"); //gets input
		int y2 = inKey.nextInt();
		
		double total = ((x2 - x1)*(x2 - x1))+((y2 - y1)*(y2 - y1)) ; //does a lot of math
		double dist = Math.sqrt(total); //square roots total
		System.out.println("Distance between points = " + dist); //prints
	}


	
	
	public static void problem04() {
		double num1 = Math.sqrt(10); //square root
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a-value");//gets input
		int a = inKey.nextInt();
		System.out.println("Enter b-value");//gets input
		int b = inKey.nextInt();
		System.out.println("Enter c-value");//gets input
		int c = inKey.nextInt();
		double idk = ((b * b) - (4 *a * c)); //does math :(
		double total1 = (-b + Math.sqrt(idk)); //if b is +
		double total2 = (-b - Math.sqrt(idk)); //if be is -
		double x1 = total1 / (2*a);
		double x2 = total2 / (2*a);
		System.out.println("x1 = " + x1); //prints
		System.out.println("x2 = " + x2); //prints
	}
	
	

	
}
