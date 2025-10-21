import java.util.Scanner;
public class sumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while( i <= num){
            System.out.println(+sum);
            sum = i + sum;
            i++;
        }
        System.out.println(+sum);
    }
}
