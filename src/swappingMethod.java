import java.util.Scanner;
public class swappingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // using temporary variable
        int a = 746;
        int b = 98;
        int temp = a; // 746
           a = b; //
           b = temp;
        System.out.println("after swapping a : " + a);
        System.out.println("after swapping b : " + b);

        // without using temporary variable
        int c = 425;
        int d = 753;
        c = c + d;
        d = c - d;
        c = c - d;
        System.out.println("after swapping  c : " + c);
        System.out.println("after swapping  d : " + d);

        // using EX-OR operation
        int e = 9267;
        int f = 524;
        e = e ^ f;
        f = e ^ f;
        e = e ^ f;
        System.out.println("after swapping e : " + e);
        System.out.println("after swapping f : " + f);
    }
}
