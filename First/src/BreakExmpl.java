public class BreakExmpl {
	public static void main(String[] args) {
		int years = 0;
		double interestRate = 7.4;
		int goal = 1000000;
		int payment = 1000;
		double balance = 0;
		
		while(years < 100) {
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			if (balance > goal) break;
			years ++;
		}
		System.out.printf("You spent %d years to get %d dollars\n", years, goal);		
	}
}
