package FirstAssignment;

class Test 
{ 
	static int lcm(int a, int b) {
		if (a == 0) 
			return b;  
		return lcm(b % a, a);  
	} 
	static int findLcmOfTwoNumbers(int x, int y) {
		return (x*y)/lcm(x, y); 
	} 
	public static void main(String[] args)  
	{ 
		System.out.println(findLcmOfTwoNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]))); 
	} 
} 