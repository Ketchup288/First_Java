
public class example_api_string {
	
	public static void main(String[] args)
	{
		String greeting = "Hello";
		String sentence = "Hello to my friend!";
		
		
		System.out.println(greeting.charAt(1)); // ����� ��� char, ���� ���� ������� ��� ������������� ������� ������� (UTF - 16)
												// ������ ������� - �� �����, ��� ����������� ������ � UNICODE �� ��. ��������
		
		
		System.out.println("\n" + greeting.offsetByCodePoints(1, 5));
	
	}

}
