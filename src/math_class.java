import java.util.Scanner;
public class math_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();

        double power = Math.pow(a,b); // it gives the power
        System.out.println(power);

        System.out.println(Math.max(a,b)); // gives maximun number between the two
        System.out.println(Math.min(a,b)); //gives minimum number between the two
        System.out.println(Math.abs(a)); // ignores the sign
        System.out.println(Math.abs(a-b));
    }
}
