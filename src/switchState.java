import java.util.Scanner;
public class switchState {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextLine().charAt(0);
        switch(num){
                case 'a':
                    System.out.println("printing 1");
                      break;
                case 2:
                    System.out.println("printing 2");
                      break;


                default:
                System.out.println("nothing");

        }
    }
}
