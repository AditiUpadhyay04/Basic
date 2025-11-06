import java.util.Scanner;
public class shiftOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // left shift = a * 2^b
        // right shift = a/2^b


        double a = 2645, b = 3;
        double ans =  a * Math.pow( 2 ,b); // left shift by formula
        System.out.println(ans);

        double ans1 = a / Math.pow(2,b); // right shift by formula
        System.out.println(ans1);
      /*  int a = 846;
        int b = 5;
        int result = a >> b; // right shift
        int result1 = a << b; // left shift

        System.out.println(result);
        System.out.println(result1);

       */
    }
}
