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
		 
		 System.out.println(builder.toString());
	 }
}
