import java.util.Scanner;
public class evenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 2; // for even
        // for odd  int i = 1;
        do{
            System.out.println("odd num: " + i );
           i++ ;
           i++; // i+=2;
            // i = i + 2;
        } while(i <= num);
    }
}
