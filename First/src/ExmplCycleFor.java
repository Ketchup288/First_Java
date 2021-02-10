import java.util.*;

public class ExmplCycleFor {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("How many number do you need to draw?");
		int num = scn.nextInt();
		
		System.out.println("What is the highest number you can draw?");
		int high = scn.nextInt();
		
		// n * (n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
		int lotteryOdds = 1;
		for (int i = 1; i <= num; i++){
			lotteryOdds = lotteryOdds * (high - i + 1) / i;
		}
		scn.close();
		System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
	}
}
