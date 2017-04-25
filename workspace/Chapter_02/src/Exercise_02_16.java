import java.io.PrintStream;
import java.util.Scanner;

public class Exercise_02_16 {

	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		double Ta, v, Twc;
		
		output.print("Enter the temperature in Fahrenheit between -58ºF and 41ºF: ");
		Ta = input.nextDouble();
		
		if((Ta<-58) || (Ta>41))
		{
			output.println("INVALID DATA!");
			System.exit(1);
		}
		
		output.print("Enter the the wind speed (>=2) in miles per hour: ");
		v = input.nextDouble();
		
		if(v<2)
		{
			output.println("INVALID DATA!");
			System.exit(1);
		}
		
		Twc = 35.74 + (0.6215*Ta) - (35.75*Math.pow(v, 0.16)) + (0.4275*Ta*Math.pow(v, 0.16));
		
		output.print("The wind chill index is " + Twc);
		
	}
}
