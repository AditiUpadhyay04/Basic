import java.util.Scanner;
public class logicalOperator {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = 16;
        int b = 20;
        int c = 220;
        int d = 440;
        int e = 23;
        int f = 128;
        int g = 72;
        int h = 12;
        int i = 37;
        int j = 42;
        int k = 143;
        int l = 277;
        System.out.println( a & b); //  bitwise AND
        System.out.println( c & d);
        System.out.println( e & f);
        System.out.println( g & h);
        System.out.println( i & j);
        System.out.println( k & l);
        System.out.println( k | l); // bitwise OR
        System.out.println( a ^ b); // bitwise EX-OR

        int v1 = 487;
        int v2 = 65;
        int v3 = 464;
        double v4 = 74.76;
        System.out.println(v1>v2 && v3<v4); // AND
    }
}
