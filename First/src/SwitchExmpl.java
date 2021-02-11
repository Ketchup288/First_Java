import java.util.*;

public class SwitchExmpl {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Please, choise one number from four: \t");
		int choice = scn.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Hello, first");
			break;
		case 2: 
			System.out.println("Hello, second");
			break;
		case 3:
			System.out.println("Hello, third");
			break;
		case 4:
			System.out.println("Hello, four");
			break;
		default:
			System.out.println("Please,choise one number from four");
			break;
		}
		
	}
}
