import java.util.Scanner;
public class leapYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE YEAR : ");
        int year = sc.nextInt();
        System.out.println((year % 400 == 0 || year % 4 == 0 && year % 100 != 0) ? "Leap Year" : "Not a Leap Year");
    }

}
