import java.util.Scanner;
public class divisibleByFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
       // int value = num % 100;
        //System.out.println(( value % 4 == 0) ? "divisible" : "not divisible");

        // divisible by 8
        int value1 = num % 1000;
        System.out.println((value1 % 8 == 0) ? "divisible" : "not divisible");

    }
}
