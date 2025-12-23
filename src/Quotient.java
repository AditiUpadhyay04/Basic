import java.util.Scanner;
public class Quotient {
    public static void main(String[] args) {
        int dividend;
        int divisor;
        System.out.println("enter the dividend:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the divisor:");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("quotient" + quotient);
        System.out.println("remainder" +remainder);
    }
}
