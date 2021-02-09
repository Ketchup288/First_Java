import java.io.*;
import java.util.*;

public class ExmplCycle2 {
	public static void main(String[] args) {
		int blnc = 0;
		int pymnt = 0;
		int goal = 0;
		double interestRate = 7.8;
		int years = 0;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Please, input your money goal: ");
		goal = scn.nextInt();
		System.out.println("Please, input your payment, that you will put to the bank per year: ");
		pymnt = scn.nextInt();
		
		while (blnc < goal) {
			blnc += pymnt; 
			double interest = blnc * interestRate / 100; // Interest Rate - процентна ставка
			blnc += interest;
			years ++;
		}
		if (years > 10) {
			System.out.printf("Oh, that will be very long, but don't give up! Just %1$d years and your money goal will be done!", years);
	}
		else {
			System.out.printf("Just %1$d years and your money goal will be done!", years);
		}
	}
}
