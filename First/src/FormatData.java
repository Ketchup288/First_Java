import java.util.Date;

public class FormatData {
	public static void main(String[] args) 
	{
		System.out.printf("%tc", new Date());
		System.out.println("\n\n");
		System.out.printf("%s %tT", "I was watching at my watch and saw that time is:", new Date());
		System.out.println("\n\n");
		System.out.printf("%1$s %2$te %2$tB, %2$tY", "Due to my watch, today is: ", new Date());
		
	}
}
