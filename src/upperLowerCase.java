import java.util.Scanner;
public class upperLowerCase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character : ");
       char ch = sc.nextLine().charAt(0);
      //  System.out.println(( ch >= 65 && ch <= 90) ? "Uppercase" : "Lowercase");
        String result = (ch >= 'A' && ch<= 'Z') ? "Uppercase" : "Lowercase" ;
        System.out.println(result);
    }

}
