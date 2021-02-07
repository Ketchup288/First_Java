public class StrBuilderExample {
	 public static void main(String[] args) {
		 StringBuilder builder = new StringBuilder();
		 builder.append("Hello, my name is: ");
		 builder.append("Vladimir");
		 String normalString = builder.toString();
		 // Тут просто перевіряю сееб
		 int cp = normalString.codePointAt(2); // Отримав в десятичній системі Unicode
		 System.out.println(cp); 
		 char kp = normalString.charAt(2);
		 System.out.println("\n" + kp + "\n"); // Перевірив яку саме букву позначає цей юнікод
		 
		 System.out.println("\u006C" + "\n"); // Перевів в 16річну систему і написав на юнікоді
		 // Тут закінчив перевіряти
		 
		 
		 System.out.println(normalString); // Переві з типу StringBuilder у строку і вивів її
		 
		 builder.delete(0, 7);
		 
		 System.out.println(builder.toString());
	 }
}
