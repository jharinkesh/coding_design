package assignmentone;

public class Factorial {
	
	public static void main(String args[]) {
		int i;
		int fact = 1;
		int number = 4;
		fact = factorial(number);
		System.out.println(fact);
	}
	
	static int factorial(int number) {
		if(number==0) {
			return 1;
		}
		else
			return (number*factorial(number-1));
	}

}
