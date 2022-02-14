package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		double x = 0;
		double y =  0;
	
		System.out.println("Enter Launch Velocity (m/s)");
		double launchVelocity = inKey.nextDouble();
		System.out.println("Enter Launch Angle (degrees)");
		double launchAngle = inKey.nextDouble();
		
		int time = 0;
		int killSwitch = 0;
		
		
		double lAcos = Math.cos(Math.toRadians(launchAngle));
		
		
		double lVsin = Math.sin(Math.toRadians(launchAngle));
		
	
		System.out.println("Projectile's Path\n\n\n");
		while (killSwitch != 2)
		
		{
		
			x = lAcos * time * launchVelocity;
			y = lVsin * time * launchVelocity -0.5 * 9.8 * (time * time);
			
			if (y <= 0) {
				y = 0;
				killSwitch++;
			}
			System.out.println("Time: " + time + "\nx-pos: "+ x + "\ny-pos: " + y + "\n");
			
			time++;
			
			
			
		}
		
		
		
		
		
		
		//   xPosition = cosine of launch angle * time * launchVelocity;
		//   yPosition = sine of launch angle * time * lanuchVelocity – 0.5 * 9.8 * time^2
		
		
		
		
	}
	
	
}
