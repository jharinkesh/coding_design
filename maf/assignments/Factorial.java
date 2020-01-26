import java.math.BigInteger;


public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(30));
    }

    public static BigInteger factorial(int n) {
        if(n==0)
            return new BigInteger("1");
        else 
            return factorial(n-1).multiply(new BigInteger(n+""));
    }
}