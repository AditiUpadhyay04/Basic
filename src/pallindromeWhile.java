import java.util.Scanner;
public class pallindromeWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev = 0;
         int num1 = number,num2;
        while(number != 0){
            num2 = number % 10;
            number = number / 10;
            rev = rev * 10 + num2;
        }
        System.out.println((rev == num1) ? "yes" : "no");
    }
}
