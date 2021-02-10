import java.util.*;

public class ExmplCycle3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("How much money you need to retire?\t");
		double goal = scn.nextDouble();
		
		System.out.print("How much money you will contribute every year?\t");
		double payment = scn.nextDouble();
		
		System.out.print("Please, check interst rate in your bank and input it here:\t");
		double interestRate = scn.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		while (balance < goal) {
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years ++;
		}
		System.out.println("You can retire in " + years + " years.");
	}
}