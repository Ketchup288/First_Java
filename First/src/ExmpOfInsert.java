import java.util.Scanner;

public class ExmpOfInsert {
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scn.nextLine(); // Прочитає всю строку
		
		
//		System.out.println("One more time, please");
//		String nme = scn.next(); // Прочитає тільки одне слово
//		System.out.println("So, your name is: " + nme);
		
		
		System.out.println("How old are you, " + name + "?");
		if (scn.hasNextInt() == true) {
			int age = scn.nextInt();
			System.out.println("So, " + name + ", next year you'll be " + (age + 1) + "!");
		}
		else {
			System.out.println("Please, try one more time, age must contain only number.");
		}
	}
}
