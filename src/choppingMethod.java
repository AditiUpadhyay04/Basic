import java.util.Scanner;
public class choppingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* double a = 45.76;
        double b = 634.876;
        System.out.println(a%b);  // 45.76
        System.out.println(a/b);  // 0.072
        */
        int num = sc.nextInt();
        int ones = num % 10;
        num = num / 10;
        int tens = num % 10;
        num = num / 10;
        int hun = num  % 10;
        num = num  / 10;
        int thousand = num % 10;;
        num = num / 10;
        int tenThousand = num % 10;
        System.out.println(ones + "" + tens +"" + hun + "" + thousand +"" + tenThousand);

        int number = ones * 10000 + tens * 1000 + hun * 100 + thousand * 10 + tenThousand ;
        System.out.println(number);
    }
}
