import java.util.*;
import java.math.*;

public class LotteryArrays {
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Please, input how many numbers you shoul draw:\t");
		int num = scn.nextInt();
		
		System.out.print("What is the highest number that you can draw:\t");
		int high = scn.nextInt();
		
		int[] numbers = new int[high];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		
		int[] result = new int[num];
		for (int i = 0; i < result.length; i++) {
			// Here we need to get random index 
			// in range from 0 to n - 1
			
			int r = (int) (Math.random() * high);
			
			// randomly chose element
			result[i] = numbers[r];
			
			// put the last element 
			// in random place
			numbers[r] = numbers[high - 1];
			high --;
			
		}
		Arrays.sort(result);
		System.out.println("Bet the following combination will make you rich:");
		for (int r: result) {
			System.out.println(r);
		}
		
		
		
	}
}
