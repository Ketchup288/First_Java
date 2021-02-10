import java.util.Scanner;

public class ExmplCycle4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input;
		
		System.out.print("Please, input how much money you will contribute every year:\t");
		double payment = scn.nextDouble();
		
		System.out.print("Please, check interest rate in your bank and input it here:\t");
		double interestRait = scn.nextDouble();
		
		int years = 0;
		double balance = 0;
		
		do {
			balance += payment;
			double interest = balance * interestRait / 100;
			balance += interest;
			years ++;
			
			
			System.out.printf("After year %d your balance is %2$,.2f%n", years, balance);
			
			System.out.print("Ready to retire? (Y/N)\t");
			input = scn.next();
		}
		while (input.equals("N"));
		
		if (input.equals("Y")) {
			System.out.println("\n My congratulations! You've worked enought and now have some rest!");
		}
	}

}
