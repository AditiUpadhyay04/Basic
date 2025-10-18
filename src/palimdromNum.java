import java.util.Scanner;
public class palimdromNum
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
        num = num / 10;
        int sum = ones * 100 + tens * 10 + hun ;
        System.out.println((sum == original) ? "Palindrome No. " : " Not a Palindrome No. ");
    }

}
