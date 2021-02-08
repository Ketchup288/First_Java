public class StrBuilderExample {
	 public static void main(String[] args) {
		 StringBuilder builder = new StringBuilder();
		 builder.append("Hello, my name is: ");
		 builder.append("Vladimir");
		 String normalString = builder.toString();
		 // ��� ������ �������� ����
		 int cp = normalString.codePointAt(2); // ������� � ��������� ������ Unicode
		 System.out.println(cp); 
		 char kp = normalString.charAt(2);
		 System.out.println("\n" + kp + "\n"); // �������� ��� ���� ����� ������� ��� �����
		 
		 System.out.println("\u006C" + "\n"); // ������ � 16���� ������� � ������� �� �����
		 // ��� ������� ���������
		 
		 
		 System.out.println(normalString); // ����� � ���� StringBuilder � ������ � ���� ��
		 
		 builder.delete(0, 7);
		 System.out.println("\n" + builder.toString() + "\n");
		 
		 StringBuilder greeting = new StringBuilder();
		 String hel = "Hel";
		 String lo = "lo!";
		 
		 greeting.append(hel);
		 greeting.append(lo);
		 
		 System.out.println(greeting.toString() + "\n");
		 
		 System.out.println(greeting.charAt(0) + "\n");
		 
		 System.out.println(greeting.capacity() + "\n");
		 
		 greeting.deleteCharAt(5);
		 
		 System.out.println(greeting.toString());
		 
		 String ths = "!";
		 
		 greeting.insert(5, ths); // ���� ������ ��������
		 
		 System.out.println("\n" + greeting.toString());
	 }
}
