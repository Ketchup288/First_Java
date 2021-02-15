import java.util.Arrays;

public class MultiArrays {
	public static void main(String[] args) {
		int[] [] magicSquare =	{
				{16, 3, 2, 13}, 
				{5, 10, 11, 8},
				{9, 6, 7, 12},
			    {4, 15, 14, 1}
	};
		System.out.println(magicSquare[1][0]);
		System.out.println(Arrays.deepToString(magicSquare));
		
		final double STARTRATE = 10;
		final int NRATES = 6;
		final int NYEARS = 10;
		
		// set interest rate 10...15%
		double[] interestRate = new double[NRATES];
		for (int j = 0; j < interestRate.length; j++) {
			interestRate[j] = (STARTRATE + j) / 100.0;
		}
		
		double[][] balances = new double [NYEARS][NRATES];
		
		// set money to 10000
		for (int j = 0; j < balances[0].length; j++) {
			balances[0][j] = 10000;
		}
		
		// % for the next years
		for (int i = 1; i < balances.length; i++) 
		{
			for (int j = 0; j < balances[i].length; j++) {
				// get money from the last year
				double OldBalance = balances[i-1][j];
				// get rate 
				double interest = OldBalance * interestRate[j];
				
				balances[i][j] = OldBalance + interest;
			}
		}
		for (int j = 0; j < interestRate.length; j++) {
			System.out.printf("%9.0f%%", 100 * interestRate[j]);
		}
		System.out.println();
		for (double[] row:balances)
		{
			for (double b : row){
				System.out.printf("%10.2f", b);
			}
			System.out.println();
		}
		
		}
	}


