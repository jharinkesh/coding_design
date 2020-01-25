import java.util.Scanner;


public class LCM {

    public static void main(String[] args) {
        //System.out.println(factorial(30));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers");
        String number [];
        number= input.nextLine().split(" ");
        System.out.println(lcm(Integer.parseInt(number[0]),Integer.parseInt(number[1])));
        input.close();
    }

    
    public static int lcm(int a, int b){
        // lcm* hcf = a *b
        int hcf = hcf(a,b);
        int lcm = a*b/hcf ;
        return lcm;
    }

    private static int hcf(int a, int b) {
        int n=1;
        if(a > b){
            while(n!=0){
                n = a % b;
                a=b;
                b=n;
            }
            return a;
        }else{
            while(n!=0){
                n = b % a;
                b=a;
                a=n;
            }
            return b;
        }
    }
}