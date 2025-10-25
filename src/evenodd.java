import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a :" );
        int a = sc.nextInt();
       // System.out.println( (a % 2 == 0) ? "even number" : "odd number");

        //using if-else statement
        if(a % 2 == 0){
            System.out.println(a + " is even");
        }
        else{
            System.out.println(a + " is odd");
        }
    }
}
