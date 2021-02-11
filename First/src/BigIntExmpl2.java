import java.util.*;
import java.math.*;
public class BigIntExmpl2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("How many number you need to draw?\t");
		int num = scn.nextInt();
		
		System.out.print("What is the highest number, that you can draw?\t");
		int high = scn.nextInt();
		
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		
		for (int i = 1; i <= num; i++) {
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(high - i + 1)).divide(BigInteger.valueOf(i));
		
			
		System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
		}
	}
}
