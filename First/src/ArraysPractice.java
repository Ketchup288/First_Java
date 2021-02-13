import java.math.*;
import java.util.*;

public class ArraysPractice {
	public static void main(String [] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Please, input some random number:\t");
		int n = scn.nextInt();
		int r = (int) (Math.random() * n);
		System.out.println(r);
		
		int [] a = new int[100];
		
		for (int i = 0; i < 100; i++) {
			a[i] = i + 1;
		}
		
		for (int element : a) {
			System.out.print(" " + element);
			
		}
		
		System.out.print("\nHow many numbers you can draw:\t");
		int num = scn.nextInt();
		System.out.print("\nWhat is the highest number you can draw:\t");
		int high = scn.nextInt();
		
		int[] numbers = new int[high];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		int [] result = new int [num];
		
		for (int i = 0; i < result.length; i ++) {
			int rand = (int) (Math.random());
			
			result[i] = numbers[rand];
			
			numbers[rand] = numbers[high - 1];
			high --;
		}
		Arrays.sort(result);
		for (int s : result) {
			System.out.println(s);
		}
		
	}
}
