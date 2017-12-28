import java.io.PrintStream;

public class Exercise_02_18 {

	public static void main(String[] args) 
	{	
		PrintStream output = new PrintStream(System.out);
		
		output.printf("\ta\tb\tpow(a,b)\n");
		for (int i = 1; i < 6; i++) 
		{
			output.printf("\t%d\t%d\t%d\n", i, i+1, (int)Math.pow(i, i+1) );
		}
		
		output.close();
	}
}
