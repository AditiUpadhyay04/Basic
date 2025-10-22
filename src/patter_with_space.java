import java.util.Scanner;
public class patter_with_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        for (int i = 1; i <= value; i++) {

            // print initial spaces
            for (int j = 1; j<= value - i; j++) {
                System.out.print(" ");
            }

            // print start
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // print remaining spaces
            for (int j = 1; j <= value - i; j++) {
             //   System.out.print();
            }
            System.out.println();

        }

    }
}