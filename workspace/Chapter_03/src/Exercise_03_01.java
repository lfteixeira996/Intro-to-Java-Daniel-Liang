import java.io.IOException;
import java.util.Scanner;

public class Exercise_03_01 {

	public static void main(String[] args) throws IOException
	{	
		double a, b, c;
		double disc, r1, r2;
		
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter a, b, c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		//calculate discriminant
		disc = Math.pow(b, 2) - 4*a*c;
		
		//calculate roots
		r1 = (-b + Math.sqrt(disc))/2*a;
		r2 = (-b - Math.sqrt(disc))/2*a;
		
		
		if(disc > 0)
		{
			System.out.print("The equation has two roots " +r1+ " and " +r2);
		}
		
		
		else if(disc == 0)
		{
			System.out.print("The equation has one root " +r1);
		}
		
		else
		{
			System.out.print("The equation has no real roots");
		}
		
		input.close();
		
	}

}
