import java.util.Scanner;
public class numberReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0, num1;
        while(num != 0){
            num1 = num % 10;
            num = num / 10;
            reverse = reverse * 10 + num1;
        }
        System.out.println(+reverse);
    }
}
