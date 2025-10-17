import java.util.Scanner;
public class divisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();

        int value = num % 10;
        System.out.println(( value % 5 == 0) ? "divisible" : "not divisible");
    }
}
// to find the leap year out of any four digit number given by the user