import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 2; // even
        // int i = 1; odd
        int num = sc.nextInt();
        while(i <= num){
            System.out.println("even num :" + i);
          //  System.out.println("odd num :" +i);
            i = i +2;
        }

    }
}
