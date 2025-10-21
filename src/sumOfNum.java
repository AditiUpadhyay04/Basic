import java.util.Scanner;
public class sumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        do{
            sum = i + sum;
            i++;
        } while(i <= num);
        System.out.println( +sum);

    }
}
