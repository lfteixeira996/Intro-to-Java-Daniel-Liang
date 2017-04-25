import java.io.PrintStream;
import java.util.Scanner;

public class Exercise_02_15 {

	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		//(x2-x1)^2
		double aux1 = Math.pow((x2-x1), 2);
	
		//(y2-y1)^2
		double aux2 = Math.pow((y2-y1), 2);
	
		output.print("The distance between the two points " +(Math.sqrt(aux1+aux2)));
	}
}
