import java.util.Scanner;
public class indexingstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
       /* char n1 = name.charAt(0);
        char n2 = name.charAt(6);
        System.out.print("first name:" + n1 + " " + "last name: " + n2);*/

        System.out.println(name.charAt(0) + " " + name.charAt(6));
    }
}
