import java.util.Scanner;
public class patter_0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                start = 1;
            }
            else{
                start = 0;
            }
            for(int j = 0; j < i + 1; j++){
                System.out.print(start);
                if(start == 0){
                    start = 1;
                }
                else{
                    start = 0;
                }
            }
            System.out.println();
        }
    }
}
