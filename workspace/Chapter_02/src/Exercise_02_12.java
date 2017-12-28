import java.io.PrintStream;
import java.util.Scanner;

public class Exercise_02_12 {

	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();		
		double acceleration = input.nextDouble();		
	
		double length = Math.pow(speed, 2)/(2*acceleration);
		output.println("The minimum runway length for this airplane is " + (length));
		
		input.close();
	}
}
