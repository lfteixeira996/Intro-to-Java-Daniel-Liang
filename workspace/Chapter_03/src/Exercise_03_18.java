import java.io.IOException;
import java.util.Scanner;

public class Exercise_03_18 {

	public static void main(String[] args) throws IOException
	{	
		double w, cost;
		
		Scanner input  = new Scanner(System.in);
	
		System.out.print("Enter the weight of the package: ");
		w = input.nextDouble();
		
		
		if((w > 0) && (w <= 1))
		{
			cost = 3.5;
			System.out.print("The cost of the package is: " + cost);
		}
		
		else if((w > 1) && (w <= 3))
		{
			cost = 5.5;
			System.out.print("The cost of the package is: " + cost);
		}
		
		else if((w > 3) && (w <= 10))
		{
			cost = 8.5;
			System.out.print("The cost of the package is: " + cost);
		}
		
		else if((w > 10) && (w <= 20))
		{
			cost = 10.5;
			System.out.print("The cost of the package is: " + cost);
		}
		
		else if( w > 50)
		{
			System.out.print("The package cannot be shipped");
		}
	}

}