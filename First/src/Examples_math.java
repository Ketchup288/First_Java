
public class Examples_math 
{
	public static final void main(String[] args) 
	{
		/*
		 * ��� ������ ������� �������� � �������� math
		 * ��� �� sqrt, pow � ����� ��� �� ����, ��� �� ���� � �++ ���� ���
		 */
		
		int x = 25;
		int y = 50;
		System.out.println(Math.max(x, y));
		
		System.out.println(Math.min(x, y));
		
		System.out.println(Math.abs(x - y)); // abs - �� ������, ���� ���, ��� �� ������� �����
		
		System.out.println(Math.random()); // �� ������ �� 0.0 - 1.0
		
		int RandomNum = (int)(Math.random() * 101); // �� ����� ��� ���� �� 0 �� 100
		System.out.println(RandomNum);
	}
}
