import java.util.Arrays;

public class ExmplArrays {
	public static void main(String[] args) {
		int[] a = new int[100];
		
		int[] b = {1, 4, 2, 10, 22, 34}; 
		
		int [] anonymous = {17, 19, 20, 22, 25};
		
		int[] c = new int [100];
		
		for (int i = 0; i < 100; i++) {
			c[i] = i;
		}
		
		String[] s = new String[10]; // all strings here is "null"
		
		for (int i = 0; i < 10; i++) {
			s[i] = "";
		}
		
		for (int i = 0; i < c.length; i ++) {
			System.out.print(" " + c[i]);
		}
		
		var j = new int[200];
		for (int i = 0; i < j.length; i++) {
			j[i] = i;
		}
		
		for (int element : j) {
			System.out.println(element);
		}
		
		
		int[] w = new int[101];
		for (int i = 0; i < w.length; i++) {
			w[i] = i;
		}
		System.out.println(Arrays.toString(w));
		
		int[] smallPrimes = anonymous;
		System.out.println(Arrays.toString(smallPrimes));
		
		int[] luckyNumbers = smallPrimes;
		
		int[] CopiedLuckyNumbers = Arrays.copyOf(luckyNumbers, 2 * luckyNumbers.length);
		System.out.println(Arrays.toString(CopiedLuckyNumbers));
		
	}
}

