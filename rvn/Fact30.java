package FirstAssignment;

import java.math.BigInteger;

public class Fact30 {

	public static void main(String[] args) {
		System.out.println(findFact(30));
	}
	private static BigInteger findFact(int n)
	{ 
		if(n==0)
			return BigInteger.ZERO;
		BigInteger fact =BigInteger.ONE;
		for(int i=n;i>0;i--)
		{
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
}

