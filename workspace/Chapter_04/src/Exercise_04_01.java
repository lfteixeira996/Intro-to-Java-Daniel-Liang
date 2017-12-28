import java.io.IOException;
import java.util.Scanner;

public class Exercise_04_01 {

	public static void main(String[] args) throws IOException
	{	
		Scanner input  = new Scanner(System.in);
		double r, s, Area;
		
		
		System.out.print("Enter the length from the center to a vertex: ");
		r = input.nextDouble();
		
		
		/* s = 2r sin(pi/5)*/
		s = 2 * r * Math.sin(Math.PI/5);
		
		
		/* Area = 5*(s^2) / 4*tan(pi/5) */
		Area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/5));
		
		System.out.println("The area of the pentagon is " + Area);
		
		input.close();
	}

}
