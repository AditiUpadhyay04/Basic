import java.util.Scanner;
public class fibonacci2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        if(num == 0 || num == 1){
            System.out.println(num);
        }
        for(int i = 2; i < num; i++){
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(b);
    }
}
