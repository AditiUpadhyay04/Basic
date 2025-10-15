import java.util.Scanner;
public class binaryOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double a = 22.0;
        int b = 3;
        System.out.println("divide is : " + a/b); // 7.3 // 7
        System.out.println("divide is : " + b/a); // 0.1 // 0
        System.out.println(a / b);
        System.out.println(a%b); // will give the remainder value
    }
}
