import java.io.IOException;
import java.util.Scanner;

public class Exercise_04_04 {

	public static void main(String[] args) throws IOException
	{	
		Scanner input  = new Scanner(System.in);
		double s, n, Area;
		
		/*READ VALUES*/
		System.out.print("Enter the number of sides: ");
		n = input.nextDouble();
		
		System.out.print("Enter the side: ");
		s = input.nextDouble();
		
		/*Great Circle Distance*/
		Area = ((n*(Math.pow(s,2)))/(4*tan(Math.PI/n)));
		
		/*Print Values*/
		System.out.println("The area of the hexagon is " + Area);
		
		input.close();
	}
	
	static double tan(double val)
	{
		return Math.tan(val);	
	}
	
}
