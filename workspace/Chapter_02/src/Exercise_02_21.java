import java.io.PrintStream;
import java.util.Scanner;

public class Exercise_02_21 {

	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		double invest, annual_rate, years;
		double future_invest;
		
		output.print("Enter investment amount: ");
		invest = input.nextDouble();
		
		output.print("Enter annual interest rate in percentage: ");
		annual_rate = input.nextDouble();
		
		output.print("Enter number of years: ");
		years = input.nextDouble();
		
		future_invest = invest * Math.pow((1 + (annual_rate/12)), (years*12));
		
		output.println("Accumulated value is " + future_invest);
		
		input.close();
	}
}
