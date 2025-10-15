import java.util.Scanner;
public class chopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ones = n % 10;
        n = n / 10;
       int tens = n % 10;
        n = n / 10;
         int hundred = n % 10;
         n = n / 10;
        int thousand = n % 10;
        n = n / 10;
        int tenThousand = n % 10;
        System.out.println(ones + " " + tens +" " + hundred + " " + thousand +" " + tenThousand );
        // reverse of a number
        int number = ones * 1000 + tens * 100 + hundred * 10 + thousand ;
        System.out.println(number);
    }
}
