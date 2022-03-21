package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		double x = 0;
		double y =  0;
	
		System.out.println("Enter Launch Velocity (m/s)"); //gets input
		double launchVelocity = inKey.nextDouble();
		System.out.println("Enter Launch Angle (degrees)"); //gets input
		double launchAngle = inKey.nextDouble();
		
		int time = 0;
		int killSwitch = 0; //killswitch
		
		
		double lAcos = Math.cos(Math.toRadians(launchAngle)); //gets cos
		
		
		double lVsin = Math.sin(Math.toRadians(launchAngle)); //gets sin
	
	
		System.out.println("\n\nProjectile's Path\n\n");
		while (killSwitch != 2)
		
		{
		
			x = lAcos * time * launchVelocity; //does the x value
			y = lVsin * time * launchVelocity -0.5 * 9.8 * (time * time); //does the y value math
			
			if (y <= 0) {
				y = 0;
				killSwitch++;
			}
			System.out.println("Time: " + time + "\nx-pos: "+ x + "\ny-pos: " + y + "\n"); //prints
			
			time++; //adds to time
			
			
			
		}
		
		
		
		
		
		
		//   xPosition = cosine of launch angle * time * launchVelocity;
		//   yPosition = sine of launch angle * time * lanuchVelocity – 0.5 * 9.8 * time^2
		
		
		
		
	}
	
	
}
