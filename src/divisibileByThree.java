import java.util.Scanner;
public class divisibileByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num : ");
        int num = sc.nextInt();/*
        int ones = num % 10;
        num = num / 10;
        int tens = num % 10;
        num = num / 10;
        int hun = num % 10;
        num = num / 10;
        System.out.println((( ones + tens + hun ) % 3 == 0 ) ? "divisible" : "not divisible");*/
        long sum =0;
        while(num!=0)
        {
            long lastdigit = num%10;
            num = num/10;
            sum =sum+lastdigit;

        }

        System.out.println((sum%3==0)?"divisible by 3":"not");


    }
}
