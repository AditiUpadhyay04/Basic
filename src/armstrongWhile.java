import java.util.Scanner;
public class armstrongWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        int original = num, num1;
        double total = 0;
        double sum = 0;
        num = original;

        while(num != 0){
            num = num / 10;
            total++;
        }
        while( num != 0){
            double digit = num % 10;
            num = num / 10;
            sum = sum + Math.pow(digit, total);
        }
        System.out.println((sum == original) ? "ARMSTRONG" : "NOT ARMSTRONG");
    }
}
