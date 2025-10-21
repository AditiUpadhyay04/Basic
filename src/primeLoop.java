import java.util.Scanner;
public class primeLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isTrue = true;
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                isTrue = false;
            }
        }
            System.out.println((isTrue == true) ? "prime" : "not prime");


    }
}
