import java.util.Scanner;
public class positiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number :");
        int num = sc.nextInt();
        System.out.println(( num>0) ? "positive" : "negative");

    }
}
