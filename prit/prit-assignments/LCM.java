package assignmentone;

public class LCM {

	int i=12 , j = 6 ;
	int lcm ;
    lcm = (i>j)?i:j;
	while(true) {
		if(lcm%i ==0 && lcm%j==0) {
			System.out.println(lcm);
			break;
		}
		++lcm;
	}
}
