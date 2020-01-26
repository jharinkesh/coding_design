
import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		long number = 30;
		BigInteger value = getFactorial(number);
		System.out.println("factorial of "+number+" = "+value);  
	}

	private static BigInteger getFactorial(long number) {
		BigInteger factorial = BigInteger.ONE;
		for (int i = 1; i <= number; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}
}
