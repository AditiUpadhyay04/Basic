import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // for smaller values only

        String result = (num == 2 || num == 3 || num == 5 || num == 7) ? "Prime" :
                        (num > 1 && (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0)) ? "Prime" : "Not Prime";

        System.out.println(num + " is " + result);
    }
}


