import java.util.Scanner;
public class amrstrongNo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        int original = num;
        int ones = num % 10;
        num = num / 10;
        int tens = num % 10;
        num = num / 10;
        int hun = num % 10;
        int total = (ones * ones * ones + tens * tens * tens + hun * hun * hun);
        System.out.println((total == original) ? "true" : "false");
    }

}

