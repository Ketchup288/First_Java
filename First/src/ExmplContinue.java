import java.util.*;
public class ExmplContinue {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int goal = 100;
		while (sum < goal) {
			System.out.println("Enter a number: ");
			int n = scn.nextInt();
			if (n < 0) continue;
			sum += n; // not working if n < 0
		}
		System.out.printf("You reached your goal! Your sum is %d\n", sum);
		
		sum = 0;
		
		for (int i = 1; i <= 100; i ++) {
			System.out.println("Please, eneter a number: ");
			int n = scn.nextInt();
			if (n < 0) continue;
			sum += n;
			
		}
	}
}
