import java.util.Scanner;
public class switchStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String days = sc.nextLine();
        switch (days) {
            case "monday":
                System.out.println("today is monday");
                break;
            case "tuesday":
                System.out.println("today is tuesday");
                break;

                case "wednesday":
                System.out.println("today is wednesday");
                break;
            case "thursday":
                System.out.println("today is thursday");
                break;
            case "friday":
                System.out.println("today is friday");
                break;
            case "saturday":
                System.out.println("today is saturday");
                break;
            case " sunday":
                System.out.println("today is sunday");
                break;
            default:
                System.out.println("not a day");



        }
    }
}
