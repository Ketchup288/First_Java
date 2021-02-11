import java.util.*;
import java.io.*;
import java.math.*;

public class Practice {
	public static void main(String[] args) {
		BigInteger number = new BigInteger("12412412412412421442144214241421142124214");
		System.out.println(number);
		
		BigInteger a = BigInteger.TEN;
		BigInteger b = BigInteger.TWO;
		BigInteger c = a.add(b);
		BigInteger l = c.multiply(BigInteger.valueOf(5));
		
		
		BigInteger m = a.add(c).divide(BigInteger.valueOf(1));
		System.out.println(m);
		System.out.println(l);
		System.out.println(c);
	}
}
