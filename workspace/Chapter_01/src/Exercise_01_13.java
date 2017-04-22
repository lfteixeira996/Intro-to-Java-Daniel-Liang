import java.io.IOException;

public class Exercise_01_13 {
	
	public static void main(String[] args) throws IOException
	{
		double a,b,c,d,e,f;
		double x, y;
//		
//		System.out.print("Insert value a: ");
//		a = System.in.read();
//		
//		System.out.print("Insert value b: ");
//		b = System.in.read();
//		
//		System.out.print("Insert value c: ");
//		c = System.in.read();
//		
//		System.out.print("Insert value d: ");
//		d = System.in.read();
//		
//		System.out.print("Insert value e: ");
//		e = System.in.read();
//		
//		System.out.print("Insert value f: ");
//		f = System.in.read();
		
		a = 3.4;
		b = 50.2;
		c = 2.1;
		d = 0.55;
		e = 44.5;
		f = 5.9;
		
		x = (e*d-b*f)/(a*d-b*c);
		y = (a*f-e*c)/(a*d-b*c);
		
		
		System.out.printf("%.2fx + %.2fy = %.2f\n", a, b, e);
		System.out.printf("%.2fx + %.2fy = %.2f\n", c, d, f);
		
		System.out.printf("x = %.2f\n", x);
		System.out.printf("y = %.2f\n", y);
		
	}
}
