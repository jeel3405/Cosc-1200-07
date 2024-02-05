import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        //create a scnner to get the input from the user
		Scanner input = new Scanner(System.in);
        
		//Display the welcome message
		System.out.println("Welcome to the Projectile Motion Calculator!");

        //ask the user to enter the initial angle of the projectile in degerees.
	    System.out.print("Please enter the initial angle of the projectile in degrees: ");
	        double angle = input.nextDouble();

        //enter the velocity of the projectile in m/s    

	        System.out.print("Please enter the initial velocity of the projectile in m/s: ");
	        double initialVelocity = input.nextDouble();

        //Prompt the user to enter the time at they want to calculate the time     

	        System.out.print("Please enter the time at which you want to calculate the position of the projectile in seconds: ");
	        double time = input.nextDouble();

            //Close the Scanner to prevent resource leaks
            input.close();

	        double g = -9.81; // gravitational constant in m/s^2

            //convet the angle from radians.
	        double angleInRadians = Math.toRadians(angle);

            //claculate teh horizontal distance travelled by the projectile
	        double dx = initialVelocity * Math.cos(angleInRadians) * time;
	        //calculate the vertical distance traveled by projectile
	        double dy = (initialVelocity * Math.sin(angleInRadians) * time) - (0.5 * - g * time * time);

            //Display the result to the user
	        System.out.printf("The horizontal distance traveled by the projectile is: %.2f m\n", dx);
	        System.out.printf("The vertical distance traveled by the projectile is: %.2f m\n", dy);
	        
	        

	        
		

	}

}

    
