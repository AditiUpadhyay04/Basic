import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 46;
        int num2 = 65;
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println(num1);
        System.out.println(num2);
    }
}
