import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FilesOpenerExmpls{
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("D:\\newnotes.txt", StandardCharsets.UTF_8);
			pw.print(12345);
			pw.print("\n");
			pw.print("That's over, my fellow brothers.");
			pw.close();
			Scanner scn = new Scanner(Path.of("D:\\newnotes.txt"), StandardCharsets.UTF_8);
			String num = scn.nextLine();
			System.out.println(num);
			String notes = scn.nextLine();
			System.out.println("\n" + notes);
		}
			catch (IOException e) {
			e.printStackTrace();
		}
	}
}
