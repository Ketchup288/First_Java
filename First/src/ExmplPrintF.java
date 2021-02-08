public class ExmplPrintF {
	public static void main(String[] args)
	{
		double x = 10000.0 / 3.0;
		System.out.println(x);
		
		System.out.printf("%+,.2f", x);
		
		String name = "Sub";
		int age = 41;
		System.out.printf("\nHello, %s. Next year you'll be %d", name, age);
		
	}
}
