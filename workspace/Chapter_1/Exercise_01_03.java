
public class Exercise_01_03 {

	public static void main(String[] args)
	{
		String x1 = String.format("%" + 10 + "s", "V     V"); 
		String x2 = String.format("%" + 8  + "s", " V   V"); 
		String x3 = String.format("%" + 6  + "s", "  V V"); 
		String x4 = String.format("%" + 2  + "s", "   V");
		
		System.out.printf("%5c %6c %s %4c\n",'J', 'A',x1, 'A');
		System.out.printf("%5c %7s %s %6s\n",'J', "A A", x2, "A A" );
		System.out.printf("%c%4c %8s %s %8s\n",'J', 'J',"AAAAA", x3, "AAAAA");
		System.out.printf("%2c%2c %10s %s %10s\n",'J', 'J', "A     A", x4, "A     A");
	
	}
}
