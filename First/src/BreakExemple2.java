import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;

public class BreakExemple2 {
	public static void main(String [] args) throws IOException {
		PrintWriter writer = new PrintWriter("D:\\mynotes.txt", StandardCharsets.UTF_8);
		writer.print("5.4");
		writer.close();
		Scanner scn = new Scanner(Path.of("D:\\mynotes.txt"), StandardCharsets.UTF_8);
		String n = scn.nextLine();
		scn.close();
		int years = 0;
		double balance = 0;
		int goal = 1000;
		double interestRate = Double.parseDouble(n);
		int payment = 100;
		read_data:
		while(balance > goal) {
			balance += payment;
			years ++;
			for (int i = 0; i < 10; i ++) {
				double interest = balance + interestRate / 100;
				balance += interest;
				if (years > 100) break read_data;
			}
		}
	}
}
