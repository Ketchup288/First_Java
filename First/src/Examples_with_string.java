
public class Examples_with_string 
{
	public static final void main(String[] args) 
	{
		System.out.println("Java \u2122");
		
		
		String expletive = "Expletive";
		String PG13 = "deleted";
		String message = expletive + " " + PG13;
		System.out.println("\n" + message + "\n");
		
		
		int age = 13;
		String rating = "PG" + age;
		System.out.println(rating + "\n");
		
		
		String all = String.join(" / ", "S", "M", "L", "XL");
		System.out.println(all);
		
		
		String repeated = "Java".repeat(3);
		System.out.println("\n" + repeated);
		
		String greeting = "Hello";
		String s = greeting.substring(0, 4); // substirng ����� �������� ����� � ������
		System.out.println("\n" + s + "\n"); 
		
		
		
		String agreeting = "Hello";
		String help = agreeting.substring(0, 3); // � substing ������ �������� �� �������, � ������ �������� - �� ��, �� �� ������� �������� � ������
		System.out.println(help + "p");
		
		
		System.out.println("\n" + "hello".equalsIgnoreCase(agreeting) + "\n");
		
		
		
		String boom = "";
		int num = boom.length();
		System.out.println(num + "\n");
		if (num == 0) {
			System.out.println("Length is null");
		}
		else {
			System.out.println("Length = " + num);
		}
		
		
		String txt = "Please locate where 'locate' occurs!";
		System.out.println("\n" + txt.indexOf("locate")); // ������� � ����������� ������� �����
		
		
		int a = 20;
	    String b = "20";
	    String z = a + b; // ������ � int �� string
	    System.out.println("\n" + z + "\n");
	    
	    
	    String some_text = "Hello World";
	    System.out.println(some_text.toLowerCase() + "\n"); // ������ �� ����� ����������
	    System.out.println(some_text.toUpperCase() + "\n"); // ������ �� ����� ��������
 	}
}
