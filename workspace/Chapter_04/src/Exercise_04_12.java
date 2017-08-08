import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class Exercise_04_12 {

	public static void main(String[] args) throws IOException
	{	
		Scanner input  = new Scanner(System.in);
		int dec, hex;
		
		
		/*READ VALUES*/
		System.out.print("Enter a hex digit: ");
		dec = input.nextInt();
		
		if(dec<0 || dec>15)
		{
			System.out.println(dec+" is an invalid input");
		}
		
		else
		{
			/*Print Values*/
			System.out.println("The hex value is " +Integer.toBinaryString(dec));
		}
	}
	
	
	
}
