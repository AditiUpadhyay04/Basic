import java.util.Scanner;
public class indexing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
       char target = name.charAt(4);
      // char target = sc.nextLine().charAt(7);

        System.out.println(target);
        System.out.println(sc.nextLine().charAt(5));
    }
}
