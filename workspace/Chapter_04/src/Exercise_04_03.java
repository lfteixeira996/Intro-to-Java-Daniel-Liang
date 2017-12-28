import java.io.IOException;
import java.util.Scanner;

public class Exercise_04_03 {

	public static void main(String[] args) throws IOException
	{	
		Scanner input  = new Scanner(System.in);
		double s, Area;
		
		/*READ VALUES*/
		System.out.print("Enter the side: ");
		s = input.nextDouble();
		
		/*Great Circle Distance*/
		Area = ((6*(Math.pow(s,2)))/(4*tan(Math.PI/6)));
		
		/*Print Values*/
		System.out.println("The area of the hexagon is " + Area);
		
		input.close();
		
	}
	
	static double tan(double val)
	{
		return Math.tan(val);	
	}
	
}
