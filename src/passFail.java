import java.util.Scanner;
public class passFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int number = sc.nextInt();
        System.out.println(( number >= 33 ) ? "pass" : "fail" );

        for(int i = 0; i <20; i++){
            System.out.println("hello");
        }
    }
}
