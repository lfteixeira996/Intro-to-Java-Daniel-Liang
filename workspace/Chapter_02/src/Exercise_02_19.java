import java.io.PrintStream;
import java.util.Scanner;

public class Exercise_02_19 {

	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		double x1, x2, x3;
		double y1, y2, y3;
		
		output.print("Enter three points for a triangle: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		
		double side1 = side_calculation(x1, x2, y1, y2);
		double side2 = side_calculation(x1, x3, y1, y3);
		double side3 = side_calculation(x2, x3, y2, y3);
		
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		output.println("The area of the triangle is " + area);
		
		
//		output.print("The area of the haxagon is "+A);
		input.close();
	}
	
	public static double side_calculation(double x1, double x2, double y1, double y2) 
	{	
		//(x2-x1)^2
		double aux1 = Math.pow((x2-x1), 2);
	
		//(y2-y1)^2
		double aux2 = Math.pow((y2-y1), 2);
	
		return Math.sqrt(aux1+aux2);
	}
}
