import java.io.*;
import java.util.*;

public class ExmplCycle {
	public static void main(String[] args) 
	{
		String mark = "";
		int bonus = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please, input this mounth target:");
		int target = scn.nextInt();
		System.out.println("Please, input worker performance:");
		int performance = scn.nextInt();
		
		if (performance >= 2 * target) {
			mark = "Excellent";
			bonus = 1000;
		}
		else if (performance >= 1.5 * target) {
			mark = "Fine";
			bonus = 500;
		}
		else if (performance >= 1 * target) {
			mark = "Satisfactory";
			bonus = 100;
		}
		else {
			mark = "Very bad";
		}
		
		System.out.printf("%1$s, your bonus is: %2$d $", mark, bonus);
	}
}
