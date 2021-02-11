import java.math.BigInteger;

public class BigNumbersExmpl {
	public static void main(String[] args) {
		BigInteger a = new BigInteger("22222211111111111424142141234324321412414124902159125012950215912412412");
		BigInteger b = new BigInteger("4214141241414124214124124124124124213123123123123");
		BigInteger c = a.add(b);
		System.out.println(c);
		BigInteger d = c.multiply(b.add(BigInteger.valueOf(2))); // d = c * (b + 2)	
				}
}
