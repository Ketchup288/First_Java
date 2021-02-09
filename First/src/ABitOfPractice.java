import java.util.Date;

public class ABitOfPractice {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("Hello, I think that it's:");
		builder.append(10);
		System.out.println(builder.toString());
		System.out.println("\n");
		System.out.printf("%1$s %2$tF", "Due to my watch, today is: ", new Date());
		System.out.println("\n\n");
		System.out.printf("%1$s %2$te %2$tB, %2$tY", "Oh, God, today is just: ", new Date());
		
		
		double num = 765.0 / 7.0;
		System.out.println("\n\n" + num + "\n\n");
		
		System.out.printf("%,(.2f", num);
		
		
	}
}
