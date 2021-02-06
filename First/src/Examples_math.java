
public class Examples_math 
{
	public static final void main(String[] args) 
	{
		/*
		 * Тут будуть декілька прикладів з бібліотеки math
		 * Такі як sqrt, pow і подібні тут не буде, так як вони в С++ були уже
		 */
		
		int x = 25;
		int y = 50;
		System.out.println(Math.max(x, y));
		
		System.out.println(Math.min(x, y));
		
		System.out.println(Math.abs(x - y)); // abs - це модуль, лишу тут, так як забуваю часто
		
		System.out.println(Math.random()); // Дає рандом між 0.0 - 1.0
		
		int RandomNum = (int)(Math.random() * 101); // Дає число інт типу між 0 до 100
		System.out.println(RandomNum);
	}
}
