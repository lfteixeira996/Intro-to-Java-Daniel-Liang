import java.io.IOException;
import java.util.Scanner;

public class Exercise_02_04 {

	public static void main(String[] args) throws IOException
	{	
		Scanner input  = new Scanner(System.in);
		
		double pounds, kilo;
				
		System.out.print("Enter a number in pounds: ");
		pounds = input.nextDouble();
				
		kilo = pounds*0.454;

		System.out.print(pounds+" pounds is " +(float)kilo+ " kilograms");
		
		input.close();
	}
}
