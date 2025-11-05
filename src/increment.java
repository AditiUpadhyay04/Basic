import java.util.Scanner;
public class increment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 22;
        int b = 22;
        System.out.println(a++ + --b); // 22 a = 23, 21, b = 21        43
        System.out.println(a++ + --a); // a = 24,
        System.out.println(a-- + b++);
        System.out.println(a + --a);
        System.out.println(++a + --b);
        System.out.println(a++ + --a);
    }
}
