
public class example_api_string {
	
	public static void main(String[] args)
	{
		String greeting = "Hello";
		String sentence = "Hello to my friend!";
		
		
		System.out.println(greeting.charAt(1)); // Вертає тип char, може бути корисно для низькорівневих кодових одиниць (UTF - 16)
												// Кодова одиниця - це число, яке індинтифікує символ в UNICODE та ін. системах
		
		
		System.out.println("\n" + greeting.offsetByCodePoints(1, 5));
	
	}

}
