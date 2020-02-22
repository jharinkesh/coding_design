package class1;

public class Lcm {

	public static void main(String[] args) {
		int n1 = 7;
		int n2 = 4;
		int number = lcmOfTwoNumber(n1, n2);
		System.out.println("lcm of two number = " + number);
	}

	private static int lcmOfTwoNumber(int a, int b) {
		int lcm = 0;
		// 0 0
		if (a == 0 || b == 0) {
			lcm = 0;
		} else {
			// part 1 --- 4 4
			if (a == b) {
				lcm = a;
			}
			// part 2 --- 4 5 4 8
			else if (a < b) {
				// 4 8
				if (b % a == 0) {
					lcm = b;
				}
				// 4 5
				else {
					int factor = 2;
					boolean foundLcm = false;
					while (foundLcm == false) {
						int multiple = b * factor;
						if (multiple % a == 0) {
							lcm = multiple;
							foundLcm = true;
						}
						factor++;
					}
				}
			}
			// part 3 --- 5 4 8 4
			else {
				// 8 4
				if (a % b == 0) {
					lcm = a;
				}
				// 5 4
				else {
					int factor = 2;
					boolean foundLcm = false;
					while (foundLcm == false) {
						int multiple = a * factor;
						if (multiple % b == 0) {
							lcm = multiple;
							foundLcm = true;
						}
						factor++;
					}
				}
			}
		}
		return lcm;
	}
}