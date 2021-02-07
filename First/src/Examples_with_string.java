
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
		String s = greeting.substring(0, 4); // substirng вертає конкретні букви з строки
		System.out.println("\n" + s + "\n"); 
		
		
		
		String agreeting = "Hello";
		String help = agreeting.substring(0, 3); // в substing перший параметр це початок, а другий параметр - це те, що не потрібно включати в строку
		System.out.println(help + "p");
		
		
		System.out.println("\n" + "hello".equalsIgnoreCase(agreeting) + "\n");
		
		
		
		String boom = "Boom";
		int num = boom.length();
		System.out.println(num + "\n");
		if (num == 0) {
			System.out.println("Length is null");
		}
		else {
			System.out.println("Length = " + num);
		}
		
		
		String txt = "Please locate where 'locate' occurs!";
		System.out.println("\n" + txt.indexOf("locate")); // Визначає е знаходиться вказане слово
		
		
		int a = 20;
	    String b = "20";
	    String z = a + b; // Робить з int до string
	    System.out.println("\n" + z + "\n");
	    
	    
	    String some_text = "Hello World";
	    System.out.println(some_text.toLowerCase() + "\n"); // Робить всі букви маленькими
	    System.out.println(some_text.toUpperCase() + "\n"); // Робить всі букви великими
	    
	    int n = greeting.length();
	    System.out.println(n + "\n");
	    
	    int cpCount = greeting.codePointCount(0, greeting.length());
	    System.out.println(cpCount + "\n");
	    System.out.println(greeting.charAt(0) + "\n");
	    
	    
	    int index = greeting.offsetByCodePoints(0, 3);
	    int cp = greeting.codePointAt(index);
	    System.out.println(index + "   " + cp);
	    
	    String sentence = "O is the set of octonions";
	    char ch = sentence.charAt(0);
	    System.out.println("\n" + ch);
	    
	    int []CodePoints = sentence.codePoints().toArray();
	    
 	}
}
